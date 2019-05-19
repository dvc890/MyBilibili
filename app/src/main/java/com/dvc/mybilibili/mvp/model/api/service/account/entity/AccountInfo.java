package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class AccountInfo {
    public static final int ERROR_CODE = 10000;
    public static final int SEX_TYPE_FEMALE = 2;
    public static final int SEX_TYPE_MALE = 1;
    public static final int SEX_TYPE_OTHER = 0;
    public static final int SILENCE_TYPE_EVER = 2;
    public static final int SILENCE_TYPE_NONE = 0;
    public static final int SILENCE_TYPE_NO_EVER = 1;
    private String mAvatar;
    private String mBirthday;
    private float mCoins;
    private int mEmailStatus;
    private long mEndTime;
    private int mIdentification;
    private InviteInfo mInviteInfo;
    private int mLevel;
    private long mMid;
    private OfficialInfo mOfficialInfo;
    private PendantInfo mPendantInfo;
    private int mRank;
    private int mSex;
    private String mSignature;
    private int mSilence;
    private int mTelStatus;
    private String mUserName;
    private VipUserInfo mVipInfo;

    @JSONField(name = "mid")
    public long getMid() {
        return this.mMid;
    }

    @JSONField(name = "mid")
    public void setMid(long j) {
        this.mMid = j;
    }

    @JSONField(name = "name")
    public String getUserName() {
        return this.mUserName;
    }

    @JSONField(name = "name")
    public void setUserName(String str) {
        this.mUserName = str;
    }

    @JSONField(name = "face")
    public String getAvatar() {
        return this.mAvatar;
    }

    @JSONField(name = "face")
    public void setAvatar(String str) {
        this.mAvatar = str;
    }

    @JSONField(name = "sex")
    public int getSex() {
        return this.mSex;
    }

    @JSONField(name = "sex")
    public void setSex(int i) {
        this.mSex = i;
    }

    @JSONField(name = "rank")
    public int getRank() {
        return this.mRank;
    }

    @JSONField(name = "rank")
    public void setRank(int i) {
        this.mRank = i;
    }

    @JSONField(name = "vip")
    public VipUserInfo getVipInfo() {
        return this.mVipInfo;
    }

    @JSONField(name = "vip")
    public void setVipInfo(VipUserInfo vipUserInfo) {
        this.mVipInfo = vipUserInfo;
    }

    @JSONField(name = "official")
    public OfficialInfo getOfficialInfo() {
        return this.mOfficialInfo;
    }

    @JSONField(name = "official")
    public void setOfficialInfo(OfficialInfo officialInfo) {
        this.mOfficialInfo = officialInfo;
    }

    @JSONField(name = "invite")
    public InviteInfo getInviteInfo() {
        return this.mInviteInfo;
    }

    @JSONField(name = "invite")
    public void setInviteInfo(InviteInfo inviteInfo) {
        this.mInviteInfo = inviteInfo;
    }

    @JSONField(name = "level")
    public int getLevel() {
        return this.mLevel;
    }

    @JSONField(name = "level")
    public void setLevel(int i) {
        this.mLevel = i;
    }

    @JSONField(name = "silence")
    public int getSilence() {
        return this.mSilence;
    }

    @JSONField(name = "silence")
    public void setSilence(int i) {
        this.mSilence = i;
    }

    @JSONField(name = "email_status")
    public int getEmailStatus() {
        return this.mEmailStatus;
    }

    @JSONField(name = "email_status")
    public void setEmailStatus(int i) {
        this.mEmailStatus = i;
    }

    @JSONField(name = "tel_status")
    public int getTelStatus() {
        return this.mTelStatus;
    }

    @JSONField(name = "tel_status")
    public void setTelStatus(int i) {
        this.mTelStatus = i;
    }

    @JSONField(name = "coins")
    public float getCoins() {
        return this.mCoins;
    }

    @JSONField(name = "coins")
    public void setCoins(float f) {
        this.mCoins = f;
    }

    @JSONField(name = "birthday")
    public String getBirthday() {
        return this.mBirthday;
    }

    @JSONField(name = "birthday")
    public void setBirthday(String str) {
        this.mBirthday = str;
    }

    @JSONField(name = "sign")
    public String getSignature() {
        return this.mSignature;
    }

    @JSONField(name = "sign")
    public void setSignature(String str) {
        this.mSignature = str;
    }

    @JSONField(name = "end_time")
    public long getEndTime() {
        return this.mEndTime;
    }

    @JSONField(name = "end_time")
    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    @JSONField(name = "pendant")
    public PendantInfo getPendantInfo() {
        return this.mPendantInfo;
    }

    @JSONField(name = "pendant")
    public void setPendantInfo(PendantInfo pendantInfo) {
        this.mPendantInfo = pendantInfo;
    }

    @JSONField(name = "identification")
    public int getIdentification() {
        return this.mIdentification;
    }

    @JSONField(name = "identification")
    public void setIdentification(int i) {
        this.mIdentification = i;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isMobileVerified() {
        return this.mTelStatus > 0;
    }

    @JSONField(deserialize = false, serialize = false)
    public int getSilenceType() {
        if (this.mSilence == 0) {
            return 0;
        }
        return this.mEndTime == 0 ? 2 : 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isFormalAccount() {
        return this.mRank >= ERROR_CODE;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isRealName() {
        return this.mIdentification == 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isLittleVip() {
        return getVipInfo() != null && getVipInfo().isLittleVip();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return this.mMid == accountInfo.mMid && this.mUserName != null && this.mUserName.equals(accountInfo.mUserName);
    }

    public int hashCode() {
        return (((int) (this.mMid ^ (this.mMid >>> 32))) * 31) + this.mUserName.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccountInfo{mMid=");
        stringBuilder.append(this.mMid);
        stringBuilder.append(", mUserName='");
        stringBuilder.append(this.mUserName);
        stringBuilder.append('\'');
        stringBuilder.append(", mAvatar='");
        stringBuilder.append(this.mAvatar);
        stringBuilder.append('\'');
        stringBuilder.append(", mSex=");
        stringBuilder.append(this.mSex);
        stringBuilder.append(", mRank=");
        stringBuilder.append(this.mRank);
        stringBuilder.append(", mVipInfo=");
        stringBuilder.append(this.mVipInfo);
        stringBuilder.append(", mOfficialInfo=");
        stringBuilder.append(this.mOfficialInfo);
        stringBuilder.append(", mLevel=");
        stringBuilder.append(this.mLevel);
        stringBuilder.append(", mSilence=");
        stringBuilder.append(this.mSilence);
        stringBuilder.append(", mEndTime=");
        stringBuilder.append(this.mEndTime);
        stringBuilder.append(", mIdentification=");
        stringBuilder.append(this.mIdentification);
        stringBuilder.append(", mEmailStatus=");
        stringBuilder.append(this.mEmailStatus);
        stringBuilder.append(", mTelStatus=");
        stringBuilder.append(this.mTelStatus);
        stringBuilder.append(", mCoins=");
        stringBuilder.append(this.mCoins);
        stringBuilder.append(", mBirthday='");
        stringBuilder.append(this.mBirthday);
        stringBuilder.append('\'');
        stringBuilder.append(", mSignature='");
        stringBuilder.append(this.mSignature);
        stringBuilder.append('\'');
        stringBuilder.append(", mPendantInfo=");
        stringBuilder.append(this.mPendantInfo);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
