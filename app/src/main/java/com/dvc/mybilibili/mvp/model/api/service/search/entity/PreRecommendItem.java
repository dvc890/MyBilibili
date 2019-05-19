package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class PreRecommendItem {
    @JSONField(name = "attentions")
    public int attentions;
    @Nullable
    @JSONField(name = "author")
    public String author;
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "danmaku")
    public int danmaku;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "duration_int")
    public int duration;
    @JSONField(name = "finish")
    public int finish;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    @Nullable
    public String keyword;
    @Nullable
    @JSONField(name = "label")
    public String label;
    @JSONField(name = "like")
    public int like;
    @JSONField(name = "media_type")
    public int mediaType;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "rating")
    public float rating;
    @JSONField(name = "rating_count")
    public int ratingCount;
    @JSONField(name = "reply")
    public int reply;
    @JSONField(name = "started")
    public int started;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    public String trackId;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
