package com.dvc.mybilibili.mvp.ui.fragment.web;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.presenter.fragment.GuideFragPresenter;
import com.dvc.mybilibili.R;
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
        agentWeb = AgentWeb.with(this)
                .setAgentWebParent(web_contentview, new FrameLayout.LayoutParams(-1,-1))
                .useDefaultIndicator()
//                .setWebChromeClient(new WebChromeClient() {
//                    @Override
//                    public void onProgressChanged(WebView view, int newProgress) {
//                        if (progressBar_load != null) {
//                            progressBar_load.setProgress(newProgress);
//                        }
//                        super.onProgressChanged(view, newProgress);
//                    }
//                })
                .setWebViewClient(new WebViewClient() {
                    @Override
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                        if (progressBar_load != null) {
//                            progressBar_load.setVisibility(View.VISIBLE);
//                        }
                        super.onPageStarted(view, url, favicon);
                    }

                    @Override
                    public void onPageFinished(WebView view, String url) {
//                        if (progressBar_load != null) {
//                            progressBar_load.setVisibility(View.GONE);
//                        }
                        super.onPageFinished(view, url);
                    }

//                    @Override
//                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                        if (url!=null){
//                            ActionUtils.toWeb(getContext(), "", url);
//                            return true;
//                        }
//                        return super.shouldOverrideUrlLoading(view, url);
//                    }
                })
                .createAgentWeb().ready().go(url);
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

    public AgentWeb getWebView() {
        return this.agentWeb;
    }
}
