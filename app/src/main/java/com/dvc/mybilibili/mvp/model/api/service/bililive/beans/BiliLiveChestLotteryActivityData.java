package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveChestLotteryActivityData implements Parcelable {
    public static final Creator<BiliLiveChestLotteryActivityData> CREATOR = new C20041();
    @JSONField(name = "typeB")
    public List<BiliLiveChestLotteryAward> mAwards;
    @JSONField(name = "current_round")
    public int mCurrentRound;
    @JSONField(name = "rule")
    public String mRule;
    @JSONField(name = "title")
    public String mTitle;

    public BiliLiveChestLotteryActivityData() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveChestLotteryActivityData$1 */
    static class C20041 implements Creator<BiliLiveChestLotteryActivityData> {
        C20041() {
        }

        public BiliLiveChestLotteryActivityData createFromParcel(Parcel parcel) {
            return new BiliLiveChestLotteryActivityData(parcel);
        }

        public BiliLiveChestLotteryActivityData[] newArray(int i) {
            return new BiliLiveChestLotteryActivityData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveChestLotteryActivityData(Parcel parcel) {
        this.mTitle = parcel.readString();
        this.mRule = parcel.readString();
        this.mCurrentRound = parcel.readInt();
        this.mAwards = parcel.createTypedArrayList(BiliLiveChestLotteryAward.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mRule);
        parcel.writeInt(this.mCurrentRound);
        parcel.writeTypedList(this.mAwards);
    }
}
