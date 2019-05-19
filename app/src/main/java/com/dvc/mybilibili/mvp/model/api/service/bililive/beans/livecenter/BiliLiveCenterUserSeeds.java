package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livecenter;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveUserSeed.Medal;

import java.util.Date;

@Keep
/* compiled from: BL */
public class BiliLiveCenterUserSeeds {
    @JSONField(name = "exp")
    public Exp mExp;
    @JSONField(name = "gold")
    public long mGold;
    @JSONField(name = "guard_count")
    public int mGuardCount;
    @JSONField(name = "vip_view_status")
    public boolean mIsOpen;
    @JSONField(name = "medal")
    public Medal mMedal;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "silver")
    public long mSilver;
    @JSONField(name = "vip")
    public Vip mVip;
    @JSONField(name = "wear_title")
    public WearTitle mWearTitle;

    @Keep
    /* compiled from: BL */
    public static class Exp {
        @JSONField(name = "color")
        public int mColor;
        @JSONField(name = "cost")
        public long mCost;
        @JSONField(name = "unext")
        public int mUnext;
        @JSONField(name = "user_level")
        public int mUserLevel;
        @JSONField(name = "user_level_cost")
        public long mUserLevelCost;
    }

    @Keep
    /* compiled from: BL */
    public static class Vip {
        @JSONField(name = "svip")
        public int mSvip;
        @JSONField(name = "svip_time")
        public Date mSvipTime;
        @JSONField(name = "vip")
        public int mVip;
        @JSONField(name = "vip_time")
        public Date mVipTime;

        public boolean isYearVip() {
            return this.mSvip == 1;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class WearTitle {
        @JSONField(name = "id")
        public String mId;
    }

    public boolean isVip() {
        return this.mVip != null && (this.mVip.mVip == 1 || this.mVip.mSvip == 1);
    }
}
