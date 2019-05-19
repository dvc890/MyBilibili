package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliBangumiTag implements Parcelable {
    public static final Creator<BiliBangumiTag> CREATOR = new C18431();
    @JSONField(name = "cover")
    public String mCover;
    @JSONField(name = "tag_id")
    public String mId;
    @JSONField(name = "index")
    public int mIndex;
    @JSONField(name = "tag_name")
    public String mName;
    @JSONField(name = "type")
    public String mType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BiliBangumiTag$1 */
    static class C18431 implements Creator<BiliBangumiTag> {
        C18431() {
        }

        /* renamed from: a */
        public BiliBangumiTag createFromParcel(Parcel parcel) {
            return new BiliBangumiTag(parcel);
        }

        /* renamed from: a */
        public BiliBangumiTag[] newArray(int i) {
            return new BiliBangumiTag[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag:{");
        stringBuilder.append(this.mId);
        stringBuilder.append(":");
        stringBuilder.append(this.mName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCover);
        parcel.writeString(this.mName);
        parcel.writeString(this.mId);
        parcel.writeString(this.mType);
        parcel.writeInt(this.mIndex);
    }

    protected BiliBangumiTag(Parcel parcel) {
        this.mCover = parcel.readString();
        this.mName = parcel.readString();
        this.mId = parcel.readString();
        this.mType = parcel.readString();
        this.mIndex = parcel.readInt();
    }
}
