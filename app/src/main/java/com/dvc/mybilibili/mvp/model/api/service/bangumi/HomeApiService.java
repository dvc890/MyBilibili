package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiApiResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance.CommonCard;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance.HomeMinePage;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance.HomeRecommendPage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH'J4\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00040\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\n\u001a\u00020\bH'J4\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00040\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\n\u001a\u00020\bH'JE\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00040\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000eH'\u00a2\u0006\u0002\u0010\u0014JE\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00040\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000eH'\u00a2\u0006\u0002\u0010\u0014JF\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00040\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH'\u00a8\u0006\u001a"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/HomeApiService;", "", "exchange", "Lcom/bilibili/okretro/call/BiliCall;", "Lcom/bilibili/bangumi/api/BangumiApiResponse;", "", "Lcom/bilibili/bangumi/data/entrance/CommonCard;", "oid", "", "type", "accessKey", "mineBangumiPage", "Lcom/bilibili/bangumi/data/entrance/HomeMinePage;", "fnVer", "", "fnVal", "mineCinemaPage", "recommendBangumiPage", "Lcom/bilibili/bangumi/data/entrance/HomeRecommendPage;", "ab", "(IILjava/lang/String;Ljava/lang/Integer;)Lcom/bilibili/okretro/call/BiliCall;", "recommendCinemaPage", "recommendFall", "size", "cursor", "wids", "bangumi_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.data.entrance.a */
public interface HomeApiService {

    //////@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 11})
    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.data.entrance.a$a */
    public static final class C4869a {
        @NotNull
        @GET("/pgc/app/page/cinema/mine")
        /* renamed from: b */
        public static /* synthetic */ Observable m21028b(HomeApiService homeApiService, int i, int i2, String str, int i3, Object obj) {
//            if (obj != null) {
//                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mineCinemaPage");
//            }
//            if ((i3 & 1) != 0) {
//                i = icc.m6068a();
//            }
//            if ((i3 & 2) != 0) {
//                i2 = icc.m6069b();
//            }
//            if ((i3 & 4) != 0) {
//                str = C4931h.m21203b((Context) C1905b.m8107a());
//               //Intrinsics.checkExpressionValueIsNotNull(str, "BangumiHelper.getAccessK\u2026pplications.getCurrent())");
//            }
            return homeApiService.mineCinemaPage(i, i2, str);
        }

        @NotNull
        @GET("/pgc/app/v2/page/cinema/tab")
        /* renamed from: b */
        public static /* synthetic */ Observable m21029b(HomeApiService homeApiService, int i, int i2, String str, Integer num, int i3, Object obj) {
//            if (obj != null) {
//                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recommendCinemaPage");
//            }
//            if ((i3 & 1) != 0) {
//                i = icc.m6068a();
//            }
//            if ((i3 & 2) != 0) {
//                i2 = icc.m6069b();
//            }
//            if ((i3 & 4) != 0) {
//                str = C4931h.m21203b((Context) C1905b.m8107a());
//               //Intrinsics.checkExpressionValueIsNotNull(str, "BangumiHelper.getAccessK\u2026pplications.getCurrent())");
//            }
//            if ((i3 & 8) != 0) {
//                C4654e a = C1812a.m7897a("pgc_home_timeline_abtest").mo25658a();
//                if (a != null) {
//                    String b = a.mo25651b();
//                    if (b != null) {
//                        num = Integer.valueOf(Integer.parseInt(b));
//                    }
//                }
//                num = null;
//            }
            return homeApiService.recommendCinemaPage(i, i2, str, num);
        }
    }

    @NotNull
    @GET("/pgc/app/v2/page/exchange")
    Observable<BangumiApiResponse<List<CommonCard>>> exchange(@NotNull @Query("oid") String str, @NotNull @Query("type") String str2, @NotNull @Query("access_key") String str3);

    @NotNull
    @GET("/pgc/app/page/bangumi/mine")
    Observable<BangumiApiResponse<HomeMinePage>> mineBangumiPage(@Query("fnver") int i, @Query("fnval") int i2, @NotNull @Query("access_key") String str);

    @NotNull
    @GET("/pgc/app/page/cinema/mine")
    Observable<BangumiApiResponse<HomeMinePage>> mineCinemaPage(@Query("fnver") int i, @Query("fnval") int i2, @NotNull @Query("access_key") String str);

    @NotNull
    @GET("/pgc/app/v2/page/bangumi")
    Observable<BangumiApiResponse<HomeRecommendPage>> recommendBangumiPage(@Query("fnver") int i, @Query("fnval") int i2, @NotNull @Query("access_key") String str, @Nullable @Query("pgc_home_timeline_abtest") Integer num);

    @NotNull
    @GET("/pgc/app/v2/page/cinema/tab")
    Observable<BangumiApiResponse<HomeRecommendPage>> recommendCinemaPage(@Query("fnver") int i, @Query("fnval") int i2, @NotNull @Query("access_key") String str, @Nullable @Query("pgc_home_timeline_abtest") Integer num);

    @NotNull
    @GET("/pgc/operation/api/fall")
    Observable<BangumiApiResponse<List<CommonCard>>> recommendFall(@Query("size") int i, @NotNull @Query("cursor") String str, @NotNull @Query("wid") String str2, @NotNull @Query("access_key") String str3);
}
