package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//

@Keep
/* compiled from: BL */
public class LiveStreamingRoomInfo implements Parcelable {
    public static final Creator<LiveStreamingRoomInfo> CREATOR = new C52681();
    public int end_day;
    public String face;
    public int fansNum;
    public String fulltext;
    public int identification;
    public int is_medal;
    public int is_set_medal;
    public int istry;
    public int master_level;
    public int master_level_current;
    public int master_next_level;
    public int master_score;
    public int max_level;
    public String medal_name;
    public int medal_status;
    public int online;
    public int open_medal_level;
    public String rcost;
    public int roomId;
    public int status;
    public String title;
    public String try_time;
    public String uname;

    public LiveStreamingRoomInfo() {
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveStreamingRoomInfo$1 */
    static class C52681 implements Creator<LiveStreamingRoomInfo> {
        C52681() {
        }

        /* renamed from: a */
        public LiveStreamingRoomInfo createFromParcel(Parcel parcel) {
            return new LiveStreamingRoomInfo(parcel);
        }

        /* renamed from: a */
        public LiveStreamingRoomInfo[] newArray(int i) {
            return new LiveStreamingRoomInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveStreamingRoomInfo{roomId=");
        stringBuilder.append(this.roomId);
        stringBuilder.append(", face='");
        stringBuilder.append(this.face);
        stringBuilder.append('\'');
        stringBuilder.append(", uname='");
        stringBuilder.append(this.uname);
        stringBuilder.append('\'');
        stringBuilder.append(", rcost='");
        stringBuilder.append(this.rcost);
        stringBuilder.append('\'');
        stringBuilder.append(", online='");
        stringBuilder.append(this.online);
        stringBuilder.append('\'');
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", fansNum=");
        stringBuilder.append(this.fansNum);
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", istry='");
        stringBuilder.append(this.istry);
        stringBuilder.append('\'');
        stringBuilder.append(", try_time='");
        stringBuilder.append(this.try_time);
        stringBuilder.append('\'');
        stringBuilder.append(", master_score='");
        stringBuilder.append(this.master_score);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level='");
        stringBuilder.append(this.master_level);
        stringBuilder.append('\'');
        stringBuilder.append(", master_next_level='");
        stringBuilder.append(this.master_next_level);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level_current='");
        stringBuilder.append(this.master_level_current);
        stringBuilder.append('\'');
        stringBuilder.append(", max_level='");
        stringBuilder.append(this.max_level);
        stringBuilder.append('\'');
        stringBuilder.append(", is_medal='");
        stringBuilder.append(this.is_medal);
        stringBuilder.append('\'');
        stringBuilder.append(", medal_name='");
        stringBuilder.append(this.medal_name);
        stringBuilder.append('\'');
        stringBuilder.append(", medal_status='");
        stringBuilder.append(this.medal_status);
        stringBuilder.append('\'');
        stringBuilder.append(", end_day='");
        stringBuilder.append(this.end_day);
        stringBuilder.append('\'');
        stringBuilder.append(", identification='");
        stringBuilder.append(this.identification);
        stringBuilder.append('\'');
        stringBuilder.append(", open_medal_level='");
        stringBuilder.append(this.open_medal_level);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.roomId);
        parcel.writeString(this.face);
        parcel.writeString(this.uname);
        parcel.writeString(this.rcost);
        parcel.writeInt(this.online);
        parcel.writeInt(this.status);
        parcel.writeInt(this.fansNum);
        parcel.writeString(this.title);
        parcel.writeInt(this.istry);
        parcel.writeString(this.try_time);
        parcel.writeInt(this.master_score);
        parcel.writeInt(this.master_level);
        parcel.writeInt(this.master_next_level);
        parcel.writeInt(this.master_level_current);
        parcel.writeInt(this.max_level);
        parcel.writeString(this.medal_name);
        parcel.writeInt(this.medal_status);
        parcel.writeInt(this.is_medal);
        parcel.writeInt(this.end_day);
        parcel.writeInt(this.identification);
        parcel.writeInt(this.open_medal_level);
        parcel.writeString(this.fulltext);
        parcel.writeInt(this.is_set_medal);
    }

    protected LiveStreamingRoomInfo(Parcel parcel) {
        this.roomId = parcel.readInt();
        this.face = parcel.readString();
        this.uname = parcel.readString();
        this.rcost = parcel.readString();
        this.online = parcel.readInt();
        this.status = parcel.readInt();
        this.fansNum = parcel.readInt();
        this.title = parcel.readString();
        this.istry = parcel.readInt();
        this.try_time = parcel.readString();
        this.master_score = parcel.readInt();
        this.master_level = parcel.readInt();
        this.master_next_level = parcel.readInt();
        this.master_level_current = parcel.readInt();
        this.max_level = parcel.readInt();
        this.medal_name = parcel.readString();
        this.medal_status = parcel.readInt();
        this.is_medal = parcel.readInt();
        this.end_day = parcel.readInt();
        this.identification = parcel.readInt();
        this.open_medal_level = parcel.readInt();
        this.fulltext = parcel.readString();
        this.is_set_medal = parcel.readInt();
    }

    @Nullable
    private Date getTryDate() {
        if (TextUtils.isEmpty(this.try_time)) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.try_time);
        } catch (ParseException unused) {
            return null;
        }
    }

    public boolean isTry() {
        return this.istry == 1;
    }

    public boolean isFrozen() {
        Date tryDate = getTryDate();
        boolean z = false;
        if (tryDate == null) {
            return false;
        }
        if (isTry() && tryDate.getTime() < System.currentTimeMillis()) {
            z = true;
        }
        return z;
    }

    public int remainTryDays() {
        Date tryDate = getTryDate();
        if (tryDate == null) {
            return 0;
        }
        int time = (int) ((tryDate.getTime() - System.currentTimeMillis()) / 86400000);
        if (time < 0) {
            time = 0;
        }
        return time;
    }
}
