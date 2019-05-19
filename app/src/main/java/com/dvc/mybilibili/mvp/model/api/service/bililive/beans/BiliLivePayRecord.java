package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Map;

@Keep
/* compiled from: BL */
public class BiliLivePayRecord {
    @JSONField(name = "list")
    public List<PayRecord> mList;
    @JSONField(name = "params")
    public Map<String, String> mParams;

    @Keep
    /* compiled from: BL */
    public static class PayRecord {
        @JSONField(name = "coin")
        public int mCoin;
        @JSONField(name = "gift_img")
        public String mGiftIcon;
        @JSONField(name = "gift_name")
        public String mGiftName;
        @JSONField(name = "gift_num")
        public int mGiftNum;
        @JSONField(name = "is_guard")
        public int mIsGuard;
        @JSONField(name = "pay_coin")
        public int mPayCoin;
        @JSONField(name = "coin_type")
        public String mPayCoinType;
        @JSONField(name = "timestamp")
        public long mPayTime;
        @JSONField(name = "room_id")
        public int mRoomId;
        @JSONField(name = "r_uname")
        public String mRuName;
    }
}
