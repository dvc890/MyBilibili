package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomRank implements Parcelable {
    public static final Creator<BiliLiveRoomRank> CREATOR = new C20361();
    private static final String FIELD_IS_NEW_RANK_CONTAINER = "is_new_rank_container";
    @JSONField(name = "color")
    public String mColor;
    @JSONField(name = "h5_url")
    public String mH5Url;
    @JSONField(name = "rank_desc")
    public String mRankDesc;
    @JSONField(name = "roomid")
    public int mRoomid;
    @JSONField(name = "timestamp")
    public long mTimeStamp;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomRank$1 */
    static class C20361 implements Creator<BiliLiveRoomRank> {
        C20361() {
        }

        public BiliLiveRoomRank createFromParcel(Parcel parcel) {
            return new BiliLiveRoomRank(parcel);
        }

        public BiliLiveRoomRank[] newArray(int i) {
            return new BiliLiveRoomRank[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getH5UrlWithRankContainerField() {
        if (TextUtils.isEmpty(this.mH5Url)) {
            return this.mH5Url;
        }
        return Uri.parse(this.mH5Url).buildUpon().appendQueryParameter(FIELD_IS_NEW_RANK_CONTAINER, "1").toString();
    }

    protected BiliLiveRoomRank(Parcel parcel) {
        this.mRoomid = parcel.readInt();
        this.mRankDesc = parcel.readString();
        this.mColor = parcel.readString();
        this.mH5Url = parcel.readString();
        this.mTimeStamp = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRoomid);
        parcel.writeString(this.mRankDesc);
        parcel.writeString(this.mColor);
        parcel.writeString(this.mH5Url);
        parcel.writeLong(this.mTimeStamp);
    }
}
