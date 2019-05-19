package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;

import java.util.List;

@Keep
/* compiled from: BL */
public class RcmdMultiItem extends BasicIndexItem implements C2265d<BasicIndexItem> {
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public transient List<BasicIndexItem> items;
    @Nullable
    @JSONField(name = "more_text")
    public String moreText;
    @Nullable
    @JSONField(name = "more_uri")
    public String moreUri;

    @Nullable
    public List<BasicIndexItem> getChildList() {
        return this.items;
    }
}
