package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiUniformEpisode implements Parcelable {
    public static final Creator<BangumiUniformEpisode> CREATOR = new C18741();
    public int aid;
    @JSONField(deserialize = false, serialize = false)
    public boolean alreadyPlayed = false;
    public String badge;
    @JSONField(name = "badge_type")
    public int badgeType;
    public int cid;
    public String cover;
    public BangumiDimension dimension;
    @JSONField(name = "id")
    public long epid;
    public String from;
    @JSONField(name = "long_title")
    public String longTitle = "";
    public int page;
    @JSONField(deserialize = false, serialize = false)
    public int sectionIndex;
    @JSONField(name = "share_copy")
    public String shareCopy;
    @JSONField(name = "share_url")
    public String shareUrl;
    @JSONField(name = "short_link")
    public String shortLink;
    public BangumiUniformEpisodeStat stat = null;
    @JSONField(name = "status")
    public int status;
    public String subtitle;
    public String title;
    @JSONField(name = "vid")
    public String vid;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformEpisode$1 */
    static class C18741 implements Creator<BangumiUniformEpisode> {
        C18741() {
        }

        /* renamed from: a */
        public BangumiUniformEpisode createFromParcel(Parcel parcel) {
            return new BangumiUniformEpisode(parcel);
        }

        /* renamed from: a */
        public BangumiUniformEpisode[] newArray(int i) {
            return new BangumiUniformEpisode[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiUniformEpisode(Parcel parcel) {
        this.epid = parcel.readLong();
        this.badge = parcel.readString();
        this.badgeType = parcel.readInt();
        this.status = parcel.readInt();
        this.aid = parcel.readInt();
        this.page = parcel.readInt();
        this.cid = parcel.readInt();
        this.from = parcel.readString();
        this.cover = parcel.readString();
        this.title = parcel.readString();
        this.longTitle = parcel.readString();
        this.vid = parcel.readString();
        this.shareUrl = parcel.readString();
        this.shortLink = parcel.readString();
        this.shareCopy = parcel.readString();
        this.subtitle = parcel.readString();
        this.stat = (BangumiUniformEpisodeStat) parcel.readParcelable(BangumiUniformEpisodeStat.class.getClassLoader());
        this.dimension = (BangumiDimension) parcel.readParcelable(BangumiDimension.class.getClassLoader());
    }

    public boolean is3rd() {
        return ("bangumi".equals(this.from) || "movie".equals(this.from) || "bili".equals(this.from)) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.epid);
        parcel.writeString(this.badge);
        parcel.writeInt(this.badgeType);
        parcel.writeInt(this.status);
        parcel.writeInt(this.aid);
        parcel.writeInt(this.page);
        parcel.writeInt(this.cid);
        parcel.writeString(this.from);
        parcel.writeString(this.cover);
        parcel.writeString(this.title);
        parcel.writeString(this.longTitle);
        parcel.writeString(this.vid);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.shortLink);
        parcel.writeString(this.shareCopy);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.stat, i);
        parcel.writeParcelable(this.dimension, i);
    }
}
