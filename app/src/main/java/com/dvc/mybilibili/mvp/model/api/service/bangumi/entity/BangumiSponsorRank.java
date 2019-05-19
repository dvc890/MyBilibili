package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;



@Keep
/* compiled from: BL */
public class BangumiSponsorRank implements Parcelable {
    public static final Creator<BangumiSponsorRank> CREATOR = new C18271();
    @JSONField(name = "list")
    public List<BangumiSponsorRankUser> mLists;
    @JSONField(name = "users")
    public int mUsers;
    @JSONField(name = "mine")
    public BangumiSponsorMineRank myRank;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorRank$1 */
    static class C18271 implements Creator<BangumiSponsorRank> {
        C18271() {
        }

        /* renamed from: a */
        public BangumiSponsorRank createFromParcel(Parcel parcel) {
            return new BangumiSponsorRank(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorRank[] newArray(int i) {
            return new BangumiSponsorRank[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiSponsorRank(Parcel parcel) {
        this.mUsers = parcel.readInt();
        this.myRank = (BangumiSponsorMineRank) parcel.readParcelable(BangumiSponsorMineRank.class.getClassLoader());
        this.mLists = parcel.createTypedArrayList(BangumiSponsorRankUser.CREATOR);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorRank)) {
            return false;
        }
        BangumiSponsorRank bangumiSponsorRank = (BangumiSponsorRank) obj;
        if (!(this.myRank == null) ? this.myRank.equals(bangumiSponsorRank.myRank) : bangumiSponsorRank.myRank == null) {
            return false;
        }
        if (this.mLists != null) {
            z = this.mLists.equals(bangumiSponsorRank.mLists);
        } else if (bangumiSponsorRank.mLists != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mUsers * 31) + (this.myRank != null ? this.myRank.hashCode() : 0)) * 31;
        if (this.mLists != null) {
            i = this.mLists.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiSponsorRank{, myRank=");
        stringBuilder.append(this.myRank);
        stringBuilder.append(", mLists=");
        stringBuilder.append(this.mLists);
        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mUsers);
        parcel.writeParcelable(this.myRank, i);
        parcel.writeTypedList(this.mLists);
    }
}
