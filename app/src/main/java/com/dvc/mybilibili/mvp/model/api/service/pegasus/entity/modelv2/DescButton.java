package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class DescButton {
    @Nullable
    @JSONField(name = "event")
    public String event;
    @Nullable
    @JSONField(name = "event_v2")
    public String eventV2;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "selected")
    public int selected;
    @Nullable
    @JSONField(name = "text")
    public String text;
    @JSONField(name = "type")
    public int type;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
}
