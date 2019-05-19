package com.dvc.mybilibili.mvp.model.api.service.search;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.*;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.converge.ConvergePageItem;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.search.api.l */
public interface BiliSearchApiService {
    @GET("https://bangumi.bilibili.com/follow/api/season/follow")
    Observable<GeneralResponse<JSONObject>> favorite(@Query("access_key") String str, @Query("season_id") String str2, @Nullable @Query("season_type") Integer num);

    @GET("/x/v2/search/converge")
    Observable<GeneralResponse<ConvergePageItem>> getConvergePage(@Query("access_key") String str, @Query("card_id") int i, @Query("track_id") String str2, @Query("order") String str3, @Query("pn") int i2);

    @GET("/x/v2/search/defaultwords")
    Observable<GeneralResponse<DefaultKeyword>> getDefaultKeywords(@Query("access_key") String str);

    @GET("/x/resource/static")
    Observable<SearchEasterEggConfig> getEasterEggs(@Query("ver") String str);

    @GET("x/v2/search/resource")
    Observable<GeneralResponse<List<SearchBannerResource>>> getSearchBannerResources(@Query("ad_extra") String str);

    @GET("/x/v2/search/hot?limit=50")
    Observable<GeneralResponse<SearchRanks>> getSearchRanks();

    @GET("/x/v2/search/recommend")
    Observable<GeneralResponse<SearchReferral>> guessRecommend(@Query("access_key") String str);

    @GET("/x/v2/search/recommend")
    Observable<GeneralResponse<SearchReferral>> guessRecommend(@Query("access_key") String str, @Query("from") int i, @Query("show") int i2);

    @GET("/x/v2/search")
    Observable<GeneralResponse<SearchResultAll>> searchAll(@Nullable @Query("access_key") String str, @Query("pn") int i, @Query("ps") int i2, @Nullable @Query("keyword") String str2, @Query("duration") int i3, @Nullable @Query("order") String str3, @Nullable @Query("rid") String str4, @Nullable @Query("from_source") String str5, @Query("highlight") int i4, @Query("recommend") int i5, @Query("is_org_query") int i6);

    @GET("x/v2/search/episodes")
    Observable<GeneralResponse<List<Episode>>> searchEpisodes(@Query("access_key") String str, @Query("season_id") String str2);

    @GET("x/v2/search/recommend/pre")
    Observable<GeneralResponse<SearchRecommendPreList>> searchPreRecommendList();

    @GET("x/v2/search/recommend/noresult")
    Observable<GeneralResponse<SearchResultAll>> searchRecommend(@Query("access_key") String str, @Query("pn") int i, @Query("ps") int i2, @Query("keyword") String str2);

    @GET("/x/v2/search/type")
    Observable<GeneralResponse<BiliSearchResultTypeNew>> searchType(@Nullable @Query("access_key") String str, @Nullable @Query("keyword") String str2, @Query("type") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("category_id") int i4, @Query("highlight") int i5, @Nullable @Query("user_type") String str3, @Nullable @Query("order") String str4, @Nullable @Query("order_sort") String str5);

    @GET("/x/v2/search/type")
    Observable<GeneralResponse<BiliSearchResultTypeNew>> searchType(@Query("access_key") String str, @Nullable @Query("keyword") String str2, @Query("type") int i, @Query("pn") int i2, @Query("ps") int i3, @Nullable @Query("user_type") String str3, @Nullable @Query("order") String str4, @Nullable @Query("order_sort") String str5, @Query("highlight") int i4);

    @GET("/x/v2/search/suggest3")
    Observable<GeneralResponse<SearchSuggest>> suggest(@Query("keyword") String str, @Query("highlight") int i);

    @GET("https://bangumi.bilibili.com/follow/api/season/unfollow")
    Observable<GeneralResponse<JSONObject>> unfavorite(@Query("access_key") String str, @Query("season_id") String str2, @Nullable @Query("season_type") Integer num);
}
