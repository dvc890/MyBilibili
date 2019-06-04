package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import android.support.annotation.Nullable;

import java.util.LinkedList;
import java.util.List;



////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 62\u00020\u0001:\u0013123456789:;<=>?@ABCB\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR&\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR&\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001e\u0010,\u001a\u00020#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'\u00a8\u0006D"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage;", "", "()V", "activities", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleActivity;", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "activityCardV2", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleActivityV2;", "getActivityCardV2", "setActivityCardV2", "attentions", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleAttentions;", "getAttentions", "setAttentions", "banner", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleBanner;", "getBanner", "setBanner", "entrancesV2", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleEntrancesV2;", "getEntrancesV2", "setEntrancesV2", "guardTip", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleGuardTip;", "getGuardTip", "setGuardTip", "hourRank", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleHourRank;", "getHourRank", "setHourRank", "interval", "", "getInterval", "()I", "setInterval", "(I)V", "rooms", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleRooms;", "getRooms", "setRooms", "tianMa", "getTianMa", "setTianMa", "getSortedModuleList", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "ActivityCard", "ActivityData", "ActivityRoom", "ActivityVideo", "Card", "Companion", "DynamicInfo", "ModuleActivity", "ModuleActivityV2", "ModuleAttentions", "ModuleBanner", "ModuleCommonTags", "ModuleEntrances", "ModuleEntrancesV2", "ModuleGuardTip", "ModuleHourRank", "ModuleInfo", "ModuleRooms", "ModuleUnit", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class BiliLiveHomePage {
    public static final Companion Companion = new Companion();
    public static final int HOME_ACTIVITY_V2_STATUS_SUBSCRIBE = 1;
    public static final int HOME_ACTIVITY_V2_STATUS_SUBSCRIBED = 2;
    public static final int MODULE_TYPE_ACTIVITY = 11;
    public static final int MODULE_TYPE_AREA_SQUARE = 10;
    public static final int MODULE_TYPE_AREA_STD = 9;
    public static final int MODULE_TYPE_BANNER = 1;
    public static final int MODULE_TYPE_ENTRANCES = 2;
    public static final int MODULE_TYPE_ENTRANCES_V2 = 15;
    public static final int MODULE_TYPE_FOLLOW = 8;
    public static final int MODULE_TYPE_GUARD = 14;
    public static final int MODULE_TYPE_HOUR_RANK = 5;
    public static final int MODULE_TYPE_OPERATION_SQUARE = 4;
    public static final int MODULE_TYPE_OPERATION_STD = 3;
    public static final int MODULE_TYPE_REC_SQUARE = 7;
    public static final int MODULE_TYPE_REC_STD = 6;
    public static final int MODULE_TYPE_TAGS = 12;
    public static final int MODULE_TYPE_TAG_ROOM = 13;
    @JSONField(name = "activity_card")
    @Nullable
    private List<ModuleActivity> activities;
    @JSONField(name = "activity_card_v2")
    @Nullable
    private List<ModuleActivityV2> activityCardV2;
    @JSONField(name = "my_idol")
    @Nullable
    private List<ModuleAttentions> attentions;
    @JSONField(name = "banner")
    @Nullable
    private List<ModuleBanner> banner;
    @JSONField(name = "area_entrance_v2")
    @Nullable
    private List<ModuleEntrancesV2> entrancesV2;
    @JSONField(name = "sea_patrol")
    @Nullable
    private List<ModuleGuardTip> guardTip;
    @JSONField(name = "hour_rank")
    @Nullable
    private List<ModuleHourRank> hourRank;
    @JSONField(name = "interval")
    private int interval;
    @JSONField(name = "room_list")
    @Nullable
    private List<ModuleRooms> rooms;
    @JSONField(name = "is_sky_horse_gray")
    private int tianMa;

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\bI\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u00a3\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a4\u00010\u0004R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001e\u0010+\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001e\u0010.\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001e\u00101\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR\u001e\u00104\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R&\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR\u001e\u0010;\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001e\u0010>\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001e\u0010A\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R\u001e\u0010D\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001e\u0010G\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001e\u0010J\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001e\u0010M\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001e\u0010P\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R\u001e\u0010S\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000eR\u001e\u0010V\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR\u001a\u0010Y\u001a\u00020ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010_\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010$\"\u0004\ba\u0010&R\u001a\u0010b\u001a\u00020ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\\\"\u0004\bc\u0010^R\u001e\u0010d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR\u001e\u0010g\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010$\"\u0004\bi\u0010&R\u001e\u0010j\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010$\"\u0004\bl\u0010&R\u001e\u0010m\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0012\"\u0004\bo\u0010\u0014R\u001e\u0010p\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010$\"\u0004\br\u0010&R\u001e\u0010s\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\f\"\u0004\bu\u0010\u000eR\u001e\u0010v\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\f\"\u0004\bx\u0010\u000eR\u001e\u0010y\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\f\"\u0004\b{\u0010\u000eR\u001e\u0010|\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\f\"\u0004\b~\u0010\u000eR \u0010\u007f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\f\"\u0005\b\u0081\u0001\u0010\u000eR!\u0010\u0082\u0001\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0012\"\u0005\b\u0084\u0001\u0010\u0014R!\u0010\u0085\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\f\"\u0005\b\u0087\u0001\u0010\u000eR!\u0010\u0088\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\f\"\u0005\b\u008a\u0001\u0010\u000eR!\u0010\u008b\u0001\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010$\"\u0005\b\u008d\u0001\u0010&R!\u0010\u008e\u0001\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010$\"\u0005\b\u0090\u0001\u0010&R!\u0010\u0091\u0001\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010$\"\u0005\b\u0093\u0001\u0010&R!\u0010\u0094\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\f\"\u0005\b\u0096\u0001\u0010\u000eR!\u0010\u0097\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\f\"\u0005\b\u0099\u0001\u0010\u000eR!\u0010\u009a\u0001\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010$\"\u0005\b\u009c\u0001\u0010&R!\u0010\u009d\u0001\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010$\"\u0005\b\u009f\u0001\u0010&R!\u0010\u00a0\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\f\"\u0005\b\u00a2\u0001\u0010\u000e\u00a8\u0006\u00a5\u0001"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$Card;", "", "()V", "acceptuality", "", "", "getAcceptuality", "()Ljava/util/List;", "setAcceptuality", "(Ljava/util/List;)V", "activityActivityUrl", "getActivityActivityUrl", "()Ljava/lang/String;", "setActivityActivityUrl", "(Ljava/lang/String;)V", "activityAid", "", "getActivityAid", "()J", "setActivityAid", "(J)V", "activityButtonUrl", "getActivityButtonUrl", "setActivityButtonUrl", "activityCard", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityCard;", "getActivityCard", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityCard;", "setActivityCard", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityCard;)V", "activityLogoUrl", "getActivityLogoUrl", "setActivityLogoUrl", "activityOnLive", "", "getActivityOnLive", "()I", "setActivityOnLive", "(I)V", "activityRooms", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityRoom;", "getActivityRooms", "setActivityRooms", "activityStartTime", "getActivityStartTime", "setActivityStartTime", "activityStatus", "getActivityStatus", "setActivityStatus", "activityTimeText", "getActivityTimeText", "setActivityTimeText", "activityType", "getActivityType", "setActivityType", "activityVideos", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityVideo;", "getActivityVideos", "setActivityVideos", "anchorFace", "getAnchorFace", "setAnchorFace", "anchorName", "getAnchorName", "setAnchorName", "areaId", "getAreaId", "setAreaId", "areaName", "getAreaName", "setAreaName", "broadcasetType", "getBroadcasetType", "setBroadcasetType", "clickCallback", "getClickCallback", "setClickCallback", "cover", "getCover", "setCover", "currentQuality", "getCurrentQuality", "setCurrentQuality", "dataBehaviorId", "getDataBehaviorId", "setDataBehaviorId", "dataSourceId", "getDataSourceId", "setDataSourceId", "hasReport", "", "getHasReport", "()Z", "setHasReport", "(Z)V", "id", "getId", "setId", "isNetWorking", "setNetWorking", "link", "getLink", "setLink", "liveStatus", "getLiveStatus", "setLiveStatus", "officalVerify", "getOfficalVerify", "setOfficalVerify", "onlineNumber", "getOnlineNumber", "setOnlineNumber", "parentAreaId", "getParentAreaId", "setParentAreaId", "parentAreaName", "getParentAreaName", "setParentAreaName", "pendentPic", "getPendentPic", "setPendentPic", "pendentRightTop", "getPendentRightTop", "setPendentRightTop", "pendentRightTopColor", "getPendentRightTopColor", "setPendentRightTopColor", "pic", "getPic", "setPic", "pkId", "getPkId", "setPkId", "playUrl", "getPlayUrl", "setPlayUrl", "playUrlH265", "getPlayUrlH265", "setPlayUrlH265", "rank", "getRank", "setRank", "recommendType", "getRecommendType", "setRecommendType", "roomId", "getRoomId", "setRoomId", "sessionId", "getSessionId", "setSessionId", "showCallback", "getShowCallback", "setShowCallback", "specialAttention", "getSpecialAttention", "setSpecialAttention", "tagType", "getTagType", "setTagType", "title", "getTitle", "setTitle", "getSortedActivityList", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityData;", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Card {
        @JSONField(name = "accept_quality")
        @Nullable
        private List<String> acceptuality;
        @JSONField(name = "activity_url")
        @NotNull
        private String activityActivityUrl = "";
        @JSONField(name = "aid")
        private long activityAid;
        @JSONField(name = "button_url")
        @NotNull
        private String activityButtonUrl = "";
        @JSONField(name = "card")
        @Nullable
        private ActivityCard activityCard;
        @JSONField(name = "logo_url")
        @NotNull
        private String activityLogoUrl = "";
        @JSONField(name = "on_live")
        private int activityOnLive;
        @JSONField(name = "room")
        @Nullable
        private List<ActivityRoom> activityRooms;
        @JSONField(name = "start_at")
        private long activityStartTime;
        @JSONField(name = "status")
        private int activityStatus;
        @JSONField(name = "time_text")
        @NotNull
        private String activityTimeText = "";
        @JSONField(name = "type")
        private int activityType;
        @JSONField(name = "av")
        @Nullable
        private List<ActivityVideo> activityVideos;
        @JSONField(name = "face")
        @NotNull
        private String anchorFace = "";
        @JSONField(name = "uname")
        @NotNull
        private String anchorName = "";
        @JSONField(name = "area_v2_id")
        private int areaId;
        @JSONField(name = "area_v2_name")
        @NotNull
        private String areaName = "";
        @JSONField(name = "broadcast_type")
        private int broadcasetType;
        @JSONField(name = "click_callback")
        @NotNull
        private String clickCallback = "";
        @JSONField(name = "cover")
        @NotNull
        private String cover = "";
        @JSONField(name = "current_quality")
        private int currentQuality;
        @JSONField(name = "data_behavior_id")
        @NotNull
        private String dataBehaviorId = "";
        @JSONField(name = "data_source_id")
        @NotNull
        private String dataSourceId = "";
        private boolean hasReport;
        @JSONField(name = "id")
        /* renamed from: id */
        private int f5996id;
        private boolean isNetWorking;
        @JSONField(name = "link")
        @NotNull
        private String link = "";
        @JSONField(name = "live_status")
        private int liveStatus;
        @JSONField(name = "official_verify")
        private int officalVerify = -1;
        @JSONField(name = "online")
        private long onlineNumber;
        @JSONField(name = "area_v2_parent_id")
        private int parentAreaId;
        @JSONField(name = "area_v2_parent_name")
        @NotNull
        private String parentAreaName = "";
        @JSONField(name = "pendent_ru_pic")
        @NotNull
        private String pendentPic = "";
        @JSONField(name = "pendent_ru")
        @NotNull
        private String pendentRightTop = "";
        @JSONField(name = "pendent_ru_color")
        @NotNull
        private String pendentRightTopColor = "";
        @JSONField(name = "pic")
        @NotNull
        private String pic = "";
        @JSONField(name = "pk_id")
        private long pkId;
        @JSONField(name = "play_url")
        @NotNull
        private String playUrl = "";
        @JSONField(name = "play_url_h265")
        @NotNull
        private String playUrlH265 = "";
        @JSONField(name = "rank")
        private int rank;
        @JSONField(name = "rec_type")
        private int recommendType;
        @JSONField(name = "roomid")
        private int roomId;
        @JSONField(name = "session_id")
        @NotNull
        private String sessionId = "";
        @JSONField(name = "show_callback")
        @NotNull
        private String showCallback = "";
        @JSONField(name = "special_attention")
        private int specialAttention;
        @JSONField(name = "tag_type")
        private int tagType;
        @JSONField(name = "title")
        @NotNull
        private String title = "";

        public final int getId() {
            return this.f5996id;
        }

        public final void setId(int i) {
            this.f5996id = i;
        }

        public final long getPkId() {
            return this.pkId;
        }

        public final void setPkId(long j) {
            this.pkId = j;
        }

        public final int getRoomId() {
            return this.roomId;
        }

        public final void setRoomId(int i) {
            this.roomId = i;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public final String getAnchorName() {
            return this.anchorName;
        }

        public final void setAnchorName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.anchorName = str;
        }

        public final long getOnlineNumber() {
            return this.onlineNumber;
        }

        public final void setOnlineNumber(long j) {
            this.onlineNumber = j;
        }

        @NotNull
        public final String getCover() {
            return this.cover;
        }

        public final void setCover(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.cover = str;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final void setLink(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.link = str;
        }

        @NotNull
        public final String getPic() {
            return this.pic;
        }

        public final void setPic(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pic = str;
        }

        @NotNull
        public final String getAnchorFace() {
            return this.anchorFace;
        }

        public final void setAnchorFace(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.anchorFace = str;
        }

        public final int getParentAreaId() {
            return this.parentAreaId;
        }

        public final void setParentAreaId(int i) {
            this.parentAreaId = i;
        }

        @NotNull
        public final String getParentAreaName() {
            return this.parentAreaName;
        }

        public final void setParentAreaName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.parentAreaName = str;
        }

        public final int getAreaId() {
            return this.areaId;
        }

        public final void setAreaId(int i) {
            this.areaId = i;
        }

        @NotNull
        public final String getAreaName() {
            return this.areaName;
        }

        public final void setAreaName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.areaName = str;
        }

        @NotNull
        public final String getPlayUrlH265() {
            return this.playUrlH265;
        }

        public final void setPlayUrlH265(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.playUrlH265 = str;
        }

        @NotNull
        public final String getPlayUrl() {
            return this.playUrl;
        }

        public final void setPlayUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.playUrl = str;
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public final void setSessionId(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.sessionId = str;
        }

        @NotNull
        public final String getShowCallback() {
            return this.showCallback;
        }

        public final void setShowCallback(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.showCallback = str;
        }

        @NotNull
        public final String getClickCallback() {
            return this.clickCallback;
        }

        public final void setClickCallback(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.clickCallback = str;
        }

        public final int getBroadcasetType() {
            return this.broadcasetType;
        }

        public final void setBroadcasetType(int i) {
            this.broadcasetType = i;
        }

        public final int getCurrentQuality() {
            return this.currentQuality;
        }

        public final void setCurrentQuality(int i) {
            this.currentQuality = i;
        }

        @Nullable
        public final List<String> getAcceptuality() {
            return this.acceptuality;
        }

        public final void setAcceptuality(@Nullable List<String> list) {
            this.acceptuality = list;
        }

        @NotNull
        public final String getPendentRightTop() {
            return this.pendentRightTop;
        }

        public final void setPendentRightTop(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pendentRightTop = str;
        }

        @NotNull
        public final String getPendentRightTopColor() {
            return this.pendentRightTopColor;
        }

        public final void setPendentRightTopColor(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pendentRightTopColor = str;
        }

        @NotNull
        public final String getPendentPic() {
            return this.pendentPic;
        }

        public final void setPendentPic(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pendentPic = str;
        }

        public final int getRank() {
            return this.rank;
        }

        public final void setRank(int i) {
            this.rank = i;
        }

        public final int getLiveStatus() {
            return this.liveStatus;
        }

        public final void setLiveStatus(int i) {
            this.liveStatus = i;
        }

        public final int getRecommendType() {
            return this.recommendType;
        }

        public final void setRecommendType(int i) {
            this.recommendType = i;
        }

        @NotNull
        public final String getDataBehaviorId() {
            return this.dataBehaviorId;
        }

        public final void setDataBehaviorId(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.dataBehaviorId = str;
        }

        @NotNull
        public final String getDataSourceId() {
            return this.dataSourceId;
        }

        public final void setDataSourceId(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.dataSourceId = str;
        }

        public final int getTagType() {
            return this.tagType;
        }

        public final void setTagType(int i) {
            this.tagType = i;
        }

        public final int getSpecialAttention() {
            return this.specialAttention;
        }

        public final void setSpecialAttention(int i) {
            this.specialAttention = i;
        }

        public final int getOfficalVerify() {
            return this.officalVerify;
        }

        public final void setOfficalVerify(int i) {
            this.officalVerify = i;
        }

        @Nullable
        public final ActivityCard getActivityCard() {
            return this.activityCard;
        }

        public final void setActivityCard(@Nullable ActivityCard activityCard) {
            this.activityCard = activityCard;
        }

        @Nullable
        public final List<ActivityRoom> getActivityRooms() {
            return this.activityRooms;
        }

        public final void setActivityRooms(@Nullable List<ActivityRoom> list) {
            this.activityRooms = list;
        }

        @Nullable
        public final List<ActivityVideo> getActivityVideos() {
            return this.activityVideos;
        }

        public final void setActivityVideos(@Nullable List<ActivityVideo> list) {
            this.activityVideos = list;
        }

        public final long getActivityAid() {
            return this.activityAid;
        }

        public final void setActivityAid(long j) {
            this.activityAid = j;
        }

        public final int getActivityType() {
            return this.activityType;
        }

        public final void setActivityType(int i) {
            this.activityType = i;
        }

        @NotNull
        public final String getActivityLogoUrl() {
            return this.activityLogoUrl;
        }

        public final void setActivityLogoUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activityLogoUrl = str;
        }

        public final long getActivityStartTime() {
            return this.activityStartTime;
        }

        public final void setActivityStartTime(long j) {
            this.activityStartTime = j;
        }

        @NotNull
        public final String getActivityTimeText() {
            return this.activityTimeText;
        }

        public final void setActivityTimeText(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activityTimeText = str;
        }

        @NotNull
        public final String getActivityButtonUrl() {
            return this.activityButtonUrl;
        }

        public final void setActivityButtonUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activityButtonUrl = str;
        }

        @NotNull
        public final String getActivityActivityUrl() {
            return this.activityActivityUrl;
        }

        public final void setActivityActivityUrl(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.activityActivityUrl = str;
        }

        public final int getActivityStatus() {
            return this.activityStatus;
        }

        public final void setActivityStatus(int i) {
            this.activityStatus = i;
        }

        public final int getActivityOnLive() {
            return this.activityOnLive;
        }

        public final void setActivityOnLive(int i) {
            this.activityOnLive = i;
        }

        public final boolean isNetWorking() {
            return this.isNetWorking;
        }

        public final void setNetWorking(boolean z) {
            this.isNetWorking = z;
        }

        @NotNull
        public final List<ActivityData> getSortedActivityList() {
            LinkedList linkedList = new LinkedList();
            ActivityCard activityCard = this.activityCard;
            if (activityCard != null) {
                linkedList.add(activityCard);
            }
            List list = this.activityRooms;
            if (list != null) {
                linkedList.addAll(list);
            }
            list = this.activityVideos;
            if (list != null) {
                linkedList.addAll(list);
            }
            List list2 = linkedList;
//            if (list2.size() > 1) {
//                CollectionsKt__MutableCollectionsJVMKt.sortWith(list2, new BiliLiveHomePage$Card$$special$$inlined$sortBy$1());
//            }
            return list2;
        }

        public final boolean getHasReport() {
            return this.hasReport;
        }

        public final void setHasReport(boolean z) {
            this.hasReport = z;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$Companion;", "", "()V", "HOME_ACTIVITY_V2_STATUS_SUBSCRIBE", "", "HOME_ACTIVITY_V2_STATUS_SUBSCRIBED", "MODULE_TYPE_ACTIVITY", "MODULE_TYPE_AREA_SQUARE", "MODULE_TYPE_AREA_STD", "MODULE_TYPE_BANNER", "MODULE_TYPE_ENTRANCES", "MODULE_TYPE_ENTRANCES$annotations", "MODULE_TYPE_ENTRANCES_V2", "MODULE_TYPE_FOLLOW", "MODULE_TYPE_GUARD", "MODULE_TYPE_HOUR_RANK", "MODULE_TYPE_OPERATION_SQUARE", "MODULE_TYPE_OPERATION_STD", "MODULE_TYPE_REC_SQUARE", "MODULE_TYPE_REC_STD", "MODULE_TYPE_TAGS", "MODULE_TYPE_TAGS$annotations", "MODULE_TYPE_TAG_ROOM", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class Companion {
//        @Deprecated(message = "\u5e9f\u5f03\uff0c\u73b0\u5728\u7528 MODULE_TYPE_ENTRANCES_V2")
//        public static /* synthetic */ void MODULE_TYPE_ENTRANCES$annotations() {
//        }
//
//        @Deprecated(message = "\u5e9f\u5f03\uff0c\u73b0\u5728\u7528 MODULE_TYPE_ENTRANCES_V2")
//        public static /* synthetic */ void MODULE_TYPE_TAGS$annotations() {
//        }
//
//        private Companion() {
//        }
//
//        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
//            this();
//        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R&\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001e\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001e\u0010(\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001e\u0010+\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011\u00a8\u0006."}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$DynamicInfo;", "", "()V", "attentionCount", "", "getAttentionCount", "()I", "setAttentionCount", "(I)V", "attentionPage", "getAttentionPage", "setAttentionPage", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "lastLiveTag", "getLastLiveTag", "setLastLiveTag", "lastLiveTime", "getLastLiveTime", "setLastLiveTime", "lastLiveUser", "getLastLiveUser", "setLastLiveUser", "offlineTags", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$Card;", "getOfflineTags", "()Ljava/util/List;", "setOfflineTags", "(Ljava/util/List;)V", "pic", "getPic", "setPic", "showType", "getShowType", "setShowType", "subTitle", "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class DynamicInfo {
        @JSONField(name = "total_count")
        private int attentionCount;
        @JSONField(name = "relation_page")
        private int attentionPage = 1;
        @JSONField(name = "content")
        @NotNull
        private String content = "";
        @JSONField(name = "tags_desc")
        @NotNull
        private String lastLiveTag = "";
        @JSONField(name = "time_desc")
        @NotNull
        private String lastLiveTime = "";
        @JSONField(name = "uname_desc")
        @NotNull
        private String lastLiveUser = "";
        @JSONField(name = "offline")
        @Nullable
        private List<Card> offlineTags;
        @JSONField(name = "pic")
        @NotNull
        private String pic = "";
        @JSONField(name = "show_type")
        private int showType;
        @JSONField(name = "sub_title")
        @NotNull
        private String subTitle = "";
        @JSONField(name = "title")
        @NotNull
        private String title = "";

        @Nullable
        public final List<Card> getOfflineTags() {
            return this.offlineTags;
        }

        public final void setOfflineTags(@Nullable List<Card> list) {
            this.offlineTags = list;
        }

        public final int getAttentionCount() {
            return this.attentionCount;
        }

        public final void setAttentionCount(int i) {
            this.attentionCount = i;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        @NotNull
        public final String getLastLiveTime() {
            return this.lastLiveTime;
        }

        public final void setLastLiveTime(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.lastLiveTime = str;
        }

        @NotNull
        public final String getLastLiveUser() {
            return this.lastLiveUser;
        }

        public final void setLastLiveUser(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.lastLiveUser = str;
        }

        @NotNull
        public final String getLastLiveTag() {
            return this.lastLiveTag;
        }

        public final void setLastLiveTag(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.lastLiveTag = str;
        }

        public final int getAttentionPage() {
            return this.attentionPage;
        }

        public final void setAttentionPage(int i) {
            this.attentionPage = i;
        }

        @NotNull
        public final String getSubTitle() {
            return this.subTitle;
        }

        public final void setSubTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.subTitle = str;
        }

        @NotNull
        public final String getPic() {
            return this.pic;
        }

        public final void setPic(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pic = str;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final void setContent(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.content = str;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\b\u00a8\u0006 "}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleInfo;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "id", "getId", "setId", "isSquareCard", "", "()Z", "isSquareCard$delegate", "Lkotlin/Lazy;", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "sort", "getSort", "setSort", "title", "getTitle", "setTitle", "type", "getType", "setType", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleInfo {
//        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ModuleInfo.class), "isSquareCard", "isSquareCard()Z"))};
        @JSONField(name = "count")
        private int count;
        @JSONField(name = "id")
        /* renamed from: id */
        private int id;
//        @NotNull
//        private final Lazy isSquareCard$delegate = LazyKt__LazyJVMKt.lazy(new BiliLiveHomePage$ModuleInfo$isSquareCard$2(this));
        @JSONField(name = "link")
        @NotNull
        private String link = "";
        @JSONField(name = "sort")
        private int sort;
        @JSONField(name = "title")
        @NotNull
        private String title = "";
        @JSONField(name = "type")
        private int type;

//        public final boolean isSquareCard() {
//            Lazy lazy = this.isSquareCard$delegate;
//            KProperty kProperty = $$delegatedProperties[0];
//            return ((Boolean) lazy.getValue()).booleanValue();
//        }

        public final int getId() {
            return this.id;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final void setLink(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.link = str;
        }

        public final int getCount() {
            return this.count;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final int getSort() {
            return this.sort;
        }

        public final void setSort(int i) {
            this.sort = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "", "()V", "cardList", "", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$Card;", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", "dynamicInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$DynamicInfo;", "getDynamicInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$DynamicInfo;", "setDynamicInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$DynamicInfo;)V", "hasReport", "", "getHasReport", "()Z", "setHasReport", "(Z)V", "moduleInfo", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleInfo;", "getModuleInfo", "()Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleInfo;", "setModuleInfo", "(Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleInfo;)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static class ModuleUnit {
        @JSONField(name = "list")
        @Nullable
        private List<Card> cardList;
        @JSONField(name = "extra_info")
        @Nullable
        private DynamicInfo dynamicInfo;
        @JSONField(serialize = false)
        private boolean hasReport;
        @JSONField(name = "module_info")
        @NotNull
        private ModuleInfo moduleInfo = new ModuleInfo();

        @NotNull
        public final ModuleInfo getModuleInfo() {
            return this.moduleInfo;
        }

        public final void setModuleInfo(@NotNull ModuleInfo moduleInfo) {
//            //Intrinsics.checkParameterIsNotNull(moduleInfo, "<set-?>");
            this.moduleInfo = moduleInfo;
        }

        @Nullable
        public final DynamicInfo getDynamicInfo() {
            return this.dynamicInfo;
        }

        public final void setDynamicInfo(@Nullable DynamicInfo dynamicInfo) {
            this.dynamicInfo = dynamicInfo;
        }

        @Nullable
        public final List<Card> getCardList() {
            return this.cardList;
        }

        public final void setCardList(@Nullable List<Card> list) {
            this.cardList = list;
        }

        public final boolean getHasReport() {
            return this.hasReport;
        }

        public final void setHasReport(boolean z) {
            this.hasReport = z;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleAttentions;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "displayCardCount", "", "getDisplayCardCount", "()I", "setDisplayCardCount", "(I)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleAttentions extends ModuleUnit {
        @JSONField(serialize = false)
        private int displayCardCount;

        public final int getDisplayCardCount() {
            return this.displayCardCount;
        }

        public final void setDisplayCardCount(int i) {
            this.displayCardCount = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleRooms;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "tianMa", "", "getTianMa", "()I", "setTianMa", "(I)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleRooms extends ModuleUnit {
        @JSONField(name = "is_sky_horse_gray")
        private int tianMa;

        public final int getTianMa() {
            return this.tianMa;
        }

        public final void setTianMa(int i) {
            this.tianMa = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityData;", "Lcom/bilibili/bililive/videoliveplayer/ui/live/home/BaseCard;", "()V", "sort", "", "getSort", "()I", "setSort", "(I)V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static class ActivityData extends C2992f {
        @JSONField(name = "sort")
        private int sort;

        public final int getSort() {
            return this.sort;
        }

        public final void setSort(int i) {
            this.sort = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityCard;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityData;", "()V", "action", "", "getAction", "()I", "setAction", "(I)V", "activityId", "getActivityId", "setActivityId", "buttonText", "", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "goLink", "getGoLink", "setGoLink", "pic", "getPic", "setPic", "picLink", "getPicLink", "setPicLink", "text", "getText", "setText", "title", "getTitle", "setTitle", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ActivityCard extends ActivityData {
        @JSONField(name = "status")
        private int action;
        @JSONField(name = "aid")
        private int activityId;
        @JSONField(name = "button_text")
        @NotNull
        private String buttonText = "";
        @JSONField(name = "go_link")
        @NotNull
        private String goLink = "";
        @JSONField(name = "pic")
        @NotNull
        private String pic = "";
        @JSONField(name = "pic_link")
        @NotNull
        private String picLink = "";
        @JSONField(name = "text")
        @NotNull
        private String text = "";
        @JSONField(name = "title")
        @NotNull
        private String title = "";

        public final int getActivityId() {
            return this.activityId;
        }

        public final void setActivityId(int i) {
            this.activityId = i;
        }

        @NotNull
        public final String getPic() {
            return this.pic;
        }

        public final void setPic(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pic = str;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final void setText(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.text = str;
        }

        @NotNull
        public final String getPicLink() {
            return this.picLink;
        }

        public final void setPicLink(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.picLink = str;
        }

        @NotNull
        public final String getGoLink() {
            return this.goLink;
        }

        public final void setGoLink(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.goLink = str;
        }

        @NotNull
        public final String getButtonText() {
            return this.buttonText;
        }

        public final void setButtonText(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.buttonText = str;
        }

        public final int getAction() {
            return this.action;
        }

        public final void setAction(int i) {
            this.action = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b\u00a8\u0006$"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityRoom;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityData;", "()V", "anchorName", "", "getAnchorName", "()Ljava/lang/String;", "setAnchorName", "(Ljava/lang/String;)V", "areaId", "", "getAreaId", "()I", "setAreaId", "(I)V", "cover", "getCover", "setCover", "live", "getLive", "setLive", "onlineNumber", "", "getOnlineNumber", "()J", "setOnlineNumber", "(J)V", "parentAreaId", "getParentAreaId", "setParentAreaId", "roomId", "getRoomId", "setRoomId", "title", "getTitle", "setTitle", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ActivityRoom extends ActivityData {
        @JSONField(name = "u_name")
        @NotNull
        private String anchorName = "";
        @JSONField(name = "area_v2_id")
        private int areaId;
        @JSONField(name = "cover")
        @NotNull
        private String cover = "";
        @JSONField(name = "is_live")
        private int live;
        @JSONField(name = "online")
        private long onlineNumber;
        @JSONField(name = "area_v2_parent_id")
        private int parentAreaId;
        @JSONField(name = "room_id")
        private int roomId;
        @JSONField(name = "title")
        @NotNull
        private String title = "";

        public final int getLive() {
            return this.live;
        }

        public final void setLive(int i) {
            this.live = i;
        }

        public final int getRoomId() {
            return this.roomId;
        }

        public final void setRoomId(int i) {
            this.roomId = i;
        }

        @NotNull
        public final String getAnchorName() {
            return this.anchorName;
        }

        public final void setAnchorName(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.anchorName = str;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        public final long getOnlineNumber() {
            return this.onlineNumber;
        }

        public final void setOnlineNumber(long j) {
            this.onlineNumber = j;
        }

        @NotNull
        public final String getCover() {
            return this.cover;
        }

        public final void setCover(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.cover = str;
        }

        public final int getParentAreaId() {
            return this.parentAreaId;
        }

        public final void setParentAreaId(int i) {
            this.parentAreaId = i;
        }

        public final int getAreaId() {
            return this.areaId;
        }

        public final void setAreaId(int i) {
            this.areaId = i;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityVideo;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ActivityData;", "()V", "avId", "", "getAvId", "()I", "setAvId", "(I)V", "cover", "", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "danmuku", "", "getDanmuku", "()J", "setDanmuku", "(J)V", "duration", "getDuration", "setDuration", "title", "getTitle", "setTitle", "viewCount", "getViewCount", "setViewCount", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ActivityVideo extends ActivityData {
        @JSONField(name = "avid")
        private int avId;
        @JSONField(name = "cover")
        @NotNull
        private String cover = "";
        @JSONField(name = "dan_ma_ku")
        private long danmuku;
        @JSONField(name = "duration")
        private long duration;
        @JSONField(name = "title")
        @NotNull
        private String title = "";
        @JSONField(name = "view_count")
        private long viewCount;

        public final int getAvId() {
            return this.avId;
        }

        public final void setAvId(int i) {
            this.avId = i;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        public final long getViewCount() {
            return this.viewCount;
        }

        public final void setViewCount(long j) {
            this.viewCount = j;
        }

        public final long getDanmuku() {
            return this.danmuku;
        }

        public final void setDanmuku(long j) {
            this.danmuku = j;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final void setDuration(long j) {
            this.duration = j;
        }

        @NotNull
        public final String getCover() {
            return this.cover;
        }

        public final void setCover(@NotNull String str) {
//            //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.cover = str;
        }
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleActivity;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleActivity extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleActivityV2;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleActivityV2 extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleBanner;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleBanner extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleCommonTags;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleCommonTags extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleEntrances;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleEntrances extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleEntrancesV2;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleEntrancesV2 extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleGuardTip;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleGuardTip extends ModuleUnit {
    }

    ////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleHourRank;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveHomePage$ModuleUnit;", "()V", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
    /* compiled from: BL */
    public static final class ModuleHourRank extends ModuleUnit {
    }

    public final int getInterval() {
        return this.interval;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final int getTianMa() {
        return this.tianMa;
    }

    public final void setTianMa(int i) {
        this.tianMa = i;
    }

    @Nullable
    public final List<ModuleBanner> getBanner() {
        return this.banner;
    }

    public final void setBanner(@Nullable List<ModuleBanner> list) {
        this.banner = list;
    }

    @Nullable
    public final List<ModuleGuardTip> getGuardTip() {
        return this.guardTip;
    }

    public final void setGuardTip(@Nullable List<ModuleGuardTip> list) {
        this.guardTip = list;
    }

    @Nullable
    public final List<ModuleAttentions> getAttentions() {
        return this.attentions;
    }

    public final void setAttentions(@Nullable List<ModuleAttentions> list) {
        this.attentions = list;
    }

    @Nullable
    public final List<ModuleRooms> getRooms() {
        return this.rooms;
    }

    public final void setRooms(@Nullable List<ModuleRooms> list) {
        this.rooms = list;
    }

    @Nullable
    public final List<ModuleHourRank> getHourRank() {
        return this.hourRank;
    }

    public final void setHourRank(@Nullable List<ModuleHourRank> list) {
        this.hourRank = list;
    }

    @Nullable
    public final List<ModuleActivity> getActivities() {
        return this.activities;
    }

    public final void setActivities(@Nullable List<ModuleActivity> list) {
        this.activities = list;
    }

    @Nullable
    public final List<ModuleEntrancesV2> getEntrancesV2() {
        return this.entrancesV2;
    }

    public final void setEntrancesV2(@Nullable List<ModuleEntrancesV2> list) {
        this.entrancesV2 = list;
    }

    @Nullable
    public final List<ModuleActivityV2> getActivityCardV2() {
        return this.activityCardV2;
    }

    public final void setActivityCardV2(@Nullable List<ModuleActivityV2> list) {
        this.activityCardV2 = list;
    }

//    @NotNull
//    public final List<ModuleUnit> getSortedModuleList() {
//        BiliLiveHomePage$getSortedModuleList$1 biliLiveHomePage$getSortedModuleList$1 = BiliLiveHomePage$getSortedModuleList$1.INSTANCE;
//        LinkedList linkedList = new LinkedList();
//        List list = linkedList;
//        BiliLiveHomePage$getSortedModuleList$1.INSTANCE.invoke(list, this.banner, this.entrancesV2, this.activityCardV2, this.guardTip, this.attentions, this.rooms, this.hourRank, this.activities);
//        CollectionsKt__MutableCollectionsJVMKt.sortWith(list, ComparisonsKt__ComparisonsKt.compareBy(BiliLiveHomePage$getSortedModuleList$2$1.INSTANCE, BiliLiveHomePage$getSortedModuleList$2$2.INSTANCE));
//        return list;
//    }
}
