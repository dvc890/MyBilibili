package com.dvc.mybilibili.mvp.model.api.service.pegasus;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.ChannelSearchResult;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH'J(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J\"\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J\u009e\u0001\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\n2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\n2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\n2\b\b\u0001\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\n2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u001d\u001a\u00020\bH'J8\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\n2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J*\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0015\u001a\u00020\nH'Jz\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010&\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020\n2\b\b\u0001\u0010(\u001a\u00020\n2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010,\u001a\u00020\nH'J6\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010/\u001a\u00020\n2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J6\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010/\u001a\u00020\n2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J.\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00040\u00032\n\b\u0001\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'\u00a8\u00063"}, d2 = {"Lcom/bilibili/pegasus/api/TMChannelService;", "", "discoverChannelList", "Lcom/bilibili/okretro/call/BiliCall;", "Lcom/bilibili/okretro/GeneralResponse;", "", "Lcom/bilibili/pegasus/api/model/Channel;", "accessKey", "", "id", "", "getChannelCategoryList", "Lcom/bilibili/pegasus/api/model/ChannelCategoryItem;", "getChannelMainPage", "Lcom/bilibili/pegasus/api/model/ChannelHomeInfo;", "getFeedList", "Lcom/bilibili/pegasus/api/modelv2/ChannelFeedV2;", "channelId", "channelName", "pull", "", "loginEvent", "displayID", "fnval", "fnver", "fourk", "qn", "forceHost", "spmidFrom", "fromPage", "getFeedTab", "getMySubscribeChannel", "Lcom/bilibili/pegasus/api/model/ChannelMySubscribeInfo;", "getSquareInfo", "Lcom/bilibili/pegasus/api/model/ChannelSquareInfo;", "searchChannel", "Lcom/bilibili/pegasus/channel/search/ChannelSearchResult;", "keyword", "sourceType", "pageNum", "pageSize", "userType", "orderType", "ascend", "highLight", "subscribe", "Ljava/lang/Void;", "from", "unsubscribe", "updateOrder", "channelIds", "pegasus_release"}, k = 1, mv = {1, 1, 11})
@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
public interface TMChannelService {
    @NotNull
    @GET("x/channel/discover")
    Observable<GeneralResponse<List<Channel>>> discoverChannelList(@Nullable @Query("access_key") String access_key, @Query("id") int i);

    @NotNull
    @GET("x/channel/category")
    Observable<GeneralResponse<List<ChannelCategoryItem>>> getChannelCategoryList(@Nullable @Query("access_key") String access_key);

    @NotNull
    @GET("/x/channel/list")
    Observable<GeneralResponse<ChannelHomeInfo>> getChannelMainPage(@Nullable @Query("access_key") String access_key);

    @NotNull
    @GET("/x/channel/feed/index")
    Observable<GeneralResponse<ChannelFeedV2>> getFeedList(@Query("channel_id") int i, @Nullable @Query("channel_name") String str, @Query("pull") boolean z, @Query("login_event") int i2, @Query("display_id") int i3, @Nullable @Query("access_key") String access_key2, @Query("fnval") int i4, @Query("fnver") int i5, @Query("fourk") int i6, @Query("qn") int i7, @Query("force_host") int i8, @Nullable @Query("from_spmid") String str3, @NotNull @Query("from_page") String str4);

    @NotNull
    @GET("/x/channel/feed/tab")
    Observable<GeneralResponse<Channel>> getFeedTab(@Query("channel_id") int i, @Nullable @Query("channel_name") String str, @Nullable @Query("access_key") String access_key2);

    @NotNull
    @GET("/x/channel/mysub")
    Observable<GeneralResponse<ChannelMySubscribeInfo>> getMySubscribeChannel(@Nullable @Query("access_key") String access_key);

//    @CacheControl(config = 28)
    @NotNull
    @GET("/x/channel/square")
    Observable<GeneralResponse<ChannelSquareInfo>> getSquareInfo(@Nullable @Query("access_key") String access_key, @Query("login_event") int i);

    @NotNull
    @GET("/x/v2/search/type")
    Observable<GeneralResponse<ChannelSearchResult>> searchChannel(@Nullable @Query("access_key") String access_key, @Nullable @Query("keyword") String str2, @Query("type") int i, @Query("pn") int i2, @Query("ps") int i3, @Nullable @Query("user_type") String str3, @Nullable @Query("order") String str4, @Nullable @Query("order_sort") String str5, @Query("highlight") int i4);

    @FormUrlEncoded
    @NotNull
    @POST("/x/channel/add")
    Observable<GeneralResponse> subscribe(@Field("channel_id") int i, @Field("from") int i2, @Field("access_key") @Nullable String str);

    @FormUrlEncoded
    @NotNull
    @POST("/x/channel/cancel")
    Observable<GeneralResponse> unsubscribe(@Field("channel_id") int i, @Field("from") int i2, @Field("access_key") @Nullable String str);

    @FormUrlEncoded
    @NotNull
    @POST("/x/channel/update")
    Observable<GeneralResponse> updateOrder(@Field("channel_ids") @Nullable String str, @Field("access_key") @Nullable String str2);
}
