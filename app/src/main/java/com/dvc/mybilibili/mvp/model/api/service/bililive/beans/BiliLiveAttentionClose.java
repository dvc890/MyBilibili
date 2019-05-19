package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAttentionClose {
    @Nullable
    @JSONField(name = "rooms")
    public List<LiveAttentionClose> mAttentions;
    @JSONField(name = "total_count")
    public int mCount;
    @JSONField(name = "has_more")
    public int mHasMore;
    @JSONField(name = "no_room_count")
    public int mNoRoomCount;
}
