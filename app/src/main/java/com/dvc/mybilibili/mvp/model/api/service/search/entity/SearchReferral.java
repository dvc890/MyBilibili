package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchReferral {
    @Nullable
    @JSONField(name = "list")
    public List<Guess> list;
    @JSONField(name = "pages")
    public int pages;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;

    @Keep
    /* compiled from: BL */
    public static class Guess implements C2277a {
        @Nullable
        @JSONField(name = "param")
        public String param;
        @Nullable
        public String trackId;
        @Nullable
        @JSONField(name = "type")
        public String type;
        @Nullable
        @JSONField(name = "title")
        public String word;

        public String getNameType() {
            return /*C17391b.m67584b(this)*/"";
        }

        public int getStatusIcon() {
            return /*C17391b.m67583a(this)*/0;
        }

        @Nullable
        public String getTagName() {
            return this.word;
        }
    }
}
