package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ColumnBanner {
    @JSONField(name = "ad_cb")
    public String adCb;
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "creative_id")
    public long creativeId;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6133id;
    @JSONField(name = "image")
    public String image;
    @JSONField(name = "index")
    public long index;
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f6134ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "src_id")
    public long srcId;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "url")
    public String url;
}
