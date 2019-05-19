package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;

import java.util.List;

@Keep
/* compiled from: BL */
public class EntranceItem extends BasicIndexItem implements C2265d<BasicIndexItem> {
    @Nullable
    @JSONField(name = "items")
    public List<BasicIndexItem> item;

    @Nullable
    public List<BasicIndexItem> getChildList() {
        return this.item;
    }
}
