package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

////

@Keep
/* compiled from: BL */
public class BiliLiveReceiveGift implements Parcelable {
    public static final Creator<BiliLiveReceiveGift> CREATOR = new C20181();
    @JSONField(name = "bag_name")
    public String mBagName;
    @JSONField(name = "bag_source")
    public String mBagSource;
    @JSONField(name = "taskimg")
    public String mCover;
    @JSONField(name = "giftTypeName")
    public String mDesc;
    @JSONField(name = "gift_list")
    public List<Gift> mGifts;

    @Keep
    /* compiled from: BL */
    public static class Gift implements Parcelable {
        public static final Creator<Gift> CREATOR = new C20171();
        @JSONField(name = "img")
        public String mCover;
        @JSONField(name = "expireat")
        public String mExpireTime;
        @JSONField(name = "gift_id")
        public int mId;
        @JSONField(name = "gift_num")
        public int mNum;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveReceiveGift$Gift$1 */
        static class C20171 implements Creator<Gift> {
            C20171() {
            }

            public Gift createFromParcel(Parcel parcel) {
                return new Gift(parcel);
            }

            public Gift[] newArray(int i) {
                return new Gift[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Gift{mId=");
            stringBuilder.append(this.mId);
            stringBuilder.append(", mNum=");
            stringBuilder.append(this.mNum);
            stringBuilder.append(", mExpireTime='");
            stringBuilder.append(this.mExpireTime);
            stringBuilder.append('\'');
            stringBuilder.append(", mCover='");
            stringBuilder.append(this.mCover);
            stringBuilder.append('\'');
            ////stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mId);
            parcel.writeInt(this.mNum);
            parcel.writeString(this.mExpireTime);
            parcel.writeString(this.mCover);
        }

        protected Gift(Parcel parcel) {
            this.mId = parcel.readInt();
            this.mNum = parcel.readInt();
            this.mExpireTime = parcel.readString();
            this.mCover = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveReceiveGift$1 */
    static class C20181 implements Creator<BiliLiveReceiveGift> {
        C20181() {
        }

        public BiliLiveReceiveGift createFromParcel(Parcel parcel) {
            return new BiliLiveReceiveGift(parcel);
        }

        public BiliLiveReceiveGift[] newArray(int i) {
            return new BiliLiveReceiveGift[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveReceiveGift{mDesc='");
        stringBuilder.append(this.mDesc);
        stringBuilder.append('\'');
        stringBuilder.append(", mCover='");
        stringBuilder.append(this.mCover);
        stringBuilder.append('\'');
        stringBuilder.append(", mGifts='");
        stringBuilder.append(this.mGifts);
        stringBuilder.append('\'');
        stringBuilder.append(", mBagName='");
        stringBuilder.append(this.mBagName);
        stringBuilder.append('\'');
        stringBuilder.append(", mBagSource=");
        stringBuilder.append(this.mBagSource);
        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDesc);
        parcel.writeString(this.mCover);
        parcel.writeTypedList(this.mGifts);
        parcel.writeString(this.mBagName);
        parcel.writeString(this.mBagSource);
    }

    protected BiliLiveReceiveGift(Parcel parcel) {
        this.mDesc = parcel.readString();
        this.mCover = parcel.readString();
        this.mGifts = parcel.createTypedArrayList(Gift.CREATOR);
        this.mBagName = parcel.readString();
        this.mBagSource = parcel.readString();
    }
}
