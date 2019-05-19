package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public class LiveUpdateInfo implements Parcelable {
    public static final Creator<LiveUpdateInfo> CREATOR = new C52701();
    public String fileMD5;
    public long fileSize;
    public String updateDesc;
    public String updateUrl;
    public int versionCode;
    public String versionName;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveUpdateInfo$1 */
    static class C52701 implements Creator<LiveUpdateInfo> {
        C52701() {
        }

        /* renamed from: a */
        public LiveUpdateInfo createFromParcel(Parcel parcel) {
            return new LiveUpdateInfo(parcel);
        }

        /* renamed from: a */
        public LiveUpdateInfo[] newArray(int i) {
            return new LiveUpdateInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.versionName);
        parcel.writeString(this.updateUrl);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.fileMD5);
        parcel.writeString(this.updateDesc);
    }

    protected LiveUpdateInfo(Parcel parcel) {
        this.versionCode = parcel.readInt();
        this.versionName = parcel.readString();
        this.updateUrl = parcel.readString();
        this.fileSize = parcel.readLong();
        this.fileMD5 = parcel.readString();
        this.updateDesc = parcel.readString();
    }
}
