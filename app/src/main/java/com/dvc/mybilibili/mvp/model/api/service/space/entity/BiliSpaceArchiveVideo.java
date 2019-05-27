package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArchiveVideo */
public class BiliSpaceArchiveVideo extends BiliSpaceItemCount implements Parcelable {
    public static final Creator<BiliSpaceArchiveVideo> CREATOR = new C30591();
    @JSONField(name = "item")
    public List<BiliSpaceVideo> videos;

    public BiliSpaceArchiveVideo() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceArchiveVideo$1 */
    static class C30591 implements Creator<BiliSpaceArchiveVideo> {
        C30591() {
        }

        /* renamed from: a */
        public BiliSpaceArchiveVideo createFromParcel(Parcel parcel) {
            return new BiliSpaceArchiveVideo(parcel);
        }

        /* renamed from: a */
        public BiliSpaceArchiveVideo[] newArray(int i) {
            return new BiliSpaceArchiveVideo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isEmpty() {
        return this.videos == null || this.videos.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.videos);
        parcel.writeInt(this.count);
    }

    protected BiliSpaceArchiveVideo(Parcel parcel) {
        this.videos = parcel.createTypedArrayList(BiliSpaceVideo.CREATOR);
        this.count = parcel.readInt();
    }
}
