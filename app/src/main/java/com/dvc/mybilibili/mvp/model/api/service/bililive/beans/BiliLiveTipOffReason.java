package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveTipOffReason implements Parcelable {
    public static final Creator<BiliLiveTipOffReason> CREATOR = new C20461();
    @JSONField(name = "reason")
    public String mReason;
    @JSONField(name = "id")
    public int mReasonId;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveTipOffReason$1 */
    static class C20461 implements Creator<BiliLiveTipOffReason> {
        C20461() {
        }

        public BiliLiveTipOffReason createFromParcel(Parcel parcel) {
            return new BiliLiveTipOffReason(parcel);
        }

        public BiliLiveTipOffReason[] newArray(int i) {
            return new BiliLiveTipOffReason[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mReasonId);
        parcel.writeString(this.mReason);
    }

    protected BiliLiveTipOffReason(Parcel parcel) {
        this.mReasonId = parcel.readInt();
        this.mReason = parcel.readString();
    }
}
