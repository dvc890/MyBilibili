package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class LiveStreamingRoomStopLiveInfo implements Parcelable {
    public static final Creator<LiveStreamingRoomStopLiveInfo> CREATOR = new C19381();
    @JSONField(name = "change")
    public int change;
    @JSONField(name = "status")
    public String status;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveStreamingRoomStopLiveInfo$1 */
    static class C19381 implements Creator<LiveStreamingRoomStopLiveInfo> {
        C19381() {
        }

        /* renamed from: a */
        public LiveStreamingRoomStopLiveInfo createFromParcel(Parcel parcel) {
            return new LiveStreamingRoomStopLiveInfo(parcel);
        }

        /* renamed from: a */
        public LiveStreamingRoomStopLiveInfo[] newArray(int i) {
            return new LiveStreamingRoomStopLiveInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.change);
        parcel.writeString(this.status);
    }

    protected LiveStreamingRoomStopLiveInfo(Parcel parcel) {
        this.change = parcel.readInt();
        this.status = parcel.readString();
    }
}
