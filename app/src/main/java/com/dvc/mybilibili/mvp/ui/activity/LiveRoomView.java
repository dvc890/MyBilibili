package com.dvc.mybilibili.mvp.ui.activity;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface LiveRoomView extends MvpView{
    void onPlayUrl(LivePlayerInfo livePlayerInfo);

    void onPlayUrlError(BiliApiException apiException);
}
