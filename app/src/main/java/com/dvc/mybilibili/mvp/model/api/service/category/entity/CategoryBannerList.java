package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

@Keep
/* compiled from: BL */
public class CategoryBannerList {
    @JSONField(name = "top")
    public List<CategoryBanner> topBanners;

    @Keep
    /* compiled from: BL */
    public static class CategoryBanner implements Serializable {
        @JSONField(name = "ad_cb")
        public String adCb;
        @JSONField(name = "card_index")
        public long cardIndex = -1;
        public String categoryName;
        @JSONField(name = "click_url")
        public String clickUrl;
        @JSONField(name = "creative_id")
        public long creativeId;
        @JSONField(name = "extra")
        public JSONObject extra;
        public String hash;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6346id;
        public String image;
        @JSONField(name = "index")
        public long index;
        @JSONField(name = "client_ip")
        /* renamed from: ip */
        public String f6347ip;
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
        public String title;
        public String uri;
    }
}
