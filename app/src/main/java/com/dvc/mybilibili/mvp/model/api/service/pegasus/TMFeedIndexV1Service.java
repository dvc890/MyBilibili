package com.dvc.mybilibili.mvp.model.api.service.pegasus;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.DataListResponse;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.AppIndex;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Deprecated
@BaseUrl("https://app.bilibili.com")
public interface TMFeedIndexV1Service {
    @GET("/x/feed/index")
    @Deprecated
    Observable<DataListResponse<AppIndex>> getIndex(@Query("idx") int idx,
                                                    @Query("login_event") int login_event,
                                                    @Query("network") String network,
                                                    @Query("open_event") String open_event,
                                                    @Query("pull") boolean pull,
                                                    @Query("style") int style,
                                                    @Query("ts") String ts);
}
