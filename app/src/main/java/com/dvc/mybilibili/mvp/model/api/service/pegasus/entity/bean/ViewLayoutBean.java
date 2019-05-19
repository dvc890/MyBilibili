package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.ViewLayoutBean */
public class ViewLayoutBean {
    @JSONField(name = "divide")
    Integer[] divide;
    @JSONField(name = "frame")
    Integer[] frame;
    @JSONField(name = "margin")
    Integer[] margin = new Integer[]{Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0)};

    public Integer[] getDivide() {
        return this.divide;
    }

    public Integer[] getFrame() {
        return this.frame;
    }

    public Integer[] getMargin() {
        return this.margin;
    }

    public ViewLayoutBean setDivide(Integer[] numArr) {
        this.divide = numArr;
        return this;
    }

    public ViewLayoutBean setFrame(Integer[] numArr) {
        this.frame = numArr;
        return this;
    }

    public ViewLayoutBean setMargin(Integer[] numArr) {
        this.margin = numArr;
        return this;
    }
}
