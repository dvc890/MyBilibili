package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveGuardRankItem {
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "guard_level")
    public int guardLevel;
    @JSONField(name = "is_alive")
    public int isAlive;
    @JSONField(name = "rank")
    public int rank;
    @JSONField(name = "ruid")
    public long ruid;
    @JSONField(name = "uid")
    public long uid;
    @JSONField(name = "username")
    public String userName;
}
