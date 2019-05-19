package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class Tag {
    @Nullable
    @JSONField(name = "bg_color")
    public String bgColor;
    @Nullable
    @JSONField(name = "bg_color_night")
    public String bgColorNight;
    @JSONField(name = "bg_style")
    public int bgStyle;
    @Nullable
    @JSONField(name = "border_color")
    public String borderColor;
    @Nullable
    @JSONField(name = "border_color_night")
    public String borderColorNight;
    @Nullable
    @JSONField(name = "text")
    public String text;
    @Nullable
    @JSONField(name = "text_color")
    public String textColor;
    @Nullable
    @JSONField(name = "text_color_night")
    public String textColorNight;
}
