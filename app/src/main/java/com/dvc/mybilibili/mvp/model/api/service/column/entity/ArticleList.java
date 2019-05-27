package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

@Keep
/* compiled from: BL */
public class ArticleList implements Serializable {
    @JSONField(name = "articles_count")
    public long articlesCount;
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6130id;
    @JSONField(name = "image_url")
    public String imageUrl;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "publish_time")
    public long publishTime;
    @JSONField(name = "read")
    public long read;
    @JSONField(name = "summary")
    public String summary;
    @JSONField(name = "update_time")
    public long updateTime;
    @JSONField(name = "words")
    public long words;

    public ArticleList() {
    }
}
