package com.dvc.mybilibili.danmaku.live.parser;

import com.alibaba.fastjson.JSON;
import com.dvc.mybilibili.danmaku.live.entity.SendGiftEntity;
import com.dvc.mybilibili.danmaku.live.interfaces.ILiveDanMuCallback;
import com.dvc.mybilibili.danmaku.live.interfaces.SocketMsgParserProcess;

import org.json.JSONObject;

@SocketMsgType(types = {"TV_START", "TV_END", "RAFFLE_START", "RAFFLE_END", "SPECIAL_GIFT", "WISH_BOTTLE", "GUARD_LOTTERY_START", "SEND_GIFT", "COMBO_SEND", "HOUR_RANK_AWARDS", "BOX_LOTTERY_START", "BOX_LOTTERY_WIN", "BOX_LOTTERY_END", "LUCK_GIFT_AWARD_USER"})
public class SocketLotteryParserProcess extends SocketMsgParserProcess<ILiveDanMuCallback> {

    @Override
    public void process(String cmd, JSONObject jSONObject, ILiveDanMuCallback iLiveDanMuCallback) {
        switch (cmd) {
            case "TV_START":
                break;
            case "TV_END":
                break;
            case "RAFFLE_START":
                break;
            case "RAFFLE_END":
                break;
            case "SPECIAL_GIFT":
                break;
            case "WISH_BOTTLE":
                break;
            case "GUARD_LOTTERY_START":
                break;
            case "SEND_GIFT":
//                {"cmd":"SEND_GIFT","data":{"giftName":"\u8fa3\u6761","num":1,"uname":"\u5371\u96691","face":"http:\/\/i0.hdslb.com\/bfs\/face\/d2a03b0e81271e4acad750bd373c67c9241eee75.jpg","guard_level":0,"rcost":10295391,"uid":14501792,"top_list":[],"timestamp":1559639739,"giftId":1,"giftType":0,"action":"\u5582\u98df","super":0,"super_gift_num":0,"price":100,"rnd":"960955714","newMedal":0,"newTitle":0,"medal":[],"title":"","beatId":"","biz_source":"live","metadata":"","remain":0,"gold":0,"silver":0,"eventScore":0,"eventNum":0,"smalltv_msg":[],"specialGift":null,"notice_msg":[],"capsule":null,"addFollow":0,"effect_block":1,"coin_type":"silver","total_coin":100,"effect":0,"tag_image":"","user_count":0}}
                iLiveDanMuCallback.onSendGiftPackage(JSON.parseObject(jSONObject.optJSONObject("data").toString(), SendGiftEntity.class));
                break;
            case "COMBO_SEND":
                break;
            case "HOUR_RANK_AWARDS":
                break;
            case "BOX_LOTTERY_START":
                break;
            case "BOX_LOTTERY_WIN":
                break;
            case "BOX_LOTTERY_END":
                break;
            case "LUCK_GIFT_AWARD_USER":
                break;
        }
    }
}
