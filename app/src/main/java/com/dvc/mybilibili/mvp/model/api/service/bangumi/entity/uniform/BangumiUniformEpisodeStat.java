package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BangumiUniformEpisodeStat implements Parcelable {
    public static final Creator<BangumiUniformEpisodeStat> CREATOR = new C18751();
    @JSONField(name = "danmakus")
    public long danmakus = 0;
    @JSONField(name = "play")
    public long views = 0;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformEpisodeStat$1 */
    static class C18751 implements Creator<BangumiUniformEpisodeStat> {
        C18751() {
        }

        /* renamed from: a */
        public BangumiUniformEpisodeStat createFromParcel(Parcel parcel) {
            return new BangumiUniformEpisodeStat(parcel);
        }

        /* renamed from: a */
        public BangumiUniformEpisodeStat[] newArray(int i) {
            return new BangumiUniformEpisodeStat[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiUniformEpisodeStat(Parcel parcel) {
        this.views = parcel.readLong();
        this.danmakus = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.views);
        parcel.writeLong(this.danmakus);
    }
}
