package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveShipTicket {
    @JSONField(name = "ruid")
    public long anchorId;
    @JSONField(name = "rusername")
    public String anchorUserName;
    @JSONField(name = "cost")
    public long cost;
    @JSONField(name = "expired_time")
    public String expired_time;
    @JSONField(name = "guard_level")
    public int guard_level;
    @JSONField(name = "num")
    public int num;
    @JSONField(name = "room_id")
    public String roomId;
    @JSONField(name = "token")
    public String token;
    @JSONField(name = "type")
    public int type;
    @JSONField(name = "uid")
    public long uid;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "username")
    public String username;
}
