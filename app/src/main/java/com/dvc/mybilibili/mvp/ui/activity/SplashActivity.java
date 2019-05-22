package com.dvc.mybilibili.mvp.ui.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.SampleSplash;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.Splash;
import com.dvc.mybilibili.mvp.presenter.activity.SplashPresenter;
import com.vondear.rxtool.RxLogTool;

import javax.inject.Inject;

public class SplashActivity extends MvpBaseActivity<SplashView, SplashPresenter> implements SplashView{

    private static final String TAG = SplashActivity.class.getSimpleName();

    @Inject
    SplashPresenter splashPresenter;
    private VideoView videoAdView;
    private TextView text_skip;
    int mMaxProgress = 5;
    int mProgress = 0;

    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    @NonNull
    @Override
    public SplashPresenter createPresenter() {
        return splashPresenter;
    }

    @Override
    public int getContentViewResID() {
        // 解决APK安装后点打开按钮，打开程序后按home键后再通过APP图标唤醒会重新调用oncreate的问题
        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            finish();
            return 0;
        }
//        findViewById(android.R.id.content).setPadding(0, 0, 0, 0);
        return 0;
    }

    @Override
    protected void initViews() {
        in();
    }

    @Override
    protected void loadDatas() {
        presenter.loadSplash();
    }

    @Override
    public void updateProgress(Integer progress) {
        if (progress >= mMaxProgress) {
            to();
        } else {
            if(text_skip != null)
                text_skip.setText(getString(R.string.splash_skip,mMaxProgress-progress));
            mProgress = mMaxProgress - progress;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(videoAdView != null && !videoAdView.isPlaying()) {
            videoAdView.start();
        } else in();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(videoAdView != null && videoAdView.canPause()) videoAdView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoAdView != null) {
            videoAdView.stopPlayback();
            videoAdView = null;
        }
    }

    @Override
    public void onSplashData(Splash splash) {
        setContentView(R.layout.bili_app_activity_splash);
        mProgress = 0;
        mMaxProgress = splash.duration;
        TextView jump_tip = findViewById(R.id.jump_tip);
        TextView jump_app = findViewById(R.id.jump_app);
        text_skip = findViewById(R.id.text_skip);
        text_skip.setOnClickListener(v -> {
            to();
        });
        jump_tip.setText(splash.jumpTip);
        jump_app.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), R.string.no_look_ad, Toast.LENGTH_SHORT).show();
        });
        if(splash.isVideo()) {
            videoAdView = findViewById(R.id.video_ad_preview);
            videoAdView.setVisibility(View.VISIBLE);
            videoAdView.setVideoPath(splash.videoUrl);
            videoAdView.start();
            videoAdView.setOnCompletionListener((player)->{
                to();
            });
        }else {
            ImageView imageAdView = findViewById(R.id.image_ad_preview);
            imageAdView.setVisibility(View.VISIBLE);
            GlideUtils.Default2ImageView(imageAdView, splash.imageUrl, R.drawable.ic_splash_default);
        }
        RxLogTool.d(TAG, splash.toString());
    }

    @Deprecated
    @Override
    public void onSampleSplash(SampleSplash splashData) {

    }

    private void in() {
        presenter.countdownProgress(mProgress, mMaxProgress);
    }

    private void to() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
