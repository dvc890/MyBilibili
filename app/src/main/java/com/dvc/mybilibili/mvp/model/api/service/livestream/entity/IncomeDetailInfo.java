package com.dvc.mybilibili.mvp.model.api.service.livestream.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;

@Keep
/* compiled from: BL */
public class IncomeDetailInfo {
    @JSONField(name = "hamsters")
    public ArrayList<BiliLiveIncomeHamsters> mHamstersList;
    @JSONField(name = "months")
    public ArrayList<BiliLiveIncomeHamstersDetail> mHamstersMonthlyList;

    @Keep
    /* compiled from: BL */
    public static class BiliLiveIncomeHamsters {
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "md")
        /* renamed from: md */
        public String f5801md;
    }

    @Keep
    /* compiled from: BL */
    public static class BiliLiveIncomeHamstersDetail {
        @JSONField(name = "m")
        public String mMonth;
        @JSONField(name = "Ym")
        public String mMonthNumber;
    }
}
