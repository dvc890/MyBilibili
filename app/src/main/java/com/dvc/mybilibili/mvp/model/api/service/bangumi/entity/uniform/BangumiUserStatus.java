package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review.UserReview;

@Keep
/* compiled from: BL */
public class BangumiUserStatus implements Parcelable {
    public static final Creator<BangumiUserStatus> CREATOR = new C18991();
    @JSONField(name = "dead_line")
    public String deadline;
    @JSONField(name = "follow")
    public boolean isFollowed;
    @JSONField(name = "pay")
    public boolean isPaid;
    @JSONField(name = "sponsor")
    public boolean isSponsored;
    @JSONField(name = "vip")
    public boolean isVip;
    @JSONField(name = "review")
    public Review review;
    @JSONField(name = "vip_frozen")
    public boolean vipFrozen;
    @JSONField(name = "progress")
    public WatchProgress watchProgress;

    @Keep
    /* compiled from: BL */
    public static class Review implements Parcelable {
        public static final Creator<Review> CREATOR = new C18971();
        @JSONField(name = "is_open")
        public boolean isOpen;
        @JSONField(name = "long_review")
        public UserReview longReview;
        @JSONField(name = "short_review")
        public UserReview shortReview;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUserStatus$Review$1 */
        static class C18971 implements Creator<Review> {
            C18971() {
            }

            /* renamed from: a */
            public Review createFromParcel(Parcel parcel) {
                return new Review(parcel);
            }

            /* renamed from: a */
            public Review[] newArray(int i) {
                return new Review[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Review(Parcel parcel) {
            this.isOpen = parcel.readByte() != (byte) 0;
            this.shortReview = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
            this.longReview = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.isOpen?1:0));
            parcel.writeParcelable(this.shortReview, i);
            parcel.writeParcelable(this.longReview, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class WatchProgress implements Parcelable {
        public static final Creator<WatchProgress> CREATOR = new C18981();
        @JSONField(deserialize = false, serialize = false)
        public boolean fromLocal;
        @JSONField(name = "last_ep_id")
        public long lastEpId;
        @JSONField(name = "last_ep_index")
        public String lastEpIndex;
        @JSONField(name = "last_time")
        public long lastEpProgress;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUserStatus$WatchProgress$1 */
        static class C18981 implements Creator<WatchProgress> {
            C18981() {
            }

            /* renamed from: a */
            public WatchProgress createFromParcel(Parcel parcel) {
                return new WatchProgress(parcel);
            }

            /* renamed from: a */
            public WatchProgress[] newArray(int i) {
                return new WatchProgress[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected WatchProgress(Parcel parcel) {
            this.lastEpId = parcel.readLong();
            this.lastEpIndex = parcel.readString();
            this.lastEpProgress = parcel.readLong();
            this.fromLocal = parcel.readByte() != (byte) 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.lastEpId);
            parcel.writeString(this.lastEpIndex);
            parcel.writeLong(this.lastEpProgress);
            parcel.writeByte((byte) (this.fromLocal?1:0));
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUserStatus$1 */
    static class C18991 implements Creator<BangumiUserStatus> {
        C18991() {
        }

        /* renamed from: a */
        public BangumiUserStatus createFromParcel(Parcel parcel) {
            return new BangumiUserStatus(parcel);
        }

        /* renamed from: a */
        public BangumiUserStatus[] newArray(int i) {
            return new BangumiUserStatus[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiUserStatus(Parcel parcel) {
        boolean z = false;
        this.isFollowed = parcel.readByte() != (byte) 0;
        this.isPaid = parcel.readByte() != (byte) 0;
        this.isSponsored = parcel.readByte() != (byte) 0;
        this.watchProgress = (WatchProgress) parcel.readParcelable(WatchProgress.class.getClassLoader());
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isVip = z;
        this.deadline = parcel.readString();
        this.review = (Review) parcel.readParcelable(Review.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.isFollowed?1:0));
        parcel.writeByte((byte) (this.isPaid?1:0));
        parcel.writeByte((byte) (this.isSponsored?1:0));
        parcel.writeParcelable(this.watchProgress, i);
        parcel.writeByte((byte) (this.isVip?1:0));
        parcel.writeString(this.deadline);
        parcel.writeParcelable(this.review, i);
    }
}
