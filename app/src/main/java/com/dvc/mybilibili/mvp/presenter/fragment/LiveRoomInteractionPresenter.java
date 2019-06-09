package com.dvc.mybilibili.mvp.presenter.fragment;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveRoomHistoryMsg;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.presenter.MyMvpBasePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.live.LiveRoomInteractionView;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.io.IOException;

import javax.inject.Inject;

public class LiveRoomInteractionPresenter extends MyMvpBasePresenter<LiveRoomInteractionView> {

    @Inject
    public LiveRoomInteractionPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        super(context, dataManager, provider);
    }

    public void loadRoomInfo(long roomId) {
        this.apiHelper.getRoomInfo(roomId)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<BiliLiveRoomInfo>() {
                    @Override
                    public void onSuccess(BiliLiveRoomInfo biliLiveRoomInfo) {
                        ifViewAttached(view -> view.onRoomInfo(biliLiveRoomInfo));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        ifViewAttached(view -> view.onRoomInfoError(apiException));
                    }
                });
    }

    public void getHistoryMsg(long roomId) {
        this.apiHelper.getRoomHistoryMsg(roomId)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .subscribe(new ObserverCallback<BiliLiveRoomHistoryMsg>() {
                    @Override
                    public void onSuccess(BiliLiveRoomHistoryMsg biliLiveRoomHistoryMsg) throws IOException {
                        ifViewAttached(view -> view.onRoomHistoryMsg(biliLiveRoomHistoryMsg.mRooms));
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }
}
