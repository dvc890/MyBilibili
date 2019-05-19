package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;


////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveGiftRank;", "", "()V", "bgImg", "", "color", "h5Url", "iconUrl", "rankDesc", "roomId", "", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveGiftRank {
    @JSONField(name = "bg_img_android")
    @NotNull
    //@JvmField
    public String bgImg = "";
    @JSONField(name = "color")
    @NotNull
    //@JvmField
    public String color = "";
    @JSONField(name = "h5_url")
    @NotNull
    //@JvmField
    public String h5Url = "";
    @JSONField(name = "icon_url")
    @NotNull
    //@JvmField
    public String iconUrl = "";
    @JSONField(name = "rank_desc")
    @NotNull
    //@JvmField
    public String rankDesc = "";
    @JSONField(name = "roomid")
    //@JvmField
    public int roomId;
}
