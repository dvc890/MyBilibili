package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ReviewMediaDetail extends ReviewMediaBase {
    public static final Creator<ReviewMediaDetail> CREATOR = new C29711();
    @Nullable
    @JSONField(name = "copyright")
    public MediaCopyRight copyRight;
    @Nullable
    @JSONField(name = "long_review")
    public HotReviews longReview;
    @Nullable
    @JSONField(name = "short_review")
    public HotReviews shortReview;
    @Nullable
    @JSONField(name = "stat")
    public BangumiStatus stat;
    @Nullable
    @JSONField(name = "user_rating")
    public UserRating userRating;
    @Nullable
    @JSONField(name = "user_season")
    public UserSeason userSeason;

    @Keep
    /* compiled from: BL */
    public static class HotReviews implements Parcelable {
        public static final Creator<HotReviews> CREATOR = new C18601();
        @JSONField(name = "list")
        public List<UserReview> list;
        @JSONField(name = "total")
        public int total;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaDetail$HotReviews$1 */
        static class C18601 implements Creator<HotReviews> {
            C18601() {
            }

            /* renamed from: a */
            public HotReviews createFromParcel(Parcel parcel) {
                return new HotReviews(parcel);
            }

            /* renamed from: a */
            public HotReviews[] newArray(int i) {
                return new HotReviews[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.total);
            parcel.writeTypedList(this.list);
        }

        protected HotReviews(Parcel parcel) {
            this.total = parcel.readInt();
            this.list = parcel.createTypedArrayList(UserReview.CREATOR);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaDetail$1 */
    static class C29711 implements Creator<ReviewMediaDetail> {
        C29711() {
        }

        /* renamed from: a */
        public ReviewMediaDetail createFromParcel(Parcel parcel) {
            return new ReviewMediaDetail(parcel);
        }

        /* renamed from: a */
        public ReviewMediaDetail[] newArray(int i) {
            return new ReviewMediaDetail[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getLongReviewSize() {
        return (this.longReview == null || this.longReview.list == null || this.longReview.list.isEmpty()) ? 0 : this.longReview.list.size();
    }

    public int getShortReviewSize() {
        return (this.shortReview == null || this.shortReview.list == null || this.shortReview.list.isEmpty()) ? 0 : this.shortReview.list.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.userRating, i);
        parcel.writeParcelable(this.userSeason, i);
        parcel.writeParcelable(this.longReview, i);
        parcel.writeParcelable(this.shortReview, i);
        parcel.writeParcelable(this.stat, i);
        parcel.writeParcelable(this.copyRight, i);
    }

    protected ReviewMediaDetail(Parcel parcel) {
        super(parcel);
        this.userRating = (UserRating) parcel.readParcelable(UserRating.class.getClassLoader());
        this.userSeason = (UserSeason) parcel.readParcelable(UserSeason.class.getClassLoader());
        this.longReview = (HotReviews) parcel.readParcelable(HotReviews.class.getClassLoader());
        this.shortReview = (HotReviews) parcel.readParcelable(HotReviews.class.getClassLoader());
        this.stat = (BangumiStatus) parcel.readParcelable(BangumiStatus.class.getClassLoader());
        this.copyRight = (MediaCopyRight) parcel.readParcelable(MediaCopyRight.class.getClassLoader());
    }
}
