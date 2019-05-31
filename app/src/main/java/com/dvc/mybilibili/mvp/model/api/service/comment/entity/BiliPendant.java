package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public final class BiliPendant implements Parcelable {
    public static final Creator<BiliPendant> CREATOR = new C45591();
    public String expire;
    public String image;
    public String name;
    public String pid;

    public BiliPendant() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.app.comm.comment2.model.BiliPendant$1 */
    static class C45591 implements Creator<BiliPendant> {
        C45591() {
        }

        /* renamed from: a */
        public BiliPendant createFromParcel(Parcel parcel) {
            return new BiliPendant(parcel);
        }

        /* renamed from: a */
        public BiliPendant[] newArray(int i) {
            return new BiliPendant[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliPendant(Parcel parcel) {
        this.pid = parcel.readString();
        this.name = parcel.readString();
        this.image = parcel.readString();
        this.expire = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pid);
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        parcel.writeString(this.expire);
    }
}
