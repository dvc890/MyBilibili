package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ConvergeItem {
    @Nullable
    @JSONField(name = "badge")
    public String badge;
    @Nullable
    @JSONField(name = "card_goto")
    public String cardGoto;
    @Nullable
    @JSONField(name = "card_type")
    public String cardType;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @Nullable
    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIconFirst;
    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIconSecond;
    @JSONField(name = "cover_left_text_1")
    public String coverLeftTextFirst;
    @JSONField(name = "cover_left_text_2")
    public String coverLeftTextSecond;
    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
