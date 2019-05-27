package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliBangumiSeasonDetail extends BiliBangumiSeason {
    public static final Creator<BiliBangumiSeasonDetail> CREATOR = new C29671();
    @JSONField(name = "activity")
    public Activity mActivity;
    @JSONField(name = "rights")
    public Rights mRights;
    @JSONField(name = "rank")
    public BangumiSponsorRankSummary mSponsorRank;
    @JSONField(name = "pendant_activity")
    public PendantActivity pendantActivity;

    public BiliBangumiSeasonDetail() {
        super();
    }

    @Keep
    /* compiled from: BL */
    public static class Activity implements Parcelable {
        public static final Creator<Activity> CREATOR = new C18411();
        @JSONField(name = "appPicUrl")
        public String mCover;
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "appLink")
        public String mLink;
        @JSONField(name = "title")
        public String mTitle;

        public Activity() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeasonDetail$Activity$1 */
        static class C18411 implements Creator<Activity> {
            C18411() {
            }

            /* renamed from: a */
            public Activity createFromParcel(Parcel parcel) {
                return new Activity(parcel);
            }

            /* renamed from: a */
            public Activity[] newArray(int i) {
                return new Activity[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mId);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mLink);
            parcel.writeString(this.mCover);
        }

        protected Activity(Parcel parcel) {
            this.mId = parcel.readInt();
            this.mTitle = parcel.readString();
            this.mLink = parcel.readString();
            this.mCover = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Rights implements Parcelable {
        public static final Creator<Rights> CREATOR = new C18421();
        @JSONField(name = "arealimit")
        public boolean mArealimit;
        @JSONField(name = "is_started")
        public boolean mIsStarted;

        public Rights() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeasonDetail$Rights$1 */
        static class C18421 implements Creator<Rights> {
            C18421() {
            }

            /* renamed from: a */
            public Rights createFromParcel(Parcel parcel) {
                return new Rights(parcel);
            }

            /* renamed from: a */
            public Rights[] newArray(int i) {
                return new Rights[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Rights(Parcel parcel) {
            boolean z = false;
            this.mArealimit = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.mIsStarted = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.mArealimit?1:0));
            parcel.writeByte((byte) (this.mIsStarted?1:0));
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeasonDetail$1 */
    static class C29671 implements Creator<BiliBangumiSeasonDetail> {
        C29671() {
        }

        /* renamed from: a */
        public BiliBangumiSeasonDetail createFromParcel(Parcel parcel) {
            return new BiliBangumiSeasonDetail(parcel);
        }

        /* renamed from: a */
        public BiliBangumiSeasonDetail[] newArray(int i) {
            return new BiliBangumiSeasonDetail[i];
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Pendant implements Parcelable {
        public static final Creator<Pendant> CREATOR = new C29681();
        public String expire;
        public String image;
        public String name;
        public String pid;

        public Pendant() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeasonDetail$Pendant$1 */
        static class C29681 implements Creator<Pendant> {
            C29681() {
            }

            /* renamed from: a */
            public Pendant createFromParcel(Parcel parcel) {
                return new Pendant(parcel);
            }

            /* renamed from: a */
            public Pendant[] newArray(int i) {
                return new Pendant[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Pendant(Parcel parcel) {
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

    @Keep
    /* compiled from: BL */
    public static class PendantActivity implements Parcelable {
        public static final Creator<PendantActivity> CREATOR = new C29691();
        /* renamed from: id */
        public String f8693id;
        public List<Pendant> pendants;
        public List<BangumiThreshold> threshold;

        public PendantActivity() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.BiliBangumiSeasonDetail$PendantActivity$1 */
        static class C29691 implements Creator<PendantActivity> {
            C29691() {
            }

            /* renamed from: a */
            public PendantActivity createFromParcel(Parcel parcel) {
                return new PendantActivity(parcel);
            }

            /* renamed from: a */
            public PendantActivity[] newArray(int i) {
                return new PendantActivity[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected PendantActivity(Parcel parcel) {
            this.f8693id = parcel.readString();
            this.pendants = parcel.createTypedArrayList(Pendant.CREATOR);
            this.threshold = parcel.createTypedArrayList(BangumiThreshold.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8693id);
            parcel.writeTypedList(this.pendants);
            parcel.writeTypedList(this.threshold);
        }
    }

    public int describeContents() {
        return 0;
    }

    public static BiliBangumiSeasonDetail copy(BiliBangumiSeason biliBangumiSeason) {
        BiliBangumiSeasonDetail biliBangumiSeasonDetail = new BiliBangumiSeasonDetail();
        biliBangumiSeasonDetail.mTitle = biliBangumiSeason.mTitle;
        biliBangumiSeasonDetail.mSeasonId = biliBangumiSeason.mSeasonId;
        biliBangumiSeasonDetail.mBangumiId = biliBangumiSeason.mBangumiId;
        biliBangumiSeasonDetail.mSeasons = biliBangumiSeason.mSeasons;
        biliBangumiSeasonDetail.mCover = biliBangumiSeason.mCover;
        biliBangumiSeasonDetail.mPlays = biliBangumiSeason.mPlays;
        biliBangumiSeasonDetail.mDanmakus = biliBangumiSeason.mDanmakus;
        biliBangumiSeasonDetail.mEpisodes = biliBangumiSeason.mEpisodes;
        biliBangumiSeasonDetail.mIsFinished = biliBangumiSeason.mIsFinished;
        biliBangumiSeasonDetail.mFavorites = biliBangumiSeason.mFavorites;
        biliBangumiSeasonDetail.mWeekday = biliBangumiSeason.mWeekday;
        biliBangumiSeasonDetail.mTotalEP = biliBangumiSeason.mTotalEP;
        biliBangumiSeasonDetail.reviewMediaInfo = biliBangumiSeason.reviewMediaInfo;
        return biliBangumiSeasonDetail;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected BiliBangumiSeasonDetail(Parcel parcel) {
        super(parcel);
    }
}
