package com.dvc.mybilibili.danmaku.live.interfaces;

import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;
import com.dvc.mybilibili.danmaku.live.entity.LiveEntity;
import com.dvc.mybilibili.danmaku.live.entity.NoticeMsgEntity;
import com.dvc.mybilibili.danmaku.live.entity.PreparingEntity;
import com.dvc.mybilibili.danmaku.live.entity.RoomAdminsEntity;
import com.dvc.mybilibili.danmaku.live.entity.SendGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.SysGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeGuardEntity;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;


public class SimpleLiveCallBack implements ILiveDanMuCallback {
    @Override
    public void onConnect() {

    }

    @Override
    public void onDisconnect() {

    }

    @Override
    public void onOnlineCountPackage(int onlineCount) {

    }

    @Override
    public void onDanMuMSGPackage(DanMuMSGEntity danMuMSGEntity) {

    }

    @Override
    public void onNoticeMsgPackage(NoticeMsgEntity sysMSGEntity) {

    }

    @Override
    public void onSendGiftPackage(SendGiftEntity sendGiftEntity) {

    }

    @Override
    public void onSysGiftPackage(SysGiftEntity sysGiftEntity) {

    }

    @Override
    public void onWelcomePackage(WelcomeEntity welcomeEntity) {

    }

    @Override
    public void onWelcomeGuardPackage(WelcomeGuardEntity welcomeGuardEntity) {

    }

    @Override
    public void onLivePackage(LiveEntity liveEntity) {

    }

    @Override
    public void onPreparingPackage(PreparingEntity preparingEntity) {

    }

    @Override
    public void onRoomAdminsPackage(RoomAdminsEntity roomAdminsEntity) {

    }

    @Override
    public void onConnectError(BiliApiException apiException) {

    }
}
