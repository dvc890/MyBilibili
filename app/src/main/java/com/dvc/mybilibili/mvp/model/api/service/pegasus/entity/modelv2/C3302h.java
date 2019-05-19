package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2266e;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.api.modelv2.h */
public class C3302h extends BasicIndexItem implements C2265d<C3302h.C3301a> {
    @Nullable
    @JSONField(name = "items")
    /* renamed from: a */
    public List<C3301a> f9828a;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.h$a */
    public static class C3301a extends BasicIndexItem implements C2266e {
        @Nullable
        @JSONField(name = "badge")
        /* renamed from: a */
        public String f9823a;
        @Nullable
        @JSONField(name = "cover_badge")
        /* renamed from: b */
        public String f9824b;
        @Nullable
        @JSONField(name = "cover_left_text_1")
        /* renamed from: c */
        public String f9825c;
        @JSONField(name = "cover_left_icon_1")
        /* renamed from: d */
        public int f9826d;
        @Nullable
        @JSONField(name = "desc_button")
        /* renamed from: e */
        public DescButton f9827e;

        @Nullable
        public DescButton getDescButton() {
            return this.f9827e;
        }
    }

    @Nullable
    public List<C3301a> getChildList() {
        return this.f9828a;
    }
}
