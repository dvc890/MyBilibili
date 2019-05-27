package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
@Deprecated
/* compiled from: BL */
public class OfficialVerify implements Parcelable {
    public static final int COMPANY_V = 1;
    public static final Creator<OfficialVerify> CREATOR = new C22021();
    public static final int NORMAL = -1;
    public static final int PERSON_V = 0;
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "type")
    public int type;

    public OfficialVerify() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.OfficialVerify$1 */
    static class C22021 implements Creator<OfficialVerify> {
        C22021() {
        }

        /* renamed from: a */
        public OfficialVerify createFromParcel(Parcel parcel) {
            return new OfficialVerify(parcel);
        }

        /* renamed from: a */
        public OfficialVerify[] newArray(int i) {
            return new OfficialVerify[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.desc);
    }

    protected OfficialVerify(Parcel parcel) {
        this.type = parcel.readInt();
        this.desc = parcel.readString();
    }

    public boolean isNormal() {
        return this.type == -1;
    }

    public boolean isAuthority() {
        return this.type == 0 || this.type == 1;
    }
}
