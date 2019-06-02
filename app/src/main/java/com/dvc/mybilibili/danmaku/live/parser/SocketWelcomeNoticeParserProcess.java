package com.dvc.mybilibili.danmaku.live.parser;

import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.json.JSONObject;

@SocketMsgType(types = {"WELCOME", "ENTRY_EFFECT", "NOTICE_MSG", "LITTLE_TIPS"})
public class SocketWelcomeNoticeParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {
    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {

    }
}
