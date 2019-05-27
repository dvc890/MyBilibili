package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceSeasonItem */
public class BiliSpaceSeasonItem implements Parcelable {
    public static final Creator<BiliSpaceSeasonItem> CREATOR = new C24341();
    @JSONField(name = "attention")
    public boolean attention;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "danmaku")
    public String danmaku;
    @JSONField(name = "finish")
    public boolean isFinish;
    @JSONField(name = "is_started")
    public int isStarted;
    @JSONField(name = "newest_ep_index")
    public String newestEp;
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "total_count")
    public String totalCount;
    @JSONField(name = "uri")
    public String uri;

    public BiliSpaceSeasonItem() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceSeasonItem$1 */
    static class C24341 implements Creator<BiliSpaceSeasonItem> {
        C24341() {
        }

        /* renamed from: a */
        public BiliSpaceSeasonItem createFromParcel(Parcel parcel) {
            return new BiliSpaceSeasonItem(parcel);
        }

        /* renamed from: a */
        public BiliSpaceSeasonItem[] newArray(int i) {
            return new BiliSpaceSeasonItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.cover);
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeString(this.danmaku);
        parcel.writeInt(this.play);
        parcel.writeString(this.totalCount);
        parcel.writeString(this.newestEp);
        parcel.writeByte((byte) (this.attention?1:0));
        parcel.writeInt(this.isStarted);
    }

    protected BiliSpaceSeasonItem(Parcel parcel) {
        this.title = parcel.readString();
        this.cover = parcel.readString();
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.danmaku = parcel.readString();
        this.play = parcel.readInt();
        this.totalCount = parcel.readString();
        this.newestEp = parcel.readString();
        this.attention = parcel.readByte() != (byte) 0;
        this.isStarted = parcel.readInt();
    }
}
