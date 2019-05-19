package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.ImageBean */
public class ImageBean implements Parcelable {
    public static final Creator<ImageBean> CREATOR = new C17831();
    @JSONField(name = "jump_url")
    public String jumpUrl;
    @JSONField(name = "report_urls")
    public List<String> reportUrls;
    @JSONField(name = "url")
    public String url;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.ImageBean$1 */
    static class C17831 implements Creator<ImageBean> {
        C17831() {
        }

        /* renamed from: a */
        public ImageBean createFromParcel(Parcel parcel) {
            return new ImageBean(parcel);
        }

        /* renamed from: a */
        public ImageBean[] newArray(int i) {
            return new ImageBean[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.jumpUrl);
        parcel.writeStringList(this.reportUrls);
    }

    protected ImageBean(Parcel parcel) {
        this.url = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.reportUrls = parcel.createStringArrayList();
    }
}
