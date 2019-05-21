package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class DislikeReason implements Parcelable {
    public static final Creator<DislikeReason> CREATOR = new C22691();
    @JSONField(name = "id")
    /* renamed from: id */
    public int id;
    @JSONField(name = "name")
    public String name;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.modelv2.DislikeReason$1 */
    static class C22691 implements Creator<DislikeReason> {
        C22691() {
        }

        /* renamed from: a */
        public DislikeReason createFromParcel(Parcel parcel) {
            return new DislikeReason(parcel);
        }

        /* renamed from: a */
        public DislikeReason[] newArray(int i) {
            return new DislikeReason[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
    public DislikeReason() {
        super();
    }

    public DislikeReason(int i, String str) {
        super();
        this.id = i;
        this.name = str;
    }

    protected DislikeReason(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
    }
}
