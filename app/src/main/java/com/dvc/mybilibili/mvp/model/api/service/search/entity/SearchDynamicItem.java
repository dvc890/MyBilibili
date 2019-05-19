package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
public class SearchDynamicItem extends BaseSearchItem {
    @JSONField(name = "cover_count")
    /* renamed from: a */
    public int f9829a;
    @Nullable
    @JSONField(name = "covers")
    /* renamed from: b */
    public List<String> f9830b;
    @Nullable
    @JSONField(name = "upper")
    /* renamed from: c */
    public Upper f9831c;
    @Nullable
    @JSONField(name = "stat")
    /* renamed from: d */
    public Stat f9832d;

    @Keep
    /* compiled from: BL */
    public static class Stat {
        @JSONField(name = "like")
        public int like;
        @JSONField(name = "play")
        public int play;
        @JSONField(name = "reply")
        public int reply;
    }

    @Keep
    /* compiled from: BL */
    public static class Upper {
        @Nullable
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "mid")
        public int mid;
        @Nullable
        @JSONField(name = "ptime_text")
        public String pTimeText;
        @Nullable
        @JSONField(name = "title")
        public String title;
    }
}
