package com.dvc.mybilibili.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;
import com.dvc.mybilibili.player.danmaku.DanMaKuHolder;
import com.dvc.mybilibili.player.popup.QualityPickPopup;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;
import com.vondear.rxtool.view.RxToast;

import java.io.File;

import butterknife.BindView;
import io.reactivex.Observable;

/**
 * 可以切换清晰度的播放器
 */
public class BiliQualityPickVideoPlayer extends BiliVideoPlayer {

    //记住切换数据源类型
    private String mTmpTag = "";
    //数据源
    private int mSourcePosition = -1;
    private int mPreSourcePosition = 0;

    private GSYVideoViewBridge mTmpManager;

    private boolean isChanging;

    @BindView(R.id.pick)
    TextView mSwitchSize;
    private FtVideoUrlInfoBean mediaResource;
    private String mTypeText;
    private QualityPickPopup qualityPickPopup;
    private int aid;
    private long cid;

    protected DanMaKuHolder danmakuHolder;

    public BiliQualityPickVideoPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public BiliQualityPickVideoPlayer(Context context) {
        super(context);
    }

    public BiliQualityPickVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.bili_player_spick_controller;
    }


    @Override
    protected void init(Context context) {
        super.init(context);
//        Debuger.enable();
        //切换视频清晰度
        mSwitchSize.setOnClickListener(v -> {
            if (mHadPlay && !isChanging) {
                showSwitchPop();
            }
        });
        this.qualityPickPopup = new QualityPickPopup(getContext());
        this.qualityPickPopup.setOnItemClickListener((adapter, view, position) -> {
            qualityPickPopup.dismiss(true);
            resolveStartChange(position);
        });
        this.danmakuHolder = new DanMaKuHolder(this);
    }


    public void setVideoId(int aid, long cid) {
        this.aid = aid;
        this.cid = cid;
        //初始化弹幕显示
        this.danmakuHolder.initDanmaku(this.aid, this.cid);
    }

    public boolean setUp(FtVideoUrlInfoBean mediaResource, boolean cacheWithPlay, String title) {
        this.mediaResource = mediaResource;
//        if(this.mediaResource.getFTVideoMaterialUrl().toLowerCase().contains("quic")) {
//            PlayerFactory.setPlayManager(Exo2PlayerManager.class);
//        } else {
//            PlayerFactory.setPlayManager(IjkPlayerManager.class);
//        }
        String url = mediaResource.getVideoUrl().replace("quic","http");
        mTypeText = getDescString(mSourcePosition)/*.split(" ")[1]*/;
        mSwitchSize.setText(mTypeText);
        mSwitchSize.setVisibility(GONE);
        setPlayTag(url+this.aid+""+this.cid);
        boolean state = setUp(url, cacheWithPlay, title);
        startfristbtn.setVisibility(state?VISIBLE:GONE);
        return state;
    }

    public FtVideoUrlInfoBean getMediaResource() {
        return mediaResource;
    }

    private Observable<String> getVideoUrl(int position) {
        if(getMediaResource().dash != null) {
            return Observable.create(emitter -> {
                emitter.onNext(getMediaResource().getDashVideoUrl(getMediaResource().findQuality(position)).replace("quic://", "http://"));
            });
        } else {
            return BiliApplication.getDataManager().getApiHelper()
                    .getFTVideoUrl(BiliApplication.getDataManager().getUser().getAccessKey(),aid, cid, getMediaResource().findQuality(position))
                    .filter(ftVideoUrlInfoBean -> {
                        if(getMediaResource().findQuality(position) != ftVideoUrlInfoBean.quality)
                            throw new BiliApiException(-2);
                        return true;
                    })
                    .map(ftVideoUrlInfoBean -> ftVideoUrlInfoBean.getVideoUrl());
        }
    }

    private String getDescString(int position) {
        try {
            return getMediaResource().getSupportDescription().get(position);
        }catch (Exception e) {
            return mContext.getString(R.string.player_quality_switch_mode_auto1);
        }
    }

    private void showSwitchPop() {
        this.qualityPickPopup.setSelected(mSourcePosition);
        this.qualityPickPopup.setData(getMediaResource().getSupportQuality(), getMediaResource().getSupportDescription());
        this.qualityPickPopup.showPopupWindow();
    }
    /**
     * 进入全屏模式
     * @return
     */
    @Override
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
        BiliQualityPickVideoPlayer gsyBaseVideoPlayer = (BiliQualityPickVideoPlayer) super.startWindowFullscreen(context, actionBar, statusBar);
        gsyBaseVideoPlayer.mSwitchSize.setText(mTypeText);
        gsyBaseVideoPlayer.mSwitchSize.setVisibility(VISIBLE);
        gsyBaseVideoPlayer.mediaResource = getMediaResource();
        gsyBaseVideoPlayer.mSourcePosition = mSourcePosition;
        gsyBaseVideoPlayer.mTypeText = mTypeText;
        gsyBaseVideoPlayer.setVideoId(aid, cid);
        //对弹幕设置偏移记录
        gsyBaseVideoPlayer.danmakuHolder.setParser(this.danmakuHolder.getParser());
        gsyBaseVideoPlayer.danmakuHolder.setDanmakuStartSeekPosition(getCurrentPositionWhenPlaying());
        gsyBaseVideoPlayer.danmakuHolder.setDanmaKuShow(this.danmakuHolder.getDanmaKuShow());
        gsyBaseVideoPlayer.danmakuHolder.onPrepareDanmaku(gsyBaseVideoPlayer);
