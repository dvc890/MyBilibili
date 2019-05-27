package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.OfficialVerify;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipExtraUserInfo;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.OwnerExt */
public class OwnerExt implements Parcelable {
    public static final Creator<OwnerExt> CREATOR = new C24751();
    @JSONField(name = "assists")
    public ArrayList<Long> assistsExt;
    @JSONField(name = "fans")
    public long fans;
    @JSONField(name = "live")
    public LiveExt liveExt;
    @JSONField(name = "official_verify")
    public OfficialVerify officialVerify;
    @JSONField(name = "round")
    public LiveExt roundLiveExt;
    @JSONField(name = "vip")
    public VipExtraUserInfo vipInfo;

    public OwnerExt() {
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.OwnerExt$1 */
    static class C24751 implements Creator<OwnerExt> {
        C24751() {
        }

        /* renamed from: a */
        public OwnerExt createFromParcel(Parcel parcel) {
            return new OwnerExt(parcel);
        }

        /* renamed from: a */
        public OwnerExt[] newArray(int i) {
            return new OwnerExt[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean hasLive() {
        return this.liveExt != null && this.liveExt.roomId > 0 && this.liveExt.mid > 0;
    }

    public boolean hasRoundLive() {
        return this.roundLiveExt != null && this.roundLiveExt.mid > 0 && this.roundLiveExt.roomId > 0 && this.liveExt == null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.officialVerify, i);
        parcel.writeParcelable(this.liveExt, i);
        parcel.writeParcelable(this.vipInfo, i);
        parcel.writeLong(this.fans);
        parcel.writeSerializable(this.assistsExt);
    }

    protected OwnerExt(Parcel parcel) {
        this.officialVerify = (OfficialVerify) parcel.readParcelable(OfficialVerify.class.getClassLoader());
        this.liveExt = (LiveExt) parcel.readParcelable(LiveExt.class.getClassLoader());
        this.vipInfo = (VipExtraUserInfo) parcel.readParcelable(VipExtraUserInfo.class.getClassLoader());
        this.fans = parcel.readLong();
        this.assistsExt = (ArrayList) parcel.readSerializable();
    }
}
