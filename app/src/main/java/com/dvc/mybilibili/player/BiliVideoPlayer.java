package com.dvc.mybilibili.player;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.player.danmaku.DanMaKuHolder;
import com.dvc.mybilibili.player.manager.CustomManager;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import master.flame.danmaku.ui.widget.DanmakuView;

public class BiliVideoPlayer extends StandardGSYVideoPlayer {

    ImageView mCoverImage;
    String mCoverOriginUrl;
    OnClickListener fristStart;

    @BindView(R.id.startfristbtn)
    ImageView startfristbtn;
    @BindView(R.id.preview_layout)
    RelativeLayout mPreviewLayout;
    @BindView(R.id.preview_image)
    ImageView mPreView;

    private SeekBar brightnessBar;
    //是否打开滑动预览
    private boolean mOpenPreView = false;
    private int mPreProgress = -2;

    public BiliVideoPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public BiliVideoPlayer(Context context) {
        super(context);
    }

    public BiliVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.bili_player_controller;
    }

    @Override
    protected void init(Context context) {
        super.init(context);
        ButterKnife.bind(this, this);
        hideAllWidget();
        //全屏动画
        getFullscreenButton().setOnClickListener(v -> {
            setShowFullAnimation(false);
//            setRotateViewAuto(true);
//            setLockLand(true);
//            setRotateWithSystem(false);//不跟随系统转屏
            setAutoFullWithSize(true);
            //第一个true是否需要隐藏actionbar，第二个true是否需要隐藏statusbar
            startWindowFullscreen(mContext, true, true);
        });
    }

    @Override
    protected void updateStartImage() {
        ImageView imageView = (ImageView) mStartButton;
        if (getCurrentState() == CURRENT_STATE_PLAYING) {
            imageView.setImageResource(R.drawable.bili_player_play_can_pause);
            startfristbtn.setVisibility(GONE);
        } else if (getCurrentState() == CURRENT_STATE_ERROR) {
            imageView.setImageResource(R.drawable.bili_player_play_can_play);
            startfristbtn.setVisibility(VISIBLE);
        } else {
            imageView.setImageResource(R.drawable.bili_player_play_can_play);
        }
    }

    @Override
    public GSYVideoViewBridge getGSYVideoManager() {
        CustomManager.getCustomManager(getKey()).initContext(getContext().getApplicationContext());
        return CustomManager.getCustomManager(getKey());
    }

    @Override
    protected boolean backFromFull(Context context) {
        return CustomManager.backFromWindowFull(context, getKey());
    }

    @Override
    protected void releaseVideos() {
        CustomManager.releaseAllVideos(getKey());
    }


