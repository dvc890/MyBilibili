package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.VideoRecommend */
public class VideoRecommend implements Parcelable {
    public static final Creator<VideoRecommend> CREATOR = new C24801();
    @JSONField(name = "count")
    public int count;
    public String toast;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.VideoRecommend$1 */
    static class C24801 implements Creator<VideoRecommend> {
        C24801() {
        }

        /* renamed from: a */
        public VideoRecommend createFromParcel(Parcel parcel) {
            return new VideoRecommend(parcel);
        }

        /* renamed from: a */
        public VideoRecommend[] newArray(int i) {
            return new VideoRecommend[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public VideoRecommend() {}

    protected VideoRecommend(Parcel parcel) {
        this.count = parcel.readInt();
        this.toast = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.toast);
    }
}
