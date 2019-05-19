package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomInit {
    @JSONField(name = "encrypted")
    public boolean mEncrypted;
    @JSONField(name = "is_hidden")
    public boolean mIsHidden;
    @JSONField(name = "is_locked")
    public boolean mIsLocked;
    @JSONField(name = "is_portrait")
    public boolean mIsVertical;
    @JSONField(name = "live_status")
    public int mLiveStatus;
    @JSONField(name = "pwd_verified")
    public boolean mPwdVerified;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "short_id")
    public int mShortId;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "special_type")
    public int specialType;

    public boolean isVerticalType() {
        return this.mIsVertical;
    }
}
