package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class IndexConvergeItem extends BasicIndexItem implements Parcelable {
    public static final Creator<IndexConvergeItem> CREATOR = new C32901();
    @JSONField(name = "card_id")
    public String cardId;
    @JSONField(name = "limit")
    public int limit;
    @JSONField(name = "item")
    public List<ConvergeVideo> list;
    public String trackId;

    @Keep
    /* compiled from: BL */
    public static class ConvergeVideo implements Parcelable {
        public static final Creator<ConvergeVideo> CREATOR = new C22601();
        public static final String GOTO_ARTICLE = "article";
        public static final String GOTO_AV = "av";
        public static final String GOTO_LIVE = "live";
        @JSONField(name = "badge")
        public String badge;
        @JSONField(name = "coin")
        public long coin;
        @JSONField(name = "cover")
        public String cover;
        @JSONField(name = "danmaku")
        public long danmaku;
        @JSONField(name = "duration")
        public long duration;
        @JSONField(name = "favorite")
        public long favorite;
        @JSONField(name = "goto")
        public String goTo;
        @JSONField(name = "online")
        public long online;
        @JSONField(name = "param")
        public String param;
        @JSONField(name = "play")
        public long play;
        @JSONField(name = "reply")
        public long reply;
        @JSONField(name = "share")
        public long share;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "uri")
        public String uri;

        /* compiled from: BL */
        /* renamed from: com.bilibili.pegasus.api.model.IndexConvergeItem$ConvergeVideo$1 */
        static class C22601 implements Creator<ConvergeVideo> {
            C22601() {
            }

            /* renamed from: a */
            public ConvergeVideo createFromParcel(Parcel parcel) {
                return new ConvergeVideo(parcel);
            }

            /* renamed from: a */
            public ConvergeVideo[] newArray(int i) {
                return new ConvergeVideo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean isValidType() {
            return "av".equals(this.goTo) || "live".equals(this.goTo) || "article".equals(this.goTo);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.cover);
            parcel.writeString(this.uri);
            parcel.writeString(this.param);
            parcel.writeString(this.goTo);
            parcel.writeLong(this.play);
            parcel.writeLong(this.danmaku);
            parcel.writeLong(this.reply);
            parcel.writeLong(this.favorite);
            parcel.writeLong(this.coin);
            parcel.writeLong(this.share);
            parcel.writeLong(this.online);
            parcel.writeLong(this.duration);
            parcel.writeString(this.badge);
        }

        protected ConvergeVideo(Parcel parcel) {
            this.title = parcel.readString();
            this.cover = parcel.readString();
            this.uri = parcel.readString();
            this.param = parcel.readString();
            this.goTo = parcel.readString();
            this.play = parcel.readLong();
            this.danmaku = parcel.readLong();
            this.reply = parcel.readLong();
            this.favorite = parcel.readLong();
            this.coin = parcel.readLong();
            this.share = parcel.readLong();
            this.online = parcel.readLong();
            this.duration = parcel.readLong();
            this.badge = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.IndexConvergeItem$1 */
    static class C32901 implements Creator<IndexConvergeItem> {
        C32901() {
        }

        /* renamed from: a */
        public IndexConvergeItem createFromParcel(Parcel parcel) {
            return new IndexConvergeItem(parcel);
        }

        /* renamed from: a */
        public IndexConvergeItem[] newArray(int i) {
            return new IndexConvergeItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean hasEnoughItems() {
        boolean z = false;
        if (TextUtils.isEmpty(this.cover)) {
            if (this.list != null && this.list.size() > 3) {
                z = true;
            }
            return z;
        }
        if (this.list != null && this.list.size() > 2) {
            z = true;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.list);
        parcel.writeInt(this.limit);
        parcel.writeString(this.uri);
        parcel.writeString(this.cover);
        parcel.writeString(this.title);
        parcel.writeString(this.cardId);
    }

    protected IndexConvergeItem(Parcel parcel) {
        this.list = parcel.createTypedArrayList(ConvergeVideo.CREATOR);
        this.limit = parcel.readInt();
        this.uri = parcel.readString();
        this.cover = parcel.readString();
        this.title = parcel.readString();
        this.cardId = parcel.readString();
    }
}
