package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveSignInfoImage implements Parcelable {
    public static final Creator<BiliLiveSignInfoImage> CREATOR = new C20441();
    @JSONField(name = "height")
    public int height;
    @JSONField(name = "src")
    public String src;
    @JSONField(name = "width")
    public int width;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSignInfoImage$1 */
    static class C20441 implements Creator<BiliLiveSignInfoImage> {
        C20441() {
        }

        public BiliLiveSignInfoImage createFromParcel(Parcel parcel) {
            return new BiliLiveSignInfoImage(parcel);
        }

        public BiliLiveSignInfoImage[] newArray(int i) {
            return new BiliLiveSignInfoImage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveSignInfoImage(Parcel parcel) {
        this.src = parcel.readString();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
