package com.dvc.mybilibili.mvp.model.api.service.livestream;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.AddRoomBlack;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.AnchorTaskInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveAddWish;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveGuardRankItem;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveHotWish;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveRoomDanmuConfig;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveWish;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.BiliLiveWishConfig;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveAreaInfos;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.ChangeLiveStreamInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.HistoryArea;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.IncomeDetailInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.IncomeInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveCallGame;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomFansRank;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomFeedRank;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomHistoryMsg;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomOperationRank;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveRoomUploadCover;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomInfoV2;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomStartLiveInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomStopLiveInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveTopicList;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LuckGiftEntrance;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.ShieldKeyWord;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.SimpleRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.UpStreamAddrInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveTitle;
import com.dvc.mybilibili.mvp.model.api.service.livestream.interceptor.aoz;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

@BaseUrl("http://api.live.bilibili.com")
/* compiled from: BL */
public interface LiveStreamApiService {
    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/banned_service/v1/Silent/room_block_user")
    Observable<GeneralResponse<AddRoomBlack>> addRoomBlackList(@Field("roomid") long roomid, @Field("content") String content, @Field("type") int type, @Field("hour") int hour);

    @GET("/live_stream/v1/UpStreamExt/pause_by_room")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<ChangeLiveStreamInfo>> changeLiveStream(@Query("room_id") int roomid);

    @GET("/xlive/app-ucenter/v1/topic/CheckTopic")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<Void>> checkTopic(@Query("topic") String str);

    @POST("/xlive/app-ucenter/v1/room/Create")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<SimpleRoomInfo>> createLiveRoom();

    @GET("/xlive/web-ucenter/v1/anchorTask/isViewed")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<AnchorTaskInfo>> getAnchorTaskEntrance();

    @GET("/rc/v1/Title/getTitle")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<List<BiliLiveTitle>>> getAppUserTitle(@Query("scale") String str);

    //获取直播分区列表（推流的时候也需要该信息）
    @GET("http://api.live.bilibili.com/room/v1/Area/getList")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<List<LiveAreaInfos>>> getAreaList();

    @GET("client/v1/Game/getCallList")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveCallGame>> getCallGameList();

    @GET("http://api.live.bilibili.com/room/v1/Area/getMyChooseArea")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<List<HistoryArea>>> getChooseArea(@Query("roomid") int roomid);

    @GET("/room/v1/Cover/get_list")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<List<LiveRoomUploadCover>>> getCover(@Query("room_id") int roomid, @Query("type") String type);

    @GET("/room/v1/Danmu/getConf")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<BiliLiveRoomDanmuConfig>> getDanmakuRoomInfo(@Query("room_id") int room_id);

    @GET("/rankdb/v1/RoomRank/mobileMedalRank")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveRoomFansRank>> getFansMedalRank(@Query("room_id") int room_id);

    @GET("/rankdb/v1/RoomRank/mobileSevenRank")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveRoomFeedRank>> getFeedRank(@Query("room_id") int room_id);

//    @GET("/gift/v3/live/gift_config")
//    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
//    Observable<GeneralResponse<List<C1990a>>> getGiftConfig();

    @GET("/live_user/v1/Guard/guardRank")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<List<BiliLiveGuardRankItem>>> getGuardRank(@Query("ruid") long j, @Query("page") int i, @Query("page_size") int i2);

    @GET("/live_user/v1/WishBottle/myHotWish")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<BiliLiveHotWish>> getHotWish();

    @GET("/pay/v1/Master/assistant_income")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<IncomeInfo>> getIncomeHamsters();

    @GET("/pay/v1/Master/assistant_income_list")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<IncomeDetailInfo>> getIncomeHamstersDetail(@Query("month") String month);

    @GET("/gift/v1/LuckGift/getLuckStatus")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LuckGiftEntrance>> getLuckGiftEntrance(@Query("room_id") int room_id);

    @GET("live_user/v1/WishBottle/myWishList")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<BiliLiveWish>> getMyWishBottleList();

    @GET("/rankdb/v1/ActivityRank/mobileRoomRank")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveRoomOperationRank>> getOperationRank(@Query("room_id") int room_id, @Query("type") String str, @Query("scale") String str2);

    @GET("/xlive/app-room/v1/dM/gethistory")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveRoomHistoryMsg>> getRoomHistoryMsg(@Query("room_id") int room_id);

    @GET("/xlive/app-ucenter/v1/room/GetInfo")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveStreamingRoomInfoV2>> getRoomInfo();

    @GET("/AppRoom/index")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveRoomInfo>> getRoomInfo(@Query("room_id") int room_id, @Query("buld") String str, @Query("scale") String str2);

    @GET("/banned_service/v1/Shield/get_up_keywords")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<ShieldKeyWord>> getShieldKeyword(@Query("room_id") int room_id);

    @GET("/xlive/app-ucenter/v1/topic/GetTopicList")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveTopicList>> getTopicList();

    @GET("/live_stream/v1/UpStreamExt/get_by_room")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<UpStreamAddrInfo>> getUpStreamAddr(@Query("room_id") int room_id, @Query("free_flow") String str, @Query("area_id") int i2);

    @GET("/live_user/v1/WishBottle/myWishConfig")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<BiliLiveWishConfig>> getWishConfig();

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/live_user/v1/WishBottle/myWishDelete")
    Observable<GeneralResponse<Object>> myWishDelete(@Field("id") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/live_user/v1/WishBottle/myWishFinish")
    Observable<GeneralResponse<Object>> myWishFinish(@Field("id") int i);

    @POST("/live_user/v1/WishBottle/myWishAdd")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<BiliLiveAddWish>> publishWish(@Query("type_id") int i, @Query("wish_limit") int i2, @Query("content") String str);

    //设置粉丝徽章的命名
    @GET("/fans_medal/v1/medal/open")
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    Observable<GeneralResponse<LiveStreamingRoomInfo>> setFansMedal(@Query("name") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/banned_service/v1/Shield/shield_keyword")
    Observable<GeneralResponse<List<String>>> setShieldKeyword(@Field("set_room_shield") int i, @Field("keyword") String str, @Field("type") int i2);

    /**
     *
     * @param room_id
     * @param area_v2
     * @param type 横屏：1，竖屏：2
     * @param freeFlow 联通："unicom"  非联通：null
     * @return
     */
    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/room/v1/Room/startLive")
    Observable<GeneralResponse<LiveStreamingRoomStartLiveInfo>> startLiveStreaming(@Field("room_id") int room_id, @Field("area_v2") int area_v2, @Field("type") int type, @Field("freeFlow") String freeFlow);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/room/v1/Room/stopLive")
    Observable<GeneralResponse<LiveStreamingRoomStopLiveInfo>> stopLiveStreaming(@Field("room_id") int room_id);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/room/v1/Cover/update")
    Observable<GeneralResponse<List<Void>>> updateProfileCover(@Field("pic_id") int i, @Field("room_id") int room_id2);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/room/v1/Room/update")
    Observable<GeneralResponse<List<Void>>> updateRoomArea(@Field("room_id") int room_id, @Field("area_id") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+aoz.CLASSNAME)
    //@RequestInterceptor(aoz.class)
    @POST("/room/v1/Room/update")
    Observable<GeneralResponse<List<Void>>> updateRoomTitle(@Field("room_id") int room_id, @Field("title") String title);
}
