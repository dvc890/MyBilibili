package com.dvc.mybilibili.mvp.model.api.service.bililive.beans.giftv2;

import android.support.annotation.Keep;
import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveProp.CoinType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
/* compiled from: BL */
public class BiliLiveRoomGift {
    @JSONField(name = "list")
    public List<RoomGift> mList;
    @JSONField(name = "old_list")
    public List<OldList> mOldList;
    @JSONField(name = "show_count_map")
    public int mShowCountMap;
    @JSONField(name = "silver_list")
    public List<RoomGift> mSilverList;

    @Keep
    /* compiled from: BL */
    public static class OldList {
        public boolean isSelected;
        @JSONField(name = "coin_type")
        public CoinType mCoinType;
        @JSONField(name = "combo_num")
        public int mComboNum;
        private Map<String, String> mCountMap;
        @JSONField(name = "count_map")
        public JSONObject mCountMapObject;
        @JSONField(name = "count_set")
        public String mCountSet;
        @JSONField(name = "gift_url")
        public String mGiftUrl;
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "img")
        public String mImg;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "price")
        public int mPrice;
        @JSONField(name = "super_num")
        public int mSuperNum;
        @JSONField(name = "type")
        public int mType;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.giftv2.BiliLiveRoomGift$OldList$1 */
        class C20601 extends TypeReference<Map<String, String>> {
            C20601() {
            }
        }

        public Map<String, String> getCountMap() {
            if (this.mCountMap == null && this.mCountMapObject != null) {
                try {
                    this.mCountMap = (Map) JSON.parseObject(JSON.toJSONString(this.mCountMapObject), new C20601(), new Feature[0]);
                } catch (Exception unused) {
                    this.mCountMap = new HashMap();
                }
            }
            return this.mCountMap;
        }

        public boolean isSupportGold() {
            return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mGold)) ? false : true;
        }

        public boolean isSupportSilver() {
            return (this.mCoinType == null || TextUtils.isEmpty(this.mCoinType.mSilver)) ? false : true;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class RoomGift {
        public boolean isSelected;
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "plan_id")
        public int mPlanId;
        @JSONField(name = "position")
        public int mPosition;
    }
}
