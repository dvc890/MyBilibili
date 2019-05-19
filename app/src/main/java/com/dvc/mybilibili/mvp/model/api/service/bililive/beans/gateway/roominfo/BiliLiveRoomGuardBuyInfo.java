package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveGuardLottery;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomGuardBuyInfo;", "", "()V", "count", "", "duration", "", "guardList", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomGuardBuyInfo$Guard;", "Lkotlin/collections/ArrayList;", "Companion", "Guard", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomGuardBuyInfo {
    public static final Companion Companion = new Companion();
    @JSONField(name = "count")
    //@JvmField
    public int count;
    @JSONField(name = "duration")
    //@JvmField
    public long duration;
    @JSONField(name = "list")
    @Nullable
    //@JvmField
    public ArrayList<Guard> guardList;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomGuardBuyInfo$Guard;", "", "()V", "endTime", "", "face", "", "isOpen", "", "uid", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Guard {
        @JSONField(name = "end_time")
        //@JvmField
        public long endTime;
        @JSONField(name = "face")
        @NotNull
        //@JvmField
        public String face = "";
        @JSONField(name = "is_open")
        //@JvmField
        public boolean isOpen;
        @JSONField(name = "uid")
        //@JvmField
        public long uid;
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomGuardBuyInfo$Companion;", "", "()V", "copyFrom", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomGuardBuyInfo$Guard;", "lottery", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveGuardLottery;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public final Guard copyFrom(@NotNull BiliLiveGuardLottery biliLiveGuardLottery) {
//            //Intrinsics.checkParameterIsNotNull(biliLiveGuardLottery, "lottery");
            Guard guard = new Guard();
            guard.uid = biliLiveGuardLottery.mSender.mUid;
            String str = biliLiveGuardLottery.mSender.mFace;
//            //Intrinsics.checkExpressionValueIsNotNull(str, "lottery.mSender.mFace");
            guard.face = str;
            guard.isOpen = true;
            return guard;
        }
    }
}
