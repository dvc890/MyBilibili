package com.dvc.mybilibili.mvp.ui.fragment.live;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveRoomHistoryMsg;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import java.util.List;

public interface LiveRoomInteractionView extends MvpView {
    void onRoomInfo(BiliLiveRoomInfo biliLiveRoomInfo);

    void onRoomInfoError(BiliApiException apiException);

    void onRoomHistoryMsg(List<BiliLiveRoomHistoryMsg.Msg> mRooms);
}
