package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomEssentialInfo;", "", "()V", "areaId", "", "areaName", "", "background", "cover", "description", "hiddenStatus", "hiddenTime", "keyFrame", "liveMark", "liveScreenType", "liveStartTime", "liveStatus", "lockStatus", "lockTime", "online", "", "parentAreaId", "parentAreaName", "pendants", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomEssentialInfo$Pendants;", "pkStatus", "roomId", "shortId", "specialType", "tags", "title", "uid", "upSession", "isPkOpen", "", "isVerticalType", "FrameBadge", "Pendants", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomEssentialInfo {
    @JSONField(name = "area_id")
    //@JvmField
    public int areaId;
    @JSONField(name = "area_name")
    @NotNull
    //@JvmField
    public String areaName = "";
    @JSONField(name = "background")
    @NotNull
    //@JvmField
    public String background = "";
    @JSONField(name = "cover")
    @NotNull
    //@JvmField
    public String cover = "";
    @JSONField(name = "description")
    @NotNull
    //@JvmField
    public String description = "";
    @JSONField(name = "hidden_status")
    //@JvmField
    public int hiddenStatus;
    @JSONField(name = "hidden_time")
    //@JvmField
    public int hiddenTime;
    @JSONField(name = "keyframe")
    @NotNull
    //@JvmField
    public String keyFrame = "";
    @JSONField(name = "live_mark")
    //@JvmField
    public int liveMark;
    @JSONField(name = "live_screen_type")
    //@JvmField
    public int liveScreenType;
    @JSONField(name = "live_start_time")
    //@JvmField
    public int liveStartTime;
    @JSONField(name = "live_status")
    //@JvmField
    public int liveStatus;
    @JSONField(name = "lock_status")
    //@JvmField
    public int lockStatus;
    @JSONField(name = "lock_time")
    //@JvmField
    public int lockTime;
    @JSONField(name = "online")
    //@JvmField
    public long online;
    @JSONField(name = "parent_area_id")
    //@JvmField
    public int parentAreaId;
    @JSONField(name = "parent_area_name")
    @NotNull
    //@JvmField
    public String parentAreaName = "";
    @JSONField(name = "pendants")
    @Nullable
    //@JvmField
    public Pendants pendants;
    @JSONField(name = "pk_status")
    //@JvmField
    public int pkStatus;
    @JSONField(name = "room_id")
    //@JvmField
    public int roomId;
    @JSONField(name = "short_id")
    //@JvmField
    public int shortId;
    @JSONField(name = "special_type")
    //@JvmField
    public int specialType;
    @JSONField(name = "tags")
    @NotNull
    //@JvmField
    public String tags = "";
    @JSONField(name = "title")
    @NotNull
    //@JvmField
    public String title = "";
    @JSONField(name = "uid")
    //@JvmField
    public long uid;
    @JSONField(name = "up_session")
    @NotNull
    //@JvmField
    public String upSession = "";

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomEssentialInfo$FrameBadge;", "", "()V", "desc", "", "name", "position", "", "value", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class FrameBadge {
        @JSONField(name = "desc")
        @NotNull
        //@JvmField
        public String desc = "";
        @JSONField(name = "name")
        @NotNull
        //@JvmField
        public String name = "";
        @JSONField(name = "position")
        //@JvmField
        public int position;
        @JSONField(name = "value")
        @NotNull
        //@JvmField
        public String value = "";
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomEssentialInfo$Pendants;", "", "()V", "badge", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomEssentialInfo$FrameBadge;", "frame", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Pendants {
        @JSONField(name = "badge")
        @Nullable
        //@JvmField
        public FrameBadge badge;
        @JSONField(name = "frame")
        @Nullable
        //@JvmField
        public FrameBadge frame;
    }

    public final boolean isVerticalType() {
        return this.liveScreenType == 1;
    }

    public final boolean isPkOpen() {
        return this.pkStatus > 0;
    }
}
