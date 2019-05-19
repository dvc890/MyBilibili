package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchVideoItem extends BaseSearchItem {
    @Nullable
    public String area;
    @Nullable
    @JSONField(name = "author")
    public String author;
    @Nullable
    @JSONField(name = "badges")
    public List<Tag> badges;
    @JSONField(name = "danmaku")
    public int danmaku;
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "duration")
    public String duration;
    @Nullable
    public String eventId;
    @JSONField(name = "is_pay")
    public int isPay;
    @Nullable
    @JSONField(name = "new_rec_tags")
    public List<Tag> newRecTags;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "ptime")
    public long ptime;
}
