package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveUserCard {
    @JSONField(name = "is_block")
    public int isBlock;
    @JSONField(name = "attention_num")
    public int mAttentionNum;
    @Nullable
    @JSONField(name = "desc")
    public String mDesc;
    @Nullable
    @JSONField(name = "face")
    public String mFace;
    @Nullable
    @JSONField(name = "fans_medal")
    public FansMedal mFansMedal;
    @JSONField(name = "follow_num")
    public int mFollowNum;
    @JSONField(name = "is_admin")
    public int mIsAdmin;
    @JSONField(name = "level_color")
    public int mLevelColor;
    @JSONField(name = "main_vip")
    public int mMainVip;
    @JSONField(name = "month_vip")
    public int mMonthVip;
    @Nullable
    @JSONField(name = "pendant")
    public String mPendant;
    @JSONField(name = "pendant_from")
    public int mPendantFrom;
    @JSONField(name = "privilege_type")
    public int mPrivilegeType;
    @JSONField(name = "relation_status")
    public int mRelationStatus;
    @Nullable
    @JSONField(name = "title_mark")
    public String mTitleMark;
    @JSONField(name = "uid")
    public long mUid;
    @Nullable
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "uname_color")
    public int mUnameColor;
    @JSONField(name = "user_level")
    public int mUserLevel;
    @JSONField(name = "verify_type")
    public int mVerifyType;
    @JSONField(name = "year_vip")
    public int mYearVip;
    @JSONField(name = "mailbox_notice")
    public int mailBoxNotice;
    @JSONField(name = "mailbox_switch")
    public int mailBoxSwitch;

    @Keep
    /* compiled from: BL */
    public static class FansMedal implements Parcelable {
        public static final Creator<FansMedal> CREATOR = new C20481();
        @JSONField(name = "anchor_id")
        public long anchorId;
        @JSONField(name = "level")
        public int mLevel;
        @JSONField(name = "medal_color")
        public int mMedalColor;
        @JSONField(name = "medal_id")
        public int mMedalId;
        @Nullable
        @JSONField(name = "medal_name")
        public String mMedalName;

        public FansMedal() {

        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveUserCard$FansMedal$1 */
        static class C20481 implements Creator<FansMedal> {
            C20481() {
            }

            public FansMedal createFromParcel(Parcel parcel) {
                return new FansMedal(parcel);
            }

            public FansMedal[] newArray(int i) {
                return new FansMedal[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mMedalId);
            parcel.writeString(this.mMedalName);
            parcel.writeInt(this.mLevel);
            parcel.writeInt(this.mMedalColor);
            parcel.writeLong(this.anchorId);
        }

        public FansMedal(Parcel parcel) {
            this.mMedalId = parcel.readInt();
            this.mMedalName = parcel.readString();
            this.mLevel = parcel.readInt();
            this.mMedalColor = parcel.readInt();
            this.anchorId = parcel.readLong();
        }
    }

    public boolean shouldShowMailBox() {
        return this.mailBoxSwitch == 1;
    }

    public boolean shouldShowMailBoxNotice() {
        return this.mailBoxNotice == 1;
    }
}
