package com.dvc.mybilibili.di.module;

import com.dvc.mybilibili.app.retrofit2.BaseUrl;
import com.dvc.mybilibili.app.retrofit2.RetrofitUtils;
import com.dvc.mybilibili.app.retrofit2.converterfactory.FastJsonConverterFactory;
import com.dvc.mybilibili.mvp.model.api.baseinterceptor.CommonInterceptor;
import com.dvc.mybilibili.mvp.model.api.service.splash.BiliSplashApiV2Service;
import com.vondear.rxtool.RxLogTool;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiServiceModule {
    private static final String TAG = ApiServiceModule.class.getSimpleName();

    @Singleton
    @Provides
    OkHttpClient providesOkHttpClient(CommonInterceptor commonInterceptor) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(message -> RxLogTool.d(TAG, message));
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(commonInterceptor);
        builder.addInterceptor(logging);
//        //动态url
//        RetrofitUrlManager.getInstance().setGlobalDomain(Api.baseUrl);

        return RetrofitUrlManager.getInstance().with(builder).build();
    }

    @Singleton
    @Provides
    Retrofit.Builder providesRetrofitBuilder(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(FastJsonConverterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
    }

    @Singleton
    @Provides
    BiliSplashApiV2Service providesBiliSplashApiV2Service(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, BiliSplashApiV2Service.class);
    }
}
