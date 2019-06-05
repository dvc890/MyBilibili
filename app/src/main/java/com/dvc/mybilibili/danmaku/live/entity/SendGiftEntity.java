package com.dvc.mybilibili.danmaku.live.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

public class SendGiftEntity {
    public String giftName;
    public int num;
    public String uname;
    public String face;
    public int guard_level;
    public long rcost;
    public long uid;
    /**
     * The 'top_list' can be a JSONArray or Boolean.
     */
    //top_list 可能是 JSONArray 也可能是 布尔类型, 为 JSONArray 时内部元素不明
    public Object top_list;
    /**
     * Get Unix timestamp, it is not Java timestamp!
     */
    public Long timestamp;  //Unix时间戳
    public int giftId;
    public int giftType;
    public String action;
    /**
     * The key of this field in JSON is 'super'. This word conflict with Java keyword, use superI instead.
     */
    //json中是super, 与java关键字冲突
    @JSONField(name = "super")
    public int superI;
    public int super_gift_num;
    public int price;
    public String rnd;
    public int newMedal;
    public int newTitle;
    /**
     * The 'medal' can be a Integer or a JSONObject.
     * <p>When it is a JSONObject, It contains data below:
     * <pre>
     *  "medal": {
     *      "medalId": 10,
     *      "medalName": "猛男",
     *      "level": 1
     *  }
     * </pre>
     * Get data manual:
     * <pre>
     *     JSONObject medal = (JSONObject)sendGiftEntityData.data.medal;
     *     Integer medalId = medal.getInteger("medalId");
     *     String medalName = medal.getString("medalName");
     *     Integer level = medal.getInteger("level");
     * </pre>
     */
    //medal 可能是数字也可能是 JSONObject. 为 JSONObject 时, 包含三个字段 medalId(Integer), medalName(String), level(Integer)
    public Object medal;
    public String title;
    public String beatId;
    public String biz_source;
    public String metadata;
    public int remain;
    public int gold;
    public int silver;
    public int eventScore;
    public int eventNum;
    public Object smalltv_msg;
    public Object specialGift;
    public JSONArray notice_msg;
    public SendGiftEntityDataCapsule capsule;
    public int addFollow;
    public int effect_block;
    public String coin_type;
    public int total_coin;
    public int effect;
    public String tag_image;
    public int user_count;

    public class SendGiftEntityDataCapsule {
        public SendGiftEntityDataCapsuleColor normal;
        public SendGiftEntityDataCapsuleColor colorful;

        public class SendGiftEntityDataCapsuleColor {
            public Integer coin;
            public Integer change;
            public SendGiftEntityDataCapsuleColorfulProgress progress;

            public class SendGiftEntityDataCapsuleColorfulProgress {
                public Integer now;
                public Integer max;
            }
        }
    }
}
