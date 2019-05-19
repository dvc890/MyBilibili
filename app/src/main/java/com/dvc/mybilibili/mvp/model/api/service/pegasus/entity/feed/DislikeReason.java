package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.DislikeReason */
public class DislikeReason implements Parcelable {
    public static final Creator<DislikeReason> CREATOR = new C17801();
    @JSONField(name = "id")
    /* renamed from: id */
    public int f5585id;
    @JSONField(name = "name")
    public String name;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.DislikeReason$1 */
    static class C17801 implements Creator<DislikeReason> {
        C17801() {
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
        parcel.writeInt(this.f5585id);
        parcel.writeString(this.name);
    }

    public DislikeReason(int i, String str) {
        this.f5585id = i;
        this.name = str;
    }

    protected DislikeReason(Parcel parcel) {
        this.f5585id = parcel.readInt();
        this.name = parcel.readString();
    }
}
