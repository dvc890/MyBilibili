package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomAnchorInfo implements Parcelable {
    public static final Creator<BiliLiveRoomAnchorInfo> CREATOR = new C20221();
    @JSONField(name = "info")
    public BiliLiveRoomUserInfo mInfo;
    @JSONField(name = "level")
    public BiliLiveRoomUserLevel mLevel;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomAnchorInfo$1 */
    static class C20221 implements Creator<BiliLiveRoomAnchorInfo> {
        C20221() {
        }

        public BiliLiveRoomAnchorInfo createFromParcel(Parcel parcel) {
            return new BiliLiveRoomAnchorInfo(parcel);
        }

        public BiliLiveRoomAnchorInfo[] newArray(int i) {
            return new BiliLiveRoomAnchorInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveRoomAnchorInfo(Parcel parcel) {
        this.mInfo = (BiliLiveRoomUserInfo) parcel.readParcelable(BiliLiveRoomUserInfo.class.getClassLoader());
        this.mLevel = (BiliLiveRoomUserLevel) parcel.readParcelable(BiliLiveRoomUserLevel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mInfo, i);
        parcel.writeParcelable(this.mLevel, i);
    }
}
