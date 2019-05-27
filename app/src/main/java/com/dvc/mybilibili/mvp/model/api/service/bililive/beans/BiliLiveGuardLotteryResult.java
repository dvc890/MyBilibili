package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveGuardLotteryResult implements Parcelable {
    public static final Creator<BiliLiveGuardLotteryResult> CREATOR = new C20101();
    public static final String INTIMACY = "intimacy";
    @JSONField(name = "award_id")
    public String mAwardId;
    @JSONField(name = "award_list")
    public List<AwardList> mAwardList;
    @JSONField(name = "award_type")
    public int mAwardType;
    @JSONField(name = "from")
    public String mFrom;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "message")
    public String mMessage;
    @JSONField(name = "privilege_type")
    public int mPrivilege;
    @JSONField(name = "time")
    public int mTime;
    @JSONField(name = "type")
    public String mType;

    public BiliLiveGuardLotteryResult() {
    }

    @Keep
    /* compiled from: BL */
    public static class AwardList implements Parcelable {
        public static final Creator<AwardList> CREATOR = new C20091();
        @JSONField(name = "img")
        public String mImg;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "type")
        public String mType;

        public AwardList() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardLotteryResult$AwardList$1 */
        static class C20091 implements Creator<AwardList> {
            C20091() {
            }

            public AwardList createFromParcel(Parcel parcel) {
                return new AwardList(parcel);
            }

            public AwardList[] newArray(int i) {
                return new AwardList[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected AwardList(Parcel parcel) {
            this.mName = parcel.readString();
            this.mImg = parcel.readString();
            this.mType = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeString(this.mImg);
            parcel.writeString(this.mType);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardLotteryResult$1 */
    static class C20101 implements Creator<BiliLiveGuardLotteryResult> {
        C20101() {
        }

        public BiliLiveGuardLotteryResult createFromParcel(Parcel parcel) {
            return new BiliLiveGuardLotteryResult(parcel);
        }

        public BiliLiveGuardLotteryResult[] newArray(int i) {
            return new BiliLiveGuardLotteryResult[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveGuardLotteryResult(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mType = parcel.readString();
        this.mAwardType = parcel.readInt();
        this.mTime = parcel.readInt();
        this.mPrivilege = parcel.readInt();
        this.mMessage = parcel.readString();
        this.mFrom = parcel.readString();
        this.mAwardList = parcel.createTypedArrayList(AwardList.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mType);
        parcel.writeInt(this.mAwardType);
        parcel.writeInt(this.mTime);
        parcel.writeInt(this.mPrivilege);
        parcel.writeString(this.mMessage);
        parcel.writeString(this.mFrom);
        parcel.writeTypedList(this.mAwardList);
    }
}
