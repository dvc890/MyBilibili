package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.e */
public class C3298e extends BasicIndexItem implements C2265d<C3298e.C3297a> {
    @Nullable
    @JSONField(name = "items")
    /* renamed from: a */
    public List<C3297a> f9801a;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.e$a */
    public static class C3297a extends BasicIndexItem implements C2266e {
        @Nullable
        @JSONField(name = "desc")
        /* renamed from: a */
        public String f9797a;
        @JSONField(name = "cover_type")
        /* renamed from: b */
        public int f9798b;
        @Nullable
        @JSONField(name = "desc_button")
        /* renamed from: c */
        public DescButton f9799c;
        @JSONField(name = "official_icon")
        /* renamed from: d */
        public int f9800d;

        @Nullable
        public DescButton getDescButton() {
            return this.f9799c;
        }
    }

    @Nullable
    public List<C3297a> getChildList() {
        return this.f9801a;
    }
}
