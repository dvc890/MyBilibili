package com.dvc.mybilibili.danmaku.live.parser;

import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.json.JSONObject;

@SocketMsgType(types = {"ROOM_RANK", "WIN_ACTIVITY", "LOL_ACTIVITY", "USER_TITLE_GET", "MESSAGEBOX_USER_GAIN_MEDAL", "SCORE_CARD", "USER_INFO_UPDATE", "BOX_ACTIVITY_START", "ROOM_SKIN_MSG"})
public class SocketRoomInfoParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {
    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {

    }
}
