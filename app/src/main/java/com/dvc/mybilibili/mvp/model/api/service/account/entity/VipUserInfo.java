package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class VipUserInfo implements Parcelable {
    public static final Creator<VipUserInfo> CREATOR = new C22041();
    public static final int VIP_STATUS_BANNED = 3;
    public static final int VIP_STATUS_FREEZE = 2;
    public static final int VIP_STATUS_OUT_OF_DATE = 0;
    public static final int VIP_STATUS_WITHIN_DATE = 1;
    public static final int VIP_THEME_TYPE_FOOL_DAY = 1;
    public static final int VIP_THEME_TYPE_NOMAL = 0;
    public static final int VIP_TYPE_VIP_FALSE = 0;
    public static final int VIP_TYPE_VIP_TRUE = 1;
    public static final int VIP_TYPE_VIP_TRUE_YEAR = 2;
    private long endTime;
    private int themeType;
    private int vipStatus;
    private int vipType;

    public VipUserInfo() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.VipUserInfo$1 */
    static class C22041 implements Creator<VipUserInfo> {
        C22041() {
        }

        /* renamed from: a */
        public VipUserInfo createFromParcel(Parcel parcel) {
            return new VipUserInfo(parcel);
        }

        /* renamed from: a */
        public VipUserInfo[] newArray(int i) {
            return new VipUserInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @JSONField(name = "type")
    public int getVipType() {
        return this.vipType;
    }

    @JSONField(name = "type")
    public void setVipType(int i) {
        this.vipType = i;
    }

    @JSONField(name = "status")
    public int getVipStatus() {
        return this.vipStatus;
    }

    @JSONField(name = "status")
    public void setVipStatus(int i) {
        this.vipStatus = i;
    }

    @JSONField(name = "due_date")
    public long getEndTime() {
        return this.endTime;
    }

    @JSONField(name = "due_date")
    public void setEndTime(long j) {
        this.endTime = j;
    }

    @JSONField(name = "theme_type")
    public int getThemeType() {
        return this.themeType;
    }

    @JSONField(name = "theme_type")
    public void setThemeType(int i) {
        this.themeType = i;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isEffectiveVip() {
        return (this.vipType == 1 || this.vipType == 2) && this.vipStatus == 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isEffectiveYearVip() {
        return this.vipType == 2 && this.vipStatus == 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isOutdated() {
        return (this.vipType == 1 || this.vipType == 2) && this.vipStatus == 0;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isFrozen() {
        return (this.vipType == 1 || this.vipType == 2) && this.vipStatus == 2;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isLittleVip() {
        return isEffectiveVip() && this.themeType == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.vipType);
        parcel.writeInt(this.vipStatus);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.themeType);
    }

    protected VipUserInfo(Parcel parcel) {
        this.vipType = parcel.readInt();
        this.vipStatus = parcel.readInt();
        this.endTime = parcel.readLong();
        this.themeType = parcel.readInt();
    }
}
