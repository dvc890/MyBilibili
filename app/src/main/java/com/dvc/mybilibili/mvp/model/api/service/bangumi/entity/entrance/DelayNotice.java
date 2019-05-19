package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000fJ\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\fH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Jy\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\u0007H\u00d6\u0001R \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R \u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R \u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013\u00a8\u0006="}, d2 = {"Lcom/bilibili/bangumi/data/entrance/DelayNotice;", "", "delayId", "", "seasonId", "epId", "delayReason", "", "title", "delayDesc", "delayIndex", "pubTimestamp", "", "pubDate", "pubTime", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getDelayDesc", "()Ljava/lang/String;", "setDelayDesc", "(Ljava/lang/String;)V", "getDelayId", "()I", "setDelayId", "(I)V", "getDelayIndex", "setDelayIndex", "getDelayReason", "setDelayReason", "displayTitle", "getDisplayTitle", "setDisplayTitle", "getEpId", "setEpId", "getPubDate", "setPubDate", "getPubTime", "setPubTime", "getPubTimestamp", "()J", "setPubTimestamp", "(J)V", "getSeasonId", "setSeasonId", "getTitle", "setTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class DelayNotice {
    @JSONField(name = "delay_desc")
    @Nullable
    private String delayDesc;
    @JSONField(name = "delay_id")
    private int delayId;
    @JSONField(name = "delay_index")
    @Nullable
    private String delayIndex;
    @JSONField(name = "delay_reason")
    @Nullable
    private String delayReason;
    @NotNull
    private String displayTitle;
    @JSONField(name = "ep_id")
    private int epId;
    @JSONField(name = "pub_date")
    @Nullable
    private String pubDate;
    @JSONField(name = "pub_time")
    @Nullable
    private String pubTime;
    @JSONField(name = "pub_ts")
    private long pubTimestamp;
    @JSONField(name = "season_id")
    private int seasonId;
    @Nullable
    private String title;

    public DelayNotice() {
        this(0, 0, 0, null, null, null, null, 0, null, null, 1023);
    }

    @NotNull
    public static /* synthetic */ DelayNotice copy$default(DelayNotice delayNotice, int i, int i2, int i3, String str, String str2, String str3, String str4, long j, String str5, String str6, int i4, Object obj) {
        DelayNotice delayNotice2 = delayNotice;
        int i5 = i4;
        return delayNotice2.copy((i5 & 1) != 0 ? delayNotice2.delayId : i, (i5 & 2) != 0 ? delayNotice2.seasonId : i2, (i5 & 4) != 0 ? delayNotice2.epId : i3, (i5 & 8) != 0 ? delayNotice2.delayReason : str, (i5 & 16) != 0 ? delayNotice2.title : str2, (i5 & 32) != 0 ? delayNotice2.delayDesc : str3, (i5 & 64) != 0 ? delayNotice2.delayIndex : str4, (i5 & 128) != 0 ? delayNotice2.pubTimestamp : j, (i5 & 256) != 0 ? delayNotice2.pubDate : str5, (i5 & 512) != 0 ? delayNotice2.pubTime : str6);
    }

    public final int component1() {
        return this.delayId;
    }

    @Nullable
    public final String component10() {
        return this.pubTime;
    }

    public final int component2() {
        return this.seasonId;
    }

    public final int component3() {
        return this.epId;
    }

    @Nullable
    public final String component4() {
        return this.delayReason;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final String component6() {
        return this.delayDesc;
    }

    @Nullable
    public final String component7() {
        return this.delayIndex;
    }

    public final long component8() {
        return this.pubTimestamp;
    }

    @Nullable
    public final String component9() {
        return this.pubDate;
    }

    @NotNull
    public final DelayNotice copy(int i, int i2, int i3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, @Nullable String str5, @Nullable String str6) {
        return new DelayNotice(i, i2, i3, str, str2, str3, str4, j, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DelayNotice) {
            DelayNotice delayNotice = (DelayNotice) obj;
            if ((this.delayId == delayNotice.delayId ? 1 : null) != null) {
                if ((this.seasonId == delayNotice.seasonId ? 1 : null) != null) {
                    if ((this.epId == delayNotice.epId ? 1 : null) != null && Intrinsics.areEqual(this.delayReason, delayNotice.delayReason) &&Intrinsics.areEqual(this.title, delayNotice.title) &&Intrinsics.areEqual(this.delayDesc, delayNotice.delayDesc) &&Intrinsics.areEqual(this.delayIndex, delayNotice.delayIndex)) {
                        return ((this.pubTimestamp > delayNotice.pubTimestamp ? 1 : (this.pubTimestamp == delayNotice.pubTimestamp ? 0 : -1)) == 0 ? 1 : null) != null &&Intrinsics.areEqual(this.pubDate, delayNotice.pubDate) &&Intrinsics.areEqual(this.pubTime, delayNotice.pubTime);
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.delayId * 31) + this.seasonId) * 31) + this.epId) * 31;
        String str = this.delayReason;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.delayDesc;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.delayIndex;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j = this.pubTimestamp;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        str = this.pubDate;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.pubTime;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DelayNotice(delayId=");
        stringBuilder.append(this.delayId);
        stringBuilder.append(", seasonId=");
        stringBuilder.append(this.seasonId);
        stringBuilder.append(", epId=");
        stringBuilder.append(this.epId);
        stringBuilder.append(", delayReason=");
        stringBuilder.append(this.delayReason);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", delayDesc=");
        stringBuilder.append(this.delayDesc);
        stringBuilder.append(", delayIndex=");
        stringBuilder.append(this.delayIndex);
        stringBuilder.append(", pubTimestamp=");
        stringBuilder.append(this.pubTimestamp);
        stringBuilder.append(", pubDate=");
        stringBuilder.append(this.pubDate);
        stringBuilder.append(", pubTime=");
        stringBuilder.append(this.pubTime);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DelayNotice(int i, int i2, int i3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, @Nullable String str5, @Nullable String str6) {
        this.delayId = i;
        this.seasonId = i2;
        this.epId = i3;
        this.delayReason = str;
        this.title = str2;
        this.delayDesc = str3;
        this.delayIndex = str4;
        this.pubTimestamp = j;
        this.pubDate = str5;
        this.pubTime = str6;
        this.displayTitle = "";
    }

    public final int getDelayId() {
        return this.delayId;
    }

    public final void setDelayId(int i) {
        this.delayId = i;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    public final void setSeasonId(int i) {
        this.seasonId = i;
    }

    public final int getEpId() {
        return this.epId;
    }

    public final void setEpId(int i) {
        this.epId = i;
    }

    @Nullable
    public final String getDelayReason() {
        return this.delayReason;
    }

    public final void setDelayReason(@Nullable String str) {
        this.delayReason = str;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getDelayDesc() {
        return this.delayDesc;
    }

    public final void setDelayDesc(@Nullable String str) {
        this.delayDesc = str;
    }

    @Nullable
    public final String getDelayIndex() {
        return this.delayIndex;
    }

    public final void setDelayIndex(@Nullable String str) {
        this.delayIndex = str;
    }

    public final long getPubTimestamp() {
        return this.pubTimestamp;
    }

    public final void setPubTimestamp(long j) {
        this.pubTimestamp = j;
    }

    @Nullable
    public final String getPubDate() {
        return this.pubDate;
    }

    public final void setPubDate(@Nullable String str) {
        this.pubDate = str;
    }

    public /* synthetic */ DelayNotice(int i, int i2, int i3, String str, String str2, String str3, String str4, long j, String str5, String str6, int i5) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? "" : str2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, (i5 & 128) != 0 ? 0 : j, (i5 & 256) != 0 ? "" : str5, (i5 & 512) != 0 ? "" : str6);
    }

    @Nullable
    public final String getPubTime() {
        return this.pubTime;
    }

    public final void setPubTime(@Nullable String str) {
        this.pubTime = str;
    }

    @NotNull
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final void setDisplayTitle(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.displayTitle = str;
    }
}
