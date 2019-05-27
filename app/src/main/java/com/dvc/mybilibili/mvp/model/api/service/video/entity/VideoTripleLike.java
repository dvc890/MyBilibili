package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.VideoTripleLike */
public class VideoTripleLike implements Parcelable {
    public static final Creator<VideoTripleLike> CREATOR = new C245681();
    public boolean coin;
    public boolean fav;
    public boolean like;
    public int multiply;
    public boolean prompt;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.VideoTripleLike$1 */
    static class C245681 implements Creator<VideoTripleLike> {
        C245681() {
        }

        /* renamed from: a */
        public VideoTripleLike createFromParcel(Parcel parcel) {
            return new VideoTripleLike(parcel);
        }

        /* renamed from: a */
        public VideoTripleLike[] newArray(int i) {
            return new VideoTripleLike[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public VideoTripleLike() {}

    protected VideoTripleLike(Parcel parcel) {
        boolean z = false;
        this.like = parcel.readByte() != (byte) 0;
        this.coin = parcel.readByte() != (byte) 0;
        this.fav = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.prompt = z;
        this.multiply = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.like?1:0));
        parcel.writeByte((byte) (this.coin?1:0));
        parcel.writeByte((byte) (this.fav?1:0));
        parcel.writeByte((byte) (this.prompt?1:0));
        parcel.writeInt(this.multiply);
    }
}
