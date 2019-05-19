package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.content.Context;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.List;



@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox;", "", "()V", "mails", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Mail;", "getMails", "()Ljava/util/List;", "setMails", "(Ljava/util/List;)V", "pageInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Page;", "getPageInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Page;", "setPageInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Page;)V", "redNotice", "", "getRedNotice", "()I", "setRedNotice", "(I)V", "showNotice", "", "Mail", "Page", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveRenewCardInBox {
    @JSONField(name = "list")
    @Nullable
    private List<Mail> mails;
    @JSONField(name = "page")
    @Nullable
    private Page pageInfo;
    @JSONField(name = "red_notice")
    private int redNotice;

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011\u00a8\u0006+"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Mail;", "", "()V", "expireDay", "", "getExpireDay", "()I", "setExpireDay", "(I)V", "mailId", "getMailId", "setMailId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "num", "getNum", "setNum", "sendMsg", "getSendMsg", "setSendMsg", "senderName", "getSenderName", "setSenderName", "status", "getStatus", "setStatus", "url", "getUrl", "setUrl", "getBtnText", "context", "Landroid/content/Context;", "isExpired", "", "isWaitingForGet", "isWhiteBackground", "setStatusAlreadyGet", "", "setStatusDeleted", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Mail {
        @JSONField(name = "expire_day")
        private int expireDay = -1;
        @JSONField(name = "mail_id")
        private int mailId;
        @JSONField(name = "name")
        @NotNull
        private String name = "";
        @JSONField(name = "num")
        private int num;
        @JSONField(name = "send_msg")
        @NotNull
        private String sendMsg = "";
        @JSONField(name = "send_uname")
        @NotNull
        private String senderName = "";
        @JSONField(name = "status")
        private int status;
        @JSONField(name = "img_url")
        @NotNull
        private String url = "";

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final void setName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.name = str;
        }

        public final int getMailId() {
            return this.mailId;
        }

        public final void setMailId(int i) {
            this.mailId = i;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.url = str;
        }

        public final int getNum() {
            return this.num;
        }

        public final void setNum(int i) {
            this.num = i;
        }

        public final int getStatus() {
            return this.status;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final int getExpireDay() {
            return this.expireDay;
        }

        public final void setExpireDay(int i) {
            this.expireDay = i;
        }

        @NotNull
        public final String getSenderName() {
            return this.senderName;
        }

        public final void setSenderName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.senderName = str;
        }

        @NotNull
        public final String getSendMsg() {
            return this.sendMsg;
        }

        public final void setSendMsg(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.sendMsg = str;
        }

        @NotNull
        public final String getBtnText(@NotNull Context context) {
//            //Intrinsics.checkParameterIsNotNull(context, C25738au.f73767aD);
            String string;
            switch (this.status) {
                case 1:
                    string = context.getString(2131759896);
        //            //Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri\u2026live_renewal_already_get)");
                    return string;
                case 2:
                    string = context.getString(2131759900);
        //            //Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.live_renewal_deleted)");
                    return string;
                case 3:
                    string = context.getString(2131759899);
        //            //Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.live_renewal_delete)");
                    return string;
                case 4:
                    string = context.getString(2131759910);
        //            //Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri\u2026ive_renewal_wait_for_get)");
                    return string;
                default:
                    return "";
            }
        }

        public final boolean isWaitingForGet() {
            return this.status == 4;
        }

        public final boolean isExpired() {
            return this.status == 3;
        }

        public final void setStatusAlreadyGet() {
            this.status = 1;
        }

        public final void setStatusDeleted() {
            this.status = 2;
        }

        public final boolean isWhiteBackground() {
            return this.status == 1 || this.status == 2;
        }
    }

    @Keep
    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRenewCardInBox$Page;", "", "()V", "page", "", "getPage", "()I", "setPage", "(I)V", "pageSize", "getPageSize", "setPageSize", "totalCount", "getTotalCount", "setTotalCount", "totalPage", "getTotalPage", "setTotalPage", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
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

    public final int getRedNotice() {
        return this.redNotice;
    }

    public final void setRedNotice(int i) {
        this.redNotice = i;
    }

    @Nullable
    public final List<Mail> getMails() {
        return this.mails;
    }

    public final void setMails(@Nullable List<Mail> list) {
        this.mails = list;
    }

    @Nullable
    public final Page getPageInfo() {
        return this.pageInfo;
    }

    public final void setPageInfo(@Nullable Page page) {
        this.pageInfo = page;
    }

    public final boolean showNotice() {
        return this.redNotice == 1;
    }
}
