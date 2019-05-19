package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBoxLotteryResult;", "", "()V", "my", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBoxLotteryResult$MyLottery;", "Companion", "MyLottery", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBoxLotteryResult {
    public static final Companion Companion = new Companion();
    public static final int WIN_LOTTERY_FREE = 0;
    public static final int WIN_LOTTERY_GOLD = 1;
    @JSONField(name = "my")
    @NotNull
    //@JvmField
    /* renamed from: my */
    public MyLottery f5994my = new MyLottery();

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBoxLotteryResult$MyLottery;", "", "()V", "isWin", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class MyLottery {
        @JSONField(name = "is_win")
        //@JvmField
        public int isWin = -1;
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBoxLotteryResult$Companion;", "", "()V", "WIN_LOTTERY_FREE", "", "WIN_LOTTERY_GOLD", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
    }
}
