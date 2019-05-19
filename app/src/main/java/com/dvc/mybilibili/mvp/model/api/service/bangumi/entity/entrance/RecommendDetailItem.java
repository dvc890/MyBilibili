package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\bH\u00c6\u0003J\t\u0010D\u001a\u00020\bH\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\u0099\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\bH\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001e\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018\u00a8\u0006L"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/RecommendDetailItem;", "", "cover", "", "desc", "publishTime", "Lcom/bilibili/bangumi/data/entrance/PublishTime;", "itemId", "", "link", "title", "linkValue", "linkType", "seasonType", "followIcon", "playIcon", "status", "Lcom/bilibili/bangumi/data/entrance/DetailStatus;", "rating", "Lcom/bilibili/bangumi/data/entrance/RatingBean;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bilibili/bangumi/data/entrance/PublishTime;ILjava/lang/String;Ljava/lang/String;IIIIILcom/bilibili/bangumi/data/entrance/DetailStatus;Lcom/bilibili/bangumi/data/entrance/RatingBean;)V", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "getDesc", "setDesc", "getFollowIcon", "()I", "setFollowIcon", "(I)V", "getItemId", "setItemId", "getLink", "setLink", "getLinkType", "setLinkType", "getLinkValue", "setLinkValue", "getPlayIcon", "setPlayIcon", "getPublishTime", "()Lcom/bilibili/bangumi/data/entrance/PublishTime;", "setPublishTime", "(Lcom/bilibili/bangumi/data/entrance/PublishTime;)V", "getRating", "()Lcom/bilibili/bangumi/data/entrance/RatingBean;", "setRating", "(Lcom/bilibili/bangumi/data/entrance/RatingBean;)V", "getSeasonType", "setSeasonType", "getStatus", "()Lcom/bilibili/bangumi/data/entrance/DetailStatus;", "setStatus", "(Lcom/bilibili/bangumi/data/entrance/DetailStatus;)V", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class RecommendDetailItem {
    @Nullable
    private String cover;
    @Nullable
    private String desc;
    @JSONField(name = "follow_icon")
    private int followIcon;
    @JSONField(name = "item_id")
    private int itemId;
    @Nullable
    private String link;
    @JSONField(name = "link_type")
    private int linkType;
    @JSONField(name = "link_value")
    private int linkValue;
    @JSONField(name = "play_icon")
    private int playIcon;
    @JSONField(name = "pub_time")
    @Nullable
    private PublishTime publishTime;
    @Nullable
    private RatingBean rating;
    @JSONField(name = "season_type")
    private int seasonType;
    @Nullable
    private DetailStatus status;
    @Nullable
    private String title;

    public RecommendDetailItem() {
        this(null, null, null, 0, null, null, 0, 0, 0, 0, 0, null, null, 8191);
    }

    @NotNull
    public static /* synthetic */ RecommendDetailItem copy$default(RecommendDetailItem recommendDetailItem, String str, String str2, PublishTime publishTime, int i, String str3, String str4, int i2, int i3, int i4, int i5, int i6, DetailStatus detailStatus, RatingBean ratingBean, int i7, Object obj) {
        RecommendDetailItem recommendDetailItem2 = recommendDetailItem;
        int i8 = i7;
        return recommendDetailItem2.copy((i8 & 1) != 0 ? recommendDetailItem2.cover : str, (i8 & 2) != 0 ? recommendDetailItem2.desc : str2, (i8 & 4) != 0 ? recommendDetailItem2.publishTime : publishTime, (i8 & 8) != 0 ? recommendDetailItem2.itemId : i, (i8 & 16) != 0 ? recommendDetailItem2.link : str3, (i8 & 32) != 0 ? recommendDetailItem2.title : str4, (i8 & 64) != 0 ? recommendDetailItem2.linkValue : i2, (i8 & 128) != 0 ? recommendDetailItem2.linkType : i3, (i8 & 256) != 0 ? recommendDetailItem2.seasonType : i4, (i8 & 512) != 0 ? recommendDetailItem2.followIcon : i5, (i8 & 1024) != 0 ? recommendDetailItem2.playIcon : i6, (i8 & 2048) != 0 ? recommendDetailItem2.status : detailStatus, (i8 & 4096) != 0 ? recommendDetailItem2.rating : ratingBean);
    }

    @Nullable
    public final String component1() {
        return this.cover;
    }

    public final int component10() {
        return this.followIcon;
    }

    public final int component11() {
        return this.playIcon;
    }

    @Nullable
    public final DetailStatus component12() {
        return this.status;
    }

    @Nullable
    public final RatingBean component13() {
        return this.rating;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    @Nullable
    public final PublishTime component3() {
        return this.publishTime;
    }

    public final int component4() {
        return this.itemId;
    }

    @Nullable
    public final String component5() {
        return this.link;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    public final int component7() {
        return this.linkValue;
    }

    public final int component8() {
        return this.linkType;
    }

    public final int component9() {
        return this.seasonType;
    }

    @NotNull
    public final RecommendDetailItem copy(@Nullable String str, @Nullable String str2, @Nullable PublishTime publishTime, int i, @Nullable String str3, @Nullable String str4, int i2, int i3, int i4, int i5, int i6, @Nullable DetailStatus detailStatus, @Nullable RatingBean ratingBean) {
        return new RecommendDetailItem(str, str2, publishTime, i, str3, str4, i2, i3, i4, i5, i6, detailStatus, ratingBean);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendDetailItem) {
            RecommendDetailItem recommendDetailItem = (RecommendDetailItem) obj;
            if (Intrinsics.areEqual(this.cover, recommendDetailItem.cover) && Intrinsics.areEqual(this.desc, recommendDetailItem.desc) &&Intrinsics.areEqual(this.publishTime, recommendDetailItem.publishTime)) {
                if ((this.itemId == recommendDetailItem.itemId ? 1 : null) != null &&Intrinsics.areEqual(this.link, recommendDetailItem.link) &&Intrinsics.areEqual(this.title, recommendDetailItem.title)) {
                    if ((this.linkValue == recommendDetailItem.linkValue ? 1 : null) != null) {
                        if ((this.linkType == recommendDetailItem.linkType ? 1 : null) != null) {
                            if ((this.seasonType == recommendDetailItem.seasonType ? 1 : null) != null) {
                                if ((this.followIcon == recommendDetailItem.followIcon ? 1 : null) != null) {
                                    return (this.playIcon == recommendDetailItem.playIcon ? 1 : null) != null &&Intrinsics.areEqual(this.status, recommendDetailItem.status) &&Intrinsics.areEqual(this.rating, recommendDetailItem.rating);
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
        String str = this.cover;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        PublishTime publishTime = this.publishTime;
        hashCode = (((hashCode + (publishTime != null ? publishTime.hashCode() : 0)) * 31) + this.itemId) * 31;
        str2 = this.link;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.title;
        hashCode = (((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.linkValue) * 31) + this.linkType) * 31) + this.seasonType) * 31) + this.followIcon) * 31) + this.playIcon) * 31;
        DetailStatus detailStatus = this.status;
        hashCode = (hashCode + (detailStatus != null ? detailStatus.hashCode() : 0)) * 31;
        RatingBean ratingBean = this.rating;
        if (ratingBean != null) {
            i = ratingBean.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecommendDetailItem(cover=");
        stringBuilder.append(this.cover);
        stringBuilder.append(", desc=");
        stringBuilder.append(this.desc);
        stringBuilder.append(", publishTime=");
        stringBuilder.append(this.publishTime);
        stringBuilder.append(", itemId=");
        stringBuilder.append(this.itemId);
        stringBuilder.append(", link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", linkValue=");
        stringBuilder.append(this.linkValue);
        stringBuilder.append(", linkType=");
        stringBuilder.append(this.linkType);
        stringBuilder.append(", seasonType=");
        stringBuilder.append(this.seasonType);
        stringBuilder.append(", followIcon=");
        stringBuilder.append(this.followIcon);
        stringBuilder.append(", playIcon=");
        stringBuilder.append(this.playIcon);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", rating=");
        stringBuilder.append(this.rating);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecommendDetailItem(@Nullable String str, @Nullable String str2, @Nullable PublishTime publishTime, int i, @Nullable String str3, @Nullable String str4, int i2, int i3, int i4, int i5, int i6, @Nullable DetailStatus detailStatus, @Nullable RatingBean ratingBean) {
        this.cover = str;
        this.desc = str2;
        this.publishTime = publishTime;
        this.itemId = i;
        this.link = str3;
        this.title = str4;
        this.linkValue = i2;
        this.linkType = i3;
        this.seasonType = i4;
        this.followIcon = i5;
        this.playIcon = i6;
        this.status = detailStatus;
        this.rating = ratingBean;
    }

    public /* synthetic */ RecommendDetailItem(String str, String str2, PublishTime publishTime, int i, String str3, String str4, int i2, int i3, int i4, int i5, int i6, DetailStatus detailStatus, RatingBean ratingBean, int i8) {
        this((i8 & 1) != 0 ? (String) null : str, (i8 & 2) != 0 ? (String) null : str2, (i8 & 4) != 0 ? (PublishTime) null : publishTime, (i8 & 8) != 0 ? 0 : i, (i8 & 16) != 0 ? (String) null : str3, (i8 & 32) != 0 ? (String) null : str4, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? 0 : i3, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? 0 : i6, (i8 & 2048) != 0 ? (DetailStatus) null : detailStatus, (i8 & 4096) != 0 ? (RatingBean) null : ratingBean);
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

    @Nullable
    public final PublishTime getPublishTime() {
        return this.publishTime;
    }

    public final void setPublishTime(@Nullable PublishTime publishTime) {
        this.publishTime = publishTime;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final void setItemId(int i) {
        this.itemId = i;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final int getLinkValue() {
        return this.linkValue;
    }

    public final void setLinkValue(int i) {
        this.linkValue = i;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final void setLinkType(int i) {
        this.linkType = i;
    }

    public final int getSeasonType() {
        return this.seasonType;
    }

    public final void setSeasonType(int i) {
        this.seasonType = i;
    }

    public final int getFollowIcon() {
        return this.followIcon;
    }

    public final void setFollowIcon(int i) {
        this.followIcon = i;
    }

    public final int getPlayIcon() {
        return this.playIcon;
    }

    public final void setPlayIcon(int i) {
        this.playIcon = i;
    }

    @Nullable
    public final DetailStatus getStatus() {
        return this.status;
    }

    public final void setStatus(@Nullable DetailStatus detailStatus) {
        this.status = detailStatus;
    }

    @Nullable
    public final RatingBean getRating() {
        return this.rating;
    }

    public final void setRating(@Nullable RatingBean ratingBean) {
        this.rating = ratingBean;
    }
}
