package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiRecommend implements Parcelable {
    public static final Creator<BangumiRecommend> CREATOR = new C18241();
    public String cover;
    public long cursor;
    public String desc;
    /* renamed from: id */
    public int f5641id;
    @JSONField(name = "is_auto")
    public boolean isAuto;
    @JSONField(name = "is_new")
    public boolean isNew;
    public String link;
    public String title;
    public String wid;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiRecommend$1 */
    static class C18241 implements Creator<BangumiRecommend> {
        C18241() {
        }

        /* renamed from: a */
        public BangumiRecommend createFromParcel(Parcel parcel) {
            return new BangumiRecommend(parcel);
        }

        /* renamed from: a */
        public BangumiRecommend[] newArray(int i) {
            return new BangumiRecommend[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiRecommend(Parcel parcel) {
        this.f5641id = parcel.readInt();
        this.cursor = parcel.readLong();
        this.cover = parcel.readString();
        this.link = parcel.readString();
        this.title = parcel.readString();
        boolean z = false;
        this.isNew = parcel.readByte() != (byte) 0;
        this.desc = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isAuto = z;
        this.wid = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5641id);
        parcel.writeLong(this.cursor);
        parcel.writeString(this.cover);
        parcel.writeString(this.link);
        parcel.writeString(this.title);
        parcel.writeByte((byte) (this.isNew?1:0));
        parcel.writeString(this.desc);
        parcel.writeByte((byte) (this.isAuto?1:0));
        parcel.writeString(this.wid);
    }
}
