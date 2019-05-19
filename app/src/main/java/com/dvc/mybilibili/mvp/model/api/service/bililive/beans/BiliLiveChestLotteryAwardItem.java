package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveChestLotteryAwardItem implements Parcelable, Cloneable {
    public static final Creator<BiliLiveChestLotteryAwardItem> CREATOR = new C20061();
    @JSONField(name = "ex_text")
    public String mExText;
    @JSONField(name = "jp_id")
    public String mJpId;
    @JSONField(name = "jp_name")
    public String mJpName;
    @JSONField(name = "jp_num")
    public String mJpNum;
    @JSONField(name = "jp_type")
    public String mJpType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveChestLotteryAwardItem$1 */
    static class C20061 implements Creator<BiliLiveChestLotteryAwardItem> {
        C20061() {
        }

        public BiliLiveChestLotteryAwardItem createFromParcel(Parcel parcel) {
            return new BiliLiveChestLotteryAwardItem(parcel);
        }

        public BiliLiveChestLotteryAwardItem[] newArray(int i) {
            return new BiliLiveChestLotteryAwardItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveChestLotteryAwardItem(Parcel parcel) {
        this.mJpName = parcel.readString();
        this.mJpNum = parcel.readString();
        this.mJpId = parcel.readString();
        this.mJpType = parcel.readString();
        this.mExText = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mJpName);
        parcel.writeString(this.mJpNum);
        parcel.writeString(this.mJpId);
        parcel.writeString(this.mJpType);
        parcel.writeString(this.mExText);
    }
}
