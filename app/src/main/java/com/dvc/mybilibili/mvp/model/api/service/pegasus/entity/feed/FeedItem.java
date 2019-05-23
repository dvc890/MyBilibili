package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.support.annotation.Keep;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;

@Keep
/* compiled from: BL */
public abstract class FeedItem implements MultiItemEntity{
    private int viewType;

    public final int getViewType() {
        return this.viewType;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }

    @Override
    public final int getItemType() {
        return getViewType();
    }
}
