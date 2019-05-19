package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;


@Keep
/* compiled from: BL */
/* renamed from: com.bilibili.ad.utils.mark.MarkInfo */
public class MarkInfo implements Parcelable {
    public static final Creator<MarkInfo> CREATOR = new C17911();
    @JSONField(name = "bg_border_color")
    public String bgColor;
    @JSONField(name = "img_height")
    public int imgHeight;
    @JSONField(name = "img_url")
    public String imgUrl;
    @JSONField(name = "img_width")
    public int imgWidth;
    @JSONField(name = "text")
    public String text;
    @JSONField(name = "text_color")
    public String textColor;
    @JSONField(name = "type")
    public int type;

    /* compiled from: BL */
    /* renamed from: com.bilibili.ad.utils.mark.MarkInfo$1 */
    static class C17911 implements Creator<MarkInfo> {
        C17911() {
        }

        /* renamed from: a */
        public MarkInfo createFromParcel(Parcel parcel) {
            return new MarkInfo(parcel);
        }

        /* renamed from: a */
        public MarkInfo[] newArray(int i) {
            return new MarkInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @ColorInt
    public int getTextColor() {
        return formatColorStr(this.textColor);
    }

    @ColorInt
    public int getBackgroundColor() {
        return formatColorStr(this.bgColor);
    }

    @ColorInt
    public int getBorderColor() {
        return formatColorStr(this.bgColor);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.text);
        parcel.writeString(this.bgColor);
        parcel.writeString(this.textColor);
        parcel.writeString(this.imgUrl);
        parcel.writeInt(this.imgHeight);
        parcel.writeInt(this.imgWidth);
    }

    protected MarkInfo(Parcel parcel) {
        this.type = parcel.readInt();
        this.text = parcel.readString();
        this.bgColor = parcel.readString();
        this.textColor = parcel.readString();
        this.imgUrl = parcel.readString();
        this.imgHeight = parcel.readInt();
        this.imgWidth = parcel.readInt();
    }


    @ColorInt
    /* renamed from: b */
    public static int formatColorStr(@Nullable String str) {
        try {
            if (TextUtils.isEmpty(str) || str.charAt(0) != '#') {
                return 0;
            }
            str = str.substring(1);
            if (!TextUtils.isEmpty(str) && str.length() == 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("FF");
                str = stringBuilder.toString();
            }
            long parseLong = Long.parseLong(str, 16);
            return Color.argb((int) (parseLong & 255), (int) (parseLong >>> 24), (int) ((parseLong & 16711680) >> 16), (int) ((parseLong & 65280) >> 8));
        } catch (Exception unused) {
            return 0;
        }
    }
}
