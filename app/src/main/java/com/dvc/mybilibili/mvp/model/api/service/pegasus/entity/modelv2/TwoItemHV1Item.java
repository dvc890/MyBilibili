package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.*;

import java.util.List;

@Keep
/* compiled from: BL */
public class TwoItemHV1Item extends BasicIndexItem implements C2265d<TwoItemHV1Item.VideoItem> {
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;
    @JSONField(deserialize = false, serialize = false)
    public transient boolean followed = false;
    @Nullable
    @JSONField(name = "item")
    public List<VideoItem> videos;

    @Keep
    /* compiled from: BL */
    public static class VideoItem extends BasicIndexItem {
        @Nullable
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
        return this.videos != null && this.videos.size() > 1;
    }

    @Nullable
    public List<VideoItem> getChildList() {
        return this.videos;
    }
}
