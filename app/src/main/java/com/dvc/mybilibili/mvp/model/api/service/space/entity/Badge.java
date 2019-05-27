package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.Badge */
public class Badge implements Parcelable {
    public static final Creator<Badge> CREATOR = new C24321();
    @Nullable
    @JSONField(name = "bg_color")
    public String bgColor;
    @Nullable
    @JSONField(name = "bg_color_night")
    public String bgColorNight;
    @JSONField(name = "bg_style")
    public int bgStyle;
    @Nullable
    @JSONField(name = "border_color")
    public String borderColor;
    @Nullable
    @JSONField(name = "border_color_night")
    public String borderColorNight;
    @Nullable
    @JSONField(name = "text")
    public String text;
    @Nullable
    @JSONField(name = "text_color")
    public String textColor;
    @Nullable
    @JSONField(name = "text_color_night")
    public String textColorNight;

    public Badge() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.Badge$1 */
    static class C24321 implements Creator<Badge> {
        C24321() {
        }

        /* renamed from: a */
        public Badge createFromParcel(Parcel parcel) {
            return new Badge(parcel);
        }

        /* renamed from: a */
        public Badge[] newArray(int i) {
            return new Badge[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected Badge(Parcel parcel) {
        this.text = parcel.readString();
        this.textColor = parcel.readString();
        this.textColorNight = parcel.readString();
        this.bgColor = parcel.readString();
        this.bgColorNight = parcel.readString();
        this.borderColor = parcel.readString();
        this.borderColorNight = parcel.readString();
        this.bgStyle = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.textColor);
        parcel.writeString(this.textColorNight);
        parcel.writeString(this.bgColor);
        parcel.writeString(this.bgColorNight);
        parcel.writeString(this.borderColor);
        parcel.writeString(this.borderColorNight);
        parcel.writeInt(this.bgStyle);
    }
}
