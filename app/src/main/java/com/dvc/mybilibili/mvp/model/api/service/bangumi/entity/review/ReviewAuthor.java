package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class ReviewAuthor implements Parcelable {
    public static final Creator<ReviewAuthor> CREATOR = new C18481();
    @JSONField(name = "mid")
    /* renamed from: a */
    public long f5657a;
    @JSONField(name = "uname")
    /* renamed from: b */
    public String f5658b;
    @JSONField(name = "avatar")
    /* renamed from: c */
    public String f5659c;
    @JSONField(name = "vip")
    /* renamed from: d */
    public UserVip f5660d;

    public ReviewAuthor() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewAuthor$1 */
    static class C18481 implements Creator<ReviewAuthor> {
        C18481() {
        }

        /* renamed from: a */
        public ReviewAuthor createFromParcel(Parcel parcel) {
            return new ReviewAuthor(parcel);
        }

        /* renamed from: a */
        public ReviewAuthor[] newArray(int i) {
            return new ReviewAuthor[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5657a);
        parcel.writeString(this.f5658b);
        parcel.writeString(this.f5659c);
        parcel.writeParcelable(this.f5660d, i);
    }

    protected ReviewAuthor(Parcel parcel) {
        this.f5657a = parcel.readLong();
        this.f5658b = parcel.readString();
        this.f5659c = parcel.readString();
        this.f5660d = (UserVip) parcel.readParcelable(UserVip.class.getClassLoader());
    }
}
