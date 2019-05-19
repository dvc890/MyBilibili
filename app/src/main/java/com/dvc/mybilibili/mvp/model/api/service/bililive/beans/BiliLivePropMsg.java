package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLivePropMsg {
    @JSONField(name = "action")
    public String mAction;
    @JSONField(name = "giftId")
    public int mGiftId;
    @JSONField(name = "giftName")
    public String mGiftName;
    @JSONField(name = "giftType")
    public int mGiftType;
    @JSONField(name = "fulltext")
    public String mMedalTips;
    @JSONField(name = "newMedal")
    public int mNewMedal;
    @JSONField(name = "newMedalName")
    public String mNewMedalName;
    @JSONField(name = "newTitle")
    public int mNewTitle;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "price")
    public int mPrice;
    @JSONField(name = "rcost")
    public long mRcost;
    @JSONField(name = "rnd")
    public String mRnd;
    @JSONField(name = "super")
    public int mSuper;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "uname")
    public String mUname;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliData{mAction='");
        stringBuilder.append(this.mAction);
        stringBuilder.append('\'');
        stringBuilder.append(", mGiftName='");
        stringBuilder.append(this.mGiftName);
        stringBuilder.append('\'');
        stringBuilder.append(", mNum=");
        stringBuilder.append(this.mNum);
        stringBuilder.append(", mUname='");
        stringBuilder.append(this.mUname);
        stringBuilder.append('\'');
        stringBuilder.append(", mRcost=");
        stringBuilder.append(this.mRcost);
        stringBuilder.append(", mUid=");
        stringBuilder.append(this.mUid);
        stringBuilder.append(", mGiftId=");
        stringBuilder.append(this.mGiftId);
        stringBuilder.append(", mGiftType=");
        stringBuilder.append(this.mGiftType);
        stringBuilder.append(", mPrice=");
        stringBuilder.append(this.mPrice);
        stringBuilder.append(", mRnd='");
        stringBuilder.append(this.mRnd);
        stringBuilder.append('\'');
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
