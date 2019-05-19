package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.dynamiclayout.api.bean.ActionClickBean */
public class ActionClickBean {
    @JSONField(name = "callup_url")
    String callUpUrl;
    @JSONField(name = "click_type")
    int clickType;
    @JSONField(name = "report_urls")
    List<String> reportUrls;
    @JSONField(name = "uri")
    String uri;

    public int getClickType() {
        return this.clickType;
    }

    public void setClickType(int i) {
        this.clickType = i;
    }

    public String getUri() {
        return this.uri;
    }

    public ActionClickBean setUri(String str) {
        this.uri = str;
        return this;
    }

    public String getCallUpUrl() {
        return this.callUpUrl;
    }

    public void setCallUpUrl(String str) {
        this.callUpUrl = str;
    }

    public List<String> getReportUrls() {
        return this.reportUrls;
    }

    public void setReportUrls(List<String> list) {
        this.reportUrls = list;
    }
}
