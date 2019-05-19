package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Locale;

@Keep
/* compiled from: BL */
public class CategoryIndex {
    public CategoryBannerList banner;
    @JSONField(name = "card_id")
    public String cardId;
    @JSONField(name = "body")
    public List<Content> contents;
    public String cover;
    public long date;
    public String param;
    public String style;
    public String title;
    public String type;
    public String uri;

    @Keep
    /* compiled from: BL */
    public static class Content {
        public String cardId;
        public String cardName;
        public String categoryName;
        public String cover;
        @JSONField(name = "cover_mark")
        public String coverMark;
        public int danmaku;
        public String desc;
        public long duration;
        @JSONField(name = "etime")
        public String endTime;
        public String favourite;
        @JSONField(name = "goto")
        /* renamed from: go */
        public String f6348go;
        public String param;
        public int play;
        public int reid;
        public int rid;
        public String rname;
        @JSONField(name = "stime")
        public String startTime;
        public int status;
        public String style;
        public String title;
        @JSONField(name = "ugc_pay")
        public int ugcPay;
        public String uri;
    }

    @Keep
    /* compiled from: BL */
    public enum GoAction {
        AV,
        SUBAREA,
        WEB,
        GAME,
        BANGUMI,
        UNSUPPORTED;

        public static GoAction find(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException unused) {
                return UNSUPPORTED;
            }
        }
    }

    @Keep
    /* compiled from: BL */
    public enum Type {
        TOPIC,
        REGION,
        BANGUMI,
        ACTIVITY,
        FOCUS,
        TOPIC_NEW,
        ACTIVITY_NEW,
        CARD,
        DAILY,
        RANK,
        VIDEO_CARD,
        SPECIAL_CARD,
        TAG_CARD,
        UNSUPPORTED;

        public static Type find(String str) {
            if (TextUtils.isEmpty(str)) {
                return UNSUPPORTED;
            }
            try {
                return valueOf(str.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException unused) {
                return UNSUPPORTED;
            }
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean haveBanners() {
        return (this.banner == null || this.banner.topBanners == null || this.banner.topBanners.size() <= 0) ? false : true;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean hasHeadTitle() {
        return !TextUtils.isEmpty(this.title);
    }

    @JSONField(deserialize = false, serialize = false)
    public int getContentSize() {
        return this.contents == null ? 0 : this.contents.size();
    }
}
