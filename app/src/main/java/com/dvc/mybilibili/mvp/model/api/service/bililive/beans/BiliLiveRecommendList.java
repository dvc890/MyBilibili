//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
//import org.jetbrains.annotations.NotNull;
//import android.support.annotation.Nullable;
//
//import java.util.ArrayList;
//
//////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR4\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList;", "", "()V", "areaId", "", "areaId$annotations", "getAreaId", "()I", "setAreaId", "(I)V", "list", "Ljava/util/ArrayList;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$RecommendItem;", "Lkotlin/collections/ArrayList;", "list$annotations", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "title", "", "title$annotations", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "$serializer", "Companion", "RecommendItem", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//@Serializable
///* compiled from: BL */
//public final class BiliLiveRecommendList {
//    public static final Companion Companion = new Companion();
//    public static final int FOLLOWED = 1;
//    public static final int UNFOLLOWED = 0;
//    private int areaId;
//    @NotNull
//    private ArrayList<RecommendItem> list;
//    @NotNull
//    private String title;
//
//    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$Companion;", "", "()V", "FOLLOWED", "", "UNFOLLOWED", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//    /* compiled from: BL */
//    public static final class Companion {
//        @NotNull
//        public final KSerializer<BiliLiveRecommendList> serializer() {
//            return BiliLiveRecommendList$$serializer.INSTANCE;
//        }
//
//        private Companion() {
//        }
//
//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
//    }
//
//    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b>\b\u0007\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0005\u00a2\u0006\u0002\u0010\u0002R4\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u00020\u00058\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R$\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R$\u0010(\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R$\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b,\u0010\u000f\"\u0004\b.\u0010\u0011R$\u0010/\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R$\u00103\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R$\u00107\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R$\u0010?\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R$\u0010C\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bD\u0010\u0002\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u0010\u0018R$\u0010G\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R$\u0010K\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bL\u0010\u0002\u001a\u0004\bM\u0010\u0016\"\u0004\bN\u0010\u0018\u00a8\u0006Q"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$RecommendItem;", "", "()V", "acceptQuality", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "acceptQuality$annotations", "getAcceptQuality", "()Ljava/util/ArrayList;", "setAcceptQuality", "(Ljava/util/ArrayList;)V", "areaId", "areaId$annotations", "getAreaId", "()I", "setAreaId", "(I)V", "areaName", "", "areaName$annotations", "getAreaName", "()Ljava/lang/String;", "setAreaName", "(Ljava/lang/String;)V", "authorId", "authorId$annotations", "getAuthorId", "broadcastType", "broadcastType$annotations", "getBroadcastType", "setBroadcastType", "cover", "cover$annotations", "getCover", "setCover", "currentQuality", "currentQuality$annotations", "getCurrentQuality", "setCurrentQuality", "face", "face$annotations", "getFace", "setFace", "isFocus", "isFocus$annotations", "setFocus", "link", "link$annotations", "getLink", "setLink", "name", "name$annotations", "getName", "setName", "online", "online$annotations", "getOnline", "setOnline", "parentId", "parentId$annotations", "getParentId", "setParentId", "parentName", "parentName$annotations", "getParentName", "setParentName", "playUrl", "playUrl$annotations", "getPlayUrl", "setPlayUrl", "roomId", "roomId$annotations", "getRoomId", "setRoomId", "title", "title$annotations", "getTitle", "setTitle", "$serializer", "Companion", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//    @Serializable
//    /* compiled from: BL */
//    public static final class RecommendItem {
//        public static final Companion Companion = new Companion();
//        @NotNull
//        private ArrayList<Integer> acceptQuality;
//        private int areaId;
//        @NotNull
//        private String areaName;
//        private final int authorId;
//        private int broadcastType;
//        @NotNull
//        private String cover;
//        private int currentQuality;
//        @NotNull
//        private String face;
//        private int isFocus;
//        @NotNull
//        private String link;
//        @NotNull
//        private String name;
//        private int online;
//        private int parentId;
//        @NotNull
//        private String parentName;
//        @NotNull
//        private String playUrl;
//        private int roomId;
//        @NotNull
//        private String title;
//
//        ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$RecommendItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$RecommendItem;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
//        /* compiled from: BL */
//        public static final class Companion {
//            @NotNull
//            public final KSerializer<RecommendItem> serializer() {
//                return BiliLiveRecommendList$RecommendItem$$serializer.INSTANCE;
//            }
//
//            private Companion() {
//            }
//
//            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//                this();
//            }
//        }
//
//        public RecommendItem(int i, @SerialName("roomid") int i2, @Nullable @SerialName("title") String str, @Nullable @SerialName("uname") String str2, @SerialName("online") int i3, @Nullable @SerialName("cover") String str3, @Nullable @SerialName("link") String str4, @Nullable @SerialName("face") String str5, @SerialName("area_v2_parent_id") int i4, @Nullable @SerialName("area_v2_parent_name") String str6, @SerialName("area_v2_id") int i5, @Nullable @SerialName("area_v2_name") String str7, @Nullable @SerialName("play_url") String str8, @SerialName("current_quality") int i6, @Nullable @SerialName("accept_quality") ArrayList<Integer> arrayList, @SerialName("broadcast_type") int i7, @SerialName("is_focus") int i8, @Nullable SerializationConstructorMarker serializationConstructorMarker) {
//            int i9 = i;
//            if ((i9 & 1) == 0) {
//                throw new MissingFieldException("roomid");
//            }
//            this.roomId = i2;
//            if ((i9 & 2) == 0) {
//                throw new MissingFieldException("title");
//            }
//            this.title = str;
//            if ((i9 & 4) == 0) {
//                throw new MissingFieldException("uname");
//            }
//            this.name = str2;
//            if ((i9 & 8) == 0) {
//                throw new MissingFieldException("online");
//            }
//            this.online = i3;
//            if ((i9 & 16) == 0) {
//                throw new MissingFieldException("cover");
//            }
//            this.cover = str3;
//            if ((i9 & 32) == 0) {
//                throw new MissingFieldException("link");
//            }
//            this.link = str4;
//            if ((i9 & 64) == 0) {
//                throw new MissingFieldException("face");
//            }
//            this.face = str5;
//            if ((i9 & 128) == 0) {
//                throw new MissingFieldException("area_v2_parent_id");
//            }
//            this.parentId = i4;
//            if ((i9 & 256) == 0) {
//                throw new MissingFieldException("area_v2_parent_name");
//            }
//            this.parentName = str6;
//            if ((i9 & 512) == 0) {
//                throw new MissingFieldException("area_v2_id");
//            }
//            this.areaId = i5;
//            if ((i9 & 1024) == 0) {
//                throw new MissingFieldException("area_v2_name");
//            }
//            this.areaName = str7;
//            if ((i9 & 2048) == 0) {
//                throw new MissingFieldException("play_url");
//            }
//            this.playUrl = str8;
//            if ((i9 & 4096) == 0) {
//                throw new MissingFieldException("current_quality");
//            }
//            this.currentQuality = i6;
//            if ((i9 & 8192) == 0) {
//                throw new MissingFieldException("accept_quality");
//            }
//            this.acceptQuality = arrayList;
//            if ((i9 & 16384) == 0) {
//                throw new MissingFieldException("broadcast_type");
//            }
//            this.broadcastType = i7;
//            if ((i9 & 32768) == 0) {
//                throw new MissingFieldException("is_focus");
//            }
//            this.isFocus = i8;
//        }
//
//        @SerialName("accept_quality")
//        public static /* synthetic */ void acceptQuality$annotations() {
//        }
//
//        @SerialName("area_v2_id")
//        public static /* synthetic */ void areaId$annotations() {
//        }
//
//        @SerialName("area_v2_name")
//        public static /* synthetic */ void areaName$annotations() {
//        }
//
//        @Transient
//        public static /* synthetic */ void authorId$annotations() {
//        }
//
//        @SerialName("broadcast_type")
//        public static /* synthetic */ void broadcastType$annotations() {
//        }
//
//        @SerialName("cover")
//        public static /* synthetic */ void cover$annotations() {
//        }
//
//        @SerialName("current_quality")
//        public static /* synthetic */ void currentQuality$annotations() {
//        }
//
//        @SerialName("face")
//        public static /* synthetic */ void face$annotations() {
//        }
//
//        @SerialName("is_focus")
//        public static /* synthetic */ void isFocus$annotations() {
//        }
//
//        @SerialName("link")
//        public static /* synthetic */ void link$annotations() {
//        }
//
//        @SerialName("uname")
//        public static /* synthetic */ void name$annotations() {
//        }
//
//        @SerialName("online")
//        public static /* synthetic */ void online$annotations() {
//        }
//
//        @SerialName("area_v2_parent_id")
//        public static /* synthetic */ void parentId$annotations() {
//        }
//
//        @SerialName("area_v2_parent_name")
//        public static /* synthetic */ void parentName$annotations() {
//        }
//
//        @SerialName("play_url")
//        public static /* synthetic */ void playUrl$annotations() {
//        }
//
//        @SerialName("roomid")
//        public static /* synthetic */ void roomId$annotations() {
//        }
//
//        @SerialName("title")
//        public static /* synthetic */ void title$annotations() {
//        }
//
//        public void write$Self(@NotNull KOutput kOutput, @NotNull KSerialClassDesc kSerialClassDesc) {
////            //Intrinsics.checkParameterIsNotNull(kOutput, "output");
////            //Intrinsics.checkParameterIsNotNull(kSerialClassDesc, "serialDesc");
//            kOutput.writeIntElementValue(kSerialClassDesc, 0, this.roomId);
//            kOutput.writeStringElementValue(kSerialClassDesc, 1, this.title);
//            kOutput.writeStringElementValue(kSerialClassDesc, 2, this.name);
//            kOutput.writeIntElementValue(kSerialClassDesc, 3, this.online);
//            kOutput.writeStringElementValue(kSerialClassDesc, 4, this.cover);
//            kOutput.writeStringElementValue(kSerialClassDesc, 5, this.link);
//            kOutput.writeStringElementValue(kSerialClassDesc, 6, this.face);
//            kOutput.writeIntElementValue(kSerialClassDesc, 7, this.parentId);
//            kOutput.writeStringElementValue(kSerialClassDesc, 8, this.parentName);
//            kOutput.writeIntElementValue(kSerialClassDesc, 9, this.areaId);
//            kOutput.writeStringElementValue(kSerialClassDesc, 10, this.areaName);
//            kOutput.writeStringElementValue(kSerialClassDesc, 11, this.playUrl);
//            kOutput.writeIntElementValue(kSerialClassDesc, 12, this.currentQuality);
//            kOutput.writeSerializableElementValue(kSerialClassDesc, 13, new ArrayListSerializer(IntSerializer.INSTANCE), this.acceptQuality);
//            kOutput.writeIntElementValue(kSerialClassDesc, 14, this.broadcastType);
//            kOutput.writeIntElementValue(kSerialClassDesc, 15, this.isFocus);
//        }
//
//        public RecommendItem() {
//            this.title = "";
//            this.name = "";
//            this.cover = "";
//            this.link = "";
//            this.face = "";
//            this.parentName = "";
//            this.areaName = "";
//            this.playUrl = "";
//            this.acceptQuality = new ArrayList();
//            this.broadcastType = -1;
//        }
//
//        public final int getRoomId() {
//            return this.roomId;
//        }
//
//        public final void setRoomId(int i) {
//            this.roomId = i;
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
//        @NotNull
//        public final String getName() {
//            return this.name;
//        }
//
//        public final void setName(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.name = str;
//        }
//
//        public final int getOnline() {
//            return this.online;
//        }
//
//        public final void setOnline(int i) {
//            this.online = i;
//        }
//
//        @NotNull
//        public final String getCover() {
//            return this.cover;
//        }
//
//        public final void setCover(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.cover = str;
//        }
//
//        @NotNull
//        public final String getLink() {
//            return this.link;
//        }
//
//        public final void setLink(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.link = str;
//        }
//
//        @NotNull
//        public final String getFace() {
//            return this.face;
//        }
//
//        public final void setFace(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.face = str;
//        }
//
//        public final int getParentId() {
//            return this.parentId;
//        }
//
//        public final void setParentId(int i) {
//            this.parentId = i;
//        }
//
//        @NotNull
//        public final String getParentName() {
//            return this.parentName;
//        }
//
//        public final void setParentName(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.parentName = str;
//        }
//
//        public final int getAreaId() {
//            return this.areaId;
//        }
//
//        public final void setAreaId(int i) {
//            this.areaId = i;
//        }
//
//        @NotNull
//        public final String getAreaName() {
//            return this.areaName;
//        }
//
//        public final void setAreaName(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.areaName = str;
//        }
//
//        @NotNull
//        public final String getPlayUrl() {
//            return this.playUrl;
//        }
//
//        public final void setPlayUrl(@NotNull String str) {
////            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//            this.playUrl = str;
//        }
//
//        public final int getCurrentQuality() {
//            return this.currentQuality;
//        }
//
//        public final void setCurrentQuality(int i) {
//            this.currentQuality = i;
//        }
//
//        @NotNull
//        public final ArrayList<Integer> getAcceptQuality() {
//            return this.acceptQuality;
//        }
//
//        public final void setAcceptQuality(@NotNull ArrayList<Integer> arrayList) {
////            //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
//            this.acceptQuality = arrayList;
//        }
//
//        public final int getBroadcastType() {
//            return this.broadcastType;
//        }
//
//        public final void setBroadcastType(int i) {
//            this.broadcastType = i;
//        }
//
//        public final int isFocus() {
//            return this.isFocus;
//        }
//
//        public final void setFocus(int i) {
//            this.isFocus = i;
//        }
//
//        public final int getAuthorId() {
//            return this.authorId;
//        }
//    }
//
//    @Transient
//    public static /* synthetic */ void areaId$annotations() {
//    }
//
//    @Optional
//    @SerialName("list")
//    public static /* synthetic */ void list$annotations() {
//    }
//
//    @SerialName("title")
//    public static /* synthetic */ void title$annotations() {
//    }
//
//    public void write$Self(@NotNull KOutput kOutput, @NotNull KSerialClassDesc kSerialClassDesc) {
//        //Intrinsics.checkParameterIsNotNull(kOutput, "output");
//        //Intrinsics.checkParameterIsNotNull(kSerialClassDesc, "serialDesc");
//        kOutput.writeStringElementValue(kSerialClassDesc, 0, this.title);
//        kOutput.writeSerializableElementValue(kSerialClassDesc, 1, new ArrayListSerializer(BiliLiveRecommendList$RecommendItem$$serializer.INSTANCE), this.list);
//    }
//
//    public BiliLiveRecommendList() {
//        this.title = "";
//        this.list = new ArrayList();
//    }
//
//    @NotNull
//    public final String getTitle() {
//        return this.title;
//    }
//
//    public final void setTitle(@NotNull String str) {
//        //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
//        this.title = str;
//    }
//
//    public BiliLiveRecommendList(int i, @Nullable @SerialName("title") String str, @Optional @Nullable @SerialName("list") ArrayList<RecommendItem> arrayList, @Nullable SerializationConstructorMarker serializationConstructorMarker) {
//        if ((i & 1) == 0) {
//            throw new MissingFieldException("title");
//        }
//        this.title = str;
//        if ((i & 2) != 0) {
//            this.list = arrayList;
//        } else {
//            this.list = new ArrayList();
//        }
//    }
//
//    @NotNull
//    public final ArrayList<RecommendItem> getList() {
//        return this.list;
//    }
//
//    public final void setList(@NotNull ArrayList<RecommendItem> arrayList) {
//        //Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
//        this.list = arrayList;
//    }
//
//    public final int getAreaId() {
//        return this.areaId;
//    }
//
//    public final void setAreaId(int i) {
//        this.areaId = i;
//    }
//}
