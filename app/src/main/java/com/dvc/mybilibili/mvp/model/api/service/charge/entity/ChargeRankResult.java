package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class ChargeRankResult implements Parcelable {
    public static final Creator<ChargeRankResult> CREATOR = new C21781();
    @Nullable
    @JSONField(name = "elec_set")
    public ChargeTheme chargeTheme;
    @JSONField(deserialize = false, serialize = false)
    public boolean isForcePackup = false;
    @Nullable
    @JSONField(name = "user")
    public ChargeRankItem mine;
    @JSONField(name = "count")
    public int rankCount;
    @Nullable
    @JSONField(name = "list")
    public List<ChargeRankItem> rankList;
    @JSONField(name = "total")
    public int rankTotal;
    @JSONField(name = "show")
    public boolean show;
    @JSONField(name = "start")
    public long start;

    /* compiled from: BL */
    /* renamed from: com.bilibili.comm.charge.api.ChargeRankResult$1 */
    static class C21781 implements Creator<ChargeRankResult> {
        C21781() {
        }

        /* renamed from: a */
        public ChargeRankResult createFromParcel(Parcel parcel) {
            return new ChargeRankResult(parcel);
        }

        /* renamed from: a */
        public ChargeRankResult[] newArray(int i) {
            return new ChargeRankResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChargeRankResult{code=");
        stringBuilder.append(this.show);
        stringBuilder.append(", rankCount=");
        stringBuilder.append(this.rankCount);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.show?1:0));
        parcel.writeInt(this.rankCount);
        parcel.writeInt(this.rankTotal);
        parcel.writeTypedList(this.rankList);
        parcel.writeParcelable(this.mine, i);
    }

    protected ChargeRankResult(Parcel parcel) {
        boolean z = false;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.show = z;
        this.rankCount = parcel.readInt();
        this.rankTotal = parcel.readInt();
        this.rankList = new ArrayList();
        parcel.readTypedList(this.rankList, ChargeRankItem.CREATOR);
        this.mine = (ChargeRankItem) parcel.readParcelable(ChargeRankItem.class.getClassLoader());
    }
}
