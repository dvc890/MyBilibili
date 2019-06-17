package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseActivity;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;


public class CameraStreamingActivity extends MvpBaseActivity {
    @NonNull
    @Override
    public MvpPresenter createPresenter() {
        return new MvpBasePresenter();
    }

    @Override
    public int getContentViewResID() {
        return 0;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {

    }
}
