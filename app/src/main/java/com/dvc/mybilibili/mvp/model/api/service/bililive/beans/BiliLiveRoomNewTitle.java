package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliLiveRoomNewTitle implements Parcelable {
    public static final Creator<BiliLiveRoomNewTitle> CREATOR = new C20351();
    @JSONField(name = "colorful")
    public int mColorful;
    @JSONField(name = "create_time")
    public String mCreateTime;
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "expire_time")
    public String mExpireTime;
    @JSONField(name = "mobile_pic_url")
    public String mMobilePicUrl;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "source")
    public String mSource;
    @JSONField(name = "title_id")
    public String mTitleId;
    @JSONField(name = "url")
    public String mUrl;
    @JSONField(name = "web_pic_url")
    public String mWebPicUrl;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomNewTitle$1 */
    static class C20351 implements Creator<BiliLiveRoomNewTitle> {
        C20351() {
        }

        public BiliLiveRoomNewTitle createFromParcel(Parcel parcel) {
            return new BiliLiveRoomNewTitle(parcel);
        }

        public BiliLiveRoomNewTitle[] newArray(int i) {
            return new BiliLiveRoomNewTitle[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitleId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mCreateTime);
        parcel.writeString(this.mExpireTime);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mMobilePicUrl);
        parcel.writeString(this.mWebPicUrl);
        parcel.writeString(this.mSource);
        parcel.writeString(this.mDescription);
    }

    protected BiliLiveRoomNewTitle(Parcel parcel) {
        this.mTitleId = parcel.readString();
        this.mName = parcel.readString();
        this.mCreateTime = parcel.readString();
        this.mExpireTime = parcel.readString();
        this.mUrl = parcel.readString();
        this.mMobilePicUrl = parcel.readString();
        this.mWebPicUrl = parcel.readString();
        this.mSource = parcel.readString();
        this.mDescription = parcel.readString();
    }

    public static boolean checkTheKeyIsNotEmpty(BiliLiveRoomNewTitle biliLiveRoomNewTitle) {
        return (biliLiveRoomNewTitle == null || biliLiveRoomNewTitle.mTitleId == null || biliLiveRoomNewTitle.mCreateTime == null || biliLiveRoomNewTitle.mExpireTime == null || biliLiveRoomNewTitle.mSource == null || biliLiveRoomNewTitle.mDescription == null || biliLiveRoomNewTitle.mMobilePicUrl == null || biliLiveRoomNewTitle.mName == null) ? false : true;
    }
}
