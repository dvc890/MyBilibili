package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRoomInfo implements Parcelable {
    public static final Creator<BiliLiveRoomInfo> CREATOR = new C20331();
    @JSONField(name = "activity_gift")
    public ArrayList<BiliLiveActivityGift> mActivityGifts = new ArrayList();
    @JSONField(name = "activity_id")
    public int mActivityId;
    @JSONField(name = "area_id")
    public int mAreaId;
    @JSONField(name = "area_v2_id")
    public int mAreaV2Id;
    @JSONField(name = "area_v2_parent_id")
    public int mAreaV2ParentId;
    @JSONField(name = "attention")
    public int mAttention;
    @JSONField(name = "check_version")
    public int mCheckVersion;
    @JSONField(name = "cmt")
    public String mCmtHost;
    @JSONField(name = "cmt_port_goim")
    public int mCmtPortGoim;
    @JSONField(name = "cmt_port")
    public int mCmtPortOld;
    @JSONField(name = "cover")
    public String mCoverUrl;
    @JSONField(name = "data_behavior_id")
    public String mDataBehaviorId;
    @JSONField(name = "data_source_id")
    public String mDataSourceId;
    @JSONField(name = "event_corner")
    public ArrayList<EventType> mEvents = new ArrayList();
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "guard_info")
    public GuardInfo mGuardInfo;
    @JSONField(name = "guard_level")
    public int mGuardLevel;
    @JSONField(name = "guard_notice")
    public int mGuardNotice;
    @JSONField(name = "guard_tip_flag")
    public int mGuardTipFlag;
    @JSONField(name = "hot_word")
    public ArrayList<HotWord> mHotWords = new ArrayList();
    @JSONField(name = "ignore_gift")
    public ArrayList<IgnoreGift> mIgnoreGifts = new ArrayList();
    @JSONField(name = "isadmin")
    public int mIsAdmin;
    @JSONField(name = "is_attention")
    public int mIsAttention;
    public int mJumpFrom;
    @JSONField(name = "master_level")
    public int mMasterLevel;
    @JSONField(name = "master_level_color")
    public int mMasterLevelColor;
    @JSONField(name = "master_title")
    public MasterTitle mMasterTitle;
    @JSONField(name = "meta")
    public Meta mMeta;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "msg_color")
    public int mMsgColor;
    @JSONField(name = "msg_length")
    public int mMsgLength = 20;
    @JSONField(name = "msg_mode")
    public int mMsgMode;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "opentime")
    public long mOpentime;
    @JSONField(name = "area_v2_parent_name")
    public String mParentAreaName;
    public long mParsedTime;
    public String mPlayUrl;
    @JSONField(name = "prepare")
    public String mPrepare;
    public String mRealUrl;
    @JSONField(name = "recommend")
    public ArrayList<BiliLive> mRecommends = new ArrayList();
    @JSONField(name = "roomgifts")
    public ArrayList<BiliLiveProp> mRoomGifts = new ArrayList();
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "show_room_id")
    public int mRoomNumber;
    @JSONField(name = "sch_id")
    public int mSchId;
    @JSONField(name = "schedule")
    public Schedule mSchedule;
    @JSONField(name = "special_gift_gif")
    public String mSpecialGiftGifUrl;
    @JSONField(name = "status")
    public String mStatus;
    @JSONField(name = "area_v2_name")
    public String mSubAreaName;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "toplist")
    public ArrayList<OperationType> mTopList = new ArrayList();
    @JSONField(name = "uname")
    public String mUname;

    public BiliLiveRoomInfo() {
    }

    @Keep
    /* compiled from: BL */
    public static class EventType implements Parcelable {
        public static final Creator<EventType> CREATOR = new C20251();
        @JSONField(name = "event_img")
        public String mEventImg;
        @JSONField(name = "event_type")
        public String mEventType;

        public EventType() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$EventType$1 */
        static class C20251 implements Creator<EventType> {
            C20251() {
            }

            public EventType createFromParcel(Parcel parcel) {
                return new EventType(parcel);
            }

            public EventType[] newArray(int i) {
                return new EventType[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mEventType);
            parcel.writeString(this.mEventImg);
        }

        protected EventType(Parcel parcel) {
            this.mEventType = parcel.readString();
            this.mEventImg = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class GuardInfo implements Parcelable {
        public static final Creator<GuardInfo> CREATOR = new C20261();
        @JSONField(name = "heart_status")
        public int mHeartStatus;
        @JSONField(name = "heart_time")
        public int mHeartTime;

        public GuardInfo() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$GuardInfo$1 */
        static class C20261 implements Creator<GuardInfo> {
            C20261() {
            }

            public GuardInfo createFromParcel(Parcel parcel) {
                return new GuardInfo(parcel);
            }

            public GuardInfo[] newArray(int i) {
                return new GuardInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mHeartStatus);
            parcel.writeInt(this.mHeartTime);
        }

        protected GuardInfo(Parcel parcel) {
            this.mHeartStatus = parcel.readInt();
            this.mHeartTime = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class HotWord implements Parcelable {
        public static final Creator<HotWord> CREATOR = new C20271();
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "words")
        public String mWord;

        public HotWord() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$HotWord$1 */
        static class C20271 implements Creator<HotWord> {
            C20271() {
            }

            public HotWord createFromParcel(Parcel parcel) {
                return new HotWord(parcel);
            }

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
        public static final Creator<IgnoreGift> CREATOR = new C20281();
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "num")
        public int mNum;

        public IgnoreGift() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$IgnoreGift$1 */
        static class C20281 implements Creator<IgnoreGift> {
            C20281() {
            }

            public IgnoreGift createFromParcel(Parcel parcel) {
                return new IgnoreGift(parcel);
            }

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
    public static class MasterTitle implements Parcelable {
        public static final Creator<MasterTitle> CREATOR = new C20291();
        @JSONField(name = "height")
        public String mHeight;
        @JSONField(name = "img")
        public String mImgUrl;
        @JSONField(name = "title")
        public String mMasterTitle;
        @JSONField(name = "width")
        public String mWidth;

        public MasterTitle() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$MasterTitle$1 */
        static class C20291 implements Creator<MasterTitle> {
            C20291() {
            }

            public MasterTitle createFromParcel(Parcel parcel) {
                return new MasterTitle(parcel);
            }

            public MasterTitle[] newArray(int i) {
                return new MasterTitle[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMasterTitle);
            parcel.writeString(this.mImgUrl);
            parcel.writeString(this.mWidth);
            parcel.writeString(this.mHeight);
        }

        protected MasterTitle(Parcel parcel) {
            this.mMasterTitle = parcel.readString();
            this.mImgUrl = parcel.readString();
            this.mWidth = parcel.readString();
            this.mHeight = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Meta implements Parcelable {
        public static final Creator<Meta> CREATOR = new C20301();
        @JSONField(name = "check_status")
        public String mCheckStatus;
        @JSONField(name = "description")
        public String mDesc;
        @JSONField(name = "tag")
        public ArrayList<String> mTags = new ArrayList();
        @JSONField(name = "typeid")
        public int mTypeid;

        public Meta() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$Meta$1 */
        static class C20301 implements Creator<Meta> {
            C20301() {
            }

            public Meta createFromParcel(Parcel parcel) {
                return new Meta(parcel);
            }

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
        public static final Creator<OperationType> CREATOR = new C20311();
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "type")
        public String mType;

        public OperationType() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$OperationType$1 */
        static class C20311 implements Creator<OperationType> {
            C20311() {
            }

            public OperationType createFromParcel(Parcel parcel) {
                return new OperationType(parcel);
            }

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
        public static final Creator<Schedule> CREATOR = new C20321();
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

        public Schedule() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$Schedule$1 */
        static class C20321 implements Creator<Schedule> {
            C20321() {
            }

            public Schedule createFromParcel(Parcel parcel) {
                return new Schedule(parcel);
            }

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
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo$1 */
    static class C20331 implements Creator<BiliLiveRoomInfo> {
        C20331() {
        }

        public BiliLiveRoomInfo createFromParcel(Parcel parcel) {
            return new BiliLiveRoomInfo(parcel);
        }

        public BiliLiveRoomInfo[] newArray(int i) {
            return new BiliLiveRoomInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isFollowedAnchor() {
        return this.mIsAttention == 1;
    }

    public boolean canSkipResolve() {
        return hasPlayUrl() || hasPlayUrlResolved();
    }

    public boolean hasPlayUrl() {
        return !TextUtils.isEmpty(this.mPlayUrl);
    }

    public boolean hasPlayUrlResolved() {
        return !TextUtils.isEmpty(this.mRealUrl);
    }

    public boolean isExpired() {
        return this.mParsedTime > 0 && System.currentTimeMillis() - this.mParsedTime >= 3000000;
    }

    public List<BiliLiveBaseGift> getGifts() {
        ArrayList arrayList = new ArrayList();
        if (this.mRoomGifts != null) {
            arrayList.addAll(this.mRoomGifts);
        }
        if (this.mActivityGifts != null) {
            arrayList.addAll(this.mActivityGifts);
        }
        return arrayList;
    }

    public List<BiliLiveProp> getProps(boolean z) {
        if (this.mRoomGifts == null) {
            return null;
        }
        if (!z) {
            return this.mRoomGifts;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mRoomGifts.iterator();
        while (it.hasNext()) {
            arrayList.add(((BiliLiveProp) it.next()).cloneObj());
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRoomId);
        parcel.writeInt(this.mRoomNumber);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mCoverUrl);
        parcel.writeLong(this.mMid);
        parcel.writeInt(this.mAttention);
        parcel.writeInt(this.mIsAttention);
        parcel.writeLong(this.mOnline);
        parcel.writeInt(this.mSchId);
        parcel.writeString(this.mStatus);
        parcel.writeString(this.mFace);
        parcel.writeParcelable(this.mMasterTitle, i);
        parcel.writeString(this.mUname);
        parcel.writeInt(this.mMasterLevel);
        parcel.writeInt(this.mMasterLevelColor);
        parcel.writeInt(this.mIsAdmin);
        parcel.writeLong(this.mOpentime);
        parcel.writeString(this.mPrepare);
        parcel.writeString(this.mCmtHost);
        parcel.writeInt(this.mCmtPortOld);
        parcel.writeInt(this.mCmtPortGoim);
        parcel.writeParcelable(this.mSchedule, i);
        parcel.writeParcelable(this.mMeta, i);
        parcel.writeInt(this.mCheckVersion);
        parcel.writeInt(this.mActivityId);
        parcel.writeInt(this.mMsgLength);
        parcel.writeInt(this.mMsgMode);
        parcel.writeInt(this.mMsgColor);
        parcel.writeInt(this.mGuardLevel);
        parcel.writeParcelable(this.mGuardInfo, i);
        parcel.writeInt(this.mGuardNotice);
        parcel.writeInt(this.mGuardTipFlag);
        parcel.writeInt(this.mAreaId);
        parcel.writeInt(this.mAreaV2Id);
        parcel.writeInt(this.mAreaV2ParentId);
        parcel.writeString(this.mSubAreaName);
        parcel.writeString(this.mParentAreaName);
        parcel.writeString(this.mSpecialGiftGifUrl);
        parcel.writeString(this.mDataBehaviorId);
        parcel.writeString(this.mDataSourceId);
        parcel.writeInt(this.mJumpFrom);
        parcel.writeTypedList(this.mHotWords);
        parcel.writeList(this.mRoomGifts);
        parcel.writeTypedList(this.mIgnoreGifts);
        parcel.writeList(this.mActivityGifts);
        parcel.writeTypedList(this.mRecommends);
        parcel.writeTypedList(this.mTopList);
        parcel.writeString(this.mPlayUrl);
        parcel.writeString(this.mRealUrl);
        parcel.writeLong(this.mParsedTime);
        parcel.writeTypedList(this.mEvents);
    }

    protected BiliLiveRoomInfo(Parcel parcel) {
        this.mRoomId = parcel.readInt();
        this.mRoomNumber = parcel.readInt();
        this.mTitle = parcel.readString();
        this.mCoverUrl = parcel.readString();
        this.mMid = parcel.readLong();
        this.mAttention = parcel.readInt();
        this.mIsAttention = parcel.readInt();
        this.mOnline = parcel.readLong();
        this.mSchId = parcel.readInt();
        this.mStatus = parcel.readString();
        this.mFace = parcel.readString();
        this.mMasterTitle = (MasterTitle) parcel.readParcelable(MasterTitle.class.getClassLoader());
        this.mUname = parcel.readString();
        this.mMasterLevel = parcel.readInt();
        this.mMasterLevelColor = parcel.readInt();
        this.mIsAdmin = parcel.readInt();
        this.mOpentime = parcel.readLong();
        this.mPrepare = parcel.readString();
        this.mCmtHost = parcel.readString();
        this.mCmtPortOld = parcel.readInt();
        this.mCmtPortGoim = parcel.readInt();
        this.mSchedule = (Schedule) parcel.readParcelable(Schedule.class.getClassLoader());
        this.mMeta = (Meta) parcel.readParcelable(Meta.class.getClassLoader());
        this.mCheckVersion = parcel.readInt();
        this.mActivityId = parcel.readInt();
        this.mMsgLength = parcel.readInt();
        this.mMsgMode = parcel.readInt();
        this.mMsgColor = parcel.readInt();
        this.mGuardLevel = parcel.readInt();
        this.mGuardInfo = (GuardInfo) parcel.readParcelable(GuardInfo.class.getClassLoader());
        this.mGuardNotice = parcel.readInt();
        this.mGuardTipFlag = parcel.readInt();
        this.mAreaId = parcel.readInt();
        this.mAreaV2Id = parcel.readInt();
        this.mAreaV2ParentId = parcel.readInt();
        this.mSubAreaName = parcel.readString();
        this.mParentAreaName = parcel.readString();
        this.mSpecialGiftGifUrl = parcel.readString();
        this.mDataBehaviorId = parcel.readString();
        this.mDataSourceId = parcel.readString();
        this.mJumpFrom = parcel.readInt();
        this.mHotWords = parcel.createTypedArrayList(HotWord.CREATOR);
        this.mRoomGifts = new ArrayList();
        parcel.readList(this.mRoomGifts, BiliLiveProp.class.getClassLoader());
        this.mIgnoreGifts = parcel.createTypedArrayList(IgnoreGift.CREATOR);
        this.mActivityGifts = new ArrayList();
        parcel.readList(this.mActivityGifts, BiliLiveActivityGift.class.getClassLoader());
        this.mRecommends = parcel.createTypedArrayList(BiliLive.CREATOR);
        this.mTopList = parcel.createTypedArrayList(OperationType.CREATOR);
        this.mPlayUrl = parcel.readString();
        this.mRealUrl = parcel.readString();
        this.mParsedTime = parcel.readLong();
        this.mEvents = parcel.createTypedArrayList(EventType.CREATOR);
    }
}
