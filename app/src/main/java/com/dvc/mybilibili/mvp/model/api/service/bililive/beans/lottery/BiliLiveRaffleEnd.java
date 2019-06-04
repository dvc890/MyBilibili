package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRaffleEnd {
    @JSONField(name = "from")
    public String mFrom;
    @JSONField(name = "fromFace")
    public String mFromFace;
    @JSONField(name = "fromGiftId")
    public int mFromGiftId;
    @JSONField(name = "raffleId")
    public int mRaffleId;
    @JSONField(name = "type")
    public String mType;
    @JSONField(name = "win")
    public Win mWin;

    @Keep
    /* compiled from: BL */
    public static class Win {
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "giftId")
        public String mGiftId;
        @JSONField(name = "giftName")
        public String mGiftName;
        @JSONField(name = "giftNum")
        public int mGiftNum;
        @JSONField(name = "text")
        public String mMsg;
        @JSONField(name = "uname")
        public String mUname;
    }
}
