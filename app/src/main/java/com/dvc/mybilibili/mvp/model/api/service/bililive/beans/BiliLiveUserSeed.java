package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

////

@Keep
/* compiled from: BL */
public class BiliLiveUserSeed {
    @JSONField(name = "gold")
    public long mGold;
    @JSONField(name = "isSign")
    public int mIsSign;
    @JSONField(name = "user_level_color")
    public int mLevelColor;
    @JSONField(name = "medal")
    public Medal mMedal;
    @JSONField(name = "vip")
    public int mMonthVip;
    @JSONField(name = "vip_time")
    public Date mMonthVipTime;
    @JSONField(name = "room_id")
    public int mRoomId;
    @JSONField(name = "silver")
    public long mSilver;
    @JSONField(name = "wearTitle")
    public Title mTitle;
    @JSONField(name = "use_count")
    public int mUnEditCount;
    @JSONField(name = "user_level")
    public int mUserLevel;
    @JSONField(name = "vip_view_status")
    public int mVipMsgViewStatus;
    @JSONField(name = "svip")
    public int mYearVip;
    @JSONField(name = "svip_time")
    public Date mYearVipTime;

    @Keep
    /* compiled from: BL */
    public static class Medal implements Parcelable {
        public static final Creator<Medal> CREATOR = new C20491();
        @JSONField(name = "color")
        public int mColor;
        @JSONField(name = "level")
        public int mLevel;
        @JSONField(name = "medal_name")
        public String mMedalName;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveUserSeed$Medal$1 */
        static class C20491 implements Creator<Medal> {
            C20491() {
            }

            public Medal createFromParcel(Parcel parcel) {
                return new Medal(parcel);
            }

            public Medal[] newArray(int i) {
                return new Medal[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public Medal(String str, int i, int i2) {
            this.mMedalName = str;
            this.mLevel = i;
            this.mColor = i2;
        }

        protected Medal(Parcel parcel) {
            this.mMedalName = parcel.readString();
            this.mLevel = parcel.readInt();
            this.mColor = parcel.readInt();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{color=");
            stringBuilder.append(this.mColor);
            stringBuilder.append(", name='");
            stringBuilder.append(this.mMedalName);
            stringBuilder.append('\'');
            stringBuilder.append(", level=");
            stringBuilder.append(this.mLevel);
            ////stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMedalName);
            parcel.writeInt(this.mLevel);
            parcel.writeInt(this.mColor);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Title {
        @JSONField(name = "activity")
        public String mActivity;
        @JSONField(name = "title")
        public String mTitleId;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{title='");
            stringBuilder.append(this.mTitleId);
            stringBuilder.append("', activity='");
            stringBuilder.append(this.mActivity);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }
    }

    public boolean isVip() {
        return this.mMonthVip == 1 || this.mYearVip == 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveSeed{mGold=");
        stringBuilder.append(this.mGold);
        stringBuilder.append(", mSilver=");
        stringBuilder.append(this.mSilver);
        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
