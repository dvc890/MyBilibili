package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

//

@Keep
/* compiled from: BL */
public class SimpleRoomInfo implements Parcelable {
    public static final Creator<SimpleRoomInfo> CREATOR = new C52711();
    public String room_id;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.api.entity.SimpleRoomInfo$1 */
    static class C52711 implements Creator<SimpleRoomInfo> {
        C52711() {
        }

        /* renamed from: a */
        public SimpleRoomInfo createFromParcel(Parcel parcel) {
            return new SimpleRoomInfo(parcel);
        }

        /* renamed from: a */
        public SimpleRoomInfo[] newArray(int i) {
            return new SimpleRoomInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SimpleRoomInfo{  room_id = ");
        stringBuilder.append(this.room_id);
//        //stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.room_id);
    }

    protected SimpleRoomInfo(Parcel parcel) {
        this.room_id = parcel.readString();
    }
}
