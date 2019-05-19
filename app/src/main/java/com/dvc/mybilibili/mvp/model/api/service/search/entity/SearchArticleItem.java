package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.search.api.e */
public class SearchArticleItem extends BaseSearchItem {
    @JSONField(name = "play")
    /* renamed from: a */
    public int f9836a;
    @JSONField(name = "like")
    /* renamed from: b */
    public int f9837b;
    @JSONField(name = "reply")
    /* renamed from: c */
    public int f9838c;
    @Nullable
    @JSONField(name = "image_urls")
    /* renamed from: d */
    public List<String> f9839d;
    @Nullable
    @JSONField(name = "author")
    /* renamed from: e */
    public String f9840e;
}
