package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class BaseLiveArea implements Parcelable {
    public static final Creator<BaseLiveArea> CREATOR = new C19281();
    @JSONField(name = "id")
    /* renamed from: a */
    public int f5796a;
    @JSONField(name = "name")
    /* renamed from: b */
    public String f5797b;
    @JSONField(name = "parent_name")
    /* renamed from: c */
    public String f5798c;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.BaseLiveArea$1 */
    static class C19281 implements Creator<BaseLiveArea> {
        C19281() {
        }

        /* renamed from: a */
        public BaseLiveArea createFromParcel(Parcel parcel) {
            return new BaseLiveArea(parcel);
        }

        /* renamed from: a */
        public BaseLiveArea[] newArray(int i) {
            return new BaseLiveArea[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BaseLiveArea(Parcel parcel) {
        this.f5796a = parcel.readInt();
        this.f5797b = parcel.readString();
        this.f5798c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5796a);
        parcel.writeString(this.f5797b);
        parcel.writeString(this.f5798c);
    }
}
