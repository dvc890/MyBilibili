package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiModule {
    public Head head;
    public List<Head> heads;
    public String icon;
    public List<Item> items;
    public String pageName;
    public String style;
    public String title;
    public int wid;

    @Keep
    /* compiled from: BL */
    public static class Head {
        @JSONField(name = "goto")
        public String goTo;
        public String icon;
        public String link;
        public String param;
        public String parentTitle;
        public String title;
    }

    @Keep
    /* compiled from: BL */
    public static class Item {
        public String badge;
        @JSONField(name = "badge_type")
        public int badgeType;
        public String cover;
        public String cursor;
        public String desc;
        public long duration;
        @JSONField(name = "is_new")
        public boolean isNew;
        public String link;
        public String moduleTitle = "";
        public String moduleType = "";
        public String pageName;
        public Stat stat;
        public String title;

        @Keep
        /* compiled from: BL */
        public static class Stat {
            public int danmaku;
            public int view;
        }
    }
}
