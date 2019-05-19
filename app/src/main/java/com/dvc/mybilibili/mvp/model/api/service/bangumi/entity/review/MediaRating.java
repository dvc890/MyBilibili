package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class MediaRating implements Parcelable {
    public static final Creator<MediaRating> CREATOR = new C18471();
    @JSONField(name = "score")
    public float mediaScore;
    @JSONField(name = "count")
    public int voterCount;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.MediaRating$1 */
    static class C18471 implements Creator<MediaRating> {
        C18471() {
        }

        /* renamed from: a */
        public MediaRating createFromParcel(Parcel parcel) {
            return new MediaRating(parcel);
        }

        /* renamed from: a */
        public MediaRating[] newArray(int i) {
            return new MediaRating[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mediaScore);
        parcel.writeInt(this.voterCount);
    }

    protected MediaRating(Parcel parcel) {
        this.mediaScore = parcel.readFloat();
        this.voterCount = parcel.readInt();
    }
}
