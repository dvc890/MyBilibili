package com.dvc.mybilibili.mvp.model.api.service.column;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.*;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
public interface ColumnApiService {
    @FormUrlEncoded
    @POST("/x/article/favorites/add")
    Observable<GeneralResponse<Void>> add(@Field("access_key") String str, @Field("id") long j);

    @FormUrlEncoded
    @POST("/x/article/addshare")
    Observable<GeneralResponse<Void>> addShare(@Field("access_key") String str, @Field("id") long j);

    @FormUrlEncoded
    @POST("/x/article/complaints")
    Observable<GeneralResponse<Void>> doReport(@Query("access_key") String str, @Field("aid") int i, @Field("cid") int i2, @Field("images") String str2, @Field("reason") String str3);

//    @CacheControl(3600000)
    @GET("/x/article/categories")
    Observable<GeneralResponse<List<Column.Category>>> getArticleCategories();

    @GET("x/article/list/articles")
    Observable<GeneralResponse<ColumnArticleList>> getArticleCollection(@Query("access_key") String str, @Query("id") String str2);

    @Deprecated
    @GET("/x/article/view")
    Observable<ColumnDetailData> getArticleDetail(@Query("access_key") String str, @Query("id") long j);

    @GET("/x/article/viewinfo")
//    @RequestInterceptor(doh.class)
    Observable<ColumnDetailUserInfo> getArticleDetailUserInfo(@Query("access_key") String str, @Query("id") long j, @Query("from") String str2);

    @GET("x/article/listinfo")
    Observable<GeneralResponse<ColumnArticleList>> getArticleInfo(@Query("id") String str);

    @Deprecated
    @GET("/x/article/favorites/list")
    Observable<GeneralResponse<ColumnFavoriteData>> getArticleList(@Query("access_key") String str, @Query("pn") int i, @Query("ps") int i2);

    @Deprecated
    @GET("http://app.bilibili.com/x/v2/space/article")
    Observable<GeneralResponse<ColumnAuthorList>> getArticleList(@Query("access_key") String str, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    @GET("/x/article/recommends")
    Observable<ColumnRecommendData> getArticleRecommends(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2, @Query("sort") int i4, @Query("from") int i5);

    @GET("/x/article/recommends/plus")
    Observable<ColumnHomeTabData> getArticleRecommendsPlus(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2, @Query("sort") int i4, @Query("from") int i5);

    @GET("/x/article/home")
    Observable<ColumnHomeTabData> getHomeTab(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2);

    @GET("x/article/hotspots")
    Observable<ColumnHotSpotsData> getHotSpots(@Query("id") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str, @Query("sort") int i4);

    @GET("/x/article/rank/categories")
    Observable<GeneralResponse<List<ColumnRankCategory>>> getRankCategories();

    @GET("/x/article/rank/list")
    Observable<GeneralResponse<List<ColumnRank>>> getRankList(@Query("access_key") String str, @Query("cid") String str2);

    @FormUrlEncoded
    @POST("/x/article/like")
    Observable<GeneralResponse<Void>> like(@Query("access_key") String str, @Field("id") long j, @Field("type") int i);

//    @Timeout(conn = 20000, read = 20000, write = 20000)
    @GET("/x/article/sentinel/config")
    Observable<GeneralResponse<JSONObject>> loadSentinelConfig();

    @FormUrlEncoded
    @POST("/x/relation/modify")
    Observable<GeneralResponse<Void>> modify(@Query("access_key") String str, @Field("fid") long j, @Field("act") int i, @Field("re_src") int i2);

    @FormUrlEncoded
    @POST("/x/article/favorites/del")
    Observable<GeneralResponse<Void>> remove(@Field("access_key") String str, @Field("id") long j);

    @GET("/x/article/addview")
    Observable<GeneralResponse<Void>> reportArticleDetail(@Query("access_key") String str, @Query("page") String str2, @Query("from") String str3);

    @POST("/x/article/creative/upload/image")
    @Multipart
    Observable<GeneralResponse<ColumnUploadImage>> uploadImage(@Query("access_key") String str, @Part RequestBody c23720b);
}
