package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchSpecialGuideItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "phone")
    public String phone;
}
