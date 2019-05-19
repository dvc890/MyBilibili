package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveNewArea implements Parcelable {
    public static final Creator<BiliLiveNewArea> CREATOR = new C20131();
    @JSONField(name = "id")
    /* renamed from: id */
    public int f5999id;
    @JSONField(name = "list")
    public List<SubArea> list;
    @JSONField(name = "name")
    public String name;

    @Keep
    /* compiled from: BL */
    public static class SubArea implements Parcelable {
        public static final Creator<SubArea> CREATOR = new C20121();
        @Nullable
        @JSONField(name = "act_id")
        public String act_id = "0";
        @JSONField(name = "area_type")
        public int areaType;
        @JSONField(name = "hot_status")
        public int hot_status;
        @JSONField(name = "id")
        /* renamed from: id */
        public int f5998id;
        @JSONField(deserialize = false, serialize = false)
        public int isNew;
        @JSONField(deserialize = false, serialize = false)
        public boolean isSelect;
        @Nullable
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "old_area_id")
        public int old_area_id;
        @JSONField(name = "parent_id")
        public int parent_id;
        @Nullable
        @JSONField(name = "parent_name")
        public String parent_name;
        @Nullable
        @JSONField(name = "pic")
        public String pic;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveNewArea$SubArea$1 */
        static class C20121 implements Creator<SubArea> {
            C20121() {
            }

            public SubArea createFromParcel(Parcel parcel) {
                return new SubArea(parcel);
            }

            public SubArea[] newArray(int i) {
                return new SubArea[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean isHot() {
            return this.hot_status == 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5998id);
            parcel.writeInt(this.parent_id);
            parcel.writeInt(this.old_area_id);
            parcel.writeInt(this.hot_status);
            parcel.writeString(this.name);
            parcel.writeString(this.act_id);
            parcel.writeString(this.pic);
            parcel.writeString(this.parent_name);
            parcel.writeInt(this.areaType);
            parcel.writeByte((byte) (this.isSelect?1:0));
            parcel.writeInt(this.isNew);
        }

        public SubArea(int i, String str) {
            this.f5998id = i;
            this.name = str;
        }

        public SubArea(int i, String str, int i2) {
            this.f5998id = i;
            this.name = str;
            this.parent_id = i2;
        }

        protected SubArea(Parcel parcel) {
            this.f5998id = parcel.readInt();
            this.parent_id = parcel.readInt();
            this.old_area_id = parcel.readInt();
            this.hot_status = parcel.readInt();
            this.name = parcel.readString();
            this.act_id = parcel.readString();
            this.pic = parcel.readString();
            this.parent_name = parcel.readString();
            this.areaType = parcel.readInt();
            this.isSelect = parcel.readByte() != (byte) 0;
            this.isNew = parcel.readInt();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveNewArea$1 */
    static class C20131 implements Creator<BiliLiveNewArea> {
        C20131() {
        }

        public BiliLiveNewArea createFromParcel(Parcel parcel) {
            return new BiliLiveNewArea(parcel);
        }

        public BiliLiveNewArea[] newArray(int i) {
            return new BiliLiveNewArea[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5999id);
        parcel.writeString(this.name);
        parcel.writeTypedList(this.list);
    }

    protected BiliLiveNewArea(Parcel parcel) {
        this.f5999id = parcel.readInt();
        this.name = parcel.readString();
        this.list = parcel.createTypedArrayList(SubArea.CREATOR);
    }
}
