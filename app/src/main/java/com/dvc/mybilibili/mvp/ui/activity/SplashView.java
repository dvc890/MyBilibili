package com.dvc.mybilibili.mvp.ui.activity;

import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.Splash;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import java.util.List;

public interface SplashView extends MvpView {
    void updateProgress(Integer integer);

    void onSplashData(List<Splash> splashList);

    void onSampleSplash(SampleSplash splashData);
}
