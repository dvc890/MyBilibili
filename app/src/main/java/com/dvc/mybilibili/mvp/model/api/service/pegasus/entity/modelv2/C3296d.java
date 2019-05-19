package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2263b;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.d */
public class C3296d extends BasicIndexItem implements C2263b {
    @Nullable
    @JSONField(name = "cover_top_text_1")
    /* renamed from: a */
    public String f9791a;
    @Nullable
    @JSONField(name = "cover_top_text_2")
    /* renamed from: b */
    public String f9792b;
    @Nullable
    @JSONField(name = "desc")
    /* renamed from: c */
    public String f9793c;
    @Nullable
    @JSONField(name = "avatar")
    /* renamed from: d */
    public Avatar f9794d;
    @JSONField(name = "official_icon")
    /* renamed from: e */
    public int f9795e;
    @Nullable
    @JSONField(name = "covers")
    /* renamed from: f */
    public List<String> f9796f;

    @Nullable
    public Avatar getAvatar() {
        return this.f9794d;
    }
}
