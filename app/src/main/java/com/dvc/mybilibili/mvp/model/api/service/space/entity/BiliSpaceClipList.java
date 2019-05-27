package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceClipList */
public class BiliSpaceClipList extends BiliSpaceItemCount {
    @JSONField(name = "has_more")
    public int hasMore;
    @JSONField(name = "next_offset")
    public int nextOffset;
    @JSONField(name = "item")
    public List<BiliSpaceClip> videos;

    public boolean isEmpty() {
        return this.videos == null || this.videos.isEmpty();
    }
}
