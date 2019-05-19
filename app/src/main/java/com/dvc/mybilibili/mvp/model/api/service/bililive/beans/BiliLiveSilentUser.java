package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveSilentUser;", "", "()V", "endTime", "", "getEndTime", "()Ljava/lang/String;", "setEndTime", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveSilentUser {
    @JSONField(name = "block_end_time")
    @NotNull
    private String endTime = "";
    @JSONField(name = "id")
    /* renamed from: id */
    private long f6005id;
    @JSONField(name = "uname")
    @NotNull
    private String name = "";

    public final long getId() {
        return this.f6005id;
    }

    public final void setId(long j) {
        this.f6005id = j;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.endTime = str;
    }
}
