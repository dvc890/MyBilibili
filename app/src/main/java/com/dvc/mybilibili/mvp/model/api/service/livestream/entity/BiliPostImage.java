package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

//

@Keep
/* compiled from: BL */
public class BiliPostImage implements Parcelable {
    public static final Creator<BiliPostImage> CREATOR = new C19291();
    public static final int MAX_HEIGHT = 4096;
    @JSONField(name = "is_praise_image")
    public int isPraised;
    public int mCommunityId;
    public String mGifThumbUrl;
    @JSONField(name = "height")
    public int mHeight;
    @JSONField(name = "image_id")
    public String mId;
    @JSONField(name = "img_suffix")
    public String mImageSuffix;
    @JSONField(name = "image_thumb")
    public String mImageThumb;
    public int mPostId;
    public String mPostUrl;
    @JSONField(name = "praise_count")
    public int mPraiseCount;
    public double mRatio;
    public int mThumbHeight;
    public String mThumbUrl;
    public int mThumbWidth;
    public String mTitle;
    @JSONField(name = "image_url")
    public String mUrl;
    @JSONField(name = "width")
    public int mWidth;

    public BiliPostImage() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.BiliPostImage$1 */
    static class C19291 implements Creator<BiliPostImage> {
        C19291() {
        }

        /* renamed from: a */
        public BiliPostImage createFromParcel(Parcel parcel) {
            return new BiliPostImage(parcel);
        }

        /* renamed from: a */
        public BiliPostImage[] newArray(int i) {
            return new BiliPostImage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BiliPostImage setkeyIds(String str, String str2, int i, int i2) {
        this.mPostId = i;
        this.mCommunityId = i2;
        this.mTitle = str;
        this.mPostUrl = str2;
        return this;
    }

    public boolean isGif() {
        return "gif".equals(this.mImageSuffix);
    }

    public double getRatio() {
        if (this.mRatio == 0.0d) {
            this.mRatio = ((double) this.mHeight) / ((double) this.mWidth);
        }
        return this.mRatio;
    }

    public static String getCompressImageViewThumbUrl(String str, int i, int i2) {
        BiliPostImage biliPostImage = new BiliPostImage();
        biliPostImage.mUrl = str;
        compressImageViewThumb(biliPostImage, i, i2);
        return biliPostImage.mThumbUrl;
    }

    public static void compressImageViewThumb(BiliPostImage biliPostImage, int i, int i2) {
        if (TextUtils.isEmpty(biliPostImage.mThumbUrl)) {
            biliPostImage.mThumbWidth = i;
            biliPostImage.mThumbHeight = i2;
            biliPostImage.mThumbUrl = makeupThumbUrl(biliPostImage.mUrl, i, i2, true, true);
        }
        if (TextUtils.isEmpty(biliPostImage.mGifThumbUrl)) {
            biliPostImage.mGifThumbUrl = makeupGifUrl(biliPostImage.mUrl, i, i2, true);
        }
    }

    public static void compressImageViewThumb(BiliPostImage biliPostImage, int i) {
        if (TextUtils.isEmpty(biliPostImage.mThumbUrl) || TextUtils.isEmpty(biliPostImage.mGifThumbUrl)) {
            i = Math.max(i >> 1, 360);
            if (biliPostImage.mWidth > i) {
                biliPostImage.mThumbWidth = i;
                biliPostImage.mThumbHeight = (int) ((((float) biliPostImage.mHeight) / ((float) biliPostImage.mWidth)) * ((float) biliPostImage.mThumbWidth));
            } else if (biliPostImage.mWidth == 0 || biliPostImage.mHeight == 0) {
                biliPostImage.mThumbWidth = 320;
                biliPostImage.mWidth = 320;
                biliPostImage.mThumbHeight = 480;
                biliPostImage.mHeight = 480;
            } else {
                biliPostImage.mThumbWidth = biliPostImage.mWidth;
                biliPostImage.mThumbHeight = biliPostImage.mHeight;
            }
            if (biliPostImage.mThumbHeight > 4096) {
                biliPostImage.mThumbWidth = (int) ((((float) biliPostImage.mWidth) / ((float) biliPostImage.mHeight)) * 4096.0f);
                biliPostImage.mThumbHeight = 4096;
            }
            if (!(biliPostImage.mThumbWidth == 0 && biliPostImage.mThumbHeight == 0) && (biliPostImage.mThumbWidth < biliPostImage.mWidth || biliPostImage.mThumbHeight < biliPostImage.mHeight)) {
                biliPostImage.mThumbUrl = makeupThumbUrl(biliPostImage.mUrl, biliPostImage.mThumbWidth, biliPostImage.mThumbHeight, false, true);
                biliPostImage.mGifThumbUrl = makeupGifUrl(biliPostImage.mUrl, biliPostImage.mThumbWidth, biliPostImage.mThumbHeight, false);
            } else {
                biliPostImage.mThumbWidth = biliPostImage.mWidth;
                biliPostImage.mThumbHeight = biliPostImage.mHeight;
                biliPostImage.mThumbUrl = biliPostImage.mUrl;
                biliPostImage.mGifThumbUrl = biliPostImage.mUrl;
            }
        }
    }

    public static String makeupThumbUrl(String str, int i, int i2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        StringBuilder buildUrl = buildUrl(i, i2, parse, z);
        if (z2) {
            buildUrl.append(".webp");
        }
        if (!TextUtils.isEmpty(parse.getEncodedQuery())) {
            buildUrl.append(parse.getEncodedQuery());
        }
        return buildUrl.toString();
    }

    @NonNull
    private static StringBuilder buildUrl(int i, int i2, Uri uri, boolean z) {
        ArrayList<String> arrayList = new ArrayList(uri.getPathSegments());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.getScheme());
        stringBuilder.append("://");
        stringBuilder.append(uri.getAuthority());
        for (String str : arrayList) {
            stringBuilder.append('/');
            stringBuilder.append(str);
        }
        stringBuilder.append("@");
        stringBuilder.append(i);
        stringBuilder.append("w_");
        stringBuilder.append(i2);
        stringBuilder.append("h");
        if (z) {
            stringBuilder.append("_1e_1c");
        }
        return stringBuilder;
    }

