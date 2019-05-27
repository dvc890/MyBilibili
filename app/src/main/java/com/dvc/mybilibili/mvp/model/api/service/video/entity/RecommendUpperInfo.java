package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.RecommendUpperInfo */
public class RecommendUpperInfo {
    @JSONField(name = "card_goto")
    public String mCardGoto;
    @JSONField(name = "card_type")
    public String mCardType;
    @JSONField(name = "goto")
    public String mGoto;
    @JSONField(name = "items")
    public List<Item> mItems;
    @JSONField(name = "param")
    public String mParam;
    @JSONField(name = "title")
    public String mTitle;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.RecommendUpperInfo$Item */
    public static class Item {
        public boolean isFollowed;
        @JSONField(name = "cover")
        public String mCover;
        @JSONField(name = "desc")
        public String mDesc;
        @JSONField(name = "desc_button")
        public DescButton mDescButton;
        @JSONField(name = "goto")
        public String mGoto;
        @JSONField(name = "official_icon")
        public int mOfficialIcon;
        @JSONField(name = "param")
        public String mParam;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "uri")
        public String mUri;

        @Keep
        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.RecommendUpperInfo$Item$DescButton */
        public static class DescButton {
            @JSONField(name = "event")
            public String mEvent;
            @JSONField(name = "text")
            public String mText;
            @JSONField(name = "type")
            public int mType;
        }
    }
}
