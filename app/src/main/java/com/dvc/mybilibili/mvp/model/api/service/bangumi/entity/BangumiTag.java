package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiTag implements Parcelable {
    public static final Creator<BangumiTag> CREATOR = new C18311();
    public String cover;
    @JSONField(name = "tag_id")
    /* renamed from: id */
    public String f5645id;
    public int index;
    @JSONField(name = "tag_name")
    public String name;
    public String type;

    public BangumiTag() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiTag$1 */
    static class C18311 implements Creator<BangumiTag> {
        C18311() {
        }

        /* renamed from: a */
        public BangumiTag createFromParcel(Parcel parcel) {
            return new BangumiTag(parcel);
        }

        /* renamed from: a */
        public BangumiTag[] newArray(int i) {
            return new BangumiTag[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag:{");
        stringBuilder.append(this.f5645id);
        stringBuilder.append(":");
        stringBuilder.append(this.name);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cover);
        parcel.writeString(this.name);
        parcel.writeString(this.f5645id);
        parcel.writeString(this.type);
        parcel.writeInt(this.index);
    }

    protected BangumiTag(Parcel parcel) {
        this.cover = parcel.readString();
        this.name = parcel.readString();
        this.f5645id = parcel.readString();
        this.type = parcel.readString();
        this.index = parcel.readInt();
    }
}
