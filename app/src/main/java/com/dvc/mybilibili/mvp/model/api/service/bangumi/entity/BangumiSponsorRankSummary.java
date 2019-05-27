package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;



@Keep
/* compiled from: BL */
public class BangumiSponsorRankSummary implements Parcelable {
    public static final Creator<BangumiSponsorRankSummary> CREATOR = new C18281();
    @JSONField(name = "list")
    public List<BangumiSponsorRankUser> mLists;
    @JSONField(name = "total")
    public int mTotalPayUsers;
    @JSONField(name = "week")
    public int mWeekPayUsers;
    @JSONField(name = "mine")
    public BangumiSponsorMineRank myRank;
    @JSONField(name = "point_activity")
    public BangumiSponsorEvent sponsorActivity;

    public BangumiSponsorRankSummary() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorRankSummary$1 */
    static class C18281 implements Creator<BangumiSponsorRankSummary> {
        C18281() {
        }

        /* renamed from: a */
        public BangumiSponsorRankSummary createFromParcel(Parcel parcel) {
            return new BangumiSponsorRankSummary(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorRankSummary[] newArray(int i) {
            return new BangumiSponsorRankSummary[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorRankSummary)) {
            return false;
        }
        BangumiSponsorRankSummary bangumiSponsorRankSummary = (BangumiSponsorRankSummary) obj;
        if (this.mWeekPayUsers != bangumiSponsorRankSummary.mWeekPayUsers || this.mTotalPayUsers != bangumiSponsorRankSummary.mTotalPayUsers) {
            return false;
        }
        if (!(this.myRank == null) ? this.myRank.equals(bangumiSponsorRankSummary.myRank) : bangumiSponsorRankSummary.myRank == null) {
            return false;
        }
        if (this.mLists != null) {
            z = this.mLists.equals(bangumiSponsorRankSummary.mLists);
        } else if (bangumiSponsorRankSummary.mLists != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.myRank != null ? this.myRank.hashCode() : 0) + 0) * 31;
        if (this.mLists != null) {
            i = this.mLists.hashCode();
        }
        return ((((hashCode + i) * 31) + this.mWeekPayUsers) * 31) + this.mTotalPayUsers;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BangumiSponsorRankSummary{, myRank=");
        stringBuilder.append(this.myRank);
        stringBuilder.append(", mLists=");
        stringBuilder.append(this.mLists);
        stringBuilder.append(", mWeekPayUsers=");
        stringBuilder.append(this.mWeekPayUsers);
        stringBuilder.append(", mTotalPayUsers=");
        stringBuilder.append(this.mTotalPayUsers);
        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.myRank, i);
        parcel.writeTypedList(this.mLists);
        parcel.writeParcelable(this.sponsorActivity, i);
        parcel.writeInt(this.mWeekPayUsers);
        parcel.writeInt(this.mTotalPayUsers);
    }

    protected BangumiSponsorRankSummary(Parcel parcel) {
        this.myRank = (BangumiSponsorMineRank) parcel.readParcelable(BangumiSponsorMineRank.class.getClassLoader());
        this.mLists = parcel.createTypedArrayList(BangumiSponsorRankUser.CREATOR);
        this.sponsorActivity = (BangumiSponsorEvent) parcel.readParcelable(BangumiSponsorEvent.class.getClassLoader());
        this.mWeekPayUsers = parcel.readInt();
        this.mTotalPayUsers = parcel.readInt();
    }
}
