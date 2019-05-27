package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class SearchResultAll {
    @JSONField(name = "attribute")
    public int attribute;
    @Nullable
    @JSONField(name = "easter_egg")
    public EasterEgg easterEgg;
    @Nullable
    @JSONField(name = "item")
    public ArrayList<BaseSearchItem> items;
    @Nullable
    @JSONField(name = "nav")
    public ArrayList<NavInfo> nav;
    @JSONField(name = "page")
    public int page;
    @Nullable
    @JSONField(name = "trackid")
    public String trackId;

    @Keep
    /* compiled from: BL */
    public static class EasterEgg {
        @JSONField(name = "id")
        /* renamed from: id */
        public int f6357id;
        public String query;
        @JSONField(name = "show_count")
        public int showCount;
        public String trackId;
        @JSONField(name = "type")
        public int type;
        @Nullable
        @JSONField(name = "url")
        public String url;
    }

    @Keep
    /* compiled from: BL */
    public static class NavInfo implements Parcelable {
        public static final Creator<NavInfo> CREATOR = new C22761();
        @Nullable
        public String name;
        public int pages;
        public int tabIndex;
        public int total;
        public int type;

        public NavInfo() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.search.api.SearchResultAll$NavInfo$1 */
        static class C22761 implements Creator<NavInfo> {
            C22761() {
            }

            /* renamed from: a */
            public NavInfo createFromParcel(Parcel parcel) {
                return new NavInfo(parcel);
            }

            /* renamed from: a */
            public NavInfo[] newArray(int i) {
                return new NavInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeInt(this.total);
            parcel.writeInt(this.pages);
            parcel.writeInt(this.type);
            parcel.writeInt(this.tabIndex);
        }

        protected NavInfo(Parcel parcel) {
            this.name = parcel.readString();
            this.total = parcel.readInt();
            this.pages = parcel.readInt();
            this.type = parcel.readInt();
            this.tabIndex = parcel.readInt();
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isEmpty() {
        return this.items == null || this.items.isEmpty();
    }

    public int totalCount() {
        return this.items == null ? 0 : this.items.size();
    }
}
