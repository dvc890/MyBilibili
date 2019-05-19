package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiUniformPrevueSection implements Parcelable {
    public static final Creator<BangumiUniformPrevueSection> CREATOR = new C18761();
    @JSONField(deserialize = false, serialize = false)
    public int index;
    @JSONField(name = "episodes")
    public List<BangumiUniformEpisode> prevues;
    public String title;
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformPrevueSection$1 */
    static class C18761 implements Creator<BangumiUniformPrevueSection> {
        C18761() {
        }

        /* renamed from: a */
        public BangumiUniformPrevueSection createFromParcel(Parcel parcel) {
            return new BangumiUniformPrevueSection(parcel);
        }

        /* renamed from: a */
        public BangumiUniformPrevueSection[] newArray(int i) {
            return new BangumiUniformPrevueSection[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiUniformPrevueSection(Parcel parcel) {
        this.title = parcel.readString();
        this.type = parcel.readInt();
        this.prevues = parcel.createTypedArrayList(BangumiUniformEpisode.CREATOR);
        this.index = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.type);
        parcel.writeTypedList(this.prevues);
        parcel.writeInt(this.index);
    }

    public String getTitle() {
        return this.title;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public List<BangumiUniformEpisode> getPrevues() {
        return this.prevues;
    }
}
