package com.dvc.mybilibili.mvp.model.api.service.passport;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.utils.ParamsMap;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.*;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.*;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@Keep
@BaseUrl("https://passport.bilibili.com")
/* compiled from: BL */
public interface BiliAuthService {

    /* compiled from: BL */
    public static class CookieParamsMap extends ParamsMap {
        public CookieParamsMap(@NonNull List<CookieInfo.C2206a> list) {
            super(list.size());
            for (CookieInfo.C2206a c2206a : list) {
                putParams(c2206a.name, c2206a.value);
            }
        }
    }

    @FormUrlEncoded
    @POST("/api/login/getLoginInfo")
    Observable<GeneralResponse<QRAuthCode>> QRAuthCode(@Field("oauthKey") String str);

    @GET("/qrcode/getLoginUrl")
    Observable<JSONObject> QRAuthUrl();

    @GET("/api/oauth2/accessToken?grant_type=authorization_code")
    Observable<GeneralResponse<AccessToken>> QRSign(@Query("code") String str);

    //code 就是检验页面返回的ticket  grant_type="authorization_code"
    @GET("/api/v2/oauth2/access_token")
    Observable<GeneralResponse<LoginInfo>> acquireAccessToken(@Query("code") String code, @Query("grant_type") String grant_type);

    @FormUrlEncoded
    @POST("/api/oauth2/authorizeByApp")
    Observable<GeneralResponse<AuthorizeCode>> authorizeByApp(@Field("access_token") String str, @Field("target_subid") String str2, @Field("target_appkey") String str3, @Field("package") String str4, @Field("signature") String str5);

    @GET("/api/member/bindPhone")
    Observable<GeneralResponse<Void>> bindPhone(@Query("tel") String str, @Query("country_id") String str2, @Query("captcha") String str3, @Query("access_key") String access_key4);

    @GET("/api/reg/checkTel")
    Observable<GeneralResponse<Void>> checkPhoneNumber(@Query("tel") String str, @Query("country_id") String str2);

    @POST("/api/oauth2/getKey")
    Observable<GeneralResponse<AuthKey>> getKey();

    @FormUrlEncoded
    @POST("/api/v3/oauth2/login")
    Observable<GeneralResponse<LoginInfo>> loginV3(@Field("username") String username, @Field("password") String password, @FieldMap Map<String, String> map);

    @GET("/api/v3/oauth2/info")
    Observable<GeneralResponse<OAuthInfo>> oauthInfo(@Query("access_token") String str, @QueryMap CookieParamsMap cookieParamsMap);

    @FormUrlEncoded
    @POST("/api/v2/oauth2/refresh_token")
    Observable<GeneralResponse<LoginInfo>> refreshToken(@Field("access_token") String access_token, @Field("refresh_token") String refresh_token, @FieldMap CookieParamsMap cookieParamsMap);

    @FormUrlEncoded
    @POST("/api/reg/byTel")
    Observable<GeneralResponse<C2208c>> registerByTel(@Field("tel") String str, @Field("uname") String str2, @Field("userpwd") String str3, @Field("country_id") String str4, @Field("captcha") String str5, @Field("login") boolean z);

    @GET("/api/member/reset")
    Observable<GeneralResponse<C2208c>> resetPassword(@Query("tel") String str, @Query("pwd") String str2, @Query("captcha") String str3, @Query("login") boolean z);

    @GET("/api/sms/sendCaptcha")
    Observable<GeneralResponse<Void>> sendSMSCaptcha(@Query("tel") String str, @Query("country_id") String str2, @Query("reset_pwd") int i, @Query("captcha") String str3);

    @FormUrlEncoded
    @POST("/api/oauth2/login")
    @Deprecated
    Observable<GeneralResponse<AccessToken>> signIn(@Field("username") String username, @Field("password") String password, @Field("captcha") String captcha);

    @FormUrlEncoded
    @POST("/api/v2/oauth2/login")
    Observable<GeneralResponse<LoginInfo>> signInWithVerify(@Field("username") String username, @Field("password") String password, @Field("captcha") String captcha);

    @FormUrlEncoded
    @POST("/api/v2/oauth2/revoke")
    Observable<GeneralResponse<Void>> signOut(@Field("access_token") String str, @FieldMap CookieParamsMap cookieParamsMap);

    @FormUrlEncoded
    @POST("/api/v2/oauth2/revoke")
    Observable<GeneralResponse<Void>> signOut(@Field("access_token") String str, @FieldMap CookieParamsMap cookieParamsMap, @Field("revoke_api") String str2);

    @GET("/api/sms/checkCaptcha")
    Observable<GeneralResponse<Void>> verifyCaptcha(@Query("tel") String str, @Query("country_id") String str2, @Query("reset_pwd") int i, @Query("captcha") String str3);
}
