package com.dvc.mybilibili.mvp.model.api.service.column;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@BaseUrl("https://api.vc.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.column.api.service.a */
public interface C12092a {
    @FormUrlEncoded
    @POST("/bplus_report/v1/Report/add")
    Observable<GeneralResponse<String>> reportForward(@Field("access_key") String access_key, @Field("biz_code") int i, @Field("module") int i2, @Field("accused_uid") String str2, @Field("object_id") String str3);
}
