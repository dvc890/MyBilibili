package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public class BangumiDimension implements Parcelable {
    public static final Creator<BangumiDimension> CREATOR = new C47591();
    public int height;
    public int rotate;
    public int width;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiDimension$1 */
    static class C47591 implements Creator<BangumiDimension> {
        C47591() {
        }

        /* renamed from: a */
        public BangumiDimension createFromParcel(Parcel parcel) {
            return new BangumiDimension(parcel);
        }

        /* renamed from: a */
        public BangumiDimension[] newArray(int i) {
            return new BangumiDimension[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiDimension(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.rotate = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.rotate);
    }
}
