package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliUser implements Parcelable {
    public static final Creator<BiliUser> CREATOR = new C20521();
    public static final BiliUser NULL = new BiliUser();
    @JSONField(name = "face")
    public String face = "";
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "name")
    public String name;

    public BiliUser() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliUser$1 */
    static class C20521 implements Creator<BiliUser> {
        C20521() {
        }

        public BiliUser createFromParcel(Parcel parcel) {
            return new BiliUser(parcel);
        }

        public BiliUser[] newArray(int i) {
            return new BiliUser[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeString(this.face);
    }

    protected BiliUser(Parcel parcel) {
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.face = parcel.readString();
    }
}
