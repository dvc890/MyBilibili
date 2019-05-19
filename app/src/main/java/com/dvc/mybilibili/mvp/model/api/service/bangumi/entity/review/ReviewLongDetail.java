package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class ReviewLongDetail implements Parcelable {
    public static final Creator<ReviewLongDetail> CREATOR = new C18541();
    @JSONField(name = "review_id")
    /* renamed from: a */
    public int f5681a;
    @JSONField(name = "title")
    /* renamed from: b */
    public String f5682b;
    @JSONField(name = "content")
    /* renamed from: c */
    public String f5683c;
    @JSONField(name = "mtime")
    /* renamed from: d */
    public long f5684d;
    @Nullable
    @JSONField(name = "author")
    /* renamed from: e */
    public ReviewAuthor f5685e;
    @Nullable
    @JSONField(name = "user_rating")
    /* renamed from: f */
    public SimpleRating f5686f;
    @JSONField(name = "is_origin")
    /* renamed from: g */
    public boolean f5687g;
    @JSONField(name = "is_spoiler")
    /* renamed from: h */
    public boolean f5688h;
    @JSONField(name = "likes")
    /* renamed from: i */
    public int f5689i;
    @JSONField(name = "liked")
    /* renamed from: j */
    public boolean f5690j;
    @JSONField(name = "disliked")
    /* renamed from: k */
    public boolean f5691k;
    @JSONField(name = "reply")
    /* renamed from: l */
    public int f5692l;
    @Nullable
    @JSONField(name = "media")
    /* renamed from: m */
    public ReviewMediaBase f5693m;
    @JSONField(name = "is_coin")
    /* renamed from: n */
    public boolean f5694n;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewLongDetail$1 */
    static class C18541 implements Creator<ReviewLongDetail> {
        C18541() {
        }

        /* renamed from: a */
        public ReviewLongDetail createFromParcel(Parcel parcel) {
            return new ReviewLongDetail(parcel);
        }

        /* renamed from: a */
        public ReviewLongDetail[] newArray(int i) {
            return new ReviewLongDetail[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5681a);
        parcel.writeString(this.f5682b);
        parcel.writeString(this.f5683c);
        parcel.writeLong(this.f5684d);
        parcel.writeParcelable(this.f5685e, i);
        parcel.writeParcelable(this.f5686f, i);
        parcel.writeByte((byte) (this.f5687g?1:0));
        parcel.writeByte((byte) (this.f5688h?1:0));
        parcel.writeInt(this.f5689i);
        parcel.writeByte((byte) (this.f5690j?1:0));
        parcel.writeByte((byte) (this.f5691k?1:0));
        parcel.writeInt(this.f5692l);
        parcel.writeParcelable(this.f5693m, i);
        parcel.writeByte((byte) (this.f5694n?1:0));
    }

    protected ReviewLongDetail(Parcel parcel) {
        this.f5681a = parcel.readInt();
        this.f5682b = parcel.readString();
        this.f5683c = parcel.readString();
        this.f5684d = parcel.readLong();
        this.f5685e = (ReviewAuthor) parcel.readParcelable(ReviewAuthor.class.getClassLoader());
        this.f5686f = (SimpleRating) parcel.readParcelable(SimpleRating.class.getClassLoader());
        boolean z = false;
        this.f5687g = parcel.readByte() != (byte) 0;
        this.f5688h = parcel.readByte() != (byte) 0;
        this.f5689i = parcel.readInt();
        this.f5690j = parcel.readByte() != (byte) 0;
        this.f5691k = parcel.readByte() != (byte) 0;
        this.f5692l = parcel.readInt();
        this.f5693m = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f5694n = z;
    }
}
