package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class RecommendReview extends UserReview {
    public static final Creator<RecommendReview> CREATOR = new C29701();
    @JSONField(name = "media")
    /* renamed from: a */
    public ReviewMediaBase f8694a;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.RecommendReview$1 */
    static class C29701 implements Creator<RecommendReview> {
        C29701() {
        }

        /* renamed from: a */
        public RecommendReview createFromParcel(Parcel parcel) {
            return new RecommendReview(parcel);
        }

        /* renamed from: a */
        public RecommendReview[] newArray(int i) {
            return new RecommendReview[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8694a, i);
    }

    protected RecommendReview(Parcel parcel) {
        super(parcel);
        this.f8694a = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
    }
}
