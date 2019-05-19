package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class OfficialInfo implements Parcelable {
    public static final int COMPANY_V = 3;
    public static final Creator<OfficialInfo> CREATOR = new C22011();
    public static final int GOVERNMENT_V = 4;
    public static final int MEDIA_V = 5;
    public static final int NORMAL = 0;
    public static final int OTHER_V = 6;
    public static final int PERSON_V = 2;
    public static final int UP_USER_V = 1;
    private String desc;
    private int role;
    private String title;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.OfficialInfo$1 */
    static class C22011 implements Creator<OfficialInfo> {
        C22011() {
        }

        /* renamed from: a */
        public OfficialInfo createFromParcel(Parcel parcel) {
            return new OfficialInfo(parcel);
        }

        /* renamed from: a */
        public OfficialInfo[] newArray(int i) {
            return new OfficialInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @JSONField(name = "role")
    public int getRole() {
        return this.role;
    }

    @JSONField(name = "role")
    public void setRole(int i) {
        this.role = i;
    }

    @JSONField(name = "title")
    public String getTitle() {
        return this.title;
    }

    @JSONField(name = "title")
    public void setTitle(String str) {
        this.title = str;
    }

    @JSONField(name = "desc")
    public String getDesc() {
        return this.desc;
    }

    @JSONField(name = "desc")
    public void setDesc(String str) {
        this.desc = str;
    }

    protected OfficialInfo(Parcel parcel) {
        this.role = parcel.readInt();
        this.title = parcel.readString();
        this.desc = parcel.readString();
    }

    public OfficialInfo compatibleOfficialVerify(OfficialVerify officialVerify) {
        this.desc = officialVerify.desc;
        this.title = "";
        switch (officialVerify.type) {
            case -1:
                this.role = 0;
                break;
            case 0:
                this.role = 2;
                break;
            case 1:
                this.role = 4;
                break;
        }
        return this;
    }

    public boolean isNormal() {
        return this.role == 0;
    }

    public boolean isAuthority() {
        return this.role != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.role);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
    }
}
