package com.dvc.mybilibili.mvp.model.api;

import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;

import io.reactivex.Observable;

public interface ApiHelper {
    Observable<SampleSplash> getSplashV2();

    Observable<SplashData> getSplashListV2(boolean cleanCache);
}
