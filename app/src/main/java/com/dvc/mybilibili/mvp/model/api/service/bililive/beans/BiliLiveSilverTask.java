package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

////

@Keep
/* compiled from: BL */
public class BiliLiveSilverTask {
    @JSONField(name = "isAward")
    public boolean mIsAward;
    @JSONField(name = "minute")
    public int mMin;
    @JSONField(name = "silver")
    public long mSilver;
    @JSONField(name = "time_end")
    public long mTimeEnd;
    @JSONField(name = "time_start")
    public long mTimeStart;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveSilverTask{mIsAward=");
        stringBuilder.append(this.mIsAward);
        stringBuilder.append(", mMin=");
        stringBuilder.append(this.mMin);
        stringBuilder.append(", mSilver=");
        stringBuilder.append(this.mSilver);
        stringBuilder.append(", mTimeStart=");
        stringBuilder.append(this.mTimeStart);
        stringBuilder.append(", mTimeEnd=");
        stringBuilder.append(this.mTimeEnd);
        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
