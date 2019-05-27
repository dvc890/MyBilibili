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
    public int f6226a;
    @JSONField(name = "current_min")
    /* renamed from: b */
    public int f6227b;
    @JSONField(name = "current_exp")
    /* renamed from: c */
    public int f6228c;
    @JSONField(name = "next_exp")
    /* renamed from: d */
    public String f6229d;

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
        parcel.writeInt(this.f6226a);
        parcel.writeInt(this.f6227b);
        parcel.writeInt(this.f6228c);
        parcel.writeString(this.f6229d);
    }

    protected BiliLevelInfo(Parcel parcel) {
        this.f6226a = parcel.readInt();
        this.f6227b = parcel.readInt();
        this.f6228c = parcel.readInt();
        this.f6229d = parcel.readString();
    }

    /* renamed from: a */
    public String mo11427a() {
        if (TextUtils.isEmpty(this.f6229d)) {
            return "-";
        }
        return this.f6229d;
    }
}
