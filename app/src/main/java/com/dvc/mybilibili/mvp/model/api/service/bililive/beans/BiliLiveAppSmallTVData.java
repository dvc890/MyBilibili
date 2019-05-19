package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveAppSmallTVData {
    @JSONField(name = "dtime")
    public int mDtime;
    public long mEndSystemTime;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "status")
    public int mStatus;

    public int getCountDownTime() {
        long currentTimeMillis = this.mEndSystemTime - System.currentTimeMillis();
        return currentTimeMillis > 0 ? (int) (currentTimeMillis / 1000) : 0;
    }
}
