package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveGuard {
    @JSONField(name = "expired_date")
    public String mExpiredDate;
    @JSONField(name = "guard_level")
    public int mGuardLevel;
    @JSONField(name = "guard_level_name")
    public String mGuardLevelName;
    @JSONField(name = "notice_status")
    public int mIsNotice;
    @JSONField(name = "rebuy")
    public int mRebuy;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "ruid")
    public long mRuid;
    @JSONField(name = "rusername")
    public String mRuserName;
    @JSONField(name = "warning")
    public String mWarning;
}
