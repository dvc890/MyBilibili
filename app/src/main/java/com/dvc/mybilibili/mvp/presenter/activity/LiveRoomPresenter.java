package com.dvc.mybilibili.mvp.presenter.activity;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.activity.LiveRoomView;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.io.IOException;

import javax.inject.Inject;

public class LiveRoomPresenter extends MyMvpBasePresenter<LiveRoomView> {

    @Inject
    public LiveRoomPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

    public void loadLivePlayUrl(long roomId) {
        this.apiHelper.getLiveRoomPlayUrl(roomId, 3)
//        this.apiHelper.getLiveRoomM3u8PlayUrl(roomId)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<LivePlayerInfo>() {
                    @Override
                    public void onSuccess(LivePlayerInfo livePlayerInfo) {
                        ifViewAttached(view -> view.onPlayUrl(livePlayerInfo));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.onPlayUrlError(apiException));
                    }
                });
    }
}
