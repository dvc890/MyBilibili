package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRoomDanmuConfig {
    @JSONField(name = "host")
    public String mHost;
    @JSONField(name = "max_delay")
    public int mMaxDelay;
    @JSONField(name = "port")
    public int mPort;
    @JSONField(name = "refresh_rate")
    public int mRefreshRate;
    @JSONField(name = "refresh_row_factor")
    public double mRefreshRowFactor;
    @JSONField(name = "server_list")
    public List<DanmuHostPort> mServerList;
    @JSONField(name = "token")
    public String token = "";

    @Keep
    /* compiled from: BL */
    public static class DanmuHostPort {
        @JSONField(name = "host")
        public String mHost;
        @JSONField(name = "port")
        public int mPort;
    }

    public BiliLiveRoomDanmuConfig(double d, int i, int i2) {
        this.mRefreshRowFactor = d;
        this.mRefreshRate = i;
        this.mMaxDelay = i2;
    }
}
