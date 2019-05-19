package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import org.jetbrains.annotations.NotNull;

////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/ui/live/home/BaseCard;", "Lcom/bilibili/bililive/videoliveplayer/ui/live/home/BaseHomeEvent;", "()V", "moduleId", "", "getModuleId", "()I", "setModuleId", "(I)V", "moduleName", "", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "moduleType", "getModuleType", "setModuleType", "pageIndex", "getPageIndex", "setPageIndex", "reportPosition", "getReportPosition", "setReportPosition", "injectModule", "", "moduleInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleInfo;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.home.f */
public class C2992f extends C2072h {
    private int moduleId;
    @NotNull
    private String moduleName = "";
    private int moduleType;
    private int pageIndex = 1;
    private int reportPosition = 1;

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final int getReportPosition() {
        return this.reportPosition;
    }

    public final void setReportPosition(int i) {
        this.reportPosition = i;
    }

    public final int getModuleId() {
        return this.moduleId;
    }

    public final void setModuleId(int i) {
        this.moduleId = i;
    }

    public final int getModuleType() {
        return this.moduleType;
    }

    public final void setModuleType(int i) {
        this.moduleType = i;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    public final void setModuleName(@NotNull String str) {
        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.moduleName = str;
    }

    public final void injectModule(@NotNull BiliLiveHomePage.ModuleInfo moduleInfo) {
        //Intrinsics.checkParameterIsNotNull(moduleInfo, "moduleInfo");
        this.moduleId = moduleInfo.getId();
        this.moduleType = moduleInfo.getType();
        this.moduleName = moduleInfo.getTitle();
    }
}
