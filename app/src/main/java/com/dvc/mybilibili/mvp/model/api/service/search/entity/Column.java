package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class Column implements Parcelable {
    public static final Creator<Column> CREATOR = new C22741();
    @Nullable
    public String desc;
    /* renamed from: id */
    public long f6353id;
    @Nullable
    @JSONField(name = "image_urls")
    public List<String> imageUrls;
    @Nullable
    @JSONField(name = "goto")
    public String jump;
    public long like;
    public long mid;
    @Nullable
    public String name;
    @Nullable
    public String param;
    public long reply;
    @JSONField(name = "template_id")
    public int templateId;
    @Nullable
    public String title;
    @Nullable
    public String uri;
    public long view;

    public Column() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.search.api.Column$1 */
    static class C22741 implements Creator<Column> {
        C22741() {
        }

        /* renamed from: a */
        public Column createFromParcel(Parcel parcel) {
            return new Column(parcel);
        }

        /* renamed from: a */
        public Column[] newArray(int i) {
            return new Column[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6353id);
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeInt(this.templateId);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        parcel.writeStringList(this.imageUrls);
        parcel.writeLong(this.view);
        parcel.writeLong(this.like);
        parcel.writeLong(this.reply);
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeString(this.jump);
    }

    protected Column(Parcel parcel) {
        this.f6353id = parcel.readLong();
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.templateId = parcel.readInt();
        this.title = parcel.readString();
        this.desc = parcel.readString();
        this.imageUrls = parcel.createStringArrayList();
        this.view = parcel.readLong();
        this.like = parcel.readLong();
        this.reply = parcel.readLong();
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.jump = parcel.readString();
    }
}
