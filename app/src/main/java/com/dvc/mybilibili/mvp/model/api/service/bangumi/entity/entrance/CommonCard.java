package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u008e\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\r\u00a2\u0006\u0002\u0010\"J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\bH\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\rH\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u00c6\u0003J\u0012\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\rH\u00c6\u0003J\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\rH\u00c6\u0003J\f\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0094\u0002\u0010\u00a8\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\r2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\rH\u00c6\u0001J\u0015\u0010\u00a9\u0001\u001a\u00020\r2\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\nH\u00d6\u0001J\n\u0010\u00ac\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R\u001e\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R\u001e\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001a\u0010B\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\u001a\u0010E\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R\u001a\u0010H\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001a\u0010K\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001a\u0010N\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001a\u0010Q\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010(\"\u0004\bS\u0010*R\u001a\u0010T\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010[\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010`\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010$\"\u0004\bb\u0010&R\u001e\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010(\"\u0004\bc\u0010*R\u001e\u0010!\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010-\"\u0004\bd\u0010/R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010-\"\u0004\be\u0010/R\u001e\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010-\"\u0004\bf\u0010/R\u001e\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u00109\"\u0004\bh\u0010;R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010$\"\u0004\bj\u0010&R\u001c\u0010k\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010$\"\u0004\bm\u0010&R\u001a\u0010n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010$\"\u0004\bp\u0010&R\u001a\u0010q\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010$\"\u0004\bs\u0010&R\u001c\u0010t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010$\"\u0004\bv\u0010&R\u001a\u0010w\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010(\"\u0004\by\u0010*R\u001c\u0010z\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010$\"\u0004\b|\u0010&R&\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010X\"\u0004\b~\u0010ZR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010$\"\u0005\b\u0081\u0001\u0010&R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010$\"\u0005\b\u0084\u0001\u0010&R \u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u00109\"\u0005\b\u0086\u0001\u0010;R \u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010(\"\u0005\b\u0088\u0001\u0010*R \u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010$\"\u0005\b\u008e\u0001\u0010&R\u001c\u0010\u0013\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u00109\"\u0005\b\u0090\u0001\u0010;\u00a8\u0006\u00ad\u0001"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/CommonCard;", "", "title", "", "cover", "desc", "badge", "seasonId", "", "seasonType", "", "badgeType", "isNew", "", "link", "status", "Lcom/bilibili/bangumi/data/entrance/Status;", "countInfo", "Lcom/bilibili/bangumi/data/entrance/CountInfo;", "wid", "itemId", "cursor", "isAuto", "date", "dataTS", "dayOfWeek", "isToday", "episodes", "", "Lcom/bilibili/bangumi/data/entrance/Episode;", "ranks", "Lcom/bilibili/bangumi/data/entrance/Rank;", "hat", "isExposureReported", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIZLjava/lang/String;Lcom/bilibili/bangumi/data/entrance/Status;Lcom/bilibili/bangumi/data/entrance/CountInfo;JJLjava/lang/String;ILjava/lang/String;JIZLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getBadge", "()Ljava/lang/String;", "setBadge", "(Ljava/lang/String;)V", "getBadgeType", "()I", "setBadgeType", "(I)V", "canFavor", "getCanFavor", "()Z", "setCanFavor", "(Z)V", "getCountInfo", "()Lcom/bilibili/bangumi/data/entrance/CountInfo;", "setCountInfo", "(Lcom/bilibili/bangumi/data/entrance/CountInfo;)V", "getCover", "setCover", "getCursor", "setCursor", "getDataTS", "()J", "setDataTS", "(J)V", "getDate", "setDate", "getDayOfWeek", "setDayOfWeek", "getDesc", "setDesc", "dynamicDanmaku", "getDynamicDanmaku", "setDynamicDanmaku", "dynamicDuration", "getDynamicDuration", "setDynamicDuration", "dynamicPageName", "getDynamicPageName", "setDynamicPageName", "dynamicParam", "getDynamicParam", "setDynamicParam", "dynamicPlay", "getDynamicPlay", "setDynamicPlay", "dynamicReply", "getDynamicReply", "setDynamicReply", "dynamicUpName", "getDynamicUpName", "setDynamicUpName", "getEpisodes", "()Ljava/util/List;", "setEpisodes", "(Ljava/util/List;)V", "fragmentType", "getFragmentType", "()Ljava/lang/Integer;", "setFragmentType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHat", "setHat", "setAuto", "setExposureReported", "setNew", "setToday", "getItemId", "setItemId", "getLink", "setLink", "moduleId", "getModuleId", "setModuleId", "moduleTitle", "getModuleTitle", "setModuleTitle", "moduleType", "getModuleType", "setModuleType", "newPageName", "getNewPageName", "setNewPageName", "orderId", "getOrderId", "setOrderId", "pageName", "getPageName", "setPageName", "getRanks", "setRanks", "reportSubtitle", "getReportSubtitle", "setReportSubtitle", "reportTitle", "getReportTitle", "setReportTitle", "getSeasonId", "setSeasonId", "getSeasonType", "setSeasonType", "getStatus", "()Lcom/bilibili/bangumi/data/entrance/Status;", "setStatus", "(Lcom/bilibili/bangumi/data/entrance/Status;)V", "getTitle", "setTitle", "getWid", "setWid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class CommonCard {
    @Nullable
    private String badge;
    @JSONField(name = "badge_type")
    private int badgeType;
    private boolean canFavor;
    @JSONField(name = "stat")
    @Nullable
    private CountInfo countInfo;
    @Nullable
    private String cover;
    @Nullable
    private String cursor;
    @JSONField(name = "date_ts")
    private long dataTS;
    @Nullable
    private String date;
    @JSONField(name = "day_of_week")
    private int dayOfWeek;
    @Nullable
    private String desc;
    private int dynamicDanmaku;
    private long dynamicDuration;
    @NotNull
    private String dynamicPageName;
    @NotNull
    private String dynamicParam;
    private int dynamicPlay;
    private int dynamicReply;
    @NotNull
    private String dynamicUpName;
    @Nullable
    private List<Episode> episodes;
    @Nullable
    private Integer fragmentType;
    @Nullable
    private String hat;
    @JSONField(name = "is_auto")
    private int isAuto;
    @JSONField(deserialize = false, serialize = false)
    private boolean isExposureReported;
    @JSONField(name = "is_new")
    private boolean isNew;
    @JSONField(name = "is_today")
    private boolean isToday;
    @JSONField(name = "item_id")
    private long itemId;
    @Nullable
    private String link;
    @Nullable
    private String moduleId;
    @NotNull
    private String moduleTitle;
    @NotNull
    private String moduleType;
    @Nullable
    private String newPageName;
    private int orderId;
    @Nullable
    private String pageName;
    @JSONField(name = "cards")
    @Nullable
    private List<Rank> ranks;
    @Nullable
    private String reportSubtitle;
    @Nullable
    private String reportTitle;
    @JSONField(name = "season_id")
    private long seasonId;
    @JSONField(name = "season_type")
    private int seasonType;
    @Nullable
    private Status status;
    @Nullable
    private String title;
    private long wid;

    public CommonCard() {
        this(null, null, null, null, 0, 0, 0, false, null, null, null, 0, 0, null, 0, null, 0, 0, false, null, null, null, false, 8388607);
    }

    @NotNull
    public static /* synthetic */ CommonCard copy$default(CommonCard commonCard, String str, String str2, String str3, String str4, long j, int i, int i2, boolean z, String str5, Status status, CountInfo countInfo, long j2, long j3, String str6, int i3, String str7, long j4, int i4, boolean z2, List list, List list2, String str8, boolean z3, int i5, Object obj) {
        long j5;
        long j6;
        CommonCard commonCard2 = commonCard;
        int i6 = i5;
        String str9 = (i6 & 1) != 0 ? commonCard2.title : str;
        String str10 = (i6 & 2) != 0 ? commonCard2.cover : str2;
        String str11 = (i6 & 4) != 0 ? commonCard2.desc : str3;
        String str12 = (i6 & 8) != 0 ? commonCard2.badge : str4;
        long j7 = (i6 & 16) != 0 ? commonCard2.seasonId : j;
        int i7 = (i6 & 32) != 0 ? commonCard2.seasonType : i;
        int i8 = (i6 & 64) != 0 ? commonCard2.badgeType : i2;
        boolean z4 = (i6 & 128) != 0 ? commonCard2.isNew : z;
        String str13 = (i6 & 256) != 0 ? commonCard2.link : str5;
        Status status2 = (i6 & 512) != 0 ? commonCard2.status : status;
        CountInfo countInfo2 = (i6 & 1024) != 0 ? commonCard2.countInfo : countInfo;
        long j8 = (i6 & 2048) != 0 ? commonCard2.wid : j2;
        long j9 = (i6 & 4096) != 0 ? commonCard2.itemId : j3;
        String str14 = (i6 & 8192) != 0 ? commonCard2.cursor : str6;
        int i9 = (i6 & 16384) != 0 ? commonCard2.isAuto : i3;
        String str15 = (32768 & i6) != 0 ? commonCard2.date : str7;
        if ((65536 & i6) != 0) {
            j5 = j9;
            j6 = commonCard2.dataTS;
        } else {
            j5 = j9;
            j6 = j4;
        }
        return commonCard2.copy(str9, str10, str11, str12, j7, i7, i8, z4, str13, status2, countInfo2, j8, j5, str14, i9, str15, j6, (131072 & i6) != 0 ? commonCard2.dayOfWeek : i4, (262144 & i6) != 0 ? commonCard2.isToday : z2, (524288 & i6) != 0 ? commonCard2.episodes : list, (1048576 & i6) != 0 ? commonCard2.ranks : list2, (2097152 & i6) != 0 ? commonCard2.hat : str8, (i6 & 4194304) != 0 ? commonCard2.isExposureReported : z3);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final Status component10() {
        return this.status;
    }

    @Nullable
    public final CountInfo component11() {
        return this.countInfo;
    }

    public final long component12() {
        return this.wid;
    }

    public final long component13() {
        return this.itemId;
    }

    @Nullable
    public final String component14() {
        return this.cursor;
    }

    public final int component15() {
        return this.isAuto;
    }

    @Nullable
    public final String component16() {
        return this.date;
    }

    public final long component17() {
        return this.dataTS;
    }

    public final int component18() {
        return this.dayOfWeek;
    }

    public final boolean component19() {
        return this.isToday;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final List<Episode> component20() {
        return this.episodes;
    }

    @Nullable
    public final List<Rank> component21() {
        return this.ranks;
    }

    @Nullable
    public final String component22() {
        return this.hat;
    }

    public final boolean component23() {
        return this.isExposureReported;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.badge;
    }

    public final long component5() {
        return this.seasonId;
    }

    public final int component6() {
        return this.seasonType;
    }

    public final int component7() {
        return this.badgeType;
    }

    public final boolean component8() {
        return this.isNew;
    }

    @Nullable
    public final String component9() {
        return this.link;
    }

    @NotNull
    public final CommonCard copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, int i, int i2, boolean z, @Nullable String str5, @Nullable Status status, @Nullable CountInfo countInfo, long j2, long j3, @Nullable String str6, int i3, @Nullable String str7, long j4, int i4, boolean z2, @Nullable List<Episode> list, @Nullable List<Rank> list2, @Nullable String str8, boolean z3) {
        return new CommonCard(str, str2, str3, str4, j, i, i2, z, str5, status, countInfo, j2, j3, str6, i3, str7, j4, i4, z2, list, list2, str8, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonCard) {
            CommonCard commonCard = (CommonCard) obj;
            if (Intrinsics.areEqual(this.title, commonCard.title) &&Intrinsics.areEqual(this.cover, commonCard.cover) &&Intrinsics.areEqual(this.desc, commonCard.desc) &&Intrinsics.areEqual(this.badge, commonCard.badge)) {
                if ((this.seasonId == commonCard.seasonId ? 1 : null) != null) {
                    if ((this.seasonType == commonCard.seasonType ? 1 : null) != null) {
                        if ((this.badgeType == commonCard.badgeType ? 1 : null) != null) {
                            if ((this.isNew == commonCard.isNew ? 1 : null) != null &&Intrinsics.areEqual(this.link, commonCard.link) &&Intrinsics.areEqual(this.status, commonCard.status) &&Intrinsics.areEqual(this.countInfo, commonCard.countInfo)) {
                                if ((this.wid == commonCard.wid ? 1 : null) != null) {
                                    if ((this.itemId == commonCard.itemId ? 1 : null) != null &&Intrinsics.areEqual(this.cursor, commonCard.cursor)) {
                                        if ((this.isAuto == commonCard.isAuto ? 1 : null) != null &&Intrinsics.areEqual(this.date, commonCard.date)) {
                                            if ((this.dataTS == commonCard.dataTS ? 1 : null) != null) {
                                                if ((this.dayOfWeek == commonCard.dayOfWeek ? 1 : null) != null) {
                                                    if ((this.isToday == commonCard.isToday ? 1 : null) != null &&Intrinsics.areEqual(this.episodes, commonCard.episodes) &&Intrinsics.areEqual(this.ranks, commonCard.ranks) &&Intrinsics.areEqual(this.hat, commonCard.hat)) {
                                                        if ((this.isExposureReported == commonCard.isExposureReported ? 1 : null) != null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.cover;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.desc;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.badge;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.seasonId;
        hashCode = (((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.seasonType) * 31) + this.badgeType) * 31;
        int i2 = this.isNew?1:0;
        hashCode = (hashCode + i2) * 31;
        str2 = this.link;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Status status = this.status;
        hashCode = (hashCode + (status != null ? status.hashCode() : 0)) * 31;
        CountInfo countInfo = this.countInfo;
        hashCode = (hashCode + (countInfo != null ? countInfo.hashCode() : 0)) * 31;
        long j2 = this.wid;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.itemId;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str2 = this.cursor;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.isAuto) * 31;
        str2 = this.date;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        j2 = this.dataTS;
        hashCode = (((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.dayOfWeek) * 31;
        i2 = this.isToday?1:0;
        hashCode = (hashCode + i2) * 31;
        List list = this.episodes;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.ranks;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str2 = this.hat;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isExposureReported?1:0;
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommonCard(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", desc=");
        stringBuilder.append(this.desc);
        stringBuilder.append(", badge=");
        stringBuilder.append(this.badge);
        stringBuilder.append(", seasonId=");
        stringBuilder.append(this.seasonId);
        stringBuilder.append(", seasonType=");
        stringBuilder.append(this.seasonType);
        stringBuilder.append(", badgeType=");
        stringBuilder.append(this.badgeType);
        stringBuilder.append(", isNew=");
        stringBuilder.append(this.isNew);
        stringBuilder.append(", link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", countInfo=");
        stringBuilder.append(this.countInfo);
        stringBuilder.append(", wid=");
        stringBuilder.append(this.wid);
        stringBuilder.append(", itemId=");
        stringBuilder.append(this.itemId);
        stringBuilder.append(", cursor=");
        stringBuilder.append(this.cursor);
        stringBuilder.append(", isAuto=");
        stringBuilder.append(this.isAuto);
        stringBuilder.append(", date=");
        stringBuilder.append(this.date);
        stringBuilder.append(", dataTS=");
        stringBuilder.append(this.dataTS);
        stringBuilder.append(", dayOfWeek=");
        stringBuilder.append(this.dayOfWeek);
        stringBuilder.append(", isToday=");
        stringBuilder.append(this.isToday);
        stringBuilder.append(", episodes=");
        stringBuilder.append(this.episodes);
        stringBuilder.append(", ranks=");
        stringBuilder.append(this.ranks);
        stringBuilder.append(", hat=");
        stringBuilder.append(this.hat);
        stringBuilder.append(", isExposureReported=");
        stringBuilder.append(this.isExposureReported);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CommonCard(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, int i, int i2, boolean z, @Nullable String str5, @Nullable Status status, @Nullable CountInfo countInfo, long j2, long j3, @Nullable String str6, int i3, @Nullable String str7, long j4, int i4, boolean z2, @Nullable List<Episode> list, @Nullable List<Rank> list2, @Nullable String str8, boolean z3) {
        this.title = str;
        this.cover = str2;
        this.desc = str3;
        this.badge = str4;
        this.seasonId = j;
        this.seasonType = i;
        this.badgeType = i2;
        this.isNew = z;
        this.link = str5;
        this.status = status;
        this.countInfo = countInfo;
        this.wid = j2;
        this.itemId = j3;
        this.cursor = str6;
        this.isAuto = i3;
        this.date = str7;
        this.dataTS = j4;
        this.dayOfWeek = i4;
        this.isToday = z2;
        this.episodes = list;
        this.ranks = list2;
        this.hat = str8;
        this.isExposureReported = z3;
        this.moduleTitle = "";
        this.moduleType = "";
        this.moduleId = "";
        this.reportTitle = "";
        this.reportSubtitle = "";
        this.fragmentType = Integer.valueOf(-1);
        this.pageName = "";
        this.newPageName = "";
        this.dynamicParam = "";
        this.dynamicUpName = "";
        this.dynamicPageName = "";
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public /* synthetic */ CommonCard(String str, String str2, String str3, String str4, long j, int i, int i2, boolean z, String str5, Status status, CountInfo countInfo, long j2, long j3, String str6, int i3, String str7, long j4, int i4, boolean z2, List list, List list2, String str8, boolean z3, int i6) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? (String) null : str4, (i6 & 16) != 0 ? 0 : j, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? "" : str5, (i6 & 512) != 0 ? new Status(false) : status, (i6 & 1024) != 0 ? (CountInfo) null : countInfo, (i6 & 2048) != 0 ? 0 : j2, (i6 & 4096) != 0 ? 0 : j3, (i6 & 8192) != 0 ? "" : str6, (i6 & 16384) != 0 ? 1 : i3, (32768 & i6) != 0 ? (String) null : str7, (65536 & i6) != 0 ? 0 : j4, (131072 & i6) != 0 ? 0 : i4, (262144 & i6) != 0 ? false : z2, (524288 & i6) != 0 ? (List) null : list, (1048576 & i6) != 0 ? (List) null : list2, (2097152 & i6) != 0 ? (String) null : str8, (i6 & 4194304) != 0 ? false : z3);
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    public final void setSeasonId(long j) {
        this.seasonId = j;
    }

    public final int getSeasonType() {
        return this.seasonType;
    }

    public final void setSeasonType(int i) {
        this.seasonType = i;
    }

    public final int getBadgeType() {
        return this.badgeType;
    }

    public final void setBadgeType(int i) {
        this.badgeType = i;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    @Nullable
    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(@Nullable Status status) {
        this.status = status;
    }

    @Nullable
    public final CountInfo getCountInfo() {
        return this.countInfo;
    }

    public final void setCountInfo(@Nullable CountInfo countInfo) {
        this.countInfo = countInfo;
    }

    public final long getWid() {
        return this.wid;
    }

    public final void setWid(long j) {
        this.wid = j;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    @Nullable
    public final String getCursor() {
        return this.cursor;
    }

    public final void setCursor(@Nullable String str) {
        this.cursor = str;
    }

    public final int isAuto() {
        return this.isAuto;
    }

    public final void setAuto(int i) {
        this.isAuto = i;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final long getDataTS() {
        return this.dataTS;
    }

    public final void setDataTS(long j) {
        this.dataTS = j;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final void setDayOfWeek(int i) {
        this.dayOfWeek = i;
    }

    public final boolean isToday() {
        return this.isToday;
    }

    public final void setToday(boolean z) {
        this.isToday = z;
    }

    @Nullable
    public final List<Episode> getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(@Nullable List<Episode> list) {
        this.episodes = list;
    }

    @Nullable
    public final List<Rank> getRanks() {
        return this.ranks;
    }

    public final void setRanks(@Nullable List<Rank> list) {
        this.ranks = list;
    }

    @Nullable
    public final String getHat() {
        return this.hat;
    }

    public final void setHat(@Nullable String str) {
        this.hat = str;
    }

    public final boolean isExposureReported() {
        return this.isExposureReported;
    }

    public final void setExposureReported(boolean z) {
        this.isExposureReported = z;
    }

    public final boolean getCanFavor() {
        return this.canFavor;
    }

    public final void setCanFavor(boolean z) {
        this.canFavor = z;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(int i) {
        this.orderId = i;
    }

    @NotNull
    public final String getModuleTitle() {
        return this.moduleTitle;
    }

    public final void setModuleTitle(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.moduleTitle = str;
    }

    @NotNull
    public final String getModuleType() {
        return this.moduleType;
    }

    public final void setModuleType(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.moduleType = str;
    }

    @Nullable
    public final String getModuleId() {
        return this.moduleId;
    }

    public final void setModuleId(@Nullable String str) {
        this.moduleId = str;
    }

    @Nullable
    public final String getReportTitle() {
        return this.reportTitle;
    }

    public final void setReportTitle(@Nullable String str) {
        this.reportTitle = str;
    }

    @Nullable
    public final String getReportSubtitle() {
        return this.reportSubtitle;
    }

    public final void setReportSubtitle(@Nullable String str) {
        this.reportSubtitle = str;
    }

    @Nullable
    public final Integer getFragmentType() {
        return this.fragmentType;
    }

    public final void setFragmentType(@Nullable Integer num) {
        this.fragmentType = num;
    }

    @Nullable
    public final String getPageName() {
        return this.pageName;
    }

    public final void setPageName(@Nullable String str) {
        this.pageName = str;
    }

    @Nullable
    public final String getNewPageName() {
        return this.newPageName;
    }

    public final void setNewPageName(@Nullable String str) {
        this.newPageName = str;
    }

    @NotNull
    public final String getDynamicParam() {
        return this.dynamicParam;
    }

    public final void setDynamicParam(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.dynamicParam = str;
    }

    @NotNull
    public final String getDynamicUpName() {
        return this.dynamicUpName;
    }

    public final void setDynamicUpName(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.dynamicUpName = str;
    }

    public final int getDynamicPlay() {
        return this.dynamicPlay;
    }

    public final void setDynamicPlay(int i) {
        this.dynamicPlay = i;
    }

    public final int getDynamicDanmaku() {
        return this.dynamicDanmaku;
    }

    public final void setDynamicDanmaku(int i) {
        this.dynamicDanmaku = i;
    }

    public final int getDynamicReply() {
        return this.dynamicReply;
    }

    public final void setDynamicReply(int i) {
        this.dynamicReply = i;
    }

    @NotNull
    public final String getDynamicPageName() {
        return this.dynamicPageName;
    }

    public final void setDynamicPageName(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.dynamicPageName = str;
    }

    public final long getDynamicDuration() {
        return this.dynamicDuration;
    }

    public final void setDynamicDuration(long j) {
        this.dynamicDuration = j;
    }
}
