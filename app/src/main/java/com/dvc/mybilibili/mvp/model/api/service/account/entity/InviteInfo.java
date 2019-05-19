package com.dvc.mybilibili.mvp.model.api.service.account.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class InviteInfo implements Parcelable {
    public static final Creator<InviteInfo> CREATOR = new C22001();
    private boolean display;
    private int invite_remind;

    /* compiled from: BL */
    /* renamed from: com.bilibili.lib.account.model.InviteInfo$1 */
    static class C22001 implements Creator<InviteInfo> {
        C22001() {
        }

        /* renamed from: a */
        public InviteInfo createFromParcel(Parcel parcel) {
            return new InviteInfo(parcel);
        }

        /* renamed from: a */
        public InviteInfo[] newArray(int i) {
            return new InviteInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @JSONField(name = "invite_remind")
    public int getInvite_remind() {
        return this.invite_remind;
    }

    @JSONField(name = "invite_remind")
    public void setInvite_remind(int i) {
        this.invite_remind = i;
    }

    @JSONField(name = "display")
    public boolean isDisplay() {
        return this.display;
    }

    @JSONField(name = "display")
    public void setDisplay(boolean z) {
        this.display = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.invite_remind);
        parcel.writeByte((byte) (this.display?1:0));
    }

    protected InviteInfo(Parcel parcel) {
        this.invite_remind = parcel.readInt();
        this.display = parcel.readByte() != (byte) 0;
    }
}
