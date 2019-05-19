package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveTitleCombineResult implements Parcelable {
    public static final Creator<BiliLiveTitleCombineResult> CREATOR = new C20471();
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "expire_time")
    public String mExpireTime;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "new_level")
    public int mNewLevel;
    @JSONField(name = "old_level")
    public int mOldLevel;
    @JSONField(name = "score")
    public long mScore;
    @JSONField(name = "source")
    public String mSource;
    @JSONField(name = "identification")
    public String mTitleId;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveTitleCombineResult$1 */
    static class C20471 implements Creator<BiliLiveTitleCombineResult> {
        C20471() {
        }

        public BiliLiveTitleCombineResult createFromParcel(Parcel parcel) {
            return new BiliLiveTitleCombineResult(parcel);
        }

        public BiliLiveTitleCombineResult[] newArray(int i) {
            return new BiliLiveTitleCombineResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isForeverTitle() {
        return "0000-00-00 00:00:00".equals(this.mExpireTime);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mScore);
        parcel.writeInt(this.mOldLevel);
        parcel.writeInt(this.mNewLevel);
        parcel.writeString(this.mSource);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mName);
        parcel.writeString(this.mTitleId);
        parcel.writeString(this.mExpireTime);
    }

    protected BiliLiveTitleCombineResult(Parcel parcel) {
        this.mScore = parcel.readLong();
        this.mOldLevel = parcel.readInt();
        this.mNewLevel = parcel.readInt();
        this.mSource = parcel.readString();
        this.mDescription = parcel.readString();
        this.mName = parcel.readString();
        this.mTitleId = parcel.readString();
        this.mExpireTime = parcel.readString();
    }
}
