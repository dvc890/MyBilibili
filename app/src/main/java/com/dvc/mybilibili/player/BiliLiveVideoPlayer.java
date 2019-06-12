package com.dvc.mybilibili.player;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer.LivePlayerInfo;
import com.dvc.mybilibili.player.danmaku.DanMaKuHolder;
import com.dvc.mybilibili.player.manager.CustomManager;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

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
    private boolean isFrist = true;

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
        GSYVideoType.setRenderType(GSYVideoType.SUFRACE);
        GSYVideoType.enableMediaCodecTexture();
        super.init(context);
        this.danmakuHolder = new DanMaKuHolder(this);
        this.refresh.setOnClickListener(this);
//        Debuger.enable();
    }

    public void setMyOptionModelList() {
        List<VideoOptionModel> list = new ArrayList<>();list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "soundtouch", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "opensles", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "mediacodec", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "start-on-prepared", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "vn", 1));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "protocol_whitelist", "quic,ijkio,async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data"));
//        int maxMemory = (int) Runtime.getRuntime().maxMemory();
//        int capacity;
//        if (maxMemory > 25165824) {
//            maxMemory = 5242880;
//            capacity = 1048576;
//        } else {
//            maxMemory = (maxMemory / 2) / 3;
//            capacity = 2 * maxMemory;
//        }
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "async-forwards-capacity", maxMemory));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "async-backwards-capacity", capacity));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "user_agent", "Bilibili Freedoooooom/MarkII"));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "cache_file_close", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "max-buffer-size", 8388608));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "min-frames", 120));

//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "rtsp_transport", "tcp"));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "rtsp_flags", "prefer_tcp"));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "allowed_media_types", "video"));//根据媒体类型来配置
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "timeout", 20000));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "buffer_size", 1316));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "infbuf", 1));  // 无限读
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "analyzemaxduration", 100));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "probesize", 10240));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "flush_packets", 1));
        //  关闭播放器缓冲，这个必须关闭，否则会出现播放一段时间后，一直卡主，控制台打印 FFP_MSG_BUFFERING_START
        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "packet-buffering", 0));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "framedrop", 50));
//        list.add(new VideoOptionModel(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "protocol_whitelist", "crypto,file,http,https,tcp,tls,udp"));
        ((CustomManager)getGSYVideoManager()).setOptionModelList(list);

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

    public void sendDanmaku(String text, int color, float testsize) {
        if(this.getCurrentState() == CURRENT_STATE_PLAYING)
            this.danmakuHolder.addDanmaku(text, color, testsize, true);
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
        gsyBaseVideoPlayer.isFrist = isFrist;
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
            this.isFrist = gsyBaseVideoPlayer.isFrist;
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
    public void startPlayLogic() {
        if(isFrist) {
            mLoadingProgressBar.setVisibility(GONE);
            mLoadingProgressBar = findViewById(R.id.guicu_loadingview);
            ((AnimationDrawable)((ImageView)mLoadingProgressBar.findViewById(R.id.placeholder_iv)).getDrawable()).start();
        }
        setMyOptionModelList();
        super.startPlayLogic();
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
        if(isFrist) {
            ((AnimationDrawable)((ImageView)mLoadingProgressBar.findViewById(R.id.placeholder_iv)).getDrawable()).start();
            mLoadingProgressBar.setVisibility(GONE);
            mLoadingProgressBar = findViewById(R.id.loading);
            isFrist = false;
        }
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
        } else if (getHadPlay() && this.danmakuHolder.getDanmakuView() != null
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
                Refresh();
                break;
        }
    }

    @Override
    protected void touchSurfaceMoveFullLogic(float absDeltaX, float absDeltaY) {
        super.touchSurfaceMoveFullLogic(absDeltaX, absDeltaY);
        mChangePosition = false;//禁止全屏手势调整进度
    }

//    Runnable super_resolveUIState;
//    @Override
//    protected void resolveUIState(int state) {
//        if(super_resolveUIState != null)
//            ThreadManager.get().getMainHandler().removeCallbacks(super_resolveUIState);
//        super_resolveUIState = ()->super.resolveUIState(state);
//        ThreadManager.get().getMainHandler().postDelayed(super_resolveUIState, 1000);
//    }

    private void Refresh() {
        getGSYVideoManager().setDisplay(null);
        getGSYVideoManager().releaseMediaPlayer();
        changeUiToPlayingClear();
        setPlayTag(getPlayTag()+getPlayTag().hashCode());
        startPlayLogic();
    }
}
