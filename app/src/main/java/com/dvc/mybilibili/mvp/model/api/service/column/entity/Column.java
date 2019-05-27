package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.application.BiliApplication;

import java.io.Serializable;
import java.util.List;

@Keep
/* compiled from: BL */
public class Column {
    @JSONField(name = "author")
    public Author author;
    @JSONField(name = "banner_url")
    public String bannerUrl;
    @JSONField(name = "ctime")
    public long cTime;
    @JSONField(name = "categories")
    public List<Category> categories;
    @JSONField(name = "category")
    public Category category;
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "favorite_time")
    public long favoriteTime;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6132id;
    @JSONField(name = "image_urls")
    public List<String> imageUrls;
    @JSONField(name = "like_state")
    public int likeState;
    @JSONField(name = "list")
    public ArticleList list;
    @JSONField(name = "publish_time")
    public long publicTime;
    @JSONField(name = "rec_flag")
    public boolean rec;
    @JSONField(name = "rec_image_url")
    public String recImage;
    @JSONField(name = "rec_text")
    public String rectText;
    @JSONField(name = "reprint")
    public int reprint;
    @JSONField(name = "stats")
    public Stats stats;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = "summary")
    public String summary;
    @JSONField(name = "tags")
    public List<Tags> tags;
    @JSONField(name = "template_id")
    public int templateId;
    @JSONField(name = "title")
    public String title;

    @Keep
    /* compiled from: BL */
    public static class Category implements Parcelable {
        public static final Creator<Category> CREATOR = new C21671();
        @JSONField(name = "banner_url")
        public String bannerUrl;
        @JSONField(name = "children")
        public List<Category> children;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f6131id;
        @JSONField(name = "intro")
        public String intro;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "parent_id")
        public long parentId;
        public int selectedTagId;

        public Category() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.column.api.response.Column$Category$1 */
        static class C21671 implements Creator<Category> {
            C21671() {
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
            stringBuilder.append(this.f6131id);
            stringBuilder.append(", parentId=");
            stringBuilder.append(this.parentId);
            stringBuilder.append(", name='");
            stringBuilder.append(this.name);
            stringBuilder.append('\'');
            stringBuilder.append(", bannerUrl='");
            stringBuilder.append(this.bannerUrl);
            stringBuilder.append('\'');
            stringBuilder.append(", intro='");
            stringBuilder.append(this.intro);
            stringBuilder.append('\'');
            stringBuilder.append(", children=");
            stringBuilder.append(this.children);
//            stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6131id);
            parcel.writeLong(this.parentId);
            parcel.writeString(this.name);
            parcel.writeString(this.bannerUrl);
            parcel.writeString(this.intro);
            parcel.writeTypedList(this.children);
            parcel.writeInt(this.selectedTagId);
        }

        protected Category(Parcel parcel) {
            this.f6131id = parcel.readLong();
            this.parentId = parcel.readLong();
            this.name = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.intro = parcel.readString();
            this.children = parcel.createTypedArrayList(CREATOR);
            this.selectedTagId = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class NamePlate implements Serializable {
        @JSONField(name = "condition")
        public String condition;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "image_small")
        public String imageSmall;
        @JSONField(name = "level")
        public String level;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "nid")
        public long nid;
    }

    @Keep
    /* compiled from: BL */
    public static class OfficialVerify implements Serializable {
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "type")
        public int type;
    }

    @Keep
    /* compiled from: BL */
    public static class Pendant implements Serializable {
        @JSONField(name = "expire")
        public String expire;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "pid")
        public long pid;
    }

    @Keep
    /* compiled from: BL */
    public static class Stats {
        @JSONField(name = "coin")
        public int coin;
        @JSONField(name = "dislike")
        public int dislike;
        @JSONField(name = "dynamic")
        public int dynamic;
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

    @Keep
    /* compiled from: BL */
    public static class Vip implements Serializable {
        @JSONField(name = "due_date")
        public int dueDate;
        @JSONField(name = "vip_pay_type")
        public int payType;
        @JSONField(name = "status")
        public int status;
        @JSONField(name = "type")
        public int type;
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
        stringBuilder.append(", favoriteTime");
        stringBuilder.append(this.favoriteTime);
        stringBuilder.append(", stats=");
        stringBuilder.append(this.stats);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public int hashCode() {
        return (int) this.f6132id;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Column) && ((Column) obj).f6132id == this.f6132id;
    }

    public boolean isMe(Context context) {
        long authorMid = getAuthorMid();
        if (authorMid != 0 && authorMid == BiliApplication.getDataManager().getUser().getAccountInfo().getMid()) {
            return true;
        }
        return false;
    }

    public long getListId() {
        return this.list == null ? 0 : this.list.f6130id;
    }

    public long getAuthorMid() {
        return this.author == null ? 0 : this.author.mid;
    }

    public boolean getAuthorVip() {
        boolean z = false;
        if (this.author == null || this.author.vip == null) {
            return false;
        }
        if (this.author.vip.status == 1 && this.author.vip.type == 2) {
            z = true;
        }
        return z;
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

    public int getLikeCount() {
        return this.stats == null ? 0 : this.stats.like;
    }

    public int getViewCount() {
        return this.stats == null ? 0 : this.stats.view;
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

//    public String getTitle() {
//        return TextUtils.isEmpty(this.title) ? "-" : C12140l.m45986b(this.title).toString();
//    }

    public String getSummary() {
        return TextUtils.isEmpty(this.summary) ? "-" : this.summary;
    }

    public boolean isMyLike() {
        return this.likeState == 1;
    }

    public void changeMyLikeState(boolean z) {
        if (this.stats != null) {
            Stats stats;
            if (z) {
                stats = this.stats;
                stats.like++;
            } else {
                stats = this.stats;
                stats.like--;
            }
        }
    }
}
