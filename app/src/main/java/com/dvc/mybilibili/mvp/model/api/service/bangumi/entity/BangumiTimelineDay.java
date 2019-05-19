package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
public class BangumiTimelineDay implements Parcelable {
    public static final Creator<BangumiTimelineDay> CREATOR = new C18331();
    @JSONField(name = "date")
    /* renamed from: a */
    public String f5646a;
    @JSONField(name = "date_ts")
    /* renamed from: b */
    public long f5647b;
    @JSONField(name = "day_of_week")
    /* renamed from: c */
    public int f5648c;
    @JSONField(name = "is_today")
    /* renamed from: d */
    public boolean f5649d;
    @JSONField(name = "seasons")
    /* renamed from: e */
    public List<BangumiTimeline> f5650e;
    @JSONField(deserialize = false, serialize = false)
    /* renamed from: f */
    public int f5651f = -1;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiTimelineDay$1 */
    static class C18331 implements Creator<BangumiTimelineDay> {
        C18331() {
        }

        /* renamed from: a */
        public BangumiTimelineDay createFromParcel(Parcel parcel) {
            return new BangumiTimelineDay(parcel);
        }

        /* renamed from: a */
        public BangumiTimelineDay[] newArray(int i) {
            return new BangumiTimelineDay[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiTimelineDay(Parcel parcel) {
        this.f5646a = parcel.readString();
        this.f5647b = parcel.readLong();
        this.f5648c = parcel.readInt();
        this.f5649d = parcel.readByte() != (byte) 0;
        this.f5650e = parcel.createTypedArrayList(BangumiTimeline.CREATOR);
        this.f5651f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5646a);
        parcel.writeLong(this.f5647b);
        parcel.writeInt(this.f5648c);
        parcel.writeByte((byte) (this.f5649d?1:0));
        parcel.writeTypedList(this.f5650e);
        parcel.writeInt(this.f5651f);
    }

    /* renamed from: a */
    public int mo7694a(int i) {
        int i2 = 0;
        while (i2 < this.f5650e.size()) {
            if (((BangumiTimeline) this.f5650e.get(i2)).isDelay && ((BangumiTimeline) this.f5650e.get(i2)).delayId == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo7695a(long j) {
        if (this.f5651f == -1) {
            this.f5651f = 0;
            long j2 = -1;
            for (BangumiTimeline bangumiTimeline : this.f5650e) {
                boolean z = true;
                if (bangumiTimeline.pubTs <= j) {
                    this.f5651f++;
                }
                if (bangumiTimeline.pubTs == j2) {
                    z = false;
                }
                bangumiTimeline.showTime = z;
                j2 = bangumiTimeline.pubTs;
            }
        }
    }
}
