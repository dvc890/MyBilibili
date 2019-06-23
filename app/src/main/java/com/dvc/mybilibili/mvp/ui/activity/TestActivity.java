package com.dvc.mybilibili.mvp.ui.activity;

import android.Manifest;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.response.GeneralResponse;
import com.dvc.mybilibili.mvp.model.api.service.bililive.BiliLiveApiV2Service;
import com.dvc.mybilibili.mvp.model.api.service.livestream.LiveStreamApiService;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomStartLiveInfo;
import com.dvc.mybilibili.mvp.model.api.service.livestream.entity.LiveStreamingRoomStopLiveInfo;
import com.dvc.mybilibili.mvp.model.api.service.video.VideoApiService;
import com.dvc.mybilibili.player.BiliVideoPlayer;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.vondear.rxtool.RxLogTool;
import com.vondear.rxtool.view.RxToast;

import java.io.IOException;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;

public class TestActivity extends DaggerAppCompatActivity implements Camera.PreviewCallback, SurfaceHolder.Callback {

    @BindView(R.id.animation_view)
    LottieAnimationView lottieAnimationView;
    @BindView(R.id.bilivideoplayer)
    BiliVideoPlayer biliVideoPlayer;
    //    @BindView(R.id.animation_view2)
//    SVGAImageView svgaImageView;
    @BindView(R.id.camera_surface)
    SurfaceView cameraView;

    OrientationUtils orientationUtils;

    @Inject
    VideoApiService videoApiService;
    @Inject
    BiliLiveApiV2Service liveApiV2Service;
    @Inject
    LiveStreamApiService liveStreamApiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bili_app_activity_test);
        ButterKnife.bind(this);
        lottieAnimationView.playAnimation();
//        svgaImageView.startAnimation();
//        String source1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";
//        biliVideoPlayer.setUp(source1, true, "测试视频");
//        biliVideoPlayer.setFristStart(v ->
//                biliVideoPlayer.startPlayLogic());
//        biliVideoPlayer.startPlayLogic();
//        Debuger.enable();
        new RxPermissions(this)
                .request(Manifest.permission.CAMERA,
                        Manifest.permission.RECORD_AUDIO)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(b -> {
                    if (true) cameraView.getHolder().addCallback(this);
                });
    }


    @OnClick({R.id.start, R.id.stop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.start:
                liveStreamApiService.startLiveStreaming(884852, 2, 1, "unicom")
                        .compose(RxSchedulersHelper.ioAndMainThread())
                        .subscribe(new ObserverCallback<GeneralResponse<LiveStreamingRoomStartLiveInfo>>() {
                            @Override
                            public void onSuccess(GeneralResponse<LiveStreamingRoomStartLiveInfo> liveStreamingRoomStartLiveInfoGeneralResponse) throws IOException {
                                liveStreamingRoomStartLiveInfoGeneralResponse.isSuccess();
                            }

                            @Override
                            public void onError(BiliApiException apiException, int code) {
                                apiException.canRetry();
                            }
                        });
                break;
            case R.id.stop:
                liveStreamApiService.stopLiveStreaming(884852)
                        .compose(RxSchedulersHelper.ioAndMainThread())
                        .subscribe(new ObserverCallback<GeneralResponse<LiveStreamingRoomStopLiveInfo>>() {
                            @Override
                            public void onSuccess(GeneralResponse<LiveStreamingRoomStopLiveInfo> liveStreamingRoomStopLiveInfoGeneralResponse) throws IOException {
                                liveStreamingRoomStopLiveInfoGeneralResponse.isSuccess();
                            }

                            @Override
                            public void onError(BiliApiException apiException, int code) {
                                apiException.canRetry();
                            }
                        });
                break;
        }
    }

    private void testCamera(SurfaceHolder holder) {
        Camera camera = Camera.open(1);
        Camera.Parameters parameters = camera.getParameters();
        for (Camera.Size size : parameters.getSupportedPictureSizes()) {
            RxLogTool.d(size.width + "  " + size.height);
        }
        RxLogTool.d("============");
        for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
            RxLogTool.d(size.width + "  " + size.height);
        }
//        parameters.setPreviewSize(1080,1920);
//        parameters.setPreviewFpsRange(30000, 30000);
        parameters.setPictureFormat(ImageFormat.NV21); // 设置图片格式
        camera.setParameters(parameters);
        try {
            camera.setPreviewDisplay(holder);
            camera.setPreviewCallbackWithBuffer(this);
            camera.addCallbackBuffer(new byte[parameters.getPreviewSize().width* parameters.getPreviewSize().height*3 / 2]);
            camera.startPreview(); // 开始预览
            camera.autoFocus((success, camera1) -> {
                camera.setDisplayOrientation(90);
            }); // 自动对焦
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    @Override
    public void onPreviewFrame(byte[] data, Camera camera) {
        RxLogTool.e(data);
        camera.addCallbackBuffer(data);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        testCamera(holder);
        RxToast.info("surfaceCreated");
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        RxToast.info("surfaceChanged:" + format + " " + width + " " + height);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        RxToast.info("surfaceDestroyed:");
    }
}
