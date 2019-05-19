//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
//import android.support.annotation.Keep;
//import android.support.annotation.Nullable;
//
//import com.alibaba.fastjson.annotation.JSONField;
//import com.dvc.mybilibili.mvp.model.api.service.net.beans.gateway.lotteryinfo.LiveRoomLotteryInfo.Storm;
//
//import p004b.hdh;
//
//@Keep
///* compiled from: BL */
//public class BiliLiveRoomSpecialGift {
//    @JSONField(name = "gift39")
//    public Gift39 mGift39;
//    @Nullable
//    @JSONField(name = "39")
//    public Gift39 mNewGift39;
//    @JSONField(name = "status")
//    public int mStatus;
//
//    @Keep
//    /* compiled from: BL */
//    public static class Gift39 {
//        @JSONField(name = "action")
//        public String mAction;
//        @JSONField(name = "content")
//        public String mContent;
//        @JSONField(name = "time")
//        public int mCountDownTime;
//        @JSONField(name = "hadJoin")
//        public boolean mHadJoin;
//        @JSONField(name = "id")
//        public String mId;
//        @JSONField(name = "num")
//        public int mNumber;
//        @JSONField(name = "storm_gif")
//        public String mStormGif;
//
//        public long parseId() {
//            try {
//                return Long.parseLong(this.mId != null ? this.mId : "0");
//            } catch (Exception e) {
//                hdh.m128857b("Gift39", e, new BiliLiveRoomSpecialGift$Gift39$$Lambda$0(this));
//                return 0;
//            }
//        }
//
//        /* Access modifiers changed, original: final|synthetic */
//        public final /* synthetic */ String lambda$parseId$0$BiliLiveRoomSpecialGift$Gift39() {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("parseId error, id:");
//            stringBuilder.append(this.mId);
//            return stringBuilder.toString();
//        }
//    }
//
//    public Storm transform() {
//        Storm storm = new Storm();
//        if (this.mNewGift39 != null) {
//            storm.f6010id = this.mNewGift39.parseId();
//            storm.balanceTime = this.mNewGift39.mCountDownTime;
//            storm.stormGifUrl = this.mNewGift39.mStormGif;
//        }
//        return storm;
//    }
//}
