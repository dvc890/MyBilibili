package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveFightStatus {
    public static final int HAS_FIGHT = 1;
    public static final int NO_FIGHT = 0;
    @JSONField(name = "status")
    public int status;
}
