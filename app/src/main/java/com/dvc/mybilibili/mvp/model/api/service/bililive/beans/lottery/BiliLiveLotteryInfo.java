package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveLotteryInfo {
    @JSONField(name = "last_raffle_id")
    public int mLastRaffleId;
    @JSONField(name = "last_raffle_type")
    public String mLastRaffleType;
    @JSONField(name = "list")
    public List<Lottery> mList;

    @Keep
    /* compiled from: BL */
    public static class Lottery implements Parcelable {
        public static final Creator<Lottery> CREATOR = new C20621();
        @JSONField(name = "asset_animation_pic")
        public String mAssetAnimationPic;
        @JSONField(name = "asset_tips_pic")
        public String mAssetTipsPic;
        public long mEndSystemTime;
        @JSONField(name = "from")
        public String mFrom;
        @JSONField(name = "from_user")
        public FromUser mFromUser;
        @JSONField(name = "max_time")
        public int mMaxTime;
        @JSONField(name = "payflow_id")
        public String mPayFlowId;
        @JSONField(name = "raffleId")
        public int mRaffleId;
        @JSONField(name = "sender_type")
        public int mSenderType;
        @JSONField(name = "status")
        public int mStatus;
        @JSONField(name = "time")
        public int mTime;
        @JSONField(name = "time_wait")
        public int mTimeWait;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "type")
        public String mType;
        public long mWaitSystemTime;

        @Keep
        /* compiled from: BL */
        public static class FromUser implements Parcelable {
            public static final Creator<FromUser> CREATOR = new C20611();
            @JSONField(name = "face")
            public String mFace;
            @JSONField(name = "uname")
            public String mUname;

            /* compiled from: BL */
            /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.lottery.BiliLiveLotteryInfo$Lottery$FromUser$1 */
            static class C20611 implements Creator<FromUser> {
                C20611() {
                }

                public FromUser createFromParcel(Parcel parcel) {
                    return new FromUser(parcel);
                }

                public FromUser[] newArray(int i) {
                    return new FromUser[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            protected FromUser(Parcel parcel) {
                this.mUname = parcel.readString();
                this.mFace = parcel.readString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.mUname);
                parcel.writeString(this.mFace);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.lottery.BiliLiveLotteryInfo$Lottery$1 */
        static class C20621 implements Creator<Lottery> {
            C20621() {
            }

            public Lottery createFromParcel(Parcel parcel) {
                return new Lottery(parcel);
            }

            public Lottery[] newArray(int i) {
                return new Lottery[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean hasNotJoined() {
            return this.mStatus == 1;
        }

        protected Lottery(Parcel parcel) {
            this.mRaffleId = parcel.readInt();
            this.mTitle = parcel.readString();
            this.mType = parcel.readString();
            this.mFrom = parcel.readString();
            this.mFromUser = (FromUser) parcel.readParcelable(FromUser.class.getClassLoader());
            this.mTime = parcel.readInt();
            this.mTimeWait = parcel.readInt();
            this.mMaxTime = parcel.readInt();
            this.mStatus = parcel.readInt();
            this.mAssetAnimationPic = parcel.readString();
            this.mAssetTipsPic = parcel.readString();
            this.mPayFlowId = parcel.readString();
            this.mSenderType = parcel.readInt();
            this.mEndSystemTime = parcel.readLong();
            this.mWaitSystemTime = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mRaffleId);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mType);
            parcel.writeString(this.mFrom);
            parcel.writeParcelable(this.mFromUser, i);
            parcel.writeInt(this.mTime);
            parcel.writeInt(this.mTimeWait);
            parcel.writeInt(this.mMaxTime);
            parcel.writeInt(this.mStatus);
            parcel.writeString(this.mAssetAnimationPic);
            parcel.writeString(this.mAssetTipsPic);
            parcel.writeString(this.mPayFlowId);
            parcel.writeInt(this.mSenderType);
            parcel.writeLong(this.mEndSystemTime);
            parcel.writeLong(this.mWaitSystemTime);
        }

        public int getCountDownTime() {
            long currentTimeMillis = this.mWaitSystemTime - System.currentTimeMillis();
            return currentTimeMillis > 0 ? (int) (currentTimeMillis / 1000) : 0;
        }

        public int getAwardCountTime() {
            long currentTimeMillis = this.mEndSystemTime - System.currentTimeMillis();
            return currentTimeMillis > 0 ? (int) currentTimeMillis : 0;
        }

        public int getTotalAwardTime() {
            long j = this.mEndSystemTime - this.mWaitSystemTime;
            return j > 0 ? (int) j : 0;
        }
    }
}
