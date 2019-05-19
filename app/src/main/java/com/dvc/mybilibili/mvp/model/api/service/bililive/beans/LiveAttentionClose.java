package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveAttentionClose {
    @JSONField(name = "area_v2_id")
    public int areaId;
    @Nullable
    @JSONField(name = "area_v2_name")
    public String areaName;
    @JSONField(name = "attentions")
    public int attentionCount;
    @JSONField(name = "broadcast_type")
    public int broadcastType;
    @Nullable
    @JSONField(name = "face")
    public String face;
    public boolean hasReport;
    @JSONField(name = "live_status")
    public int liveStatus;
    @Nullable
    @JSONField(name = "uname")
    public String name;
    @Nullable
    @JSONField(name = "announcement_content")
    public String noticeContent;
    @Nullable
    @JSONField(name = "announcement_time")
    public String noticeTime;
    @JSONField(name = "official_verify")
    public int officialVerify = -1;
    @JSONField(name = "area_v2_parent_id")
    public int parentAreaId;
    public int reportPosition;
    @JSONField(name = "roomid")
    public int roomId;
    @JSONField(name = "special_attention")
    public int specialAttention;
    @Nullable
    @JSONField(name = "live_desc")
    public String timeDesc;
}
