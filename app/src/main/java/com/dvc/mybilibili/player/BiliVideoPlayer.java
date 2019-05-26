package com.dvc.mybilibili.player;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dvc.mybilibili.R;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BiliVideoPlayer extends StandardGSYVideoPlayer {

    ImageView mCoverImage;
    String mCoverOriginUrl;
    OnClickListener fristStart;

    @BindView(R.id.startfristbtn)
    ImageView startfristbtn;
    private SeekBar brightnessBar;

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
        setShowFullAnimation(false);
    }

    @Override
    protected void updateStartImage() {
        ImageView imageView = (ImageView) mStartButton;
        if (mCurrentState == CURRENT_STATE_PLAYING) {
            imageView.setImageResource(R.drawable.bili_player_play_can_pause);
            startfristbtn.setVisibility(GONE);
        } else if (mCurrentState == CURRENT_STATE_ERROR) {
            imageView.setImageResource(R.drawable.bili_player_play_can_play);
            startfristbtn.setVisibility(VISIBLE);
        } else {
            imageView.setImageResource(R.drawable.bili_player_play_can_play);
        }
    }

    public void loadCoverImage(String url) {
        mCoverImage = (ImageView) findViewById(R.id.thumbImage);
        mCoverOriginUrl = url;
        Glide.with(getContext().getApplicationContext())
                .setDefaultRequestOptions(
                        new RequestOptions()
                                .frame(1000000)
                                .centerCrop())
                .load(url)
                .into(mCoverImage);
    }

    public void setFristStartClickListener(OnClickListener onClickListener) {
        fristStart = onClickListener;
    }

    @OnClick(R.id.startfristbtn)
    public void loadVideoClick(View v) {
        if(fristStart != null) fristStart.onClick(v);
    }

    @Override
    public void startPlayLogic() {
        super.startPlayLogic();
        startfristbtn.setVisibility(GONE);
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
    public boolean isNeedLockFull() {
        return true;
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
    protected int getBrightnessLayoutId() {
        return R.layout.bili_view_video_brightness;
    }

    /**
     * 亮度dialog的百分比text id
     */
    protected int getBrightnessTextId() {
        return 0;
    }

    /**
     * 音量dialog的layoutId
     */
    protected int getVolumeLayoutId() {
        return R.layout.bili_view_video_volume;
    }

    /**
     * 音量dialog的百分比进度条 id
     */
    protected int getVolumeProgressId() {
        return R.id.volume_level;
    }

    /**
     * 触摸进度dialog的layoutId
     */
    protected int getProgressDialogLayoutId() {
        return R.layout.bili_view_video_progresstips;
    }

    /**
     * 触摸进度dialog的进度条id
     */
    protected int getProgressDialogProgressId() {
        return 0;
    }

    /**
     * 触摸进度dialog的当前时间文本
     */
    protected int getProgressDialogCurrentDurationTextId() {
        return R.id.tv_current;
    }

    /**
     * 触摸进度dialog全部时间文本
     */
    protected int getProgressDialogAllDurationTextId() {
        return R.id.tv_duration;
    }

    /**
     * 触摸进度dialog的图片id
     */
    protected int getProgressDialogImageId() {
        return 0;
    }
}
