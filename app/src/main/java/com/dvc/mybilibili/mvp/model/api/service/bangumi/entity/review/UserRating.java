package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class UserRating implements Parcelable {
    public static final Creator<UserRating> CREATOR = new C18661();
    @JSONField(name = "article_url")
    public String articleUrl;
    @JSONField(name = "is_coin")
    public boolean hasCoinCost;
    @JSONField(name = "is_open")
    public boolean isReviewEnable;
    @JSONField(name = "last_ep_id")
    public long lastReviewEpId;
    @JSONField(name = "long_review")
    public UserReview longReview;
    @JSONField(name = "score")
    public int score;
    @JSONField(name = "short_review")
    public UserReview shortReview;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.UserRating$1 */
    static class C18661 implements Creator<UserRating> {
        C18661() {
        }

        /* renamed from: a */
        public UserRating createFromParcel(Parcel parcel) {
            return new UserRating(parcel);
        }

        /* renamed from: a */
        public UserRating[] newArray(int i) {
            return new UserRating[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.score);
        parcel.writeParcelable(this.shortReview, i);
        parcel.writeParcelable(this.longReview, i);
        parcel.writeByte((byte) (this.isReviewEnable?1:0));
        parcel.writeByte((byte) (this.hasCoinCost?1:0));
        parcel.writeLong(this.lastReviewEpId);
        parcel.writeString(this.articleUrl);
    }

    protected UserRating(Parcel parcel) {
        this.score = parcel.readInt();
        this.shortReview = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
        this.longReview = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
        boolean z = false;
        this.isReviewEnable = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.hasCoinCost = z;
        this.lastReviewEpId = parcel.readLong();
        this.articleUrl = parcel.readString();
    }
}
