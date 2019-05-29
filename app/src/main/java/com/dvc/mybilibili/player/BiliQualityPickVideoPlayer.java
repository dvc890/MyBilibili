package com.dvc.mybilibili.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.entity.IMediaResource;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;
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
    private IMediaResource mediaResource;
    private String mTypeText;
    private QualityPickPopup qualityPickPopup;

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

    public boolean setUp(IMediaResource mediaResource, boolean cacheWithPlay, String title) {
        this.mediaResource = mediaResource;
//        if(this.mediaResource.getFTVideoMaterialUrl().toLowerCase().contains("quic")) {
//            PlayerFactory.setPlayManager(Exo2PlayerManager.class);
//        } else {
//            PlayerFactory.setPlayManager(IjkPlayerManager.class);
//        }
        final String url = getVideoUrl(mSourcePosition);
        mTypeText = getDescString(mSourcePosition)/*.split(" ")[1]*/;
        mSwitchSize.setText(mTypeText);
        mSwitchSize.setVisibility(GONE);
        return setUp(url, cacheWithPlay, title);
    }

    public <M extends IMediaResource> M getMediaResource() {
        return (M)mediaResource;
    }

    private String getVideoUrl(int position) {
        if(getMediaResource() instanceof MediaResource) {
            MediaResource mediaResource = getMediaResource();
            try {
                return mediaResource.getVideoUrl(mediaResource.support_quality.get(position)).replace("quic://", "http://");
            }catch (Exception e) {
                return mediaResource.getVideoUrl().replace("quic://", "http://");
            }
        }
        return getMediaResource().getVideoUrl().replace("quic://", "http://");
    }

    private String getDescString(int position) {
        try {
            return getMediaResource().support_description.get(position);
        }catch (Exception e) {
            return mContext.getString(R.string.player_quality_switch_mode_auto1);
        }
    }

    private void showSwitchPop() {
        this.qualityPickPopup.setSelected(mSourcePosition);
        this.qualityPickPopup.setData(getMediaResource().support_quality, getMediaResource().support_description);
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
                final String url = getVideoUrl(position);
                cancelProgressTimer();
                hideAllWidget();
                if (mTitle != null && mTitleTextView != null) {
                    mTitleTextView.setText(mTitle);
                }
                mPreSourcePosition = mSourcePosition;
                isChanging = true;
                mSourcePosition = position;
                //创建临时管理器执行加载播放
                mTmpManager = GSYVideoManager.tmpInstance(gsyMediaPlayerListener);
                mTmpManager.initContext(getContext().getApplicationContext());
                resolveChangeUrl(mCache, mCachePath, url);
                mTmpManager.prepare(mUrl, mMapHeadData, mLooping, mSpeed, mCache, mCachePath, null);
                changeUiToPlayingBufferingShow();
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
            this.mUrl = url;
        }
    }

    private void resolveChangedResult() {
        isChanging = false;
        mTmpManager = null;
        final String name = getDescString(mSourcePosition);
        final String url = getVideoUrl(mSourcePosition);
        mTypeText = name/*.split(" ")[1]*/;
        mSwitchSize.setText(mTypeText);
        resolveChangeUrl(mCache, mCachePath, url);
        hideLoading();
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
                resolveChangedResult();
                manager.releaseMediaPlayer();
            }
        }

        @Override
        public void onError(int what, int extra) {
            mSourcePosition = mPreSourcePosition;
            if (mTmpManager != null) {
                mTmpManager.releaseMediaPlayer();
            }
            post(new Runnable() {
                @Override
                public void run() {
                    resolveChangedResult();
                    RxToast.error("change Fail");
                }
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
