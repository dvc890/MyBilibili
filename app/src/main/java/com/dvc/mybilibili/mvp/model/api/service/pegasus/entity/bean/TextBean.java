package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.TextBean */
public class TextBean {
    @Nullable
    @JSONField(name = "content")
    private String content;
    @Nullable
    @JSONField(name = "ellipsize")
    private String ellipsize;
    @Nullable
    @JSONField(name = "gravity")
    private String gravity;
    @JSONField(name = "max_lines")
    private int maxLines;
    @Nullable
    @JSONField(name = "night_color")
    private String nightTextColor;
    @Nullable
    @JSONField(name = "color")
    private String textColor;
    @JSONField(name = "size")
    private float textSize;
    @Nullable
    @JSONField(name = "text_style")
    private String textStyle;

    @Nullable
    public String getTextStyle() {
        return this.textStyle;
    }

    public void setTextStyle(@Nullable String str) {
        this.textStyle = str;
    }

    @Nullable
    public String getTextColor() {
        return this.textColor;
    }

    public void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    @Nullable
    public String getNightTextColor() {
        return this.nightTextColor;
    }

    public void setNightTextColor(@Nullable String str) {
        this.nightTextColor = str;
    }

    @Nullable
    public String getGravity() {
        return this.gravity;
    }

    public void setGravity(@Nullable String str) {
        this.gravity = str;
    }

    @Nullable
    public String getContent() {
        return this.content;
    }

    public void setContent(@Nullable String str) {
        this.content = str;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public void setMaxLines(int i) {
        this.maxLines = i;
    }

    @Nullable
    public String getEllipsize() {
        return this.ellipsize;
    }

    public void setEllipsize(@Nullable String str) {
        this.ellipsize = str;
    }
}
