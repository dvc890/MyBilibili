package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLiveStreamRoomInfo implements Parcelable {
    public static final Creator<BiliLiveStreamRoomInfo> CREATOR = new C20451();
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "fc_num")
    public int fansNum;
    @JSONField(name = "identify_status")
    public int identificationCheckStatus;
    @JSONField(name = "master_level")
    public int masterLevel;
    @JSONField(name = "master_level_color")
    public int masterLevelColor;
    @JSONField(name = "master_next_level_score")
    public int masterLevelCurrent;
    @JSONField(name = "master_score")
    public long masterScore;
    @JSONField(name = "max_level")
    public int maxLevel;
    @JSONField(name = "room_id")
    public int roomId;
    @JSONField(name = "uname")
    public String uName;

    public BiliLiveStreamRoomInfo() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveStreamRoomInfo$1 */
    static class C20451 implements Creator<BiliLiveStreamRoomInfo> {
        C20451() {
        }

        public BiliLiveStreamRoomInfo createFromParcel(Parcel parcel) {
            return new BiliLiveStreamRoomInfo(parcel);
        }

        public BiliLiveStreamRoomInfo[] newArray(int i) {
            return new BiliLiveStreamRoomInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveStreamRoomInfo(Parcel parcel) {
        this.roomId = parcel.readInt();
        this.face = parcel.readString();
        this.uName = parcel.readString();
        this.fansNum = parcel.readInt();
        this.masterScore = parcel.readLong();
        this.masterLevel = parcel.readInt();
        this.masterLevelColor = parcel.readInt();
        this.masterLevelCurrent = parcel.readInt();
        this.maxLevel = parcel.readInt();
        this.identificationCheckStatus = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.roomId);
        parcel.writeString(this.face);
        parcel.writeString(this.uName);
        parcel.writeInt(this.fansNum);
        parcel.writeLong(this.masterScore);
        parcel.writeInt(this.masterLevel);
        parcel.writeInt(this.masterLevelColor);
        parcel.writeInt(this.masterLevelCurrent);
        parcel.writeInt(this.maxLevel);
        parcel.writeInt(this.identificationCheckStatus);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveStreamingRoomInfo{roomId=");
        stringBuilder.append(this.roomId);
        stringBuilder.append(", face='");
        stringBuilder.append(this.face);
        stringBuilder.append('\'');
        stringBuilder.append(", uname='");
        stringBuilder.append(this.uName);
        stringBuilder.append('\'');
        stringBuilder.append(", fansNum=");
        stringBuilder.append(this.fansNum);
        stringBuilder.append(", master_score='");
        stringBuilder.append(this.masterScore);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level='");
        stringBuilder.append(this.masterLevel);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level_color='");
        stringBuilder.append(this.masterLevelColor);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level_current='");
        stringBuilder.append(this.masterLevelCurrent);
        stringBuilder.append('\'');
        stringBuilder.append(", max_level='");
        stringBuilder.append(this.maxLevel);
        stringBuilder.append('\'');
        stringBuilder.append(", identification_check_status='");
        stringBuilder.append(this.identificationCheckStatus);
        stringBuilder.append('\'');
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
