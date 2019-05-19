package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.C2267f;

@Keep
/* compiled from: BL */
public class BasePlayerItem extends BasicIndexItem implements C2267f {
    @JSONField(name = "can_play")
    public int canPlay;
    public transient boolean isPlayError = false;
    @Nullable
    @JSONField(name = "player_args")
    public PlayerArgs playerArgs;

    public boolean isLive() {
        return this.gotoType == C17133j.f47865a.mo56943c() || this.gotoType == C17133j.f47865a.mo56942b();
    }

    @Nullable
    public PlayerArgs getPlayerArgs() {
        return this.playerArgs;
    }
}
