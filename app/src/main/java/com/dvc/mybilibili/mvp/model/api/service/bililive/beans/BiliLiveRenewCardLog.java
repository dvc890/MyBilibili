package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import org.jetbrains.annotations.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

import java.util.List;

////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog;", "", "()V", "logs", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$CardLog;", "getLogs", "()Ljava/util/List;", "setLogs", "(Ljava/util/List;)V", "pageInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$Page;", "getPageInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$Page;", "setPageInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$Page;)V", "CardLog", "Page", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRenewCardLog {
    @JSONField(name = "list")
    @Nullable
    private List<CardLog> logs;
    @JSONField(name = "page")
    @Nullable
    private Page pageInfo;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$CardLog;", "", "()V", "cardId", "", "getCardId", "()I", "setCardId", "(I)V", "cardName", "", "getCardName", "()Ljava/lang/String;", "setCardName", "(Ljava/lang/String;)V", "expireDay", "getExpireDay", "setExpireDay", "logMsg", "getLogMsg", "setLogMsg", "startDateTime", "getStartDateTime", "setStartDateTime", "url", "getUrl", "setUrl", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class CardLog {
        @JSONField(name = "card_id")
        private int cardId = 1;
        @JSONField(name = "name")
        @NotNull
        private String cardName = "";
        @JSONField(name = "expire_day")
        private int expireDay;
        @JSONField(name = "log_msg")
        @NotNull
        private String logMsg = "";
        @JSONField(name = "start_datetime")
        @NotNull
        private String startDateTime = "";
        @JSONField(name = "img_url")
        @NotNull
        private String url = "";

        public final int getCardId() {
            return this.cardId;
        }

        public final void setCardId(int i) {
            this.cardId = i;
        }

        @NotNull
        public final String getCardName() {
            return this.cardName;
        }

        public final void setCardName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.cardName = str;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.url = str;
        }

        public final int getExpireDay() {
            return this.expireDay;
        }

        public final void setExpireDay(int i) {
            this.expireDay = i;
        }

        @NotNull
        public final String getLogMsg() {
            return this.logMsg;
        }

        public final void setLogMsg(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.logMsg = str;
        }

        @NotNull
        public final String getStartDateTime() {
            return this.startDateTime;
        }

        public final void setStartDateTime(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.startDateTime = str;
        }
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardLog$Page;", "", "()V", "page", "", "getPage", "()I", "setPage", "(I)V", "pageSize", "getPageSize", "setPageSize", "totalCount", "getTotalCount", "setTotalCount", "totalPage", "getTotalPage", "setTotalPage", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Page {
        @JSONField(name = "page")
        private int page = 1;
        @JSONField(name = "page_size")
        private int pageSize;
        @JSONField(name = "total_count")
        private int totalCount;
        @JSONField(name = "total_page")
        private int totalPage;

        public final int getPage() {
            return this.page;
        }

        public final void setPage(int i) {
            this.page = i;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final void setPageSize(int i) {
            this.pageSize = i;
        }

        public final int getTotalPage() {
            return this.totalPage;
        }

        public final void setTotalPage(int i) {
            this.totalPage = i;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final void setTotalCount(int i) {
            this.totalCount = i;
        }
    }

    @Nullable
    public final List<CardLog> getLogs() {
        return this.logs;
    }

    public final void setLogs(@Nullable List<CardLog> list) {
        this.logs = list;
    }

    @Nullable
    public final Page getPageInfo() {
        return this.pageInfo;
    }

    public final void setPageInfo(@Nullable Page page) {
        this.pageInfo = page;
    }
}
