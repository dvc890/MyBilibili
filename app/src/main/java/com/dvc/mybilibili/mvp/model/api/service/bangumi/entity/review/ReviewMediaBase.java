package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class ReviewMediaBase implements Parcelable {
    public static final Creator<ReviewMediaBase> CREATOR = new C18591();
    public static final int TYPE_BANGUMI = 1;
    public static final int TYPE_DOCUMENTARY = 3;
    public static final int TYPE_DOMESTIC_BANGUMI = 4;
    public static final int TYPE_MOVIE = 2;
    public static final int TYPE_TV = 5;
    @JSONField(name = "actor")
    public String actors;
    @JSONField(name = "alias")
    public String aliasName;
    @Nullable
    @JSONField(name = "area")
    public List<ReviewArea> area;
    @Nullable
    @JSONField(name = "area")
    public List<ReviewArea> areas;
    @JSONField(name = "chn_name")
    public String chnName;
    @JSONField(name = "cover")
    public String coverUrl;
    @JSONField(name = "cursor")
    public String cursor;
    @Nullable
    @JSONField(name = "episode_index")
    public MediaEpisodeIndex episodeIndex;
    @JSONField(name = "evaluate")
    public String evaluate;
    @JSONField(name = "media_id")
    public int mediaId;
    @Nullable
    @JSONField(name = "new_ep")
    public MediaEpisodeIndex newEp;
    @JSONField(name = "origin_name")
    public String originName;
    @Nullable
    @JSONField(name = "param")
    public ReviewParam param;
    @Nullable
    @JSONField(name = "publish")
    public ReviewPublish publish;
    @Nullable
    @JSONField(name = "rating")
    public MediaRating rating;
    @JSONField(name = "share_url")
    public String shareUrl;
    @JSONField(name = "staff")
    public String staff;
    @Nullable
    @JSONField(name = "style")
    public List<ReviewTag> styles;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "type_id")
    public int typeId;
    @JSONField(name = "type_name")
    public String typeName;

    public ReviewMediaBase() {

    }

    @Keep
    /* compiled from: BL */
    public static class ReviewArea implements Parcelable {
        public static final Creator<ReviewArea> CREATOR = new C18551();
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5695id;
        @JSONField(name = "name")
        public String name;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaBase$ReviewArea$1 */
        static class C18551 implements Creator<ReviewArea> {
            C18551() {
            }

            /* renamed from: a */
            public ReviewArea createFromParcel(Parcel parcel) {
                return new ReviewArea(parcel);
            }

            /* renamed from: a */
            public ReviewArea[] newArray(int i) {
                return new ReviewArea[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected ReviewArea(Parcel parcel) {
            this.f5695id = parcel.readInt();
            this.name = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5695id);
            parcel.writeString(this.name);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class ReviewParam implements Parcelable {
        public static final Creator<ReviewParam> CREATOR = new C18561();
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5696id;
        @JSONField(name = "url")
        public String url;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaBase$ReviewParam$1 */
        static class C18561 implements Creator<ReviewParam> {
            C18561() {
            }

            /* renamed from: a */
            public ReviewParam createFromParcel(Parcel parcel) {
                return new ReviewParam(parcel);
            }

            /* renamed from: a */
            public ReviewParam[] newArray(int i) {
                return new ReviewParam[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5696id);
            parcel.writeString(this.url);
        }

        protected ReviewParam(Parcel parcel) {
            this.f5696id = parcel.readInt();
            this.url = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class ReviewPublish implements Parcelable {
        public static final Creator<ReviewPublish> CREATOR = new C18571();
        @JSONField(name = "is_finish")
        public boolean isFinish;
        @JSONField(name = "is_multi")
        public boolean isMulti;
        @JSONField(name = "is_started")
        public boolean isStart;
        @JSONField(name = "pub_date")
        public String pubDate;
        @JSONField(name = "pub_date_show")
        public String pubDateShow;
        @JSONField(name = "time_length")
        public int timeLength;
        @JSONField(name = "total_ep")
        public int totalEps;
        @JSONField(name = "weekday")
        public int weekday;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaBase$ReviewPublish$1 */
        static class C18571 implements Creator<ReviewPublish> {
            C18571() {
            }

            /* renamed from: a */
            public ReviewPublish createFromParcel(Parcel parcel) {
                return new ReviewPublish(parcel);
            }

            /* renamed from: a */
            public ReviewPublish[] newArray(int i) {
                return new ReviewPublish[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.pubDate);
            parcel.writeString(this.pubDateShow);
            parcel.writeByte((byte) (this.isStart?1:0));
            parcel.writeByte((byte) (this.isFinish?1:0));
            parcel.writeByte((byte) (this.isMulti?1:0));
            parcel.writeInt(this.weekday);
            parcel.writeInt(this.timeLength);
            parcel.writeInt(this.totalEps);
        }

        protected ReviewPublish(Parcel parcel) {
            this.pubDate = parcel.readString();
            this.pubDateShow = parcel.readString();
            boolean z = false;
            this.isStart = parcel.readByte() != (byte) 0;
            this.isFinish = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.isMulti = z;
            this.weekday = parcel.readInt();
            this.timeLength = parcel.readInt();
            this.totalEps = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class ReviewTag implements Parcelable {
        public static final Creator<ReviewTag> CREATOR = new C18581();
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5697id;
        @JSONField(name = "name")
        public String name;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaBase$ReviewTag$1 */
        static class C18581 implements Creator<ReviewTag> {
            C18581() {
            }

            /* renamed from: a */
            public ReviewTag createFromParcel(Parcel parcel) {
                return new ReviewTag(parcel);
            }

            /* renamed from: a */
            public ReviewTag[] newArray(int i) {
                return new ReviewTag[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected ReviewTag(Parcel parcel) {
            this.f5697id = parcel.readInt();
            this.name = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5697id);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewMediaBase$1 */
    static class C18591 implements Creator<ReviewMediaBase> {
        C18591() {
        }

        /* renamed from: a */
        public ReviewMediaBase createFromParcel(Parcel parcel) {
            return new ReviewMediaBase(parcel);
        }

        /* renamed from: a */
        public ReviewMediaBase[] newArray(int i) {
            return new ReviewMediaBase[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String formatTags() {
        if (this.styles == null) {
            return "";
        }
        return formatTags("\u3001");
    }

    public String formatTags(String str) {
        if (this.styles == null) {
            return "";
        }
        return formatTags(str, this.styles.size());
    }

    public String formatTags(String str, int i) {
        if (this.styles == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < this.styles.size() && i2 < i) {
            ReviewTag reviewTag = (ReviewTag) this.styles.get(i2);
            if (!(reviewTag == null || TextUtils.isEmpty(reviewTag.name))) {
                arrayList.add(reviewTag.name);
            }
            i2++;
        }
        return TextUtils.join(str, arrayList.toArray());
    }

    public String getPrimaryArea() {
        return (this.area == null || this.area.size() == 0) ? "" : ((ReviewArea) this.area.get(0)).name;
    }

    public String getMainArea() {
        return (this.areas == null || this.areas.size() == 0) ? "" : ((ReviewArea) this.areas.get(0)).name;
    }

    public String getConcatArea() {
        if (this.area == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (ReviewArea reviewArea : this.area) {
            stringBuilder.append(reviewArea.name);
            stringBuilder.append("\u3001");
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mediaId);
        parcel.writeString(this.title);
        parcel.writeString(this.chnName);
        parcel.writeString(this.originName);
        parcel.writeString(this.aliasName);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.evaluate);
        parcel.writeString(this.staff);
        parcel.writeTypedList(this.area);
        parcel.writeTypedList(this.areas);
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeName);
        parcel.writeString(this.actors);
        parcel.writeParcelable(this.publish, i);
        parcel.writeTypedList(this.styles);
        parcel.writeParcelable(this.param, i);
        parcel.writeParcelable(this.episodeIndex, i);
        parcel.writeParcelable(this.newEp, i);
        parcel.writeParcelable(this.rating, i);
        parcel.writeString(this.cursor);
    }

    protected ReviewMediaBase(Parcel parcel) {
        this.mediaId = parcel.readInt();
        this.title = parcel.readString();
        this.chnName = parcel.readString();
        this.originName = parcel.readString();
        this.aliasName = parcel.readString();
        this.coverUrl = parcel.readString();
        this.shareUrl = parcel.readString();
        this.evaluate = parcel.readString();
        this.staff = parcel.readString();
        this.area = parcel.createTypedArrayList(ReviewArea.CREATOR);
        this.areas = parcel.createTypedArrayList(ReviewArea.CREATOR);
        this.typeId = parcel.readInt();
        this.typeName = parcel.readString();
        this.actors = parcel.readString();
        this.publish = (ReviewPublish) parcel.readParcelable(ReviewPublish.class.getClassLoader());
        this.styles = parcel.createTypedArrayList(ReviewTag.CREATOR);
        this.param = (ReviewParam) parcel.readParcelable(ReviewParam.class.getClassLoader());
        this.episodeIndex = (MediaEpisodeIndex) parcel.readParcelable(MediaEpisodeIndex.class.getClassLoader());
        this.newEp = (MediaEpisodeIndex) parcel.readParcelable(MediaEpisodeIndex.class.getClassLoader());
        this.rating = (MediaRating) parcel.readParcelable(MediaRating.class.getClassLoader());
        this.cursor = parcel.readString();
    }
}
