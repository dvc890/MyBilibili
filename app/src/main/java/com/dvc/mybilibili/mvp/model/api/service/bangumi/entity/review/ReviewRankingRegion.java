package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class ReviewRankingRegion implements Parcelable {
    public static final Creator<ReviewRankingRegion> CREATOR = new C18631();
    @JSONField(name = "region_id")
    /* renamed from: a */
    public int f5703a;
    @JSONField(name = "title")
    /* renamed from: b */
    public String f5704b;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewRankingRegion$1 */
    static class C18631 implements Creator<ReviewRankingRegion> {
        C18631() {
        }

        /* renamed from: a */
        public ReviewRankingRegion createFromParcel(Parcel parcel) {
            return new ReviewRankingRegion(parcel);
        }

        /* renamed from: a */
        public ReviewRankingRegion[] newArray(int i) {
            return new ReviewRankingRegion[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5703a);
        parcel.writeString(this.f5704b);
    }

    protected ReviewRankingRegion(Parcel parcel) {
        this.f5703a = parcel.readInt();
        this.f5704b = parcel.readString();
    }
}
