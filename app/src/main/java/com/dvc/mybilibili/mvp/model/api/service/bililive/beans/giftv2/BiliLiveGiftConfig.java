package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveGiftConfig implements Parcelable {
    public static final Creator<BiliLiveGiftConfig> CREATOR = new C20591();
    public static final int DANMU_DRAWABLE = 1;
    public static final int HAS_GUARD = 1;
    public static final int SVGA_ANIMATION = 2;
    public boolean isSelected;
    @JSONField(name = "broadcast")
    public int mBroadcast;
    @JSONField(name = "bullet_head")
    public String mBulletHead;
    @JSONField(name = "bullet_tail")
    public String mBulletTail;
    @JSONField(name = "coin_type")
    public String mCoinType;
    @JSONField(name = "corner_background")
    public String mCornerBackground;
    public String mCornerColor;
    @JSONField(name = "corner_mark")
    public String mCornerMark;
    public int mCornerPosition;
    @JSONField(name = "count_map")
    public List<NumSelect> mCountMap;
    @JSONField(name = "desc")
    public String mDesc;
    public int mDiscountBeforePrice;
    public String mDiscountCornerMark;
    @JSONField(name = "draw")
    public int mDraw;
    @JSONField(name = "effect")
    public int mEffect;
    @JSONField(name = "frame_animation")
    public String mFrameAnimation;
    @JSONField(name = "full_sc_horizontal")
    public String mFullScHorizontal;
    @JSONField(name = "full_sc_vertical")
    public String mFullScVertical;
    @JSONField(name = "full_sc_web")
    public String mFullScWeb;
    @JSONField(name = "gif")
    public String mGif;
    @JSONField(name = "gift_type")
    public int mGiftType;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "img_basic")
    public String mImgBasic;
    @JSONField(name = "img_dynamic")
    public String mImgDynamic;
    @JSONField(name = "name")
    public String mName;
    public int mPlanId;
    public int mPosition;
    @JSONField(name = "price")
    public int mPrice;
    @JSONField(name = "privilege_required")
    public int mPrivilege;
    @JSONField(name = "stay_time")
    public int mStayTime;
    @JSONField(name = "full_sc_horizontal_svga")
    public String mSvgaLand;
    @JSONField(name = "full_sc_vertical_svga")
    public String mSvgaVertical;
    @JSONField(name = "type")
    public int mType;
    @JSONField(name = "webp")
    public String mWebp;

    public BiliLiveGiftConfig() {
    }

    @Keep
    /* compiled from: BL */
    public static class NumSelect implements Parcelable {
        public static final Creator<NumSelect> CREATOR = new C20581();
        @JSONField(name = "num")
        public String mNum;
        @JSONField(name = "text")
        public String mText;

        public NumSelect() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.giftv2.BiliLiveGiftConfig$NumSelect$1 */
        static class C20581 implements Creator<NumSelect> {
            C20581() {
            }

            public NumSelect createFromParcel(Parcel parcel) {
                return new NumSelect(parcel);
            }

            public NumSelect[] newArray(int i) {
                return new NumSelect[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public NumSelect(String str, String str2) {
            this.mNum = str;
            this.mText = str2;
        }

        protected NumSelect(Parcel parcel) {
            this.mNum = parcel.readString();
            this.mText = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mNum);
            parcel.writeString(this.mText);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.giftv2.BiliLiveGiftConfig$1 */
    static class C20591 implements Creator<BiliLiveGiftConfig> {
        C20591() {
        }

        public BiliLiveGiftConfig createFromParcel(Parcel parcel) {
            return new BiliLiveGiftConfig(parcel);
        }

        public BiliLiveGiftConfig[] newArray(int i) {
            return new BiliLiveGiftConfig[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected BiliLiveGiftConfig(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mName = parcel.readString();
        this.mPrice = parcel.readInt();
        this.mType = parcel.readInt();
        this.mEffect = parcel.readInt();
        this.mCornerMark = parcel.readString();
        this.mCornerBackground = parcel.readString();
        this.mBroadcast = parcel.readInt();
        this.mDraw = parcel.readInt();
        this.mStayTime = parcel.readInt();
        this.mDesc = parcel.readString();
        this.mImgBasic = parcel.readString();
        this.mImgDynamic = parcel.readString();
        this.mFrameAnimation = parcel.readString();
        this.mGif = parcel.readString();
        this.mWebp = parcel.readString();
        this.mFullScWeb = parcel.readString();
        this.mFullScHorizontal = parcel.readString();
        this.mFullScVertical = parcel.readString();
        this.mBulletHead = parcel.readString();
        this.mBulletTail = parcel.readString();
        this.mCoinType = parcel.readString();
        this.mSvgaVertical = parcel.readString();
        this.mSvgaLand = parcel.readString();
        this.mCountMap = parcel.createTypedArrayList(NumSelect.CREATOR);
        this.mPrivilege = parcel.readInt();
        this.mDiscountBeforePrice = parcel.readInt();
        this.mCornerPosition = parcel.readInt();
        this.mDiscountCornerMark = parcel.readString();
        this.mCornerColor = parcel.readString();
        this.isSelected = parcel.readByte() != (byte) 0;
        this.mPlanId = parcel.readInt();
        this.mPosition = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mPrice);
        parcel.writeInt(this.mType);
        parcel.writeInt(this.mEffect);
        parcel.writeString(this.mCornerMark);
        parcel.writeString(this.mCornerBackground);
        parcel.writeInt(this.mBroadcast);
        parcel.writeInt(this.mDraw);
        parcel.writeInt(this.mStayTime);
        parcel.writeString(this.mDesc);
        parcel.writeString(this.mImgBasic);
        parcel.writeString(this.mImgDynamic);
        parcel.writeString(this.mFrameAnimation);
        parcel.writeString(this.mGif);
        parcel.writeString(this.mWebp);
        parcel.writeString(this.mFullScWeb);
        parcel.writeString(this.mFullScHorizontal);
        parcel.writeString(this.mFullScVertical);
        parcel.writeString(this.mBulletHead);
        parcel.writeString(this.mBulletTail);
        parcel.writeString(this.mCoinType);
        parcel.writeString(this.mSvgaVertical);
        parcel.writeString(this.mSvgaLand);
        parcel.writeTypedList(this.mCountMap);
        parcel.writeInt(this.mPrivilege);
        parcel.writeInt(this.mDiscountBeforePrice);
        parcel.writeInt(this.mCornerPosition);
        parcel.writeString(this.mDiscountCornerMark);
        parcel.writeString(this.mCornerColor);
        parcel.writeByte((byte) (this.isSelected?1:0));
        parcel.writeInt(this.mPlanId);
        parcel.writeInt(this.mPosition);
    }

    public boolean isSpecialGift() {
        return this.mDraw == 2;
    }

    public boolean isBKeLa() {
        return this.mId == 3;
    }

    public boolean isLuckyGift() {
        return this.mGiftType == 1;
    }
}
