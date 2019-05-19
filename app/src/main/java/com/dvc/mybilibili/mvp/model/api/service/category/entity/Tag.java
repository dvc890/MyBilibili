package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class Tag implements Parcelable {
    public static final Creator<Tag> CREATOR = new C22721();
    public static final int INVALID_ID = Integer.MAX_VALUE;
    @JSONField(name = "atten")
    public int attenNumber;
    @JSONField(name = "is_atten")
    public int attention;
    @JSONField(name = "tag_id")
    public int tagId;
    @JSONField(name = "tag_name")
    public String tagName;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.category.api.Tag$1 */
    static class C22721 implements Creator<Tag> {
        C22721() {
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

    @Keep
    /* compiled from: BL */
    public static class TagMeta {
        public int rid;
        public List<Tag> tags;
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

    public boolean isFollowed() {
        return this.attention == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tagId);
        parcel.writeString(this.tagName);
        parcel.writeInt(this.attention);
        parcel.writeInt(this.attenNumber);
    }
}
