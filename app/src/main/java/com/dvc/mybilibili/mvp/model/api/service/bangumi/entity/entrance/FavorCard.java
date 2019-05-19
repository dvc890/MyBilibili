package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\tH\u00c6\u0003J\t\u0010A\u001a\u00020\tH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\rH\u00c6\u0003J\t\u0010D\u001a\u00020\rH\u00c6\u0003J\u0083\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\u0013\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\tH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b!\u0010 R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006J"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/FavorCard;", "", "title", "", "cover", "badge", "seasonId", "", "seasonType", "", "badgeType", "url", "isFinished", "", "isStarted", "newestEp", "Lcom/bilibili/bangumi/data/entrance/NewestEp;", "watchedEp", "Lcom/bilibili/bangumi/data/entrance/WatchedEp;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;ZZLcom/bilibili/bangumi/data/entrance/NewestEp;Lcom/bilibili/bangumi/data/entrance/WatchedEp;)V", "getBadge", "()Ljava/lang/String;", "setBadge", "(Ljava/lang/String;)V", "getBadgeType", "()I", "setBadgeType", "(I)V", "getCover", "setCover", "()Z", "setFinished", "(Z)V", "setStarted", "getNewestEp", "()Lcom/bilibili/bangumi/data/entrance/NewestEp;", "setNewestEp", "(Lcom/bilibili/bangumi/data/entrance/NewestEp;)V", "getSeasonId", "()J", "setSeasonId", "(J)V", "getSeasonType", "setSeasonType", "status", "Lcom/bilibili/bangumi/data/entrance/Status;", "getStatus", "()Lcom/bilibili/bangumi/data/entrance/Status;", "setStatus", "(Lcom/bilibili/bangumi/data/entrance/Status;)V", "getTitle", "setTitle", "getUrl", "setUrl", "getWatchedEp", "()Lcom/bilibili/bangumi/data/entrance/WatchedEp;", "setWatchedEp", "(Lcom/bilibili/bangumi/data/entrance/WatchedEp;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class FavorCard {
    @Nullable
    private String badge;
    @JSONField(name = "badge_type")
    private int badgeType;
    @Nullable
    private String cover;
    @JSONField(name = "is_finish")
    private boolean isFinished;
    @JSONField(name = "is_started")
    private boolean isStarted;
    @JSONField(name = "new_ep")
    @Nullable
    private NewestEp newestEp;
    @JSONField(name = "season_id")
    private long seasonId;
    @JSONField(name = "season_type")
    private int seasonType;
    @NotNull
    private Status status;
    @Nullable
    private String title;
    @Nullable
    private String url;
    @JSONField(name = "progress")
    @Nullable
    private WatchedEp watchedEp;

    public FavorCard() {
        this(null, null, null, 0, 0, 0, null, false, false, null, null, 2047);
    }

    @NotNull
    public static /* synthetic */ FavorCard copy$default(FavorCard favorCard, String str, String str2, String str3, long j, int i, int i2, String str4, boolean z, boolean z2, NewestEp newestEp, WatchedEp watchedEp, int i3, Object obj) {
        FavorCard favorCard2 = favorCard;
        int i4 = i3;
        return favorCard2.copy((i4 & 1) != 0 ? favorCard2.title : str, (i4 & 2) != 0 ? favorCard2.cover : str2, (i4 & 4) != 0 ? favorCard2.badge : str3, (i4 & 8) != 0 ? favorCard2.seasonId : j, (i4 & 16) != 0 ? favorCard2.seasonType : i, (i4 & 32) != 0 ? favorCard2.badgeType : i2, (i4 & 64) != 0 ? favorCard2.url : str4, (i4 & 128) != 0 ? favorCard2.isFinished : z, (i4 & 256) != 0 ? favorCard2.isStarted : z2, (i4 & 512) != 0 ? favorCard2.newestEp : newestEp, (i4 & 1024) != 0 ? favorCard2.watchedEp : watchedEp);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final NewestEp component10() {
        return this.newestEp;
    }

    @Nullable
    public final WatchedEp component11() {
        return this.watchedEp;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final String component3() {
        return this.badge;
    }

    public final long component4() {
        return this.seasonId;
    }

    public final int component5() {
        return this.seasonType;
    }

    public final int component6() {
        return this.badgeType;
    }

    @Nullable
    public final String component7() {
        return this.url;
    }

    public final boolean component8() {
        return this.isFinished;
    }

    public final boolean component9() {
        return this.isStarted;
    }

    @NotNull
    public final FavorCard copy(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, int i, int i2, @Nullable String str4, boolean z, boolean z2, @Nullable NewestEp newestEp, @Nullable WatchedEp watchedEp) {
        return new FavorCard(str, str2, str3, j, i, i2, str4, z, z2, newestEp, watchedEp);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavorCard) {
            FavorCard favorCard = (FavorCard) obj;
            if (Intrinsics.areEqual(this.title, favorCard.title) && Intrinsics.areEqual(this.cover, favorCard.cover) &&Intrinsics.areEqual(this.badge, favorCard.badge)) {
                if ((this.seasonId == favorCard.seasonId ? 1 : null) != null) {
                    if ((this.seasonType == favorCard.seasonType ? 1 : null) != null) {
                        if ((this.badgeType == favorCard.badgeType ? 1 : null) != null &&Intrinsics.areEqual(this.url, favorCard.url)) {
                            if ((this.isFinished == favorCard.isFinished ? 1 : null) != null) {
                                return (this.isStarted == favorCard.isStarted ? 1 : null) != null &&Intrinsics.areEqual(this.newestEp, favorCard.newestEp) &&Intrinsics.areEqual(this.watchedEp, favorCard.watchedEp);
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
        str2 = this.badge;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.seasonId;
        hashCode = (((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.seasonType) * 31) + this.badgeType) * 31;
        str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.isFinished?1:0;
        hashCode = (hashCode + i2) * 31;
        i2 = this.isStarted?1:0;
        hashCode = (hashCode + i2) * 31;
        NewestEp newestEp = this.newestEp;
        hashCode = (hashCode + (newestEp != null ? newestEp.hashCode() : 0)) * 31;
        WatchedEp watchedEp = this.watchedEp;
        if (watchedEp != null) {
            i = watchedEp.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FavorCard(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", badge=");
        stringBuilder.append(this.badge);
        stringBuilder.append(", seasonId=");
        stringBuilder.append(this.seasonId);
        stringBuilder.append(", seasonType=");
        stringBuilder.append(this.seasonType);
        stringBuilder.append(", badgeType=");
        stringBuilder.append(this.badgeType);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", isFinished=");
        stringBuilder.append(this.isFinished);
        stringBuilder.append(", isStarted=");
        stringBuilder.append(this.isStarted);
        stringBuilder.append(", newestEp=");
        stringBuilder.append(this.newestEp);
        stringBuilder.append(", watchedEp=");
        stringBuilder.append(this.watchedEp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FavorCard(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, int i, int i2, @Nullable String str4, boolean z, boolean z2, @Nullable NewestEp newestEp, @Nullable WatchedEp watchedEp) {
        this.title = str;
        this.cover = str2;
        this.badge = str3;
        this.seasonId = j;
        this.seasonType = i;
        this.badgeType = i2;
        this.url = str4;
        this.isFinished = z;
        this.isStarted = z2;
        this.newestEp = newestEp;
        this.watchedEp = watchedEp;
        this.status = new Status(false);
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

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public final void setFinished(boolean z) {
        this.isFinished = z;
    }

    public final boolean isStarted() {
        return this.isStarted;
    }

    public final void setStarted(boolean z) {
        this.isStarted = z;
    }

    public /* synthetic */ FavorCard(String str, String str2, String str3, long j, int i, int i2, String str4, boolean z, boolean z2, NewestEp newestEp, WatchedEp watchedEp, int i4) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? 0 : j, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? (NewestEp) null : newestEp, (i4 & 1024) != 0 ? new WatchedEp(0, null, null, 7) : watchedEp);
    }

    @Nullable
    public final NewestEp getNewestEp() {
        return this.newestEp;
    }

    public final void setNewestEp(@Nullable NewestEp newestEp) {
        this.newestEp = newestEp;
    }

    @Nullable
    public final WatchedEp getWatchedEp() {
        return this.watchedEp;
    }

    public final void setWatchedEp(@Nullable WatchedEp watchedEp) {
        this.watchedEp = watchedEp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(@NotNull Status status) {
       //Intrinsics.checkParameterIsNotNull(status, "<set-?>");
        this.status = status;
    }
}
