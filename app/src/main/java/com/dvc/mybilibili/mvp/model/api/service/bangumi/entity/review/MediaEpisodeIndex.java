package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class MediaEpisodeIndex implements Parcelable {
    public static final Creator<MediaEpisodeIndex> CREATOR = new C18461();
    /* renamed from: id */
    public int f5656id;
    public String index;
    @JSONField(name = "index_show")
    public String indexDesc;
    @JSONField(name = "play_index_show")
    public String playIndexDesc;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.MediaEpisodeIndex$1 */
    static class C18461 implements Creator<MediaEpisodeIndex> {
        C18461() {
        }

        /* renamed from: a */
        public MediaEpisodeIndex createFromParcel(Parcel parcel) {
            return new MediaEpisodeIndex(parcel);
        }

        /* renamed from: a */
        public MediaEpisodeIndex[] newArray(int i) {
            return new MediaEpisodeIndex[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5656id);
        parcel.writeString(this.index);
        parcel.writeString(this.indexDesc);
        parcel.writeString(this.playIndexDesc);
    }

    protected MediaEpisodeIndex(Parcel parcel) {
        this.f5656id = parcel.readInt();
        this.index = parcel.readString();
        this.indexDesc = parcel.readString();
        this.playIndexDesc = parcel.readString();
    }
}
