package com.dvc.mybilibili.mvp.model.api.service.space;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.space.entity.*;
import com.dvc.mybilibili.mvp.model.api.service.space.interceptor.ewj;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("http://app.bilibili.com")
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceApiService */
public interface BiliSpaceApiService {

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceApiService$SettingParams */
    public static class SettingParams extends ParamsMap {
        public SettingParams(boolean Isfav_video, boolean Isbangumi, boolean Isgroups, boolean Iscoins_video, boolean Isplayed_game, boolean Islikes_video) {
            super(5);
            String[] strArr = new String[12];
            strArr[0] = "fav_video";
            strArr[1] = Isfav_video ? "1" : "0";
            strArr[2] = "bangumi";
            strArr[3] = Isbangumi ? "1" : "0";
            strArr[4] = "groups";
            strArr[5] = Isgroups ? "1" : "0";
            strArr[6] = "coins_video";
            strArr[7] = Iscoins_video ? "1" : "0";
            strArr[8] = "played_game";
            strArr[9] = Isplayed_game ? "1" : "0";
            strArr[10] = "likes_video";
            strArr[11] = Islikes_video ? "1" : "0";
            putParams(strArr);
        }
    }

//    @Timeout(conn = 1000)
    @GET("/x/v2/space/upper/recmd?device=android")
    Observable<GeneralResponse<BiliSpaceRecommendUpperInfo>> getSpaceRecommendUppers(@Query("access_key") String access_key, @Query("vmid") long j);

    @GET("http://space.bilibili.com/api/member/getSettings")
    Observable<BiliUserSpaceSetting> getUserSpaceSetting(@Query("access_key") String access_key, @Query("mid") long j);

//    //@CacheControl(3000)
    @GET("/x/v2/space/archive")
    Observable<GeneralResponse<BiliSpaceVideoList>> loadArchiveVideos(@Query("access_key") String access_key, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    //@CacheControl(3000)
    @GET("/x/v2/space/bangumi")
    Observable<GeneralResponse<BiliSpaceSeason>> loadBangumi(@Query("access_key") String access_key, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    //@CacheControl(3000)
    @GET("/x/v2/space/contribute")
    Observable<GeneralResponse<BiliSpaceContributeList>> loadContribute(@Query("access_key") String access_key, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    //@CacheControl(3000)
    @GET("/x/v2/space/coinarc")
    Observable<GeneralResponse<BiliSpaceVideoList>> loadPayCoinsVideos(@Query("access_key") String access_key, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    //@CacheControl(3000)
    @GET("/x/v2/space/likearc")
    Observable<GeneralResponse<BiliSpaceVideoList>> loadRecommendVideos(@Query("access_key") String access_key, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    @GET("/x/v2/space")
    Observable<GeneralResponse<BiliSpace>> loadSpaceData(@Query("access_key") String access_key, @Query("vmid") String str2, @Query("name") String str3, @Query("from") String str4, @Query("ps") int i);

    @POST("/x/v2/space/report")
    Observable<GeneralResponse<Void>> report(@Query("access_key") String access_key, @Query("mid") long j, @Query("reason") String str2);

    @GET("http://space.bilibili.com/api/member/setSettings")
    Observable<GeneralResponse<Void>> setUserSetting(@Query("access_key") String access_key, @QueryMap SettingParams settingParams);

    @Multipart
    @Headers("Interceptor:"+ ewj.CLASSNAME)
//    @RequestInterceptor(ewj.class)
    @POST("http://space.bilibili.com/api/member/uploadTopPhoto")
    Observable<JSONObject> uploadVipTopPicture(@Query("access_key") String access_key, @Part("img_file") RequestBody c23724z);
}
