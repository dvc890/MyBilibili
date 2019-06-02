package com.dvc.mybilibili.danmaku.live.parser;

import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.json.JSONObject;

@SocketMsgType(types = {"LIVE", "PREPARING", "ROOM_LIMIT", "WARNING", "CUT_OFF", "ROOM_REFRESH", "ROOM_REAL_TIME_MESSAGE_UPDATE"})
public class SocketLiveParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {

    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {

    }
}
