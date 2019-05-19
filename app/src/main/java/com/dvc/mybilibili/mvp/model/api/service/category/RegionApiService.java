package com.dvc.mybilibili.mvp.model.api.service.category;

import android.support.annotation.Nullable;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.BiliVideoV2;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryIndex;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryMeta;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.RegionRecommendVideo;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.RegionTagVideo;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.Tag;
import com.dvc.mybilibili.mvp.model.api.service.category.interceptor.C21989o;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@BaseUrl("http://app.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.category.api.a */
public interface RegionApiService {

    @GET("/x/v2/region/index")
    Observable<CategoryMeta> getRegionV2List(@Nullable @Query("ver") String str);

    //@CacheControl
    @GET("http://api.bilibili.com/x/tag/hots")
    Observable<GeneralResponse<List<Tag.TagMeta>>> getHotTags(@Query("rid") int i, @Query("type") int i2);

    //@CacheControl
    @GET("/x/v2/show/index")
    Observable<GeneralResponse<List<CategoryIndex>>> getIndex(@Query("access_key") String str);

    @GET("/x/v2/region/dynamic/list")
    @Headers("Interceptor:"+C21989o.CLASSNAME)
//    @RequestInterceptor(C21989o.class)
    Observable<GeneralResponse<RegionRecommendVideo>> getNextRegionRecommendDynamic(@Query("access_key") String str, @Query("rid") int i, @Query("pull") boolean z, @Query("ctime") long j, @Query("channel") String str2);

    @GET("/x/v2/region/dynamic/child/list")
    Observable<GeneralResponse<RegionTagVideo>> getNextRegionTagDynamic(@Query("access_key") String str, @Query("rid") int i, @Query("tag_id") int i2, @Query("pull") boolean z, @Query("ctime") long j);

    @Headers("Interceptor:"+ C21989o.CLASSNAME)
//    @RequestInterceptor(C21989o.class)
    //@CacheControl(120000)
    @GET("/x/v2/region/dynamic")
    Observable<GeneralResponse<RegionRecommendVideo>> getRegionRecommendDynamic(@Query("access_key") String str, @Query("rid") int i, @Query("channel") String str2, @Query("ad_extra") String str3);

    //@CacheControl(120000)
    @GET("/x/v2/region/dynamic/child")
    Observable<GeneralResponse<RegionTagVideo>> getRegionTagDynamic(@Query("access_key") String str, @Query("rid") int i, @Query("tag_id") int i2, @Query("channel") String str2);

    //@CacheControl
    @GET("/x/v2/region/show/child/list")
    Observable<GeneralResponse<List<BiliVideoV2>>> getVideoList(@Query("rid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("order") String str, @Query("tag_id") Integer num, @Query("channel") String str2);

    @GET("/x/v2/show/change/region")
    Observable<GeneralResponse<List<CategoryIndex.Content>>> refreshRegionAV(@Query("access_key") String str, @Query("rand") int i, @Query("rid") int i2);

    @GET("/x/v2/show/change/bangumi")
    Observable<GeneralResponse<List<CategoryIndex.Content>>> refreshRegionBangumi(@Query("access_key") String str, @Query("rand") int i);
}
