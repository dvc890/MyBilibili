package com.dvc.mybilibili.danmaku.live;

import android.util.Log;

import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.runnable.CallbackDispatchRunnable;
import com.dvc.mybilibili.danmaku.live.runnable.HeartBeatRunnable;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig.BiliLiveSocketConfig;


import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Vector;


/**
 * DanMu receive API.
 * Created by czp on 17-5-24.
 */
public class LiveDanMuReceiver implements Closeable {

    private static final String TAG = LiveDanMuReceiver.class.getSimpleName();
    private static final int SOCKET_TIMEOUT = 10 * 1000;

    private static LiveDanMuReceiver instance;
    private long roomId;
    private Long random;
    private Socket socket;
    private List<ILiveDanMuCallback> callbacks = new Vector<>();
    private Thread heartBeatThread;
    private Thread callbackDispatchThread;

    /**
     * Class constructor, need room id.
     *
     * @param roomId the id of room
     */
    private LiveDanMuReceiver(int roomId) {
        this.roomId = roomId;
    }

    private LiveDanMuReceiver() {

    }

    public static synchronized LiveDanMuReceiver getInstance() {
        if (instance == null) {
            instance = new LiveDanMuReceiver();
        }
        return instance;
    }

    public Socket getSocket() {
        return socket;
    }

    /**
     * Add callback, it will be invoked on data incoming or lost connection.
     *
     * @param liveDanMuCallback the class which implements from ILiveDanMuCallback
     * @return self reference
     */
    public LiveDanMuReceiver addCallback(ILiveDanMuCallback liveDanMuCallback) {
        callbacks.add(liveDanMuCallback);
        return this;
    }

    /**
     * Remove callback.
     *
     * @param liveDanMuCallback the class which implements from ILiveDanMuCallback
     * @return is remove operation success
     */
    public boolean removeCallback(ILiveDanMuCallback liveDanMuCallback) {
        return callbacks.remove(liveDanMuCallback);
    }

    /**
     * Connect to live server.
     *
     * @return self reference
     * @throws IOException              when socket error
     * @throws IllegalArgumentException when room id invalid
     */
    public LiveDanMuReceiver connect(long roomId) throws IOException {
        this.roomId = roomId;
        BiliApplication.getDataManager().getApiHelper().getRoomSocketConfigV3(getRoomId())
                .compose(RxSchedulersHelper.AllioThread())
                .subscribe(new ObserverCallback<BiliLiveSocketConfig>() {

                    private Socket connectSocket(List<BiliLiveSocketConfig.DanmuHostPort> hostPortList) throws IOException {
                        IOException exception = new IOException();
                        for(int i = 0; i < hostPortList.size(); ) {
                            try {
                                return new Socket(hostPortList.get(0).getHost(),
                                        hostPortList.get(0).getPort());
                            } catch (IOException e) {
                                i++;
                                if(i == hostPortList.size()) exception = e;
                            }
                        }
                        throw exception;
                    }

                    @Override
                    public void onSuccess(BiliLiveSocketConfig biliLiveSocketConfig) throws IOException {

                        Socket socket = connectSocket(biliLiveSocketConfig.getServerList());
                        socket.setSoTimeout(SOCKET_TIMEOUT);
                        OutputStream outputStream = socket.getOutputStream();
                        //发送进房数据包
                        outputStream.write(PackageRepository.getJoinPackage(getRoomId()));
                        outputStream.flush();

                        InputStream inputStream = socket.getInputStream();

                        if (!PackageRepository.readAndValidateJoinSuccessPackage(inputStream)) {
                            socket.close();
                            Log.d(TAG, "Join live channel failed");
                        }

                        //定时发送心跳包
                        heartBeatThread = new Thread(new HeartBeatRunnable(outputStream));
                        heartBeatThread.start();
                        //启动回调分发线程
                        callbackDispatchThread = new Thread(new CallbackDispatchRunnable(LiveDanMuReceiver.this, inputStream, callbacks));
                        callbackDispatchThread.start();

                        //由于回调本身可能继续添加回调, 因此需要按下标循环处理直到不再产生新回调. 直接 forEach 会导致 ConcurrentModificationException
                        for (int i = 0; i < callbacks.size(); i++) {
                            callbacks.get(i).onConnect();
                        }
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        for (int i = 0; i < callbacks.size(); i++) {
                            callbacks.get(i).onConnectError(apiException);
                        }
                    }
                });


        return this;
    }

    /**
     * Close the connect and interrupt thread.
     *
     * @throws IOException inherit from Closeable
     * @see Closeable
     */
    @Override
    public void close() throws IOException {
        if (socket != null) {
            socket.close();
        }
        if (heartBeatThread != null) {
            try {
                heartBeatThread.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        callbacks.clear();
    }

    /**
     * Wait until CallbackDispatchThread exit.
     */
    public void waitUntilCallbackDispatchThreadExit() {
        if (callbackDispatchThread != null) {
            try {
                callbackDispatchThread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Get ROOMID
     */
    public long getRoomId() {
        return roomId;
    }

    /**
     * Get is socket connected.
     */
    public boolean isConnected() {
        return socket != null && socket.isConnected();
    }
}
