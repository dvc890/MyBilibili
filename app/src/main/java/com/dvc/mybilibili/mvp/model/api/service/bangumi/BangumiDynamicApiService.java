package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiUgcVideo;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance.BangumiUgcVideoV2;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("http://app.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.api.c */
public interface BangumiDynamicApiService {
    //@CacheControl(10000)
    @GET("/x/v2/region/dynamic/list")
    Observable<GeneralResponse<BangumiUgcVideoV2>> getDynamicList(@Query("access_key") String access_key, @Query("rid") int i, @Query("channel") String str2, @Query("pull") boolean z, @Query("ctime") long j);

    //@CacheControl(10000)
    @GET("/x/v2/region/show/dynamic")
    Observable<GeneralResponse<List<BangumiUgcVideo>>> getDynamicVideo(@Query("rid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("channel") String str);
}
