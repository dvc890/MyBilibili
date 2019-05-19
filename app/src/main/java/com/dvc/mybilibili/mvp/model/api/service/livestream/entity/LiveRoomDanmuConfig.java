package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveRoomDanmuConfig {
    @JSONField(name = "max_delay")
    public int mMaxDelay;
    @JSONField(name = "refresh_rate")
    public int mRefreshRate;
    @JSONField(name = "refresh_row_factor")
    public double mRefreshRowFactor;

    public LiveRoomDanmuConfig(double d, int i, int i2) {
        this.mRefreshRowFactor = d;
        this.mRefreshRate = i;
        this.mMaxDelay = i2;
    }
}
