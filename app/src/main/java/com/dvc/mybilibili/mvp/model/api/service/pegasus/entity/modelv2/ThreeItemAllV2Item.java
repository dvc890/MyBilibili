package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

import java.util.List;

@Keep
/* compiled from: BL */
public class ThreeItemAllV2Item extends BasicIndexItem implements C2265d<ThreeItemAllV2Item.SubVideoItem>, C2266e {
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @Nullable
    @JSONField(name = "item")
    public List<SubVideoItem> items;
    @Nullable
    @JSONField(name = "top_rcmd_reason_style")
    public Tag rcmdReason;

    @Keep
    /* compiled from: BL */
    public static class SubVideoItem extends BasicIndexItem {
        @JSONField(name = "cover_left_icon_1")
        public int coverLeftIcon1;
        @Nullable
        @JSONField(name = "cover_left_text_1")
        public String coverLeftText1;
        @Nullable
        @JSONField(name = "cover_right_text")
        public String coverRightText;
    }

    public boolean isValid() {
        return this.items != null && this.items.size() > 2;
    }

    @Nullable
    public List<SubVideoItem> getChildList() {
        return this.items;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }
}
