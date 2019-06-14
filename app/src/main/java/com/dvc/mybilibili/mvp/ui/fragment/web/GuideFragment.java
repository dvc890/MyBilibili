package com.dvc.mybilibili.mvp.ui.fragment.web;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.presenter.fragment.GuideFragPresenter;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.WebViewClient;

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
        agentWeb = builder.createAgentWeb().ready().go(url);
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
}
