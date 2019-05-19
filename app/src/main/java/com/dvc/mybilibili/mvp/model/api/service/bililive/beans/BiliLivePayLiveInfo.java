package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

@Keep
/* compiled from: BL */
public class BiliLivePayLiveInfo implements Parcelable {
    public static final Creator<BiliLivePayLiveInfo> CREATOR = new C20151();
    @JSONField(name = "end_time")
    public Date endTime;
    @JSONField(name = "goods_id")
    public int goodsId;
    @JSONField(name = "goods_type")
    public int goodsType;
    @JSONField(name = "goods_link")
    public String goodsUrl;
    @JSONField(name = "live_id")
    public int liveId;
    @JSONField(name = "start_time")
    public Date startTime;
    @JSONField(name = "title")
    public String title;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLivePayLiveInfo$1 */
    static class C20151 implements Creator<BiliLivePayLiveInfo> {
        C20151() {
        }

        public BiliLivePayLiveInfo createFromParcel(Parcel parcel) {
            return new BiliLivePayLiveInfo(parcel);
        }

        public BiliLivePayLiveInfo[] newArray(int i) {
            return new BiliLivePayLiveInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.liveId);
        parcel.writeInt(this.goodsId);
        parcel.writeInt(this.goodsType);
        parcel.writeString(this.goodsUrl);
        parcel.writeString(this.title);
        long j = -1;
        parcel.writeLong(this.startTime != null ? this.startTime.getTime() : -1);
        if (this.endTime != null) {
            j = this.endTime.getTime();
        }
        parcel.writeLong(j);
    }

    protected BiliLivePayLiveInfo(Parcel parcel) {
        Date date;
        this.liveId = parcel.readInt();
        this.goodsId = parcel.readInt();
        this.goodsType = parcel.readInt();
        this.goodsUrl = parcel.readString();
        this.title = parcel.readString();
        long readLong = parcel.readLong();
        Date date2 = null;
        if (readLong == -1) {
            date = null;
        } else {
            date = new Date(readLong);
        }
        this.startTime = date;
        readLong = parcel.readLong();
        if (readLong != -1) {
            date2 = new Date(readLong);
        }
        this.endTime = date2;
    }
}
