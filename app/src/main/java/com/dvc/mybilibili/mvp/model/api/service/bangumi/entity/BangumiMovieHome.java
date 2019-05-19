package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiMovieHome {
    public List<Banner> ads;
    public List<ADBanner> banners;
    public List<Fall> falls;
    public List<BangumiMovie> hots;
    public List<Recommend> recommends;
    public List<BangumiVideo> relates;

    @Keep
    /* compiled from: BL */
    public static class Banner {
        public String desc;
        public String img;
        public int index;
        public String link;
        public String title;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Banner banner = (Banner) obj;
            if (!(this.title == null) ? this.title.equals(banner.title) : banner.title == null) {
                return false;
            }
            if (!(this.link == null) ? this.link.equals(banner.link) : banner.link == null) {
                return false;
            }
            if (this.img != null) {
                z = this.img.equals(banner.img);
            } else if (banner.img != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((this.title != null ? this.title.hashCode() : 0) * 31) + (this.link != null ? this.link.hashCode() : 0)) * 31;
            if (this.img != null) {
                i = this.img.hashCode();
            }
            return hashCode + i;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Fall {
        public String cover;
        public String cursor;
        public String desc;
        /* renamed from: id */
        public String f5640id;
        @JSONField(name = "is_new")
        public int isNew;
        public String link;
        public String reply;
        public String title;
    }

    @Keep
    /* compiled from: BL */
    public static class RecommendItem {
        public int aid;
        public String cover;
        @JSONField(name = "is_wide")
        public int isWide;
        @JSONField(name = "movie_id")
        public int movieId;
        public String title;
    }

    @Keep
    /* compiled from: BL */
    public static class ADBanner extends Banner {
        @JSONField(name = "ad_cb")
        public String adCb;
        @JSONField(name = "click_url")
        public String clickUrl;
        @JSONField(name = "client_ip")
        public String clientIp;
        @JSONField(name = "creative_id")
        public long creativeId;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f8692id;
        @JSONField(name = "index")
        public long index;
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
    }

    @Keep
    /* compiled from: BL */
    public static class Category {
        /* renamed from: id */
        public int f15274id;
        public String name;
    }

    @Keep
    /* compiled from: BL */
    public static class Recommend {
        public Category category;
        public List<RecommendItem> list;
    }
}
