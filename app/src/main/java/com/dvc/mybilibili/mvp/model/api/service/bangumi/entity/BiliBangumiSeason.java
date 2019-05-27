package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.response.BaseResponse;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review.ReviewMediaBase;

import java.util.Date;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliBangumiSeason implements Parcelable {
    public static final Creator<BiliBangumiSeason> CREATOR = new C18401();
    public static final Episode NULL_EP = new Episode();
    public static final int STATUS_FREE = 2;
    public static final int STATUS_PAY_PACK = 12;
    public static final int STATUS_WATCH_FIRST_FOR_NONE = 9;
    public static final int STATUS_WATCH_FIRST_FOR_VIP = 7;
    public static final int STATUS_WATCH_FREE_FOR_NONE = 8;
    public static final int STATUS_WATCH_FREE_FOR_VIP = 6;
    @JSONField(name = "badge")
    public String badge;
    @JSONField(name = "finish")
    public boolean finished;
    @JSONField(name = "has_unfollow")
    public boolean hasUnfollow;
    @JSONField(name = "is_guide_follow")
    public boolean isGuideFollow;
    @JSONField(name = "actor")
    public List<Actor> mActors;
    @JSONField(name = "area")
    public String mArea;
    @JSONField(name = "bangumi_id")
    public String mBangumiId;
    @JSONField(name = "brief")
    public String mBrief;
    @JSONField(name = "business_type")
    public int mBusinessType;
    @JSONField(name = "cover")
    public String mCover;
    @JSONField(name = "danmaku_count")
    public String mDanmakus;
    @JSONField(name = "allow_download")
    public boolean mDownloadable;
    @JSONField(name = "episodes")
    public List<Episode> mEpisodes;
    @JSONField(name = "evaluate")
    public String mEvaluate;
    @JSONField(deserialize = false, serialize = false)
    public boolean mFavorited;
    @JSONField(name = "favorites")
    public String mFavorites;
    @JSONField(name = "is_new")
    public boolean mHasNew;
    @JSONField(name = "allow_bp")
    public boolean mIsAllowBp;
    @JSONField(name = "is_finish")
    public boolean mIsFinished;
    @JSONField(name = "is_started")
    public int mIsStarted;
    @JSONField(name = "jp_title")
    public String mJapanTitle;
    @JSONField(name = "newest_ep_id")
    public String mLastEPId;
    @JSONField(name = "newest_ep_index")
    public String mLastEPIndex;
    @JSONField(name = "last_time")
    public Date mLastTime;
    @JSONField(name = "new_cover")
    public String mNewCover;
    @JSONField(name = "origin_name")
    public String mOriginName;
    @JSONField(name = "payment")
    public Payment mPayment;
    @JSONField(name = "play_count")
    public String mPlays;
    @JSONField(name = "pub_time")
    public Date mPubTime;
    @JSONField(name = "pub_time_show")
    public String mPubTimeShow = "";
    @JSONField(name = "season_id")
    public String mSeasonId;
    @JSONField(name = "season_title")
    public String mSeasonTitle;
    @JSONField(name = "seasons")
    public List<BiliBangumiSeason> mSeasons;
    @JSONField(name = "share_url")
    public String mShareUrl;
    @JSONField(name = "staff")
    public String mStaff;
    @JSONField(name = "tags")
    public List<BiliBangumiTag> mTags;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "total_count")
    public int mTotalEP;
    @JSONField(name = "user_season")
    public UserSeason mUserSeason;
    @JSONField(name = "watchingCount")
    public int mWatchingCount;
    @JSONField(name = "weekday")
    public int mWeekday = -1;
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "pay_pack")
    public PayPack payPack;
    @JSONField(name = "media")
    public ReviewMediaBase reviewMediaInfo;
    @JSONField(name = "season_status")
    public int seasonStatus;
    @JSONField(name = "squareCover")
    public String squareCoverUrl;
    @JSONField(name = "uri")
    public String uri;
    public String url;
    @JSONField(name = "vip_quality")
    public boolean vipQuality;

    public BiliBangumiSeason() {

    }

    @Keep
    /* compiled from: BL */
    public static class Actor implements Parcelable {
        public static final Creator<Actor> CREATOR = new C18341();
        @JSONField(name = "actor")
        public String mActor;
        @JSONField(name = "actor_id")
        public int mId;
        @JSONField(name = "role")
        public String mRole;

        public Actor() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$Actor$1 */
        static class C18341 implements Creator<Actor> {
            C18341() {
            }

            /* renamed from: a */
            public Actor createFromParcel(Parcel parcel) {
                return new Actor(parcel);
            }

            /* renamed from: a */
            public Actor[] newArray(int i) {
                return new Actor[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mActor);
            parcel.writeInt(this.mId);
            parcel.writeString(this.mRole);
        }

        protected Actor(Parcel parcel) {
            this.mActor = parcel.readString();
            this.mId = parcel.readInt();
            this.mRole = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Episode implements Parcelable {
        public static final Creator<Episode> CREATOR = new C18351();
        @JSONField(name = "badge")
        public String badge;
        @JSONField(name = "episode_status")
        public int episodeStatus;
        @JSONField(deserialize = false, serialize = false)
        public boolean mAlreadyPlayed;
        @JSONField(name = "av_id")
        public int mAvid;
        @JSONField(name = "cover")
        public String mCover;
        @JSONField(name = "danmaku")
        public Integer mDanmakuId;
        @JSONField(name = "episode_id")
        public long mId;
        @JSONField(name = "index")
        public String mIndex;
        @JSONField(name = "page")
        public int mPage;
        @JSONField(name = "index_title")
        public String mTitle;

        public Episode() {

        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$Episode$1 */
        static class C18351 implements Creator<Episode> {
            C18351() {
            }

            /* renamed from: a */
            public Episode createFromParcel(Parcel parcel) {
                return new Episode(parcel);
            }

            /* renamed from: a */
            public Episode[] newArray(int i) {
                return new Episode[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isEpisodeVipFreeWatch() {
            return this.episodeStatus == 6;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isEpisodeVipFreeFirstWatch() {
            return this.episodeStatus == 7;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isEpisodeAllNeedPayWatch() {
            return this.episodeStatus == 8;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isEpisodeAllNeedPayFirstWatch() {
            return this.episodeStatus == 9;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isEpisodeNotFree() {
            return isEpisodeVipFreeWatch() || isEpisodeVipFreeFirstWatch() || isEpisodeAllNeedPayWatch() || isEpisodeAllNeedPayFirstWatch();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.mId);
            parcel.writeInt(this.mAvid);
            parcel.writeInt(this.mDanmakuId == null ? 0 : this.mDanmakuId.intValue());
            parcel.writeString(this.mCover);
            parcel.writeString(this.mIndex);
            parcel.writeString(this.mTitle);
        }

        protected Episode(Parcel parcel) {
            this.mId = parcel.readLong();
            this.mAvid = parcel.readInt();
            this.mDanmakuId = Integer.valueOf(parcel.readInt());
            this.mCover = parcel.readString();
            this.mIndex = parcel.readString();
            this.mTitle = parcel.readString();
        }

        public String getReadableIndexTitle() {
            if (TextUtils.isEmpty(this.mIndex)) {
                return this.mTitle;
            }
            return BiliBangumiSeason.getReadableIndexTitle(this.mIndex);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PayPack implements Parcelable {
        public static final Creator<PayPack> CREATOR = new C18361();
        @JSONField(name = "id")
        /* renamed from: id */
        public String f5652id;
        @JSONField(name = "pay_pack_status")
        public boolean isPackPaid;
        @JSONField(name = "not_paid_text_for_app")
        public String nonPaidDesc;
        @JSONField(name = "paid_text_for_app")
        public String paidDesc;
        @JSONField(name = "pay_pack_url")
        public String payPackUrl;
        @JSONField(name = "title")
        public String title;

        public PayPack() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$PayPack$1 */
        static class C18361 implements Creator<PayPack> {
            C18361() {
            }

            /* renamed from: a */
            public PayPack createFromParcel(Parcel parcel) {
                return new PayPack(parcel);
            }

            /* renamed from: a */
            public PayPack[] newArray(int i) {
                return new PayPack[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        @NonNull
        public String getPayPackDesc() {
            String str = this.isPackPaid ? this.paidDesc : this.nonPaidDesc;
            return str == null ? "" : str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5652id);
            parcel.writeString(this.title);
            parcel.writeString(this.paidDesc);
            parcel.writeString(this.nonPaidDesc);
            parcel.writeString(this.payPackUrl);
            parcel.writeByte((byte) (this.isPackPaid?1:0));
        }

        protected PayPack(Parcel parcel) {
            this.f5652id = parcel.readString();
            this.title = parcel.readString();
            this.paidDesc = parcel.readString();
            this.nonPaidDesc = parcel.readString();
            this.payPackUrl = parcel.readString();
            this.isPackPaid = parcel.readByte() != (byte) 0;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PayUser implements Parcelable {
        public static final Creator<PayUser> CREATOR = new C18371();
        @JSONField(name = "is_big")
        public boolean isBig;
        @JSONField(name = "pay_pack_status")
        public boolean isPayPackPaid;
        @JSONField(name = "status")
        public int status;

        public PayUser() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$PayUser$1 */
        static class C18371 implements Creator<PayUser> {
            C18371() {
            }

            /* renamed from: a */
            public PayUser createFromParcel(Parcel parcel) {
                return new PayUser(parcel);
            }

            /* renamed from: a */
            public PayUser[] newArray(int i) {
                return new PayUser[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.status);
            parcel.writeByte((byte) (this.isBig?1:0));
            parcel.writeByte((byte) (this.isPayPackPaid?1:0));
        }

        protected PayUser(Parcel parcel) {
            this.status = parcel.readInt();
            boolean z = false;
            this.isBig = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.isPayPackPaid = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayUser)) {
                return false;
            }
            if (this.status != ((PayUser) obj).status) {
                z = false;
            }
            return z;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Payment implements Parcelable {
        public static final Creator<Payment> CREATOR = new C18381();
        @JSONField(name = "price")
        public String price;
        @JSONField(name = "promotion")
        public String promotion;
        @JSONField(name = "tip")
        public String tip;

        public Payment() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$Payment$1 */
        static class C18381 implements Creator<Payment> {
            C18381() {
            }

            /* renamed from: a */
            public Payment createFromParcel(Parcel parcel) {
                return new Payment(parcel);
            }

            /* renamed from: a */
            public Payment[] newArray(int i) {
                return new Payment[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.price);
            parcel.writeString(this.tip);
            parcel.writeString(this.promotion);
        }

        protected Payment(Parcel parcel) {
            this.price = parcel.readString();
            this.tip = parcel.readString();
            this.promotion = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class UserSeason implements Parcelable {
        public static final Creator<UserSeason> CREATOR = new C18391();
        public static final long PROGRESS_FINISH = -1;
        @JSONField(name = "bp")
        public boolean mBp;
        @JSONField(name = "attention")
        public boolean mFollowed;
        @JSONField(name = "last_ep_id")
        public String mLastEpId;
        @JSONField(name = "last_ep_index")
        public String mLastEpIndex;
        @JSONField(name = "last_time")
        public long mLastEpProgress;
        @JSONField(name = "pay_user")
        public PayUser mPayUser;

        public UserSeason() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$UserSeason$1 */
        static class C18391 implements Creator<UserSeason> {
            C18391() {
            }

            /* renamed from: a */
            public UserSeason createFromParcel(Parcel parcel) {
                return new UserSeason(parcel);
            }

            /* renamed from: a */
            public UserSeason[] newArray(int i) {
                return new UserSeason[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean isBuyBangumi() {
            return this.mPayUser != null && this.mPayUser.status == 1;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserSeason)) {
                return false;
            }
            UserSeason userSeason = (UserSeason) obj;
            if (this.mFollowed != userSeason.mFollowed || this.mLastEpProgress != userSeason.mLastEpProgress || this.mBp != userSeason.mBp) {
                return false;
            }
            if (!(this.mLastEpId == null) ? this.mLastEpId.equals(userSeason.mLastEpId) : userSeason.mLastEpId == null) {
                return false;
            }
            if (!(this.mLastEpIndex == null) ? this.mLastEpIndex.equals(userSeason.mLastEpIndex) : userSeason.mLastEpIndex == null) {
                return false;
            }
            if (this.mPayUser != null) {
                z = this.mPayUser.equals(userSeason.mPayUser);
            } else if (userSeason.mPayUser != null) {
                z = false;
            }
            return z;
        }

        protected UserSeason(Parcel parcel) {
            boolean z = false;
            this.mFollowed = parcel.readByte() != (byte) 0;
            this.mLastEpId = parcel.readString();
            this.mLastEpIndex = parcel.readString();
            this.mLastEpProgress = parcel.readLong();
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.mBp = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.mFollowed?1:0));
            parcel.writeString(this.mLastEpId);
            parcel.writeString(this.mLastEpIndex);
            parcel.writeLong(this.mLastEpProgress);
            parcel.writeByte((byte) (this.mBp?1:0));
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeason$1 */
    static class C18401 implements Creator<BiliBangumiSeason> {
        C18401() {
        }

        /* renamed from: a */
        public BiliBangumiSeason createFromParcel(Parcel parcel) {
            return new BiliBangumiSeason(parcel);
        }

        /* renamed from: a */
        public BiliBangumiSeason[] newArray(int i) {
            return new BiliBangumiSeason[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonVipFreeWatch() {
        return this.seasonStatus == 6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonVipFreeFirstWatch() {
        return this.seasonStatus == 7;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonAllNeedPayWatch() {
        return this.seasonStatus == 8;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonAllNeedPayFirstWatch() {
        return this.seasonStatus == 9;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonInPayPack() {
        return this.seasonStatus == 12;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSeasonNotFree() {
        return isSeasonVipFreeWatch() || isSeasonVipFreeFirstWatch() || isSeasonAllNeedPayWatch() || isSeasonAllNeedPayFirstWatch() || isSeasonInPayPack();
    }

    public String getPaymentPromotion() {
        return this.mPayment != null ? this.mPayment.promotion : null;
    }

    public String getPaymentTip() {
        return this.mPayment != null ? this.mPayment.tip : null;
    }

    public String getSeasonStatusReportType() {
        if (isSeasonVipFreeWatch()) {
            return "\u4ed8\u8d39\u89c2\u770b";
        }
        if (isSeasonVipFreeFirstWatch()) {
            return "\u4ed8\u8d39\u62a2\u5148";
        }
        if (isSeasonAllNeedPayWatch()) {
            return "\u5168\u4ed8\u8d39\u89c2\u770b";
        }
        return isSeasonAllNeedPayFirstWatch() ? "\u5168\u4ed8\u8d39\u62a2\u5148" : "\u666e\u901a";
    }

    public boolean isSeasonPaid() {
        return this.mUserSeason != null && this.mUserSeason.isBuyBangumi();
    }

    public String getPrice() {
        return this.mPayment != null ? this.mPayment.price : "0";
    }

    public long getNewestEpId() {
        if (TextUtils.isEmpty(this.mLastEPId) || isEpisodesEmpty()) {
            return 0;
        }
        if (TextUtils.isDigitsOnly(this.mLastEPId)) {
            Episode ep = getEp(Long.parseLong(this.mLastEPId));
            if (ep != null) {
                return ep.mId;
            }
        }
        return ((Episode) this.mEpisodes.get(0)).mId;
    }

    public boolean isEpisodesEmpty() {
        return this.mEpisodes == null || this.mEpisodes.isEmpty();
    }

    public Episode getEp(long j) {
        if (isEpisodesEmpty()) {
            return null;
        }
        for (Episode episode : this.mEpisodes) {
            if (episode.mId == j) {
                return episode;
            }
        }
        return null;
    }

    public static String getReadableIndexTitle(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        if (BaseResponse.DEFAULT_AUTH_ERROR_CODE.equals(str2)) {
            return "\u5c1a\u672a\u5f00\u64ad";
        }
        StringBuilder stringBuilder;
        if (isNumeric(str2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("\u7b2c");
            stringBuilder.append(str2);
            stringBuilder.append(35805);
            str2 = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static String getReadableIndexTitle(String str) {
        if (str == null) {
            return "";
        }
        if (BaseResponse.DEFAULT_AUTH_ERROR_CODE.equals(str)) {
            return "\u5c1a\u672a\u5f00\u64ad";
        }
        if (!isNumeric(str)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u7b2c");
        stringBuilder.append(str);
        stringBuilder.append(35805);
        return stringBuilder.toString();
    }

    static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != '.') {
                return false;
            }
        }
        return true;
    }

    static {
        NULL_EP.mId = -1;
        Episode episode = NULL_EP;
        String str = "\u65e0";
        NULL_EP.mIndex = str;
        episode.mTitle = str;
        NULL_EP.mAvid = -1;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof BiliBangumiSeason) && TextUtils.equals(this.mSeasonId, ((BiliBangumiSeason) obj).mSeasonId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mBangumiId);
        parcel.writeString(this.mJapanTitle);
        parcel.writeString(this.mCover);
        parcel.writeString(this.mNewCover);
        parcel.writeString(this.mSeasonId);
        parcel.writeString(this.mSeasonTitle);
        parcel.writeInt(this.mTotalEP);
        parcel.writeString(this.mLastEPId);
        parcel.writeString(this.mLastEPIndex);
        parcel.writeByte((byte) (this.mIsFinished?1:0));
        parcel.writeInt(this.mIsStarted);
        parcel.writeByte((byte) (this.mIsAllowBp?1:0));
        parcel.writeByte((byte) (this.mDownloadable?1:0));
        parcel.writeByte((byte) (this.mHasNew?1:0));
        parcel.writeTypedList(this.mEpisodes);
        parcel.writeTypedList(this.mSeasons);
        parcel.writeString(this.mPlays);
        parcel.writeString(this.mDanmakus);
        parcel.writeString(this.mBrief);
        parcel.writeString(this.mEvaluate);
        parcel.writeString(this.mArea);
        parcel.writeTypedList(this.mActors);
        parcel.writeString(this.mStaff);
        parcel.writeString(this.mShareUrl);
        parcel.writeString(this.mTitle);
        parcel.writeTypedList(this.mTags);
        parcel.writeParcelable(this.mUserSeason, i);
        long j = -1;
        parcel.writeLong(this.mPubTime != null ? this.mPubTime.getTime() : -1);
        parcel.writeString(this.mPubTimeShow);
        if (this.mLastTime != null) {
            j = this.mLastTime.getTime();
        }
        parcel.writeLong(j);
        parcel.writeString(this.mFavorites);
        parcel.writeInt(this.mWatchingCount);
        parcel.writeByte((byte) (this.mFavorited?1:0));
        parcel.writeByte((byte) (this.vipQuality?1:0));
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeByte((byte) (this.finished?1:0));
        parcel.writeString(this.badge);
        parcel.writeInt(this.seasonStatus);
        parcel.writeParcelable(this.mPayment, i);
        parcel.writeByte((byte) (this.isGuideFollow?1:0));
        parcel.writeByte((byte) (this.hasUnfollow?1:0));
        parcel.writeString(this.mOriginName);
        parcel.writeInt(this.mBusinessType);
        parcel.writeString(this.squareCoverUrl);
        parcel.writeParcelable(this.reviewMediaInfo, i);
        parcel.writeParcelable(this.payPack, i);
        parcel.writeInt(this.mWeekday);
    }

    protected BiliBangumiSeason(Parcel parcel) {
        Date date;
        this.mBangumiId = parcel.readString();
        this.mJapanTitle = parcel.readString();
        this.mCover = parcel.readString();
        this.mNewCover = parcel.readString();
        this.mSeasonId = parcel.readString();
        this.mSeasonTitle = parcel.readString();
        this.mTotalEP = parcel.readInt();
        this.mLastEPId = parcel.readString();
        this.mLastEPIndex = parcel.readString();
        boolean z = false;
        this.mIsFinished = parcel.readByte() != (byte) 0;
        this.mIsStarted = parcel.readInt();
        this.mIsAllowBp = parcel.readByte() != (byte) 0;
        this.mDownloadable = parcel.readByte() != (byte) 0;
        this.mHasNew = parcel.readByte() != (byte) 0;
        this.mEpisodes = parcel.createTypedArrayList(Episode.CREATOR);
        this.mSeasons = parcel.createTypedArrayList(CREATOR);
        this.mPlays = parcel.readString();
        this.mDanmakus = parcel.readString();
        this.mBrief = parcel.readString();
        this.mEvaluate = parcel.readString();
        this.mArea = parcel.readString();
        this.mActors = parcel.createTypedArrayList(Actor.CREATOR);
        this.mStaff = parcel.readString();
        this.mShareUrl = parcel.readString();
        this.mTitle = parcel.readString();
        this.mTags = parcel.createTypedArrayList(BiliBangumiTag.CREATOR);
        this.mUserSeason = (UserSeason) parcel.readParcelable(UserSeason.class.getClassLoader());
        long readLong = parcel.readLong();
        Date date2 = null;
        if (readLong == -1) {
            date = null;
        } else {
            date = new Date(readLong);
        }
        this.mPubTime = date;
        this.mPubTimeShow = parcel.readString();
        readLong = parcel.readLong();
        if (readLong != -1) {
            date2 = new Date(readLong);
        }
        this.mLastTime = date2;
        this.mFavorites = parcel.readString();
        this.mWatchingCount = parcel.readInt();
        this.mFavorited = parcel.readByte() != (byte) 0;
        this.vipQuality = parcel.readByte() != (byte) 0;
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.finished = parcel.readByte() != (byte) 0;
        this.badge = parcel.readString();
        this.seasonStatus = parcel.readInt();
        this.mPayment = (Payment) parcel.readParcelable(Payment.class.getClassLoader());
        this.isGuideFollow = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.hasUnfollow = z;
        this.mOriginName = parcel.readString();
        this.mBusinessType = parcel.readInt();
        this.squareCoverUrl = parcel.readString();
        this.reviewMediaInfo = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
        this.payPack = (PayPack) parcel.readParcelable(PayPack.class.getClassLoader());
        this.mWeekday = parcel.readInt();
    }
}
