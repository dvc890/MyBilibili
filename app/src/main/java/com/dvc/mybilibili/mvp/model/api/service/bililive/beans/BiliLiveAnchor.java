package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAnchor {
    public boolean isPushSwitchEnable;
    @JSONField(name = "areaName")
    public String mAreaName;
    @JSONField(name = "area_v2_name")
    public String mAreaV2Name;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "fansNum")
    public int mFansNum;
    @JSONField(name = "live_status")
    public int mLiveStatus;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "offical_verify")
    public int mOfficialVerify;
    @JSONField(name = "online")
    public String mOnline;
    @JSONField(name = "tstatus")
    public int mPushStatus;
    @JSONField(name = "roomTags")
    public List<String> mRoomTags;
    @JSONField(name = "roomid")
    public int mRoomid;
    @JSONField(name = "round_status")
    public int mRoundStatus;
    @JSONField(name = "special_attention")
    public int mSpecialAttention;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "user_cover")
    public String mUserCover;

    public boolean isPushSwitchOpen() {
        return this.mPushStatus == 1;
    }

    public void setPushSwitchState(boolean z) {
        this.mPushStatus = z?1:0;
    }
}
