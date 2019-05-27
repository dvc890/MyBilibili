package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveBeatsResult implements Parcelable {
    public static final Creator<BiliLiveBeatsResult> CREATOR = new C20031();
    @JSONField(name = "cmd")
    public String mSpecialTips;
    @JSONField(name = "tips")
    public Tips mTips;

    public BiliLiveBeatsResult() {
    }

    @Keep
    /* compiled from: BL */
    public static class Tips implements Parcelable {
        public static final Creator<Tips> CREATOR = new C20021();
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "gift_id")
        public int mGiftId;
        @JSONField(name = "gift_img")
        public String mGiftImg;
        @JSONField(name = "gift_name")
        public String mGiftName;
        @JSONField(name = "gift_num")
        public int mGiftNumber;
        @JSONField(name = "mobile_content")
        public String mMobileContent;
        @JSONField(name = "title")
        public String mTitle;

        public Tips() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveBeatsResult$Tips$1 */
        static class C20021 implements Creator<Tips> {
            C20021() {
            }

            public Tips createFromParcel(Parcel parcel) {
                return new Tips(parcel);
            }

            public Tips[] newArray(int i) {
                return new Tips[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mGiftId);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mContent);
            parcel.writeString(this.mMobileContent);
            parcel.writeString(this.mGiftImg);
            parcel.writeInt(this.mGiftNumber);
            parcel.writeString(this.mGiftName);
        }

        protected Tips(Parcel parcel) {
            this.mGiftId = parcel.readInt();
            this.mTitle = parcel.readString();
            this.mContent = parcel.readString();
            this.mMobileContent = parcel.readString();
            this.mGiftImg = parcel.readString();
            this.mGiftNumber = parcel.readInt();
            this.mGiftName = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveBeatsResult$1 */
    static class C20031 implements Creator<BiliLiveBeatsResult> {
        C20031() {
        }

        public BiliLiveBeatsResult createFromParcel(Parcel parcel) {
            return new BiliLiveBeatsResult(parcel);
        }

        public BiliLiveBeatsResult[] newArray(int i) {
            return new BiliLiveBeatsResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSpecialTips);
        parcel.writeParcelable(this.mTips, i);
    }

    protected BiliLiveBeatsResult(Parcel parcel) {
        this.mSpecialTips = parcel.readString();
        this.mTips = (Tips) parcel.readParcelable(Tips.class.getClassLoader());
    }
}
