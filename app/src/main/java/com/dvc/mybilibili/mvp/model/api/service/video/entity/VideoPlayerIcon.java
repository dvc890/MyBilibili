package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.VideoPlayerIcon */
public class VideoPlayerIcon implements Parcelable {
    public static final Creator<VideoPlayerIcon> CREATOR = new C24791();
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "url1")
    public String url1;
    @JSONField(name = "url2")
    public String url2;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.VideoPlayerIcon$1 */
    static class C24791 implements Creator<VideoPlayerIcon> {
        C24791() {
        }

        /* renamed from: a */
        public VideoPlayerIcon createFromParcel(Parcel parcel) {
            return new VideoPlayerIcon(parcel);
        }

        /* renamed from: a */
        public VideoPlayerIcon[] newArray(int i) {
            return new VideoPlayerIcon[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url1);
        parcel.writeString(this.url2);
        parcel.writeLong(this.ctime);
    }

    public VideoPlayerIcon(){}

    protected VideoPlayerIcon(Parcel parcel) {
        this.url1 = parcel.readString();
        this.url2 = parcel.readString();
        this.ctime = parcel.readLong();
    }
}
