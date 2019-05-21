package com.dvc.mybilibili.mvp.model.api.service.bililive;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.capsule.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.lotteryinfo.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomTabInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo.BiliLiveRoomUserInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.guard.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livecenter.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.rank.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.title.*;
import com.dvc.mybilibili.mvp.model.api.service.bililive.interceptor.C9909b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

@BaseUrl("https://api.live.bilibili.com")
/* compiled from: BL */
public interface BiliLiveApiV2Service {

    /* compiled from: BL */
    public enum Type {
        ALL,
        ROOM,
        USER;

        public String toString() {
            return name().toLowerCase();
        }
    }

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/activity/v1/lol/joinGuess")
    Observable<GeneralResponse<BiliLiveLplContent>> activityLOLJoinGuess(@Field("match_id") int i, @Field("team_id") int i2, @Field("guess_id") int i3);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/activity/v1/lol/vote")
    Observable<GeneralResponse<Void>> activityLOLVote(@Field("match_id") int i, @Field("team_id") int i2, @Field("player_id") int i3, @Field("num") int i4);

    @GET("/pay/v1/Proxy/getWallet")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBuyGoldInit>> buyGoldInit();

    @GET("/pay/v1/Guard/canBuy")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> canBuyGuard(@Query("ruid") long j, @Query("guard_level") int i, @Query("num") int i2);

    @GET("/rc/v1/UserTitle/canRenew")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> canRenewTitleRenewCard(@Query("title") String str);

    @GET("/fans_medal/v5/live_fans_medal/cancelWearMedal")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List>> cancelMedal();

    @GET("/rc/v1/UserTitle/cancelTitle")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List>> cancelTitle();

    @GET("/live_user/v1/UserSetting/change_notice")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveGuardNotice>> changeGuardNotice(@Query("ruid") long j);

    @GET("https://api.live.bilibili.co/captcha/v0/Captcha/check")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> checkCaptcha(@Query("token") String str, @Query("phrase") String str2);

    @GET("/gift/v4/smalltv/check")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveLotteryInfo>> checkLotteryInfo(@Query("roomid") int i);

