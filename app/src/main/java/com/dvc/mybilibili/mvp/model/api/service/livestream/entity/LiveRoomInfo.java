package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
/* compiled from: BL */
public class LiveRoomInfo implements Parcelable {
    public static final Creator<LiveRoomInfo> CREATOR = new C19351();
    @JSONField(name = "attention")
    public int mAttention;
    @JSONField(name = "cmt")
    public String mCmtHost;
    @JSONField(name = "cmt_port_goim")
    public int mCmtPortGoim;
    @JSONField(name = "cmt_port")
    public int mCmtPortOld;
    @JSONField(name = "cover")
    public String mCoverUrl;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "hot_word")
    public ArrayList<HotWord> mHotWords = new ArrayList();
    @JSONField(name = "ignore_gift")
    public ArrayList<IgnoreGift> mIgnoreGifts = new ArrayList();
    @JSONField(name = "isadmin")
    public int mIsAdmin;
    @JSONField(name = "is_attention")
    public int mIsAttention;
    @JSONField(name = "meta")
    public Meta mMeta;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "opentime")
    public long mOpentime;
    @JSONField(name = "prepare")
    public String mPrepare;
    @JSONField(name = "roomgifts")
    public ArrayList<LiveRoomProp> mRoomGifts = new ArrayList();
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "sch_id")
    public int mSchId;
    @JSONField(name = "schedule")
    public Schedule mSchedule;
    @JSONField(name = "status")
    public String mStatus;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "toplist")
    public ArrayList<OperationType> mTopList = new ArrayList();
    @JSONField(name = "uname")
    public String mUname;

    @Keep
    /* compiled from: BL */
    public static class HotWord implements Parcelable {
        public static final Creator<HotWord> CREATOR = new C19301();
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "words")
        public String mWord;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$HotWord$1 */
        static class C19301 implements Creator<HotWord> {
            C19301() {
            }

            /* renamed from: a */
            public HotWord createFromParcel(Parcel parcel) {
                return new HotWord(parcel);
            }

            /* renamed from: a */
            public HotWord[] newArray(int i) {
                return new HotWord[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mId);
            parcel.writeString(this.mWord);
        }

        protected HotWord(Parcel parcel) {
            this.mId = parcel.readInt();
            this.mWord = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class IgnoreGift implements Parcelable {
        public static final Creator<IgnoreGift> CREATOR = new C19311();
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "num")
        public int mNum;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$IgnoreGift$1 */
        static class C19311 implements Creator<IgnoreGift> {
            C19311() {
            }

            /* renamed from: a */
            public IgnoreGift createFromParcel(Parcel parcel) {
                return new IgnoreGift(parcel);
            }

            /* renamed from: a */
            public IgnoreGift[] newArray(int i) {
                return new IgnoreGift[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mId);
            parcel.writeInt(this.mNum);
        }

        protected IgnoreGift(Parcel parcel) {
            this.mId = parcel.readInt();
            this.mNum = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Meta implements Parcelable {
        public static final Creator<Meta> CREATOR = new C19321();
        @JSONField(name = "check_status")
        public String mCheckStatus;
        @JSONField(name = "description")
        public String mDesc;
        @JSONField(name = "tag")
        public ArrayList<String> mTags = new ArrayList();
        @JSONField(name = "typeid")
        public int mTypeid;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$Meta$1 */
        static class C19321 implements Creator<Meta> {
            C19321() {
            }

            /* renamed from: a */
            public Meta createFromParcel(Parcel parcel) {
                return new Meta(parcel);
            }

            /* renamed from: a */
            public Meta[] newArray(int i) {
                return new Meta[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mDesc);
            parcel.writeString(this.mCheckStatus);
            parcel.writeStringList(this.mTags);
            parcel.writeInt(this.mTypeid);
        }

        protected Meta(Parcel parcel) {
            this.mDesc = parcel.readString();
            this.mCheckStatus = parcel.readString();
            this.mTags = parcel.createStringArrayList();
            this.mTypeid = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class OperationType implements Parcelable {
        public static final Creator<OperationType> CREATOR = new C19331();
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "type")
        public String mType;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$OperationType$1 */
        static class C19331 implements Creator<OperationType> {
            C19331() {
            }

            /* renamed from: a */
            public OperationType createFromParcel(Parcel parcel) {
                return new OperationType(parcel);
            }

            /* renamed from: a */
            public OperationType[] newArray(int i) {
                return new OperationType[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeString(this.mType);
        }

        protected OperationType(Parcel parcel) {
            this.mName = parcel.readString();
            this.mType = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Schedule implements Parcelable {
        public static final Creator<Schedule> CREATOR = new C19341();
        @JSONField(name = "aid")
        public int mAid;
        @JSONField(name = "cid")
        public int mCid;
        @JSONField(name = "mid")
        public int mId;
        @JSONField(name = "online")
        public int mOnline;
        @JSONField(name = "start_at")
        public String mStartTime;
        @JSONField(name = "start")
        public long mStartTimeMillis;
        @JSONField(name = "status")
        public String mStatus;
        @JSONField(name = "stream_id")
        public int mStreamId;
        @JSONField(name = "title")
        public String mTitle;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$Schedule$1 */
        static class C19341 implements Creator<Schedule> {
            C19341() {
            }

            /* renamed from: a */
            public Schedule createFromParcel(Parcel parcel) {
                return new Schedule(parcel);
            }

            /* renamed from: a */
            public Schedule[] newArray(int i) {
                return new Schedule[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mId);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mStartTime);
            parcel.writeLong(this.mStartTimeMillis);
            parcel.writeInt(this.mCid);
            parcel.writeInt(this.mAid);
            parcel.writeInt(this.mStreamId);
            parcel.writeInt(this.mOnline);
            parcel.writeString(this.mStatus);
        }

        protected Schedule(Parcel parcel) {
            this.mId = parcel.readInt();
            this.mTitle = parcel.readString();
            this.mStartTime = parcel.readString();
            this.mStartTimeMillis = parcel.readLong();
            this.mCid = parcel.readInt();
            this.mAid = parcel.readInt();
            this.mStreamId = parcel.readInt();
            this.mOnline = parcel.readInt();
            this.mStatus = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveRoomInfo$1 */
    static class C19351 implements Creator<LiveRoomInfo> {
        C19351() {
        }

        /* renamed from: a */
        public LiveRoomInfo createFromParcel(Parcel parcel) {
            return new LiveRoomInfo(parcel);
        }

        /* renamed from: a */
        public LiveRoomInfo[] newArray(int i) {
            return new LiveRoomInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public List<LiveRoomProp> getProps(boolean z) {
        if (this.mRoomGifts == null) {
            return null;
        }
        if (!z) {
            return this.mRoomGifts;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mRoomGifts.iterator();
        while (it.hasNext()) {
            arrayList.add(((LiveRoomProp) it.next()).cloneObj());
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRoomId);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mCoverUrl);
        parcel.writeLong(this.mMid);
        parcel.writeInt(this.mAttention);
        parcel.writeInt(this.mIsAttention);
        parcel.writeLong(this.mOnline);
        parcel.writeInt(this.mSchId);
        parcel.writeString(this.mStatus);
        parcel.writeString(this.mFace);
        parcel.writeString(this.mUname);
        parcel.writeInt(this.mIsAdmin);
        parcel.writeLong(this.mOpentime);
        parcel.writeString(this.mPrepare);
        parcel.writeString(this.mCmtHost);
        parcel.writeInt(this.mCmtPortOld);
        parcel.writeInt(this.mCmtPortGoim);
        parcel.writeParcelable(this.mSchedule, i);
        parcel.writeParcelable(this.mMeta, i);
        parcel.writeTypedList(this.mHotWords);
        parcel.writeList(this.mRoomGifts);
        parcel.writeTypedList(this.mIgnoreGifts);
        parcel.writeTypedList(this.mTopList);
    }

    protected LiveRoomInfo(Parcel parcel) {
        this.mRoomId = parcel.readInt();
        this.mTitle = parcel.readString();
        this.mCoverUrl = parcel.readString();
        this.mMid = parcel.readLong();
        this.mAttention = parcel.readInt();
        this.mIsAttention = parcel.readInt();
        this.mOnline = parcel.readLong();
        this.mSchId = parcel.readInt();
        this.mStatus = parcel.readString();
        this.mFace = parcel.readString();
        this.mUname = parcel.readString();
        this.mIsAdmin = parcel.readInt();
        this.mOpentime = parcel.readLong();
        this.mPrepare = parcel.readString();
        this.mCmtHost = parcel.readString();
        this.mCmtPortOld = parcel.readInt();
        this.mCmtPortGoim = parcel.readInt();
        this.mSchedule = (Schedule) parcel.readParcelable(Schedule.class.getClassLoader());
        this.mMeta = (Meta) parcel.readParcelable(Meta.class.getClassLoader());
        this.mHotWords = parcel.createTypedArrayList(HotWord.CREATOR);
        this.mRoomGifts = new ArrayList();
        parcel.readList(this.mRoomGifts, LiveRoomProp.class.getClassLoader());
        this.mIgnoreGifts = parcel.createTypedArrayList(IgnoreGift.CREATOR);
        this.mTopList = parcel.createTypedArrayList(OperationType.CREATOR);
    }
}
