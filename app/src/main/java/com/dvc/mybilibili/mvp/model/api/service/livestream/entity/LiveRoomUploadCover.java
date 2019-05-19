package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveRoomUploadCover {
    @JSONField(name = "audit_reason")
    public String auditReason;
    @JSONField(name = "audit_status")
    public int auditStatus;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f5802id;
    @JSONField(name = "select_status")
    public int selectStatus;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "url")
    public String url;
}
