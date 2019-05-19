package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomUserInfo implements Parcelable {
    public static final Creator<BiliLiveRoomUserInfo> CREATOR = new C20401();
    @JSONField(name = "bili_vip")
    public int mBiliVip;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "identification")
    public int mIdentification;
    @JSONField(name = "mobile_verify")
    public int mMobileVerify;
    @JSONField(name = "mobile_virtual")
    public int mMobileVirtual;
    @JSONField(name = "official_verify")
    public OfficialVerify mOfficialVerify;
    @JSONField(name = "platform_user_level")
    public int mPlatformUserLevel;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "uid")
    public int mUid;
    @JSONField(name = "uname")
    public String mUname;

    @Keep
    /* compiled from: BL */
    public static class OfficialVerify implements Parcelable {
        public static final Creator<OfficialVerify> CREATOR = new C20391();
        @JSONField(name = "desc")
        public String mVerifyDesc;
        @JSONField(name = "type")
        public int mVerifyType;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomUserInfo$OfficialVerify$1 */
        static class C20391 implements Creator<OfficialVerify> {
            C20391() {
            }

            public OfficialVerify createFromParcel(Parcel parcel) {
                return new OfficialVerify(parcel);
            }

            public OfficialVerify[] newArray(int i) {
                return new OfficialVerify[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected OfficialVerify(Parcel parcel) {
            this.mVerifyType = parcel.readInt();
            this.mVerifyDesc = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mVerifyType);
            parcel.writeString(this.mVerifyDesc);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomUserInfo$1 */
    static class C20401 implements Creator<BiliLiveRoomUserInfo> {
        C20401() {
        }

        public BiliLiveRoomUserInfo createFromParcel(Parcel parcel) {
            return new BiliLiveRoomUserInfo(parcel);
        }

        public BiliLiveRoomUserInfo[] newArray(int i) {
            return new BiliLiveRoomUserInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mUid);
        parcel.writeString(this.mUname);
        parcel.writeString(this.mFace);
        parcel.writeInt(this.mRank);
        parcel.writeInt(this.mIdentification);
        parcel.writeInt(this.mMobileVerify);
        parcel.writeInt(this.mMobileVirtual);
        parcel.writeParcelable(this.mOfficialVerify, i);
        parcel.writeInt(this.mPlatformUserLevel);
        parcel.writeInt(this.mBiliVip);
    }

    protected BiliLiveRoomUserInfo(Parcel parcel) {
        this.mUid = parcel.readInt();
        this.mUname = parcel.readString();
        this.mFace = parcel.readString();
        this.mRank = parcel.readInt();
        this.mIdentification = parcel.readInt();
        this.mMobileVerify = parcel.readInt();
        this.mMobileVirtual = parcel.readInt();
        this.mOfficialVerify = (OfficialVerify) parcel.readParcelable(OfficialVerify.class.getClassLoader());
        this.mPlatformUserLevel = parcel.readInt();
        this.mBiliVip = parcel.readInt();
    }
}
