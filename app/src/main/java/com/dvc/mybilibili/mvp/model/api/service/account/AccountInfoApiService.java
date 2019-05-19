package com.dvc.mybilibili.mvp.model.api.service.account;
import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("https://app.bilibili.com")
/* compiled from: BL */
/* renamed from: com.bilibili.lib.account.b */
public interface AccountInfoApiService {
    @GET("/x/v2/account/myinfo")
    Observable<GeneralResponse<AccountInfo>> getAccountInfo(@Query("access_key") String str);
}
