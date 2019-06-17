package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.nativelibrary.SignedQuery;

@Keep
/* compiled from: BL */
public class LiveStreamingRoomStartLiveInfo implements Parcelable {
    public static final Creator<LiveStreamingRoomStartLiveInfo> CREATOR = new C19371();
    @JSONField(name = "change")
    public int change;
    @JSONField(name = "rtmp")
    public Rtmp rtmp;
    @JSONField(name = "status")
    public String status;
    @JSONField(name = "try_time")
    public String tryTime;

    public LiveStreamingRoomStartLiveInfo() {
    }

    @Keep
    /* compiled from: BL */
    public static class Rtmp implements Parcelable {
        public static final Creator<Rtmp> CREATOR = new C19361();
        @JSONField(name = "addr")
        public String addr;
        @JSONField(name = "code")
        public String code;
        @JSONField(name = "new_link")
        public String newLink;
        @JSONField(name = "provider")
        public String provider;

        public Rtmp() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bilibililive.api.entity.LiveStreamingRoomStartLiveInfo$Rtmp$1 */
        static class C19361 implements Creator<Rtmp> {
            C19361() {
            }

            /* renamed from: a */
            public Rtmp createFromParcel(Parcel parcel) {
                return new Rtmp(parcel);
            }

            /* renamed from: a */
            public Rtmp[] newArray(int i) {
                return new Rtmp[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.addr);
            parcel.writeString(this.code);
            parcel.writeString(this.newLink);
            parcel.writeString(this.provider);
        }

        protected Rtmp(Parcel parcel) {
            this.addr = parcel.readString();
            this.code = parcel.readString();
            this.newLink = parcel.readString();
            this.provider = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveStreamingRoomStartLiveInfo$1 */
    static class C19371 implements Creator<LiveStreamingRoomStartLiveInfo> {
        C19371() {
        }

        /* renamed from: a */
        public LiveStreamingRoomStartLiveInfo createFromParcel(Parcel parcel) {
            return new LiveStreamingRoomStartLiveInfo(parcel);
        }

        /* renamed from: a */
        public LiveStreamingRoomStartLiveInfo[] newArray(int i) {
            return new LiveStreamingRoomStartLiveInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getFullUrl() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.rtmp.addr);
        stringBuilder.append(SignedQuery.HttpUtils.PATHS_SEPARATOR);
        stringBuilder.append(this.rtmp.code);
        return stringBuilder.toString();
    }

    public boolean isNeedSeepUp() {
        return !TextUtils.isEmpty(this.rtmp.newLink);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.change);
        parcel.writeString(this.status);
        parcel.writeString(this.tryTime);
        parcel.writeParcelable(this.rtmp, i);
    }

    protected LiveStreamingRoomStartLiveInfo(Parcel parcel) {
        this.change = parcel.readInt();
        this.status = parcel.readString();
        this.tryTime = parcel.readString();
        this.rtmp = (Rtmp) parcel.readParcelable(Rtmp.class.getClassLoader());
    }
}
