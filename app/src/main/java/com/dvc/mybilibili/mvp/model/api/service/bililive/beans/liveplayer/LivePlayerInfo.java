package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.liveplayer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class LivePlayerInfo implements Parcelable {
    public static final Creator<LivePlayerInfo> CREATOR = new C19881();
    @Nullable
    @JSONField(name = "accept_quality")
    public ArrayList<String> mAcceptQualityList;
    @JSONField(name = "current_quality")
    public int mCurrentQuality;
    @Nullable
    @JSONField(name = "durl")
    public ArrayList<DurlInfo> mDurlList;

    @Keep
    /* compiled from: BL */
    public static class DurlInfo implements Parcelable {
        public static final Creator<DurlInfo> CREATOR = new C19871();
        @JSONField(name = "length")
        public int mLength;
        @JSONField(name = "order")
        public int mOrder;
        @Nullable
        @JSONField(name = "url")
        public String mPlayUrl;

        public DurlInfo() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.blps.liveplayer.apis.beans.LivePlayerInfo$DurlInfo$1 */
        static class C19871 implements Creator<DurlInfo> {
            C19871() {
            }

            /* renamed from: a */
            public DurlInfo createFromParcel(Parcel parcel) {
                return new DurlInfo(parcel);
            }

            /* renamed from: a */
            public DurlInfo[] newArray(int i) {
                return new DurlInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mOrder);
            parcel.writeInt(this.mLength);
            parcel.writeString(this.mPlayUrl);
        }

        protected DurlInfo(Parcel parcel) {
            this.mOrder = parcel.readInt();
            this.mLength = parcel.readInt();
            this.mPlayUrl = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.blps.liveplayer.apis.beans.LivePlayerInfo$1 */
    static class C19881 implements Creator<LivePlayerInfo> {
        C19881() {
        }

        /* renamed from: a */
        public LivePlayerInfo createFromParcel(Parcel parcel) {
            return new LivePlayerInfo(parcel);
        }

        /* renamed from: a */
        public LivePlayerInfo[] newArray(int i) {
            return new LivePlayerInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mDurlList);
        parcel.writeStringList(this.mAcceptQualityList);
        parcel.writeInt(this.mCurrentQuality);
    }

    protected LivePlayerInfo(Parcel parcel) {
        this.mDurlList = parcel.createTypedArrayList(DurlInfo.CREATOR);
        this.mAcceptQualityList = parcel.createStringArrayList();
        this.mCurrentQuality = parcel.readInt();
    }
}
