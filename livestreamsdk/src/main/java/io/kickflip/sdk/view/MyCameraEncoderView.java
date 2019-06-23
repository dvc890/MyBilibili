package io.kickflip.sdk.view;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.widget.Toast;

import com.vondear.rxtool.RxLogTool;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.kickflip.sdk.RTMPTool;

import static android.media.MediaFormat.KEY_BIT_RATE;
import static android.media.MediaFormat.KEY_MAX_INPUT_SIZE;

public class MyCameraEncoderView extends SurfaceView implements Camera.PreviewCallback {

    private static final String VCODEC_MIME = "video/avc";
    private final int FRAME_RATE = 15;
    private int MAX_BUFFER_SIZE = 8192;
    static final int NAL_SPS = 7;
    private boolean isStreaming = false;
    Camera camera;
    private volatile CameraHandler handler;
    private int cameraId;
    private int facing;
    private String flashMode;
    private MediaCodec mMediaCodec;
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private AudioRecord mAudioRecord;
    private MediaCodec mAudioCodec;
    private int aSampleRate;
    private int aChanelCount;
    private byte[] aBuffer;
    private long presentationTimeUs;
    private MediaCodec.BufferInfo aBufferInfo = new MediaCodec.BufferInfo();
    private Thread recordThread;

    public MyCameraEncoderView(Context context) {
        super(context);
        init();
    }

