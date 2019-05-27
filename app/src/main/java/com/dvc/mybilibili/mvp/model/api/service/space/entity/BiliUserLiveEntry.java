package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliUserLiveEntry */
public class BiliUserLiveEntry {
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "liveStatus")
    public int liveStatus;
    @JSONField(name = "online")
    public int online;
    @JSONField(name = "roomStatus")
    public int roomStatus;
    @JSONField(name = "roomid")
    public int roomid;
    @JSONField(name = "roundStatus")
    public int roundStatus;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "url")
    public String url;

    public boolean hasLiveEver() {
        return this.roomStatus == 1;
    }

    public boolean isLiving() {
        return hasLiveEver() && this.liveStatus == 1;
    }

    public boolean isRoundLiving() {
        return hasLiveEver() && this.roundStatus == 1 && this.liveStatus != 1;
    }
}
