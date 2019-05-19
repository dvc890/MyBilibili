package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.BorderBean */
public class BorderBean {
    @Nullable
    @JSONField(name = "color")
    private String color;
    @Nullable
    @JSONField(name = "night_color")
    private String nightColor;
    private int width;

    @Nullable
    public String getNightColor() {
        return this.nightColor;
    }

    public void setNightColor(@Nullable String str) {
        this.nightColor = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Nullable
    public String getColor() {
        return this.color;
    }

    public void setColor(@Nullable String str) {
        this.color = str;
    }
}
