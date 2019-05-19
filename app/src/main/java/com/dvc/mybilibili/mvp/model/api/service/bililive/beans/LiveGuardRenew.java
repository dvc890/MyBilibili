package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.content.Context;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class LiveGuardRenew {
    @JSONField(name = "price_info")
    public List<Price> mPriceList;
    @JSONField(name = "page_info")
    public PageInfo pageInfo;
    @JSONField(name = "pic_info")
    public List<PicInfo> picInfos;
    @JSONField(name = "list")
    public List<RenewSummary> renewSummaries;

    @Keep
    /* compiled from: BL */
    public static class PageInfo {
        @JSONField(name = "now")
        public int now;
        @JSONField(name = "num")
        public int num;
        @JSONField(name = "page")
        public int page;

        public boolean hasMore() {
            return this.now < this.page;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PicInfo {
        @JSONField(name = "privilege_type")
        public int guardLevel;
        @JSONField(name = "pic_url")
        public String picUrl;
    }

    @Keep
    /* compiled from: BL */
    public static class Price {
        @JSONField(name = "discount_price")
        public long mDiscountPrice;
        @JSONField(name = "guard_level")
        public int mGuardLevel;
        @JSONField(name = "price")
        public long mPrice;
    }

    @Keep
    /* compiled from: BL */
    public static class RenewEntity {
        public static final int ACTIVE_STATUS_ACTIVE = 1;
        public static final int ACTIVE_STATUS_EXPIRED = 5;
        public static final int ACTIVE_STATUS_FROZEN = 3;
        @JSONField(name = "active")
        public int activeStatus;
        @JSONField(name = "target_id")
        public long anchorId;
        @JSONField(name = "expired_time")
        public String expiredTime;
        @JSONField(name = "privilege_type")
        public int guardLevel;
        @JSONField(name = "hint_msg")
        public String mHintMessage;
        @JSONField(name = "uid")
        public long userId;

        public boolean shouldDisplayDiscountPrice() {
            return this.activeStatus == 1 || this.activeStatus == 3;
        }

        public boolean isStatusExpired() {
            return this.activeStatus == 5;
        }

        public static String getGuardTitle(Context context, int i) {
            if (context == null) {
                return "";
            }
            switch (i) {
                case 1:
                    return context.getString(2131759558);
                case 2:
                    return context.getString(2131759559);
                case 3:
                    return context.getString(2131759560);
                default:
                    return "";
            }
        }
    }

    @Keep
    /* compiled from: BL */
    public static class RenewSummary {
        @JSONField(name = "target_id")
        public long anchorId;
        @JSONField(name = "uname")
        public String anchorNickName;
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "notice_status")
        public int notice_status;
        @JSONField(name = "guards")
        public List<RenewEntity> renewEntities;
        @JSONField(name = "roomid")
        public long roomId;
        public boolean switcherEnable = true;

        public boolean isEnterNoticeOpen() {
            return this.notice_status > 0;
        }

        public boolean isAllEntitiesExpired() {
            if (this.renewEntities != null && this.renewEntities.size() > 0) {
                for (RenewEntity isStatusExpired : this.renewEntities) {
                    if (!isStatusExpired.isStatusExpired()) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
