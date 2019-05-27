package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRhythmData implements Parcelable {
    public static final Creator<BiliLiveRhythmData> CREATOR = new C20191();
    @JSONField(name = "beat")
    public List<BiliLiveRhythmItem> mBeats;
    @JSONField(name = "level")
    public int mLevel;
    @JSONField(name = "svip")
    public boolean mSvip;

    public BiliLiveRhythmData() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRhythmData$1 */
    static class C20191 implements Creator<BiliLiveRhythmData> {
        C20191() {
        }

        public BiliLiveRhythmData createFromParcel(Parcel parcel) {
            return new BiliLiveRhythmData(parcel);
        }

        public BiliLiveRhythmData[] newArray(int i) {
            return new BiliLiveRhythmData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isBeatEmpty() {
        return this.mBeats == null || this.mBeats.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.mSvip?1:0));
        parcel.writeInt(this.mLevel);
        parcel.writeTypedList(this.mBeats);
    }

    protected BiliLiveRhythmData(Parcel parcel) {
        this.mSvip = parcel.readByte() != (byte) 0;
        this.mLevel = parcel.readInt();
        this.mBeats = parcel.createTypedArrayList(BiliLiveRhythmItem.CREATOR);
    }
}
