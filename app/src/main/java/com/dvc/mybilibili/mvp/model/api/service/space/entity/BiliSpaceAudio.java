package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceAudio */
public class BiliSpaceAudio {
    @JSONField(name = "authType")
    public int authType;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "duration")
    public long duration;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6585id;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "reply")
    public int reply;
    @JSONField(name = "schema")
    public String schema;
    @JSONField(name = "title")
    public String title;
}
