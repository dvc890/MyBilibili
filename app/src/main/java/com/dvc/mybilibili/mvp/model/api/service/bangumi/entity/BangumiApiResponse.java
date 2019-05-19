package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;

import retrofit2.HttpException;
import retrofit2.Response;

@Keep
/* compiled from: BL */
public class BangumiApiResponse<T> extends BaseResponse {
    public T result;

    public static <T> T extractResult(Response<BangumiApiResponse<T>> response) throws HttpException, BiliApiException {
        if (response.isSuccessful()) {
            BangumiApiResponse bangumiApiResponse = response.body();
            if (bangumiApiResponse == null) {
                return null;
            }
            if (bangumiApiResponse.code == 0) {
                return (T) bangumiApiResponse.result;
            }
            throw new BiliApiException(bangumiApiResponse.code, bangumiApiResponse.message);
        }
        throw new HttpException(response);
    }
}
