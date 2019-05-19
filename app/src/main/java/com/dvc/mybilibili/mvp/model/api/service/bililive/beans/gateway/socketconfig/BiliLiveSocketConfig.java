package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.socketconfig;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.List;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/socketconfig/BiliLiveSocketConfig;", "", "()V", "maxDelay", "", "getMaxDelay", "()J", "setMaxDelay", "(J)V", "refreshRate", "getRefreshRate", "setRefreshRate", "refreshRowFactor", "", "getRefreshRowFactor", "()F", "setRefreshRowFactor", "(F)V", "serverList", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/socketconfig/BiliLiveSocketConfig$DanmuHostPort;", "getServerList", "()Ljava/util/List;", "setServerList", "(Ljava/util/List;)V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "DanmuHostPort", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveSocketConfig {
    @JSONField(name = "max_delay")
    private long maxDelay = 5000;
    @JSONField(name = "refresh_rate")
    private long refreshRate = 100;
    @JSONField(name = "refresh_row_factor")
    private float refreshRowFactor = 0.125f;
    @JSONField(name = "ip_list")
    @Nullable
    private List<DanmuHostPort> serverList;
    @JSONField(name = "token")
    @NotNull
    private String token = "";

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/gateway/socketconfig/BiliLiveSocketConfig$DanmuHostPort;", "", "()V", "host", "", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "port", "", "getPort", "()I", "setPort", "(I)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class DanmuHostPort {
        @JSONField(name = "host")
        @NotNull
        private String host = "";
        @JSONField(name = "port")
        private int port = 2243;

        @NotNull
        public final String getHost() {
            return this.host;
        }

        public final void setHost(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.host = str;
        }

        public final int getPort() {
            return this.port;
        }

        public final void setPort(int i) {
            this.port = i;
        }
    }

    public final float getRefreshRowFactor() {
        return this.refreshRowFactor;
    }

    public final void setRefreshRowFactor(float f) {
        this.refreshRowFactor = f;
    }

    public final long getRefreshRate() {
        return this.refreshRate;
    }

    public final void setRefreshRate(long j) {
        this.refreshRate = j;
    }

    public final long getMaxDelay() {
        return this.maxDelay;
    }

    public final void setMaxDelay(long j) {
        this.maxDelay = j;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final void setToken(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.token = str;
    }

    @Nullable
    public final List<DanmuHostPort> getServerList() {
        return this.serverList;
    }

    public final void setServerList(@Nullable List<DanmuHostPort> list) {
        this.serverList = list;
    }
}
