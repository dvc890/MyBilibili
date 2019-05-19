package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class SearchConvergeItem extends BaseSearchItem {
    @Nullable
    @JSONField(name = "content_uri")
    public String contentUri;
    @JSONField(name = "limit")
    public int limit;
    @Nullable
    @JSONField(name = "item")
    public List<Media> medias;

    @Keep
    /* compiled from: BL */
    public static class Media implements Parcelable {
        public static final Creator<Media> CREATOR = new C22751();
        @Nullable
        @JSONField(name = "badge")
        public String badge;
        @JSONField(name = "coin")
        public int coin;
        @Nullable
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "danmaku")
        public int danmaku;
        @JSONField(name = "duration")
        public int duration;
        @JSONField(name = "favorite")
        public int favorite;
        @Nullable
        @JSONField(name = "goto")
        public String goTo;
        @JSONField(name = "online")
        public int online;
        @Nullable
        @JSONField(name = "param")
        public String param;
        @JSONField(name = "play")
        public int play;
        @JSONField(name = "reply")
        public int reply;
        @JSONField(name = "share")
        public int share;
        @Nullable
        @JSONField(name = "title")
        public String title;
        @Nullable
        @JSONField(name = "uri")
        public String uri;

        /* compiled from: BL */
        /* renamed from: com.bilibili.search.api.SearchConvergeItem$Media$1 */
        static class C22751 implements Creator<Media> {
            C22751() {
            }

            /* renamed from: a */
            public Media createFromParcel(Parcel parcel) {
                return new Media(parcel);
            }

            /* renamed from: a */
            public Media[] newArray(int i) {
                return new Media[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.cover);
            parcel.writeString(this.uri);
            parcel.writeString(this.param);
            parcel.writeString(this.goTo);
            parcel.writeInt(this.play);
            parcel.writeInt(this.danmaku);
            parcel.writeInt(this.reply);
            parcel.writeInt(this.favorite);
            parcel.writeInt(this.coin);
            parcel.writeInt(this.share);
            parcel.writeInt(this.duration);
            parcel.writeString(this.badge);
            parcel.writeInt(this.online);
        }

        protected Media(Parcel parcel) {
            this.title = parcel.readString();
            this.cover = parcel.readString();
            this.uri = parcel.readString();
            this.param = parcel.readString();
            this.goTo = parcel.readString();
            this.play = parcel.readInt();
            this.danmaku = parcel.readInt();
            this.reply = parcel.readInt();
            this.favorite = parcel.readInt();
            this.coin = parcel.readInt();
            this.share = parcel.readInt();
            this.duration = parcel.readInt();
            this.badge = parcel.readString();
            this.online = parcel.readInt();
        }
    }
}
