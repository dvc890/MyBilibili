package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.userinfo;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/userinfo/BiliLiveBuyGuardNotice;", "", "()V", "begin", "", "button", "", "content", "end", "now", "shouldNotice", "", "title", "isNeedNotice", "", "lastNoticeTime", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBuyGuardNotice {
    @JSONField(name = "begin")
    //@JvmField
    public long begin;
    @JSONField(name = "button")
    @Nullable
    //@JvmField
    public String button = "";
    @JSONField(name = "content")
    @Nullable
    //@JvmField
    public String content = "";
    @JSONField(name = "end")
    //@JvmField
    public long end;
    @JSONField(name = "now")
    //@JvmField
    public long now;
    @JSONField(name = "should_notice")
    //@JvmField
    public int shouldNotice;
    @JSONField(name = "title")
    @Nullable
    //@JvmField
    public String title = "";

    public final boolean shouldNotice() {
        return this.shouldNotice == 1;
    }

    public final boolean isNeedNotice(long j) {
        long j2 = this.begin + 1;
        long j3 = this.end - 1;
        long j4 = this.now;
        return j2 <= j4 && j3 >= j4 && j < this.now;
    }
}
