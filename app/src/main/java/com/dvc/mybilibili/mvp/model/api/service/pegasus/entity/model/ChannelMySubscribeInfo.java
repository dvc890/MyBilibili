package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ChannelMySubscribeInfo {
    @Nullable
    @JSONField(name = "list")
    public List<Channel> channels;
    @JSONField(name = "display_count")
    public int displayCount;
}
