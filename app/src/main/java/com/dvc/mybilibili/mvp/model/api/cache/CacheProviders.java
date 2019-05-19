package com.dvc.mybilibili.mvp.model.api.cache;

import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.ProviderKey;
import io.rx_cache2.Reply;

public interface CacheProviders {

    @ProviderKey("HomePage")
    @LifeCache(duration = 1, timeUnit = TimeUnit.DAYS)
    Observable<Reply<SplashData>> getSplashList(Observable<SplashData> observable, EvictProvider evictProvider);
}
