package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class ReviewShortDetail implements Parcelable {
    public static final Creator<ReviewShortDetail> CREATOR = new C18641();
    @JSONField(name = "review_id")
    /* renamed from: a */
    public int f5705a;
    @JSONField(name = "content")
    /* renamed from: b */
    public String f5706b;
    @JSONField(name = "mtime")
    /* renamed from: c */
    public long f5707c;
    @JSONField(name = "author")
    /* renamed from: d */
    public ReviewAuthor f5708d;
    @JSONField(name = "user_rating")
    /* renamed from: e */
    public SimpleRating f5709e;
    @JSONField(name = "likes")
    /* renamed from: f */
    public int f5710f;
    @JSONField(name = "liked")
    /* renamed from: g */
    public boolean f5711g;
    @JSONField(name = "disliked")
    /* renamed from: h */
    public boolean f5712h;
    @JSONField(name = "media")
    /* renamed from: i */
    public ReviewMediaBase f5713i;
    @JSONField(name = "is_coin")
    /* renamed from: j */
    public boolean f5714j;

    public ReviewShortDetail() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewShortDetail$1 */
    static class C18641 implements Creator<ReviewShortDetail> {
        C18641() {
        }

        /* renamed from: a */
        public ReviewShortDetail createFromParcel(Parcel parcel) {
            return new ReviewShortDetail(parcel);
        }

        /* renamed from: a */
        public ReviewShortDetail[] newArray(int i) {
            return new ReviewShortDetail[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5705a);
        parcel.writeString(this.f5706b);
        parcel.writeLong(this.f5707c);
        parcel.writeParcelable(this.f5708d, i);
        parcel.writeParcelable(this.f5709e, i);
        parcel.writeInt(this.f5710f);
        parcel.writeByte((byte) (this.f5711g?1:0));
        parcel.writeByte((byte) (this.f5712h?1:0));
        parcel.writeParcelable(this.f5713i, i);
        parcel.writeByte((byte) (this.f5714j?1:0));
    }

    protected ReviewShortDetail(Parcel parcel) {
        this.f5705a = parcel.readInt();
        this.f5706b = parcel.readString();
        this.f5707c = parcel.readLong();
        this.f5708d = (ReviewAuthor) parcel.readParcelable(ReviewAuthor.class.getClassLoader());
        this.f5709e = (SimpleRating) parcel.readParcelable(SimpleRating.class.getClassLoader());
        this.f5710f = parcel.readInt();
        boolean z = false;
        this.f5711g = parcel.readByte() != (byte) 0;
        this.f5712h = parcel.readByte() != (byte) 0;
        this.f5713i = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f5714j = z;
    }
}
