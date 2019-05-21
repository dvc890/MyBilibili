package com.dvc.mybilibili.di.module;

import com.dvc.mybilibili.app.retrofit2.RetrofitUtils;
import com.dvc.mybilibili.app.retrofit2.converterfactory.FastJsonConverterFactory;
import com.dvc.mybilibili.mvp.model.api.baseinterceptor.CommonInterceptor;
import com.dvc.mybilibili.mvp.model.api.service.account.AccountInfoApiService;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.BangumiApiService;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.HomeApiService;
import com.dvc.mybilibili.mvp.model.api.service.bililive.BiliLiveApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.category.RegionApiService;
import com.dvc.mybilibili.mvp.model.api.service.livestream.LiveStreamApiService;
import com.dvc.mybilibili.mvp.model.api.service.passport.BiliAuthService;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexService;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexV1Service;
import com.dvc.mybilibili.mvp.model.api.service.search.BiliSearchApiService;
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

    @Singleton
    @Provides
    AccountInfoApiService providesAccountInfoApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, AccountInfoApiService.class);
    }

    @Singleton
    @Provides
    TMFeedIndexService providesTMFeedIndexService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, TMFeedIndexService.class);
    }

    @Singleton
    @Provides
    TMFeedIndexV1Service providesTMFeedIndexV1Service(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, TMFeedIndexV1Service.class);
    }

    @Singleton
    @Provides
    BiliLiveApiV2Service providesBiliLiveApiV2Service(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, BiliLiveApiV2Service.class);
    }

    @Singleton
    @Provides
    BiliSearchApiService providesBiliSearchApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, BiliSearchApiService.class);
    }

    @Singleton
    @Provides
    BiliAuthService providesBiliAuthService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, BiliAuthService.class);
    }

    @Singleton
    @Provides
    LiveStreamApiService providesLiveStreamApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, LiveStreamApiService.class);
    }

    @Singleton
    @Provides
    RegionApiService providesRegionApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, RegionApiService.class);
    }

    @Singleton
    @Provides
    HomeApiService providesHomeApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, HomeApiService.class);
    }

    @Singleton
    @Provides
    BangumiApiService providesBangumiApiService(Retrofit.Builder builder) {
        return RetrofitUtils.createWithBaseUrl(builder, BangumiApiService.class);
    }
}
