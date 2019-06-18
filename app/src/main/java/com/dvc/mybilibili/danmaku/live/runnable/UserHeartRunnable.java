package com.dvc.mybilibili.danmaku.live.runnable;

import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveActivityReceiveInfo;

import java.io.IOException;

import io.reactivex.schedulers.Schedulers;

public class UserHeartRunnable implements Runnable {

    long roomId;

    public UserHeartRunnable(long roomId) {
        this.roomId = roomId;
    }

    @Override
    public void run() {
        while (true) {
            try {
                BiliApplication.getDataManager().getApiHelper().getUserOnlineHeart(roomId)
                        .subscribeOn(Schedulers.single())
                        .observeOn(Schedulers.single())
                        .subscribe(new ObserverCallback<BiliLiveActivityReceiveInfo>() {
                            @Override
                            public void onSuccess(BiliLiveActivityReceiveInfo biliLiveActivityReceiveInfo) throws IOException {

                            }

                            @Override
                            public void onError(BiliApiException apiException, int code) {

                            }
                        });
                Thread.sleep(300000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
