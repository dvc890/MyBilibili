package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;

import java.util.List;

@Keep
/* compiled from: BL */
public class HotTopicItem extends BasicIndexItem implements C2265d<HotTopicItem.TopicItem> {
    @Nullable
    @JSONField(name = "desc")
    public String desc;
    @Nullable
    @JSONField(name = "items")
    public List<TopicItem> items;

    @Keep
    /* compiled from: BL */
    public static class TopicItem extends BasicIndexItem {
        @Nullable
        @JSONField(name = "name")
        public String name;
    }

    @Nullable
    public List<TopicItem> getChildList() {
        return this.items;
    }
}