//    @Override
//    protected int getFullId() {
//        return CustomManager.FULLSCREEN_ID;
//    }
//
//    @Override
//    protected int getSmallId() {
//        return CustomManager.SMALL_ID;
//    }

    public String getKey() {
        if (mPlayPosition == -22) {
            Debuger.printfError(getClass().getSimpleName() + " used getKey() " + "******* PlayPosition never set. ********");
        }
        if (TextUtils.isEmpty(mPlayTag)) {
            Debuger.printfError(getClass().getSimpleName() + " used getKey() " + "******* PlayTag never set. ********");
        }
        return "MultiVideo" + mPlayPosition + mPlayTag;
    }

    public void loadCoverImage(String url) {
        setViewShowState(mLoadingProgressBar, GONE);
        mCoverImage = (ImageView) findViewById(R.id.thumbImage);
        mCoverOriginUrl = url;
        GlideUtils.Default2ImageView(mCoverImage, url, 0);
    }

    public void setFristStartClickListener(OnClickListener onClickListener) {
        fristStart = onClickListener;
    }

    @OnClick(R.id.startfristbtn)
    public void loadVideoClick(View v) {
        if(fristStart != null) fristStart.onClick(v);
        if(mHadPlay) {
            getStartButton().callOnClick();
        } else {
            startPlayLogic();
        }
    }

    @Override
    public void startPlayLogic() {
        super.startPlayLogic();
        if(mCoverImage != null) mCoverImage.setVisibility(GONE);
        if(startfristbtn != null) startfristbtn.setVisibility(GONE);
    }

    @Override
    public int getEnlargeImageRes(){
        return R.drawable.xplayer_live_ic_toggle_zoom_2;
    }

    @Override
    public int getShrinkImageRes() {
        return R.drawable.xplayer_live_ic_toggle_zoom_1;
    }

    @Override
    protected void lockTouchLogic() {
        if (mLockCurScreen) {
            mLockScreen.setImageResource(R.drawable.xplayer_ic_un_lock);
            mLockCurScreen = false;
        } else {
            mLockScreen.setImageResource(R.drawable.xplayer_ic_lock);
            mLockCurScreen = true;
            hideAllWidget();
        }
    }

    @Override
    protected void showBrightnessDialog(float percent) {
        if (mBrightnessDialog == null) {
            View localView = LayoutInflater.from(getActivityContext()).inflate(getBrightnessLayoutId(), null);
            brightnessBar = localView.findViewById(R.id.brightness_level);
            mBrightnessDialog = new Dialog(getActivityContext(), R.style.video_style_dialog_progress);
            mBrightnessDialog.setContentView(localView);
            mBrightnessDialog.getWindow().addFlags(8);
            mBrightnessDialog.getWindow().addFlags(32);
            mBrightnessDialog.getWindow().addFlags(16);
            mBrightnessDialog.getWindow().setLayout(-2, -2);
            WindowManager.LayoutParams localLayoutParams = mBrightnessDialog.getWindow().getAttributes();
            localLayoutParams.gravity = Gravity.TOP | Gravity.RIGHT;
            localLayoutParams.width = getWidth();
            localLayoutParams.height = getHeight();
            int location[] = new int[2];
            getLocationOnScreen(location);
            localLayoutParams.x = location[0];
            localLayoutParams.y = location[1];
            mBrightnessDialog.getWindow().setAttributes(localLayoutParams);
        }
        if (!mBrightnessDialog.isShowing()) {
            mBrightnessDialog.show();
        }
        brightnessBar.setProgress((int) (percent * 100));

    }

    /**
     * 亮度dialog的layoutId
     */
    @Override
    protected int getBrightnessLayoutId() {
        return R.layout.bili_view_video_brightness;
    }

    /**
     * 亮度dialog的百分比text id
     */
    @Override
    protected int getBrightnessTextId() {
        return 0;
    }

    /**
     * 音量dialog的layoutId
     */
    @Override
    protected int getVolumeLayoutId() {
        return R.layout.bili_view_video_volume;
    }

    /**
     * 音量dialog的百分比进度条 id
     */
    @Override
    protected int getVolumeProgressId() {
        return R.id.volume_level;
    }

    /**
     * 触摸进度dialog的layoutId
     */
    @Override
    protected int getProgressDialogLayoutId() {
        return R.layout.bili_view_video_progresstips;
    }

    /**
     * 触摸进度dialog的进度条id
     */
    @Override
    protected int getProgressDialogProgressId() {
        return 0;
    }

    /**
     * 触摸进度dialog的当前时间文本
     */
    @Override
    protected int getProgressDialogCurrentDurationTextId() {
        return R.id.tv_current;
    }

    /**
     * 触摸进度dialog全部时间文本
     */
    @Override
    protected int getProgressDialogAllDurationTextId() {
        return R.id.tv_duration;
    }

    /**
     * 触摸进度dialog的图片id
     */
    @Override
    protected int getProgressDialogImageId() {
        return 0;
    }


    public boolean isOpenPreView() {
        return mOpenPreView;
    }

    /**
     * 如果是需要进度条预览的设置打开，默认关闭
     */
    public void setOpenPreView(boolean localFile) {
        this.mOpenPreView = localFile;
    }

    public boolean getHadPlay() {
        return mHadPlay;
    }

    /**
     * 进入全屏模式
     * @return
     */
    @Override
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
        BiliVideoPlayer gsyBaseVideoPlayer = (BiliVideoPlayer) super.startWindowFullscreen(context, actionBar, statusBar);
        gsyBaseVideoPlayer.setOpenPreView(isOpenPreView());
        setIsTouchWiget(true);
        return gsyBaseVideoPlayer;
    }

    /**
     * 退出全屏模式
     */
    @Override
    protected void resolveNormalVideoShow(View oldF, ViewGroup vp, GSYVideoPlayer gsyVideoPlayer) {
        super.resolveNormalVideoShow(oldF, vp, gsyVideoPlayer);
        if (gsyVideoPlayer != null) {
            setIsTouchWiget(false);
        }
    }

    @Override
    public void onPrepared() {
        super.onPrepared();
        if(isIfCurrentIsFullscreen() && isOpenPreView())
            startDownFrame(mOriginUrl);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        super.onProgressChanged(seekBar, progress, fromUser);
        if(fromUser && isIfCurrentIsFullscreen() && isOpenPreView()) {

            int width = seekBar.getWidth();
            int time = progress * getDuration() / 100;
            int offset = (int) (width - (getResources().getDimension(R.dimen.seek_bar_image) / 2)) / 100 * progress;
            Debuger.printfError("***************** " + progress);
            Debuger.printfError("***************** " + time);
            showPreView(mOriginUrl, time);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mPreviewLayout.getLayoutParams();
            layoutParams.leftMargin = offset;
            //设置帧预览图的显示位置
            mPreviewLayout.setLayoutParams(layoutParams);
            if (mHadPlay && mOpenPreView) {
                mPreProgress = progress;
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        if (isOpenPreView() && isIfCurrentIsFullscreen()) {
            mPreviewLayout.setVisibility(VISIBLE);
            mPreProgress = -2;
        }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (isOpenPreView()) {
            if (mPreProgress >= 0) {
                seekBar.setProgress(mPreProgress);
            }
            super.onStopTrackingTouch(seekBar);
            mPreviewLayout.setVisibility(GONE);
        } else {
            super.onStopTrackingTouch(seekBar);
        }
    }

    private void showPreView(String url, long time) {
        int width = CommonUtil.dip2px(getContext(), 150);
        int height = CommonUtil.dip2px(getContext(), 100);
        Glide.with(getContext().getApplicationContext())
                .setDefaultRequestOptions(
                        new RequestOptions()
                                //这里限制了只从缓存读取
                                .onlyRetrieveFromCache(true)
                                .frame(1000 * time)
                                .override(width, height)
                                .dontAnimate()
                                .centerCrop())
                .load(url)
                .into(mPreView);
    }

    private void startDownFrame(String url) {
        for (int i = 1; i <= 100; i++) {
            int time = i * getDuration() / 100;
            int width = mPreView.getWidth();
            int height = mPreView.getHeight();
            Glide.with(getContext().getApplicationContext())
                    .setDefaultRequestOptions(
                            new RequestOptions()
                                    .frame(1000 * time)
                                    .override(width, height)
                                    .centerCrop())
                    .load(url).preload(width, height);

        }
    }

    public void releaseAllVideos() {
        CustomManager.releaseAllVideos(getKey());
    }

    public void pauseVideo() {
        ((CustomManager)getGSYVideoManager()).onPause(getKey());
    }

    public void resumeVideo() {
        ((CustomManager)getGSYVideoManager()).onResume(getKey());
    }
}
