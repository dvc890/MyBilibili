package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Deprecated
/* compiled from: BL */
public class BiliLevelInfo implements Parcelable {
    public static final Creator<BiliLevelInfo> CREATOR = new C21991();
    @JSONField(name = "current_level")
    /* renamed from: a */
    public int current_level;
    @JSONField(name = "current_min")
    /* renamed from: b */
    public int current_min;
    @JSONField(name = "current_exp")
    /* renamed from: c */
    public int current_exp;
    @JSONField(name = "next_exp")
    /* renamed from: d */
    public String next_exp;

    public BiliLevelInfo() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.BiliLevelInfo$1 */
    static class C21991 implements Creator<BiliLevelInfo> {
        C21991() {
        }

        /* renamed from: a */
        public BiliLevelInfo createFromParcel(Parcel parcel) {
            return new BiliLevelInfo(parcel);
        }

        /* renamed from: a */
        public BiliLevelInfo[] newArray(int i) {
            return new BiliLevelInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.current_level);
        parcel.writeInt(this.current_min);
        parcel.writeInt(this.current_exp);
        parcel.writeString(this.next_exp);
    }

    protected BiliLevelInfo(Parcel parcel) {
        this.current_level = parcel.readInt();
        this.current_min = parcel.readInt();
        this.current_exp = parcel.readInt();
        this.next_exp = parcel.readString();
    }

    /* renamed from: a */
    public String mo11427a() {
        if (TextUtils.isEmpty(this.next_exp)) {
            return "-";
        }
        return this.next_exp;
    }
}