    public static String makeupGifUrl(String str, int i, int i2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder buildUrl = buildUrl(i, i2, Uri.parse(str), z);
        buildUrl.append(".gif");
        return buildUrl.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliPostImage{mId=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", mUrl=");
        stringBuilder.append(this.mUrl);
        stringBuilder.append(", mImageThumb='");
        stringBuilder.append(this.mImageThumb);
        stringBuilder.append('\'');
        stringBuilder.append(", mPraiseCount='");
        stringBuilder.append(this.mPraiseCount);
        stringBuilder.append('\'');
        stringBuilder.append(", isPraised='");
        stringBuilder.append(this.isPraised);
        stringBuilder.append('\'');
        stringBuilder.append(", mWidth='");
        stringBuilder.append(this.mWidth);
        stringBuilder.append('\'');
        stringBuilder.append(", mHeight='");
        stringBuilder.append(this.mHeight);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mUrl);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
        parcel.writeString(this.mThumbUrl);
        parcel.writeInt(this.mThumbWidth);
        parcel.writeInt(this.mThumbHeight);
        parcel.writeInt(this.mCommunityId);
        parcel.writeInt(this.mPostId);
        parcel.writeString(this.mPostUrl);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mGifThumbUrl);
        parcel.writeString(this.mImageSuffix);
    }

    protected BiliPostImage(Parcel parcel) {
        this.mId = parcel.readString();
        this.mUrl = parcel.readString();
        this.mWidth = parcel.readInt();
        this.mHeight = parcel.readInt();
        this.mThumbUrl = parcel.readString();
        this.mThumbWidth = parcel.readInt();
        this.mThumbHeight = parcel.readInt();
        this.mCommunityId = parcel.readInt();
        this.mPostId = parcel.readInt();
        this.mPostUrl = parcel.readString();
        this.mTitle = parcel.readString();
        this.mGifThumbUrl = parcel.readString();
        this.mImageSuffix = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BiliPostImage biliPostImage = (BiliPostImage) obj;
        if (!this.mId.equals(biliPostImage.mId)) {
            return false;
        }
        if (this.mUrl == null ? biliPostImage.mUrl != null : !this.mUrl.equals(biliPostImage.mUrl)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.mId.hashCode() * 31) + (this.mUrl != null ? this.mUrl.hashCode() : 0);
    }
}
