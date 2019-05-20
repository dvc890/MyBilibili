package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiApiResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.UserCoinNumberBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH'\u00a8\u0006\n"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiCoinApiService;", "", "loadContributionCoinCount", "Lcom/bilibili/okretro/call/BiliCall;", "Lcom/bilibili/bangumi/api/BangumiApiResponse;", "Lcom/bilibili/bangumi/api/uniform/UserCoinNumberBean;", "epId", "", "accessKey", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.api.uniform.a */
public interface BangumiCoinApiService {
    @NotNull
    @GET("/pgc/season/episode/coin/user/number")
    Observable<BangumiApiResponse<UserCoinNumberBean>> loadContributionCoinCount(@Query("ep_id") long j, @Nullable @Query("access_key") String access_key);
}
