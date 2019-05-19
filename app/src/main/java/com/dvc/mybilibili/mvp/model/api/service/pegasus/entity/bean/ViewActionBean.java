package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.ViewActionBean */
public class ViewActionBean {
    @JSONField(name = "click")
    ActionClickBean click;

    public ActionClickBean getClick() {
        return this.click;
    }

    public ViewActionBean setClick(ActionClickBean actionClickBean) {
        this.click = actionClickBean;
        return this;
    }
}
