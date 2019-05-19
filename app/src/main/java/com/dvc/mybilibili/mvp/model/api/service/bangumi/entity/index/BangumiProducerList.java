package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.index;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiProducerList {
    public List<BangumiIndexSeason> modules;
    public List<Producer> producers;

    @Keep
    /* compiled from: BL */
    public static class Producer {
        @JSONField(deserialize = false, serialize = false)
        public boolean isSelected;
        public String logo;
        @JSONField(name = "media_type")
        public String mediaType;
        @JSONField(name = "producer_id")
        public String producerId;
    }
}
