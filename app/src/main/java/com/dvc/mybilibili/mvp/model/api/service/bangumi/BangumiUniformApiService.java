package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.constants.WBPageConstants;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.*;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiUniformRecommend;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiUniformSimpleSeason;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("https://bangumi.bilibili.com")
/* compiled from: BL */
public interface BangumiUniformApiService {

    /* compiled from: BL */
    public static class CinemaIndexParamsMap extends ParamsMap {
        public CinemaIndexParamsMap(int i, String str, String str2, String str3, String str4, String str5) {
            putParams(WBPageConstants.ParamKey.PAGE, String.valueOf(i));
            putParams("pagesize", String.valueOf(21));
            putParams("style_id", str);
            putParams("producer_id", str2);
            putParams("year", str3);
            putParams("order", str4);
            putParams("season_type", str5);
        }
    }

    /* compiled from: BL */
    public static class SponsorRankParamsMap extends ParamsMap {
        public SponsorRankParamsMap(String str, int i, int i2) {
            super(5);
            putParams("access_key", str);
            putParams("aid", String.valueOf(i));
            putParams(WBPageConstants.ParamKey.PAGE, String.valueOf(i2));
            putParams("pagesize", String.valueOf(25));
        }

        public SponsorRankParamsMap(String str, String str2, int i, int i2) {
            super(5);
            putParams("access_key", str);
            putParams("season_id", str2);
            putParams("season_type", String.valueOf(i));
            putParams(WBPageConstants.ParamKey.PAGE, String.valueOf(i2));
            putParams("pagesize", String.valueOf(25));
        }
    }

    @GET("/follow/api/season/follow")
    Observable<BangumiApiResponse<JSONObject>> favorite(@Query("access_key") String access_key, @Query("season_id") String str2, @Query("season_type") Integer num);

//    @CacheControl(120000)
    @GET("/media/api/search/result")
    Observable<BangumiApiResponse<BangumiCinemaIndex>> getCinemaIndex(@QueryMap CinemaIndexParamsMap cinemaIndexParamsMap);

//    @CacheControl(3600000)
    @GET("/media/api/search/condition")
    Observable<BangumiApiResponse<BangumiCinemaIndexFilter>> getCinemaIndexFilter(@Query("season_type") String str);

    @GET("/follow/api/list/mine")
    Observable<BangumiApiPageResponse<List<BangumiUniformSimpleSeason>>> getFollowList(@Query("access_key") String access_key, @Query("page") int i, @Query("pagesize") int i2);

    @Deprecated
    @GET("/player/api/v2/recommend")
    Observable<BangumiApiResponse<BangumiUniformRecommend>> getPlayerRecommend(@Query("season_id") String str, @Query("season_type") int i);

    @Deprecated
    @GET("/api/season/v2/recommend")
    Observable<BangumiApiResponse<BangumiUniformRecommend>> getSeasonRecommend(@Query("season_id") String str, @Query("season_type") int i);

    @GET("/sponsor/api/point")
    Observable<BangumiApiResponse<JSONObject>> getSponsorPoint(@Query("access_key") String access_key, @Query("amount") int i);

    @GET("/sponsor/api/v2/rank/total")
    Observable<BangumiApiResponse<BangumiSponsorRank>> getSponsorRankTotal(@QueryMap SponsorRankParamsMap sponsorRankParamsMap);

    @GET("/sponsor/api/v2/rank/week")
    Observable<BangumiApiResponse<BangumiSponsorRank>> getSponsorRankWeek(@QueryMap SponsorRankParamsMap sponsorRankParamsMap);

    @GET("/follow/api/season/unfollow")
    Observable<BangumiApiResponse<JSONObject>> unfavorite(@Query("access_key") String access_key, @Query("season_id") String str2, @Query("season_type") Integer num);
}
