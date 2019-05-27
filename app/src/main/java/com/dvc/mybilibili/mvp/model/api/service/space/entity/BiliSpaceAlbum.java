package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceAlbum */
public class BiliSpaceAlbum {
    @JSONField(name = "count")
    public int count;
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6582id;
    @JSONField(name = "pictures")
    public List<Picture> pictures;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "uri")
    public String uri;

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceAlbum$Picture */
    public static class Picture {
        @JSONField(name = "img_src")
        public String img;
    }

    public String getCover() {
        if (hasPic()) {
            return ((Picture) this.pictures.get(0)).img;
        }
        return null;
    }

    private boolean hasPic() {
        return (this.pictures == null || this.pictures.isEmpty()) ? false : true;
    }
}
