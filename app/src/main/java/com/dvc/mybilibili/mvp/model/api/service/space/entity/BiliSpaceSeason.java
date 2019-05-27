package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceSeason */
public class BiliSpaceSeason extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<BiliSpaceSeasonItem> seasons;

    public boolean isEmpty() {
        return this.seasons == null || this.seasons.isEmpty();
    }
}
