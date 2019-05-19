package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.skin;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;





@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/skin/BiliLiveSkinItem;", "", "()V", "danmuDrawable", "", "dividerColor", "highlightColor", "majorColor", "minorColor", "tabDrawable", "tagColor", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "version", "verticalDrawable", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveSkinItem {
    @JSONField(name = "img_danmu_bg")
    @NotNull
    //@JvmField
    public String danmuDrawable = "";
    @JSONField(name = "color_divider_line")
    @NotNull
    //@JvmField
    public String dividerColor = "";
    @JSONField(name = "color_highlight")
    @NotNull
    //@JvmField
    public String highlightColor = "";
    @JSONField(name = "color_text_major")
    @NotNull
    //@JvmField
    public String majorColor = "";
    @JSONField(name = "color_text_minor")
    @NotNull
    //@JvmField
    public String minorColor = "";
    @JSONField(name = "img_tab_bg")
    @NotNull
    //@JvmField
    public String tabDrawable = "";
    @JSONField(name = "color_tag_bg")
    @NotNull
    //@JvmField
    public String tagColor = "";
    @NotNull
    private String url = "";
    @JSONField(name = "version")
    @NotNull
    //@JvmField
    public String version = "";
    @JSONField(name = "img_vertical_bg")
    @NotNull
    //@JvmField
    public String verticalDrawable = "";

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }
}
