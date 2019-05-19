package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collections;
import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiMineFollow extends BangumiApiPageResponse<List<BiliBangumiSeason>> {
    @JSONField(name = "vip_tip")
    public List<BangumiMineFollowNotice> notices = Collections.emptyList();

    @Keep
    /* compiled from: BL */
    public static class BangumiMineFollowNotice {
        @JSONField(name = "button_link")
        public String buttonLink = "";
        @JSONField(name = "button_name")
        public String buttonText = "";
        public String link = "";
        public String tip = "";
        public int version;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BangumiMineFollowNotice bangumiMineFollowNotice = (BangumiMineFollowNotice) obj;
            if (this.version != bangumiMineFollowNotice.version) {
                return false;
            }
            if (!(this.tip == null) ? this.tip.equals(bangumiMineFollowNotice.tip) : bangumiMineFollowNotice.tip == null) {
                return false;
            }
            if (!(this.link == null) ? this.link.equals(bangumiMineFollowNotice.link) : bangumiMineFollowNotice.link == null) {
                return false;
            }
            if (!(this.buttonText == null) ? this.buttonText.equals(bangumiMineFollowNotice.buttonText) : bangumiMineFollowNotice.buttonText == null) {
                return false;
            }
            if (this.buttonLink != null) {
                z = this.buttonLink.equals(bangumiMineFollowNotice.buttonLink);
            } else if (bangumiMineFollowNotice.buttonLink != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((this.version * 31) + (this.tip != null ? this.tip.hashCode() : 0)) * 31) + (this.link != null ? this.link.hashCode() : 0)) * 31) + (this.buttonText != null ? this.buttonText.hashCode() : 0)) * 31;
            if (this.buttonLink != null) {
                i = this.buttonLink.hashCode();
            }
            return hashCode + i;
        }
    }
}
