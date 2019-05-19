package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.Splash;
import com.dvc.mybilibili.mvp.presenter.SplashPresenter;
import com.vondear.rxtool.RxLogTool;

import java.util.List;

import javax.inject.Inject;

public class SplashActivity extends MvpBaseActivity<SplashView, SplashPresenter> implements SplashView{

    private static final String TAG = SplashActivity.class.getSimpleName();

    @Inject
    SplashPresenter splashPresenter;

    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    @NonNull
    @Override
    public SplashPresenter createPresenter() {
        return splashPresenter;
    }

    @Override
    public int getContentViewResID() {
        findViewById(android.R.id.content).setPadding(0, 0, 0, 0);
        return 0;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {
        presenter.loadSplash();
    }

    @Override
    public void updateProgress(Integer integer) {

    }

    @Override
    public void onSplashData(List<Splash> splashList) {
        RxLogTool.d(TAG, splashList.toString());
    }

    @Override
    public void onSampleSplash(SampleSplash splashData) {

    }
}
