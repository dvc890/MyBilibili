package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\t\u00106\u001a\u00020\rH\u00c6\u0003J{\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\rH\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014\u00a8\u0006="}, d2 = {"Lcom/bilibili/bangumi/data/entrance/Rank;", "", "title", "", "cover", "oid", "", "type", "link", "status", "Lcom/bilibili/bangumi/data/entrance/Status;", "badge", "seasonType", "", "badgeType", "gradeText", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/bilibili/bangumi/data/entrance/Status;Ljava/lang/String;IILjava/lang/String;)V", "getBadge", "()Ljava/lang/String;", "setBadge", "(Ljava/lang/String;)V", "getBadgeType", "()I", "setBadgeType", "(I)V", "getCover", "setCover", "getGradeText", "setGradeText", "getLink", "setLink", "getOid", "()J", "setOid", "(J)V", "getSeasonType", "setSeasonType", "getStatus", "()Lcom/bilibili/bangumi/data/entrance/Status;", "setStatus", "(Lcom/bilibili/bangumi/data/entrance/Status;)V", "getTitle", "setTitle", "getType", "setType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Rank {
    @Nullable
    private String badge;
    @JSONField(name = "badge_type")
    private int badgeType;
    @Nullable
    private String cover;
    @JSONField(name = "pts")
    @Nullable
    private String gradeText;
    @Nullable
    private String link;
    private long oid;
    @JSONField(name = "season_type")
    private int seasonType;
    @Nullable
    private Status status;
    @Nullable
    private String title;
    @Nullable
    private String type;

    public Rank() {
        this(null, null, 0, null, null, null, null, 0, 0, null, 1023);
    }

    @NotNull
    public static /* synthetic */ Rank copy$default(Rank rank, String str, String str2, long j, String str3, String str4, Status status, String str5, int i, int i2, String str6, int i3, Object obj) {
        Rank rank2 = rank;
        int i4 = i3;
        return rank2.copy((i4 & 1) != 0 ? rank2.title : str, (i4 & 2) != 0 ? rank2.cover : str2, (i4 & 4) != 0 ? rank2.oid : j, (i4 & 8) != 0 ? rank2.type : str3, (i4 & 16) != 0 ? rank2.link : str4, (i4 & 32) != 0 ? rank2.status : status, (i4 & 64) != 0 ? rank2.badge : str5, (i4 & 128) != 0 ? rank2.seasonType : i, (i4 & 256) != 0 ? rank2.badgeType : i2, (i4 & 512) != 0 ? rank2.gradeText : str6);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component10() {
        return this.gradeText;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    public final long component3() {
        return this.oid;
    }

    @Nullable
    public final String component4() {
        return this.type;
    }

    @Nullable
    public final String component5() {
        return this.link;
    }

    @Nullable
    public final Status component6() {
        return this.status;
    }

    @Nullable
    public final String component7() {
        return this.badge;
    }

    public final int component8() {
        return this.seasonType;
    }

    public final int component9() {
        return this.badgeType;
    }

    @NotNull
    public final Rank copy(@Nullable String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, @Nullable Status status, @Nullable String str5, int i, int i2, @Nullable String str6) {
        return new Rank(str, str2, j, str3, str4, status, str5, i, i2, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rank) {
            Rank rank = (Rank) obj;
            if (Intrinsics.areEqual(this.title, rank.title) &&Intrinsics.areEqual(this.cover, rank.cover)) {
                if ((this.oid == rank.oid ? 1 : null) != null &&Intrinsics.areEqual(this.type, rank.type) &&Intrinsics.areEqual(this.link, rank.link) &&Intrinsics.areEqual(this.status, rank.status) &&Intrinsics.areEqual(this.badge, rank.badge)) {
                    if ((this.seasonType == rank.seasonType ? 1 : null) != null) {
                        return (this.badgeType == rank.badgeType ? 1 : null) != null &&Intrinsics.areEqual(this.gradeText, rank.gradeText);
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
        long j = this.oid;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.link;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Status status = this.status;
        hashCode = (hashCode + (status != null ? status.hashCode() : 0)) * 31;
        str2 = this.badge;
        hashCode = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.seasonType) * 31) + this.badgeType) * 31;
        str2 = this.gradeText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rank(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", oid=");
        stringBuilder.append(this.oid);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", badge=");
        stringBuilder.append(this.badge);
        stringBuilder.append(", seasonType=");
        stringBuilder.append(this.seasonType);
        stringBuilder.append(", badgeType=");
        stringBuilder.append(this.badgeType);
        stringBuilder.append(", gradeText=");
        stringBuilder.append(this.gradeText);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Rank(@Nullable String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, @Nullable Status status, @Nullable String str5, int i, int i2, @Nullable String str6) {
        this.title = str;
        this.cover = str2;
        this.oid = j;
        this.type = str3;
        this.link = str4;
        this.status = status;
        this.badge = str5;
        this.seasonType = i;
        this.badgeType = i2;
        this.gradeText = str6;
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

    public final long getOid() {
        return this.oid;
    }

    public final void setOid(long j) {
        this.oid = j;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public /* synthetic */ Rank(String str, String str2, long j, String str3, String str4, Status status, String str5, int i, int i2, String str6, int i4) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : j, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? new Status(false) : status, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? 1 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? "" : str6);
    }

    @Nullable
    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(@Nullable Status status) {
        this.status = status;
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
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
    public final String getGradeText() {
        return this.gradeText;
    }

    public final void setGradeText(@Nullable String str) {
        this.gradeText = str;
    }
}
