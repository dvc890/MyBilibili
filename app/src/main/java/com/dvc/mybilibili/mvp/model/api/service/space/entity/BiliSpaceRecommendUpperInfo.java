package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceRecommendUpperInfo */
public class BiliSpaceRecommendUpperInfo {
    @JSONField(name = "card_goto")
    public String cardGoto;
    @JSONField(name = "card_type")
    public String cardType;
    @JSONField(name = "goto")
    public String goTo;
    @JSONField(name = "items")
    public List<Item> items;
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "title")
    public String title;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceRecommendUpperInfo$Item */
    public static class Item {
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "desc_button")
        public DescButton descButton;
        public boolean followed;
        @JSONField(name = "goto")
        public String goTo;
        @JSONField(name = "official_icon")
        public int officialIcon;
        @JSONField(name = "param")
        public String param;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "uri")
        public String uri;
        @JSONField(name = "vip_type")
        public int vipType;

        @Keep
        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceRecommendUpperInfo$Item$DescButton */
        public static class DescButton {
            @JSONField(name = "event")
            public String event;
            @JSONField(name = "text")
            public String text;
            @JSONField(name = "type")
            public int type;
        }
    }
}
