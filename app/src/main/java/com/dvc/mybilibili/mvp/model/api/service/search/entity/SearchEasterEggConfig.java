package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;

import java.io.Serializable;
import java.util.List;

/* compiled from: BL */
public class SearchEasterEggConfig extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 156464231564L;
    @Nullable
    @JSONField(name = "data")
    public List<SearchEasterEggItem> list;
    @Nullable
    @JSONField(name = "ver")
    public String version;
}
