package com.dvc.mybilibili.danmaku.live.parser;

import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SocketMsgType(types = {"DANMU_MSG", "ROOM_BLOCK_MSG", "USER_TOAST_MSG", "room_admin_entrance"})
public class SocketDanMuParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {

    private static final int DANMU_ATTR_INDEX = 0;

    @NotNull
    public String getLogTag() {
        return "live_socket";
    }

    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {
        String ccmd = cmd;
        if(cmd.contains(":")) ccmd = cmd.split(":")[0];
        switch (ccmd) {
            case "DANMU_MSG":
//                {"cmd":"DANMU_MSG:4:0:2:2:2:0","info":[[0,1,25,16777215,1559639767,32114652,0,"10499927",0,0,0],"泫雅的歌(･∀･)",[6834602,"芝芝莓莓w",0,0,0,10000,1,""],[],[12,0,6406234,"\u003e50000"],["",""],0,0,null,{"ts":1559639767,"ct":"CA962D53"}]}
                liveDanMuCallback.onDanMuMSGPackage(formatDanmu(jSONObject));
                break;
            case "ROOM_BLOCK_MSG":
//                m31079b(jSONObject);
                break;
            case "USER_TOAST_MSG":
//                m31080c(jSONObject);
                break;
            case "room_admin_entrance":
//                m31081d(jSONObject);
                break;
        }
    }

    private void m31081d(JSONObject jSONObject) {

    }

    private void m31080c(JSONObject jSONObject) {

    }

    private void m31079b(JSONObject jSONObject) {
//        jSONObject = jSONObject.optJSONObject("data");
//        if (jSONObject != null) {
//            bxi d = C9182b.f23870a.mo34621d(jSONObject);
//            if (d != null) {
//                this.f23869b.mo31141a(d);
//            }
//        }
    }

    private DanMuMSGEntity formatDanmu(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("info");
        DanMuMSGEntity danMuMSGEntity = new DanMuMSGEntity();
        try {
            danMuMSGEntity = new DanMuMSGEntity(optJSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return danMuMSGEntity;
    }
}
