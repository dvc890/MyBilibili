package com.dvc.mybilibili.mvp.model.api.service.bangumi;

import com.alibaba.fastjson.JSONObject;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.bangumi.api.d */
public interface BangumiPendantApiService {
    @FormUrlEncoded
    @POST("/x/member/app/pendant/equip?status=2")
    Observable<GeneralResponse<JSONObject>> equipPendant(@Field("access_key") String str, @Field("pid") String str2);
}
