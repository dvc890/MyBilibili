package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceClip */
public class BiliSpaceClip {
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "duration")
    public long duration;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6586id;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "tag")
    public String tag;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "uri")
    public String uri;
}
