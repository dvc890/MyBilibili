package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

@Keep
/* compiled from: BL */
public class Article implements Serializable {
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6129id;
    @JSONField(name = "publish_time")
    public long publishTime;
    @JSONField(name = "title")
    public String title;

    public long getId() {
        return this.f6129id;
    }

    public void setId(long j) {
        this.f6129id = j;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public void setPublishTime(long j) {
        this.publishTime = j;
    }
}
