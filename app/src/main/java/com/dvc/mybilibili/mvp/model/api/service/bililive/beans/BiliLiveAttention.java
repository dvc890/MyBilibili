package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveAttention {
    public static int DEFAULT_FILTER_RULE = 0;
    public static int DEFAULT_SORT_RULE = 0;
    public static final int NORMAL = 0;
    public static final int TESTA = 1;
    public static final int TESTB = 2;
    @JSONField(name = "big_card_type")
    public int attentionTest;
    @Nullable
    @JSONField(name = "rooms")
    public List<LiveAttention> attentions;
    @JSONField(name = "total_count")
    public int count;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: BL */
    public @interface AttentionTest {
    }

    @NonNull
    public int getAttentionTestType() {
        return (this.attentionTest == 0 || this.attentionTest == 1 || this.attentionTest == 2) ? this.attentionTest : 0;
    }
}
