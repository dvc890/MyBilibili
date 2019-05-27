package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class BiliVote implements Parcelable {
    public static final Creator<BiliVote> CREATOR = new C18061();
    @JSONField(name = "title")
    /* renamed from: a */
    public String f5606a;
    @JSONField(name = "vote_id")
    /* renamed from: b */
    public long f5607b;

    /* compiled from: BL */
    /* renamed from: com.bilibili.app.comm.comment2.model.BiliVote$1 */
    static class C18061 implements Creator<BiliVote> {
        C18061() {
        }

        /* renamed from: a */
        public BiliVote createFromParcel(Parcel parcel) {
            return new BiliVote(parcel);
        }

        /* renamed from: a */
        public BiliVote[] newArray(int i) {
            return new BiliVote[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliVote(Parcel parcel) {
        this.f5606a = parcel.readString();
        this.f5607b = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5606a);
        parcel.writeLong(this.f5607b);
    }
}
