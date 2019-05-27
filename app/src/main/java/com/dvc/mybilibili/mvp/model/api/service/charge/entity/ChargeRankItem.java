package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipUserInfo;

@Keep
/* compiled from: BL */
public class ChargeRankItem implements Parcelable {
    public static final Creator<ChargeRankItem> CREATOR = new C21771();
    public static final int TREND_DOWN = 2;
    public static final int TREND_EQUAL = 0;
    public static final int TREND_UP = 1;
    @Nullable
    @JSONField(name = "avatar")
    public String avatar;
    @JSONField(name = "elec_num")
    public int elecNum;
    @Nullable
    @JSONField(name = "message")
    public String message;
    @JSONField(name = "mid")
    public long mid;
    @Nullable
    @JSONField(name = "uname")
    public String name;
    @JSONField(name = "pay_mid")
    public long payMid;
    @JSONField(name = "rank")
    public int rankOrder;
    @Nullable
    @JSONField(name = "reply_mid")
    public String replyMid;
    @Nullable
    @JSONField(name = "reply_msg")
    public String replyMsg;
    @Nullable
    @JSONField(name = "reply_name")
    public String replyName;
    @JSONField(name = "trend_type")
    public int trend;
    @Nullable
    @JSONField(name = "vip_info")
    public VipUserInfo vipInfo;

    /* compiled from: BL */
    /* renamed from: com.bilibili.comm.charge.api.ChargeRankItem$1 */
    static class C21771 implements Creator<ChargeRankItem> {
        C21771() {
        }

        /* renamed from: a */
        public ChargeRankItem createFromParcel(Parcel parcel) {
            return new ChargeRankItem(parcel);
        }

        /* renamed from: a */
        public ChargeRankItem[] newArray(int i) {
            return new ChargeRankItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mid);
        parcel.writeLong(this.payMid);
        parcel.writeInt(this.rankOrder);
        parcel.writeString(this.name);
        parcel.writeString(this.replyMid);
        parcel.writeString(this.replyName);
        parcel.writeString(this.replyMsg);
        parcel.writeString(this.avatar);
        parcel.writeParcelable(this.vipInfo, 0);
    }

    protected ChargeRankItem(Parcel parcel) {
        this.mid = parcel.readLong();
        this.payMid = parcel.readLong();
        this.rankOrder = parcel.readInt();
        this.name = parcel.readString();
        this.replyMid = parcel.readString();
        this.replyName = parcel.readString();
        this.replyMsg = parcel.readString();
        this.avatar = parcel.readString();
        this.vipInfo = (VipUserInfo) parcel.readParcelable(VipUserInfo.class.getClassLoader());
    }
}
