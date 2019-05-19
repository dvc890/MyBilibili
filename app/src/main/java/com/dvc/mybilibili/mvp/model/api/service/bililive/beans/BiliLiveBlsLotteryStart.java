package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBlsLotteryStart;", "", "()V", "aid", "", "currentTime", "h5Url", "", "icon", "lotteryTime", "playShakeAnimation", "", "getPlayShakeAnimation", "()Z", "setPlayShakeAnimation", "(Z)V", "roomId", "canJoinCurrentLottery", "toString", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBlsLotteryStart {
    public static final Companion Companion = new Companion();
    @JSONField(name = "aid")
    //@JvmField
    public int aid;
    @JSONField(name = "current_time")
    //@JvmField
    public int currentTime;
    @JSONField(name = "h5_url")
    @NotNull
    //@JvmField
    public String h5Url = "";
    @JSONField(name = "icon")
    @NotNull
    //@JvmField
    public String icon = "";
    @JSONField(name = "lottery_time")
    //@JvmField
    public int lotteryTime;
    private boolean playShakeAnimation;
    @JSONField(name = "room_id")
    //@JvmField
    public int roomId;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBlsLotteryStart$Companion;", "", "()V", "copyFrom", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBlsLotteryStart;", "other", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLotteryBoxInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public final BiliLiveBlsLotteryStart copyFrom(@NotNull BiliLiveLotteryBoxInfo biliLiveLotteryBoxInfo) {
//            //Intrinsics.checkParameterIsNotNull(biliLiveLotteryBoxInfo, "other");
            BiliLiveBlsLotteryStart biliLiveBlsLotteryStart = new BiliLiveBlsLotteryStart();
            biliLiveBlsLotteryStart.aid = biliLiveLotteryBoxInfo.aid;
            biliLiveBlsLotteryStart.currentTime = biliLiveLotteryBoxInfo.curTime;
            biliLiveBlsLotteryStart.lotteryTime = biliLiveLotteryBoxInfo.lotteryTime;
            biliLiveBlsLotteryStart.icon = biliLiveLotteryBoxInfo.icon;
            biliLiveBlsLotteryStart.h5Url = biliLiveLotteryBoxInfo.h5Url;
            return biliLiveBlsLotteryStart;
        }
    }

    public final boolean getPlayShakeAnimation() {
        return this.playShakeAnimation;
    }

    public final void setPlayShakeAnimation(boolean z) {
        this.playShakeAnimation = z;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("current_time:");
        stringBuilder.append(this.currentTime);
        stringBuilder.append(", lotteryTime:");
        stringBuilder.append(this.lotteryTime);
        stringBuilder.append(", icon:");
        stringBuilder.append(this.icon);
        stringBuilder.append(", aid:");
        stringBuilder.append(this.aid);
        stringBuilder.append(", roomId:");
        stringBuilder.append(this.roomId);
        stringBuilder.append(", h5Url:");
        stringBuilder.append(this.h5Url);
        return stringBuilder.toString();
    }

    public final boolean canJoinCurrentLottery() {
        return this.currentTime < this.lotteryTime;
    }
}
