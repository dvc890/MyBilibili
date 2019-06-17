package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class BaseLiveArea implements Parcelable {
    public static final Creator<BaseLiveArea> CREATOR = new C19281();
    @JSONField(name = "id")
    /* renamed from: a */
    public int id;
    @JSONField(name = "name")
    /* renamed from: b */
    public String name;
    @JSONField(name = "parent_name")
    /* renamed from: c */
    public String parent_name;

    public BaseLiveArea() {
    }

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
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.parent_name = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.parent_name);
    }
}
