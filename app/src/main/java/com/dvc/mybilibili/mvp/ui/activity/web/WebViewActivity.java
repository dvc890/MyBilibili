package com.dvc.mybilibili.mvp.ui.activity.web;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.WebViewClient;

public class WebViewActivity extends BaseWebViewActivity {
    @Override
    public void AddJsInterface(AgentWeb webView) {

    }

    @Override
    protected WebViewClient getWebViewClient() {
        return new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                if (CommandActionUtils.isSupportActionUrl(url)){
                    CommandActionUtils.toWeb(getBaseContext(), "", url);
                    getWebView().getUrlLoader().stopLoading();
                }
                else
                    super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (CommandActionUtils.isSupportActionUrl(url)){
                    CommandActionUtils.toWeb(getBaseContext(), "", url);
                    return true;
                }
                return super.shouldOverrideUrlLoading(view, url);
            }

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (CommandActionUtils.isSupportActionUrl(request.getUrl().toString())){
                    CommandActionUtils.toWeb(getBaseContext(), "", request.getUrl().toString());
                    return true;
                }
                return super.shouldOverrideUrlLoading(view, request);
            }
        };
    }
}
