package io.kickflip.sdk;

import android.os.Handler;

import com.dvc.base.utils.Reflect;

import java.util.Map;

import io.kickflip.sdk.jni.RTMPAVTransfers;

public class RTMPTool {
    private MyRTMPAVTransfers transfers;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
    public static RTMPTool get = new RTMPTool();

    private class MyRTMPAVTransfers extends RTMPAVTransfers {
        private Handler superHandler;
        public MyRTMPAVTransfers(int i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            super(i, uncaughtExceptionHandler);
            for(Map.Entry<String, Reflect> o : Reflect.on(this).fields().entrySet()) {
                if(o.getValue().get() == null) continue;
                if(o.getValue().type().equals(Handler.class)) {
                    superHandler = o.getValue().get();
                    break;
                }
            }
        }
        public void sendAudioBuffer(final byte[] audiobuf, final long time) {
            superHandler.post(new Runnable() {
                @Override
                public void run() {
                    if(isConnected())
                    nativeSendAudioBuffer(audiobuf, audiobuf.length, time / 1000L);
                }
            });
        }
        public void sendVideoBuffer(final byte[] videobuf, final long time1, final long time2) {
            superHandler.post(new Runnable() {
                @Override
                public void run() {
                    if(!isConnected()) return;
                    boolean var6 = nativeSendVideoBuffer(videobuf, videobuf.length, time1 / 1000L, time2 / 1000L);
                }
            });

        }
    }

    private RTMPTool() {
        uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        transfers = new MyRTMPAVTransfers(1, uncaughtExceptionHandler);
    }

    public void connectServer(String rtmpurl) {
        transfers.a(rtmpurl);
    }

    public void disconnectServer() {
        transfers.b();
    }

    public void sendVideoMeta(int width, int height, int framerate, double sampleRate, double sampleSize) {
        RTMPAVTransfers.a a = new RTMPAVTransfers.a();
        a.a = width;
        a.b = height;
        a.c = framerate;
        a.e = sampleRate;
        a.f = sampleSize;
        transfers.a(a);
    }

    public void sendVideoSPSPPS(byte[] sps, byte[] pps) {
        transfers.a(sps, sps.length, pps, pps.length);
    }

    public void sendAudioSpec(byte[] audiospec) {
        transfers.a(audiospec);
    }

    public void sendAudioBuffer(byte[] audiobuf, long time) {
        transfers.sendAudioBuffer(audiobuf, time);
    }

    public void sendVideoBuffer(byte[] videobuf, long time1, long time2) {
        transfers.sendVideoBuffer(videobuf, time1, time2);
    }

    public void notWaitConnect() {
        transfers.a();
    }

    public void exit() {
        transfers.c();
    }
}
