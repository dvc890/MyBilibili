package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLiveSilverAward {
    @JSONField(name = "awardSilver")
    public long mAwardSilver;
    @JSONField(name = "isEnd")
    public int mIsEnd;
    @JSONField(name = "silver")
    public long mSilver;
    @JSONField(name = "surplusMinute")
    public int mSurplusMinute;

    public boolean isEndRound() {
        return this.mIsEnd == 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data{mAwardSilver=");
        stringBuilder.append(this.mAwardSilver);
        stringBuilder.append(", mIsEnd=");
        stringBuilder.append(this.mIsEnd);
        stringBuilder.append(", mSurplusMinute=");
        stringBuilder.append(this.mSurplusMinute);
        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
