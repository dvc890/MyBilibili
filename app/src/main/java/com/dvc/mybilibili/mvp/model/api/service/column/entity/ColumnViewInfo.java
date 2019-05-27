package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnViewInfo {
    public static final int CANCEL_DISLIKE = 4;
    public static final int CANCEL_LIKE = 2;
    public static final int DISLIKE = 3;
    public static final int LIKE = 1;
    @JSONField(name = "attention")
    public boolean attention;
    @JSONField(name = "author_name")
    public String authorName;
    @JSONField(name = "banner_url")
    public String bannerUrl;
    @JSONField(name = "coin")
    public int coin;
    public long current;
    @JSONField(name = "favorite")
    public boolean favorite;
    @JSONField(name = "image_urls")
    public List<String> imageUrls;
    @JSONField(name = "in_list")
    public boolean inList;
    @JSONField(name = "like")
    public int like;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "next")
    public long next;
    public boolean optBySelf;
    @JSONField(name = "origin_image_urls")
    public List<String> originImageUrls;
    @JSONField(name = "pre")
    public long pre;
    @JSONField(name = "show_small_window")
    public boolean showSmallWindow;
    @JSONField(name = "show_later_watch")
    public boolean showWatchLater;
    @JSONField(name = "stats")
    public Column.Stats stats;
    @JSONField(name = "title")
    public String title;

//    public String getShareUrl() {
//        if (this.originImageUrls == null || this.originImageUrls.isEmpty() || TextUtils.isEmpty((CharSequence) this.originImageUrls.get(0))) {
//            return makeRawImage(this.bannerUrl);
//        }
//        return makeRawImage((String) this.originImageUrls.get(0));
//    }

//    public String makeRawImage(String str) {
//        if (!TextUtils.isEmpty(str)) {
//            int a = C2185g.m8553a((CharSequence) str, 64);
//            if (a > 0) {
//                return C2185g.m8558a(str, 0, a);
//            }
//        }
//        return str;
//    }

    public boolean isInList() {
        return this.inList;
    }

    public void setInList(boolean z) {
        this.inList = z;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

    public int getLikeCount() {
        return this.stats == null ? 0 : this.stats.like;
    }

    public int getShareCount() {
        return this.stats == null ? 0 : this.stats.share;
    }

    public int getTransmitCount() {
        return this.stats == null ? 0 : this.stats.dynamic;
    }

    public int getFavoriteCount() {
        return this.stats == null ? 0 : this.stats.favorite;
    }

    public int increaseFavoriteCount() {
        if (this.stats == null) {
            return 1;
        }
        Column.Stats stats = this.stats;
        int i = 1 + stats.favorite;
        stats.favorite = i;
        return i;
    }

    public int decreaseFavoriteCount() {
        if (this.stats == null) {
            return 0;
        }
        Column.Stats stats = this.stats;
        int i = stats.favorite - 1;
        stats.favorite = i;
        return i;
    }

    public int getReplyCount() {
        return this.stats == null ? 0 : this.stats.reply;
    }

    public int increaseReplyCount() {
        if (this.stats == null) {
            return 1;
        }
        Column.Stats stats = this.stats;
        int i = 1 + stats.reply;
        stats.reply = i;
        return i;
    }

    public int decreaseReplyCount() {
        if (this.stats == null) {
            return 0;
        }
        Column.Stats stats = this.stats;
        int i = stats.reply - 1;
        stats.reply = i;
        return i;
    }

    public void reduceReplyCount(int i) {
        if (this.stats != null) {
            this.stats.reply -= i;
        }
    }

    public int increaseCoins(int i) {
        if (this.stats == null) {
            return i;
        }
        this.coin += i;
        Column.Stats stats = this.stats;
        stats.coin += i;
        return this.stats.coin;
    }

    public int increaseShareCount() {
        if (this.stats == null) {
            return 1;
        }
        Column.Stats stats = this.stats;
        int i = 1 + stats.share;
        stats.share = i;
        return i;
    }

    public int increaseTransmitCount() {
        if (this.stats == null) {
            return 1;
        }
        Column.Stats stats = this.stats;
        int i = 1 + stats.dynamic;
        stats.dynamic = i;
        return i;
    }

    public boolean isLike() {
        return this.like == 1;
    }

    public boolean isDislike() {
        return this.like == 2;
    }

    public void setLike(int i) {
        switch (i) {
            case 1:
                this.like = 1;
                increase();
                return;
            case 2:
                reduce();
                this.like = 0;
                return;
            case 3:
                if (this.like == 1) {
                    reduce();
                }
                this.like = 2;
                return;
            case 4:
                this.like = 0;
                return;
            default:
                this.like = 0;
                return;
        }
    }

    private void increase() {
        if (this.stats == null) {
            this.stats = new Column.Stats();
        }
        Column.Stats stats = this.stats;
        stats.like++;
    }

    private void reduce() {
        if (this.stats != null && this.stats.like > 0) {
            Column.Stats stats = this.stats;
            stats.like--;
        }
    }
}
