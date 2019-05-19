package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo;", "", "()V", "endTime", "", "escapeAllTime", "exceptionId", "initRoomInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo$PkRoomInfo;", "getInitRoomInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo$PkRoomInfo;", "setInitRoomInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo$PkRoomInfo;)V", "matchRoomInfo", "pkEndTime", "pkId", "pkPreTime", "pkStartTime", "pkTopic", "", "punishTopic", "status", "timestamp", "userVotes", "Companion", "PkRoomInfo", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomPkInfo {
    public static final Companion Companion = new Companion();
    private static final int PK_END = 1000;
    private static final int PK_ESCAPE = 1200;
    private static final int PK_GOING = 300;
    private static final int PK_INTERRUPT = 1100;
    private static final int PK_MATCH = 100;
    private static final int PK_PREPARE = 200;
    private static final int PK_PUBLISHING = 400;
    @JSONField(name = "end_time")
    //@JvmField
    public int endTime;
    @JSONField(name = "escape_all_time")
    //@JvmField
    public int escapeAllTime;
    @JSONField(name = "exception_id")
    //@JvmField
    public int exceptionId;
    @JSONField(name = "init_info")
    @Nullable
    private PkRoomInfo initRoomInfo;
    @JSONField(name = "match_info")
    @Nullable
    //@JvmField
    public PkRoomInfo matchRoomInfo;
    @JSONField(name = "pk_end_time")
    //@JvmField
    public int pkEndTime;
    @JSONField(name = "pk_id")
    //@JvmField
    public int pkId;
    @JSONField(name = "pk_pre_time")
    //@JvmField
    public int pkPreTime;
    @JSONField(name = "pk_start_time")
    //@JvmField
    public int pkStartTime;
    @JSONField(name = "pk_topic")
    @Nullable
    //@JvmField
    public String pkTopic;
    @JSONField(name = "punish_topic")
    @Nullable
    //@JvmField
    public String punishTopic;
    @JSONField(name = "status")
    //@JvmField
    public int status;
    @JSONField(name = "timestamp")
    //@JvmField
    public int timestamp;
    @JSONField(name = "user_votes")
    //@JvmField
    public int userVotes;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo$PkRoomInfo;", "", "()V", "escapeTime", "", "face", "", "initId", "isPortrait", "", "matchId", "getMatchId", "()I", "setMatchId", "(I)V", "roomId", "getRoomId", "uid", "", "uname", "votes", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class PkRoomInfo {
        @JSONField(name = "escape_time")
        //@JvmField
        public int escapeTime;
        @JSONField(name = "face")
        @Nullable
        //@JvmField
        public String face;
        @JSONField(name = "init_id")
        //@JvmField
        public int initId;
        @JSONField(name = "is_portrait")
        //@JvmField
        public boolean isPortrait;
        @JSONField(name = "match_id")
        private int matchId;
        @JSONField(name = "uid")
        //@JvmField
        public long uid;
        @JSONField(name = "uname")
        @Nullable
        //@JvmField
        public String uname;
        @JSONField(name = "votes")
        //@JvmField
        public int votes;

        public final int getMatchId() {
            return this.matchId;
        }

        public final void setMatchId(int i) {
            this.matchId = i;
        }

        public final int getRoomId() {
            return this.initId > 0 ? this.initId : this.matchId;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/roominfo/BiliLiveRoomPkInfo$Companion;", "", "()V", "PK_END", "", "getPK_END", "()I", "PK_ESCAPE", "getPK_ESCAPE", "PK_GOING", "getPK_GOING", "PK_INTERRUPT", "getPK_INTERRUPT", "PK_MATCH", "getPK_MATCH", "PK_PREPARE", "getPK_PREPARE", "PK_PUBLISHING", "getPK_PUBLISHING", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        public final int getPK_MATCH() {
            return BiliLiveRoomPkInfo.PK_MATCH;
        }

        public final int getPK_PREPARE() {
            return BiliLiveRoomPkInfo.PK_PREPARE;
        }

        public final int getPK_GOING() {
            return BiliLiveRoomPkInfo.PK_GOING;
        }

        public final int getPK_PUBLISHING() {
            return BiliLiveRoomPkInfo.PK_PUBLISHING;
        }

        public final int getPK_END() {
            return BiliLiveRoomPkInfo.PK_END;
        }

        public final int getPK_INTERRUPT() {
            return BiliLiveRoomPkInfo.PK_INTERRUPT;
        }

        public final int getPK_ESCAPE() {
            return BiliLiveRoomPkInfo.PK_ESCAPE;
        }
    }

    @Nullable
    public final PkRoomInfo getInitRoomInfo() {
        return this.initRoomInfo;
    }

    public final void setInitRoomInfo(@Nullable PkRoomInfo pkRoomInfo) {
        this.initRoomInfo = pkRoomInfo;
    }
}
