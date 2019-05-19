package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoom implements Parcelable {
    public static final Creator<BiliLiveRoom> CREATOR = new C20211();
    @JSONField(name = "attention")
    public int mAttention;
    public String mCheckStatus;
    @JSONField(name = "cmt")
    public String mCmtHost;
    @JSONField(name = "port")
    public int mCmtPort;
    @JSONField(name = "comment")
    public int mComment;
    @JSONField(name = "cover")
    public String mCoverUrl;
    public String mDescription;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "sch_id")
    public int mSchId;
    public Schedule mSchedule;
    public String mStartTime;
    @JSONField(name = "status")
    public String mStatus;
    public String[] mTags;
    @JSONField(name = "title")
    public String mTitle;
    public int mTypeid;
    @JSONField(name = "uname")
    public String mUname;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoom$1 */
    static class C20211 implements Creator<BiliLiveRoom> {
        C20211() {
        }

        public BiliLiveRoom createFromParcel(Parcel parcel) {
            return new BiliLiveRoom(parcel, null);
        }

        public BiliLiveRoom[] newArray(int i) {
            return new BiliLiveRoom[i];
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Schedule {
        public int mAid;
        public int mCid;
        public int mId;
        public int mOnline;
        public String mStartTime;
        public long mStartTimeMillis;
        public String mStatus;
        public int mStreamId;
        public String mTitle;
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ BiliLiveRoom(Parcel parcel, C20211 c20211) {
        this(parcel);
    }

    private BiliLiveRoom(Parcel parcel) {
        this.mRoomId = parcel.readInt();
        this.mCoverUrl = parcel.readString();
        this.mTitle = parcel.readString();
        this.mMid = parcel.readLong();
        this.mAttention = parcel.readInt();
        this.mOnline = parcel.readLong();
        this.mComment = parcel.readInt();
        this.mSchId = parcel.readInt();
        this.mStartTime = parcel.readString();
        this.mStatus = parcel.readString();
        this.mUname = parcel.readString();
        this.mFace = parcel.readString();
        this.mCmtHost = parcel.readString();
        this.mCmtPort = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRoomId);
        parcel.writeString(this.mCoverUrl);
        parcel.writeString(this.mTitle);
        parcel.writeLong(this.mMid);
        parcel.writeInt(this.mAttention);
        parcel.writeLong(this.mOnline);
        parcel.writeInt(this.mComment);
        parcel.writeInt(this.mSchId);
        parcel.writeString(this.mStartTime);
        parcel.writeString(this.mStatus);
        parcel.writeString(this.mUname);
        parcel.writeString(this.mFace);
        parcel.writeString(this.mCmtHost);
        parcel.writeInt(this.mCmtPort);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{LiveRoom: ");
        stringBuilder.append(this.mRoomId);
        stringBuilder.append(", ");
        stringBuilder.append(this.mTitle);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
