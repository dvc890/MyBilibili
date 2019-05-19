package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.g */
public class C3300g extends BasicIndexItem implements C2266e {
    @JSONField(name = "left_cover")
    /* renamed from: a */
    public String f9814a;
    @JSONField(name = "right_cover_1")
    /* renamed from: b */
    public String f9815b;
    @JSONField(name = "right_cover_2")
    /* renamed from: c */
    public String f9816c;
    @JSONField(name = "cover_left_text_1")
    /* renamed from: d */
    public String f9817d;
    @JSONField(name = "cover_left_icon_1")
    /* renamed from: e */
    public int f9818e;
    @JSONField(name = "cover_right_text")
    /* renamed from: f */
    public String f9819f;
    @JSONField(name = "badge")
    /* renamed from: g */
    public String f9820g;
    @JSONField(name = "rcmd_reason_style")
    /* renamed from: h */
    public Tag f9821h;
    @Nullable
    @JSONField(name = "desc_button")
    /* renamed from: i */
    public DescButton f9822i;

    @Nullable
    public DescButton getDescButton() {
        return this.f9822i;
    }
}
