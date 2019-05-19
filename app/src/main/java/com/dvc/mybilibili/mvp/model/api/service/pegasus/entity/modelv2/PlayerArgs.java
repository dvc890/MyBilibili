package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class PlayerArgs {
    @JSONField(name = "aid")
    public int aid;
    @JSONField(name = "cid")
    public int cid;
    @JSONField(name = "ep_id")
    public long epid;
    @Nullable
    @JSONField(name = "duration")
    public int fakeDuration;
    @JSONField(name = "is_live")
    public int isLive;
    @JSONField(name = "is_preview")
    public int isPreview = -1;
    @JSONField(name = "room_id")
    public int roomId;
    @Nullable
    @JSONField(name = "type")
    public String videoType;
}
