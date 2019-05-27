package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.LiveExt */
public class LiveExt implements Parcelable {
    public static final Creator<LiveExt> CREATOR = new C24741();
    @JSONField(name = "mid")
    public int mid;
    @JSONField(name = "roomid")
    public int roomId;
    @JSONField(name = "uri")
    public String routerUri;
    @JSONField(name = "title")
    public String title;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.LiveExt$1 */
    static class C24741 implements Creator<LiveExt> {
        C24741() {
        }

        /* renamed from: a */
        public LiveExt createFromParcel(Parcel parcel) {
            return new LiveExt(parcel);
        }

        /* renamed from: a */
        public LiveExt[] newArray(int i) {
            return new LiveExt[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mid);
        parcel.writeInt(this.roomId);
        parcel.writeString(this.title);
        parcel.writeString(this.routerUri);
    }

    protected LiveExt(Parcel parcel) {
        this.mid = parcel.readInt();
        this.roomId = parcel.readInt();
        this.title = parcel.readString();
        this.routerUri = parcel.readString();
    }
}
