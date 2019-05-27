package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomUserLevel implements Parcelable {
    public static final Creator<BiliLiveRoomUserLevel> CREATOR = new C20421();
    @JSONField(name = "is_show_vip_broadcast")
    public int mIsShowVipBroadcast;
    @JSONField(name = "master_level")
    public MasterLevel mMasterLevel;
    @JSONField(name = "uid")
    public long mUid;

    public BiliLiveRoomUserLevel() {
    }

    @Keep
    /* compiled from: BL */
    public static class MasterLevel implements Parcelable {
        public static final Creator<MasterLevel> CREATOR = new C20411();
        @JSONField(name = "level")
        public int mLevel;
        @JSONField(name = "master_level_color")
        public int mLevelColor;

        public MasterLevel() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomUserLevel$MasterLevel$1 */
        static class C20411 implements Creator<MasterLevel> {
            C20411() {
            }

            public MasterLevel createFromParcel(Parcel parcel) {
                return new MasterLevel(parcel);
            }

            public MasterLevel[] newArray(int i) {
                return new MasterLevel[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected MasterLevel(Parcel parcel) {
            this.mLevel = parcel.readInt();
            this.mLevelColor = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mLevel);
            parcel.writeInt(this.mLevelColor);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomUserLevel$1 */
    static class C20421 implements Creator<BiliLiveRoomUserLevel> {
        C20421() {
        }

        public BiliLiveRoomUserLevel createFromParcel(Parcel parcel) {
            return new BiliLiveRoomUserLevel(parcel);
        }

        public BiliLiveRoomUserLevel[] newArray(int i) {
            return new BiliLiveRoomUserLevel[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveRoomUserLevel(Parcel parcel) {
        this.mUid = parcel.readLong();
        this.mIsShowVipBroadcast = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mUid);
        parcel.writeInt(this.mIsShowVipBroadcast);
    }
}
