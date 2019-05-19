package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAdminInfo;", "", "()V", "cTime", "", "getCTime", "()Ljava/lang/String;", "setCTime", "(Ljava/lang/String;)V", "roomId", "", "getRoomId", "()I", "setRoomId", "(I)V", "uid", "", "getUid", "()J", "setUid", "(J)V", "userInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAdminInfo$UserInfo;", "getUserInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAdminInfo$UserInfo;", "setUserInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAdminInfo$UserInfo;)V", "UserInfo", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomAdminInfo {
    @JSONField(name = "ctime")
    @NotNull
    private String cTime = "";
    @JSONField(name = "roomid")
    private int roomId;
    @JSONField(name = "uid")
    private long uid;
    @JSONField(name = "userinfo")
    @NotNull
    private UserInfo userInfo = new UserInfo();

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomAdminInfo$UserInfo;", "", "()V", "uName", "", "getUName", "()Ljava/lang/String;", "setUName", "(Ljava/lang/String;)V", "uid", "", "getUid", "()J", "setUid", "(J)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class UserInfo {
        @JSONField(name = "uname")
        @NotNull
        private String uName = "";
        @JSONField(name = "uid")
        private long uid;

        public final long getUid() {
            return this.uid;
        }

        public final void setUid(long j) {
            this.uid = j;
        }

        @NotNull
        public final String getUName() {
            return this.uName;
        }

        public final void setUName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.uName = str;
        }
    }

    @NotNull
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setUserInfo(@NotNull UserInfo userInfo) {
        //Intrinsics.checkParameterIsNotNull(userInfo, "<set-?>");
        this.userInfo = userInfo;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final void setRoomId(int i) {
        this.roomId = i;
    }

    @NotNull
    public final String getCTime() {
        return this.cTime;
    }

    public final void setCTime(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.cTime = str;
    }
}
