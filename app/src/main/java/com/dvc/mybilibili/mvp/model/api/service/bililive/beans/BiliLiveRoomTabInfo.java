package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveRoomTabInfo implements Parcelable {
    public static final Creator<BiliLiveRoomTabInfo> CREATOR = new C20381();
    public static final String TAB_COMMENT = "comment";
    public static final String TAB_GIFT_RANK = "gift-rank";
    public static final String TAB_GOLD_RANK = "gold-rank";
    public static final String TAB_GUARD = "guard";
    public static final String TAB_HISTORY = "view-history";
    public static final String TAB_INTERACTION = "interaction";
    public static final String TAB_LOVE_CLUB = "love-club";
    public static final String TAB_MORE_HISTORY = "view-history-sub";
    public static final String TAB_MORE_RECOMMEND = "more-live";
    public static final String TAB_MORE_RELATIVE_RECOMMEND = "relative-recommend";
    public static final String TAB_RANK = "contribution-rank";
    public static final String TAB_RANK_ACTIVITY = "event-rank";
    public static final String TAB_RANK_FANS = "fans-rank";
    public static final String TAB_RANK_SEVEN = "seven-rank";
    public static final String TAB_RANK_TODAY = "today-rank";
    public static final int TAB_STATUS_DISPLAY = 1;
    public static final int TAB_STATUS_UNDISPLAY = 0;
    public static final String TAB_UP = "up-tab";
    public static final String TAB_UP_DYNAMIC = "dynamic";
    @JSONField(name = "default_sub_tab")
    public String defaultSubTabType;
    @JSONField(name = "default")
    public int defaultTab;
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "order")
    public int order;
    @JSONField(name = "status")
    public int status;
    @Nullable
    @JSONField(name = "sub_tab")
    public List<LiveSubTabInfo> subTabs;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "url")
    public String url;

    @Keep
    /* compiled from: BL */
    public static class LiveSubTabInfo implements Parcelable {
        public static final Creator<LiveSubTabInfo> CREATOR = new C20371();
        @JSONField(name = "default_sub_tab")
        public String defaultSubTabType;
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "documents")
        public String document;
        @JSONField(name = "order")
        public int order;
        @JSONField(name = "rank_name")
        public String rankName;
        @JSONField(name = "status")
        public int status;
        @Nullable
        @JSONField(name = "sub_tab")
        public List<LiveSubTabInfo> subTabs;
        @JSONField(name = "type")
        public String type;
        @JSONField(name = "url")
        public String url;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomTabInfo$LiveSubTabInfo$1 */
        static class C20371 implements Creator<LiveSubTabInfo> {
            C20371() {
            }

            public LiveSubTabInfo createFromParcel(Parcel parcel) {
                return new LiveSubTabInfo(parcel);
            }

            public LiveSubTabInfo[] newArray(int i) {
                return new LiveSubTabInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected LiveSubTabInfo(Parcel parcel) {
            this.type = parcel.readString();
            this.desc = parcel.readString();
            this.status = parcel.readInt();
            this.url = parcel.readString();
            this.order = parcel.readInt();
            this.document = parcel.readString();
            this.rankName = parcel.readString();
            this.subTabs = parcel.createTypedArrayList(CREATOR);
            this.defaultSubTabType = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.desc);
            parcel.writeInt(this.status);
            parcel.writeString(this.url);
            parcel.writeInt(this.order);
            parcel.writeString(this.document);
            parcel.writeString(this.rankName);
            parcel.writeTypedList(this.subTabs);
            parcel.writeString(this.defaultSubTabType);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomTabInfo$1 */
    static class C20381 implements Creator<BiliLiveRoomTabInfo> {
        C20381() {
        }

        public BiliLiveRoomTabInfo createFromParcel(Parcel parcel) {
            return new BiliLiveRoomTabInfo(parcel);
        }

        public BiliLiveRoomTabInfo[] newArray(int i) {
            return new BiliLiveRoomTabInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.desc);
        parcel.writeInt(this.status);
        parcel.writeString(this.url);
        parcel.writeInt(this.order);
        parcel.writeInt(this.defaultTab);
        parcel.writeTypedList(this.subTabs);
        parcel.writeString(this.defaultSubTabType);
    }

    protected BiliLiveRoomTabInfo(Parcel parcel) {
        this.type = parcel.readString();
        this.desc = parcel.readString();
        this.status = parcel.readInt();
        this.url = parcel.readString();
        this.order = parcel.readInt();
        this.defaultTab = parcel.readInt();
        this.subTabs = parcel.createTypedArrayList(LiveSubTabInfo.CREATOR);
        this.defaultSubTabType = parcel.readString();
    }
}
