package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiApiResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review.ReviewPublishInfo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/BangumiReviewApiService;", "", "getUserReview", "Lcom/bilibili/okretro/call/BiliCall;", "Lcom/bilibili/bangumi/api/BangumiApiResponse;", "Lcom/bilibili/bangumi/api/review/ReviewPublishInfo;", "accessKey", "", "mediaId", "bangumi_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.api.uniform.b */
public interface BangumiReviewApiService {
    @NotNull
    @GET("/pgc/review/app/user")
    Observable<BangumiApiResponse<ReviewPublishInfo>> getUserReview(@Nullable @Query("access_key") String str, @Nullable @Query("media_id") String str2);
}
