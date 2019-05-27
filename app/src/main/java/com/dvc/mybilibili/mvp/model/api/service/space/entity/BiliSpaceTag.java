package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceTag */
public class BiliSpaceTag extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<Tag> tags;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceTag$Tag */
    public static class Tag {
        @JSONField(name = "tag_id")
        /* renamed from: id */
        public int f6589id;
        @JSONField(name = "tag_name")
        public String name;
    }

    public boolean isEmpty() {
        return this.tags == null || this.tags.isEmpty();
    }
}
