package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveUserVip;", "", "()V", "svip", "", "svipTime", "", "vip", "vipTime", "isVip", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveUserVip {
    @JSONField(name = "svip")
    //@JvmField
    public int svip;
    @JSONField(name = "svip_time")
    @NotNull
    //@JvmField
    public String svipTime = "";
    @JSONField(name = "vip")
    //@JvmField
    public int vip;
    @JSONField(name = "vip_time")
    @NotNull
    //@JvmField
    public String vipTime = "";

    public final boolean isVip() {
        return this.vip == 1 || this.svip == 1;
    }
}