    public MyCameraEncoderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCameraEncoderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        handler = new CameraHandler(new HandlerThread("Camera").getLooper());
        initMediaCodec();
        initAudioDevice();
    }

    public boolean isStreaming() {
        return isStreaming;
    }

    public void startPush(String rtmpurl) {
        isStreaming = true;
        RTMPTool.get.connectServer(rtmpurl);
        RTMPTool.get.sendVideoMeta(this.camera.getParameters().getPreviewSize().width, this.camera.getParameters().getPreviewSize().height, FRAME_RATE, aSampleRate, aBuffer.length);
    }

    public void stopPush() {
        isStreaming = false;
        RTMPTool.get.disconnectServer();
    }

    public void requestCamera(int cameraId) {
        if (Camera.getNumberOfCameras() != 1 && this.cameraId != cameraId) {
            this.cameraId = cameraId;
            if (this.camera != null) {
                this.handler.sendMessage(this.handler.obtainMessage(5));
                this.handler.sendMessage(this.handler.obtainMessage(4));
            }
        }
    }

    public void exit() {
        if(isStreaming()) stopPush();
        releaseCamera();
        if (recordThread != null) {
            recordThread.interrupt();
        }
        mAudioRecord.stop();
        mAudioRecord.release();
        mAudioCodec.stop();
        mAudioCodec.release();
        mMediaCodec.stop();
        mMediaCodec.release();
    }

    private void startPreview() {
        try {
            this.initCameraConfig(getWidth(), getHeight(), facing);
        } catch (RuntimeException var3) {
            if (!checkPermission()) {
                Toast.makeText(getContext(), "获取摄像头失败，请允许相关权限~", Toast.LENGTH_SHORT).show();
            }

            Log.e("CameraEncoder", "未获摄像头取到相关权限");
        }

        try {
            this.camera.setPreviewCallbackWithBuffer(this);
            this.camera.addCallbackBuffer(new byte[this.camera.getParameters().getPreviewSize().width* this.camera.getParameters().getPreviewSize().height*3 / 2]);
            this.camera.setPreviewDisplay(getHolder());
            this.camera.startPreview();
            recordThread = new Thread(fetchAudioRunnable());
            presentationTimeUs = new Date().getTime() * 1000;
            mAudioRecord.startRecording();
        } catch (IOException var2) {
        }

    }

    private void initCameraConfig(int w, int h, int facing) {
        if (this.camera != null) {
            throw new RuntimeException("camera already initialized");
        } else {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int cameraNum = Camera.getNumberOfCameras();
            int tfacing = facing;
            label59:
            while (true) {
                for(int id = 0; id < cameraNum; id++) {
                    Camera.getCameraInfo(id, cameraInfo);
                    if (cameraInfo.facing == tfacing) {
                        this.camera = Camera.open(id);
                        this.facing = tfacing;
                        this.cameraId = id;
                        break label59;
                    }
                }
                if (this.camera == null) {
                    if (tfacing == facing) {
                        if (facing == 0) {
                            tfacing = 1;
                        } else {
                            tfacing = 0;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (this.camera == null) {
                this.facing = -1;
                throw new RuntimeException("Unable to open camera");
            } else {
                Camera.Parameters parameters = this.camera.getParameters();
//                this.a(parameters);
                parameters.setPictureFormat(ImageFormat.YV12); // 设置图片格式
                List focusModes = parameters.getSupportedFocusModes();
                if (focusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (focusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                List flashModes = parameters.getSupportedFlashModes();
                if(this.flashMode != null && flashModes.contains(flashMode)) {
                    parameters.setFlashMode(this.flashMode);
                } else
                    parameters.setFlashMode("off");
                parameters.setRecordingHint(true);
                this.setPreviewSize(parameters, w, h);
                this.camera.setParameters(parameters);
                int[] previewFpsRange = new int[2];
                Camera.Size previewSize = parameters.getPreviewSize();
                parameters.getPreviewFpsRange(previewFpsRange);
            }
        }
    }

    private void releaseCamera() {

        if (this.camera != null) {
            try {
                this.camera.stopPreview();
                this.camera.release();
            } catch (Exception var5) {
                StringBuilder var2 = new StringBuilder();
                var2.append("releasing camera error:");
                var2.append(var5.getMessage());
                Log.e("CameraEncoder", var2.toString());
            } finally {
                this.camera = null;
            }
        }

    }

    private static boolean checkPermission() {
        return (Build.VERSION.SDK_INT >= 23);
    }

    private void setPreviewSize(Camera.Parameters parameters, int w, int h) {
        Camera.Size var4 = findSize(parameters, w, h);
        if (var4 != null) {
            parameters.setPreviewSize(var4.width, var4.height);
        }

    }

    private static Camera.Size findSize(Camera.Parameters parameters, int w, int h) {
        Camera.Size var3 = parameters.getPreferredPreviewSizeForVideo();
        if (var3 != null && 1.0E-4F >= Math.abs((float)var3.width * 1.0F / (float)var3.height - 1.7777778F)) {
            return var3;
        } else {
            int var4 = w;
            int var5 = h;
            if (h > w) {
                var5 = w;
                var4 = h;
            }

            List var9 = parameters.getSupportedPreviewSizes();
            float var6 = 3.4028235E38F;
            Iterator var7 = var9.iterator();
            Camera.Size var10 = var3;

            while(var7.hasNext()) {
                var3 = (Camera.Size)var7.next();
                float var8 = Math.abs((float)var3.width * 1.0F / (float)var3.height - 1.7777778F);
                if (var8 < var6 && var3.width >= var4 && var3.height >= var5) {
                    var10 = var3;
                    var6 = var8;
                }
            }

            return var10;
        }
    }

    @Override
    public void onPreviewFrame(byte[] data, Camera camera) {
        final byte[] tmp = data.clone();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                if(isStreaming()) onGetVideoFrame(tmp);
            }
        });
        camera.addCallbackBuffer(data);
    }

    private Runnable fetchAudioRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                RxLogTool.d("录音线程开始");
                while (isStreaming() && mAudioRecord != null && !Thread.interrupted()) {
                    int size = mAudioRecord.read(aBuffer, 0, aBuffer.length);
                    if (size < 0) {
                        RxLogTool.i( "audio ignore ,no data to read");
                        break;
                    }
                    if (isStreaming()) {
                        byte[] audio = new byte[size];
                        System.arraycopy(aBuffer, 0, audio, 0, size);
                        onGetPcmFrame(audio);
                    }
                }
            }
        };
    }

    private void initAudioDevice() {
        int[] sampleRates = {44100, 22050, 16000, 11025};
        for (int sampleRate :
                sampleRates) {
            //编码制式
            int audioFormat = AudioFormat.ENCODING_PCM_16BIT;
            // stereo 立体声，
            int channelConfig = AudioFormat.CHANNEL_CONFIGURATION_STEREO;
            int buffsize = 2 * AudioRecord.getMinBufferSize(sampleRate, channelConfig, audioFormat);
            mAudioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC, sampleRate, channelConfig,
                    audioFormat, buffsize);
            if (mAudioRecord.getState() != AudioRecord.STATE_INITIALIZED) {
                continue;
            }
            aSampleRate = sampleRate;
            aChanelCount = channelConfig == AudioFormat.CHANNEL_CONFIGURATION_STEREO ? 2 : 1;
            aBuffer = new byte[Math.min(4096, buffsize)];
        }
    }

    private void onGetVideoFrame(byte[] buf) {
        final int LENGTH = getHeight() * getWidth();
        //YV12数据转化成COLOR_FormatYUV420Planar
        RxLogTool.d(LENGTH + "  " + (buf.length - LENGTH));
        for (int i = LENGTH; i < (LENGTH + LENGTH / 4); i++) {
            byte temp = buf[i];
            buf[i] = buf[i + LENGTH / 4];
            buf[i + LENGTH / 4] = temp;
//            char x = 128;
//            buf[i] = (byte) x;
        }
        ByteBuffer[] inputBuffers = mMediaCodec.getInputBuffers();
        ByteBuffer[] outputBuffers = mMediaCodec.getOutputBuffers();
        try {
            //查找可用的的input buffer用来填充有效数据
            int bufferIndex = mMediaCodec.dequeueInputBuffer(-1);
            if (bufferIndex >= 0) {
                //数据放入到inputBuffer中
                ByteBuffer inputBuffer = inputBuffers[bufferIndex];
                inputBuffer.clear();
                inputBuffer.put(buf, 0, buf.length);
                //把数据传给编码器并进行编码
                mMediaCodec.queueInputBuffer(bufferIndex, 0,
                        inputBuffers[bufferIndex].position(),
                        System.nanoTime() / 1000, 0);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();

                //输出buffer出队，返回成功的buffer索引。
                int outputBufferIndex = mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                while (outputBufferIndex >= 0) {
                    ByteBuffer outputBuffer = outputBuffers[outputBufferIndex];
                    //进行flv封装
                    onEncodedAvcFrame(outputBuffer, bufferInfo);
                    mMediaCodec.releaseOutputBuffer(outputBufferIndex, false);
                    outputBufferIndex = mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            } else {
                RxLogTool.w("No buffer available !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onGetPcmFrame(byte[] data) {
        ByteBuffer[] inputBuffers = mAudioCodec.getInputBuffers();
        ByteBuffer[] outputBuffers = mAudioCodec.getOutputBuffers();
        int inputBufferId = mAudioCodec.dequeueInputBuffer(-1);
        if (inputBufferId >= 0) {
            ByteBuffer bb = inputBuffers[inputBufferId];
            bb.clear();
            bb.put(data, 0, data.length);
            long pts = new Date().getTime() * 1000 - presentationTimeUs;
            mAudioCodec.queueInputBuffer(inputBufferId, 0, data.length, pts, 0);
        }

        for (; ; ) {
            int outputBufferId = mAudioCodec.dequeueOutputBuffer(aBufferInfo, 0);
            if (outputBufferId >= 0) {
                // outputBuffers[outputBufferId] is ready to be processed or rendered.
                ByteBuffer bb = outputBuffers[outputBufferId];
                onEncodeAacFrame(bb, aBufferInfo);
                mAudioCodec.releaseOutputBuffer(outputBufferId, false);
            }
            if (outputBufferId < 0) {
                break;
            }
        }
    }

    private void onEncodedAvcFrame(ByteBuffer bb, MediaCodec.BufferInfo vBufferInfo) {
        int offset = 4;
        //判断帧的类型
        if (bb.get(2) == 0x01) {
            offset = 3;
        }

        int type = bb.get(offset) & 0x1f;
        if (type == NAL_SPS) {
            //[0, 0, 0, 1, 103, 66, -64, 13, -38, 5, -126, 90, 1, -31, 16, -115, 64, 0, 0, 0, 1, 104, -50, 6, -30]
            //打印发现这里将 SPS帧和 PPS帧合在了一起发送
            // SPS为 [4，len-8]
            // PPS为后4个字节
            //so .
            byte[] pps = new byte[4];
            byte[] sps = new byte[vBufferInfo.size - 12];
            bb.getInt();// 抛弃 0,0,0,1
            bb.get(sps, 0, sps.length);
            bb.getInt();
            bb.get(pps, 0, pps.length);
            RxLogTool.d("解析得到 sps:" + Arrays.toString(sps) + ",PPS=" + Arrays.toString(pps));
            RTMPTool.get.sendVideoSPSPPS(sps, pps);
        } else {
            byte[] bytes = new byte[vBufferInfo.size];
            bb.get(bytes);
            RTMPTool.get.sendVideoBuffer(bytes,
                    vBufferInfo.presentationTimeUs, System.currentTimeMillis());
        }

    }

    private void onEncodeAacFrame(ByteBuffer bb, MediaCodec.BufferInfo aBufferInfo) {

        // 1.界定符 FF F1
        // 2.加上界定符的前7个字节是帧描述信息
        // 3.AudioDecoderSpecificInfo 长度为2个字节如果是44100 改值为0x1210

        //http://blog.csdn.net/avsuper/article/details/24661533
        //http://www.tuicool.com/articles/aYvmua


        if (aBufferInfo.size == 2) {
//            https://my.oschina.net/zhangxu0512/blog/204070
//            faacEncSetConfiguration(m_hEncoder, pConfiguration);
//            int ret = faacEncGetDecoderSpecificInfo(m_hEncoder, &m_pSpc, &m_nSpc);

//            //AAC sequence header
//            int[] mpeg4audio_sample_rates = {
//                    96000, 88200, 64000, 48000, 44100, 32000,
//                    24000, 22050, 16000, 12000, 11025, 8000, 7350
//            };
//
//            int m_keyframe[] = new int[2];
//            //get keyframe info.
//            int index;
//            for (index = 0; index < 16; index++) {
//                if (aSampleRate == mpeg4audio_sample_rates[index]) {
//                    break;
//                }
//            }
//            m_keyframe[0] = 0x02 << 3 | index >> 1;
//            m_keyframe[1] = (index & 0x01) << 7 | aChanelCount << 3;
//
//            Log.d(TAG,"挂件"+Arrays.toString(m_keyframe));
            // 我打印发现，这里应该已经是吧关键帧计算好了，所以我们直接发送
            byte[] bytes = new byte[2];
            bb.get(bytes);
            RTMPTool.get.sendAudioSpec(bytes);

        }else{
            byte[] bytes = new byte[aBufferInfo.size];
            bb.get(bytes);
            RTMPTool.get.sendAudioBuffer(bytes, aBufferInfo.presentationTimeUs);
        }

    }

    private void initMediaCodec() {
        int bitrate = 2 * getWidth() * getHeight() * FRAME_RATE / 20;
        try {
            MediaCodecInfo mediaCodecInfo = selectCodec(VCODEC_MIME);
            if (mediaCodecInfo == null) {
                Toast.makeText(getContext(), "mMediaCodec null", Toast.LENGTH_LONG).show();
                throw new RuntimeException("mediaCodecInfo is Empty");
            }
            RxLogTool.w("MediaCodecInfo " + mediaCodecInfo.getName());
            mMediaCodec = MediaCodec.createByCodecName(mediaCodecInfo.getName());
            MediaFormat mediaFormat = MediaFormat.createVideoFormat(VCODEC_MIME, getWidth(), getHeight());
            mediaFormat.setInteger(KEY_BIT_RATE, bitrate);
            mediaFormat.setInteger(MediaFormat.KEY_FRAME_RATE, FRAME_RATE);
            mediaFormat.setInteger(MediaFormat.KEY_COLOR_FORMAT,
                    MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Planar);
            mediaFormat.setInteger(MediaFormat.KEY_I_FRAME_INTERVAL, 1);
            mMediaCodec.configure(mediaFormat, null, null, MediaCodec.CONFIGURE_FLAG_ENCODE);
            mMediaCodec.start();

            mAudioCodec = MediaCodec.createEncoderByType(MediaFormat.MIMETYPE_AUDIO_AAC);
            MediaFormat format = MediaFormat.createAudioFormat(MediaFormat.MIMETYPE_AUDIO_AAC,
                    aSampleRate, aChanelCount);
            format.setInteger(KEY_MAX_INPUT_SIZE, 0);
            format.setInteger(KEY_BIT_RATE, 1000 * 30);
            mAudioCodec.configure(format, null, null, MediaCodec.CONFIGURE_FLAG_ENCODE);
            mAudioCodec.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MediaCodecInfo selectCodec(String mimeType) {
        int numCodecs = MediaCodecList.getCodecCount();
        for (int i = 0; i < numCodecs; i++) {
            MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);
            //是否是编码器
            if (!codecInfo.isEncoder()) {
                continue;
            }
            String[] types = codecInfo.getSupportedTypes();
            RxLogTool.w(Arrays.toString(types));
            for (String type : types) {
                RxLogTool.e("equal " + mimeType.equalsIgnoreCase(type));
                if (mimeType.equalsIgnoreCase(type)) {
                    RxLogTool.e("codecInfo " + codecInfo.getName());
                    return codecInfo;
                }
            }
        }
        return null;
    }

    private class CameraHandler extends Handler {
        public CameraHandler(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 4:
                    startPreview();
                    break;
                case 5:
                    releaseCamera();
                    break;
            }
        }
    }
}