//        this.danmakuHolder.releaseDanmaku(this);
        return gsyBaseVideoPlayer;
    }

    /**
     * 退出全屏模式
     */
    @Override
    protected void resolveNormalVideoShow(View oldF, ViewGroup vp, GSYVideoPlayer gsyVideoPlayer) {
        super.resolveNormalVideoShow(oldF, vp, gsyVideoPlayer);
        if (gsyVideoPlayer != null) {
            mSwitchSize.setVisibility(GONE);
            BiliQualityPickVideoPlayer gsyBaseVideoPlayer = (BiliQualityPickVideoPlayer) gsyVideoPlayer;
            mediaResource = gsyBaseVideoPlayer.getMediaResource();
            mSourcePosition = gsyBaseVideoPlayer.mSourcePosition;
            mTypeText = gsyBaseVideoPlayer.mTypeText;
            this.setVideoId(gsyBaseVideoPlayer.aid, gsyBaseVideoPlayer.cid);
            //对弹幕设置偏移记录
            this.danmakuHolder.setDanmaKuShow(gsyBaseVideoPlayer.danmakuHolder.getDanmaKuShow());
            if (gsyBaseVideoPlayer.danmakuHolder.getDanmakuView() != null &&
                    gsyBaseVideoPlayer.danmakuHolder.getDanmakuView().isPrepared()) {
//                this.danmakuHolder.setParser(gsyBaseVideoPlayer.danmakuHolder.getParser());
//                this.danmakuHolder.setDanmakuStartSeekPosition(gsyBaseVideoPlayer.getCurrentPositionWhenPlaying());
//                this.danmakuHolder.onPrepareDanmaku(gsyBaseVideoPlayer);
                this.danmakuHolder.resolveDanmakuSeek(this, gsyBaseVideoPlayer.getCurrentPositionWhenPlaying());
                this.danmakuHolder.resolveDanmakuShow();
                gsyBaseVideoPlayer.danmakuHolder.releaseDanmaku(gsyBaseVideoPlayer);
            }
        }
    }

    @Override
    public void onAutoCompletion() {
        super.onAutoCompletion();
        releaseTmpManager();
    }

    @Override
    public void onCompletion() {
        super.onCompletion();
        releaseTmpManager();
        this.danmakuHolder.releaseDanmaku(this);
    }

    private void resolveStartChange(int position) {
        final String name = getDescString(position);
        if (mSourcePosition != position) {
            if ((mCurrentState == GSYVideoPlayer.CURRENT_STATE_PLAYING
                    || mCurrentState == GSYVideoPlayer.CURRENT_STATE_PAUSE)) {
                showLoading();
                mPreSourcePosition = mSourcePosition;
                getVideoUrl(position)
                        .compose(RxSchedulersHelper.ioAndThisThread())
                        .subscribe(new ObserverCallback<String>() {
                            @Override
                            public void onSuccess(String url) {
                                cancelProgressTimer();
                                hideAllWidget();
                                if (mTitle != null && mTitleTextView != null) {
                                    mTitleTextView.setText(mTitle);
                                }
                                isChanging = true;
                                mSourcePosition = position;
                                //创建临时管理器执行加载播放
                                mTmpTag = url+aid+""+cid;
                                mTmpManager = getTmpGSYVideoManager(mTmpTag);
                                mTmpManager.setListener(gsyMediaPlayerListener);
//                                mTmpManager = GSYVideoManager.tmpInstance(gsyMediaPlayerListener);
//                                mTmpManager.initContext(getContext().getApplicationContext());
                                resolveChangeUrl(mCache, mCachePath, url);
                                mTmpManager.prepare(mUrl, mMapHeadData, mLooping, mSpeed, mCache, mCachePath, null);
                                changeUiToPlayingBufferingShow();
                            }

                            @Override
                            public void onError(BiliApiException apiException, int code) {

                            }
                        });

            }
        } else {
            RxToast.warning( "已经是 " + name);
        }
    }

    private void showLoading() {
        RxToast.normal(mContext.getString(R.string.player_switch_quality_switching));
    }

    private void hideLoading() {
        RxToast.success(mContext.getString(R.string.player_switch_quality_success_fmt, getDescString(mSourcePosition)));
    }

    private void resolveChangeUrl(boolean cacheWithPlay, File cachePath, String url) {
        if (mTmpManager != null) {
            mCache = cacheWithPlay;
            mCachePath = cachePath;
            mOriginUrl = url;
            mUrl = url;
        }
    }

    private void resolveChangedResult(boolean isSucs) {
        isChanging = false;
        mTmpManager = null;
        getVideoUrl(mSourcePosition)
                .compose(RxSchedulersHelper.ioAndThisThread())
                .subscribe(new ObserverCallback<String>() {
                    @Override
                    public void onSuccess(String url) {
                        mTypeText = getDescString(mSourcePosition)/*.split(" ")[1]*/;
                        mSwitchSize.setText(mTypeText);
                        resolveChangeUrl(mCache, mCachePath, url);
                        hideLoading();
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {

                    }
                });
    }

    private void releaseTmpManager() {
        if (mTmpManager != null) {
            mTmpManager.releaseMediaPlayer();
            mTmpManager = null;
        }
    }

    private GSYMediaPlayerListener gsyMediaPlayerListener = new GSYMediaPlayerListener() {
        @Override
        public void onPrepared() {
            if (mTmpManager != null) {
                mTmpManager.start();
                mTmpManager.seekTo(getCurrentPositionWhenPlaying());
            }
        }

        @Override
        public void onAutoCompletion() {

        }

        @Override
        public void onCompletion() {

        }

        @Override
        public void onBufferingUpdate(int percent) {

        }

        @Override
        public void onSeekComplete() {
            if (mTmpManager != null) {
//                GSYVideoBaseManager manager = GSYVideoManager.instance();
//                GSYVideoManager.changeManager(mTmpManager);
//                mTmpManager.setLastListener(manager.lastListener());
//                mTmpManager.setListener(manager.listener());
                GSYVideoViewBridge orgmanager = getGSYVideoManager();
                setPlayTag(mTmpTag);//切换管理者
                mTmpManager.setLastListener(orgmanager.lastListener());
                mTmpManager.setLastListener(orgmanager.listener());

                orgmanager.setDisplay(null);
                orgmanager.releaseMediaPlayer();
                changeUiToPlayingClear();

                Debuger.printfError("**** showDisplay onSeekComplete ***** " + mSurface);
                Debuger.printfError("**** showDisplay onSeekComplete isValid***** " + mSurface.isValid());
                mTmpManager.setDisplay(mSurface);
                addTextureView();//重新添加渲染器，不然会有最后一针画面残留
                resolveChangedResult(true);
            }
        }

        @Override
        public void onError(int what, int extra) {
            mSourcePosition = mPreSourcePosition;
            if (mTmpManager != null) {
                mTmpManager.releaseMediaPlayer();
            }
            post(() -> {
                resolveChangedResult(false);
                RxToast.error("change Fail");
            });
        }

        @Override
        public void onInfo(int what, int extra) {

        }

        @Override
        public void onVideoSizeChanged() {

        }

        @Override
        public void onBackFullscreen() {

        }

        @Override
        public void onVideoPause() {

        }

        @Override
        public void onVideoResume() {

        }

        @Override
        public void onVideoResume(boolean seek) {

        }
    };

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

//    @Override
//    public void onClick(View v) {
//        super.onClick(v);
//        switch (v.getId()) {
//            case R.id.toogle_danmaku:
//                this.danmakuHolder.resolveDanmakuShow();
//                break;
//        }
//    }


}
