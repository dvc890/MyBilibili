package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveBannerItem;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "img", "", "getImg", "()Ljava/lang/String;", "setImg", "(Ljava/lang/String;)V", "link", "getLink", "setLink", "title", "getTitle", "setTitle", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveBannerItem {
    @JSONField(name = "id")
    /* renamed from: id */
    private int f5993id;
    @JSONField(name = "img")
    @NotNull
    private String img = "";
    @JSONField(name = "link")
    @NotNull
    private String link = "";
    @JSONField(name = "title")
    @NotNull
    private String title = "";

    public final int getId() {
        return this.f5993id;
    }

    public final void setId(int i) {
        this.f5993id = i;
    }

    @NotNull
    public final String getImg() {
        return this.img;
    }

    public final void setImg(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.img = str;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.link = str;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }
}
