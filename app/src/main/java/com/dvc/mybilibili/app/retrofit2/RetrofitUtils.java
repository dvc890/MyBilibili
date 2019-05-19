package com.dvc.mybilibili.app.retrofit2;

import com.dvc.mybilibili.mvp.model.api.service.splash.BiliSplashApiV2Service;

import retrofit2.Retrofit;

public class RetrofitUtils {

    public static <T> T createWithBaseUrl(Retrofit.Builder builder, final Class<T> service) {
        if(service.isAnnotationPresent(BaseUrl.class))
            builder.baseUrl(service.getAnnotation(BaseUrl.class).value());
        return builder.build().create(service);
    }
}
