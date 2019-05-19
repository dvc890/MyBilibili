package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.userfeedback;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

//////

@Keep
/* compiled from: BL */
public class LiveUserFeedBackImage implements Parcelable {
    public static final Creator<LiveUserFeedBackImage> CREATOR = new C60191();
    public String mId;
    public String mUrl;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.userfeedback.LiveUserFeedBackImage$1 */
    static class C60191 implements Creator<LiveUserFeedBackImage> {
        C60191() {
        }

        public LiveUserFeedBackImage createFromParcel(Parcel parcel) {
            return new LiveUserFeedBackImage(parcel);
        }

        public LiveUserFeedBackImage[] newArray(int i) {
            return new LiveUserFeedBackImage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliPostImage{mId=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", mUrl=");
        stringBuilder.append(this.mUrl);
//        ////stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mUrl);
    }

    protected LiveUserFeedBackImage(Parcel parcel) {
        this.mId = parcel.readString();
        this.mUrl = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveUserFeedBackImage liveUserFeedBackImage = (LiveUserFeedBackImage) obj;
        if (!this.mId.equals(liveUserFeedBackImage.mId)) {
            return false;
        }
        if (this.mUrl == null ? liveUserFeedBackImage.mUrl != null : !this.mUrl.equals(liveUserFeedBackImage.mUrl)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.mId.hashCode() * 31) + (this.mUrl != null ? this.mUrl.hashCode() : 0);
    }
}
