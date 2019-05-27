package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.Category;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.Stats;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnFeed {
    @JSONField(name = "banner_url")
    public String bannerUrl;
    @JSONField(name = "category")
    public CategoryBean category;
    @JSONField(name = "covers")
    public List<String> covers;
    @JSONField(name = "ctime")
    public int ctime;
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "goto")
    public String gotoX;
    @JSONField(name = "mid")
    public int mid;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "param")
    public long param;
    @JSONField(name = "reply")
    public int reply;
    @JSONField(name = "temple")
    public int temple;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "uri")
    public String uri;

    @Keep
    /* compiled from: BL */
    public static class CategoryBean {
        @JSONField(name = "id")
        /* renamed from: id */
        public int f6140id;
        @JSONField(name = "name")
        public String name;
    }

    public Column covert() {
        Column column = new Column();
        column.title = this.title;
        column.summary = this.desc;
        column.f6132id = this.param;
        Author author = new Author();
        author.mid = (long) this.mid;
        author.name = this.name;
        author.face = this.face;
        column.author = author;
        Category category = new Category();
        if (this.category != null) {
            category.name = this.category.name;
            category.f6131id = (long) this.category.f6140id;
        }
        column.category = category;
        Stats stats = new Stats();
        stats.reply = this.reply;
        column.stats = stats;
        column.templateId = this.temple;
        column.cTime = (long) this.ctime;
        column.imageUrls = this.covers;
        column.bannerUrl = this.bannerUrl;
        return column;
    }
}
