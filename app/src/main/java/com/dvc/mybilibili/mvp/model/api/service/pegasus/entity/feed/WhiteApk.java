package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.web.WhiteApk */
public class WhiteApk implements Parcelable {
    public static final Creator<WhiteApk> CREATOR = new C17881();
    @JSONField(name = "apk_name")
    public String apkName;
    @JSONField(name = "bili_url")
    public String biliURL;
    private String biliUrlSchemeSpecificPart;
    @JSONField(name = "display_name")
    public String displayName;
    private String downloadURL;
    @JSONField(name = "icon")
    public String icon;
    @JSONField(name = "md5")
    public String md5;
    @JSONField(name = "size")
    public long size;
    @JSONField(name = "url")
    public String url;
    private String urlSchemeSpecificPart;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.web.WhiteApk$1 */
    static class C17881 implements Creator<WhiteApk> {
        C17881() {
        }

        /* renamed from: a */
        public WhiteApk createFromParcel(Parcel parcel) {
            return new WhiteApk(parcel);
        }

        /* renamed from: a */
        public WhiteApk[] newArray(int i) {
            return new WhiteApk[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void setDownloadURL(String str) {
        this.downloadURL = str;
    }

    public String getDownloadURL() {
        if (TextUtils.isEmpty(this.downloadURL)) {
            this.downloadURL = TextUtils.isEmpty(this.biliURL) ? this.url : this.biliURL;
        }
        return this.downloadURL;
    }

    public String getUrlSchemeSpecificPart() {
        if (!TextUtils.isEmpty(this.url)) {
            this.urlSchemeSpecificPart = Uri.parse(this.url).getSchemeSpecificPart();
        }
        return this.urlSchemeSpecificPart;
    }

    public String getBiliUrlSchemeSpecificPart() {
        if (!TextUtils.isEmpty(this.biliURL)) {
            this.biliUrlSchemeSpecificPart = Uri.parse(this.biliURL).getSchemeSpecificPart();
        }
        return this.biliUrlSchemeSpecificPart;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.size);
        parcel.writeString(this.displayName);
        parcel.writeString(this.apkName);
        parcel.writeString(this.url);
        parcel.writeString(this.biliURL);
        parcel.writeString(this.md5);
        parcel.writeString(this.icon);
    }

    public WhiteApk() {

    }

    protected WhiteApk(Parcel parcel) {
        this.size = parcel.readLong();
        this.displayName = parcel.readString();
        this.apkName = parcel.readString();
        this.url = parcel.readString();
        this.biliURL = parcel.readString();
        this.md5 = parcel.readString();
        this.icon = parcel.readString();
    }
}
