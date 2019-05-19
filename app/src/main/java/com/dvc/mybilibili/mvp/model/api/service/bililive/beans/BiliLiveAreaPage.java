package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

//////

@Keep
/* compiled from: BL */
public class BiliLiveAreaPage {
    @JSONField(name = "activity_banner")
    public List<ActivityCard> activityCards;
    @Nullable
    @JSONField(name = "banner")
    public List<Banner> banner;
    @JSONField(name = "count")
    public int count;
    @Nullable
    @JSONField(name = "list")
    public List<BiliLiveV2> list;
    @Nullable
    @JSONField(name = "new_tags")
    public List<SortConfig> sortConfigs;

    @Keep
    /* compiled from: BL */
    public static class ActivityCard {
        public static final String KEY_ACTIVITY_ID = "activity_id";
        public static final String KEY_MATCH_TIME = "matchTime";
        public static final String KEY_PARENT_ID = "parent_id";
        public static final String KEY_SUBAREA_ID = "subarea_id";
        public static final int TYPE_ACTIVITY = 2;
        public static final int TYPE_MATCH = 1;
        @JSONField(name = "activity_url")
        public String activityActivityUrl = "";
        @JSONField(name = "aid")
        public long activityAid;
        @JSONField(name = "button_url")
        public String activityButtonUrl = "";
        @JSONField(name = "logo_url")
        public String activityLogoUrl = "";
        @JSONField(name = "on_live")
        public int activityOnLive;
        @JSONField(name = "start_at")
        public long activityStartTime;
        @JSONField(name = "status")
        public int activityStatus;
        @JSONField(name = "time_text")
        public String activityTimeText = "";
        @JSONField(name = "type")
        public int activityType;
        public boolean hasReport = false;
        public boolean isNetWorking = false;
        @JSONField(name = "title")
        public String title;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ActivityCard{activityAid=");
            stringBuilder.append(this.activityAid);
            stringBuilder.append(", activityType=");
            stringBuilder.append(this.activityType);
            stringBuilder.append(", title='");
            stringBuilder.append(this.title);
            stringBuilder.append('\'');
            stringBuilder.append(", activityLogoUrl='");
            stringBuilder.append(this.activityLogoUrl);
            stringBuilder.append('\'');
            stringBuilder.append(", activityStartTime=");
            stringBuilder.append(this.activityStartTime);
            stringBuilder.append(", activityTimeText='");
            stringBuilder.append(this.activityTimeText);
            stringBuilder.append('\'');
            stringBuilder.append(", activityButtonUrl='");
            stringBuilder.append(this.activityButtonUrl);
            stringBuilder.append('\'');
            stringBuilder.append(", activityActivityUrl='");
            stringBuilder.append(this.activityActivityUrl);
            stringBuilder.append('\'');
            stringBuilder.append(", activityStatus=");
            stringBuilder.append(this.activityStatus);
            stringBuilder.append(", activityOnLive=");
            stringBuilder.append(this.activityOnLive);
//            ////stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Banner {
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5989id;
        @JSONField(name = "link")
        public String link = "";
        @JSONField(name = "pic")
        public String pic = "";

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Banner{id=");
            stringBuilder.append(this.f5989id);
            stringBuilder.append(", pic='");
            stringBuilder.append(this.pic);
            stringBuilder.append('\'');
            stringBuilder.append(", link='");
            stringBuilder.append(this.link);
            stringBuilder.append('\'');
//            ////stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Hero {
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5990id;
        @JSONField(name = "live_desc")
        public String liveDesc = "";
        @JSONField(name = "name")
        public String name = "";
        @JSONField(name = "pic")
        public String pic = "";
        @JSONField(name = "sort_type")
        public String sortType = "";
    }

    @Keep
    /* compiled from: BL */
    public static class SortConfig {
        @Nullable
        @JSONField(name = "hero_list")
        public List<Hero> heroList;
        @JSONField(name = "icon")
        public String icon = "";
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5991id;
        @JSONField(name = "name")
        public String name = "";
        @JSONField(name = "sort_type")
        public String sortType = "";
        @Nullable
        @JSONField(name = "sub")
        public List<SortConfig> sub;
        @JSONField(name = "type")
        public int type = 0;
    }
}
