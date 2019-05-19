package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

@Keep
/* compiled from: BL */
public class SelectItem extends BasicIndexItem {
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "left_button")
    public LeftButton leftButton;
    @Nullable
    @JSONField(name = "right_button")
    public RightButton rightButton;

    @Keep
    /* compiled from: BL */
    public static class LeftButton {
        @Nullable
        @JSONField(name = "event")
        public String event;
        @Nullable
        @JSONField(name = "text")
        public String text;
    }

    @Keep
    /* compiled from: BL */
    public static class RightButton {
        @Nullable
        @JSONField(name = "event")
        public String event;
        @Nullable
        @JSONField(name = "text")
        public String text;
    }
}
