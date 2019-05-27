package com.dvc.mybilibili.mvp.model.api.service.space.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceUserGame */
public class BiliSpaceUserGame extends BiliSpaceItemCount implements Parcelable {
    public static final Creator<BiliSpaceUserGame> CREATOR = new C30601();
    @JSONField(name = "item")
    public List<BiliSpaceGame> games;

    public BiliSpaceUserGame() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceUserGame$BiliSpaceGame */
    public static class BiliSpaceGame implements Parcelable {
        public static final Creator<BiliSpaceGame> CREATOR = new C24351();
        @JSONField(name = "id")
        /* renamed from: a */
        public int f6590a;
        @JSONField(name = "name")
        /* renamed from: b */
        public String f6591b;
        @JSONField(name = "summary")
        /* renamed from: c */
        public String f6592c;
        @JSONField(name = "icon")
        /* renamed from: d */
        public String f6593d;
        @JSONField(name = "android_pkg_name")
        /* renamed from: e */
        public String f6594e;

        public BiliSpaceGame() {
        }

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceUserGame$BiliSpaceGame$1 */
        static class C24351 implements Creator<BiliSpaceGame> {
            C24351() {
            }

            /* renamed from: a */
            public BiliSpaceGame createFromParcel(Parcel parcel) {
                return new BiliSpaceGame(parcel);
            }

            /* renamed from: a */
            public BiliSpaceGame[] newArray(int i) {
                return new BiliSpaceGame[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BiliSpaceGame{id=");
            stringBuilder.append(this.f6590a);
            stringBuilder.append(", name='");
            stringBuilder.append(this.f6591b);
            stringBuilder.append('\'');
            stringBuilder.append(", summary='");
            stringBuilder.append(this.f6592c);
            stringBuilder.append('\'');
            stringBuilder.append(", iconUrl='");
            stringBuilder.append(this.f6593d);
            stringBuilder.append('\'');
            stringBuilder.append(", pkgName='");
            stringBuilder.append(this.f6594e);
            stringBuilder.append('\'');
//            stringBuilder.append(JsonParserKt.END_OBJ);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6590a);
            parcel.writeString(this.f6591b);
            parcel.writeString(this.f6592c);
            parcel.writeString(this.f6593d);
            parcel.writeString(this.f6594e);
        }

        protected BiliSpaceGame(Parcel parcel) {
            this.f6590a = parcel.readInt();
            this.f6591b = parcel.readString();
            this.f6592c = parcel.readString();
            this.f6593d = parcel.readString();
            this.f6594e = parcel.readString();
        }
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.author.api.BiliSpaceUserGame$1 */
    static class C30601 implements Creator<BiliSpaceUserGame> {
        C30601() {
        }

        /* renamed from: a */
        public BiliSpaceUserGame createFromParcel(Parcel parcel) {
            return new BiliSpaceUserGame(parcel);
        }

        /* renamed from: a */
        public BiliSpaceUserGame[] newArray(int i) {
            return new BiliSpaceUserGame[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isEmpty() {
        return this.games == null || this.games.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.games);
        parcel.writeInt(this.count);
    }

    protected BiliSpaceUserGame(Parcel parcel) {
        this.games = parcel.createTypedArrayList(BiliSpaceGame.CREATOR);
        this.count = parcel.readInt();
    }
}
