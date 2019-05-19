package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.Border */
public class Border {
    @JSONField(name = "color")
    private String color;
    @JSONField(name = "width")
    private int width;

    public int getWidth() {
        return this.width;
    }

    public String getColor() {
        return this.color;
    }

    public Border setWidth(int i) {
        this.width = i;
        return this;
    }

    public Border setColor(String str) {
        this.color = str;
        return this;
    }
}
