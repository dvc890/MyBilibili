package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.lotteryinfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveGuardLottery;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveLotteryBoxInfo;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.livebox.BiliLiveboxStatus;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.lottery.BiliLiveLotteryInfo.Lottery;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/lotteryinfo/LiveRoomLotteryInfo;", "", "()V", "blsBox", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLotteryBoxInfo;", "giftList", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/lottery/BiliLiveLotteryInfo$Lottery;", "Lkotlin/collections/ArrayList;", "goldBox", "Lcom/bilibili/bililive/videoliveplayer/net/beans/livebox/BiliLiveboxStatus;", "guardList", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveGuardLottery;", "silverBox", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/lotteryinfo/LiveRoomLotteryInfo$SilverBox;", "storm", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/lotteryinfo/LiveRoomLotteryInfo$Storm;", "SilverBox", "Storm", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class LiveRoomLotteryInfo {
    @JSONField(name = "bls_box")
    @Nullable
    //@JvmField
    public BiliLiveLotteryBoxInfo blsBox;
    @JSONField(name = "gift_list")
    @Nullable
    //@JvmField
    public ArrayList<Lottery> giftList;
    @JSONField(name = "activity_box")
    @Nullable
    //@JvmField
    public BiliLiveboxStatus goldBox;
    @JSONField(name = "guard")
    @Nullable
    //@JvmField
    public ArrayList<BiliLiveGuardLottery> guardList;
    @JSONField(name = "slive_box")
    @Nullable
    //@JvmField
    public SilverBox silverBox;
    @JSONField(name = "storm")
    @Nullable
    //@JvmField
    public Storm storm;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/lotteryinfo/LiveRoomLotteryInfo$SilverBox;", "", "()V", "countDownInMinute", "", "currentRound", "endTime", "", "maxRound", "silverAmount", "startTime", "status", "isAvailable", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class SilverBox {
        @JSONField(name = "minute")
        //@JvmField
        public int countDownInMinute;
        @JSONField(name = "times")
        //@JvmField
        public int currentRound;
        @JSONField(name = "time_end")
        //@JvmField
        public long endTime;
        @JSONField(name = "max_times")
        //@JvmField
        public int maxRound;
        @JSONField(name = "silver")
        //@JvmField
        public int silverAmount;
        @JSONField(name = "time_start")
        //@JvmField
        public long startTime;
        @JSONField(name = "status")
        //@JvmField
        public int status;

        public final boolean isAvailable() {
            return this.status == 0;
        }
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/lotteryinfo/LiveRoomLotteryInfo$Storm;", "", "()V", "amount", "", "balanceTime", "danmaku", "", "id", "", "joinState", "stormGifUrl", "hasJoined", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Storm {
        @JSONField(name = "num")
        //@JvmField
        public int amount;
        @JSONField(name = "time")
        //@JvmField
        public int balanceTime;
        @JSONField(name = "content")
        @NotNull
        //@JvmField
        public String danmaku = "";
        @JSONField(name = "id")
        //@JvmField
        /* renamed from: id */
        public long f6010id;
        @JSONField(name = "hadJoin")
        //@JvmField
        public int joinState;
        @JSONField(name = "storm_gif")
        @Nullable
        //@JvmField
        public String stormGifUrl;

        public final boolean hasJoined() {
            return this.joinState == 1;
        }
    }
}
