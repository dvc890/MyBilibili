package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.v2.bean.ActionBean */
public class ActionBean {
    @Nullable
    @JSONField(name = "callup_url")
    private String callUpUrl;
    @JSONField(name = "click_type")
    private int clickType;
    @Nullable
    @JSONField(name = "jump_url")
    private String jumpUrl;
    @Nullable
    @JSONField(name = "report_urls")
    private List<String> reportUrls;

    @Nullable
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    @Nullable
    public String getCallUpUrl() {
        return this.callUpUrl;
    }

    public void setCallUpUrl(@Nullable String str) {
        this.callUpUrl = str;
    }

    public int getClickType() {
        return this.clickType;
    }

    public void setClickType(int i) {
        this.clickType = i;
    }

    @Nullable
    public List<String> getReportUrls() {
        return this.reportUrls;
    }

    public void setReportUrls(@Nullable List<String> list) {
        this.reportUrls = list;
    }
}
