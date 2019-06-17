package com.dvc.mybilibili.mvp.ui.activity.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;

import com.dvc.base.MvpBaseActivity;
import com.dvc.base.utils.FragmentUtils;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.ui.fragment.web.GuideFragment;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.WebViewClient;

import butterknife.BindView;

public abstract class BaseWebViewActivity extends MvpBaseActivity {

    @BindView(R.id.content)
    FrameLayout contentFrameLayout;

    GuideFragment fragment = new GuideFragment();

    @NonNull
    @Override
    public MvpPresenter createPresenter() {
        return new MvpBasePresenter();
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_activity_base;
    }

    @Override
    protected void initViews() {
        if(TextUtils.isEmpty(getIntent().getStringExtra(Keys.KEY_WEB_URL))) {
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Keys.KEY_WEB_TITLE, getIntent().getStringExtra(Keys.KEY_WEB_TITLE));
        bundle.putString(Keys.KEY_WEB_URL, getIntent().getStringExtra(Keys.KEY_WEB_URL));
        fragment.setWebViewClient(getWebViewClient());
        fragment.setArguments(bundle);
        FragmentUtils.switchContent(getSupportFragmentManager(), null, fragment, contentFrameLayout.getId(), 0, false);

    }

    @Override
    protected void loadDatas() {
        AddJsInterface(getWebView());
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (getWebView().handleKeyEvent(event.getKeyCode(), event)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public AgentWeb getWebView() {
        return this.fragment.getWebView();
    }

    protected WebViewClient getWebViewClient() {
        return null;
    }

    public static void start(Context context, String title, String url) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra(Keys.KEY_WEB_TITLE, title);
        intent.putExtra(Keys.KEY_WEB_URL, url);
        context.startActivity(intent);
    }

    public abstract void AddJsInterface(AgentWeb webView);
}
