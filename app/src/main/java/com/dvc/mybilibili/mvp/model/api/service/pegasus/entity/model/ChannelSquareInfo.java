package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryMeta;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class ChannelSquareInfo {
    @Nullable
    @JSONField(name = "region")
    public ArrayList<CategoryMeta> regions;
    @Nullable
    @JSONField(name = "square")
    public List<C2258a> squarePromos;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.ChannelSquareInfo$a */
    public static class C2258a {
        @Nullable
        @JSONField(name = "param")
        /* renamed from: a */
        public String f6324a;
        @Nullable
        @JSONField(name = "title")
        /* renamed from: b */
        public String f6325b;
        @Nullable
        @JSONField(name = "uri")
        /* renamed from: c */
        public String f6326c;
        @Nullable
        @JSONField(name = "desc_2")
        /* renamed from: d */
        public String f6327d;
        @Nullable
        @JSONField(name = "item")
        /* renamed from: e */
        public List<C2259b> f6328e;
        @JSONField(deserialize = false, serialize = false)
        /* renamed from: f */
        public transient boolean f6329f = false;

        /* renamed from: a */
        public boolean mo12021a() {
            return this.f6328e != null && this.f6328e.size() > 1;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.ChannelSquareInfo$b */
    public static class C2259b {
        @Nullable
        @JSONField(name = "title")
        /* renamed from: a */
        public String f6330a;
        @Nullable
        @JSONField(name = "cover")
        /* renamed from: b */
        public String f6331b;
        @Nullable
        @JSONField(name = "uri")
        /* renamed from: c */
        public String f6332c;
        @Nullable
        @JSONField(name = "param")
        /* renamed from: d */
        public String f6333d;
        @Nullable
        @JSONField(name = "goto")
        /* renamed from: e */
        public String f6334e;
        @Nullable
        @JSONField(name = "cover_left_text_1")
        /* renamed from: f */
        public String f6335f;
        @Nullable
        @JSONField(name = "cover_left_icon_1")
        /* renamed from: g */
        public int f6336g;
        @Nullable
        @JSONField(name = "cover_left_text_2")
        /* renamed from: h */
        public String f6337h;
        @Nullable
        @JSONField(name = "cover_left_icon_2")
        /* renamed from: i */
        public int f6338i;
        @Nullable
        @JSONField(name = "cover_left_text_3")
        /* renamed from: j */
        public String f6339j;
        @Nullable
        @JSONField(name = "from_type")
        /* renamed from: k */
        public String f6340k;
    }
}
