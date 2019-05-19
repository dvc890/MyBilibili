package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class Tag implements Parcelable {
    public static final Creator<Tag> CREATOR = new C22611();
    @JSONField(name = "atten")
    public int attenNumber;
    @JSONField(name = "is_atten")
    public int attention;
    @JSONField(name = "tag_id")
    public int tagId;
    @JSONField(name = "tag_name")
    public String tagName;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.Tag$1 */
    static class C22611 implements Creator<Tag> {
        C22611() {
        }

        /* renamed from: a */
        public Tag createFromParcel(Parcel parcel) {
            return new Tag(parcel);
        }

        /* renamed from: a */
        public Tag[] newArray(int i) {
            return new Tag[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Tag(int i, String str) {
        this.tagId = i;
        this.tagName = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.tagId != ((Tag) obj).tagId) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.tagId;
    }

    private Tag(Parcel parcel) {
        this.tagId = parcel.readInt();
        this.tagName = parcel.readString();
        this.attention = parcel.readInt();
        this.attenNumber = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tagId);
        parcel.writeString(this.tagName);
        parcel.writeInt(this.attention);
        parcel.writeInt(this.attenNumber);
    }
}
