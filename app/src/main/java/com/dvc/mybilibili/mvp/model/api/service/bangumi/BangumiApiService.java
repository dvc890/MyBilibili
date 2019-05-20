package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.constants.UpdateKey;
import com.dvc.mybilibili.app.constants.WBPageConstants;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.*;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.index.*;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review.*;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("https://bangumi.bilibili.com")
/* compiled from: BL */
public interface BangumiApiService {

    /* compiled from: BL */
    public static class CategoryIndexParamsMap extends ParamsMap {
        public CategoryIndexParamsMap(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
            super(15);
            putParams("tag_id", str2, "is_finish", str3, /*Message.PAGE_AREA_ACTIVITY_CARD_TAG*/"area", str4, "start_year", str5, "index_type", String.valueOf(i2), "index_sort", String.valueOf(i3), WBPageConstants.ParamKey.PAGE, String.valueOf(i), "page_size", "30", "quarter", str6, "version", str);
        }
    }

    /* compiled from: BL */
    public static class MovieIndexParamsMap extends ParamsMap {
        public MovieIndexParamsMap(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            putParams(WBPageConstants.ParamKey.PAGE, String.valueOf(i));
            putParams("pagesize", String.valueOf(30));
            putParams("index_type", String.valueOf(i2));
            putParams("area", String.valueOf(i3));
            putParams("category", String.valueOf(i4));
            putParams("year", String.valueOf(i5));
            putParams(UpdateKey.STATUS, String.valueOf(i6));
            putParams("special", String.valueOf(i7));
        }
    }

    /* compiled from: BL */
    public static class ProducerListParamsMap extends ParamsMap {
        public ProducerListParamsMap(String str, String str2) {
            super(5);
            putParams("media_type", str);
            if (!TextUtils.isEmpty(str2)) {
                putParams("producer_id", str2);
            }
        }

        public ProducerListParamsMap(String str) {
            this(str, "");
        }
    }

    @FormUrlEncoded
    @POST("/review/api/long/del")
    Observable<JSONObject> deleteLong(@Field("access_key") String str, @Field("media_id") int i, @Field("review_id") int i2);

    @FormUrlEncoded
    @POST("/review/api/short/del")
    Observable<JSONObject> deleteShort(@Field("access_key") String str, @Field("media_id") int i, @Field("review_id") int i2);

    @FormUrlEncoded
    @POST("/review/api/dislike")
    Observable<JSONObject> dislikeReview(@Field("media_id") long j, @Field("review_id") long j2, @Field("review_type") int i, @Field("access_key") String str);

    @FormUrlEncoded
    @POST("/review/api/long/modify")
    Observable<JSONObject> editLong(@Field("access_key") String str, @Field("media_id") int i, @Field("review_id") int i2, @Field("score") int i3, @Field("title") String str2, @Field("content") String str3, @Field("origin") int i4, @Field("spoiler") int i5);

    @FormUrlEncoded
    @POST("/review/api/short/modify")
    Observable<JSONObject> editShort(@Field("access_key") String str, @Field("media_id") int i, @Field("review_id") int i2, @Field("score") int i3, @Field("content") String str2);

    @GET("/api/concern_season")
    Observable<BangumiApiResponse<JSONObject>> follow(@Query("access_key") String access_key, @Query("season_id") String str2);

    //@CacheControl(120000)
    @GET("/appindex/followcn_index_page")
    Observable<BangumiApiResponse<BangumiHome>> getBangumiDomestic();

    //@CacheControl(120000)
    @GET("/appindex/followjp_index_page")
    Observable<BangumiApiResponse<BangumiHome>> getBangumiHome();

    @GET("/api/bangumi_index_v2")
    Observable<BangumiApiResponse<BangumiCategoryIndex>> getCategoryIndex(@QueryMap CategoryIndexParamsMap categoryIndexParamsMap);

    //@CacheControl(120000)
    @GET("/api/tags?type=0")
    Observable<BangumiApiPageResponse<List<BiliBangumiTag>>> getCategoryStyle(@Query("page") int i, @Query("pagesize") int i2);

    @GET("/appindex/cinema/region/documentary")
    Observable<BangumiApiResponse<BangumiCinemaTab>> getCinemaDocumentary();

    @GET("/appindex/cinema/fall")
    Observable<BangumiApiResponse<BangumiCinemaFall>> getCinemaFall(@Query("region") String str, @Query("cursor") String str2);

