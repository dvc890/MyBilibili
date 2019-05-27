package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiTimeline implements Parcelable, Comparable<BangumiTimeline> {
    public static final Creator<BangumiTimeline> CREATOR = new C18321();
    @JSONField(name = "cover")
    public String coverUrl;
    @JSONField(name = "delay_id")
    public int delayId;
    @JSONField(name = "delay_index")
    public String delayIndex;
    @JSONField(name = "delay_reason")
    public String delayReason;
    @JSONField(name = "ep_id")
    public String epId;
    @JSONField(name = "follow")
    public boolean follow;
    @JSONField(deserialize = false, serialize = false)
    public int index;
    @JSONField(name = "delay")
    public boolean isDelay;
    @JSONField(name = "is_published")
    public boolean isPublished;
    @JSONField(name = "pub_index")
    public String pubIndex;
    @JSONField(name = "pub_time")
    public String pubTime;
    @JSONField(name = "pub_ts")
    public long pubTs;
    @JSONField(name = "season_id")
    public int seasonId;
    @JSONField(name = "season_status")
    public int seasonStatus;
    @JSONField(deserialize = false, serialize = false)
    public boolean showTime = true;
    @JSONField(name = "square_cover")
    public String squareCoverUrl;
    @JSONField(name = "title")
    public String title;

    public BangumiTimeline() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiTimeline$1 */
    static class C18321 implements Creator<BangumiTimeline> {
        C18321() {
        }

        /* renamed from: a */
        public BangumiTimeline createFromParcel(Parcel parcel) {
            return new BangumiTimeline(parcel);
        }

        /* renamed from: a */
        public BangumiTimeline[] newArray(int i) {
            return new BangumiTimeline[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiTimeline(Parcel parcel) {
        boolean z = true;
        this.index = parcel.readInt();
        this.seasonId = parcel.readInt();
        this.title = parcel.readString();
        this.coverUrl = parcel.readString();
        this.squareCoverUrl = parcel.readString();
        this.isPublished = parcel.readByte() != (byte) 0;
        this.follow = parcel.readByte() != (byte) 0;
        this.seasonStatus = parcel.readInt();
        this.pubIndex = parcel.readString();
        this.pubTime = parcel.readString();
        this.pubTs = parcel.readLong();
        this.isDelay = parcel.readByte() != (byte) 0;
        this.delayId = parcel.readInt();
        this.delayReason = parcel.readString();
        this.delayIndex = parcel.readString();
        this.epId = parcel.readString();
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.showTime = z;
    }

    public String getIndex() {
        return this.isDelay ? this.delayIndex : this.pubIndex;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeInt(this.seasonId);
        parcel.writeString(this.title);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.squareCoverUrl);
        parcel.writeByte((byte) (this.isPublished?1:0));
        parcel.writeByte((byte) (this.follow?1:0));
        parcel.writeInt(this.seasonStatus);
        parcel.writeString(this.pubIndex);
        parcel.writeString(this.pubTime);
        parcel.writeLong(this.pubTs);
        parcel.writeByte((byte) (this.isDelay?1:0));
        parcel.writeInt(this.delayId);
        parcel.writeString(this.delayReason);
        parcel.writeString(this.delayIndex);
        parcel.writeString(this.epId);
        parcel.writeByte((byte) (this.showTime?1:0));
    }

    public int compareTo(BangumiTimeline bangumiTimeline) {
        return bangumiTimeline == null ? 1 : (this.pubTs > bangumiTimeline.pubTs ? 1 : (this.pubTs == bangumiTimeline.pubTs ? 0 : -1));
    }
}
