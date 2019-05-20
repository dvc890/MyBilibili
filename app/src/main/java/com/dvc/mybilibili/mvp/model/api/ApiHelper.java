package com.dvc.mybilibili.mvp.model.api;

import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.AccountInfo;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.PegasusFeedResponse;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SplashData;

import io.reactivex.Observable;

public interface ApiHelper {
    Observable<SampleSplash> getSplashV2();

    Observable<SplashData> getSplashListV2(boolean cleanCache, String access_key, String birth);

    Observable<AccountInfo> getAccountInfo(String access_key);

    Observable<PegasusFeedResponse> getIndexList(String access_key, int idx, boolean pull, int login_event, String interest, int flush, int autoplay_card, String banner_hash, int device_type);
}
