package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveSignInfoAward implements Parcelable {
    public static final Creator<BiliLiveSignInfoAward> CREATOR = new C20431();
    @JSONField(name = "award")
    public String award;
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "day")
    public int day;
    @JSONField(name = "id")
    /* renamed from: id */
    public int f6004id;
    @JSONField(name = "img")
    public BiliLiveSignInfoImage img;
    @JSONField(name = "text")
    public String text;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSignInfoAward$1 */
    static class C20431 implements Creator<BiliLiveSignInfoAward> {
        C20431() {
        }

        public BiliLiveSignInfoAward createFromParcel(Parcel parcel) {
            return new BiliLiveSignInfoAward(parcel);
        }

        public BiliLiveSignInfoAward[] newArray(int i) {
            return new BiliLiveSignInfoAward[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveSignInfoAward(Parcel parcel) {
        this.f6004id = parcel.readInt();
        this.award = parcel.readString();
        this.count = parcel.readInt();
        this.text = parcel.readString();
        this.day = parcel.readInt();
        this.img = (BiliLiveSignInfoImage) parcel.readParcelable(BiliLiveSignInfoImage.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6004id);
        parcel.writeString(this.award);
        parcel.writeInt(this.count);
        parcel.writeString(this.text);
        parcel.writeInt(this.day);
        parcel.writeParcelable(this.img, i);
    }
}
