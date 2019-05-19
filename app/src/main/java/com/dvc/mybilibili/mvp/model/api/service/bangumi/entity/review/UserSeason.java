package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class UserSeason implements Parcelable {
    public static final Creator<UserSeason> CREATOR = new C18681();
    @JSONField(name = "last_ep_index")
    public String lastEpIndex;
    @JSONField(name = "last_time")
    public long lastEpProgress;
    @JSONField(name = "last_index_show")
    public String lastIndexShow;
    @JSONField(name = "last_ep_id")
    public String lastWatchEpId;

    public UserSeason() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.UserSeason$1 */
    static class C18681 implements Creator<UserSeason> {
        C18681() {
        }

        /* renamed from: a */
        public UserSeason createFromParcel(Parcel parcel) {
            return new UserSeason(parcel);
        }

        /* renamed from: a */
        public UserSeason[] newArray(int i) {
            return new UserSeason[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lastWatchEpId);
        parcel.writeString(this.lastEpIndex);
        parcel.writeLong(this.lastEpProgress);
        parcel.writeString(this.lastIndexShow);
    }

    protected UserSeason(Parcel parcel) {
        this.lastWatchEpId = parcel.readString();
        this.lastEpIndex = parcel.readString();
        this.lastEpProgress = parcel.readLong();
        this.lastIndexShow = parcel.readString();
    }
}
