package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.feed.FeedItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.Args;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.DislikeReason;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.ThreePointItem;

import java.util.List;

@Keep
/* compiled from: BL */
public class BasicIndexItem extends FeedItem {
    @JSONField(name = "ad_index")
    public long adIndex;
    @Nullable
    @JSONField(name = "ad_info")
    public AdInfo adInfo;
    @Nullable
    @JSONField(name = "ad_cb")
    public String ad_cb;
    @Nullable
    @JSONField(name = "args")
    public Args args;
    @Nullable
    @JSONField(name = "card_goto")
    public String cardGoto;
    public int cardGotoType;
    @JSONField(name = "card_index")
    public long cardIndex = -1;
    @Nullable
    @JSONField(name = "card_type")
    public String cardType;
    @JSONField(deserialize = false, serialize = false)
    public transient int channelId;
    @Nullable
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(name = "cm_mark")
    public long cmMark;
    @Nullable
    @JSONField(name = "cover")
    public String cover;
    @JSONField(deserialize = false, serialize = false)
    public transient int createType = 0;
    @JSONField(name = "creative_id")
    public long creativeId;
    @JSONField(deserialize = false, serialize = false)
    public transient long dislikeTimestamp;
    @Nullable
    @JSONField(name = "from_type")
    public String fromType;
    @Nullable
    @JSONField(name = "goto")
    public String goTo;
    public int gotoType;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f8829id;
    @JSONField(name = "idx")
    public int idx;
    @Nullable
    @JSONField(name = "client_ip")
    /* renamed from: ip */
    public String ip;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public transient JSONObject jsonObj;
    @Nullable
    @JSONField(name = "param")
    public String param;
    @Nullable
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(deserialize = false, serialize = false)
    public transient DislikeReason selectedDislikeReason;
    @JSONField(deserialize = false, serialize = false)
    public transient int selectedDislikeType = -1;
    @JSONField(deserialize = false, serialize = false)
    public transient DislikeReason selectedFeedbackReason;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @Nullable
    @JSONField(name = "show_url")
    public String showUrl;
    @JSONField(name = "show_bottom")
    public int show_bottom;
    @JSONField(name = "show_top")
    public int show_top;
    @Nullable
    @JSONField(name = "square")
    public String squareCover;
    @JSONField(name = "src_id")
    public long srcId;
    @Nullable
    public String state;
    @Nullable
    @JSONField(name = "subtitle")
    public String subtitle;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public transient BasicIndexItem superItem;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public transient String tabId;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public transient String tabName;
    @Nullable
    @JSONField(name = "three_point_v2")
    public List<ThreePointItem> threePoint;
    @Nullable
    @JSONField(name = "title")
    public String title;
    @Nullable
    @JSONField(name = "uri")
    public String uri;
    @JSONField(deserialize = false, serialize = false)
    public transient boolean validateData = true;
    @Nullable
    @JSONField(name = "view_type")
    public String viewTypeString;

    public boolean isADCard() {
        if (TextUtils.isEmpty(this.cardType)) {
            return false;
        }
        String str = this.cardType;
        int obj = -1;
        switch (str.hashCode()) {
            case 94770800:
                if (str.equals("cm_v1")) {
                    obj = 1;
                    break;
                }
                break;
            case 94770801:
                if (str.equals("cm_v2")) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public void setOperationTabInfo(String str, String str2) {
        this.tabId = str;
        this.tabName = str2;
    }

    @Nullable
    public JSONObject getJsonObj(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getJSONObject(str);
    }

    @Nullable
    public JSONArray getJsonArray(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getJSONArray(str);
    }

    @Nullable
    public String getStringValue(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getString(str);
    }

    @Nullable
    public Integer getInteger(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getInteger(str);
    }

    public int getIntValue(String str) {
        if (this.jsonObj == null) {
            return 0;
        }
        return this.jsonObj.getIntValue(str);
    }

    @Nullable
    public Long getLong(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getLong(str);
    }

    public long getLongValue(String str) {
        if (this.jsonObj == null) {
            return 0;
        }
        return this.jsonObj.getLongValue(str);
    }

    @Nullable
    public Boolean getBoolean(String str) {
        if (this.jsonObj == null) {
            return null;
        }
        return this.jsonObj.getBoolean(str);
    }

    public boolean getBooleanValue(String str) {
        return this.jsonObj != null && this.jsonObj.getBooleanValue(str);
    }
}
