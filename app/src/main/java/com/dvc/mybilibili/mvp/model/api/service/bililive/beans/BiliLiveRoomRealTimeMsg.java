package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;



@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0013R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRoomRealTimeMsg;", "", "()V", "fansCount", "", "getFansCount", "()J", "setFansCount", "(J)V", "myUserCardNotice", "", "getMyUserCardNotice", "()I", "setMyUserCardNotice", "(I)V", "roomId", "getRoomId", "setRoomId", "isFansCountValidate", "", "isSameRoom", "theRoomId", "shouldShowMyUserCardNotice", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRoomRealTimeMsg {
    @JSONField(name = "fans")
    private long fansCount = -1;
    @JSONField(name = "red_notice")
    private int myUserCardNotice;
    @JSONField(name = "roomid")
    private int roomId;

    public final int getRoomId() {
        return this.roomId;
    }

    public final void setRoomId(int i) {
        this.roomId = i;
    }

    public final long getFansCount() {
        return this.fansCount;
    }

    public final void setFansCount(long j) {
        this.fansCount = j;
    }

    public final int getMyUserCardNotice() {
        return this.myUserCardNotice;
    }

    public final void setMyUserCardNotice(int i) {
        this.myUserCardNotice = i;
    }

    public final boolean shouldShowMyUserCardNotice() {
        return this.myUserCardNotice == 1;
    }

    public final boolean isFansCountValidate() {
        return this.fansCount > -1;
    }

    public final boolean isSameRoom(int i) {
        return this.roomId == i;
    }
}
