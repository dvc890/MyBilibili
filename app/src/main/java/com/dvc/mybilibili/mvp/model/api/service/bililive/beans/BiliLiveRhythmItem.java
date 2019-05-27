package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRhythmItem implements Parcelable {
    public static final Creator<BiliLiveRhythmItem> CREATOR = new C20201();
    @JSONField(name = "content")
    public String mContent;
    @JSONField(name = "id")
    public String mId;
    @JSONField(name = "reason")
    public String mReason;
    @JSONField(name = "status")
    public int mStatus;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRhythmItem$1 */
    static class C20201 implements Creator<BiliLiveRhythmItem> {
        C20201() {
        }

        public BiliLiveRhythmItem createFromParcel(Parcel parcel) {
            return new BiliLiveRhythmItem(parcel);
        }

        public BiliLiveRhythmItem[] newArray(int i) {
            return new BiliLiveRhythmItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliLiveRhythmItem() {

    }

    protected BiliLiveRhythmItem(Parcel parcel) {
        this.mId = parcel.readString();
        this.mContent = parcel.readString();
        this.mStatus = parcel.readInt();
        this.mReason = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mContent);
        parcel.writeInt(this.mStatus);
        parcel.writeString(this.mReason);
    }
}