    @GET("/live_user/v1/Master/governorShowTriggle")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> closeGovernorShow(@Query("uid") long j, @Query("target_id") long j2, @Query("triggle") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/rc/v1/TitleStuff/upgradeTitle")
    Observable<GeneralResponse<BiliLiveTitleCombineResult>> combineTitle(@Field("tid") int i, @Field("title_num") int i2, @Field("stuff_num") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("https://api.live.bilibili.co/captcha/v1/Captcha/create")
    Observable<GeneralResponse<BiliLiveCaptcha>> createCaptcha(@Field("height") int i, @Field("width") int i2);

    @GET("/xlive/app-room/v1/propMailbox/del")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Void>> deletRenewalCardInMail(@Query("mail_id") int i);

    @GET("/fans_medal/v5/live_fans_medal/deleteMedals")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List>> deleteMedals(@Query("medalIds") String str);

    @GET("/lottery/v1/Box/draw")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List>> doAppRoomActivityDraw(@Query("aid") int i, @Query("number") int i2);

    @GET("/rc/v1/Sign/doSign")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Void>> doSign();

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/relation/v1/Feed/follow")
    Observable<GeneralResponse<List>> followUp(@Field("follow") long j, @Field("re_src") int i);

    @GET("/activity/v1/lol/matchInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveActivityLOLMatchInfo>> getActivityLolMatchInfo(@Query("room_id") int i);

    @GET("/room/v1/Area/getList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveNewArea>>> getAllAreaList(@Query("parent_id") int i, @Query("source_id") int i2, @Query("need_entrance") int i3);

    @GET("/room_ex/v1/RoomNews/get")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomAnnounceInfo>> getAnnounceInfo(@Query("uid") long j, @Query("roomid") int i);

    @GET("/lottery/v1/Storm/appGetAllBeats")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAllBeats>> getAppRoomAllBeats();

    @GET("/lottery/v1/Box/getStatus")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveChestLotteryActivityData>> getAppRoomBoxActivityStatus(@Query("aid") int i);

    @GET("/rc/v1/Title/getTitle")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveTitle>>> getAppUserTitle(@Query("scale") String str);

    @GET("/room/v1/Area/getList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveNewArea.SubArea>>> getAreaListByParentId(@Query("parent_id") int i, @Query("source_id") int i2, @Query("need_entrance") int i3);

    @GET("/rankdb/v1/Common/roomInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAreaRank>> getAreaRankInfo(@Query("ruid") long j, @Query("roomid") int i);

    @GET("/room/v3/Area/getRoomList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAreaPage>> getAreaRoomList(@Query("parent_area_id") int i, @Query("cate_id") int i2, @Query("area_id") int i3, @Query("sort_type") String str, @Query("page") int i4, @Query("page_size") int i5, @Query("tag_version") int i6);

    @GET("/xlive/app-interface/v1/relation/liveAnchor")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAttention>> getAttentonList(@Query("sortRule") int i, @Query("filterRule") int i2, @Query("quality") int i3);

    @GET("/live_user/v1/card/card_up")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUpCard>> getAuthorCardInfo(@Query("uid") long j);

    @GET("/lottery/v1/Award/award_list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAwardList>> getAwardList(@Query("page") int i);

    @GET("/live_user/v1/BarrageSetting/get")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBarrageSetting>> getBarrageSetting(@Query("roomid") int i);

    @GET("/room/v1/Area/getOtherSourceRoomList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveV2>>> getBiliStarShowList(@Query("source_type") String str, @Query("page") int i, @Query("page_size") int i2);

    @GET("/lottery/v2/Box/getActivity")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveLotteryBoxInfo>> getBlsLotteryInfo(@Query("room_id") int i);

    @GET("/lottery/v2/Box/getResult")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBoxLotteryResult>> getBlsLotteryResult(@Query("room_id") int i, @Query("aid") int i2);

    @GET("/lottery/v1/Capsule/getUserInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveCapsuleUserInfo>> getCapsuleUserInfo();

    @GET("/live_user/v1/Guard/renewCenter")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<LiveGuardRenew>> getCenterGuardActiveList(@Query("page") int i, @Query("page_size") int i2);

    @GET("/live_user/v1/Guard/reopenCenter")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<LiveGuardRenew>> getCenterGuardExpiredList(@Query("page") int i, @Query("page_size") int i2);

    @GET("/userext/v2/DanmuConf/danmakuConfig")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveDanmakuConfig>> getDanmakuConfig(@Query("roomid") int i);

    @GET("/gift/v2/gift/discount_gift_list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveDiscountGift>> getDiscountGiftList(@Query("ruid") long j, @Query("roomid") int i, @Query("area_v2_parent_id") int i2, @Query("area_v2_id") int i3);

    @GET("/pay/v1/Exchange/getRule")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveExchangeRule>> getExchangeRule();

    @GET("/fans_medal/v2/fans_medal/verify_qualification")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> getFansMedalQualification(@Query("uid") long j, @Query("target_id") long j2, @Query("source") int i);

    @GET("/live_user/v1/UserSetting/get_fav_tag")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveFavTag>> getFavTag();

    @GET("/lottery/v1/SilverBox/getAward")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveSilverAward>> getFreeSilverAward(@Query("time_start") long j, @Query("time_end") long j2);

    @GET("/lottery/v1/SilverBox/getCurrentTask")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<LiveRoomLotteryInfo.SilverBox>> getFreeSilverCurrentTask();

    @GET("/gift/v3/live/gift_config")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveGiftConfig>>> getGiftConfig(@Query("roomid") int i, @Query("area_v2_parent_id") int i2, @Query("area_v2_id") int i3);

    @GET("/rankdb/v1/Common/appSpecialRank")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveGiftRank>> getGiftPanelRank(@Query("roomid") int i, @Query("ruid") long j, @Query("area_v2_parent_id") int i2, @Query("area_v2_id") int i3);

    @GET("/pay/v1/Guard/showGuardOrderInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveGuardOrderInfo>> getGuardOrderInfo(@Query("ruid") long j);

    @GET("/live_user/v1/Guard/topList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveGuardTopList>> getGuardTopList(@Query("ruid") long j, @Query("page") int i, @Query("page_size") int i2);

    @GET("/room/v3/Area/getHeroList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<HeroTag>> getHeroList(@Query("tag_id") int i);

    @GET("/rc/v1/Glory/get_visible")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveUpHonorWallInfo>>> getHonorWallInfo(@Query("uid") long j);

    @GET("/xlive/app-room/v1/index/getInfoByRoom")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomInfo>> getInfoByRoom(@Query("room_id") int i);

    @GET("/xlive/app-room/v1/index/getInfoByUser")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomUserInfo>> getInfoByUser(@Query("room_id") int i);

    @GET("/room/v1/AppIndex/getAreas")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveArea>>> getLiveAreas(@Query("scale") String str);

    @GET("/xlive/app-room/v1/banner/getBanner")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveBannerItem>>> getLiveBanner(@Query("type") String str);

    @GET("/lottery/v1/Box/getRoomActivityByRoomid")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBoxActivity>> getLiveBoxActivity(@Query("roomid") int i);

    @GET("/lottery/v1/Box/getStatus")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveboxStatus>> getLiveBoxActivityStatus(@Query("aid") int i);

    @GET("/lottery/v1/Box/getWinnerGroupInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBoxWinnerInfo>> getLiveBoxWinnerGroupInfo(@Query("aid") int i, @Query("number") int i2);

    @GET("/lottery/v1/Award/getMsg")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveCenterRedPointInfo>> getLiveCenterRedPointInfo();

    @GET("http://app.bilibili.com/x/v2/history/liveList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveHistoryItem>>> getLiveHistoryList(@Query("pn") int i, @Query("ps") int i2);

    @GET("/xlive/app-interface/v2/index/change")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveHomePage.ModuleRooms>> getLiveHomeModuleData(@Query("module_id") int i, @Query("attention_room_id") String str, @Query("page") int i2, @Query("quality") int i3);

    @GET("/xlive/app-interface/v2/index/getAllList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveHomePage>> getLiveHomePageData(@Query("relation_page") int i, @Query("rec_page") int i2, @Query("scale") String str, @Query("quality") int i3);

    @GET("/relation/v1/App/LivePush")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAttentionAnchor>> getLivePushes(@Query("page") int i, @Query("pagesize") int i2);

//    @GET("/room/v1/RoomRecommend/getPlayerList")
//    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
//    Observable<GeneralResponse<BiliLiveRecommendList>> getLiveRecommend(@Query("area_v2_id") int i, @Query("roomid") int i2, @Query("is_new") int i3);

    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @Deprecated
    @GET("/room/v1/Room/isPortrait")
    Observable<GeneralResponse<BiliLiveRoomMode>> getLiveRoomMode(@Query("room_id") int i);

    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
//    @CacheControl(30000)
    @GET("/room/v2/Room/mobileTab")
    Observable<GeneralResponse<List<BiliLiveRoomTabInfo>>> getLiveRoomTabInfoV2(@Query("roomid") int i);

    @GET("/live_user/v1/Master/info")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUpInfo>> getLiveRoomUpInfo(@Query("uid") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/gift/v4/smalltv/getAward")
    Observable<GeneralResponse<BiliLiveLotteryResult>> getLotteryAward(@Field("roomid") int i, @Field("raffleId") int i2, @Field("type") String str);

    @GET("/xlive/lottery-interface/v1/lottery/getLotteryInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<LiveRoomLotteryInfo>> getLotteryInfo(@Query("roomid") int i);

    @GET("/gift/v3/smalltv/notice")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveLotteryResult>> getLotteryResult(@Query("raffleId") int i, @Query("type") String str);

    @GET("/gift/v1/LuckGift/getLuckText")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveLuckGiftText>> getLuckGiftText(@Query("gift_id") int i, @Query("roomid") int i2);

    @GET("/fans_medal/v2/FansMedal/curr_medal")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveCurrMedalInfo>> getMedalCardInfo(@Query("uid") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/fans_medal/v2/medal/get")
    Observable<GeneralResponse<BiliLiveUpMedalInfo>> getMedalInfo(@Field("uid") long j, @Field("source") int i);

    @GET("/fans_medal/v1/FansMedal/get_list_in_room")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<ArrayList<BiliLiveRoomMedal>>> getMedalListInRoom(@Query("uid") long j, @Query("target_id") long j2);

    @GET("/activity/v1/Common/mobileActivityRankV2")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveActivityRank>> getMobileActivityRank(@Query("roomid") int i, @Query("ruid") long j, @Query("rank_name") String str, @Query("page") int i2, @Query("scale") String str2);

    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @Deprecated
    @GET("/rankdb/v2/RoomRank/mobileDayRank")
    Observable<GeneralResponse<BiliLiveDayRank>> getMobileDayRank(@Query("roomid") int i, @Query("ruid") long j, @Query("page") int i2);

    @GET("/rankdb/v2/RoomRank/mobileMedalRank")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveMedalRank>> getMobileMedalRank(@Query("roomid") int i, @Query("ruid") long j, @Query("page") int i2);

    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @Deprecated
    @GET("/rankdb/v2/RoomRank/mobileSevenRank")
    Observable<GeneralResponse<BiliLiveDayRank>> getMobileSevenRank(@Query("roomid") int i, @Query("ruid") long j, @Query("page") int i2);

    @GET("/rankdb/v1/RoomRank/tabRanks")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveMobileRank>> getMobileTabRanks(@Query("room_id") int i, @Query("ruid") long j, @Query("next_offset") int i2, @Query("rank_type") String str);

    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @Deprecated
    @GET("/relation/v1/Push/AppFeed_index")
    Observable<GeneralResponse<BiliLiveAttentionAnchor>> getMyAttentions(@Query("page") int i, @Query("pagesize") int i2, @Query("type") int i3);

    @GET("/fans_medal/v2/HighQps/received_medals")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveMyMedals>> getMyMedals(@Query("uid") long j);

    @GET("/pay/v2/Pay/myWallet")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveWallet>> getMyWallet(@Query("need_bp") int i);

    @GET("/userext/v1/RedAlarm/view")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<RedAlarm>>> getOrUpdateRedAlarm(@Query("module") String str, @Query("erase") int i);

    @GET("/av/v1/PayLive/getInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLivePayLiveInfo>> getPayLiveInfo(@Query("room_id") int i);

    @GET("/gift/v3/live/pay_record")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLivePayRecord>> getPayRecord(@Query("coin_type") String str, @Query("page_size") int i);

    @GET("/gift/v3/live/pay_record")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLivePayRecord>> getPayRecord(@Query("coin_type") String str, @Query("page_size") int i, @QueryMap Map<String, String> map);

    @GET("/av/v1/Pk/getInfoById")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomPkInfo>> getPkBasicInfo(@Query("room_id") int i, @Query("is_anchor") int i2);

//    @GET("/av/v1/Pk/result")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
//    Observable<GeneralResponse<PKSettleEntity>> getPkSettleResult(@Query("pk_id") int i, @Query("need_info") int i2, @Query("room_id") int i3);

    @FormUrlEncoded
//    @RequestInterceptor(ewg.class)
    @POST("/av/v1/Time/getTimestamp")
    Observable<GeneralResponse<BiliLivePkTimeStamp>> getPkTimeStamp(@Field("ts") long j, @Field("platform") String str, @Field("sign") String str2);

    @GET("/xlive/app-room/v1/gift/bag_list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLivePackageData>> getPlayerBag();

    @GET("/gift/v2/live/m_receive_daily_bag")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveReceiveGift>>> getReceiveBags();

    @GET("/activity/v1/Recharge/getOpenInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRechargeStatusData>> getRechargeStatus(@Query("roomid") int i);

    @GET("/room/v1/Area/getRecList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveNewArea.SubArea>>> getRecommendAreaList();

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/relation/v1/Feed/isFollowed")
    Observable<GeneralResponse<BiliLiveRelation>> getRelation(@Field("follow") long j);

    @GET("/room/v1/RoomRecommend/getRelativeList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<ArrayList<BiliLiveHomePage.Card>>> getRelativeRecommend(@Query("area_v2_id") int i, @Query("page") int i2, @Query("page_size") int i3);

    @GET("/xlive/app-room/v1/propMailbox/list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRenewCardInBox>> getRenewCardInBoxList(@Query("page") int i, @Query("page_size") int i2);

    @GET("/xlive/app-room/v1/userRenewCard/logs")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRenewCardLog>> getRenewCardLogs(@Query("page") int i);

    @GET("/xlive/app-room/v1/userRenewCard/get_with_title")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRenewTitleList>> getRenewalCardWidthTitle(@Query("title_id") String str);

    @GET("/lottery/v1/Box/getDrawRewardByType")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveChestLotteryRewardInfo>> getRewardInfo(@Query("aid") int i, @Query("number") int i2);

    @GET("/lottery/v1/Storm/getMyBeats")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRhythmData>> getRhythmDanmuList();

    @GET("/xlive/app-interface/v1/config/getConf")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomAttention>> getRoomAttentionConfig(@Query("key") String str);

    @GET("/room/v1/Room/getBannedInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBannedInfo>> getRoomBannedInfo(@Query("roomid") int i);

    @GET("/activity/v1/Common/mobileRoomBanner")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomBanner>> getRoomBannerInfo(@Query("roomid") int i, @Query("ruid") long j, @Query("area_v2_id") int i2, @Query("area_v2_parent_id") int i3);

    @GET("/room/v1/Room/get_info")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomBasicInfo>> getRoomBasicInfo(@Query("id") int i, @Query("from") String str);

    @GET("/room/v1/Danmu/getConf")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomDanmuConfig>> getRoomDanmuConfigV2(@Query("room_id") int i);

    @GET("/activity/v1/UnionFans/roomFansRank")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveRoomFansRank>>> getRoomFansRank(@Query("roomid") int i);

    @GET("/activity/v1/UnionFans/fightRank")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomFansFight>> getRoomFightRank(@Query("roomid") int i);

    @GET("/gift/v2/live/m_room_gift_list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveProp>>> getRoomGiftList(@Query("roomid") int i, @Query("area_v2_id") int i2);

    @GET("/gift/v3/live/room_gift_list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomGift>> getRoomGiftListV3(@Query("roomid") int i, @Query("area_v2_parent_id") int i2, @Query("area_v2_id") int i3);

    @GET("/xlive/app-room/v1/dM/gethistory")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomHistoryMsg>> getRoomHistoryMsg(@Query("room_id") int i);

    @GET("/room/v1/Room/mobileRoomInit")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomInit>> getRoomInitInfo(@Query("id") int i);

    @GET("/room/v1/Area/getRoomList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveV2>>> getRoomList(@Query("parent_area_id") int i, @Query("cate_id") int i2, @Query("area_id") int i3, @Query("sort_type") String str, @Query("page") int i4, @Query("page_size") int i5);

    @GET("/rankdb/v1/Common/roomRank")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomRankInfo>> getRoomOperationRank(@Query("roomid") int i, @Query("ruid") long j, @Query("area_v2_parent_id") int i2, @Query("area_v2_id") int i3);

    @GET("/xlive/app-room/v1/index/getDanmuInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveSocketConfig>> getRoomSocketConfigV3(@Query("room_id") long j);

    @GET("/live/getRoundPlayVideo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomRoundVideoInfo>> getRoundPlayVideo(@Query("room_id") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v1/Award/award_receive")
    Observable<GeneralResponse<BiliLiveAward>> getSeaAwardsInfoByRoomId(@Field("id") int i, @Field("room_id") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v1/Award/award_receive")
    Observable<GeneralResponse<BiliLiveAward>> getSeaAwardsInfoByUid(@Field("id") int i, @Field("uid") long j);

    @GET("/gift/v2/live/m_daily_bag_status")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveSendDaily>> getSendDaily();

    @GET("/pay/v1/Guard/showShipTickets")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveShipTicket>> getShipTickets(@Query("ruid") long j, @Query("type") int i, @Query("guard_level") int i2, @Query("num") int i3, @Query("data_behavior_id") String str, @Query("data_source_id") String str2, @Query("jumpfrom") String str3, @Query("visit_id") String str4, @Query("click_id") String str5);

    @GET("/rc/v2/Sign/getSignInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveCenterSignInfo>> getSignInfoV2();

//    @GET("/banned_service/v1/Silent/get_block_time")
//    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
//    Observable<GeneralResponse<ArrayList<BiliLiveSilentPeriodInfo>>> getSilentPeriod();

    @GET("/room/v1/Skin/info")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRoomSkinInfo>> getSkinInfo(@Query("skin_platform") String str, @Query("skin_version") String str2, @Query("id") int i);

    @GET("/room/v1/Skin/list")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveRoomSkinInfo>>> getSkinList(@Query("skin_platform") String str, @Query("skin_version") String str2);

    @GET("/relation/v1/App/getViewConfig")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAttentionConfig>> getSortFilterConfig();

    @GET("/rankdb/v1/Rank2018/getRecommendList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveStarAnchor>>> getStarAnchors();

    @GET("/xlive/app-ucenter/v1/room/GetInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveStreamRoomInfo>> getStreamRoomInfo(@Query("uId") long j);

    @GET("/room_ex/v1/Danmu/forDanmuReason")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<ArrayList<BiliLiveTipOffReason>>> getTipOffReasons();

    @GET("/rc/v1/UserTitle/titleForMerge")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserTitleDetailData>> getTitleDetail(@Query("title") String str);

    @GET("/user/v2/TitleStuff/get")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveTitleMaterial>>> getTitleMaterials(@Query("uid") long j);

    @GET("/xlive/app-interface/v1/relation/unliveAnchor")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveAttentionClose>> getUnLiveRooms(@Query("page") int i, @Query("pagesize") int i2);

    @GET("/xlive/app-room/v1/userRenewCard/searchUid")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUname>> getUnameByUid(@Query("uid") long j);

    @GET("/bili-api/x/internal/v2/archive/up/count")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUpVideoItem.VideoCount>> getUpVideoCount(@Query("mid") long j);

    @GET("/bili-api/x/internal/v2/archive/up/passed")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<List<BiliLiveUpVideoItem>>> getUpVideos(@Query("mid") long j, @Query("pn") int i, @Query("ps") int i2);

    @GET("/live_user/v1/card/card_user")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserCard>> getUserCardInfo(@Query("uid") long j, @Query("ruid") long j2);

    @GET("/live_user/v1/UserInfo/get_user_extra_info")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserExtraInfo>> getUserExtraInfo(@Query("room_id") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/heartbeat/v1/OnLine/mobileOnline")
    Observable<GeneralResponse<BiliLiveActivityReceiveInfo>> getUserOnlineHeart(@Field("room_id") long j, @Field("scale") String str);

    @GET("/live_user/v1/UserInfo/get_mobile_user")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserSeed>> getUserSeeds();

    @POST("/live_user/v1/UserInfo/my_info")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveCenterUserSeeds>> getUserSeeds2();

//    @GET("/rc/v1/UserTitle/getMyTitles")
//    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
//    Observable<GeneralResponse<BiliLiveCenterTitleData>> getUserTitleList();

    @GET("/rc/v1/UserTitle/getWearTitle")
    @Headers("RequestInterceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserWearedTitleData>> getUserWearedTitleDetail();

    @GET("/pay/v1/Proxy/showVipInfo")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<LiveVipExpireInfo>> getVipExpireInfo();

    @GET("/fans_medal/v2/HighQps/check_live_weared")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUserMedalInfo>> getWearedMedal(@Query("uid") long j, @Query("up_uid") long j2);

    @GET("/live_user/v2/WishBottle/wishList")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<WishBottleUserSide>> getWishBottleList(@Query("ruid") long j);

    @GET("/live_user/v1/Guard/hasGuard")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveHasGuard>> hasGuard(@Query("uid") long j);

    @GET("/av/v1/PayLive/buyValidate")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Void>> isBuyPayLiveValidate(@Query("goods_id") int i);

    @GET("/av/v1/PayLive/liveValidate")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLivePayLiveValidate>> isPayLiveValidate(@Query("room_id") int i);

    @GET("/activity/v1/UnionFans/checkRoomFighting")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveFightStatus>> isRoomFighting(@Query("roomid") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v2/Lottery/join")
    Observable<GeneralResponse<BiliLiveGuardLotteryResult>> joinGuardLottery(@Field("roomid") int i, @Field("type") String str, @Field("id") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/gift/v3/smalltv/join")
    Observable<GeneralResponse<BiliLiveLotteryInfo.Lottery>> joinLotteryInfo(@Field("roomid") int i, @Field("raffleId") int i2, @Field("type") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v1/Storm/join")
    Observable<GeneralResponse<BiliLiveJoinStormBeats>> joinStormBeatsGift(@Field("id") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/room/v1/Room/report")
    Observable<GeneralResponse<List>> liveRoomReport(@Field("room_id") int i, @Field("picUrl") String str, @Field("reason") String str2);

    @GET("/xlive/app-room/v1/gift/NeedTipRecharge")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveRechargeTips>> needTipRecharge(@Query("from") int i, @Query("needGold") int i2);

    @GET("/xlive/app-room/v1/roomNotice/buy_guard")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveBuyGuardNotice>> noticeBuyGuard(@Query("uid") long j, @Query("target_id") long j2);

//    @Timeout(conn = 4000)
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @GET
    Observable<GeneralResponse<Void>> noticeCardCallback(@Url String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/pay/v2/Pay/buyGold")
    Observable<GeneralResponse<BiliLivePayGold>> payBuyGold(@Field("coin_num") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/pay/v1/Guard/payGold")
    Observable<GeneralResponse<Object>> payGold(@Field("ruid") long j, @Field("guard_level") int i, @Field("num") int i2, @Field("token") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/xlive/app-ucenter/v1/roomAdmin/appoint")
    Observable<GeneralResponse<BiliLiveRoomAdminInfo>> postAddRoomAdmin(@Field("uid") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/room_ex/v1/Danmu/danmuReport")
    Observable<GeneralResponse<Object>> postDanmuReport(@Field("roomid") int i, @Field("uid") long j, @Field("msg") String str, @Field("reason") String str2, @Field("reason_id") int i2, @Field("danmaku_ts") long j2, @Field("danmaku_sign") String str3);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/xlive/app-ucenter/v1/activity/subscription")
    Observable<GeneralResponse<BiliLiveHomePage.Card>> postHomeSubscription(@Field("aid") long j, @Field("type") int i, @Field("status") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/xlive/app-ucenter/v1/roomAdmin/dismiss")
    Observable<GeneralResponse<BiliLiveRoomAdminInfo>> postRemoveRoomAdmin(@Field("uid") long j);

    @FormUrlEncoded
//    @RequestInterceptor(ewg.class)
    @POST("http://space.bilibili.com/api/report/add")
    Observable<GeneralResponse<String>> postTipOffPhotoOrName(@Field("mid") long j, @Field("reason") String str, @Field("access_key") String str2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/banned_service/v1/Silent/room_block_user")
    Observable<GeneralResponse<BiliLiveSilentUser>> postUserSilent(@Field("roomid") int i, @Field("content") String str, @Field("type") int i2, @Field("hour") float f, @Field("msg") String str2, @Field("msg_time") long j);

    @GET("/pay/v1/Proxy/quickPay")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveQuickPay>> quickPay(@Query("bpNum") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/fans_medal/v1/medal/rename")
    Observable<GeneralResponse<Void>> renameMedal(@Field("uid") long j, @Field("medal_name") String str, @Field("source") int i);

    @GET("/banned_service/v1/Silent/del_block_by_uid")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<String>> rmUserSilent(@Query("roomid") int i, @Query("uid") long j, @Query("type") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/room/v1/Room/room_entry_action")
    Observable<GeneralResponse<Void>> roomEntryAction(@Field("room_id") int i, @Field("platform") String str, @Field("jumpFrom") int i2);

    @GET("/room/v3/Area/saveMyHero")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Void>> saveMyHero(@Query("tag_id") int i, @Query("hero_id") int i2);

    @GET("http://app.bilibili.com/x/v2/search/live")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveMasterSearchResult>> searchMaster(@Query("type") int i, @Query("keyword") String str, @Query("pn") int i2, @Query("ps") int i3, @Query("order") String str2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/gift/v2/live/bag_send")
    Observable<GeneralResponse<String>> sendBags(@Field("uid") long j, @Field("ruid") long j2, @Field("gift_id") int i, @Field("gift_num") long j3, @Field("bag_id") long j4, @Field("biz_id") long j5, @Field("storm_beat_id") String str, @Field("rnd") String str2, @Field("biz_code") String str3, @Field("data_behavior_id") String str4, @Field("data_source_id") String str5, @Field("jumpfrom") int i2, @Field("version") String str6, @Field("click_id") String str7, @Field("session_id") String str8);

    @FormUrlEncoded
//    @RequestInterceptor(brs.class)
    @POST("/xlive/app-room/v1/dM/sendmsg")
    Observable<GeneralResponse<String>> sendDanmaku(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/gift/v2/live/send")
    Observable<GeneralResponse<String>> sendGift(@Field("uid") long j, @Field("ruid") long j2, @Field("gift_id") int i, @Field("gift_num") long j3, @Field("coin_type") String str, @Field("biz_id") long j4, @Field("storm_beat_id") String str2, @Field("rnd") int i2, @Field("biz_code") String str3, @Field("data_behavior_id") String str4, @Field("data_source_id") String str5, @Field("jumpfrom") int i3, @Field("price") long j5, @Field("visit_id") String str6, @Field("version") String str7, @Field("click_id") String str8, @Field("session_id") String str9);

    @GET("/xlive/app-room/v1/userRenewCard/send")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<JSONObject>> sendTitleRenewCard(@Query("card_record_id") int i, @Query("recv_uid") Long l, @Query("num") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/live_user/v1/BarrageSetting/set")
    Observable<GeneralResponse<BiliLiveV2>> setBarrageSetting(@FieldMap Map<String, Integer> map);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/fans_medal/v1/medal/open")
    Observable<GeneralResponse<Void>> setFansMedal(@Field("uid") long j, @Field("medal_name") String str, @Field("source") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/live_user/v1/UserSetting/set_fav_tag")
    Observable<GeneralResponse<Object>> setFavTag(@Field("tags") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/push/v1/PushSwitch/setTotalPush")
    Observable<GeneralResponse<Object>> setLiveMainPush(@Field("type") int i, @Field("switch") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/push/v1/PushSwitch/setPush")
    Observable<GeneralResponse<Object>> setLivePush(@Field("type") int i, @Field("switch") int i2, @Field("target_id") long j);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/live_user/v1/UserSetting/set_vip_status")
    Observable<GeneralResponse<List>> setVipViewStatus(@Field("status") int i);

    @GET("/activity/v1/Common/shareCallback")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> shareCallback(@Query("sharing_plat") String str, @Query("roomid") int i, @Query("share_sign") String str2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v1/Storm/setMyBeats")
    Observable<GeneralResponse<BiliLiveRhythmData>> submitRhythmDanmu(@Field("id") String str, @Field("content") String str2);

    @GET("/userext/v1/Remind/operate")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Object>> subscribeActivity(@Query("aid") int i, @Query("action") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/xlive/app-room/v1/gift/TipRechargeAction")
    Observable<GeneralResponse<Object>> tipRechargeAction(@Field("from") int i, @Field("action") int i2);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/relation/v1/Feed/unfollow")
    Observable<GeneralResponse<List>> unFollowUp(@Field("follow") long j, @Field("re_src") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/room_ex/v1/RoomNews/update")
    Observable<GeneralResponse<Object>> updateAnnounceInfo(@Field("uid") long j, @Field("roomid") int i, @Field("content") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/lottery/v1/Award/award_receive")
    Observable<GeneralResponse<Void>> uploadAwardsInfo(@FieldMap Map<String, Object> map);

    @GET("/xlive/app-room/v1/propMailbox/use")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<Void>> useRenewalCardInMail(@Query("mail_id") int i);

    @GET("/xlive/app-room/v1/userRenewCard/use")
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    Observable<GeneralResponse<BiliLiveUseRenewCard>> useTitleRenewalCard(@Query("card_record_id") int i, @Query("num") int i2, @Query("title_id") String str);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/fans_medal/v1/fans_medal/wear_medal")
    Observable<GeneralResponse<List>> wearMedal(@Field("medal_id") int i);

    @FormUrlEncoded
    @Headers("Interceptor:"+C9909b.CLASSNAME)
//    @RequestInterceptor(C9909b.class)
    @POST("/rc/v1/UserTitle/wearTitle")
    Observable<GeneralResponse<List>> wearTitle(@Field("title") String str);
}
