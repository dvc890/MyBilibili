package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceVideo */
public class BiliSpaceVideo implements Parcelable {
    public static final Creator<BiliSpaceVideo> CREATOR = new C24361();
    @Nullable
    @JSONField(name = "badges")
    public List<Badge> badges;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "ctime")
    public long ctime;
    @JSONField(name = "danmaku")
    public String danmaku;
    @JSONField(name = "duration")
    public long duration;
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "play")
    public int play;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "tname")
    public String tname;
    @JSONField(name = "uri")
    public String uri;

    public BiliSpaceVideo() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceVideo$1 */
    static class C24361 implements Creator<BiliSpaceVideo> {
        C24361() {
        }

        /* renamed from: a */
        public BiliSpaceVideo createFromParcel(Parcel parcel) {
            return new BiliSpaceVideo(parcel);
        }

        /* renamed from: a */
        public BiliSpaceVideo[] newArray(int i) {
            return new BiliSpaceVideo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliSpaceVideo(Parcel parcel) {
        this.title = parcel.readString();
        this.tname = parcel.readString();
        this.duration = parcel.readLong();
        this.cover = parcel.readString();
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.danmaku = parcel.readString();
        this.play = parcel.readInt();
        this.ctime = parcel.readLong();
        this.badges = parcel.createTypedArrayList(Badge.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.tname);
        parcel.writeLong(this.duration);
        parcel.writeString(this.cover);
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeString(this.danmaku);
        parcel.writeInt(this.play);
        parcel.writeLong(this.ctime);
        parcel.writeTypedList(this.badges);
    }
}