    @GET("/appindex/cinema/region")
    Observable<BangumiApiResponse<BangumiCinemaTab>> getCinemaHome();

    @GET("/appindex/cinema")
    Observable<BangumiApiResponse<BangumiCinemaTab>> getCinemaIndex(@Query("cursor") String str);

    @GET("/appindex/cinema/region/movie")
    Observable<BangumiApiResponse<BangumiCinemaTab>> getCinemaMovie();

    @GET("/appindex/cinema/region/tv")
    Observable<BangumiApiResponse<BangumiCinemaTab>> getCinemaTv();

    @GET("/api/fall?platform=android&pagesize=10")
    Observable<BangumiApiResponse<List<BangumiRecommend>>> getEditorRecommendFall(@Query("cursor") long j, @Query("wid") String str);

    @GET("/appindex/follow_index_fall?platform=android")
    Observable<BangumiApiResponse<List<BangumiRecommend>>> getEditorRecommendList(@Query("cursor") long j, @Query("area") int i);

    @GET("/appindex/follow_index_page")
    Observable<BangumiApiResponse<BangumiFollowHome>> getFollowHome();

    @GET("/api/get_concerned_season")
    Observable<BangumiMineFollow> getFollowMine(@Query("page") int i, @Query("pagesize") int i2, @Query("mid") long j, @Query("access_key") String access_key);

    //@CacheControl(120000)
    @GET("/api/concern_recommend")
    Observable<BangumiApiResponse<List<BangumiBriefPlus>>> getFollowRecommend();

    //@CacheControl(3600000)
    @GET("/media/api/search/v2/condition")
    Observable<BangumiApiResponse<BangumiIndexCondition>> getIndexCondition(@Query("season_type") String str);

    @GET("/review/api/feed/pull")
    Observable<BangumiApiResponse<List<RecommendReview>>> getIndexRecommendReview(@Query("cursor") String str);

    @GET("/media/api/search/result")
    Observable<BangumiApiResponse<BangumiIndexResult>> getIndexResult(@QueryMap HashMap<String, String> hashMap);

    @GET("/review/api/long/view")
    Observable<BangumiApiResponse<ReviewLongDetail>> getLongReview(@Query("access_key") String access_key, @Query("media_id") int i, @Query("review_id") int i2);

    @GET("/review/api/long/list")
    Observable<BangumiApiResponse<C1870b>> getLongReviewList(@Query("media_id") String str, @Query("cursor") String str2, @Query("page_size") int i, @Query("folded") int i2, @Query("access_key") String access_key3);

    @GET("/media/api/detail")
    Observable<BangumiApiResponse<ReviewMediaBase>> getMediaData(@Query("media_id") long j, @Query("access_key") String access_key);

    @GET("/appindex/follow_index_mine")
    Observable<BangumiApiResponse<BangumiFollowMine>> getMineFollow(@Query("mid") long j, @Query("access_key") String access_key);

    //@CacheControl(3600000)
    @GET("/api/movie_index_cond")
    Observable<BangumiApiResponse<BangumiMovieFilter>> getMovieFilter();

    @GET("/appindex/movie_index_page?device=android")
    //@RequestInterceptor(C9634e.class)
    Observable<BangumiApiResponse<BangumiMovieHome>> getMovieHome();

    //@CacheControl(120000)
    @GET("/api/movie_index")
    Observable<BangumiApiResponse<BangumiMovieIndex>> getMovieIndex(@QueryMap MovieIndexParamsMap movieIndexParamsMap);

    @GET("/media/api/producers")
    Observable<BangumiApiResponse<BangumiProducerList>> getProducerList(@QueryMap ProducerListParamsMap producerListParamsMap);

    //@CacheControl(120000)
    @GET("/api/bangumi_recommend?pagesize=10")
    Observable<BangumiApiResponse<List<BangumiRecommend>>> getRecommendList(@Query("type") int i, @Query("cursor") long j);

    @GET("/view/api/media")
    Observable<BangumiApiResponse<ReviewMediaDetail>> getReviewDetail(@Query("media_id") long j, @Query("access_key") String access_key);

    @GET("/review/api/long/mine")
    Observable<BangumiApiResponse<List<RecommendReview>>> getReviewHomeMyLongReview(@Query("access_key") String access_key, @Query("cursor") String str2);

    @GET("/review/api/rating/mine")
    Observable<BangumiApiResponse<List<ReviewMediaDetail>>> getReviewHomeMyReview(@Query("access_key") String access_key, @Query("cursor") String str2);

