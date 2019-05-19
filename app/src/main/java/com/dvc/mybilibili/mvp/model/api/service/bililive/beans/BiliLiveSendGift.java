package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveSendGift {
    @JSONField(name = "coin_type")
    public String mCoinType;
    @JSONField(name = "effect_block")
    public int mEffectBlock;
    @JSONField(name = "extra")
    public Extra mExtra;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "fulltext")
    public String mFullText;
    @JSONField(name = "gift_action")
    public String mGiftAction;
    @JSONField(name = "gift_effect")
    public GiftEffect mGiftEffect;
    @JSONField(name = "gift_id")
    public int mGiftId;
    @JSONField(name = "gift_name")
    public String mGiftName;
    @JSONField(name = "gift_num")
    public int mGiftNum;
    @JSONField(name = "gift_price")
    public int mGiftPrice;
    @JSONField(name = "gift_type")
    public int mGiftType;
    @JSONField(name = "guard_level")
    public int mGuardLevel;
    @JSONField(name = "metadata")
    public String mMetaData;
    @JSONField(name = "rnd")
    public String mRandomNum;
    @JSONField(name = "rcost")
    public long mRcost;
    @JSONField(name = "ruid")
    public long mReceiverUserId;
    @JSONField(name = "tag_image")
    public String mTagImage;
    @JSONField(name = "tid")
    public String mTid;
    @JSONField(name = "total_coin")
    public long mTotalCoin;
    @JSONField(name = "uid")
    public long mUserId;
    @JSONField(name = "uname")
    public String mUserName;

    @Keep
    /* compiled from: BL */
    public static class Extra {
        @JSONField(name = "capsule")
        public Capsule mCapsule;
        @JSONField(name = "event")
        public Event mEvent;
        @JSONField(name = "follow")
        public Follow mFollow;
        @JSONField(name = "gift_bag")
        public GiftBag mGiftBag;
        @JSONField(name = "medal")
        public Medal mMedal;
        @JSONField(name = "pk")
        public PkTip mPkTip;
        @JSONField(name = "title")
        public Title mTitle;
        @JSONField(name = "top_list")
        public List<TopListItem> mTopList;
        @JSONField(name = "wallet")
        public Wallet mWallet;

        @Keep
        /* compiled from: BL */
        public static class Capsule {
            @JSONField(name = "colorful")
            public CapsuleItem mColorFul;
            @JSONField(name = "normal")
            public CapsuleItem mNormal;

            @Keep
            /* compiled from: BL */
            public static class CapsuleItem {
                @JSONField(name = "change")
                public long change;
                @JSONField(name = "coin")
                public long coin;
                @JSONField(name = "progress")
                public Progress mProgress;

                @Keep
                /* compiled from: BL */
                public static class Progress {
                    @JSONField(name = "max")
                    public long mMax;
                    @JSONField(name = "now")
                    public long mNow;
                }
            }
        }

        @Keep
        /* compiled from: BL */
        public static class Event {
            @JSONField(name = "event_score")
            public long mEventScore;
        }

        @Keep
        /* compiled from: BL */
        public static class Follow {
            @JSONField(name = "add_follow")
            public int mAddFollow;
        }

        @Keep
        /* compiled from: BL */
        public static class GiftBag {
            @JSONField(name = "bag_id")
            public long mBagId;
            @JSONField(name = "gift_num")
            public int mGiftNum;
        }

        @Keep
        /* compiled from: BL */
        public static class Medal {
            @JSONField(name = "level")
            public int mLevel;
            @JSONField(name = "medal_id")
            public long mMedalId;
            @JSONField(name = "medal_name")
            public String mMedalName;
            @JSONField(name = "new")
            public int mNew;
        }

        @Keep
        /* compiled from: BL */
        public static class PkTip {
            @JSONField(name = "pk_gift_tips")
            public String pkGiftTips;
        }

        @Keep
        /* compiled from: BL */
        public static class TopListItem {
            @JSONField(name = "coin")
            public long mCoin;
            @JSONField(name = "face")
            public String mFace;
            @JSONField(name = "guard_level")
            public int mGuardLevel;
            @JSONField(name = "uname")
            public String mUserName;
            @JSONField(name = "uid")
            public long uid;
        }

        @Keep
        /* compiled from: BL */
        public static class Wallet {
            @JSONField(name = "gold")
            public long mGold;
            @JSONField(name = "silver")
            public long mSilver;
        }

        @Keep
        /* compiled from: BL */
        public static class Title {
        }
    }

    @Keep
    /* compiled from: BL */
    public static class GiftEffect {
        @JSONField(name = "beat_storm")
        public BeatStorm mBeatStorm;
        @JSONField(name = "broadcast_msg_list")
        public List<String> mBroadcastMsgList;
        @JSONField(name = "small_tv_list")
        public List<SmallTV> mSmallTvList;
        @JSONField(name = "storm_beat_id")
        public int mStormBeatId;
        @JSONField(name = "super")
        public int mSuper;
        @JSONField(name = "super_gift_num")
        public int mSuperGiftNum;

        @Keep
        /* compiled from: BL */
        public static class BeatStorm {
            @JSONField(name = "hasJoin")
            public int hasJoin;
            @JSONField(name = "id")
            /* renamed from: id */
            public long f6003id;
            @JSONField(name = "action")
            public String mAction;
            @JSONField(name = "content")
            public String mContent;
            @JSONField(name = "gift_id")
            public long mGiftId;
            @JSONField(name = "num")
            public int num;
            @JSONField(name = "time")
            public long time;
        }

        @Keep
        /* compiled from: BL */
        public static class SmallTV {
            @JSONField(name = "cmd")
            public String mCmd;
            @JSONField(name = "msg")
            public String mMsg;
            @JSONField(name = "rnd")
            public long mRandomNum;
            @JSONField(name = "real_roomid")
            public long mRealRoomId;
            @JSONField(name = "rep")
            public int mRep;
            @JSONField(name = "roomid")
            public long mRoomId;
            @JSONField(name = "styleType")
            public int mStyleType;
            @JSONField(name = "tv_id")
            public long mTvId;
            @JSONField(name = "url")
            public String mUrl;
        }
    }

    public String toString() {
        return "";
    }

    public long getGoldBalance() {
        return (this.mExtra == null || this.mExtra.mWallet == null) ? 0 : this.mExtra.mWallet.mGold;
    }

    public long getSilverBalance() {
        return (this.mExtra == null || this.mExtra.mWallet == null) ? 0 : this.mExtra.mWallet.mSilver;
    }

    public boolean isFreeActivityGift() {
        return this.mGiftType == 3;
    }

    public Extra.Medal getMedal() {
        return this.mExtra != null ? this.mExtra.mMedal : null;
    }

    public boolean isBkela() {
        return this.mGiftId == 3;
    }
}
