package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;




////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHourRankAwards;", "Ljava/io/Serializable;", "()V", "content", "", "face", "lifeCycle", "", "rankDesc", "rooomId", "ruid", "", "uname", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveHourRankAwards implements Serializable {
    @NotNull
    private static final String ALL_TOP_ACTION = "all_top3";
    public static final Companion Companion = new Companion();
    @JSONField(name = "content")
    @NotNull
    //@JvmField
    public String content = "";
    @JSONField(name = "face")
    @NotNull
    //@JvmField
    public String face = "";
    @JSONField(name = "life_cycle")
    //@JvmField
    public long lifeCycle;
    @JSONField(name = "rank_desc")
    @NotNull
    //@JvmField
    public String rankDesc = "";
    @JSONField(name = "roomid")
    @NotNull
    //@JvmField
    public String rooomId = "";
    @JSONField(name = "ruid")
    //@JvmField
    public int ruid;
    @JSONField(name = "uname")
    @NotNull
    //@JvmField
    public String uname = "";

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHourRankAwards$Companion;", "", "()V", "ALL_TOP_ACTION", "", "getALL_TOP_ACTION", "()Ljava/lang/String;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
        private Companion() {
        }

//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }

        @NotNull
        public final String getALL_TOP_ACTION() {
            return BiliLiveHourRankAwards.ALL_TOP_ACTION;
        }
    }
}
