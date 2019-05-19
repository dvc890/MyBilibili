package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiBanner {
    @JSONField(name = "ad_cb")
    public String adCb;
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "client_ip")
    public String clientIp;
    @JSONField(name = "cm_mark")
    public long cmMark;
    @JSONField(name = "img")
    public String cover;
    @JSONField(name = "creative_id")
    public long creativeId;
    /* renamed from: id */
    public int f5637id;
    @JSONField(name = "index")
    public long index;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    public String link;
    @JSONField(name = "pub_time")
    public String pubTime;
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
    public String title;
}
