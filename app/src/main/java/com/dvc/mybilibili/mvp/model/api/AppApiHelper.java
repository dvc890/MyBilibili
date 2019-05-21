package com.dvc.mybilibili.mvp.model.api;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.net.AppNetWorkStatusManager;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.api.cache.CacheProviders;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.account.AccountInfoApiService;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.category.RegionApiService;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryIndex;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexService;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexV1Service;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.AppIndex;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.dvc.mybilibili.mvp.model.api.service.splash.BiliSplashApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;
import com.dvc.mybilibili.player.IjkCodecHelper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.rx_cache2.EvictProvider;

@Singleton
public class AppApiHelper implements ApiHelper {

    private final Context context;
    private final CacheProviders cacheProviders;
    private final BiliSplashApiV2Service biliSplashApiV2Service;
    private final AccountInfoApiService accountInfoApiService;
    private final TMFeedIndexService tmFeedIndexService;
    private final TMFeedIndexV1Service tmFeedIndexV1Service;
    private final RegionApiService regionApiService;

    @Inject
    public AppApiHelper(@ApplicationContext Context context, CacheProviders cacheProviders,
                        BiliSplashApiV2Service biliSplashApiV2Service,
                        AccountInfoApiService accountInfoApiService,
                        TMFeedIndexService tmFeedIndexService,
                        TMFeedIndexV1Service tmFeedIndexV1Service,
                        RegionApiService regionApiService) {
        this.context = context;
        this.cacheProviders = cacheProviders;
        this.biliSplashApiV2Service = biliSplashApiV2Service;
        this.accountInfoApiService = accountInfoApiService;
        this.tmFeedIndexService = tmFeedIndexService;
        this.tmFeedIndexV1Service = tmFeedIndexV1Service;
        this.regionApiService = regionApiService;
    }

    @Override
    @Deprecated
    public Observable<SampleSplash> getSplashV2() {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return this.biliSplashApiV2Service.getSplash(
                Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels),
                Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels))
                .map(s->{
                    if(!s.isSuccess())
                        throw new BiliApiException(s.getCode());
                    return s.getData().get(0);
                });
    }

    @Override
    public Observable<SplashData> getSplashListV2(boolean cleanCache, String access_key, String birth) {
        String ad_extra = "";
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Observable<SplashData> getSplashListV2 = this.biliSplashApiV2Service.getSplashList(access_key,
                Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels),
                Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels),
                birth, ad_extra)
                .map(s->{
                    if(!s.isSuccess())
                        throw new BiliApiException(s.code);
                    return s.data;
                });
        return cacheProviders.getSplashList(getSplashListV2, new EvictProvider(cleanCache))
                .map(splashDataReply -> splashDataReply.getData());
    }

    @Override
    public Observable<AccountInfo> getAccountInfo(String access_key) {
        return this.accountInfoApiService.getAccountInfo(access_key)
//                .filter(accountInfoGeneralResponse -> accountInfoGeneralResponse.isSuccess())
                .map(accountInfoGeneralResponse-> {
                    if(!accountInfoGeneralResponse.isSuccess())
                        throw new BiliApiException(accountInfoGeneralResponse.code);
                    return accountInfoGeneralResponse.data;
                });
    }

    @Override
    @Deprecated
    public Observable<List<AppIndex>> getPegasusFeedIndexList(int idx, boolean pull, int login_event) {
        String open_event = pull?"cold":"";
        String network = BiliApplication.getNetWorkStatusManager().getNetworkStatus()==AppNetWorkStatusManager.NETWORK_STATUS_WIFI?"wifi":"mobile";
        int style = 2;
        String ts = "1499589051";
        return this.tmFeedIndexV1Service.getIndex(idx,login_event,network,open_event,pull,style,ts)
                .map(appIndexDataListResponse -> appIndexDataListResponse.getData());
    }
    /**
     * idx 取之前获取到的PegasusFeedResponse的BasicIndexItem列表的第一个idx
     * login_event 是否登录，登录了：2，未登录：1
     * interest 未知，留空
     * flush 未知，值范围0~5，默认0
     * autoplay_card 默认值0， 可以3，4
     * banner_hash 取之前获取到的PegasusFeedResponse的BasicIndexItem列表的(basicIndexItem instanceof BannerListItem)里面的banner_hash
     * device_type 是否第一次开启app?0:1
     */
    @Override
    public Observable<PegasusFeedResponse> getPegasusFeedIndexListV2(String access_key, int idx, boolean pull, int login_event, String interest, int flush, int autoplay_card, String banner_hash, int device_type) {
        int fourk = IjkCodecHelper.isUhdSupport(IjkCodecHelper.getBestCodecName("video/hevc"))?1:0;
        int force_host = 1;//1:2:0
        int recsys_mode = 1;//1:0
        int column = 2;//0或2的倍数
        int fnval = Build.VERSION.SDK_INT < 19?16:32;
        int fnver = 0;
        String open_event = pull?"cold":"";
        String ad_extra = "";
        String network = BiliApplication.getNetWorkStatusManager().getNetworkStatus()==AppNetWorkStatusManager.NETWORK_STATUS_WIFI?"wifi":"mobile";
        int qn = 16;//16:32即可
        return this.tmFeedIndexService.getIndexList(access_key,idx,pull,network,column,login_event,open_event,banner_hash,qn,interest,ad_extra,flush,autoplay_card,fnval,fnver,fourk,device_type,force_host,recsys_mode)
        .map(pegasusFeedResponseGeneralResponse -> {
            if(!pegasusFeedResponseGeneralResponse.isSuccess())
                throw new BiliApiException(pegasusFeedResponseGeneralResponse.code);
            return pegasusFeedResponseGeneralResponse.data;
        });
    }

    @Override
    public Observable<List<CategoryIndex>> getCategoryIndex(String access_key) {
        return this.regionApiService.getIndex(access_key)
                .map(categoryIndexGeneralResponse->{
                    if(!categoryIndexGeneralResponse.isSuccess())
                        throw new BiliApiException(categoryIndexGeneralResponse.code);
                    return categoryIndexGeneralResponse.data;
                });
    }
}
