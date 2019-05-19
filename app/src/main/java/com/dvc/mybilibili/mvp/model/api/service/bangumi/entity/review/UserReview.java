package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class UserReview implements Parcelable {
    public static final Creator<UserReview> CREATOR = new C18671();
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_SHORT = 1;
    @JSONField(name = "article_id")
    public String articleId;
    @JSONField(name = "author")
    public ReviewAuthor author;
    public String cursor;
    @JSONField(name = "is_coin")
    public boolean hasCoinCost;
    @JSONField(name = "disliked")
    public boolean isDisliked;
    @JSONField(name = "liked")
    public boolean isLiked;
    @JSONField(name = "is_origin")
    public boolean isOrigin;
    @JSONField(name = "is_spoiler")
    public boolean isSpoiler;
    @JSONField(name = "likes")
    public int likes;
    @JSONField(name = "mtime")
    public long publishTime;
    @JSONField(name = "reply")
    public int reply;
    @JSONField(name = "content")
    public String reviewContent;
    @JSONField(name = "review_id")
    public int reviewId;
    @JSONField(name = "title")
    public String reviewTitle;
    public int reviewType;
    public String url;
    @JSONField(name = "user_season")
    public UserSeason userSeason;
    @JSONField(name = "user_rating")
    public SimpleRating voterRating;

    public UserReview() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.UserReview$1 */
    static class C18671 implements Creator<UserReview> {
        C18671() {
        }

        /* renamed from: a */
        public UserReview createFromParcel(Parcel parcel) {
            return new UserReview(parcel);
        }

        /* renamed from: a */
        public UserReview[] newArray(int i) {
            return new UserReview[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reviewId);
        parcel.writeString(this.reviewTitle);
        parcel.writeString(this.reviewContent);
        parcel.writeLong(this.publishTime);
        parcel.writeParcelable(this.voterRating, i);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.userSeason, i);
        parcel.writeInt(this.likes);
        parcel.writeByte((byte) (this.isLiked?1:0));
        parcel.writeByte((byte) (this.isDisliked?1:0));
        parcel.writeInt(this.reply);
        parcel.writeByte((byte) (this.isOrigin?1:0));
        parcel.writeByte((byte) (this.isSpoiler?1:0));
        parcel.writeByte((byte) (this.hasCoinCost?1:0));
        parcel.writeString(this.cursor);
        parcel.writeInt(this.reviewType);
        parcel.writeString(this.articleId);
        parcel.writeString(this.url);
    }

    protected UserReview(Parcel parcel) {
        this.reviewId = parcel.readInt();
        this.reviewTitle = parcel.readString();
        this.reviewContent = parcel.readString();
        this.publishTime = parcel.readLong();
        this.voterRating = (SimpleRating) parcel.readParcelable(SimpleRating.class.getClassLoader());
        this.author = (ReviewAuthor) parcel.readParcelable(ReviewAuthor.class.getClassLoader());
        this.userSeason = (UserSeason) parcel.readParcelable(UserSeason.class.getClassLoader());
        this.likes = parcel.readInt();
        boolean z = false;
        this.isLiked = parcel.readByte() != (byte) 0;
        this.isDisliked = parcel.readByte() != (byte) 0;
        this.reply = parcel.readInt();
        this.isOrigin = parcel.readByte() != (byte) 0;
        this.isSpoiler = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.hasCoinCost = z;
        this.cursor = parcel.readString();
        this.reviewType = parcel.readInt();
        this.articleId = parcel.readString();
        this.url = parcel.readString();
    }
}
