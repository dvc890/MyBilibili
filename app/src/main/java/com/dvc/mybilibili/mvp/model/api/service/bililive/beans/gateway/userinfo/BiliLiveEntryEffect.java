package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveEntryEffect;", "", "()V", "bgUrl", "", "content", "effectiveTime", "", "face", "highlightColor", "id", "", "isMe", "", "()Z", "setMe", "(Z)V", "isShowed", "setShowed", "mockEffect", "priority", "privilegeType", "showAvatar", "targetId", "uid", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveEntryEffect {
    @JSONField(name = "basemap_url")
    @Nullable
    //@JvmField
    public String bgUrl;
    @JSONField(name = "copy_writing")
    @Nullable
    //@JvmField
    public String content;
    @JSONField(name = "effective_time")
    //@JvmField
    public int effectiveTime;
    @JSONField(name = "face")
    @Nullable
    //@JvmField
    public String face;
    @JSONField(name = "highlight_color")
    @Nullable
    //@JvmField
    public String highlightColor;
    @JSONField(name = "id")
    //@JvmField
    /* renamed from: id */
    public long f6015id;
    private boolean isMe;
    private boolean isShowed;
    @JSONField(name = "mock_effect")
    //@JvmField
    public int mockEffect;
    @JSONField(name = "priority")
    //@JvmField
    public int priority;
    @JSONField(name = "privilege_type")
    //@JvmField
    public int privilegeType;
    @JSONField(name = "show_avatar")
    //@JvmField
    public int showAvatar;
    @JSONField(name = "target_id")
    //@JvmField
    public long targetId;
    @JSONField(name = "uid")
    //@JvmField
    public long uid;

    public final boolean isMe() {
        return this.isMe;
    }

    public final void setMe(boolean z) {
        this.isMe = z;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }
}
