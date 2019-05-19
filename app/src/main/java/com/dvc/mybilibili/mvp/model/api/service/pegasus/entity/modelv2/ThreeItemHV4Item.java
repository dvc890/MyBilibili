package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

import java.util.List;

@Keep
/* compiled from: BL */
public class ThreeItemHV4Item extends BasicIndexItem implements C2265d<ThreeItemHV4Item.C3292a> {
    @Nullable
    @JSONField(name = "items")
    public List<C3292a> items;
    @Nullable
    @JSONField(name = "more_text")
    public String moreText;
    @Nullable
    @JSONField(name = "more_uri")
    public String moreUri;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.ThreeItemHV4Item$a */
    public static class C3292a extends BasicIndexItem {
        @Nullable
        @JSONField(name = "desc")
        /* renamed from: a */
        public String f9768a;
        @Nullable
        @JSONField(name = "cover_badge")
        /* renamed from: b */
        public String f9769b;
        @Nullable
        @JSONField(name = "cover_badge_color")
        /* renamed from: c */
        public String f9770c;
    }

    @Nullable
    public List<C3292a> getChildList() {
        return this.items;
    }
}
