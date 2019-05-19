package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2.BiliLiveGiftConfig.NumSelect;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLivePackage implements Parcelable {
    public static final int CARD_TYPE = 2;
    public static final Creator<BiliLivePackage> CREATOR = new C20141();
    public static final int GIFT_TYPE = 1;
    public boolean isSelected;
    @JSONField(name = "is_show_send")
    public boolean isShowSend;
    @JSONField(name = "card_gif")
    public String mCardGif;
    @JSONField(name = "card_id")
    public int mCardId;
    @JSONField(name = "card_image")
    public String mCardImage;
    @JSONField(name = "card_record_id")
    public int mCardRecordId;
    @JSONField(name = "corner_mark")
    public String mCornerMark;
    @Nullable
    @JSONField(name = "count_map")
    public List<NumSelect> mCountMap;
    @JSONField(name = "expire_at")
    public long mExpireTime;
    @JSONField(name = "gift_id")
    public int mGiftId;
    @JSONField(name = "gift_name")
    public String mGiftName;
    @JSONField(name = "gift_num")
    public int mGiftNum;
    @JSONField(name = "bag_id")
    public int mId;
    @JSONField(name = "type")
    public int mType;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLivePackage$1 */
    static class C20141 implements Creator<BiliLivePackage> {
        C20141() {
        }

        public BiliLivePackage createFromParcel(Parcel parcel) {
            return new BiliLivePackage(parcel);
        }

        public BiliLivePackage[] newArray(int i) {
            return new BiliLivePackage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLivePackage(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mGiftId = parcel.readInt();
        this.mGiftNum = parcel.readInt();
        this.mExpireTime = parcel.readLong();
        this.mGiftName = parcel.readString();
        this.mCountMap = parcel.createTypedArrayList(NumSelect.CREATOR);
        this.mCornerMark = parcel.readString();
        this.mCardImage = parcel.readString();
        this.mCardGif = parcel.readString();
        this.mType = parcel.readInt();
        this.mCardRecordId = parcel.readInt();
        this.mCardId = parcel.readInt();
        boolean z = false;
        this.isShowSend = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isSelected = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mGiftId);
        parcel.writeInt(this.mGiftNum);
        parcel.writeLong(this.mExpireTime);
        parcel.writeString(this.mGiftName);
        parcel.writeTypedList(this.mCountMap);
        parcel.writeString(this.mCornerMark);
        parcel.writeString(this.mCardImage);
        parcel.writeString(this.mCardGif);
        parcel.writeInt(this.mType);
        parcel.writeInt(this.mCardRecordId);
        parcel.writeInt(this.mCardId);
        parcel.writeByte((byte) (this.isShowSend?1:0));
        parcel.writeByte((byte) (this.isShowSend?1:0));
    }

    public void updateCountMap(int i) {
        if (this.mCountMap != null) {
            if (i == 1) {
                this.mCountMap.clear();
                this.mCountMap.add(new NumSelect("1", ""));
                return;
            }
            for (NumSelect numSelect : this.mCountMap) {
                if (/*RxAppTool.getString(R.string.live_tags_all)*/"全部".equals(numSelect.mText)) {
                    numSelect.mNum = String.valueOf(i);
                    break;
                }
            }
        }
    }

    public boolean isBKeLa() {
        return this.mGiftId == 3;
    }
}
