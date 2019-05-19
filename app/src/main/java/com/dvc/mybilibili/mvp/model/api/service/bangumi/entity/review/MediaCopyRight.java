package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class MediaCopyRight implements Parcelable {
    public static final Creator<MediaCopyRight> CREATOR = new C18451();
    @JSONField(name = "is_finish")
    public boolean isFinish;
    @JSONField(name = "is_started")
    public boolean isStarted;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.MediaCopyRight$1 */
    static class C18451 implements Creator<MediaCopyRight> {
        C18451() {
        }

        /* renamed from: a */
        public MediaCopyRight createFromParcel(Parcel parcel) {
            return new MediaCopyRight(parcel);
        }

        /* renamed from: a */
        public MediaCopyRight[] newArray(int i) {
            return new MediaCopyRight[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.isStarted?1:0));
        parcel.writeByte((byte) (this.isFinish?1:0));
    }

    protected MediaCopyRight(Parcel parcel) {
        boolean z = false;
        this.isStarted = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isFinish = z;
    }
}
