package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceAlbumList */
public class BiliSpaceAlbumList extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<BiliSpaceAlbum> items;

    public boolean isEmpty() {
        return this.items == null || this.items.isEmpty();
    }
}
