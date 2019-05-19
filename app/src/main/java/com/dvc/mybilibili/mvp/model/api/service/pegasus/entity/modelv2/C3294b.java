package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2263b;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.b */
public class C3294b extends BasicIndexItem implements C2263b, C2266e {
    @Nullable
    @JSONField(name = "desc_button")
    /* renamed from: a */
    public DescButton f9774a;
    @Nullable
    @JSONField(name = "Desc1")
    /* renamed from: b */
    public String f9775b;
    @Nullable
    @JSONField(name = "Desc2")
    /* renamed from: c */
    public String f9776c;
    @Nullable
    @JSONField(name = "avatar")
    /* renamed from: d */
    public Avatar f9777d;
    @Nullable
    @JSONField(name = "cover_left_text_1")
    /* renamed from: e */
    public String f9778e;
    @Nullable
    @JSONField(name = "cover_left_text_2")
    /* renamed from: f */
    public String f9779f;
    @Nullable
    @JSONField(name = "cover_right_text")
    /* renamed from: g */
    public String f9780g;
    @Nullable
    @JSONField(name = "cover_right_background_color")
    /* renamed from: h */
    public String f9781h;
    @JSONField(name = "official_icon")
    /* renamed from: i */
    public int f9782i;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    /* renamed from: j */
    public Tag f9783j;
    @Nullable
    @JSONField(name = "cover_badge")
    /* renamed from: k */
    public String f9784k;

    @Nullable
    public Avatar getAvatar() {
        return this.f9777d;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.f9774a;
    }
}
