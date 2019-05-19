package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.GradientBean */
public class GradientBean {
    @Nullable
    private BorderBean border;
    @Nullable
    private String color;
    @Nullable
    private String night_color;
    @Nullable
    private float[] radius;

    @Nullable
    public String getColor() {
        return this.color;
    }

    public void setColor(@Nullable String str) {
        this.color = str;
    }

    @Nullable
    public BorderBean getBorder() {
        return this.border;
    }

    public void setBorder(@Nullable BorderBean borderBean) {
        this.border = borderBean;
    }

    public float[] getRadius() {
        return this.radius;
    }

    public void setRadius(@Nullable float[] fArr) {
        this.radius = fArr;
    }

    @Nullable
    public String getNight_color() {
        return this.night_color;
    }

    public void setNight_color(@Nullable String str) {
        this.night_color = str;
    }
}
