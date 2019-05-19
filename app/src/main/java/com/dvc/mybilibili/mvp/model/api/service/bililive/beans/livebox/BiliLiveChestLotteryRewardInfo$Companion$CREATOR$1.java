package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable.Creator;

import org.jetbrains.annotations.NotNull;




/* compiled from: BL */
public final class BiliLiveChestLotteryRewardInfo$Companion$CREATOR$1 implements Creator<BiliLiveChestLotteryRewardInfo> {
    BiliLiveChestLotteryRewardInfo$Companion$CREATOR$1() {
    }

    @NotNull
    public BiliLiveChestLotteryRewardInfo createFromParcel(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        return new BiliLiveChestLotteryRewardInfo(parcel);
    }

    @NotNull
    public BiliLiveChestLotteryRewardInfo[] newArray(int i) {
        return new BiliLiveChestLotteryRewardInfo[i];
    }
}
