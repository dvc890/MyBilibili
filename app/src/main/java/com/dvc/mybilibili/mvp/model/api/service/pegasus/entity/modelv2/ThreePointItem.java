package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ThreePointItem {
    public static final String DISLIKE = "dislike";
    public static final String FEEDBACK = "feedback";
    public static final String WATCH_LATER = "watch_later";
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6345id;
    @Nullable
    @JSONField(name = "reasons")
    public List<DislikeReason> reasons;
    @Nullable
    @JSONField(name = "subtitle")
    public String subtitle;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "type")
    public String type;
}
