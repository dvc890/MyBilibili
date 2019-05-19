package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiSponsorResult implements Parcelable {
    public static final Creator<BangumiSponsorResult> CREATOR = new C18301();
    public int exp;
    @JSONField(deserialize = false, serialize = false)
    public int mAvid;
    @JSONField(deserialize = false, serialize = false)
    public String mSeasonId;
    @JSONField(deserialize = false, serialize = false)
    public int mSeasonType;
    @JSONField(deserialize = false, serialize = false)
    public String orderNo;
    @JSONField(name = "pendant_day")
    public int pendantDay;
    @JSONField(name = "pendant_day_text")
    public String pendantDayText;
    public List<BiliBangumiSeasonDetail.Pendant> pendants;
    public int point;
    @JSONField(name = "point_activity")
    public BangumiSponsorEvent sponsorActivity;
    public int status;
    @JSONField(deserialize = false, serialize = false)
    public boolean success;

    public BangumiSponsorResult() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorResult$1 */
    static class C18301 implements Creator<BangumiSponsorResult> {
        C18301() {
        }

        /* renamed from: a */
        public BangumiSponsorResult createFromParcel(Parcel parcel) {
            return new BangumiSponsorResult(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorResult[] newArray(int i) {
            return new BangumiSponsorResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiSponsorResult(Parcel parcel) {
        this.success = parcel.readByte() != (byte) 0;
        this.orderNo = parcel.readString();
        this.mSeasonId = parcel.readString();
        this.mSeasonType = parcel.readInt();
        this.mAvid = parcel.readInt();
        this.status = parcel.readInt();
        this.exp = parcel.readInt();
        this.point = parcel.readInt();
        this.pendantDay = parcel.readInt();
        this.pendantDayText = parcel.readString();
        this.pendants = parcel.createTypedArrayList(BiliBangumiSeasonDetail.Pendant.CREATOR);
        this.sponsorActivity = (BangumiSponsorEvent) parcel.readParcelable(BangumiSponsorEvent.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.success?1:0));
        parcel.writeString(this.orderNo);
        parcel.writeString(this.mSeasonId);
        parcel.writeInt(this.mSeasonType);
        parcel.writeInt(this.mAvid);
        parcel.writeInt(this.status);
        parcel.writeInt(this.exp);
        parcel.writeInt(this.point);
        parcel.writeInt(this.pendantDay);
        parcel.writeString(this.pendantDayText);
        parcel.writeTypedList(this.pendants);
        parcel.writeParcelable(this.sponsorActivity, i);
    }

    public static BangumiSponsorResult onFailed(String str) {
        BangumiSponsorResult bangumiSponsorResult = new BangumiSponsorResult();
        bangumiSponsorResult.success = false;
        bangumiSponsorResult.orderNo = str;
        return bangumiSponsorResult;
    }

    public static BangumiSponsorResult onFailed() {
        BangumiSponsorResult bangumiSponsorResult = new BangumiSponsorResult();
        bangumiSponsorResult.success = false;
        return bangumiSponsorResult;
    }
}
