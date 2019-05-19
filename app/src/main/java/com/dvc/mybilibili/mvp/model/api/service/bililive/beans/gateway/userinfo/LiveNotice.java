package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/LiveNotice;", "", "()V", "clickable", "", "getClickable", "()Z", "setClickable", "(Z)V", "fullConfig", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/NoticeConfig;", "halfConfig", "isSelfRoom", "setSelfRoom", "msgCommon", "", "msgSelf", "msgType", "", "realRoomId", "roomId", "shieldUid", "", "url", "isGuard", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class LiveNotice {
    private boolean clickable;
    @JSONField(name = "full")
    @Nullable
    //@JvmField
    public NoticeConfig fullConfig;
    @JSONField(name = "half")
    @Nullable
    //@JvmField
    public NoticeConfig halfConfig;
    private boolean isSelfRoom;
    @JSONField(name = "msg_common")
    @Nullable
    //@JvmField
    public String msgCommon = "";
    @JSONField(name = "msg_self")
    @Nullable
    //@JvmField
    public String msgSelf = "";
    @JSONField(name = "msg_type")
    //@JvmField
    public int msgType;
    @JSONField(name = "real_roomid")
    //@JvmField
    public int realRoomId;
    @JSONField(name = "roomid")
    //@JvmField
    public int roomId;
    @JSONField(name = "shield_uid")
    //@JvmField
    public long shieldUid = -1;
    @JSONField(name = "link_url")
    @Nullable
    //@JvmField
    public String url = "";

    public final boolean isSelfRoom() {
        return this.isSelfRoom;
    }

    public final void setSelfRoom(boolean z) {
        this.isSelfRoom = z;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final void setClickable(boolean z) {
        this.clickable = z;
    }

    public final boolean isGuard() {
        return this.msgType == 3 || this.msgType == 4;
    }
}
