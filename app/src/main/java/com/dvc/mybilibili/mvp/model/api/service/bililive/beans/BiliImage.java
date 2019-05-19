package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliImage implements Parcelable {
    public static final Creator<BiliImage> CREATOR = new C19921();
    public static final BiliImage NULL = new BiliImage();
    @JSONField(name = "height")
    public int mHeight;
    @JSONField(name = "src")
    public String mSrc = "";
    @JSONField(name = "width")
    public int mWidth;

    public BiliImage() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliImage$1 */
    static class C19921 implements Creator<BiliImage> {
        C19921() {
        }

        public BiliImage createFromParcel(Parcel parcel) {
            return new BiliImage(parcel);
        }

        public BiliImage[] newArray(int i) {
            return new BiliImage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSrc);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
    }

    protected BiliImage(Parcel parcel) {
        this.mSrc = parcel.readString();
        this.mWidth = parcel.readInt();
        this.mHeight = parcel.readInt();
    }
}
