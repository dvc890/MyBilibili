package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class UserVip implements Parcelable {
    public static final Creator<UserVip> CREATOR = new C18691();
    @JSONField(name = "vipStatus")
    public int status;
    @JSONField(name = "vipType")
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.UserVip$1 */
    static class C18691 implements Creator<UserVip> {
        C18691() {
        }

        /* renamed from: a */
        public UserVip createFromParcel(Parcel parcel) {
            return new UserVip(parcel);
        }

        /* renamed from: a */
        public UserVip[] newArray(int i) {
            return new UserVip[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected UserVip(Parcel parcel) {
        this.status = parcel.readInt();
        this.type = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeInt(this.type);
    }
}
