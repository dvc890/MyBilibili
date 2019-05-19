package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.skin;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinMsg;", "", "()V", "currentTime", "", "endTime", "scatter", "Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinMsg$Scatter;", "skinId", "", "status", "Scatter", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveSkinMsg {
    @JSONField(name = "current_time")
    //@JvmField
    public long currentTime;
    @JSONField(name = "end_time")
    //@JvmField
    public long endTime;
    @JSONField(name = "scatter")
    @Nullable
    //@JvmField
    public Scatter scatter;
    @JSONField(name = "skin_id")
    //@JvmField
    public int skinId;
    @JSONField(name = "status")
    //@JvmField
    public int status;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinMsg$Scatter;", "", "()V", "max", "", "min", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Scatter {
        @JSONField(name = "max")
        //@JvmField
        public int max;
        @JSONField(name = "min")
        //@JvmField
        public int min;
    }
}
