package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ChannelSearchItem {
    @JSONField(name = "attentions")
    public long attentions;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "goto")
    public String goTo;
    @JSONField(name = "is_atten")
    public int isAtten;
    @JSONField(name = "param")
    public int param;
    @JSONField(name = "title")
    public String title;
    public String trackId;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "uri")
    public String uri;
}
