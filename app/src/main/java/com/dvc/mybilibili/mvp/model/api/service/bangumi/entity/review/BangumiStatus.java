package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiStatus implements Parcelable {
    public static final Creator<BangumiStatus> CREATOR = new C18441();
    @JSONField(name = "favorites")
    public int favourites;
    @JSONField(name = "views")
    public int views;

    public BangumiStatus() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.BangumiStatus$1 */
    static class C18441 implements Creator<BangumiStatus> {
        C18441() {
        }

        /* renamed from: a */
        public BangumiStatus createFromParcel(Parcel parcel) {
            return new BangumiStatus(parcel);
        }

        /* renamed from: a */
        public BangumiStatus[] newArray(int i) {
            return new BangumiStatus[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.views);
        parcel.writeInt(this.favourites);
    }

    protected BangumiStatus(Parcel parcel) {
        this.views = parcel.readInt();
        this.favourites = parcel.readInt();
    }
}
