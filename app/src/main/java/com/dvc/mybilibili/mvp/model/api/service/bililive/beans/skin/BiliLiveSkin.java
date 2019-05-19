package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.skin;

import android.net.Uri;
import android.support.annotation.Keep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkin;", "", "()V", "biliLiveSkinConfig", "Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinConfig;", "getBiliLiveSkinConfig", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinConfig;", "setBiliLiveSkinConfig", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinConfig;)V", "config", "", "currentTime", "", "endTime", "id", "", "getSkinConfig", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveSkin {
    @Nullable
    private BiliLiveSkinConfig biliLiveSkinConfig;
    @JSONField(name = "skin_config")
    @NotNull
    //@JvmField
    public String config = "";
    @JSONField(name = "current_time")
    //@JvmField
    public long currentTime;
    @JSONField(name = "end_time")
    //@JvmField
    public long endTime;
    @JSONField(name = "id")
    //@JvmField
    /* renamed from: id */
    public int f6017id;

    public final void setBiliLiveSkinConfig(@Nullable BiliLiveSkinConfig biliLiveSkinConfig) {
        this.biliLiveSkinConfig = biliLiveSkinConfig;
    }

    @Nullable
    public final BiliLiveSkinConfig getBiliLiveSkinConfig() {
        if (this.biliLiveSkinConfig != null) {
            return this.biliLiveSkinConfig;
        }
        this.biliLiveSkinConfig = getSkinConfig();
        return this.biliLiveSkinConfig;
    }

    private final BiliLiveSkinConfig getSkinConfig() {
        try {
            return (BiliLiveSkinConfig) JSON.parseObject(Uri.decode(this.config), BiliLiveSkinConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
