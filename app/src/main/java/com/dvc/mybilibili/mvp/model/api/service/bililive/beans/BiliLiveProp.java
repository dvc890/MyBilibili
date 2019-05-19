package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveProp extends BiliLiveBaseGift {
    public static final Creator<BiliLiveProp> CREATOR = new C29911();
    public static final String GOLD = "gold";
    public static final String SILVER = "silver";
    @JSONField(name = "coin_type")
    public CoinType mCoinType;
    @JSONField(name = "combo_num")
    public int mComboNum;
    @JSONField(name = "count_set")
    public String mCountSet;
    public int mDiscountBeforePrice;
    public int mDraw;
    @JSONField(name = "type")
    public int mGiftType;
    @JSONField(name = "price")
    public long mPrice;
    @JSONField(name = "super_num")
    public int mSuperNum;
    public String mType;

    public BiliLiveProp() {
        super();
    }

    @Keep
    /* compiled from: BL */
    public static class CoinType implements Parcelable {
        public static final Creator<CoinType> CREATOR = new C20161();
        @JSONField(name = "gold")
        public String mGold;
        @JSONField(name = "silver")
        public String mSilver;

        public CoinType() {

        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveProp$CoinType$1 */
        static class C20161 implements Creator<CoinType> {
            C20161() {
            }

            public CoinType createFromParcel(Parcel parcel) {
                return new CoinType(parcel);
            }

            public CoinType[] newArray(int i) {
                return new CoinType[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public CoinType cloneObj() {
            CoinType coinType = new CoinType();
            coinType.mGold = this.mGold;
            coinType.mSilver = this.mSilver;
            return coinType;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mGold);
            parcel.writeString(this.mSilver);
        }

        protected CoinType(Parcel parcel) {
            this.mGold = parcel.readString();
            this.mSilver = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveProp$1 */
    static class C29911 implements Creator<BiliLiveProp> {
        C29911() {
        }

        public BiliLiveProp createFromParcel(Parcel parcel) {
            return new BiliLiveProp(parcel);
        }

        public BiliLiveProp[] newArray(int i) {
            return new BiliLiveProp[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isSupportGold() {
        return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mGold)) ? false : true;
    }

    public boolean isSupportSilver() {
        return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mSilver)) ? false : true;
    }

    public boolean isGoldType() {
        return "gold".equals(this.mType);
    }

    public boolean isSilverType() {
        return "silver".equals(this.mType);
    }

    public boolean isBKeLa() {
        return this.mId == 3;
    }

    public static int getReportSeedType(String str) {
        return TextUtils.equals(str, "gold") ? 1 : 2;
    }

    public boolean isSpecialGift() {
        return this.mDraw == 2;
    }

    public BiliLiveProp cloneObj() {
        BiliLiveProp biliLiveProp = new BiliLiveProp();
        biliLiveProp.mId = this.mId;
        biliLiveProp.mName = this.mName;
        biliLiveProp.mPrice = this.mPrice;
        biliLiveProp.mThumb = this.mThumb;
        biliLiveProp.mGifUrl = this.mGifUrl;
        biliLiveProp.mCoinType = this.mCoinType == null ? null : this.mCoinType.cloneObj();
        biliLiveProp.mCountSet = this.mCountSet;
        biliLiveProp.mCountMapObject = this.mCountMapObject;
        return biliLiveProp;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.mPrice);
        parcel.writeParcelable(this.mCoinType, i);
        parcel.writeString(this.mCountSet);
        parcel.writeString(this.mType);
    }

    protected BiliLiveProp(Parcel parcel) {
        super(parcel);
        this.mPrice = parcel.readLong();
        this.mCoinType = (CoinType) parcel.readParcelable(CoinType.class.getClassLoader());
        this.mCountSet = parcel.readString();
        this.mType = parcel.readString();
    }
}
