package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiOperationActivities implements Parcelable {
    public static final Creator<BangumiOperationActivities> CREATOR = new C18711();
    @JSONField(name = "ab")
    public String abTest;
    @JSONField(name = "cover")
    public String cover;
    /* renamed from: id */
    public String f5741id;
    @JSONField(name = "link")
    public String link;
    public List<BangumiPendant> pendants;
    @JSONField(name = "threshold")
    public List<BangumiThreshold> thresholds;
    public String title;
    @JSONField(name = "type")
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiOperationActivities$1 */
    static class C18711 implements Creator<BangumiOperationActivities> {
        C18711() {
        }

        /* renamed from: a */
        public BangumiOperationActivities createFromParcel(Parcel parcel) {
            return new BangumiOperationActivities(parcel);
        }

        /* renamed from: a */
        public BangumiOperationActivities[] newArray(int i) {
            return new BangumiOperationActivities[i];
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiOperationActivities$a */
    public static class C1872a {
        /* renamed from: a */
        public static final Integer f5742a = Integer.valueOf(-2);
        /* renamed from: b */
        public static final Integer f5743b = Integer.valueOf(-1);
        /* renamed from: c */
        public static final Integer f5744c = Integer.valueOf(0);
        /* renamed from: d */
        public static final Integer f5745d = Integer.valueOf(1);
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiOperationActivities(Parcel parcel) {
        this.f5741id = parcel.readString();
        this.title = parcel.readString();
        this.link = parcel.readString();
        this.cover = parcel.readString();
        this.type = parcel.readInt();
        this.pendants = parcel.createTypedArrayList(BangumiPendant.CREATOR);
        this.thresholds = parcel.createTypedArrayList(BangumiThreshold.CREATOR);
        this.abTest = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5741id);
        parcel.writeString(this.title);
        parcel.writeString(this.link);
        parcel.writeString(this.cover);
        parcel.writeInt(this.type);
        parcel.writeTypedList(this.pendants);
        parcel.writeTypedList(this.thresholds);
        parcel.writeString(this.abTest);
    }
}
