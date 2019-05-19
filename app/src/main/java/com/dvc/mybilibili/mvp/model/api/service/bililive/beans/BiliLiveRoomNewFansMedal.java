package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveUserCard.FansMedal;

@Keep
/* compiled from: BL */
public class BiliLiveRoomNewFansMedal implements Parcelable {
    public static final Creator<BiliLiveRoomNewFansMedal> CREATOR = new C20341();
    @JSONField(name = "day_limit")
    public int mDayLimit;
    @JSONField(name = "highlight_color")
    public int mHighlightColor = -1;
    @JSONField(name = "intimacy")
    public int mIntimacy;
    @JSONField(name = "medal_color")
    public int mMedalColor = -1;
    @JSONField(name = "medal_id")
    public int mMedalId = -1;
    @JSONField(name = "medal_level")
    public int mMedalLevel = -1;
    @JSONField(name = "medal_name")
    public String mMedalName;
    @JSONField(name = "msg_content")
    public String mMsgContent;
    @JSONField(name = "msg_title")
    public String mMsgTitle;
    @JSONField(name = "next_intimacy")
    public int mNextIntimacy;
    @JSONField(name = "normal_color")
    public int mNormalColor = -1;
    @JSONField(name = "today_feed")
    public int mTodayFeed;
    @JSONField(name = "up_uid")
    public long mUpUid = -1;
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomNewFansMedal$1 */
    static class C20341 implements Creator<BiliLiveRoomNewFansMedal> {
        C20341() {
        }

        public BiliLiveRoomNewFansMedal createFromParcel(Parcel parcel) {
            return new BiliLiveRoomNewFansMedal(parcel);
        }

        public BiliLiveRoomNewFansMedal[] newArray(int i) {
            return new BiliLiveRoomNewFansMedal[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public static boolean checkTheKeyIsNotEmpty(BiliLiveRoomNewFansMedal biliLiveRoomNewFansMedal) {
        return (biliLiveRoomNewFansMedal == null || biliLiveRoomNewFansMedal.mMedalName == null || biliLiveRoomNewFansMedal.mMsgTitle == null || biliLiveRoomNewFansMedal.mMsgContent == null || biliLiveRoomNewFansMedal.mNormalColor == -1 || biliLiveRoomNewFansMedal.mHighlightColor == -1 || biliLiveRoomNewFansMedal.mMedalColor == -1 || biliLiveRoomNewFansMedal.mMedalLevel == -1 || biliLiveRoomNewFansMedal.mUpUid == -1 || biliLiveRoomNewFansMedal.mMedalId == -1) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeLong(this.mUpUid);
        parcel.writeInt(this.mMedalId);
        parcel.writeString(this.mMedalName);
        parcel.writeInt(this.mMedalLevel);
        parcel.writeString(this.mMsgTitle);
        parcel.writeString(this.mMsgContent);
        parcel.writeInt(this.mMedalColor);
        parcel.writeInt(this.mNormalColor);
        parcel.writeInt(this.mHighlightColor);
        parcel.writeInt(this.mIntimacy);
        parcel.writeInt(this.mNextIntimacy);
        parcel.writeInt(this.mTodayFeed);
        parcel.writeInt(this.mDayLimit);
    }

    protected BiliLiveRoomNewFansMedal(Parcel parcel) {
        this.type = parcel.readInt();
        this.mUpUid = parcel.readLong();
        this.mMedalId = parcel.readInt();
        this.mMedalName = parcel.readString();
        this.mMedalLevel = parcel.readInt();
        this.mMsgTitle = parcel.readString();
        this.mMsgContent = parcel.readString();
        this.mMedalColor = parcel.readInt();
        this.mNormalColor = parcel.readInt();
        this.mHighlightColor = parcel.readInt();
        this.mIntimacy = parcel.readInt();
        this.mNextIntimacy = parcel.readInt();
        this.mTodayFeed = parcel.readInt();
        this.mDayLimit = parcel.readInt();
    }

    public FansMedal getMedalBean() {
        FansMedal fansMedal = new FansMedal();
        fansMedal.mMedalId = this.mMedalId;
        fansMedal.mMedalColor = this.mMedalColor;
        fansMedal.mMedalName = this.mMedalName;
        return fansMedal;
    }
}
