package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiApiResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiOrderResult;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiSponsorResult;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiPayResult;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform.BangumiTicketResult;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveRoomTabInfo;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@BaseUrl("https://bangumi.bilibili.com")
/* compiled from: BL */
public interface BangumiUniformPayApiService {

    /* compiled from: BL */
    public static class SponsorResultParamsMap extends ParamsMap {
        public SponsorResultParamsMap(String str, String str2, int i, String str3, String str4, String str5) {
            super(5);
            putParams("season_type", String.valueOf(i));
            putParams("season_id", str2);
            putParams(BiliLiveRoomTabInfo.TAB_COMMENT, str4);
            putParams("order_id", str3);
            putParams("access_key", str);
            if (!TextUtils.isEmpty(str5)) {
                putParams("pendant_id", str5);
            }
        }
    }

    @FormUrlEncoded
    @POST("/sponsor/api/v2/pay/order/success")
    Observable<BangumiApiResponse<BangumiSponsorResult>> checkOrderForSponsorSeason(@Field("access_key") String access_key, @Field("season_type") int i, @Field("order_id") String str2);

    @FormUrlEncoded
    @POST("/pay/api/to_paid")
    Observable<BangumiApiResponse<BangumiPayResult>> checkUniversePayResult(@Field("access_key") String access_key, @Field("season_type") int i, @Field("order_id") String str2);

    @FormUrlEncoded
    @POST("/sponsor/api/v2/pay/order/create")
    Observable<BangumiApiResponse<BangumiOrderResult>> createOrderForSponsorSeason(@Field("access_key") String access_key, @Field("season_id") String str2, @Field("season_type") int i, @Field("amount") float f);

    @FormUrlEncoded
    @POST("/pay/api/get_create_order_param?platform=android")
    Observable<BangumiApiResponse<JSONObject>> getCreateOrderParam(@Field("access_key") String access_key, @Field("season_id") String str2, @Field("season_type") int i);

    @FormUrlEncoded
    @POST("/pay/api/season/pay_by_ticket?platform=android")
    Observable<BangumiApiResponse<BangumiTicketResult>> payByTicket(@Field("access_key") String access_key, @Field("season_id") String str2, @Field("season_type") int i);

    @FormUrlEncoded
    @POST("/sponsor/api/v2/pay/comment")
    Observable<BangumiApiResponse<JSONObject>> sponsorComment(@FieldMap SponsorResultParamsMap sponsorResultParamsMap);
}
