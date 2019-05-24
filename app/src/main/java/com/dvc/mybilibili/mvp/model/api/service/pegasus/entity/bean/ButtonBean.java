package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.adview.feed.model.ButtonBean */
public class ButtonBean implements Parcelable {
    public static final Creator<ButtonBean> CREATOR = new C17781();
    @JSONField(name = "dlsuc_callup_url")
    public String dlsucCallupUrl;
    @JSONField(name = "jump_url")
    public String jumpUrl;
    @JSONField(name = "report_urls")
    public List<String> reportUrls;
    @JSONField(name = "text")
    public String text;
    @JSONField(name = "type")
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.adview.feed.model.ButtonBean$1 */
    static class C17781 implements Creator<ButtonBean> {
        C17781() {
        }

        /* renamed from: a */
        public ButtonBean createFromParcel(Parcel parcel) {
            return new ButtonBean(parcel);
        }

        /* renamed from: a */
        public ButtonBean[] newArray(int i) {
            return new ButtonBean[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.type);
        parcel.writeString(this.jumpUrl);
        parcel.writeStringList(this.reportUrls);
        parcel.writeString(this.dlsucCallupUrl);
    }

    public ButtonBean() {

    }

    protected ButtonBean(Parcel parcel) {
        this.text = parcel.readString();
        this.type = parcel.readInt();
        this.jumpUrl = parcel.readString();
        this.reportUrls = parcel.createStringArrayList();
        this.dlsucCallupUrl = parcel.readString();
    }
}
