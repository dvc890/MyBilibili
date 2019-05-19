package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class RegionRecommendVideo {
    @JSONField(name = "banner")
    public BannerMeta bannerMeta;
    @JSONField(name = "cbottom")
    public long cBottom;
    @JSONField(name = "ctop")
    public long cTop;
    @JSONField(name = "card")
    public List<CategoryIndex> cards;
    @JSONField(name = "new")
    public List<BiliVideoV2> newVideo;
    @JSONField(name = "recommend")
    public List<BiliVideoV2> recommend;

    @Keep
    /* compiled from: BL */
    public static class Banner {
        @JSONField(name = "ad_cb")
        public String adCb;
        @JSONField(name = "card_index")
        public long cardIndex = -1;
        @JSONField(name = "click_url")
        public String clickUrl;
        @JSONField(name = "cm_mark")
        public long cmMark;
        @JSONField(name = "creative_id")
        public long creativeId;
        @JSONField(name = "extra")
        public JSONObject extra;
        @JSONField(name = "hash")
        public String hash;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6350id;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "index")
        public long index;
        @JSONField(name = "client_ip")
        /* renamed from: ip */
        public String f6351ip;
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
        @JSONField(name = "uri")
        public String uri;
    }

    @Keep
    /* compiled from: BL */
    public static class BannerMeta {
        @JSONField(name = "top")
        public List<Banner> top;
    }

    public List<Banner> getBannerList() {
        return (this.bannerMeta == null || this.bannerMeta.top == null) ? null : this.bannerMeta.top;
    }
}
