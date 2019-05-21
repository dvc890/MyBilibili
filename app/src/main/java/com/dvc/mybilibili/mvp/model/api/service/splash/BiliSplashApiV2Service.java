package com.dvc.mybilibili.mvp.model.api.service.splash;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.DataListResponse;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("http://app.bilibili.com")
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.splash.r */
public interface BiliSplashApiV2Service {
    @GET("/x/v2/splash")
    @Deprecated
    Observable<DataListResponse<SampleSplash>> getSplash(@Query("width") int width, @Query("height") int height);

    @GET("/x/v2/splash/list")
    //birth:MMDD ad_extra:
    Observable<GeneralResponse<SplashData>> getSplashList(@Query("access_key") String access_key, @Query("width") int width, @Query("height") int height, @Query("birth") String birth, @Query("ad_extra") String ad_extra);
}
