package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import android.support.annotation.Nullable;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLivePayGold;", "", "()V", "orderId", "", "payCenterCode", "", "Ljava/lang/Integer;", "payCenterMsg", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLivePayGold {
    @JSONField(name = "orderId")
    @Nullable
    //@JvmField
    public String orderId;
    @JSONField(name = "payCenterCode")
    @Nullable
    //@JvmField
    public Integer payCenterCode;
    @JSONField(name = "payCenterMsg")
    @Nullable
    //@JvmField
    public String payCenterMsg;
}
