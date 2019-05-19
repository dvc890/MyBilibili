package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SimpleRating implements Parcelable {
    public static final Creator<SimpleRating> CREATOR = new C18651();
    @JSONField(name = "score")
    public int score;

    public SimpleRating() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.SimpleRating$1 */
    static class C18651 implements Creator<SimpleRating> {
        C18651() {
        }

        /* renamed from: a */
        public SimpleRating createFromParcel(Parcel parcel) {
            return new SimpleRating(parcel);
        }

        /* renamed from: a */
        public SimpleRating[] newArray(int i) {
            return new SimpleRating[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.score);
    }

    protected SimpleRating(Parcel parcel) {
        this.score = parcel.readInt();
    }
}
