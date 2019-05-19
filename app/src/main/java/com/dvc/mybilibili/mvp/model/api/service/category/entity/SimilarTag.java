package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SimilarTag implements Parcelable {
    public static final Creator<SimilarTag> CREATOR = new C22711();
    @JSONField(name = "reid")
    public int reid;
    @JSONField(name = "rename")
    public String rename;
    @JSONField(name = "rid")
    public int rid;
    @JSONField(name = "rname")
    public String rname;
    @JSONField(name = "tid")
    public int tid;
    @JSONField(name = "tname")
    public String tname;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.category.api.SimilarTag$1 */
    static class C22711 implements Creator<SimilarTag> {
        C22711() {
        }

        /* renamed from: a */
        public SimilarTag createFromParcel(Parcel parcel) {
            return new SimilarTag(parcel);
        }

        /* renamed from: a */
        public SimilarTag[] newArray(int i) {
            return new SimilarTag[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reid);
        parcel.writeString(this.rename);
        parcel.writeInt(this.rid);
        parcel.writeString(this.rname);
        parcel.writeInt(this.tid);
        parcel.writeString(this.tname);
    }

    protected SimilarTag(Parcel parcel) {
        this.reid = parcel.readInt();
        this.rename = parcel.readString();
        this.rid = parcel.readInt();
        this.rname = parcel.readString();
        this.tid = parcel.readInt();
        this.tname = parcel.readString();
    }
}
