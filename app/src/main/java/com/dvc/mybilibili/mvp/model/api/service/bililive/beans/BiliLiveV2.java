package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

//////

@Keep
/* compiled from: BL */
public class BiliLiveV2 implements Parcelable {
    public static final Creator<BiliLiveV2> CREATOR = new C20501();
    @JSONField(name = "click_callback")
    public String clickCallback;
    @JSONField(name = "accept_quality")
    public String mAcceptQuality;
    @JSONField(name = "accept_quality_v2")
    public List<String> mAcceptQualityV2;
    @JSONField(name = "area_name")
    public String mArea;
    @JSONField(name = "area_id")
    public int mAreaId;
    @JSONField(name = "broadcast_type")
    public int mBroadcasetType;
    @JSONField(name = "corner")
    public String mCorner;
    @JSONField(name = "cover_size")
    public CoverSize mCoverSize;
    @JSONField(name = "current_quality")
    public int mCurrentQuality;
    @JSONField(name = "face")
    public String mFace;
    public boolean mHasReported;
    public int mIndex;
    @JSONField(name = "is_clip")
    public int mIsClip;
    @JSONField(name = "is_tv")
    public int mIsTv;
    @JSONField(name = "link")
    public String mLink;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "parent_id")
    public int mParentAreaId;
    @JSONField(name = "parent_name")
    public String mParentAreaName;
    public long mParsedTime;
    @JSONField(name = "pendent")
    public String mPendent;
    @JSONField(name = "play_url")
    public String mPlayUrl;
    @JSONField(name = "realurl")
    public String mRealUrl;
    @JSONField(name = "roomid")
    public int mRoomId;
    @JSONField(name = "round_status")
    public int mRoundStatus;
    @JSONField(name = "show_cover")
    public String mShowCover;
    @JSONField(name = "system_cover")
    public String mSystemCover;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "user_cover")
    public String mUserCover;
    @JSONField(name = "user_cover_flag")
    public int mUserCoverFlag;
    @JSONField(name = "pendent_ld")
    public String pendentLeftBottom;
    @JSONField(name = "pendent_ld_color")
    public String pendentLeftBottomColor;
    @JSONField(name = "pendent_ru_pic")
    public String pendentPic;
    @JSONField(name = "pendent_ru")
    public String pendentRightTop;
    @JSONField(name = "pendent_ru_color")
    public String pendentRightTopColor;
    @JSONField(name = "pk_id")
    public int pkId;
    @JSONField(name = "session_id")
    public String sessionId;
    @JSONField(name = "show_callback")
    public String showCallback;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveV2$1 */
    static class C20501 implements Creator<BiliLiveV2> {
        C20501() {
        }

        public BiliLiveV2 createFromParcel(Parcel parcel) {
            return new BiliLiveV2(parcel);
        }

        public BiliLiveV2[] newArray(int i) {
            return new BiliLiveV2[i];
        }
    }

    /* compiled from: BL */
    public static class CoverSize implements Parcelable {
        public static final Creator<CoverSize> CREATOR = new C20511();
        public int height;
        public int width;

        public CoverSize() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveV2$CoverSize$1 */
        static class C20511 implements Creator<CoverSize> {
            C20511() {
            }

            public CoverSize createFromParcel(Parcel parcel) {
                return new CoverSize(parcel);
            }

            public CoverSize[] newArray(int i) {
                return new CoverSize[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected CoverSize(Parcel parcel) {
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean hasPlayUrl() {
        return TextUtils.isEmpty(this.mPlayUrl);
    }

    public boolean hasPlayUrlResolved() {
        return TextUtils.isEmpty(this.mRealUrl);
    }

    public String getCover() {
        if (this.mUserCoverFlag == 1) {
            return this.mUserCover;
        }
        return this.mSystemCover;
    }

    public String getDisplayAreaName() {
        String str;
        if (TextUtils.isEmpty(this.mArea)) {
            str = this.mParentAreaName;
        } else {
            str = this.mArea;
        }
        return str;
//        return C7049h.m25225a(str, 5, "");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLive{roomId=");
        stringBuilder.append(this.mRoomId);
        stringBuilder.append(", title='");
        stringBuilder.append(this.mTitle);
        stringBuilder.append('\'');
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public String getReportMessage(int i) {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.mParentAreaId);
        stringBuilder.append(";");
        stringBuilder.append(this.mAreaId);
        stringBuilder.append(";");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public BiliLiveV2() {
        this.mHasReported = false;
        this.mParsedTime = System.currentTimeMillis();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mIndex);
        parcel.writeString(this.mTitle);
        parcel.writeLong(this.mOnline);
        parcel.writeString(this.mUname);
        parcel.writeInt(this.mRoomId);
        parcel.writeString(this.mUserCover);
        parcel.writeString(this.mSystemCover);
        parcel.writeString(this.mPendent);
        parcel.writeString(this.mShowCover);
        parcel.writeInt(this.mUserCoverFlag);
        parcel.writeString(this.mLink);
        parcel.writeString(this.mFace);
        parcel.writeParcelable(this.mCoverSize, i);
        parcel.writeInt(this.mParentAreaId);
        parcel.writeString(this.mParentAreaName);
        parcel.writeInt(this.mAreaId);
        parcel.writeString(this.mArea);
        parcel.writeString(this.mPlayUrl);
        parcel.writeString(this.mAcceptQuality);
        parcel.writeInt(this.mIsTv);
        parcel.writeString(this.mCorner);
        parcel.writeString(this.mRealUrl);
        parcel.writeInt(this.mIsClip);
        parcel.writeInt(this.mRoundStatus);
        parcel.writeInt(this.mCurrentQuality);
        parcel.writeStringList(this.mAcceptQualityV2);
        parcel.writeString(this.pendentRightTop);
        parcel.writeString(this.pendentLeftBottom);
        parcel.writeString(this.pendentLeftBottomColor);
        parcel.writeString(this.pendentRightTopColor);
        parcel.writeString(this.pendentPic);
        parcel.writeInt(this.pkId);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.showCallback);
        parcel.writeString(this.clickCallback);
        parcel.writeInt(this.mBroadcasetType);
        parcel.writeLong(this.mParsedTime);
        parcel.writeByte((byte) (this.mHasReported?1:0));
    }

    protected BiliLiveV2(Parcel parcel) {
        boolean z = false;
        this.mHasReported = false;
        this.mIndex = parcel.readInt();
        this.mTitle = parcel.readString();
        this.mOnline = parcel.readLong();
        this.mUname = parcel.readString();
        this.mRoomId = parcel.readInt();
        this.mUserCover = parcel.readString();
        this.mSystemCover = parcel.readString();
        this.mPendent = parcel.readString();
        this.mShowCover = parcel.readString();
        this.mUserCoverFlag = parcel.readInt();
        this.mLink = parcel.readString();
        this.mFace = parcel.readString();
        this.mCoverSize = (CoverSize) parcel.readParcelable(CoverSize.class.getClassLoader());
        this.mParentAreaId = parcel.readInt();
        this.mParentAreaName = parcel.readString();
        this.mAreaId = parcel.readInt();
        this.mArea = parcel.readString();
        this.mPlayUrl = parcel.readString();
        this.mAcceptQuality = parcel.readString();
        this.mIsTv = parcel.readInt();
        this.mCorner = parcel.readString();
        this.mRealUrl = parcel.readString();
        this.mIsClip = parcel.readInt();
        this.mRoundStatus = parcel.readInt();
        this.mCurrentQuality = parcel.readInt();
        this.mAcceptQualityV2 = parcel.createStringArrayList();
        this.pendentRightTop = parcel.readString();
        this.pendentLeftBottom = parcel.readString();
        this.pendentLeftBottomColor = parcel.readString();
        this.pendentRightTopColor = parcel.readString();
        this.pendentPic = parcel.readString();
        this.pkId = parcel.readInt();
        this.sessionId = parcel.readString();
        this.showCallback = parcel.readString();
        this.clickCallback = parcel.readString();
        this.mBroadcasetType = parcel.readInt();
        this.mParsedTime = parcel.readLong();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.mHasReported = z;
    }
}
