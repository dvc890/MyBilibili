package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.suggest.C2278a;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchSuggest {
    @Nullable
    @JSONField(name = "list")
    public List<C2278a> list;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;
}
