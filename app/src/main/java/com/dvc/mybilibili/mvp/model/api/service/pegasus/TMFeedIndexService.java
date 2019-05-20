package com.dvc.mybilibili.mvp.model.api.service.pegasus;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H'J\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004H'J\u0088\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0004H'J\u00e0\u0001\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b0\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\"\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010%\u001a\u00020\u000fH'J`\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010'0\b0\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000fH'J6\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010,\u001a\u00020\u000fH'\u00a8\u0006-"}, d2 = {"Lcom/bilibili/pegasus/api/TMFeedIndexService;", "", "cancelDislike", "Lcom/bilibili/okretro/call/BiliCall;", "", "map", "", "getConvergeList", "Lcom/bilibili/okretro/GeneralResponse;", "Lcom/bilibili/pegasus/api/modelv2/ConvergeList;", "id", "getHot", "Lcom/bilibili/pegasus/api/modelv2/PegasusFeedResponse;", "accessKey", "idx", "", "lastParam", "loginEvent", "ver", "qn", "fnval", "fnver", "fourk", "forceHost", "spmid", "getIndexList", "pull", "", "network", "column", "openEvent", "bannerHash", "interest", "adExtra", "flush", "canAutoPlay", "deviceType", "recommendMode", "getOperationTab", "Lcom/bilibili/pegasus/api/model/PromoOperationTab;", "tabId", "likeVideo", "Lcom/alibaba/fastjson/JSONObject;", "aid", "like", "pegasus_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
public interface TMFeedIndexService {
    @NotNull
    @GET("/x/feed/dislike/cancel")
    Observable<String> cancelDislike(@NotNull @QueryMap Map<String, String> map);

    @NotNull
    @GET("/x/v2/feed/index/converge")
    Observable<GeneralResponse<ConvergeList>> getConvergeList(@Nullable @Query("id") String id);

    @NotNull
    @GET("/x/v2/show/popular/index")
    Observable<GeneralResponse<PegasusFeedResponse>> getHot(@Nullable @Query("access_key") String access_key, @Query("idx") int idx, @Nullable @Query("last_param") String last_param, @Query("login_event") int login_event, @Nullable @Query("ver") String ver, @Query("qn") int qn, @Query("fnval") int fnval, @Query("fnver") int fnver, @Query("fourk") int fourk, @Query("force_host") int force_host, @NotNull @Query("spmid") String spmid);

    @NotNull
    @GET("/x/v2/feed/index")
    Observable<GeneralResponse<PegasusFeedResponse>> getIndexList(@Nullable @Query("access_key") String access_key, @Query("idx") int idx, @Query("pull") boolean pull, @Nullable @Query("network") String network, @Query("column") int column, @Query("login_event") int login_event, @Nullable @Query("open_event") String open_event, @Nullable @Query("banner_hash") String banner_hash, @Query("qn") int qn, @Nullable @Query("interest") String interest, @Nullable @Query("ad_extra") String ad_extra, @Query("flush") int flush, @Query("autoplay_card") int autoplay_card, @Query("fnval") int fnval, @Query("fnver") int fnver, @Query("fourk") int fourk, @Query("device_type") int device_type, @Query("force_host") int force_host, @Query("recsys_mode") int recsys_mode);

    @NotNull
    @GET("/x/v2/feed/index/tab")
    Observable<GeneralResponse<PromoOperationTab>> getOperationTab(@Nullable @Query("access_key") String access_key, @Nullable @Query("id") String id, @Query("qn") int qn, @Query("fnval") int fnval, @Query("fnver") int fnver, @Query("fourk") int fourk, @Query("force_host") int force_host);

    @FormUrlEncoded
    @NotNull
    @POST("/x/v2/view/like")
    Observable<GeneralResponse<JSONObject>> likeVideo(@Field("access_key") @Nullable String access_key, @Field("aid") @Nullable String aid, @Field("like") int like);
}
