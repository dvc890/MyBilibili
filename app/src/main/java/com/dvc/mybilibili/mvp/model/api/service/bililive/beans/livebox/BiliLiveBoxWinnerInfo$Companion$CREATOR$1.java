package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox;

import android.os.Parcel;
import android.os.Parcelable.Creator;

import org.jetbrains.annotations.NotNull;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"com/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveBoxWinnerInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBoxWinnerInfo$Companion$CREATOR$1 implements Creator<BiliLiveBoxWinnerInfo> {
    BiliLiveBoxWinnerInfo$Companion$CREATOR$1() {
    }

    @NotNull
    public BiliLiveBoxWinnerInfo createFromParcel(@NotNull Parcel parcel) {
        //Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        return new BiliLiveBoxWinnerInfo(parcel);
    }

    @NotNull
    public BiliLiveBoxWinnerInfo[] newArray(int i) {
        return new BiliLiveBoxWinnerInfo[i];
    }
}
