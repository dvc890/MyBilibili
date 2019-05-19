package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveLotteryBoxInfo;", "", "()V", "aid", "", "curTime", "h5Url", "", "hideTime", "icon", "lotteryTime", "nextJoinTime", "prizePersonNum", "sendNum", "isExpired", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveLotteryBoxInfo {
    @JSONField(name = "aid")
    //@JvmField
    public int aid;
    @JSONField(name = "current_time")
    //@JvmField
    public int curTime;
    @JSONField(name = "h5_url")
    @NotNull
    //@JvmField
    public String h5Url = "";
    @JSONField(name = "hide_time")
    //@JvmField
    public int hideTime;
    @JSONField(name = "icon")
    @NotNull
    //@JvmField
    public String icon = "";
    @JSONField(name = "lottery_time")
    //@JvmField
    public int lotteryTime;
    @JSONField(name = "next_join_time")
    //@JvmField
    public int nextJoinTime;
    @JSONField(name = "prize_person_num")
    //@JvmField
    public int prizePersonNum;
    @JSONField(name = "send_num")
    //@JvmField
    public int sendNum;

    public final boolean isExpired() {
        return this.curTime >= this.hideTime;
    }
}
