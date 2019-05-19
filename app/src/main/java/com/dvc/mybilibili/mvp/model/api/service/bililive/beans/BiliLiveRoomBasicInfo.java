package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BiliLiveRoomBasicInfo {
    @JSONField(name = "hot_words_status")
    public int hotWordsStatus;
    @JSONField(name = "allow_change_area_time")
    public int mAllowChangeAreaTime;
    @JSONField(name = "allow_upload_cover_time")
    public int mAllowUploadCoverTime;
    @JSONField(name = "area_id")
    public int mAreaId;
    @JSONField(name = "area_name")
    public String mAreaName;
    @JSONField(name = "area_pendent")
    public String mAreaPendent;
    @JSONField(name = "attention")
    public int mAttention;
    @JSONField(name = "background")
    public String mBackground;
    @JSONField(name = "data_behavior_id")
    public String mDataBehaviorId;
    @JSONField(name = "data_source_id")
    public String mDataSourceId;
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "hot_words")
    public ArrayList<String> mHotWords;
    @JSONField(name = "is_anchor")
    public int mIsAnchor;
    @JSONField(name = "is_portrait")
    public boolean mIsPortrait;
    @JSONField(name = "is_strict_room")
    public boolean mIsStrictRoom;
    public int mJumpFrom;
    @JSONField(name = "keyframe")
    public String mKeyFrame;
    @JSONField(name = "live_status")
    public int mLiveStatus;
    @JSONField(name = "live_time")
    public String mLiveTime;
    @Nullable
    @JSONField(name = "new_pendants")
    public NewPendants mNewPendant;
    @JSONField(name = "old_area_id")
    public int mOldAreaId;
    @JSONField(name = "online")
    public int mOnline;
    @JSONField(name = "parent_area_id")
    public int mParentAreaId;
    @JSONField(name = "parent_area_name")
    public String mParentAreaName;
    @JSONField(name = "pk_id")
    public int mPkId;
    @JSONField(name = "pk_status")
    public int mPkStatus;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "room_silent_level")
    public int mRoomSilentLevel;
    @JSONField(name = "room_silent_second")
    public int mRoomSilentSecond;
    @JSONField(name = "room_silent_type")
    public String mRoomSilentType;
    @JSONField(name = "short_id")
    public int mShortId;
    @JSONField(name = "tags")
    public String mTags;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "up_session")
    public String mUpSession;
    @JSONField(name = "user_cover")
    public String mUserCover;
    @JSONField(name = "verify")
    public String mVerify;

    @Keep
    /* compiled from: BL */
    public static class NewPendants implements Parcelable {
        public static final Creator<NewPendants> CREATOR = new C20231();
        @Nullable
        @JSONField(name = "mobile_frame")
        public Pendant mMobileFrame;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomBasicInfo$NewPendants$1 */
        static class C20231 implements Creator<NewPendants> {
            C20231() {
            }

            public NewPendants createFromParcel(Parcel parcel) {
                return new NewPendants(parcel);
            }

            public NewPendants[] newArray(int i) {
                return new NewPendants[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected NewPendants(Parcel parcel) {
            this.mMobileFrame = (Pendant) parcel.readParcelable(Pendant.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.mMobileFrame, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Pendant implements Parcelable {
        public static final Creator<Pendant> CREATOR = new C20241();
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "position")
        public int mPosition;
        @Nullable
        @JSONField(name = "value")
        public String mVaule;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomBasicInfo$Pendant$1 */
        static class C20241 implements Creator<Pendant> {
            C20241() {
            }

            public Pendant createFromParcel(Parcel parcel) {
                return new Pendant(parcel);
            }

            public Pendant[] newArray(int i) {
                return new Pendant[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Pendant(Parcel parcel) {
            this.mName = parcel.readString();
            this.mPosition = parcel.readInt();
            this.mVaule = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeInt(this.mPosition);
            parcel.writeString(this.mVaule);
        }
    }

    public boolean isPkOpen() {
        return this.mPkStatus > 0;
    }
}
