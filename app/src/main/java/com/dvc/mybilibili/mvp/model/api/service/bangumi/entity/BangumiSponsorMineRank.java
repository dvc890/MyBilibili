package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;



@Keep
/* compiled from: BL */
public class BangumiSponsorMineRank implements Parcelable {
    public static final Creator<BangumiSponsorMineRank> CREATOR = new C18261();
    @JSONField(name = "count")
    public String mCount;
    @JSONField(name = "message")
    public String mMessage;
    @JSONField(name = "rank")
    public int mRank;

    public BangumiSponsorMineRank() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorMineRank$1 */
    static class C18261 implements Creator<BangumiSponsorMineRank> {
        C18261() {
        }

        /* renamed from: a */
        public BangumiSponsorMineRank createFromParcel(Parcel parcel) {
            return new BangumiSponsorMineRank(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorMineRank[] newArray(int i) {
            return new BangumiSponsorMineRank[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MyRank{mCount=");
        stringBuilder.append(this.mCount);
        stringBuilder.append(", mRank=");
        stringBuilder.append(this.mRank);
        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorMineRank)) {
            return false;
        }
        BangumiSponsorMineRank bangumiSponsorMineRank = (BangumiSponsorMineRank) obj;
        if (this.mRank != bangumiSponsorMineRank.mRank) {
            return false;
        }
        if (this.mCount != null) {
            z = this.mCount.equals(bangumiSponsorMineRank.mCount);
        } else if (bangumiSponsorMineRank.mCount != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.mCount != null ? this.mCount.hashCode() : 0) * 31) + this.mRank;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCount);
        parcel.writeInt(this.mRank);
    }

    protected BangumiSponsorMineRank(Parcel parcel) {
        this.mCount = parcel.readString();
        this.mRank = parcel.readInt();
    }
}
