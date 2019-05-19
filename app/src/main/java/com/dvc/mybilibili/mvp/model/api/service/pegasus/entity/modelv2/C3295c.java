package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.c */
public class C3295c extends BasicIndexItem implements C2266e {
    @Nullable
    @JSONField(name = "cover_left_text_1")
    /* renamed from: a */
    public String f9785a;
    @JSONField(name = "cover_left_icon_1")
    /* renamed from: b */
    public int f9786b;
    @Nullable
    @JSONField(name = "cover_right_text")
    /* renamed from: c */
    public String f9787c;
    @JSONField(name = "badge")
    /* renamed from: d */
    public String f9788d;
    @Nullable
    @JSONField(name = "rcmd_reason_style")
    /* renamed from: e */
    public Tag f9789e;
    @Nullable
    @JSONField(name = "desc_button")
    /* renamed from: f */
    public DescButton f9790f;

    @Nullable
    public DescButton getDescButton() {
        return this.f9790f;
    }
}
