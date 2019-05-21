package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

@Keep
/* compiled from: BL */
public class BannerItem extends BasicIndexItem {
    @Nullable
    @JSONField(name = "extra")
    public JSONObject extra;
    @JSONField(name = "id")
    /* renamed from: id */
    public int id;
    @Nullable
    @JSONField(name = "image")
    public String image;
    @JSONField(name = "index")
    public int index;
}
