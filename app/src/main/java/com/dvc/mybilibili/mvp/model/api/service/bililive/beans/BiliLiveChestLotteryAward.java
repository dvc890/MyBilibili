package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveChestLotteryAward implements Parcelable, Cloneable {
    public static final Creator<BiliLiveChestLotteryAward> CREATOR = new C20051();
    @JSONField(name = "imgUrl")
    public String mImgUrl;
    @JSONField(name = "list")
    public List<BiliLiveChestLotteryAwardItem> mItemList;
    @JSONField(name = "join_end_time")
    public long mJoinEndTime;
    @JSONField(name = "join_start_time")
    public long mJoinStartTime;
    @JSONField(name = "startTime")
    public String mStartTime;
    @JSONField(name = "status")
    public int mStatus;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveChestLotteryAward$1 */
    static class C20051 implements Creator<BiliLiveChestLotteryAward> {
        C20051() {
        }

        public BiliLiveChestLotteryAward createFromParcel(Parcel parcel) {
            return new BiliLiveChestLotteryAward(parcel);
        }

        public BiliLiveChestLotteryAward[] newArray(int i) {
            return new BiliLiveChestLotteryAward[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mStartTime);
        parcel.writeString(this.mImgUrl);
        parcel.writeTypedList(this.mItemList);
        parcel.writeInt(this.mStatus);
        parcel.writeLong(this.mJoinStartTime);
        parcel.writeLong(this.mJoinEndTime);
    }

    protected BiliLiveChestLotteryAward(Parcel parcel) {
        this.mStartTime = parcel.readString();
        this.mImgUrl = parcel.readString();
        this.mItemList = parcel.createTypedArrayList(BiliLiveChestLotteryAwardItem.CREATOR);
        this.mStatus = parcel.readInt();
        this.mJoinStartTime = parcel.readLong();
        this.mJoinEndTime = parcel.readLong();
    }
}
