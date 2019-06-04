package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.BiliLiveSocketConfig;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.mvp.ui.activity.LiveRoomView;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.io.IOException;

import javax.inject.Inject;

public class LiveRoomPresenter extends MvpBasePresenter<LiveRoomView> {

    private final DataManager dataManager;
    private final ApiHelper apiHelper;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public LiveRoomPresenter(DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.dataManager = dataManager;
        this.apiHelper = dataManager.getApiHelper();
        this.provider = provider;
    }

    public void loadRoomInfo(long roomId) {
        this.apiHelper.getRoomInfo(roomId)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<BiliLiveRoomInfo>() {
                    @Override
                    public void onSuccess(BiliLiveRoomInfo biliLiveRoomInfo) throws IOException {

                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }

    public void loadDanMaKuSocketInfo(long roomId) {
        this.apiHelper.getRoomSocketConfigV3(roomId)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<BiliLiveSocketConfig>() {
                    @Override
                    public void onSuccess(BiliLiveSocketConfig biliLiveSocketConfig) throws IOException {

                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }

    public void loadLivePlayUrl(long roomId) {
        this.apiHelper.getLiveRoomPlayUrl(roomId, 4)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<LivePlayerInfo>() {
                    @Override
                    public void onSuccess(LivePlayerInfo livePlayerInfo) throws IOException {
                        ifViewAttached(view -> view.onPlayUrl(livePlayerInfo));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.onPlayUrlError(apiException));
                    }
                });
    }
}
