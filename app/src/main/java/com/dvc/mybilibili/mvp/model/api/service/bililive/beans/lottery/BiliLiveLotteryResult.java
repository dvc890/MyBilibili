package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveLotteryResult implements Parcelable {
    public static final Creator<BiliLiveLotteryResult> CREATOR = new C20631();
    @JSONField(name = "gift_content")
    public String mGiftContent;
    @JSONField(name = "gift_from")
    public String mGiftFrom;
    @JSONField(name = "gift_id")
    public String mGiftId;
    @JSONField(name = "gift_image")
    public String mGiftImage;
    @JSONField(name = "gift_name")
    public String mGiftName;
    @JSONField(name = "gift_num")
    public int mGiftNum;
    @JSONField(name = "gift_rank")
    public int mGiftRank;
    @JSONField(name = "gift_type")
    public int mGiftType;
    @JSONField(name = "raffleId")
    public int mRaffleId;
    @JSONField(name = "sender_type")
    public int mSenderType;
    @JSONField(name = "status")
    public int mStatus;
    @JSONField(name = "toast1")
    public String mToast1;
    @JSONField(name = "toast2")
    public String mToast2;
    @JSONField(name = "type")
    public String mType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.lottery.BiliLiveLotteryResult$1 */
    static class C20631 implements Creator<BiliLiveLotteryResult> {
        C20631() {
        }

        public BiliLiveLotteryResult createFromParcel(Parcel parcel) {
            return new BiliLiveLotteryResult(parcel);
        }

        public BiliLiveLotteryResult[] newArray(int i) {
            return new BiliLiveLotteryResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveLotteryResult(Parcel parcel) {
        this.mRaffleId = parcel.readInt();
        this.mType = parcel.readString();
        this.mGiftId = parcel.readString();
        this.mGiftName = parcel.readString();
        this.mGiftNum = parcel.readInt();
        this.mGiftFrom = parcel.readString();
        this.mGiftType = parcel.readInt();
        this.mGiftImage = parcel.readString();
        this.mGiftContent = parcel.readString();
        this.mStatus = parcel.readInt();
        this.mGiftRank = parcel.readInt();
        this.mSenderType = parcel.readInt();
        this.mToast1 = parcel.readString();
        this.mToast2 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRaffleId);
        parcel.writeString(this.mType);
        parcel.writeString(this.mGiftId);
        parcel.writeString(this.mGiftName);
        parcel.writeInt(this.mGiftNum);
        parcel.writeString(this.mGiftFrom);
        parcel.writeInt(this.mGiftType);
        parcel.writeString(this.mGiftImage);
        parcel.writeString(this.mGiftContent);
        parcel.writeInt(this.mStatus);
        parcel.writeInt(this.mGiftRank);
        parcel.writeInt(this.mSenderType);
        parcel.writeString(this.mToast1);
        parcel.writeString(this.mToast2);
    }
}
