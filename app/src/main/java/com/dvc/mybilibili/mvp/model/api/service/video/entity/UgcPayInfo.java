package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo */
public class UgcPayInfo implements Parcelable {
    public static final Creator<UgcPayInfo> CREATOR = new C24761();
    public Desc msg;
    public boolean paid;
    @JSONField(name = "preview_msg")
    public PreviewDesc previewMsg;
    public int price;

    public UgcPayInfo(){}

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo$1 */
    static class C24761 implements Creator<UgcPayInfo> {
        C24761() {
        }

        /* renamed from: a */
        public UgcPayInfo createFromParcel(Parcel parcel) {
            return new UgcPayInfo(parcel);
        }

        /* renamed from: a */
        public UgcPayInfo[] newArray(int i) {
            return new UgcPayInfo[i];
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo$Desc */
    public static class Desc implements Parcelable {
        public static final Creator<Desc> CREATOR = new C24771();
        public String desc1;
        public String desc2;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo$Desc$1 */
        static class C24771 implements Creator<Desc> {
            C24771() {
            }

            /* renamed from: a */
            public Desc createFromParcel(Parcel parcel) {
                return new Desc(parcel);
            }

            /* renamed from: a */
            public Desc[] newArray(int i) {
                return new Desc[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Desc(Parcel parcel) {
            this.desc1 = parcel.readString();
            this.desc2 = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.desc1);
            parcel.writeString(this.desc2);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo$PreviewDesc */
    public static class PreviewDesc implements Parcelable {
        public static final Creator<PreviewDesc> CREATOR = new C24781();
        public String desc1;
        public String desc2;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.UgcPayInfo$PreviewDesc$1 */
        static class C24781 implements Creator<PreviewDesc> {
            C24781() {
            }

            /* renamed from: a */
            public PreviewDesc createFromParcel(Parcel parcel) {
                return new PreviewDesc(parcel);
            }

            /* renamed from: a */
            public PreviewDesc[] newArray(int i) {
                return new PreviewDesc[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected PreviewDesc(Parcel parcel) {
            this.desc1 = parcel.readString();
            this.desc2 = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.desc1);
            parcel.writeString(this.desc2);
        }
    }

    public int describeContents() {
        return 0;
    }

    protected UgcPayInfo(Parcel parcel) {
        this.paid = parcel.readByte() != (byte) 0;
        this.price = parcel.readInt();
        this.msg = (Desc) parcel.readParcelable(Desc.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.paid?1:0));
        parcel.writeInt(this.price);
        parcel.writeParcelable(this.msg, i);
    }
}
