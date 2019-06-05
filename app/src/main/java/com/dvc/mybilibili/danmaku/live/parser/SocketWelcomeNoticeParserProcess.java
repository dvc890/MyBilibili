package com.dvc.mybilibili.danmaku.live.parser;

import com.alibaba.fastjson.JSON;
import com.dvc.mybilibili.danmaku.live.entity.NoticeMsgEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.json.JSONObject;

@SocketMsgType(types = {"WELCOME", "ENTRY_EFFECT", "NOTICE_MSG", "LITTLE_TIPS"})
public class SocketWelcomeNoticeParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {
    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback liveDanMuCallback) {
        switch (cmd) {
            case "WELCOME":
                break;
            case "ENTRY_EFFECT":
                break;
            case "NOTICE_MSG":
//                {"cmd":"NOTICE_MSG","full":{"head_icon":"https:\/\/i0.hdslb.com\/bfs\/vc\/055e567c4bf44ca1be3f84392639bdb8ef51fdb2.png","tail_icon":"","head_icon_fa":"","tail_icon_fa":"","head_icon_fan":0,"tail_icon_fan":0,"background":"#3B71AEFF","color":"#FFFFFFFF","highlight":"#FFFFFFFF","time":10},"half":{"head_icon":"http:\/\/i0.hdslb.com\/bfs\/vc\/c3838ca2d3154aca69567718cf6e85a4cfce5759.png","tail_icon":"","background":"#3B71AEFF","color":"#FFFFFFFF","highlight":"#FFFFFFFF","time":8},"side":{"head_icon":"","background":"","color":"","highlight":"","border":""},"roomid":0,"real_roomid":0,"msg_common":"\u5e0c\u671b\u6bcf\u4e00\u4e2a\u9ad8\u8003\u5b66\u5b50\uff0c\u90fd\u80fd\u91d1\u699c\u9898\u540d\uff01<%   \u2014\u2014\u559c\u6b22\u770b\u5230\u4f60\u7684\u5f00\u5fc3%>","msg_self":"\u5e0c\u671b\u6bcf\u4e00\u4e2a\u9ad8\u8003\u5b66\u5b50\uff0c\u90fd\u80fd\u91d1\u699c\u9898\u540d\uff01<%   \u2014\u2014\u559c\u6b22\u770b\u5230\u4f60\u7684\u5f00\u5fc3%>","link_url":"","msg_type":5,"shield_uid":-1,"child_msg_type":"5:2"}
                liveDanMuCallback.onNoticeMsgPackage(JSON.parseObject(jSONObject.toString(), NoticeMsgEntity.class));
                break;
            case "LITTLE_TIPS":
                break;
        }

    }
}
