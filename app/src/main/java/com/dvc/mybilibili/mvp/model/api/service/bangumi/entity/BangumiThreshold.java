package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiThreshold implements Parcelable {
    public static final Creator<BangumiThreshold> CREATOR = new C18731();
    /* renamed from: bp */
    public int f5746bp;
    public int days;
    @JSONField(name = "days_text")
    public String daysText;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiThreshold$1 */
    static class C18731 implements Creator<BangumiThreshold> {
        C18731() {
        }

        /* renamed from: a */
        public BangumiThreshold createFromParcel(Parcel parcel) {
            return new BangumiThreshold(parcel);
        }

        /* renamed from: a */
        public BangumiThreshold[] newArray(int i) {
            return new BangumiThreshold[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiThreshold(Parcel parcel) {
        this.f5746bp = parcel.readInt();
        this.days = parcel.readInt();
        this.daysText = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5746bp);
        parcel.writeInt(this.days);
        parcel.writeString(this.daysText);
    }
}
