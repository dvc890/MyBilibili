package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

//////

@Keep
/* compiled from: BL */
public class BiliLiveArea implements Parcelable {
    public static final Creator<BiliLiveArea> CREATOR = new C19991();
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "entrance_icon")
    public BiliImage mLargeIcon = BiliImage.NULL;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "sub_icon")
    public BiliImage mSmallIcon = BiliImage.NULL;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveArea$1 */
    static class C19991 implements Creator<BiliLiveArea> {
        C19991() {
        }

        public BiliLiveArea createFromParcel(Parcel parcel) {
            return new BiliLiveArea(parcel);
        }

        public BiliLiveArea[] newArray(int i) {
            return new BiliLiveArea[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliLiveArea{id=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", name='");
        stringBuilder.append(this.mName);
        stringBuilder.append('\'');
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mName);
        parcel.writeParcelable(this.mLargeIcon, i);
        parcel.writeParcelable(this.mSmallIcon, i);
    }

    public BiliLiveArea(int i, String str) {
        this.mId = i;
        this.mName = str;
    }

    protected BiliLiveArea(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mName = parcel.readString();
        this.mLargeIcon = (BiliImage) parcel.readParcelable(BiliImage.class.getClassLoader());
        this.mSmallIcon = (BiliImage) parcel.readParcelable(BiliImage.class.getClassLoader());
    }
}
