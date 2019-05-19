package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BL */
public class ChannelDataItem implements Parcelable {
    public static final Creator<ChannelDataItem> CREATOR = new C170391();
    /* renamed from: a */
    public int f47641a = 0;
    /* renamed from: b */
    public String f47642b = "";
    /* renamed from: c */
    public int f47643c = 0;
    /* renamed from: d */
    public long f47644d = 0;
    /* renamed from: e */
    public String f47645e = "";
    /* renamed from: f */
    public String f47646f = "";
    /* renamed from: g */
    public String f47647g = "";
    /* renamed from: h */
    public String f47648h = "";
    /* renamed from: i */
    public int f47649i = 0;
    @Nullable
    /* renamed from: j */
    public ArrayList<ChannelDataItem> f47650j;
    @Nullable
    /* renamed from: k */
    public ArrayList<ChannelTabItem> f47651k;

    /* compiled from: BL */
    /* renamed from: com.bilibili.pegasus.api.model.ChannelDataItem$1 */
    static class C170391 implements Creator<ChannelDataItem> {
        C170391() {
        }

        /* renamed from: a */
        public ChannelDataItem createFromParcel(Parcel parcel) {
            return new ChannelDataItem(parcel);
        }

        /* renamed from: a */
        public ChannelDataItem[] newArray(int i) {
            return new ChannelDataItem[i];
        }
    }

    /* compiled from: BL */
    public static class ChannelTabItem implements Parcelable {
        public static final Creator<ChannelTabItem> CREATOR = new C170401();
        /* renamed from: a */
        public String f47638a = "";
        /* renamed from: b */
        public String f47639b = "";
        /* renamed from: c */
        public String f47640c = "";

        /* compiled from: BL */
        /* renamed from: com.bilibili.pegasus.api.model.ChannelDataItem$ChannelTabItem$1 */
        static class C170401 implements Creator<ChannelTabItem> {
            C170401() {
            }

            /* renamed from: a */
            public ChannelTabItem createFromParcel(Parcel parcel) {
                return new ChannelTabItem(parcel);
            }

            /* renamed from: a */
            public ChannelTabItem[] newArray(int i) {
                return new ChannelTabItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public long mo56758a() {
            return (long) this.f47640c.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f47638a);
            parcel.writeString(this.f47639b);
            parcel.writeString(this.f47640c);
        }

        public ChannelTabItem(@NonNull C2262a c2262a) {
            this.f47639b = c2262a.f6342b;
            this.f47640c = c2262a.f6343c;
            this.f47638a = c2262a.f6341a;
        }

        public ChannelTabItem(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.f47638a = str;
            this.f47639b = str2;
            this.f47640c = str3;
        }

        protected ChannelTabItem(Parcel parcel) {
            this.f47638a = parcel.readString();
            this.f47639b = parcel.readString();
            this.f47640c = parcel.readString();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo56761a() {
        return this.f47649i == 1;
    }

    public ChannelDataItem(@NonNull Channel channel) {
        this.f47641a = channel.f6322id;
        this.f47642b = channel.name;
        this.f47643c = channel.attention;
        this.f47644d = channel.attenNumber;
        this.f47645e = channel.cover;
        this.f47646f = channel.uri;
        this.f47647g = channel.content;
        this.f47648h = channel.headCover;
        this.f47649i = channel.isActivity;
        if (channel.relatedChannels != null) {
            this.f47650j = new ArrayList(channel.relatedChannels.size());
            Iterator it = channel.relatedChannels.iterator();
            while (it.hasNext()) {
                this.f47650j.add(new ChannelDataItem((Channel) it.next()));
            }
        }
        if (channel.tabs != null) {
            this.f47651k = new ArrayList(channel.tabs.size());
            for (C2262a channelTabItem : channel.tabs) {
                this.f47651k.add(new ChannelTabItem(channelTabItem));
            }
        }
    }

    public ChannelDataItem(int i, String str) {
        this.f47641a = i;
        this.f47642b = str;
    }

    /* renamed from: a */
    public static Channel m67070a(ChannelDataItem channelDataItem) {
        Channel channel = new Channel();
        channel.f6322id = channelDataItem.f47641a;
        channel.name = channelDataItem.f47642b;
        channel.attention = channelDataItem.f47643c;
        channel.attenNumber = channelDataItem.f47644d;
        channel.cover = channelDataItem.f47645e;
        channel.uri = channelDataItem.f47646f;
        channel.content = channelDataItem.f47647g;
        channel.headCover = channelDataItem.f47648h;
        channel.isActivity = channelDataItem.f47649i;
        return channel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f47641a);
        parcel.writeString(this.f47642b);
        parcel.writeInt(this.f47643c);
        parcel.writeLong(this.f47644d);
        parcel.writeString(this.f47645e);
        parcel.writeString(this.f47646f);
        parcel.writeString(this.f47647g);
        parcel.writeString(this.f47648h);
        parcel.writeInt(this.f47649i);
        parcel.writeTypedList(this.f47650j);
        parcel.writeTypedList(this.f47651k);
    }

    protected ChannelDataItem(Parcel parcel) {
        this.f47641a = parcel.readInt();
        this.f47642b = parcel.readString();
        this.f47643c = parcel.readInt();
        this.f47644d = parcel.readLong();
        this.f47645e = parcel.readString();
        this.f47646f = parcel.readString();
        this.f47647g = parcel.readString();
        this.f47648h = parcel.readString();
        this.f47649i = parcel.readInt();
        this.f47650j = parcel.createTypedArrayList(CREATOR);
        this.f47651k = parcel.createTypedArrayList(ChannelTabItem.CREATOR);
    }

    /* renamed from: b */
    public boolean mo56762b() {
        return (TextUtils.isEmpty(this.f47642b) || TextUtils.isEmpty(this.f47646f)) ? false : true;
    }
}
