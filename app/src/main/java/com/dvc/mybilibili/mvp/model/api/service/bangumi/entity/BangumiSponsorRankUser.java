package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipExtraUserInfo;

@Keep
/* compiled from: BL */
public class BangumiSponsorRankUser implements Parcelable {
    public static final Creator<BangumiSponsorRankUser> CREATOR = new C18291();
    @JSONField(name = "face")
    public String mAvatar;
    public String mCount;
    @JSONField(name = "message")
    public String mMessage;
    @JSONField(name = "uid")
    public long mMid;
    @JSONField(name = "uname")
    public String mName;
    @JSONField(name = "rank")
    public int mRank;
    @JSONField(name = "vip")
    public VipExtraUserInfo vipInfo;

    public BangumiSponsorRankUser() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorRankUser$1 */
    static class C18291 implements Creator<BangumiSponsorRankUser> {
        C18291() {
        }

        /* renamed from: a */
        public BangumiSponsorRankUser createFromParcel(Parcel parcel) {
            return new BangumiSponsorRankUser(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorRankUser[] newArray(int i) {
            return new BangumiSponsorRankUser[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BPRank{, mMessage='");
        stringBuilder.append(this.mMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", mMid=");
        stringBuilder.append(this.mMid);
        stringBuilder.append(", mAvatar='");
        stringBuilder.append(this.mAvatar);
        stringBuilder.append('\'');
        stringBuilder.append(", mName='");
        stringBuilder.append(this.mName);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMessage);
        parcel.writeLong(this.mMid);
        parcel.writeString(this.mAvatar);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mRank);
        parcel.writeParcelable(this.vipInfo, i);
    }

    protected BangumiSponsorRankUser(Parcel parcel) {
        this.mMessage = parcel.readString();
        this.mMid = parcel.readLong();
        this.mAvatar = parcel.readString();
        this.mName = parcel.readString();
        this.mRank = parcel.readInt();
        this.vipInfo = (VipExtraUserInfo) parcel.readParcelable(VipExtraUserInfo.class.getClassLoader());
    }
}
