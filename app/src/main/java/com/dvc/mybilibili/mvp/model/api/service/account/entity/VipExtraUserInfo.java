package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
@Deprecated
/* compiled from: BL */
public class VipExtraUserInfo implements Parcelable {
    public static final Creator<VipExtraUserInfo> CREATOR = new C22031();
    @JSONField(name = "vipDueDate")
    public long endTime;
    @JSONField(name = "themeType")
    public int themeType;
    @JSONField(name = "vipStatus")
    public int vipStatus;
    @JSONField(name = "vipType")
    public int vipType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.VipExtraUserInfo$1 */
    static class C22031 implements Creator<VipExtraUserInfo> {
        C22031() {
        }

        /* renamed from: a */
        public VipExtraUserInfo createFromParcel(Parcel parcel) {
            return new VipExtraUserInfo(parcel);
        }

        /* renamed from: a */
        public VipExtraUserInfo[] newArray(int i) {
            return new VipExtraUserInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isEffectiveVip() {
        return (this.vipType == 1 || this.vipType == 2) && this.vipStatus == 1;
    }

    public boolean isEffectiveYearVip() {
        return this.vipType == 2 && this.vipStatus == 1;
    }

    public boolean isEffectiveMonthVip() {
        return this.vipType == 1 && this.vipStatus == 1;
    }

    public boolean isLittleVip() {
        return isEffectiveVip() && this.themeType == 1;
    }

    public boolean isFrozenVip() {
        return (this.vipType == 1 || this.vipType == 2) && this.vipStatus == 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.vipType);
        parcel.writeInt(this.vipStatus);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.themeType);
    }

    protected VipExtraUserInfo(Parcel parcel) {
        this.vipType = parcel.readInt();
        this.vipStatus = parcel.readInt();
        this.endTime = parcel.readLong();
        this.themeType = parcel.readInt();
    }
}
