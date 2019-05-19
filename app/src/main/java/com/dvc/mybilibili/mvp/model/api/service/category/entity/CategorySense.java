package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.category.CategorySense */
public class CategorySense implements Parcelable {
    public static final Creator<CategorySense> CREATOR = new C24191();
    @JSONField(name = "scenes_name")
    public String mSensesName;
    @JSONField(name = "senses_type")
    public String mSensesType;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.category.CategorySense$1 */
    static class C24191 implements Creator<CategorySense> {
        C24191() {
        }

        /* renamed from: a */
        public CategorySense createFromParcel(Parcel parcel) {
            return new CategorySense(parcel);
        }

        /* renamed from: a */
        public CategorySense[] newArray(int i) {
            return new CategorySense[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected CategorySense(Parcel parcel) {
        this.mSensesName = parcel.readString();
        this.mSensesType = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSensesName);
        parcel.writeString(this.mSensesType);
    }
}
