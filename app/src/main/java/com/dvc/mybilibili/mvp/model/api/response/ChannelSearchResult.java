package com.dvc.mybilibili.mvp.model.api.response;

import android.support.annotation.Keep;

import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.ChannelSearchItem;

import java.util.List;

@Keep
/* compiled from: BL */
public class ChannelSearchResult {
    public List<ChannelSearchItem> items;
    public int totalPages;
    public String trackId;
}
