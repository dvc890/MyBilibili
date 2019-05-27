package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceFavoriteBox */
public class BiliSpaceFavoriteBox extends BiliSpaceItemCount {
    @JSONField(name = "item")
    public List<FavBox> boxes;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceFavoriteBox$FavBox */
    public static class FavBox {
        public int count;
        public String cover;
        /* renamed from: id */
        public long f6588id;
        @JSONField(name = "is_public")
        public int isPublic;
        @JSONField(name = "media_id")
        public long mediaId;
        public long mid;
        public String title;
        public int type;

        public boolean isPublic() {
            return this.isPublic == 0;
        }

        public boolean isAudioCover() {
            return this.type == 12;
        }
    }

    public boolean isEmpty() {
        return this.boxes == null || this.boxes.isEmpty();
    }
}
