package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveStarAnchor {
    @Nullable
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "focus_num")
    public int focus_num;
    @JSONField(name = "room_id")
    public int roomId;
    @JSONField(name = "uid")
    public long uid;
    @Nullable
    @JSONField(name = "uname")
    public String uname;
}
