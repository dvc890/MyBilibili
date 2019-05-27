package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveGuardLottery implements Parcelable {
    public static final Creator<BiliLiveGuardLottery> CREATOR = new C20081();
    public static final int LOTTERY_CAPTAIN = 3;
    public static final int LOTTERY_COMMANDER = 2;
    public static final int LOTTERY_GOVERNOR = 1;
    public long mEndSystemTime;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "keyword")
    public String mKeyword;
    @JSONField(name = "mobile_animation_asset")
    public String mMobileAnimationAsset;
    @JSONField(name = "mobile_display_mode")
    public int mMobileDisplayMode;
    @JSONField(name = "mobile_static_asset")
    public String mMobileStaticAsset;
    @JSONField(name = "privilege_type")
    public int mPrivilege;
    @JSONField(name = "sender")
    public Sender mSender;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "time")
    public int mTime;

    public BiliLiveGuardLottery() {
    }

    @Keep
    /* compiled from: BL */
    public static class Sender implements Parcelable {
        public static final Creator<Sender> CREATOR = new C20071();
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "uname")
        public String mUname;

        public Sender() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardLottery$Sender$1 */
        static class C20071 implements Creator<Sender> {
            C20071() {
            }

            public Sender createFromParcel(Parcel parcel) {
                return new Sender(parcel);
            }

            public Sender[] newArray(int i) {
                return new Sender[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Sender(Parcel parcel) {
            this.mUid = parcel.readLong();
            this.mUname = parcel.readString();
            this.mFace = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.mUid);
            parcel.writeString(this.mUname);
            parcel.writeString(this.mFace);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardLottery$1 */
    static class C20081 implements Creator<BiliLiveGuardLottery> {
        C20081() {
        }

        public BiliLiveGuardLottery createFromParcel(Parcel parcel) {
            return new BiliLiveGuardLottery(parcel);
        }

        public BiliLiveGuardLottery[] newArray(int i) {
            return new BiliLiveGuardLottery[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveGuardLottery(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mSender = (Sender) parcel.readParcelable(Sender.class.getClassLoader());
        this.mKeyword = parcel.readString();
        this.mTime = parcel.readInt();
        this.mPrivilege = parcel.readInt();
        this.mStatus = parcel.readInt();
        this.mMobileDisplayMode = parcel.readInt();
        this.mMobileStaticAsset = parcel.readString();
        this.mMobileAnimationAsset = parcel.readString();
        this.mEndSystemTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeParcelable(this.mSender, i);
        parcel.writeString(this.mKeyword);
        parcel.writeInt(this.mTime);
        parcel.writeInt(this.mPrivilege);
        parcel.writeInt(this.mStatus);
        parcel.writeInt(this.mMobileDisplayMode);
        parcel.writeString(this.mMobileStaticAsset);
        parcel.writeString(this.mMobileAnimationAsset);
        parcel.writeLong(this.mEndSystemTime);
    }
}
