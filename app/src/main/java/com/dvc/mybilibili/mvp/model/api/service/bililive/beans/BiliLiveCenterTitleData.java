//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
//import android.support.annotation.Keep;
//
//import com.alibaba.fastjson.annotation.JSONField;
//
//import org.jetbrains.annotations.NotNull;
//import android.support.annotation.Nullable;
//
//import java.util.ArrayList;
//
//
//
//
//@Keep
//////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData;", "", "()V", "list", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/ui/livecenter/LiveMyTitleData;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "more", "Lcom/bilibili/bililive/videoliveplayer/ui/livecenter/LiveMoreTitleData;", "getMore", "setMore", "showRenew", "", "getShowRenew", "()I", "setShowRenew", "(I)V", "showRenewLog", "", "BiliLiveTitleBase", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
///* compiled from: BL */
//public final class BiliLiveCenterTitleData {
//    @JSONField(name = "list")
//    @NotNull
//    private ArrayList<C10021j> list = new ArrayList();
//    @JSONField(name = "more")
//    @NotNull
//    private ArrayList<C10020i> more = new ArrayList();
//    @JSONField(name = "show_renew")
//    private int showRenew;
//
//    @Keep
//    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001:\u0001JB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010I\u001a\u00020!R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR \u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R\u001e\u00107\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R\u001e\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u001e\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\b\u00a8\u0006K"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData$BiliLiveTitleBase;", "Lcom/bilibili/bililive/videoliveplayer/ui/livecenter/LiveCenterTitleData;", "()V", "activity", "", "getActivity", "()Ljava/lang/String;", "setActivity", "(Ljava/lang/String;)V", "categories", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveTitleTag;", "Lkotlin/collections/ArrayList;", "getCategories", "()Ljava/util/ArrayList;", "setCategories", "(Ljava/util/ArrayList;)V", "colorful", "", "getColorful", "()I", "setColorful", "(I)V", "description", "getDescription", "setDescription", "expireTime", "getExpireTime", "setExpireTime", "h5Url", "getH5Url", "setH5Url", "isGet", "", "()Z", "setGet", "(Z)V", "levels", "", "getLevels", "()[J", "setLevels", "([J)V", "name", "getName", "setName", "score", "", "getScore", "()J", "setScore", "(J)V", "showRenew", "getShowRenew", "setShowRenew", "status", "getStatus", "setStatus", "title", "getTitle", "setTitle", "titlePic", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData$BiliLiveTitleBase$BiliLiveTitle;", "getTitlePic", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData$BiliLiveTitleBase$BiliLiveTitle;", "setTitlePic", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData$BiliLiveTitleBase$BiliLiveTitle;)V", "uid", "getUid", "setUid", "url", "getUrl", "setUrl", "showRenewBtn", "BiliLiveTitle", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//    /* compiled from: BL */
//    public static class BiliLiveTitleBase extends C2077g {
//        @JSONField(name = "activity")
//        @NotNull
//        private String activity = "";
//        @JSONField(name = "category")
//        @NotNull
//        private ArrayList<BiliLiveTitleTag> categories = new ArrayList();
//        @JSONField(name = "colorful")
//        private int colorful;
//        @JSONField(name = "description")
//        @NotNull
//        private String description = "";
//        @JSONField(name = "expire_time")
//        @Nullable
//        private String expireTime;
//        @JSONField(name = "h5_url")
//        @NotNull
//        private String h5Url = "";
//        @JSONField(name = "had")
//        private boolean isGet;
//        @JSONField(name = "level")
//        @Nullable
//        private long[] levels;
//        @JSONField(name = "name")
//        @Nullable
//        private String name;
//        @JSONField(name = "score")
//        private long score;
//        private int showRenew;
//        @JSONField(name = "status")
//        private int status;
//        @JSONField(name = "title")
//        @NotNull
//        private String title = "";
//        @JSONField(name = "title_pic")
//        @NotNull
//        private BiliLiveTitle titlePic = new BiliLiveTitle();
//        @JSONField(name = "uid")
//        private long uid;
//        @JSONField(name = "url")
//        @NotNull
//        private String url = "";
//
//        @Keep
//        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveCenterTitleData$BiliLiveTitleBase$BiliLiveTitle;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "imgHeight", "", "getImgHeight", "()I", "setImgHeight", "(I)V", "imgWidth", "getImgWidth", "setImgWidth", "title", "getTitle", "setTitle", "titleImg", "getTitleImg", "setTitleImg", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//        /* compiled from: BL */
//        public static final class BiliLiveTitle {
//            @JSONField(name = "id")
//            @NotNull
//            /* renamed from: id */
//            private String f5995id = "";
//            @JSONField(name = "height")
//            private int imgHeight;
//            @JSONField(name = "width")
//            private int imgWidth;
//            @JSONField(name = "title")
//            @NotNull
//            private String title = "";
//            @JSONField(name = "img")
//            @NotNull
//            private String titleImg = "";
//
//            @NotNull
//            public final String getId() {
//                return this.f5995id;
//            }
//
//            public final void setId(@NotNull String str) {
//    //            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//                this.f5995id = str;
//            }
//
//            @NotNull
//            public final String getTitle() {
//                return this.title;
//            }
//
//            public final void setTitle(@NotNull String str) {
//    //            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//                this.title = str;
//            }
//
//            @NotNull
//            public final String getTitleImg() {
//                return this.titleImg;
//            }
//
//            public final void setTitleImg(@NotNull String str) {
//    //            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//                this.titleImg = str;
//            }
//
//            public final int getImgWidth() {
//                return this.imgWidth;
//            }
//
//            public final void setImgWidth(int i) {
//                this.imgWidth = i;
//            }
//
//            public final int getImgHeight() {
//                return this.imgHeight;
//            }
//
//            public final void setImgHeight(int i) {
//                this.imgHeight = i;
//            }
//        }
//
//        public final long getUid() {
//            return this.uid;
//        }
//
//        public final void setUid(long j) {
//            this.uid = j;
//        }
//
//        public final boolean isGet() {
//            return this.isGet;
//        }
//
//        public final void setGet(boolean z) {
//            this.isGet = z;
//        }
//
//        @NotNull
//        public final String getTitle() {
//            return this.title;
//        }
//
//        public final void setTitle(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.title = str;
//        }
//
//        public final int getStatus() {
//            return this.status;
//        }
//
//        public final void setStatus(int i) {
//            this.status = i;
//        }
//
//        @NotNull
//        public final String getActivity() {
//            return this.activity;
//        }
//
//        public final void setActivity(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.activity = str;
//        }
//
//        @NotNull
//        public final String getDescription() {
//            return this.description;
//        }
//
//        public final void setDescription(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.description = str;
//        }
//
//        @NotNull
//        public final String getUrl() {
//            return this.url;
//        }
//
//        public final void setUrl(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.url = str;
//        }
//
//        @NotNull
//        public final String getH5Url() {
//            return this.h5Url;
//        }
//
//        public final void setH5Url(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.h5Url = str;
//        }
//
//        public final long getScore() {
//            return this.score;
//        }
//
//        public final void setScore(long j) {
//            this.score = j;
//        }
//
//        @NotNull
//        public final ArrayList<BiliLiveTitleTag> getCategories() {
//            return this.categories;
//        }
//
//        public final void setCategories(@NotNull ArrayList<BiliLiveTitleTag> arrayList) {
////            //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
//            this.categories = arrayList;
//        }
//
//        @Nullable
//        public final long[] getLevels() {
//            return this.levels;
//        }
//
//        public final void setLevels(@Nullable long[] jArr) {
//            this.levels = jArr;
//        }
//
//        @NotNull
//        public final BiliLiveTitle getTitlePic() {
//            return this.titlePic;
//        }
//
//        public final void setTitlePic(@NotNull BiliLiveTitle biliLiveTitle) {
////            //Intrinsics.checkParameterIsNotNull(biliLiveTitle, "<set-?>");
//            this.titlePic = biliLiveTitle;
//        }
//
//        public final int getColorful() {
//            return this.colorful;
//        }
//
//        public final void setColorful(int i) {
//            this.colorful = i;
//        }
//
//        @Nullable
//        public final String getExpireTime() {
//            return this.expireTime;
//        }
//
//        public final void setExpireTime(@Nullable String str) {
//            this.expireTime = str;
//        }
//
//        @Nullable
//        public final String getName() {
//            return this.name;
//        }
//
//        public final void setName(@Nullable String str) {
//            this.name = str;
//        }
//
//        public final int getShowRenew() {
//            return this.showRenew;
//        }
//
//        public final void setShowRenew(int i) {
//            this.showRenew = i;
//        }
//
//        public final boolean showRenewBtn() {
//            return this.showRenew == 1;
//        }
//    }
//
//    @NotNull
//    public final ArrayList<C10021j> getList() {
//        return this.list;
//    }
//
//    public final void setList(@NotNull ArrayList<C10021j> arrayList) {
//        //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
//        this.list = arrayList;
//    }
//
//    @NotNull
//    public final ArrayList<C10020i> getMore() {
//        return this.more;
//    }
//
//    public final void setMore(@NotNull ArrayList<C10020i> arrayList) {
//        //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
//        this.more = arrayList;
//    }
//
//    public final int getShowRenew() {
//        return this.showRenew;
//    }
//
//    public final void setShowRenew(int i) {
//        this.showRenew = i;
//    }
//
//    public final boolean showRenewLog() {
//        return this.showRenew == 1;
//    }
//}
