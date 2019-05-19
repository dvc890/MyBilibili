package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class Config {
    @JSONField(name = "autoplay_card")
    public int autoplayCard;
    @Nullable
    @JSONField(name = "bottom_text")
    public String bottomText;
    @Nullable
    @JSONField(name = "bottom_text_cover")
    public String bottomTextCover;
    @Nullable
    @JSONField(name = "bottom_text_url")
    public String bottomTextUrl;
    @JSONField(name = "column")
    public int column;
    @Nullable
    @JSONField(name = "follow_mode")
    public FollowMode followMode;
    @Nullable
    @JSONField(name = "item_title")
    public String itemName;
    @Nullable
    @JSONField(name = "top_items")
    public List<TopItem> topItems;

    @Keep
    /* compiled from: BL */
    public class FollowMode {
        @Nullable
        @JSONField(name = "option")
        public List<Option> option;
        @Nullable
        @JSONField(name = "title")
        public String title;
        @Nullable
        @JSONField(name = "toast_message")
        public String toastMessage;

        @Keep
        /* compiled from: BL */
        public class Option {
            @Nullable
            @JSONField(name = "desc")
            public String desc;
            @Nullable
            @JSONField(name = "title")
            public String title;
            @JSONField(name = "value")
            public int value;
        }
    }

    @Keep
    /* compiled from: BL */
    public class TopItem {
        @Nullable
        @JSONField(name = "icon")
        public String icon;
        @Nullable
        @JSONField(name = "module_id")
        public String moduleId;
        @Nullable
        @JSONField(name = "title")
        public String title;
        @Nullable
        @JSONField(name = "uri")
        public String uri;
    }

    public int countValidTopItem() {
        return this.topItems == null ? 0 : this.topItems.size();
    }
}
