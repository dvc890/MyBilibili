package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.a */
public class C2437a {
    @JSONField(name = "id")
    /* renamed from: a */
    public long f6595a;
    @JSONField(name = "title")
    /* renamed from: b */
    public String f6596b;
    @JSONField(name = "cover")
    /* renamed from: c */
    public String f6597c;
    @JSONField(name = "description")
    /* renamed from: d */
    public String f6598d;
    @JSONField(name = "uri")
    /* renamed from: e */
    public String f6599e;
    @JSONField(name = "param")
    /* renamed from: f */
    public String f6600f;
    @JSONField(name = "goto")
    /* renamed from: g */
    public String f6601g;
    @JSONField(name = "banner")
    /* renamed from: h */
    public String f6602h;
    @JSONField(name = "ctime")
    /* renamed from: i */
    public long f6603i;
    @JSONField(name = "duration")
    /* renamed from: j */
    public long f6604j;
    @JSONField(name = "play")
    /* renamed from: k */
    public int f6605k;
    @JSONField(name = "reply")
    /* renamed from: l */
    public int f6606l;
    @JSONField(name = "comment")
    /* renamed from: m */
    public int f6607m;
    @JSONField(name = "count")
    /* renamed from: n */
    public int f6608n;
    @JSONField(name = "danmaku")
    /* renamed from: o */
    public int f6609o;
    @JSONField(name = "category")
    /* renamed from: p */
    public BiliSpaceArticle.Category f6610p;
    @JSONField(name = "image_urls")
    /* renamed from: q */
    public List<String> f6611q;
    @JSONField(name = "pictures")
    /* renamed from: r */
    public List<BiliSpaceAlbum.Picture> f6612r;
    @JSONField(name = "stats")
    /* renamed from: s */
    public BiliSpaceArticle.Stats f6613s;
    @JSONField(name = "authType")
    /* renamed from: t */
    public int f6614t;
    @Nullable
    @JSONField(name = "badges")
    /* renamed from: u */
    public List<Badge> f6615u;
    /* renamed from: v */
    private BiliSpaceArticle f6616v;

    /* renamed from: a */
    public BiliSpaceArticle mo14367a() {
        if (this.f6616v == null) {
            this.f6616v = new BiliSpaceArticle();
            this.f6616v.category = this.f6610p;
            this.f6616v.uri = this.f6599e;
            this.f6616v.title = this.f6596b;
            this.f6616v.summary = this.f6598d;
            this.f6616v.imageUrls = this.f6611q;
            this.f6616v.bannerUrl = this.f6602h;
            this.f6616v.cTime = this.f6603i;
            this.f6616v.stats = this.f6613s;
            this.f6616v.f6584id = this.f6595a;
        }
        return this.f6616v;
    }
}
