package com.dvc.mybilibili.mvp.ui.fragment.web;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.bilibili.commons.time.FastDateFormat;
import com.bilibili.nativelibrary.SignedQuery;
import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.CookieInfo;
import com.dvc.mybilibili.mvp.presenter.fragment.GuideFragPresenter;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.AgentWebConfig;
import com.just.agentweb.WebViewClient;

import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class GuideFragment extends MvpBaseFragment<GuideFragView, GuideFragPresenter> implements GuideFragView {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title)
    TextView title_tv;
    @BindView(R.id.web_contentview)
    FrameLayout web_contentview;

    AgentWeb agentWeb;

    @Inject
    GuideFragPresenter guideFragPresenter;
    private String title = null;
    private String url = null;
    private WebViewClient webViewClient;

    @NonNull
    @Override
    public GuideFragPresenter createPresenter() {
        return guideFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_guide;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {
        if(url == null)
            getActivity().finish();
        else {
            setToolbar(true);
            OnLoadUrl(url);
        }
    }

    @Override
    public void setArguments(Bundle args) {
        title = args.getString(Keys.KEY_WEB_TITLE);
        url = args.getString(Keys.KEY_WEB_URL);
        super.setArguments(args);
    }

    @Override
    public void OnLoadUrl(String url) {
        AgentWeb.CommonBuilder builder = AgentWeb.with(this)
                .setAgentWebParent(web_contentview, new FrameLayout.LayoutParams(-1,-1))
                .useDefaultIndicator();
//              builder.setWebChromeClient(new WebChromeClient() {
//                    @Override
//                    public void onProgressChanged(WebView view, int newProgress) {
//                        if (progressBar_load != null) {
//                            progressBar_load.setProgress(newProgress);
//                        }
//                        super.onProgressChanged(view, newProgress);
//                    }
//                });
        if(webViewClient != null) builder.setWebViewClient(webViewClient);
        if(presenter.getCookieInfo() != null) {
            setAccountCookie();
        }
        agentWeb = builder.createAgentWeb().ready().go(url);
    }

    @Override
    public void onPause() {
        if (agentWeb!= null) {
            agentWeb.getWebLifeCycle().onPause();
        }
        super.onPause();
    }
    @Override
    public void onResume() {
        if (agentWeb!= null) {
            agentWeb.getWebLifeCycle().onResume();
        }
        super.onResume();
    }

    @Override
    public void onDestroy() {
        if (agentWeb!= null) {
            agentWeb.clearWebCache();
            agentWeb.getWebLifeCycle().onDestroy();
            agentWeb= null;
        }
        super.onDestroy();
    }

    @OnClick(R.id.btn_back)
    public void OnBackBtn(){
        if (!agentWeb.back()){
            getActivity().finish();
        }
    }

    public void setToolbar(boolean isVisible) {
        toolbar.setVisibility(isVisible?View.VISIBLE:View.GONE);
        if(!TextUtils.isEmpty(title))
            title_tv.setText(title);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    public AgentWeb getWebView() {
        return this.agentWeb;
    }

    private void setAccountCookie() {
        CookieInfo cookieInfo = presenter.getCookieInfo();
        if (!(cookieInfo == null || cookieInfo.cookies.size() <= 0 || cookieInfo.domains == null || cookieInfo.domains.length == 0)) {
            for (CookieInfo.Cookie cookie : cookieInfo.cookies) {
                for (String str : cookieInfo.domains) {
                    AgentWebConfig.syncCookie(str, formatCookieValue(cookie, str));
                }
            }
        }
    }

    private String formatCookieValue(CookieInfo.Cookie cookie, String domain) {
        StringBuilder stringBuilder = new StringBuilder();
        long j = cookie.expires * 1000;
        double ceil = Math.ceil(((double) (j - System.currentTimeMillis())) / 1000.0d);
        stringBuilder.append(cookie.name);
        stringBuilder.append(SignedQuery.HttpUtils.EQUAL_SIGN);
        stringBuilder.append(cookie.value);
        stringBuilder.append("; Domain=");
        stringBuilder.append(domain);
        stringBuilder.append("; Max-Age=");
        stringBuilder.append(ceil);
        Date date = new Date();
        date.setTime(j);
        try {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Expires=");
            stringBuilder2.append(FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH).format(date));
            domain = stringBuilder2.toString();
        } catch (Exception e) {
//            dts.m121335a(e);
            domain = null;
        }
        if (domain != null) {
            stringBuilder.append("; Expires=");
            stringBuilder.append(domain);
        }
        if (cookie.http_only == 1) {
            stringBuilder.append("; HttpOnly");
        }
        return stringBuilder.toString();
    }
}
