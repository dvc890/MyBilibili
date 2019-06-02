package com.dvc.mybilibili.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.danmaku.live.PackageRepository;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.bililive.BiliLiveApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveDanmakuConfig;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.BiliLiveSocketConfig;
import com.dvc.mybilibili.mvp.model.api.service.video.VideoApiService;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.player.BiliVideoPlayer;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.functions.Consumer;

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
    @Inject
    BiliLiveApiV2Service liveApiV2Service;

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
//        biliVideoPlayer.startPlayLogic();
        Debuger.enable();

        liveApiV2Service.getRoomSocketConfigV3(21349375)
                .compose(RxSchedulersHelper.AllioThread())
                .subscribe(biliLiveSocketConfigGeneralResponse -> {
                    BiliLiveSocketConfig config = biliLiveSocketConfigGeneralResponse.data;
                    Socket socket = new Socket(config.getServerList().get(0).getHost(),
                            config.getServerList().get(0).getPort());
                    OutputStream outputStream = socket.getOutputStream();
                    //发送进房数据包
                    outputStream.write(PackageRepository.getJoinPackage(21349375));
                    outputStream.flush();

                    InputStream inputStream = socket.getInputStream();

                    if (!PackageRepository.readAndValidateJoinSuccessPackage(inputStream)) {
                        socket.close();
                        Log.d("dvc", "Join live channel failed");
                    }
                });
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
