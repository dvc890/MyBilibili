package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchBannerResource {
    @Nullable
    @JSONField(name = "ad_cb")
    public String adCb;
    @JSONField(name = "card_index")
    public long cardIndex = -1;
    @Nullable
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "cm_mark")
    public int cm_mark;
    @JSONField(name = "creative_id")
    public long creativeId;
    @Nullable
    @JSONField(name = "extra")
    public JSONObject extra;
    @Nullable
    @JSONField(name = "hash")
    public String hash;
    @Nullable
    @JSONField(name = "id")
    /* renamed from: id */
    public String f6354id;
    @Nullable
    @JSONField(name = "image")
    public String image;
    @JSONField(name = "index")
    public long index;
    @Nullable
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String f6355ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @Nullable
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @Nullable
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "src_id")
    public long srcId;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
