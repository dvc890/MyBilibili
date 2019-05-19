package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class Tag {
    @Nullable
    @JSONField(name = "bg_color")
    public String bgColor;
    @JSONField(name = "bg_style")
    public int bgStyle;
    @Nullable
    @JSONField(name = "border_color")
    public String borderColor;
    @Nullable
    @JSONField(name = "text")
    public String text;
    @Nullable
    @JSONField(name = "text_color")
    public String textColor;
}
