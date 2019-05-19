package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;



////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveWallet;", "", "()V", "gold", "", "getGold", "()J", "setGold", "(J)V", "mBp", "", "getMBp", "()Ljava/lang/String;", "setMBp", "(Ljava/lang/String;)V", "silver", "getSilver", "setSilver", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveWallet {
    @JSONField(name = "gold")
    private long gold = -1;
    @JSONField(name = "bp")
    @Nullable
    private String mBp;
    @JSONField(name = "silver")
    private long silver;

    public final long getGold() {
        return this.gold;
    }

    public final void setGold(long j) {
        this.gold = j;
    }

    public final long getSilver() {
        return this.silver;
    }

    public final void setSilver(long j) {
        this.silver = j;
    }

    @Nullable
    public final String getMBp() {
        return this.mBp;
    }

    public final void setMBp(@Nullable String str) {
        this.mBp = str;
    }
}
