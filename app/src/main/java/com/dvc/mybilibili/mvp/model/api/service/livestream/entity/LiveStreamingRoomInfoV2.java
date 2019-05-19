package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//

@Keep
/* compiled from: BL */
public class LiveStreamingRoomInfoV2 implements Parcelable {
    public static final Creator<LiveStreamingRoomInfoV2> CREATOR = new C52691();
    public static final int IDENTIFY_STATE_APPLY = 0;
    public static final int IDENTITY_STATE_PASS = 1;
    public static final int IDENTITY_STATE_REJECT = 2;
    public static final int IDENTYFY_STATE_NULL = 3;
    public int area_v2_id;
    public String area_v2_name;
    public int end_day = 0;
    public String face;
    public int fc_num;
    public String full_text;
    public int identify_status;
    public int is_medal;
    public int live_status;
    public int lock_status;
    public String lock_time;
    public int master_level;
    public String master_level_color;
    public int master_next_level;
    public int master_score;
    public int max_level;
    public String medal_name;
    public int medal_rename_status;
    public int medal_status;
    public int online = 0;
    public int rcost = 0;
    public int room_id;
    public String title;
    public int uid;
    public String uname;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.LiveStreamingRoomInfoV2$1 */
    static class C52691 implements Creator<LiveStreamingRoomInfoV2> {
        C52691() {
        }

        /* renamed from: a */
        public LiveStreamingRoomInfoV2 createFromParcel(Parcel parcel) {
            return new LiveStreamingRoomInfoV2(parcel);
        }

        /* renamed from: a */
        public LiveStreamingRoomInfoV2[] newArray(int i) {
            return new LiveStreamingRoomInfoV2[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveStreamingRoomInfo{room_id=");
        stringBuilder.append(this.room_id);
        stringBuilder.append(", uid='");
        stringBuilder.append(this.uid);
        stringBuilder.append("', uname='");
        stringBuilder.append(this.uname);
        stringBuilder.append('\'');
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", face='");
        stringBuilder.append(this.face);
        stringBuilder.append('\'');
        stringBuilder.append(", live_status='");
        stringBuilder.append(this.live_status);
        stringBuilder.append('\'');
        stringBuilder.append(", area_v2_name='");
        stringBuilder.append(this.area_v2_name);
        stringBuilder.append('\'');
        stringBuilder.append(", area_v2_id='");
        stringBuilder.append(this.area_v2_id);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level='");
        stringBuilder.append(this.master_level);
        stringBuilder.append('\'');
        stringBuilder.append(", master_level_color='");
        stringBuilder.append(this.master_level_color);
        stringBuilder.append('\'');
        stringBuilder.append(", master_score='");
        stringBuilder.append(this.master_score);
        stringBuilder.append('\'');
        stringBuilder.append(", master_next_level='");
        stringBuilder.append(this.master_next_level);
        stringBuilder.append('\'');
        stringBuilder.append(", max_level='");
        stringBuilder.append(this.max_level);
        stringBuilder.append('\'');
        stringBuilder.append(", fc_num='");
        stringBuilder.append(this.fc_num);
        stringBuilder.append('\'');
        stringBuilder.append(", medal_status='");
        stringBuilder.append(this.medal_status);
        stringBuilder.append('\'');
        stringBuilder.append(", medal_name='");
        stringBuilder.append(this.medal_name);
        stringBuilder.append('\'');
        stringBuilder.append(", medal_rename_status='");
        stringBuilder.append(this.medal_rename_status);
        stringBuilder.append('\'');
        stringBuilder.append(", is_medal='");
        stringBuilder.append(this.is_medal);
        stringBuilder.append('\'');
        stringBuilder.append(", full_text='");
        stringBuilder.append(this.full_text);
        stringBuilder.append('\'');
        stringBuilder.append(", identify_status='");
        stringBuilder.append(this.identify_status);
        stringBuilder.append('\'');
        stringBuilder.append(", lock_status='");
        stringBuilder.append(this.lock_status);
        stringBuilder.append('\'');
        stringBuilder.append(", lock_time='");
        stringBuilder.append(this.lock_time);
        stringBuilder.append('\'');
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    @Nullable
    private Date getTryDate() {
        if (TextUtils.isEmpty(this.lock_time)) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(this.lock_time);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getFrozenDate() {
        Date tryDate = getTryDate();
        return tryDate != null ? new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5", Locale.getDefault()).format(tryDate) : null;
    }

    public boolean isTry() {
        return this.identify_status == 1;
    }

    public boolean isFrozen() {
        Date tryDate = getTryDate();
        boolean z = false;
        if (tryDate == null) {
            return false;
        }
        if (isTry() && tryDate.getTime() > System.currentTimeMillis()) {
            z = true;
        }
        return z;
    }

    public boolean isGlobal() {
        return this.lock_status == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.room_id);
        parcel.writeInt(this.uid);
        parcel.writeString(this.uname);
        parcel.writeString(this.title);
        parcel.writeString(this.face);
        parcel.writeInt(this.live_status);
        parcel.writeString(this.area_v2_name);
        parcel.writeInt(this.area_v2_id);
        parcel.writeInt(this.master_level);
        parcel.writeString(this.master_level_color);
        parcel.writeInt(this.master_score);
        parcel.writeInt(this.master_next_level);
        parcel.writeInt(this.max_level);
        parcel.writeInt(this.fc_num);
        parcel.writeInt(this.medal_status);
        parcel.writeString(this.medal_name);
        parcel.writeInt(this.medal_rename_status);
        parcel.writeInt(this.is_medal);
        parcel.writeString(this.full_text);
        parcel.writeInt(this.identify_status);
        parcel.writeInt(this.lock_status);
        parcel.writeString(this.lock_time);
        parcel.writeInt(this.online);
        parcel.writeInt(this.end_day);
        parcel.writeInt(this.rcost);
    }

    protected LiveStreamingRoomInfoV2(Parcel parcel) {
        this.room_id = parcel.readInt();
        this.uid = parcel.readInt();
        this.uname = parcel.readString();
        this.title = parcel.readString();
        this.face = parcel.readString();
        this.live_status = parcel.readInt();
        this.area_v2_name = parcel.readString();
        this.area_v2_id = parcel.readInt();
        this.master_level = parcel.readInt();
        this.master_level_color = parcel.readString();
        this.master_score = parcel.readInt();
        this.master_next_level = parcel.readInt();
        this.max_level = parcel.readInt();
        this.fc_num = parcel.readInt();
        this.medal_status = parcel.readInt();
        this.medal_name = parcel.readString();
        this.medal_rename_status = parcel.readInt();
        this.is_medal = parcel.readInt();
        this.full_text = parcel.readString();
        this.identify_status = parcel.readInt();
        this.lock_status = parcel.readInt();
        this.lock_time = parcel.readString();
        this.online = parcel.readInt();
        this.end_day = parcel.readInt();
        this.rcost = parcel.readInt();
    }
}
