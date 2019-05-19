package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveUseRenewCard;", "", "()V", "result", "", "getResult", "()I", "setResult", "(I)V", "titleExpirtDateTime", "", "getTitleExpirtDateTime", "()Ljava/lang/String;", "setTitleExpirtDateTime", "(Ljava/lang/String;)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveUseRenewCard {
    @JSONField(name = "result")
    private int result = -1;
    @JSONField(name = "title_expire_datetime")
    @NotNull
    private String titleExpirtDateTime = "";

    public final int getResult() {
        return this.result;
    }

    public final void setResult(int i) {
        this.result = i;
    }

    @NotNull
    public final String getTitleExpirtDateTime() {
        return this.titleExpirtDateTime;
    }

    public final void setTitleExpirtDateTime(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.titleExpirtDateTime = str;
    }
}
