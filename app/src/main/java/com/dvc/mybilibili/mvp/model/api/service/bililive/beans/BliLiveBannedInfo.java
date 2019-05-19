package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BliLiveBannedInfo {
    public static final int BAN_FOREVER = -1;
    public static final int BAN_TIME = -2;
    public static final int NOT_BAN = 0;
    @JSONField(name = "lock_till")
    public long mLockTill;
}
