package com.dvc.mybilibili.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.airbnb.lottie.LottieAnimationView;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.video.VideoApiService;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.player.BiliVideoPlayer;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class TestActivity extends DaggerAppCompatActivity {

    @BindView(R.id.animation_view)
    LottieAnimationView lottieAnimationView;
    @BindView(R.id.bilivideoplayer)
    BiliVideoPlayer biliVideoPlayer;
//    @BindView(R.id.animation_view2)
//    SVGAImageView svgaImageView;

    OrientationUtils orientationUtils;

    @Inject
    VideoApiService videoApiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bili_app_activity_test);
        ButterKnife.bind(this);
        lottieAnimationView.playAnimation();
//        svgaImageView.startAnimation();
        String source1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";
        biliVideoPlayer.setUp(source1, true, "测试视频");
//        biliVideoPlayer.setFristStart(v ->
//                biliVideoPlayer.startPlayLogic());
        biliVideoPlayer.startPlayLogic();
        Debuger.enable();
    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        //如果旋转了就全屏
//        if (biliVideoPlayer.isInPlayingState()) {
//            biliVideoPlayer.onConfigurationChanged(this, newConfig, orientationUtils, true, true);
//        }
//    }

    @Override
    public void onBackPressed() {
        if (GSYVideoManager.backFromWindowFull(this)) {
            return;
        }
        super.onBackPressed();
    }
}
