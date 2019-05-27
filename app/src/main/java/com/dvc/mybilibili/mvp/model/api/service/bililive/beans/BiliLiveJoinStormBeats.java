package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveJoinStormBeats implements Parcelable {
    public static final Creator<BiliLiveJoinStormBeats> CREATOR = new C20111();
    @JSONField(name = "content")
    public String mContent;
    @JSONField(name = "gift_id")
    public int mGiftId;
    @JSONField(name = "gift_img")
    public String mGiftImg;
    @JSONField(name = "gift_name")
    public String mGiftName;
    @JSONField(name = "gift_num")
    public int mGiftNum;
    @JSONField(name = "mobile_content")
    public String mMobileContent;
    @JSONField(name = "title")
    public String mTitle;

    public BiliLiveJoinStormBeats() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveJoinStormBeats$1 */
    static class C20111 implements Creator<BiliLiveJoinStormBeats> {
        C20111() {
        }

        public BiliLiveJoinStormBeats createFromParcel(Parcel parcel) {
            return new BiliLiveJoinStormBeats(parcel);
        }

        public BiliLiveJoinStormBeats[] newArray(int i) {
            return new BiliLiveJoinStormBeats[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveJoinStormBeats(Parcel parcel) {
        this.mGiftId = parcel.readInt();
        this.mTitle = parcel.readString();
        this.mContent = parcel.readString();
        this.mMobileContent = parcel.readString();
        this.mGiftImg = parcel.readString();
        this.mGiftNum = parcel.readInt();
        this.mGiftName = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mGiftId);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mContent);
        parcel.writeString(this.mMobileContent);
        parcel.writeString(this.mGiftImg);
        parcel.writeInt(this.mGiftNum);
        parcel.writeString(this.mGiftName);
    }
}
