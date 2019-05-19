package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLiveSendBag {
    @JSONField(name = "gold")
    public int mGold;
    @JSONField(name = "data")
    public BiliLivePropMsg mMsg;
    @JSONField(name = "remain")
    public int mRemain;
    @JSONField(name = "silver")
    public int mSilver;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveSendBag{mSilver=");
        stringBuilder.append(this.mSilver);
        stringBuilder.append(", mGold=");
        stringBuilder.append(this.mGold);
        stringBuilder.append(", mRemain=");
        stringBuilder.append(this.mRemain);
        stringBuilder.append(", mMsg=");
        stringBuilder.append(this.mMsg);
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
