package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.StyleBean */
public class StyleBean {
    @Nullable
    @JSONField(name = "background_color")
    private String backgroundColor;
    @Nullable
    @JSONField(name = "gradient")
    private GradientBean gradient;
    @Nullable
    @JSONField(name = "night_background_color")
    private String nightBackgroundColor;

    @Nullable
    public GradientBean getGradient() {
        return this.gradient;
    }

    public void setGradient(@Nullable GradientBean gradientBean) {
        this.gradient = gradientBean;
    }

    @Nullable
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public String getNightBackgroundColor() {
        return this.nightBackgroundColor;
    }

    public void setNightBackgroundColor(@Nullable String str) {
        this.nightBackgroundColor = str;
    }
}
