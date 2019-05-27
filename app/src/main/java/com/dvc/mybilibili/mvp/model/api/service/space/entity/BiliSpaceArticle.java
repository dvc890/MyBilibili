package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.application.BiliApplication;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle */
public class BiliSpaceArticle {
    @JSONField(name = "author")
    public Author author;
    @JSONField(name = "banner_url")
    public String bannerUrl;
    @JSONField(name = "ctime")
    public long cTime;
    @JSONField(name = "category")
    public Category category;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6584id;
    @JSONField(name = "image_urls")
    public List<String> imageUrls;
    @JSONField(name = "publish_time")
    public long publicTime;
    @JSONField(name = "rec_flag")
    public boolean rec;
    @JSONField(name = "rec_image_url")
    public String recImage;
    @JSONField(name = "reprint")
    public int reprint;
    @JSONField(name = "stats")
    public Stats stats;
    @JSONField(name = "state")
    public int status;
    @JSONField(name = "summary")
    public String summary;
    @JSONField(name = "tags")
    public List<Tags> tags;
    @JSONField(name = "template_id")
    public int templateId;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "uri")
    public String uri;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle$Author */
    public static class Author {
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "mid")
        public long mid;
        @JSONField(name = "name")
        public String name;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Author{mid=");
            stringBuilder.append(this.mid);
            stringBuilder.append(", name='");
            stringBuilder.append(this.name);
            stringBuilder.append('\'');
            stringBuilder.append(", face='");
            stringBuilder.append(this.face);
            stringBuilder.append('\'');
//            stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle$Category */
    public static class Category implements Parcelable {
        public static final Creator<Category> CREATOR = new C24331();
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6583id;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "parent_id")
        public long parentId;

        public Category() {
        }

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle$Category$1 */
        static class C24331 implements Creator<Category> {
            C24331() {
            }

            /* renamed from: a */
            public Category createFromParcel(Parcel parcel) {
                return new Category(parcel);
            }

            /* renamed from: a */
            public Category[] newArray(int i) {
                return new Category[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Category{id=");
            stringBuilder.append(this.f6583id);
            stringBuilder.append(", parentId=");
            stringBuilder.append(this.parentId);
            stringBuilder.append(", name='");
            stringBuilder.append(this.name);
            stringBuilder.append('\'');
//            stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6583id);
            parcel.writeLong(this.parentId);
            parcel.writeString(this.name);
        }

        protected Category(Parcel parcel) {
            this.f6583id = parcel.readLong();
            this.parentId = parcel.readLong();
            this.name = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle$Stats */
    public static class Stats {
        @JSONField(name = "dislike")
        public int dislike;
        @JSONField(name = "favorite")
        public int favorite;
        @JSONField(name = "like")
        public int like;
        @JSONField(name = "reply")
        public int reply;
        @JSONField(name = "share")
        public int share;
        @JSONField(name = "view")
        public int view;
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArticle$Tags */
    public static class Tags {
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "tid")
        public int tid;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tags{tid=");
            stringBuilder.append(this.tid);
            stringBuilder.append(", name='");
            stringBuilder.append(this.name);
            stringBuilder.append('\'');
//            stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Article{category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", summary='");
        stringBuilder.append(this.summary);
        stringBuilder.append('\'');
        stringBuilder.append(", bannerUrl='");
        stringBuilder.append(this.bannerUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", templateId=");
        stringBuilder.append(this.templateId);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", author=");
        stringBuilder.append(this.author);
        stringBuilder.append(", reprint=");
        stringBuilder.append(this.reprint);
        stringBuilder.append(", imageUrls=");
        stringBuilder.append(this.imageUrls);
        stringBuilder.append(", publicTime=");
        stringBuilder.append(this.publicTime);
        stringBuilder.append(", cTime=");
        stringBuilder.append(this.cTime);
        stringBuilder.append(", stats=");
        stringBuilder.append(this.stats);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public int hashCode() {
        return (int) this.f6584id;
    }

    public boolean equals(Object obj) {
        return (obj instanceof BiliSpaceArticle) && ((BiliSpaceArticle) obj).f6584id == this.f6584id;
    }

    public boolean isMe(Context context) {
        long authorMid = getAuthorMid();
        if (authorMid != 0 && authorMid == BiliApplication.getDataManager().getUser().getAccountInfo().getMid()) {
            return true;
        }
        return false;
    }

    public long getAuthorMid() {
        return this.author == null ? 0 : this.author.mid;
    }

    public String getAuthorName() {
        return (this.author == null || TextUtils.isEmpty(this.author.name)) ? "-" : this.author.name;
    }

    public int getReplyCount() {
        return this.stats == null ? 0 : this.stats.reply;
    }

    public String getCategoryName() {
        return (this.category == null || TextUtils.isEmpty(this.category.name)) ? "-" : this.category.name;
    }

    public String getFaceUrl() {
        if (this.author == null) {
            return "-";
        }
        return TextUtils.isEmpty(this.author.face) ? null : this.author.face;
    }

    public boolean isAllowCopy() {
        return this.reprint == 1;
    }

    public String getImageUrl1() {
        return (this.imageUrls == null || this.imageUrls.size() <= 0) ? null : (String) this.imageUrls.get(0);
    }

    public String getImageUrl2() {
        return (this.imageUrls == null || this.imageUrls.size() <= 1) ? null : (String) this.imageUrls.get(1);
    }

    public String getImageUrl3() {
        return (this.imageUrls == null || this.imageUrls.size() <= 2) ? null : (String) this.imageUrls.get(2);
    }

    public String getTitle() {
        return TextUtils.isEmpty(this.title) ? "-" : this.title;
    }

    public String getSummary() {
        return TextUtils.isEmpty(this.summary) ? "-" : this.summary;
    }
}
