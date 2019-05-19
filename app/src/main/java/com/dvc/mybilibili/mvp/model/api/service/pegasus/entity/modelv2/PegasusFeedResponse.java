package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class PegasusFeedResponse {
    @Nullable
    @JSONField(name = "config")
    public Config config;
    @Nullable
    @JSONField(name = "ver")
    public String feedVer;
    @Nullable
    @JSONField(name = "items")
    public ArrayList<BasicIndexItem> items;
}
