package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ReviewPublishInfo implements Parcelable {
    public static final Creator<ReviewPublishInfo> CREATOR = new C18621();
    @JSONField(name = "media")
    public ReviewMediaBase mediaInfo;
    @JSONField(name = "review")
    public PublishReview publishReview;
    public boolean shareToFeed;
    public boolean toBeEdit;
    public UserReview userReview;

    public ReviewPublishInfo() {

    }

    /* compiled from: BL */
    public static class PublishReview implements Parcelable {
        public static final Creator<PublishReview> CREATOR = new C18611();
        @JSONField(name = "score")
        /* renamed from: a */
        public int f5698a;
        @JSONField(name = "is_open")
        /* renamed from: b */
        public boolean f5699b;
        @JSONField(name = "is_coin")
        /* renamed from: c */
        public boolean f5700c;
        @JSONField(name = "short_review")
        /* renamed from: d */
        public UserReview f5701d;
        @JSONField(name = "long_review")
        /* renamed from: e */
        public UserReview f5702e;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewPublishInfo$PublishReview$1 */
        static class C18611 implements Creator<PublishReview> {
            C18611() {
            }

            /* renamed from: a */
            public PublishReview createFromParcel(Parcel parcel) {
                return new PublishReview(parcel);
            }

            /* renamed from: a */
            public PublishReview[] newArray(int i) {
                return new PublishReview[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected PublishReview(Parcel parcel) {
            this.f5698a = parcel.readInt();
            boolean z = false;
            this.f5699b = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.f5700c = z;
            this.f5701d = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
            this.f5702e = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5698a);
            parcel.writeByte((byte) (this.f5699b?1:0));
            parcel.writeByte((byte) (this.f5700c?1:0));
            parcel.writeParcelable(this.f5701d, i);
            parcel.writeParcelable(this.f5702e, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewPublishInfo$1 */
    static class C18621 implements Creator<ReviewPublishInfo> {
        C18621() {
        }

        /* renamed from: a */
        public ReviewPublishInfo createFromParcel(Parcel parcel) {
            return new ReviewPublishInfo(parcel);
        }

        /* renamed from: a */
        public ReviewPublishInfo[] newArray(int i) {
            return new ReviewPublishInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public static ReviewPublishInfo createInstance() {
        ReviewPublishInfo reviewPublishInfo = new ReviewPublishInfo();
        reviewPublishInfo.mediaInfo = new ReviewMediaBase();
        reviewPublishInfo.userReview = new UserReview();
        reviewPublishInfo.userReview.voterRating = new SimpleRating();
        reviewPublishInfo.userReview.author = new ReviewAuthor();
        reviewPublishInfo.userReview.userSeason = new UserSeason();
        return reviewPublishInfo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mediaInfo, i);
        parcel.writeParcelable(this.userReview, i);
        parcel.writeParcelable(this.publishReview, i);
        parcel.writeByte((byte) (this.toBeEdit?1:0));
        parcel.writeByte((byte) (this.shareToFeed?1:0));
    }

    protected ReviewPublishInfo(Parcel parcel) {
        this.mediaInfo = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
        this.userReview = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
        this.publishReview = (PublishReview) parcel.readParcelable(PublishReview.class.getClassLoader());
        boolean z = false;
        this.toBeEdit = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.shareToFeed = z;
    }
}
