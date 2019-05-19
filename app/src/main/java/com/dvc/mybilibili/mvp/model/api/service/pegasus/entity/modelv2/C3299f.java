package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2263b;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.f */
public class C3299f extends BasicIndexItem implements C2263b, C2266e {
    @Nullable
    @JSONField(name = "desc_button")
    /* renamed from: a */
    public DescButton f9802a;
    @Nullable
    @JSONField(name = "desc_1")
    /* renamed from: b */
    public String f9803b;
    @Nullable
    @JSONField(name = "desc_2")
    /* renamed from: c */
    public String f9804c;
    @Nullable
    @JSONField(name = "avatar")
    /* renamed from: d */
    public Avatar f9805d;
    @Nullable
    @JSONField(name = "title_left_text_1")
    /* renamed from: e */
    public String f9806e;
    @Nullable
    @JSONField(name = "title_left_text_2")
    /* renamed from: f */
    public String f9807f;
    @Nullable
    @JSONField(name = "cover_right_text")
    /* renamed from: g */
    public String f9808g;
    @Nullable
    @JSONField(name = "cover_right_background_color")
    /* renamed from: h */
    public String f9809h;
    @Nullable
    @JSONField(name = "covers")
    /* renamed from: i */
    public List<String> f9810i;
    @JSONField(name = "official_icon")
    /* renamed from: j */
    public int f9811j;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    /* renamed from: k */
    public Tag f9812k;
    @Nullable
    @JSONField(name = "cover_badge")
    /* renamed from: l */
    public String f9813l;

    @Nullable
    public Avatar getAvatar() {
        return this.f9805d;
    }

    @org.jetbrains.annotations.Nullable
    public DescButton getDescButton() {
        return this.f9802a;
    }
}
