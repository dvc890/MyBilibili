package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.text.NumberFormat;

@Keep
/* compiled from: BL */
public class ChargeElec implements Parcelable {
    public static final Creator<ChargeElec> CREATOR = new C21761();
    @JSONField(name = "round_mode")
    public int mExpRoundMode;
    @Nullable
    @JSONField(name = "elec_icon")
    public String mIcon;
    @JSONField(name = "integrity_rate")
    public int mIntegrityRate;
    @JSONField(name = "is_customize")
    public boolean mIsCustomize;
    @JSONField(name = "max_elec")
    public int mMaxNums;
    @JSONField(name = "min_elec")
    public int mMinNums;
    @JSONField(name = "elec_num")
    public int mNums;
    @JSONField(name = "rmb_rate")
    public float mRmbRate;
    @Nullable
    @JSONField(name = "title")
    public String mTitle;

    public ChargeElec() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.comm.charge.api.ChargeElec$1 */
    static class C21761 implements Creator<ChargeElec> {
        C21761() {
        }

        /* renamed from: a */
        public ChargeElec createFromParcel(Parcel parcel) {
            return new ChargeElec(parcel);
        }

        /* renamed from: a */
        public ChargeElec[] newArray(int i) {
            return new ChargeElec[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getExP() {
        if (this.mIntegrityRate == 0) {
            return "0";
        }
        float f = ((float) this.mNums) / ((float) this.mIntegrityRate);
        if (this.mExpRoundMode == 1) {
            return String.valueOf((int) Math.ceil((double) f));
        }
        if (this.mExpRoundMode == 2) {
            return String.valueOf(Math.round(f));
        }
        if (this.mExpRoundMode == 3) {
            return String.valueOf(f);
        }
        return String.valueOf((int) Math.floor((double) f));
    }

    public String getRmb() {
        if (this.mRmbRate == 0.0f) {
            return "0";
        }
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMaximumFractionDigits(1);
        return instance.format((double) (((float) this.mNums) / this.mRmbRate));
    }

    public boolean isValid() {
        return this.mIntegrityRate > 0 && this.mRmbRate > 0.0f;
    }

    public ChargeElec(int i) {
        this.mMinNums = i;
        this.mIntegrityRate = 10;
        this.mRmbRate = 10.0f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChargeElec{mTitle='");
        stringBuilder.append(this.mTitle);
        stringBuilder.append('\'');
        stringBuilder.append(", mNums=");
        stringBuilder.append(this.mNums);
        stringBuilder.append(", mIcon=");
        stringBuilder.append(this.mIcon);
        stringBuilder.append(", mMinNums=");
        stringBuilder.append(this.mMinNums);
        stringBuilder.append(", mMaxNums=");
        stringBuilder.append(this.mMaxNums);
        stringBuilder.append(", mIsCustomize=");
        stringBuilder.append(this.mIsCustomize);
        stringBuilder.append(", mRmbRate=");
        stringBuilder.append(this.mRmbRate);
        stringBuilder.append(", mIntegrityRate=");
        stringBuilder.append(this.mIntegrityRate);
        stringBuilder.append(", mExpRoundMode=");
        stringBuilder.append(this.mExpRoundMode);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeInt(this.mNums);
        parcel.writeString(this.mIcon);
        parcel.writeInt(this.mMinNums);
        parcel.writeInt(this.mMaxNums);
        parcel.writeByte((byte) (this.mIsCustomize?1:0));
        parcel.writeFloat(this.mRmbRate);
        parcel.writeInt(this.mIntegrityRate);
        parcel.writeInt(this.mExpRoundMode);
    }

    protected ChargeElec(Parcel parcel) {
        this.mTitle = parcel.readString();
        this.mNums = parcel.readInt();
        this.mIcon = parcel.readString();
        this.mMinNums = parcel.readInt();
        this.mMaxNums = parcel.readInt();
        this.mIsCustomize = parcel.readByte() != (byte) 0;
        this.mRmbRate = parcel.readFloat();
        this.mIntegrityRate = parcel.readInt();
        this.mExpRoundMode = parcel.readInt();
    }
}
