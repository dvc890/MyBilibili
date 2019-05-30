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
import com.dvc.mybilibili.mvp.model.api.entity.IMediaResource;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;
import com.dvc.mybilibili.player.popup.QualityPickPopup;
import com.shuyu.gsyvideoplayer.GSYVideoBaseManager;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.vondear.rxtool.view.RxToast;

import java.io.File;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * 可以切换清晰度的播放器
 */
public class BiliQualityPickVideoPlayer extends BiliVideoPlayer {

    //记住切换数据源类型
    private int mType = 0;
    //数据源
    private int mSourcePosition = -1;
    private int mPreSourcePosition = 0;

    private GSYVideoManager mTmpManager;

    private boolean isChanging;

    @BindView(R.id.pick)
    TextView mSwitchSize;
    private FtVideoUrlInfoBean mediaResource;
    private String mTypeText;
    private QualityPickPopup qualityPickPopup;
    private int aid;
    private long cid;

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
    }

    public void setVideoId(int aid, long cid) {
        this.aid = aid;
        this.cid = cid;
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
        gsyBaseVideoPlayer.aid = aid;
        gsyBaseVideoPlayer.cid = cid;
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
            aid = gsyBaseVideoPlayer.aid;
            cid = gsyBaseVideoPlayer.cid;
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
                                mTmpManager = GSYVideoManager.tmpInstance(gsyMediaPlayerListener);
                                mTmpManager.initContext(getContext().getApplicationContext());
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
                GSYVideoBaseManager manager = GSYVideoManager.instance();
                GSYVideoManager.changeManager(mTmpManager);
                mTmpManager.setLastListener(manager.lastListener());
                mTmpManager.setListener(manager.listener());

                manager.setDisplay(null);

                Debuger.printfError("**** showDisplay onSeekComplete ***** " + mSurface);
                Debuger.printfError("**** showDisplay onSeekComplete isValid***** " + mSurface.isValid());
                mTmpManager.setDisplay(mSurface);
                changeUiToPlayingClear();
                resolveChangedResult(true);
                manager.releaseMediaPlayer();
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
}
