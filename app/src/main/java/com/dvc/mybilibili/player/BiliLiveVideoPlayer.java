package com.dvc.mybilibili.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.player.danmaku.DanMaKuHolder;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;

import butterknife.BindView;

/**
 * 直播用的播放器
 */

public class BiliLiveVideoPlayer extends BiliVideoPlayer {

    //数据源
    private int mSourcePosition = -1;
    private int mPreSourcePosition = 0;

    @BindView(R.id.refresh)
    ImageView refresh;

    protected DanMaKuHolder danmakuHolder;
    private LivePlayerInfo mediaResource;
    private long roomid;

    public BiliLiveVideoPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public BiliLiveVideoPlayer(Context context) {
        super(context);
    }

    public BiliLiveVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.bili_player_live_controller;
    }

    @Override
    protected void init(Context context) {
        super.init(context);
        this.danmakuHolder = new DanMaKuHolder(this);
        this.refresh.setOnClickListener(this);
//        Debuger.enable();
    }

    public boolean setUp(LivePlayerInfo mediaResource, boolean cacheWithPlay, String title) {
        this.mediaResource = mediaResource;
        String url = mediaResource.mDurlList.get(0).mPlayUrl;
        setPlayTag(url+this.roomid);
        boolean state = setUp(url, cacheWithPlay, title);
        startfristbtn.setVisibility(state?VISIBLE:GONE);
        return state;
    }

    public void setRoomId(long roomid) {
        this.roomid = roomid;
        //初始化弹幕显示
        this.danmakuHolder.initDanmaku(0, 0);

    }

    public void sendDanmaku(String text, int color) {
        this.danmakuHolder.addDanmaku(text, color, true);
    }

    /**
     * 进入全屏模式
     * @return
     */
    @Override
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
        BiliLiveVideoPlayer gsyBaseVideoPlayer = (BiliLiveVideoPlayer) super.startWindowFullscreen(context, actionBar, statusBar);
//        gsyBaseVideoPlayer.mSwitchSize.setText(mTypeText);
//        gsyBaseVideoPlayer.mSwitchSize.setVisibility(VISIBLE);
//        gsyBaseVideoPlayer.mTypeText = mTypeText;
        gsyBaseVideoPlayer.mediaResource = getMediaResource();
        gsyBaseVideoPlayer.mSourcePosition = mSourcePosition;
        gsyBaseVideoPlayer.setRoomId(roomid);
        //对弹幕设置偏移记录
        gsyBaseVideoPlayer.danmakuHolder.setParser(this.danmakuHolder.getParser());
        gsyBaseVideoPlayer.danmakuHolder.setDanmakuStartSeekPosition(getCurrentPositionWhenPlaying());
        gsyBaseVideoPlayer.danmakuHolder.setDanmaKuShow(this.danmakuHolder.getDanmaKuShow());
        gsyBaseVideoPlayer.danmakuHolder.onPrepareDanmaku(gsyBaseVideoPlayer);
        return gsyBaseVideoPlayer;
    }

    /**
     * 退出全屏模式
     */
    @Override
    protected void resolveNormalVideoShow(View oldF, ViewGroup vp, GSYVideoPlayer gsyVideoPlayer) {
        super.resolveNormalVideoShow(oldF, vp, gsyVideoPlayer);
        if (gsyVideoPlayer != null) {
//            mSwitchSize.setVisibility(GONE);
//            mTypeText = gsyBaseVideoPlayer.mTypeText;
            BiliLiveVideoPlayer gsyBaseVideoPlayer = (BiliLiveVideoPlayer) gsyVideoPlayer;
            mediaResource = gsyBaseVideoPlayer.getMediaResource();
            mSourcePosition = gsyBaseVideoPlayer.mSourcePosition;
            this.setRoomId(gsyBaseVideoPlayer.roomid);
            //对弹幕设置偏移记录
            this.danmakuHolder.setDanmaKuShow(gsyBaseVideoPlayer.danmakuHolder.getDanmaKuShow());
            if (gsyBaseVideoPlayer.danmakuHolder.getDanmakuView() != null &&
                    gsyBaseVideoPlayer.danmakuHolder.getDanmakuView().isPrepared()) {
                this.danmakuHolder.resolveDanmakuSeek(this, gsyBaseVideoPlayer.getCurrentPositionWhenPlaying());
                this.danmakuHolder.resolveDanmakuShow();
                gsyBaseVideoPlayer.danmakuHolder.releaseDanmaku(gsyBaseVideoPlayer);
            }
        }
    }


    public LivePlayerInfo getMediaResource() {
        return mediaResource;
    }

    @Override
    public void onAutoCompletion() {
        super.onAutoCompletion();
    }

    @Override
    public void onCompletion() {
        super.onCompletion();
        this.danmakuHolder.releaseDanmaku(this);
    }

    @Override
    public void onPrepared() {
        super.onPrepared();
        this.danmakuHolder.onPrepareDanmaku(this);
    }

    @Override
    public void onVideoPause() {
        super.onVideoPause();
        this.danmakuHolder.danmakuOnPause();
    }

    @Override
    public void onVideoResume(boolean isResume) {
        super.onVideoResume(isResume);
        this.danmakuHolder.danmakuOnResume();
    }

    @Override
    public void onSeekComplete() {
        super.onSeekComplete();
        int time = mProgressBar.getProgress() * getDuration() / 100;
        //如果已经初始化过的，直接seek到对于位置
        if (getHadPlay() && this.danmakuHolder.getDanmakuView() != null
                && this.danmakuHolder.getDanmakuView().isPrepared()) {
            this.danmakuHolder.resolveDanmakuSeek(this, time);
        } else if (mHadPlay && this.danmakuHolder.getDanmakuView() != null
                && !this.danmakuHolder.getDanmakuView().isPrepared()) {
            //如果没有初始化过的，记录位置等待
            this.danmakuHolder.setDanmakuStartSeekPosition(time);
        }
    }

    @Override
    protected void clickStartIcon() {
        super.clickStartIcon();
        if (getCurrentState() == CURRENT_STATE_PLAYING) {
            this.danmakuHolder.danmakuOnResume();
        } else if (getCurrentState() == CURRENT_STATE_PAUSE) {
            this.danmakuHolder.danmakuOnPause();
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.toogle_danmaku:
                this.danmakuHolder.resolveDanmakuShow();
                break;
            case R.id.refresh:
                break;
        }
    }
}
