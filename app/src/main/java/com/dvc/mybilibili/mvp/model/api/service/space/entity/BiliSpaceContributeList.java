package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceContributeList */
public class BiliSpaceContributeList {
    @JSONField(name = "items")
    /* renamed from: a */
    public List<C2437a> f6587a;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceContributeList$Tab */
    public static class Tab {
        @JSONField(name = "album")
        public boolean hasAlbum;
        @JSONField(name = "archive")
        public boolean hasArchive;
        @JSONField(name = "article")
        public boolean hasArticle;
        @JSONField(name = "clip")
        public boolean hasClip;
    }
}
