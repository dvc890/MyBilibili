package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2265d;

import java.util.List;

@Keep
/* compiled from: BL */
public class BannerListItem extends BasicIndexItem implements C2265d<BannerItem> {
    @Nullable
    @JSONField(name = "banner_item")
    public List<BannerItem> bannerItem;
    @Nullable
    @JSONField(name = "hash")
    public String hash;

    @Nullable
    public List<BannerItem> getChildList() {
        return this.bannerItem;
    }
}
