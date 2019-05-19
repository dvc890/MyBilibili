package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.category.entity.CategoryMeta;

import java.util.List;

@Keep
/* compiled from: BL */
public class ChannelHomeInfo {
    @Nullable
    @JSONField(name = "atten_channel")
    public List<Channel> attenChannel;
    @Nullable
    @JSONField(name = "region_bottom")
    public List<CategoryMeta> bottomCategory;
    @Nullable
    @JSONField(name = "rec_channel")
    public List<Channel> recommendChannel;
    @Nullable
    @JSONField(name = "region_top")
    public List<CategoryMeta> topCategory;
}
