package com.dvc.mybilibili.danmaku.live.runnable;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.dvc.mybilibili.danmaku.live.LiveDanMuReceiver;
import com.dvc.mybilibili.danmaku.live.PackageRepository;
import com.dvc.mybilibili.danmaku.live.entity.LiveEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.parser.SocketDanMuParserProcess;
import com.dvc.mybilibili.danmaku.live.parser.SocketLiveParserProcess;
import com.dvc.mybilibili.danmaku.live.parser.SocketMsgType;
import com.dvc.mybilibili.danmaku.live.parser.SocketRoomInfoParserProcess;
import com.dvc.mybilibili.danmaku.live.parser.SocketWelcomeNoticeParserProcess;
import com.vondear.rxtool.RxLogTool;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by czp on 17-5-24.
 */
public class CallbackDispatchRunnable implements Runnable {
//    private static final Logger log = LoggerFactory.getLogger(CallbackDispatchRunnable.class);

    private LiveDanMuReceiver liveDanMuReceiver;
    private InputStream inputStream;
    private List<ILiveDanMuCallback> callbacks;
    private byte[] jsonBytes;
    private ConcurrentHashMap<String, SocketMsgParserProcess> parserMaps;

    public CallbackDispatchRunnable(LiveDanMuReceiver liveDanMuReceiver, InputStream inputStream, List<ILiveDanMuCallback> callbacks) {
        this.liveDanMuReceiver = liveDanMuReceiver;
        this.inputStream = inputStream;
        this.callbacks = callbacks;
        initMsgParser();
    }

    private void initMsgParser() {
        this.parserMaps = new ConcurrentHashMap();
        addMsgParser(new SocketDanMuParserProcess());
        addMsgParser(new SocketLiveParserProcess());
        addMsgParser(new SocketWelcomeNoticeParserProcess());
        addMsgParser(new SocketRoomInfoParserProcess());
    }

    private void addMsgParser(SocketMsgParserProcess msgParserProcess) {
        SocketMsgType bjx = msgParserProcess.getClass().getAnnotation(SocketMsgType.class);
        if (bjx != null) {
            for (String type : bjx.types()) {
                this.parserMaps.put(type, msgParserProcess);
            }
            return ;
        }
        throw new IllegalArgumentException("must add Command annotation on your handler class!");
    }

    private SocketMsgParserProcess getMsgParser(String cmd) {
        if(parserMaps.containsKey(cmd)) {
            return parserMaps.get(cmd);
        }
        return null;
    }

    private void dispatch() throws Exception {
        byte[] packageBytes = PackageRepository.readNextPackage(inputStream);
        //如果没有回调函数直接开始监听下一个数据包
        if (callbacks.size() == 0) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(packageBytes);
        byteBuffer.position(PackageRepository.PACKAGE_LENGTH_BYTES_LENGTH);
        byte[] protocolBytes = new byte[PackageRepository.PACKAGE_PROTOCOL_BYTES_LENGTH];
        byteBuffer.get(protocolBytes);
        SocketMsgParserProcess<ILiveDanMuCallback> processer = null;
        JSONObject jSONObject = null;
        String cmd = "";
        if (Arrays.equals(protocolBytes, PackageRepository.DAN_MU_DATA_PACKAGE_PROTOCOL_BYTES)) {    //json数据包
            jsonBytes = new byte[byteBuffer.remaining()];
            byteBuffer.get(jsonBytes);
            RxLogTool.d("danmu", new String(jsonBytes));
            jSONObject = new JSONObject(new String(jsonBytes));
            cmd = jSONObject.optString("cmd");
            processer = getMsgParser(cmd);
        } else if (Arrays.equals(protocolBytes, PackageRepository.ONLINE_COUNT_PACKAGE_PROTOCOL_BYTES)) {    //在线人数数据包
            final int onlineCount = byteBuffer.getInt();
            RxLogTool.d("Viewers: " + onlineCount);
            processer = new SocketMsgParserProcess<ILiveDanMuCallback>() {
                @Override
                public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {

                }
            };
        } else {    //未知数据包
            RxLogTool.d("Unknown package below", new String(jsonBytes));
        }
        if (processer != null) {
            //fori 是为了避免 ConcurrentModificationException
            for (int i = 0; i < callbacks.size(); i++) {
                try {   //避免异常导致之后的所有回调被跳过
                    processer.process(cmd, jSONObject, callbacks.get(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                dispatch();
            } catch (IOException e) {   //socket关闭时退出
                if (liveDanMuReceiver.getSocket().isClosed()) {
                    break;
                }
            } catch (JSONException e) {
                RxLogTool.e("danmu", "Wrong JSON: " + new String(jsonBytes));
                e.printStackTrace();
            } catch (Exception e) { //其他错误时显示错误信息并继续监听下一个数据包
                RxLogTool.e("danmu", "another wrong");
                e.printStackTrace();
            }
        }

        try {
            liveDanMuReceiver.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //fori 是为了避免 ConcurrentModificationException
            for (int i = 0; i < callbacks.size(); i++) {
                try {
                    callbacks.get(i).onDisconnect();
                } catch (Exception e) { //出错时执行下一个
                    e.printStackTrace();
                }
            }
        }
    }
}
