package com.dvc.mybilibili.mvp.model.api.service.column;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.*;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.column.api.service.b */
public interface C12093b {
    @GET("/x/v2/favorite/article")
    Observable<GeneralResponse<BaseListItemsData<ColumnFavorite>>> getColumnFavoriteList(@Query("access_key") String access_key, @Query("pn") int i, @Query("ps") int i2);

    @GET("/x/v2/space/article")
    Observable<GeneralResponse<BaseListItemData<Column>>> getColumnSpaceList(@Query("access_Key") String str, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    @GET("/x/feed/upper/article")
    Observable<GeneralResponse<ColumnFeedList>> getUpperArticle(@Query("access_key") String access_key, @Query("pn") int i, @Query("ps") int i2);
}
