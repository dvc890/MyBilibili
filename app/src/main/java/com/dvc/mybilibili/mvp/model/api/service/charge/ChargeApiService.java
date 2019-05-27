package com.dvc.mybilibili.mvp.model.api.service.charge;

import android.support.annotation.Nullable;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.ChargeOrderResult;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.ChargeRankResult;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.ChargeTheme;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.PayOrderResponse;
import com.dvc.mybilibili.mvp.model.api.service.charge.interceptor.C16403b;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("http://elec.bilibili.com")
/* compiled from: BL */
public interface ChargeApiService {
    @FormUrlEncoded
    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    @POST("/api/can.support.do")
    Observable<GeneralResponse<ChargeRankResult>> canSupport(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    @POST("/api/add.pay.order.do")
    Observable<GeneralResponse<PayOrderResponse>> createPayOrder(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    @POST("/api/elec.remark.do")
    Observable<GeneralResponse<Void>> elecCommit(@FieldMap Map<String, String> map);

    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    @Deprecated
    @GET("/api/elec.list.do")
    Observable<ChargeTheme> getElecList(@Query("goods_id") int i);

    @GET("/api/query.order.result.do")
    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    Observable<GeneralResponse<ChargeOrderResult>> queryChargeOrderResult(@Nullable @Query("order_no") String str);

    @GET("/api/query.rank.do")
    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
    Observable<GeneralResponse<ChargeRankResult>> queryOrderRank(@QueryMap Map<String, String> map);

    @Headers("Interceptor:"+ C16403b.CLASSNAME)
//    @RequestInterceptor(C16403b.class)
//    @CacheControl(120000)
    @GET("/api/rank/query/av")
    Observable<GeneralResponse<ChargeRankResult>> queryVideoRank(@Query("mid") long j, @Query("av_no") String str);
}
