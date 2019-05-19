package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\rH\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010B\u001a\u00020\rH\u00c6\u0003J\u00a0\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020HH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016\u00a8\u0006J"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/Episode;", "", "title", "", "cover", "squareCover", "seasonId", "", "epId", "publishTitle", "publishTime", "publishTs", "published", "", "delay", "delayId", "delayTitle", "delayReason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZJLjava/lang/String;Ljava/lang/String;)V", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "getDelay", "()Z", "setDelay", "(Z)V", "getDelayId", "()J", "setDelayId", "(J)V", "getDelayReason", "setDelayReason", "getDelayTitle", "setDelayTitle", "getEpId", "setEpId", "getPublishTime", "setPublishTime", "getPublishTitle", "setPublishTitle", "getPublishTs", "()Ljava/lang/Long;", "setPublishTs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPublished", "setPublished", "getSeasonId", "setSeasonId", "getSquareCover", "setSquareCover", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZJLjava/lang/String;Ljava/lang/String;)Lcom/bilibili/bangumi/data/entrance/Episode;", "equals", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Episode {
    @Nullable
    private String cover;
    private boolean delay;
    @JSONField(name = "delay_id")
    private long delayId;
    @JSONField(name = "delay_reason")
    @Nullable
    private String delayReason;
    @JSONField(name = "delay_index")
    @Nullable
    private String delayTitle;
    @JSONField(name = "episode_id")
    private long epId;
    @JSONField(name = "pub_time")
    @Nullable
    private String publishTime;
    @JSONField(name = "pub_index")
    @Nullable
    private String publishTitle;
    @JSONField(name = "pub_ts")
    @Nullable
    private Long publishTs;
    private boolean published;
    @JSONField(name = "season_id")
    private long seasonId;
    @JSONField(name = "square_cover")
    @Nullable
    private String squareCover;
    @Nullable
    private String title;

    public Episode() {
        this(null, null, null, 0, 0, null, null, null, false, false, 0, null, null, 8191);
    }

    @NotNull
    public static /* synthetic */ Episode copy$default(Episode episode, String str, String str2, String str3, long j, long j2, String str4, String str5, Long l, boolean z, boolean z2, long j3, String str6, String str7, int i, Object obj) {
        Episode episode2 = episode;
        int i2 = i;
        return episode2.copy((i2 & 1) != 0 ? episode2.title : str, (i2 & 2) != 0 ? episode2.cover : str2, (i2 & 4) != 0 ? episode2.squareCover : str3, (i2 & 8) != 0 ? episode2.seasonId : j, (i2 & 16) != 0 ? episode2.epId : j2, (i2 & 32) != 0 ? episode2.publishTitle : str4, (i2 & 64) != 0 ? episode2.publishTime : str5, (i2 & 128) != 0 ? episode2.publishTs : l, (i2 & 256) != 0 ? episode2.published : z, (i2 & 512) != 0 ? episode2.delay : z2, (i2 & 1024) != 0 ? episode2.delayId : j3, (i2 & 2048) != 0 ? episode2.delayTitle : str6, (i2 & 4096) != 0 ? episode2.delayReason : str7);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.delay;
    }

    public final long component11() {
        return this.delayId;
    }

    @Nullable
    public final String component12() {
        return this.delayTitle;
    }

    @Nullable
    public final String component13() {
        return this.delayReason;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final String component3() {
        return this.squareCover;
    }

    public final long component4() {
        return this.seasonId;
    }

    public final long component5() {
        return this.epId;
    }

    @Nullable
    public final String component6() {
        return this.publishTitle;
    }

    @Nullable
    public final String component7() {
        return this.publishTime;
    }

    @Nullable
    public final Long component8() {
        return this.publishTs;
    }

    public final boolean component9() {
        return this.published;
    }

    @NotNull
    public final Episode copy(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @Nullable String str5, @Nullable Long l, boolean z, boolean z2, long j3, @Nullable String str6, @Nullable String str7) {
        return new Episode(str, str2, str3, j, j2, str4, str5, l, z, z2, j3, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Episode) {
            Episode episode = (Episode) obj;
            if (Intrinsics.areEqual(this.title, episode.title) &&Intrinsics.areEqual(this.cover, episode.cover) && Intrinsics.areEqual(this.squareCover, episode.squareCover)) {
                if ((this.seasonId == episode.seasonId ? 1 : null) != null) {
                    if ((this.epId == episode.epId ? 1 : null) != null &&Intrinsics.areEqual(this.publishTitle, episode.publishTitle) &&Intrinsics.areEqual(this.publishTime, episode.publishTime) &&Intrinsics.areEqual(this.publishTs, episode.publishTs)) {
                        if ((this.published == episode.published ? 1 : null) != null) {
                            if ((this.delay == episode.delay ? 1 : null) != null) {
                                return ((this.delayId > episode.delayId ? 1 : (this.delayId == episode.delayId ? 0 : -1)) == 0 ? 1 : null) != null &&Intrinsics.areEqual(this.delayTitle, episode.delayTitle) &&Intrinsics.areEqual(this.delayReason, episode.delayReason);
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
        str2 = this.squareCover;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.seasonId;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.epId;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.publishTitle;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.publishTime;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.publishTs;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        int i2 = this.published?1:0;
        hashCode = (hashCode + i2) * 31;
        i2 = this.delay?1:0;
        hashCode = (hashCode + i2) * 31;
        j = this.delayId;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.delayTitle;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.delayReason;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Episode(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", squareCover=");
        stringBuilder.append(this.squareCover);
        stringBuilder.append(", seasonId=");
        stringBuilder.append(this.seasonId);
        stringBuilder.append(", epId=");
        stringBuilder.append(this.epId);
        stringBuilder.append(", publishTitle=");
        stringBuilder.append(this.publishTitle);
        stringBuilder.append(", publishTime=");
        stringBuilder.append(this.publishTime);
        stringBuilder.append(", publishTs=");
        stringBuilder.append(this.publishTs);
        stringBuilder.append(", published=");
        stringBuilder.append(this.published);
        stringBuilder.append(", delay=");
        stringBuilder.append(this.delay);
        stringBuilder.append(", delayId=");
        stringBuilder.append(this.delayId);
        stringBuilder.append(", delayTitle=");
        stringBuilder.append(this.delayTitle);
        stringBuilder.append(", delayReason=");
        stringBuilder.append(this.delayReason);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Episode(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @Nullable String str5, @Nullable Long l, boolean z, boolean z2, long j3, @Nullable String str6, @Nullable String str7) {
        this.title = str;
        this.cover = str2;
        this.squareCover = str3;
        this.seasonId = j;
        this.epId = j2;
        this.publishTitle = str4;
        this.publishTime = str5;
        this.publishTs = l;
        this.published = z;
        this.delay = z2;
        this.delayId = j3;
        this.delayTitle = str6;
        this.delayReason = str7;
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
    public final String getSquareCover() {
        return this.squareCover;
    }

    public final void setSquareCover(@Nullable String str) {
        this.squareCover = str;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    public final void setSeasonId(long j) {
        this.seasonId = j;
    }

    public final long getEpId() {
        return this.epId;
    }

    public final void setEpId(long j) {
        this.epId = j;
    }

    @Nullable
    public final String getPublishTitle() {
        return this.publishTitle;
    }

    public final void setPublishTitle(@Nullable String str) {
        this.publishTitle = str;
    }

    @Nullable
    public final String getPublishTime() {
        return this.publishTime;
    }

    public final void setPublishTime(@Nullable String str) {
        this.publishTime = str;
    }

    public /* synthetic */ Episode(String str, String str2, String str3, long j, long j2, String str4, String str5, Long l, boolean z, boolean z2, long j3, String str6, String str7, int i) {
        this(str, str2, str3,
                (i & 8) != 0 ? 0 : j,
                (i & 16) != 0 ? 0 : j2,
                (i & 32) != 0 ? "" : str4,
                (i & 64) != 0 ? "" : str5,
                (i & 128) != 0 ? Long.valueOf(0) : l,
                (i & 256) != 0 ? false : z,
                (i & 512) == 0?z2:false,
                (i & 1024) != 0 ? 0 : j3,
                (i & 2048) != 0 ? "" : str6,
                (i & 4096) != 0 ? "" : str7);
    }

    @Nullable
    public final Long getPublishTs() {
        return this.publishTs;
    }

    public final void setPublishTs(@Nullable Long l) {
        this.publishTs = l;
    }

    public final boolean getPublished() {
        return this.published;
    }

    public final void setPublished(boolean z) {
        this.published = z;
    }

    public final boolean getDelay() {
        return this.delay;
    }

    public final void setDelay(boolean z) {
        this.delay = z;
    }

    public final long getDelayId() {
        return this.delayId;
    }

    public final void setDelayId(long j) {
        this.delayId = j;
    }

    @Nullable
    public final String getDelayTitle() {
        return this.delayTitle;
    }

    public final void setDelayTitle(@Nullable String str) {
        this.delayTitle = str;
    }

    @Nullable
    public final String getDelayReason() {
        return this.delayReason;
    }

    public final void setDelayReason(@Nullable String str) {
        this.delayReason = str;
    }
}
