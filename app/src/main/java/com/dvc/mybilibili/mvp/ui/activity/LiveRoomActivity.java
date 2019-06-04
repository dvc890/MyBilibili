package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.danmaku.live.LiveDanMuReceiver;
import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;
import com.dvc.mybilibili.danmaku.live.entity.LiveEntity;
import com.dvc.mybilibili.danmaku.live.entity.PreparingEntity;
import com.dvc.mybilibili.danmaku.live.entity.RoomAdminsEntity;
import com.dvc.mybilibili.danmaku.live.entity.SendGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.SysGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.SysMSGEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeGuardEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.mvp.presenter.activity.LiveRoomPresenter;
import com.dvc.mybilibili.player.BiliLiveVideoPlayer;
import com.vondear.rxtool.view.RxToast;

import java.io.IOException;

import javax.inject.Inject;

import butterknife.BindView;

public class LiveRoomActivity extends MvpBaseActivity<LiveRoomView, LiveRoomPresenter> implements LiveRoomView, ILiveDanMuCallback {

    @Inject
    LiveRoomPresenter liveRoomPresenter;
    @BindView(R.id.player)
    BiliLiveVideoPlayer player;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private long roomId;

    @NonNull
    @Override
    public LiveRoomPresenter createPresenter() {
        return liveRoomPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_live_activity_liveroom_normal_v3;
    }

    @Override
    protected void initViews() {
    }

    @Override
    protected void loadDatas() {
        //test
        player.setRoomId(24541);
        presenter.loadLivePlayUrl(24541);
        initDanMu();
    }

    @Override
    public void onPlayUrl(LivePlayerInfo livePlayerInfo) {
        player.setUp(livePlayerInfo, false, "测试");
    }

    @Override
    public void onPlayUrlError(BiliApiException apiException) {

    }

    @Override
    public void onBackPressed() {
        if (player.backFromWindowFull(this)) {
            return;
        }
        super.onBackPressed();
    }@Override
    protected void onResume() {
        super.onResume();
        if(player.isInPlayingState())
            player.resumeVideo();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(player.isInPlayingState())
            player.pauseVideo();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(player.isInPlayingState())
            player.releaseAllVideos();
        if(LiveDanMuReceiver.getInstance().isConnected()) try {
            LiveDanMuReceiver.getInstance().close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            LiveDanMuReceiver.getInstance().removeCallback(this);
        }

    }

    public void initDanMu() {
        try {
            LiveDanMuReceiver.getInstance().addCallback(this);
            LiveDanMuReceiver.getInstance().connect(24541);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        if(player.isInPlayingState())
            player.sendDanmaku(danMuMSGEntity.text, danMuMSGEntity.color, danMuMSGEntity.textsize);
        runOnUiThread(()->RxToast.normal(String.format("%1$s[%2$d](%3$s):%4$s",danMuMSGEntity.username, danMuMSGEntity.userlevel, danMuMSGEntity.userrank, danMuMSGEntity.text)));
    }

    @Override
    public void onSysMSGPackage(SysMSGEntity sysMSGEntity) {

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
