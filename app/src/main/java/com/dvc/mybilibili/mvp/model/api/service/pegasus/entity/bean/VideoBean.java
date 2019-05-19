package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.imax.model.VideoBean */
public class VideoBean implements Parcelable {
    public static final Creator<VideoBean> CREATOR = new C17861();
    @JSONField(name = "avid")
    public String avid;
    @JSONField(name = "biz_id")
    public String bizId;
    @JSONField(name = "btn_dyc_time")
    public String btnDycTime;
    @JSONField(name = "auto_play")
    public Boolean canAutoPlay;
    @JSONField(name = "btn_dyc_color")
    public Boolean canBtnDyc;
    @JSONField(name = "cid")
    public String cid;
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "from")
    public String from;
    @JSONField(name = "page")
    public String page;
    @JSONField(serialize = false)
    public int position;
    @JSONField(name = "url")
    public String url;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.imax.model.VideoBean$1 */
    static class C17861 implements Creator<VideoBean> {
        C17861() {
        }

        /* renamed from: a */
        public VideoBean createFromParcel(Parcel parcel) {
            return new VideoBean(parcel);
        }

        /* renamed from: a */
        public VideoBean[] newArray(int i) {
            return new VideoBean[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getAvid() {
        try {
            return Integer.parseInt(this.avid);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public int getCid() {
        try {
            return Integer.parseInt(this.cid);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public int getPage() {
        try {
            return Integer.parseInt(this.page);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public String getUrl() {
        if (this.url == null) {
            return "";
        }
        return this.url;
    }

    public String getFrom() {
        if (this.from == null) {
            return "";
        }
        return this.from;
    }

    public String getCover() {
        if (this.cover == null) {
            return "";
        }
        return this.cover;
    }

    public boolean isCanAutoPlay() {
        if (this.canAutoPlay == null) {
            return true;
        }
        return this.canAutoPlay.booleanValue();
    }

    public boolean isCanBtnDyc() {
        if (this.canBtnDyc == null) {
            return true;
        }
        return this.canBtnDyc.booleanValue();
    }

    public int getBtnDycTime() {
        if (TextUtils.isEmpty(this.btnDycTime)) {
            return 5000;
        }
        int i = -1;
        try {
            i = Integer.parseInt(this.btnDycTime);
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public int getBizid() {
        try {
            return Integer.parseInt(this.bizId);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public int getPosition() {
        if (this.position < 0) {
            return 0;
        }
        return this.position;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.avid);
        parcel.writeString(this.cid);
        parcel.writeString(this.page);
        parcel.writeString(this.from);
        parcel.writeString(this.url);
        parcel.writeString(this.cover);
        parcel.writeValue(this.canAutoPlay);
        parcel.writeValue(this.canBtnDyc);
        parcel.writeString(this.btnDycTime);
        parcel.writeString(this.bizId);
        parcel.writeInt(this.position);
    }

    protected VideoBean(Parcel parcel) {
        this.avid = parcel.readString();
        this.cid = parcel.readString();
        this.page = parcel.readString();
        this.from = parcel.readString();
        this.url = parcel.readString();
        this.cover = parcel.readString();
        this.canAutoPlay = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.canBtnDyc = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.btnDycTime = parcel.readString();
        this.bizId = parcel.readString();
        this.position = parcel.readInt();
    }
}
