package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceVideoList */
public class BiliSpaceVideoList {
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "item")
    public List<BiliSpaceVideo> videos;
}