    @GET("/review/api/page/index")
    Observable<BangumiApiResponse<ReviewIndex>> getReviewIndex(@Query("access_key") String access_key);

    @GET("/media/api/ranking/list")
    Observable<BangumiApiResponse<List<ReviewMediaBase>>> getReviewRankingList(@Query("region_id") int i);

    @GET("/media/api/ranking/region")
    Observable<BangumiApiResponse<List<ReviewRankingRegion>>> getReviewRankingRegionList();

    @GET("/review/api/long/recommend")
    Observable<BangumiApiResponse<List<RecommendReview>>> getReviewRecommendReview(@Query("cursor") String str);

    @GET("/review/api/topic/history")
    Observable<BangumiApiResponse<List<ReviewIndex.ReviewEditorTopic>>> getReviewRecommendTopic(@Query("cursor") String str);

    @GET("/sponsor/get_season_by_sponsor")
    Observable<BangumiApiResponse<BangumiCategoryIndex>> getSeasonBySponsor(@Query("page") int i, @Query("page_size") int i2, @Query("index_type") int i3, @Query("index_sort") int i4);

    @GET("/api/get_season_by_tag_v2")
    Observable<BangumiApiPageResponse<BangumiCategoryOld>> getSeasonByTag(@Query("page") int i, @Query("pagesize") int i2, @Query("tag_id") String str, @Query("indexType") int i3);

    @GET("/api/season_v5?type=bangumi")
    Observable<BangumiApiResponse<BiliBangumiSeasonDetail>> getSeasonDetail(@Query("access_key") String access_key, @Query("season_id") String str2);

    //@CacheControl(120000)
    @GET("/media/api/search/series/list")
    Observable<BangumiApiResponse<List<BangumiSeasonListPrevious>>> getSeasonList(@Query("access_key") String access_key, @Query("season_type") int i);

    @GET("/review/api/short/view")
    Observable<BangumiApiResponse<ReviewShortDetail>> getShortReview(@Query("access_key") String access_key, @Query("media_id") int i, @Query("review_id") int i2);

    @GET("/review/api/short/list")
    Observable<BangumiApiResponse<C1870b>> getShortReviewList(@Query("media_id") String str, @Query("cursor") String str2, @Query("page_size") int i, @Query("access_key") String access_key3);

    //@CacheControl(86400000)
    @Deprecated
    @GET("/sponsor/point_rate.json")
    Observable<BangumiApiResponse<JSONObject>> getSponsorRate();

    @GET("/api/timeline_v5")
    Observable<BangumiApiResponse<List<BangumiTimelineDay>>> getTimeline(@Query("access_key") String access_key, @Query("area_id") String str2, @Query("see_mine") int i, @Query("date_before") int i2, @Query("date_after") int i3, @Query("night_mode") int i4);

    @GET("/api/user_season_status")
    Observable<BangumiApiResponse<UserSeason>> getUserSeasonStatus(@Query("access_key") String access_key, @Query("season_id") String str2);

    @GET("/api/fall?pagesize=10&wid=26")
    Observable<BangumiApiResponse<List<BangumiMovieHome.Fall>>> getWeekendList(@Query("cursor") String str);

    @FormUrlEncoded
    @POST("/review/api/like")
    Observable<JSONObject> likeReview(@Field("media_id") long j, @Field("review_id") long j2, @Field("review_type") int i, @Field("access_key") String str);

    @FormUrlEncoded
    @POST("/review/api/long/post")
    Observable<JSONObject> publishLong(@Field("access_key") String str, @Field("media_id") int i, @Field("score") int i2, @Field("title") String str2, @Field("content") String str3, @Field("origin") int i3, @Field("spoiler") int i4);

    @FormUrlEncoded
    @POST("/review/api/short/post")
    Observable<JSONObject> publishShort(@Field("access_key") String str, @Field("media_id") int i, @Field("score") int i2, @Field("content") String str2, @Field("share_feed") int i3);

    @FormUrlEncoded
    @POST("/review/api/report")
    Observable<JSONObject> reportReview(@Field("access_key") String str, @Field("media_id") int i, @Field("review_id") int i2, @Field("review_type") int i3, @Field("report_type") int i4, @Field("content") String str2);

    @GET("/api/unconcern_season")
    Observable<BangumiApiResponse<JSONObject>> unfollow(@Query("access_key") String access_key, @Query("season_id") String str2);
}
