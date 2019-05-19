package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomAnnounceInfo {
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "ctime")
    public String ctime;
    @JSONField(name = "roomid")
    public int roomId;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = "uid")
    public int uid;
    @JSONField(name = "uname")
    public String uname;
}
