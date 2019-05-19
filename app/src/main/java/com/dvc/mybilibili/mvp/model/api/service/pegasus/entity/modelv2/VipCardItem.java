package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

@Keep
/* compiled from: BL */
public class VipCardItem extends BasicIndexItem {
    @JSONField(deserialize = false, serialize = false)
    public transient boolean freshData = true;
}
