package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

////

@Keep
/* compiled from: BL */
public class BiliLive implements Parcelable {
    public static final Creator<BiliLive> CREATOR = new C19931();
    @JSONField(name = "accept_quality_v2")
    public List<String> mAcceptQualityV2;
    @JSONField(name = "area")
    public String mArea;
    @JSONField(name = "area_id")
    public int mAreaId;
    @JSONField(name = "area_v2_id")
    public int mAreaIdV2;
    @JSONField(name = "area_v2_name")
    public String mAreaNameV2;
    @JSONField(name = "broadcast_type")
    public int mBroadcasetType;
    @JSONField(name = "corner")
    public String mCorner;
    @JSONField(name = "cover")
    public BiliImage mCover;
    @JSONField(name = "current_quality")
    public int mCurrentQuality;
    @JSONField(name = "data_behavior_id")
    public String mDataBehaviorId;
    @JSONField(name = "data_source_id")
    public String mDataSourceId;
    public boolean mHasReportShowEvent;
    @JSONField(name = "is_clip")
    public int mIsClip;
    public boolean mIsRound;
    @JSONField(name = "is_tv")
    public int mIsTv;
    @JSONField(name = "new_cover")
    public BiliImage mNewCover;
    @JSONField(name = "new_router")
    public String mNewRouter;
    @JSONField(name = "new_title")
    public String mNewTitle;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "owner")
    public BiliUser mOwner;
    @JSONField(name = "area_v2_parent_id")
    public int mParentAreaId;
    @JSONField(name = "area_v2_parent_name")
    public String mParentAreaName;
    public long mParsedTime;
    @JSONField(name = "pendent")
    public String mPendent;
    @JSONField(name = "playurl")
    public String mPlayUrl;
    @JSONField(name = "realurl")
    public String mRealUrl;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "round_status")
    public int mRoundStatus;
    @JSONField(name = "title")
    public String mTitle;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLive$1 */
    static class C19931 implements Creator<BiliLive> {
        C19931() {
        }

        public BiliLive createFromParcel(Parcel parcel) {
            return new BiliLive(parcel);
        }

        public BiliLive[] newArray(int i) {
            return new BiliLive[i];
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

    public String getDisplayAreaName() {
        String str;
        if (TextUtils.isEmpty(this.mAreaNameV2)) {
            str = this.mParentAreaName;
        } else {
            str = this.mAreaNameV2;
        }
        return str;
//        return C7049h.m25225a(str, 5, "");
    }

    public String getDisplayCover() {
        String str = null;
        if (isTypeOfPaintingEntrance()) {
            if (this.mNewCover != null) {
                str = this.mNewCover.mSrc;
            }
            return str;
        }
        if (this.mCover != null) {
            str = this.mCover.mSrc;
        }
        return str;
    }

    public String getDisplayTitle() {
        if (isTypeOfPaintingEntrance()) {
            return this.mNewTitle;
        }
        return this.mTitle;
    }

    public boolean isTypeOfPaintingEntrance() {
        return this.mIsClip == 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLive{roomId=");
        stringBuilder.append(this.mRoomId);
        stringBuilder.append(", title='");
        stringBuilder.append(this.mTitle);
        stringBuilder.append('\'');
        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public BiliLive() {
        this.mCover = BiliImage.NULL;
        this.mNewCover = BiliImage.NULL;
        this.mParsedTime = System.currentTimeMillis();
    }

    public String getReportMessage(int i) {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.mParentAreaId);
        stringBuilder.append(";");
        stringBuilder.append(this.mAreaIdV2);
        stringBuilder.append(";");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeLong(this.mOnline);
        parcel.writeParcelable(this.mCover, i);
        parcel.writeParcelable(this.mOwner, i);
        parcel.writeInt(this.mRoomId);
        parcel.writeString(this.mPlayUrl);
        parcel.writeString(this.mRealUrl);
        parcel.writeLong(this.mParsedTime);
        parcel.writeString(this.mArea);
        parcel.writeInt(this.mAreaId);
        parcel.writeInt(this.mAreaIdV2);
        parcel.writeString(this.mAreaNameV2);
        parcel.writeInt(this.mParentAreaId);
        parcel.writeString(this.mParentAreaName);
        parcel.writeInt(this.mIsTv);
        parcel.writeString(this.mCorner);
        parcel.writeString(this.mPendent);
        parcel.writeByte((byte) (this.mIsRound?1:0));
        parcel.writeInt(this.mIsClip);
        parcel.writeInt(this.mRoundStatus);
        parcel.writeByte((byte) (this.mHasReportShowEvent?1:0));
        parcel.writeParcelable(this.mNewCover, i);
        parcel.writeString(this.mNewTitle);
        parcel.writeString(this.mNewRouter);
        parcel.writeString(this.mDataBehaviorId);
        parcel.writeString(this.mDataSourceId);
        parcel.writeInt(this.mCurrentQuality);
        parcel.writeStringList(this.mAcceptQualityV2);
        parcel.writeInt(this.mBroadcasetType);
    }

    protected BiliLive(Parcel parcel) {
        this.mCover = BiliImage.NULL;
        this.mNewCover = BiliImage.NULL;
        this.mTitle = parcel.readString();
        this.mOnline = parcel.readLong();
        this.mCover = (BiliImage) parcel.readParcelable(BiliImage.class.getClassLoader());
        this.mOwner = (BiliUser) parcel.readParcelable(BiliUser.class.getClassLoader());
        this.mRoomId = parcel.readInt();
        this.mPlayUrl = parcel.readString();
        this.mRealUrl = parcel.readString();
        this.mParsedTime = parcel.readLong();
        this.mArea = parcel.readString();
        this.mAreaId = parcel.readInt();
        this.mAreaIdV2 = parcel.readInt();
        this.mAreaNameV2 = parcel.readString();
        this.mParentAreaId = parcel.readInt();
        this.mParentAreaName = parcel.readString();
        this.mIsTv = parcel.readInt();
        this.mCorner = parcel.readString();
        this.mPendent = parcel.readString();
        boolean z = false;
        this.mIsRound = parcel.readByte() != (byte) 0;
        this.mIsClip = parcel.readInt();
        this.mRoundStatus = parcel.readInt();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.mHasReportShowEvent = z;
        this.mNewCover = (BiliImage) parcel.readParcelable(BiliImage.class.getClassLoader());
        this.mNewTitle = parcel.readString();
        this.mNewRouter = parcel.readString();
        this.mDataBehaviorId = parcel.readString();
        this.mDataSourceId = parcel.readString();
        this.mCurrentQuality = parcel.readInt();
        this.mAcceptQualityV2 = parcel.createStringArrayList();
        this.mBroadcasetType = parcel.readInt();
    }
}
