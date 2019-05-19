package com.dvc.mybilibili.mvp.model.api;

import android.content.Context;
import android.util.DisplayMetrics;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.api.cache.CacheProviders;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.splash.BiliSplashApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.rx_cache2.EvictProvider;

public class AppApiHelper implements ApiHelper {

    private final Context context;
    private final BiliSplashApiV2Service biliSplashApiV2Service;
    private final CacheProviders cacheProviders;

    @Inject
    public AppApiHelper(@ApplicationContext Context context, CacheProviders cacheProviders, BiliSplashApiV2Service biliSplashApiV2Service) {
        this.context = context;
        this.cacheProviders = cacheProviders;
        this.biliSplashApiV2Service = biliSplashApiV2Service;
    }

    @Override
    @Deprecated
    public Observable<SampleSplash> getSplashV2() {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return this.biliSplashApiV2Service.getSplash(
                Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels),
                Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels))
                .map(s->{
                    if(!s.isSuccess())
                        throw new BiliApiException(s.getCode());
                    return s.getData().get(0);
                });
    }

    @Override
    public Observable<SplashData> getSplashListV2(boolean cleanCache) {
        String access_key = "";
        String birth = "";
        String ad_extra = "";
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Observable<SplashData> getSplashListV2 = this.biliSplashApiV2Service.getSplashList(access_key,
                Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels),
                Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels),
                birth, ad_extra)
                .map(s->{
                    if(!s.isSuccess())
                        throw new BiliApiException(s.code);
                    return s.data;
                });
        return cacheProviders.getSplashList(getSplashListV2, new EvictProvider(cleanCache))
                .map(splashDataReply -> splashDataReply.getData());
    }
}
