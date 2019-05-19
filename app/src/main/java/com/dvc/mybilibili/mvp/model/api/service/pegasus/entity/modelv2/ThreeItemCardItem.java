package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

import java.util.List;

@Keep
/* compiled from: BL */
public class ThreeItemCardItem extends BasicIndexItem implements C2265d<ThreeItemCardItem.ThreeItemChildItem> {
    @Nullable
    @JSONField(name = "items")
    public List<ThreeItemChildItem> items;
    @Nullable
    @JSONField(name = "more_text")
    public String moreText;
    @Nullable
    @JSONField(name = "more_uri")
    public String moreUri;

    @Keep
    /* compiled from: BL */
    public static class ThreeItemChildItem extends BasicIndexItem {
        @Nullable
        @JSONField(name = "badge")
        public String badge;
        @JSONField(name = "cover_left_icon")
        public int coverLeftIcon;
        @Nullable
        @JSONField(name = "cover_left_text")
        public String coverLeftText;
        @Nullable
        @JSONField(name = "desc")
        public String desc;
        @Nullable
        @JSONField(name = "desc_1")
        public String desc1;
        @Nullable
        @JSONField(name = "desc_2")
        public String desc2;
        @JSONField(name = "desc_icon_1")
        public int descIcon1;
        @JSONField(name = "desc_icon_2")
        public int descIcon2;
        @Nullable
        @JSONField(name = "desc_text_1")
        public String descText1;
        @Nullable
        @JSONField(name = "desc_text_2")
        public String descText2;
        @JSONField(name = "icon")
        public int icon;
    }

    @Nullable
    public List<ThreeItemChildItem> getChildList() {
        return this.items;
    }
}
