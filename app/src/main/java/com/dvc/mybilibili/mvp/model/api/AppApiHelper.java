package com.dvc.mybilibili.mvp.model.api;

import android.content.Context;
import android.util.DisplayMetrics;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.net.AppNetWorkStatusManager;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.utils.ParamValueUtils;
import com.dvc.mybilibili.mvp.model.api.cache.CacheProviders;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.account.AccountInfoApiService;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.LoginInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.BiliLiveApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.BiliLiveSocketConfig;
import com.dvc.mybilibili.mvp.model.api.service.category.RegionApiService;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryIndex;
import com.dvc.mybilibili.mvp.model.api.service.charge.ChargeApiService;
import com.dvc.mybilibili.mvp.model.api.service.column.ColumnApiService;
import com.dvc.mybilibili.mvp.model.api.service.comment.BiliCommentApiService;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentCursorList;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentDetail;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentDialogue;
import com.dvc.mybilibili.mvp.model.api.service.passport.BiliAuthService;
import com.dvc.mybilibili.mvp.model.api.service.passport.entity.AuthKey;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexService;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.TMFeedIndexV1Service;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.AppIndex;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.dvc.mybilibili.mvp.model.api.service.space.BiliSpaceApiService;
import com.dvc.mybilibili.mvp.model.api.service.splash.BiliSplashApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;
import com.dvc.mybilibili.mvp.model.api.service.video.VideoApiService;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private final BiliAuthService biliAuthService;
    private final VideoApiService videoApiService;
    private final ChargeApiService chargeApiService;
    private final ColumnApiService columnApiService;
    private final BiliCommentApiService biliCommentApiService;
    private final BiliSpaceApiService biliSpaceApiService;
    private final BiliLiveApiV2Service biliLiveApiV2Service;

    @Inject
    public AppApiHelper(@ApplicationContext Context context, CacheProviders cacheProviders,
                        BiliSplashApiV2Service biliSplashApiV2Service,
                        AccountInfoApiService accountInfoApiService,
                        TMFeedIndexService tmFeedIndexService,
                        TMFeedIndexV1Service tmFeedIndexV1Service,
                        RegionApiService regionApiService,
                        BiliAuthService biliAuthService,
                        VideoApiService videoApiService,
                        ChargeApiService chargeApiService,
                        ColumnApiService columnApiService,
                        BiliCommentApiService biliCommentApiService,
                        BiliSpaceApiService biliSpaceApiService,
                        BiliLiveApiV2Service biliLiveApiV2Service) {
        this.context = context;
        this.cacheProviders = cacheProviders;
        this.biliSplashApiV2Service = biliSplashApiV2Service;
        this.accountInfoApiService = accountInfoApiService;
        this.tmFeedIndexService = tmFeedIndexService;
        this.tmFeedIndexV1Service = tmFeedIndexV1Service;
        this.regionApiService = regionApiService;
        this.biliAuthService = biliAuthService;
        this.videoApiService = videoApiService;
        this.chargeApiService = chargeApiService;
        this.columnApiService = columnApiService;
        this.biliCommentApiService = biliCommentApiService;
        this.biliSpaceApiService = biliSpaceApiService;
        this.biliLiveApiV2Service = biliLiveApiV2Service;
    }

    @Override
    @Deprecated
    public Observable<SampleSplash> getSplashV2() {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return this.biliSplashApiV2Service.getSplash(
                Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels),
                Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels))
                .map(sampleSplashDataListResponse->{
                    if(!sampleSplashDataListResponse.isSuccess())
                        return sampleSplashDataListResponse.getData().get(0);
                    throw new BiliApiException(sampleSplashDataListResponse.getCode(), sampleSplashDataListResponse.getMessage());
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
                .map(splashDataGeneralResponse->{
                    if(splashDataGeneralResponse.isSuccess())
                        return splashDataGeneralResponse.data;
                    throw new BiliApiException(splashDataGeneralResponse);
                });
        return cacheProviders.getSplashList(getSplashListV2, new EvictProvider(cleanCache))
                .map(splashDataReply -> splashDataReply.getData());
    }

    @Override
    public Observable<AccountInfo> getAccountInfo(String access_key) {
        return this.accountInfoApiService.getAccountInfo(access_key)
//                .filter(accountInfoGeneralResponse -> accountInfoGeneralResponse.isSuccess())
                .map(accountInfoGeneralResponse-> {
                    if(accountInfoGeneralResponse.isSuccess())
                        return accountInfoGeneralResponse.data;
                    throw new BiliApiException(accountInfoGeneralResponse);
                });
    }

    @Override
    @Deprecated
    public Observable<List<AppIndex>> getPegasusFeedIndexList(int idx, boolean pull, int login_event) {
        String open_event = pull?"cold":"";
        String network = BiliApplication.getNetWorkStatusManager().getNetworkStatus()==AppNetWorkStatusManager.NETWORK_STATUS_WIFI?"wifi":"mobile";
        int style = 2;
        String ts = String.valueOf(System.currentTimeMillis() / 1000);
        return this.tmFeedIndexV1Service.getIndex(idx,login_event,network,open_event,pull,style,ts)
                .map(appIndexDataListResponse -> {
                    if (appIndexDataListResponse.isSuccess())
                        return appIndexDataListResponse.getData();
                    throw new BiliApiException(appIndexDataListResponse.getCode(), appIndexDataListResponse.getMessage());
                });
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
        int fourk = ParamValueUtils.getFourk();
        int force_host = ParamValueUtils.getForceHost();
        int recsys_mode = ParamValueUtils.getRecsysMode();
        int column = 2;//0或2的倍数
        int fnval = ParamValueUtils.getFnval();
        int fnver = ParamValueUtils.getFnver();
        String open_event = pull?"cold":"";
        String ad_extra = "";
        String network = ParamValueUtils.getNetwork();
        int qn = ParamValueUtils.getQN();
        return this.tmFeedIndexService.getIndexList(access_key,idx,pull,network,column,login_event,open_event,banner_hash,qn,interest,ad_extra,flush,autoplay_card,fnval,fnver,fourk,device_type,force_host,recsys_mode)
        .map(pegasusFeedResponseGeneralResponse -> {
            if(pegasusFeedResponseGeneralResponse.isSuccess())
                return pegasusFeedResponseGeneralResponse.data;
            throw new BiliApiException(pegasusFeedResponseGeneralResponse);
        });
    }

    @Override
    public Observable<List<CategoryIndex>> getCategoryIndex(String access_key) {
        return this.regionApiService.getIndex(access_key)
                .map(categoryIndexGeneralResponse->{
                    if(categoryIndexGeneralResponse.isSuccess())
                        return categoryIndexGeneralResponse.data;
                    throw new BiliApiException(categoryIndexGeneralResponse);
                });
    }

    @Override
    public Observable<AuthKey> getKey(boolean cleanCache) {
        Observable<AuthKey> getKey = this.biliAuthService.getKey().map(authKeyGeneralResponse -> {
            if(authKeyGeneralResponse.isSuccess())
                return authKeyGeneralResponse.data;
            throw new BiliApiException(authKeyGeneralResponse);
        });

        return this.cacheProviders.getKey(getKey, new EvictProvider(cleanCache))
                .map(authKeyReply -> authKeyReply.getData());
    }

    @Override
    public Observable<LoginInfo> signInWithVerify(String username, String password, String captcha) {
        return this.biliAuthService.signInWithVerify(username, password, captcha)
                .map(loginInfoGeneralResponse -> {
                    if(loginInfoGeneralResponse.isSuccess())
                        return loginInfoGeneralResponse.data;
                    throw new BiliApiException(loginInfoGeneralResponse);
                });
    }

    @Override
    public Observable<LoginInfo> loginV3(String username, String password/*, Map<String, String> map*/) {
        return this.biliAuthService.loginV3(username, password, Collections.emptyMap())
                .map(loginInfoGeneralResponse -> {
                    if(loginInfoGeneralResponse.isSuccess())
                        return loginInfoGeneralResponse.data;
                    throw new BiliApiException(loginInfoGeneralResponse);
                });
    }

    @Override
    public Observable<LoginInfo> acquireAccessToken(String code) {
        return this.biliAuthService.acquireAccessToken(code, "authorization_code")
                .map(loginInfoGeneralResponse -> {
                    if(loginInfoGeneralResponse.isSuccess())
                        return loginInfoGeneralResponse.data;
                    throw new BiliApiException(loginInfoGeneralResponse);
                });
    }

    /**
     * 写死了一些参数，那个是统计数据用的，抱歉哔哩哔哩，没有心思去研究你这个参数
     * @param avid
     * @param accessKey
     * @return
     */
    @Override
    public Observable<BiliVideoDetail> getVideoDetails(int avid, String accessKey) {
        return this.videoApiService.getVideoDetails(
                new VideoApiService.VideoParamsMap.create(avid)
                        .setFrom("7").setFromSpmid("tm.recommend.0.0").setSpmid("main.ugc-video-detail.0.0")
                        .setTrackId("all_12.shylf-ai-recsys-87.1558955694804.68")
                        .setAutoPlay("0").build(), accessKey)
                .map(biliVideoDetailGeneralResponse -> {
                    if(biliVideoDetailGeneralResponse.isSuccess())
                        return biliVideoDetailGeneralResponse.data;
                    throw new BiliApiException(biliVideoDetailGeneralResponse);
                });
    }

    @Override
    public Observable<FtVideoUrlInfoBean> getFTVideoUrl(String access_key, int avid, long cid, int qn) {
        Map<String,String> map = new HashMap<>();
        map.put("avid", avid+"");
        map.put("cid", cid+"");
        map.put("qn", qn+"");
        return this.videoApiService.getFTVideoUrl(access_key, map)
                .map(ftVideoUrlInfoBeanGeneralResponse -> {
                    if(ftVideoUrlInfoBeanGeneralResponse.isSuccess())
                        return ftVideoUrlInfoBeanGeneralResponse.data;
                    throw new BiliApiException(ftVideoUrlInfoBeanGeneralResponse);
                });
    }

//    @Override
//    public Observable<JSONObject> getFTVideoUrlV2(String access_key, int avid, long cid, int qn) {//"iVGUTjsxvpLeuDCf"
//        return this.videoApiService.getFTVideoUrlV2(access_key, avid, cid, qn)
//                .map(ftVideoUrlInfoBeanGeneralResponse -> {
//                    if(ftVideoUrlInfoBeanGeneralResponse.isSuccess())
//                        return ftVideoUrlInfoBeanGeneralResponse.data;
//                    throw new BiliApiException(ftVideoUrlInfoBeanGeneralResponse);
//                });
//    }

    @Override
    public Observable<FtVideoUrlInfoBean> getFTVideoMaterialUrl(String access_key, int aid, long cid, int fnval) {
        Map<String,String> map = new HashMap<>();
        map.put("aid", aid+"");
        map.put("cid", cid+"");
        map.put("fnval", fnval+"");
        return this.videoApiService.getFTVideoMaterialUrl(access_key, map)
                .map(ftVideoUrlInfoBeanGeneralResponse -> {
                    if(ftVideoUrlInfoBeanGeneralResponse.isSuccess())
                        return ftVideoUrlInfoBeanGeneralResponse.data;
                    throw new BiliApiException(ftVideoUrlInfoBeanGeneralResponse);
                });
    }

    /**
     *
     * @param aid
     * @param ps 请求的回复楼数
     * @param mode 综合拉取：1   按最新时间排序拉取：2   按热门排序拉取：3
     * //@param plat 不明，默认2
     * //@param type 不明，默认1
     * @param next cursor，首页不需要传，计数从1开始
     * @return
     */
    @Override
    public Observable<BiliCommentCursorList> getCommentListByCursorV2(long aid, int ps, int mode, int next) {
        Map<String,String> map = new HashMap<>();
        map.put("ps", ps+"");
        map.put("oid", aid+"");
        map.put("mode", mode+"");
        map.put("plat", "2");
        map.put("type", "1");
        if(next > 1) map.put("next", next+"");
        return this.biliCommentApiService.getCommentListByCursorV2(map)
                .map(commentCursorListGeneralResponse -> {
                    if(commentCursorListGeneralResponse.isSuccess())
                        return commentCursorListGeneralResponse.data;
                    throw new BiliApiException(commentCursorListGeneralResponse);
                });
    }

    @Override
    public Observable<BiliCommentDetail> getCommentDetail(long aid, long root, int size, long min_id) {
        Map<String,String> map = new HashMap<>();
        if(min_id > 1) map.put("min_id", min_id+"");
        map.put("oid", aid+"");
        map.put("plat", "2");
        map.put("root", root+"");
        map.put("size", size+"");
        map.put("sort", "0");
        map.put("type", "1");
        return this.biliCommentApiService.getCommentDetail(map)
                .map(commentDetailGeneralResponse -> {
                    if(commentDetailGeneralResponse.isSuccess())
                        return commentDetailGeneralResponse.data;
                    throw new BiliApiException(commentDetailGeneralResponse);
                });
    }

    //oid=54028582&plat=2&root=1642592226&size=20&type=1
    @Override
    public Observable<BiliCommentDialogue> getCommentDialogue(long aid, long root, int size, long min_id) {
        Map<String,String> map = new HashMap<>();
        if(min_id > 1) map.put("min_id", min_id+"");
        map.put("oid", aid+"");
        map.put("plat", "2");
        map.put("root", root+"");
        map.put("size", size+"");
        map.put("type", "1");
        return this.biliCommentApiService.getCommentDialogue(map)
                .map(commentDetailGeneralResponse -> {
                    if(commentDetailGeneralResponse.isSuccess())
                        return commentDetailGeneralResponse.data;
                    throw new BiliApiException(commentDetailGeneralResponse);
                });
    }

    @Override
    public Observable<BiliLiveSocketConfig> getRoomSocketConfigV3(long roomId) {
        return this.biliLiveApiV2Service.getRoomSocketConfigV3(roomId)
                .map(liveSocketConfigGeneralResponse -> {
                    if(liveSocketConfigGeneralResponse.isSuccess())
                        return liveSocketConfigGeneralResponse.data;
                    throw new BiliApiException(liveSocketConfigGeneralResponse);
                });
    }
}
