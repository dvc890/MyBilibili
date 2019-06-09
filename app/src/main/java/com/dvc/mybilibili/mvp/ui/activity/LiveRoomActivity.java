package com.dvc.mybilibili.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.danmaku.live.LiveDanMuReceiver;
import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;
import com.dvc.mybilibili.danmaku.live.entity.LiveEntity;
import com.dvc.mybilibili.danmaku.live.entity.PreparingEntity;
import com.dvc.mybilibili.danmaku.live.entity.RoomAdminsEntity;
import com.dvc.mybilibili.danmaku.live.entity.SendGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.SysGiftEntity;
import com.dvc.mybilibili.danmaku.live.entity.NoticeMsgEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeEntity;
import com.dvc.mybilibili.danmaku.live.entity.WelcomeGuardEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SimpleLiveCallBack;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.mvp.presenter.activity.LiveRoomPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.ViewPagerAdapter;
import com.dvc.mybilibili.mvp.ui.fragment.live.LiveRoomInteractionFragment;
import com.dvc.mybilibili.player.BiliLiveVideoPlayer;
import com.vondear.rxtool.view.RxToast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class LiveRoomActivity extends MvpBaseActivity<LiveRoomView, LiveRoomPresenter> implements LiveRoomView {

    @Inject
    LiveRoomPresenter liveRoomPresenter;
    @BindView(R.id.player)
    BiliLiveVideoPlayer player;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private long roomId;
    private String title = "";
    private ArrayList<Fragment> views;
    private SimpleLiveCallBack simpleLiveCallBack;

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
        setupViewPager();
    }

    @Override
    protected void loadDatas() {
        roomId = getIntent().getLongExtra(Keys.KEY_ROOMID, 0);
        if(roomId == 0) {
            finish();
            return;
        }
        if(getIntent().hasExtra(Keys.KEY_TITLE))
            title = getIntent().getStringExtra(Keys.KEY_TITLE);
        player.setRoomId(roomId);
        presenter.loadLivePlayUrl(roomId);
        initDanMu();

        Bundle bundle = new Bundle();
        bundle.putLong(Keys.KEY_ROOMID, roomId);
        for(Fragment fragment : views)
            fragment.setArguments(bundle);
    }

    @Override
    public void onPlayUrl(LivePlayerInfo livePlayerInfo) {
        player.setUp(livePlayerInfo, false, title);
        player.startPlayLogic();
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
    }

    @Override
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
            LiveDanMuReceiver.getInstance().removeCallback(simpleLiveCallBack);
        }

    }

    public void initDanMu() {
        try {
            this.simpleLiveCallBack = new SimpleLiveCallBack() {
                @Override
                public void onDanMuMSGPackage(DanMuMSGEntity danMuMSGEntity) {
                    if(player.isIfCurrentIsFullscreen()) {
                        if (player.isInPlayingState())
                            player.sendDanmaku(danMuMSGEntity.text, danMuMSGEntity.color, danMuMSGEntity.textsize);
                    }
                }
            };
            LiveDanMuReceiver.getInstance().addCallback(simpleLiveCallBack);
            LiveDanMuReceiver.getInstance().connect(roomId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupViewPager() {
        views = new ArrayList<>(6);
        LiveRoomInteractionFragment liveRoomInteractionFragment = new LiveRoomInteractionFragment();
        views.add(liveRoomInteractionFragment);
        List<String> titles = new ArrayList<>(6);
        titles.add(getResources().getText(R.string.interaction).toString());
        titles.add(getResources().getText(R.string.widget_anchor).toString());
        titles.add(getResources().getText(R.string.live_contribution).toString());
        titles.add(getResources().getText(R.string.fleet).toString());
        titles.add(getResources().getText(R.string.more_tab_live).toString());
        titles.add(getResources().getText(R.string.love_club).toString());

        new ViewPagerAdapter(getSupportFragmentManager(), viewpager, views, titles);
        tabLayout.setupWithViewPager(viewpager);
        viewpager.setCurrentItem(0);
    }

    public void setFleetNum(int num) {
//        R.string.fleet_num
    }
}
