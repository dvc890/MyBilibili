package com.dvc.mybilibili.mvp.model.api.service.search.entity.converge;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.search.entity.SearchVideoItem;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class ConvergePageItem {
    @JSONField(name = "pages")
    public int pages;
    @JSONField(name = "total")
    public int total;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;
    @Nullable
    @JSONField(name = "user_items")
    public ArrayList<ConvergeUpperItem> userItems;
    @Nullable
    @JSONField(name = "video_items")
    public ArrayList<SearchVideoItem> videoItems;
}
