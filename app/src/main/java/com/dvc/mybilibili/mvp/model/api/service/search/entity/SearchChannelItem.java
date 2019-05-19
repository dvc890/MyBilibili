package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.search.api.h */
public class SearchChannelItem extends BaseSearchItem {
    @JSONField(name = "attentions")
    /* renamed from: a */
    public long attentions;
    @JSONField(name = "is_atten")
    /* renamed from: b */
    public boolean is_atten;
    @Nullable
    @JSONField(name = "desc")
    /* renamed from: c */
    public String desc;
    @Nullable
    @JSONField(name = "item")
    /* renamed from: d */
    public List<C3306g> items;
}
