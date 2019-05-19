package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class BangumiSponsorEvent implements Parcelable {
    public static final Creator<BangumiSponsorEvent> CREATOR = new C18251();
    @JSONField(name = "tip")
    /* renamed from: a */
    public String f5642a;
    @JSONField(name = "content")
    /* renamed from: b */
    public String f5643b;
    @JSONField(name = "link")
    /* renamed from: c */
    public String f5644c;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.BangumiSponsorEvent$1 */
    static class C18251 implements Creator<BangumiSponsorEvent> {
        C18251() {
        }

        /* renamed from: a */
        public BangumiSponsorEvent createFromParcel(Parcel parcel) {
            return new BangumiSponsorEvent(parcel);
        }

        /* renamed from: a */
        public BangumiSponsorEvent[] newArray(int i) {
            return new BangumiSponsorEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5642a);
        parcel.writeString(this.f5643b);
        parcel.writeString(this.f5644c);
    }

    protected BangumiSponsorEvent(Parcel parcel) {
        this.f5642a = parcel.readString();
        this.f5643b = parcel.readString();
        this.f5644c = parcel.readString();
    }
}
