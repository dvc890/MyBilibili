package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class BiliLiveAllBeats implements Parcelable {
    public static final Creator<BiliLiveAllBeats> CREATOR = new C19981();
    @JSONField(name = "config")
    public BeatsConfig mBeatsConfig;
    @JSONField(name = "mobileinfo")
    public BeatsInfo mBeatsInfo;
    @JSONField(name = "private")
    public ArrayList<BeatsPrivate> mPrivateBeats;
    @JSONField(name = "public")
    public ArrayList<BeatsPublic> mPublicBeats;

    public BiliLiveAllBeats() {
    }

    @Keep
    /* compiled from: BL */
    public static class BeatsConfig implements Parcelable {
        public static final Creator<BeatsConfig> CREATOR = new C19941();
        @JSONField(name = "action")
        public String mAction;
        @JSONField(name = "count")
        public String mCount;
        @JSONField(name = "msgEnd")
        public String mMsgEnd;
        @JSONField(name = "title")
        public String mTitle;

        public BeatsConfig() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAllBeats$BeatsConfig$1 */
        static class C19941 implements Creator<BeatsConfig> {
            C19941() {
            }

            public BeatsConfig createFromParcel(Parcel parcel) {
                return new BeatsConfig(parcel);
            }

            public BeatsConfig[] newArray(int i) {
                return new BeatsConfig[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mCount);
            parcel.writeString(this.mAction);
            parcel.writeString(this.mMsgEnd);
        }

        protected BeatsConfig(Parcel parcel) {
            this.mTitle = parcel.readString();
            this.mCount = parcel.readString();
            this.mAction = parcel.readString();
            this.mMsgEnd = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class BeatsInfo implements Parcelable {
        public static final Creator<BeatsInfo> CREATOR = new C19951();
        @JSONField(name = "gif_url")
        public String mGifUrl;
        @JSONField(name = "img")
        public String mImage;
        @JSONField(name = "price")
        public long mPrice;
        @JSONField(name = "svip")
        public boolean mSvip;

        public BeatsInfo() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAllBeats$BeatsInfo$1 */
        static class C19951 implements Creator<BeatsInfo> {
            C19951() {
            }

            public BeatsInfo createFromParcel(Parcel parcel) {
                return new BeatsInfo(parcel);
            }

            public BeatsInfo[] newArray(int i) {
                return new BeatsInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.mSvip?1:0));
            parcel.writeLong(this.mPrice);
            parcel.writeString(this.mImage);
            parcel.writeString(this.mGifUrl);
        }

        protected BeatsInfo(Parcel parcel) {
            this.mSvip = parcel.readByte() != (byte) 0;
            this.mPrice = parcel.readLong();
            this.mImage = parcel.readString();
            this.mGifUrl = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class BeatsPrivate implements Parcelable {
        public static final Creator<BeatsPrivate> CREATOR = new C19961();
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "id")
        public String mId;
        @JSONField(name = "status")
        public int mStatus;

        public BeatsPrivate() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAllBeats$BeatsPrivate$1 */
        static class C19961 implements Creator<BeatsPrivate> {
            C19961() {
            }

            public BeatsPrivate createFromParcel(Parcel parcel) {
                return new BeatsPrivate(parcel);
            }

            public BeatsPrivate[] newArray(int i) {
                return new BeatsPrivate[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mId);
            parcel.writeString(this.mContent);
            parcel.writeInt(this.mStatus);
        }

        protected BeatsPrivate(Parcel parcel) {
            this.mId = parcel.readString();
            this.mContent = parcel.readString();
            this.mStatus = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class BeatsPublic implements Parcelable {
        public static final Creator<BeatsPublic> CREATOR = new C19971();
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "id")
        public String mId;

        public BeatsPublic() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAllBeats$BeatsPublic$1 */
        static class C19971 implements Creator<BeatsPublic> {
            C19971() {
            }

            public BeatsPublic createFromParcel(Parcel parcel) {
                return new BeatsPublic(parcel);
            }

            public BeatsPublic[] newArray(int i) {
                return new BeatsPublic[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mId);
            parcel.writeString(this.mContent);
        }

        protected BeatsPublic(Parcel parcel) {
            this.mId = parcel.readString();
            this.mContent = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAllBeats$1 */
    static class C19981 implements Creator<BiliLiveAllBeats> {
        C19981() {
        }

        public BiliLiveAllBeats createFromParcel(Parcel parcel) {
            return new BiliLiveAllBeats(parcel);
        }

        public BiliLiveAllBeats[] newArray(int i) {
            return new BiliLiveAllBeats[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mPublicBeats);
        parcel.writeList(this.mPrivateBeats);
        parcel.writeParcelable(this.mBeatsConfig, i);
        parcel.writeParcelable(this.mBeatsInfo, i);
    }

    protected BiliLiveAllBeats(Parcel parcel) {
        this.mPublicBeats = new ArrayList();
        parcel.readList(this.mPublicBeats, BeatsPublic.class.getClassLoader());
        this.mPrivateBeats = new ArrayList();
        parcel.readList(this.mPrivateBeats, BeatsPrivate.class.getClassLoader());
        this.mBeatsConfig = (BeatsConfig) parcel.readParcelable(BeatsConfig.class.getClassLoader());
        this.mBeatsInfo = (BeatsInfo) parcel.readParcelable(BeatsInfo.class.getClassLoader());
    }
}
