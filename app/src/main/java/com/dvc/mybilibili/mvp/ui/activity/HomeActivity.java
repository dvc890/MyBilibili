package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.activity.HomePresenter;

import javax.inject.Inject;

public class HomeActivity extends MvpBaseActivity<HomeView, HomePresenter> implements HomeView{

    @Inject
    HomePresenter homePresenter;

    @NonNull
    @Override
    public HomePresenter createPresenter() {
        return homePresenter;
    }

    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_activity_main_v2;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {
        presenter.test();
    }
}
