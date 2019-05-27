package com.dvc.mybilibili.mvp.model.api.service.charge.entity;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Iterator;

@Keep
/* compiled from: BL */
public class ChargeTheme {
    @Nullable
    @JSONField(name = "elec_figure")
    public String elcFigure;
    @Nullable
    @JSONField(name = "elec_slogan")
    public String elecSlogan;
    @Nullable
    @JSONField(name = "elec_success")
    public String elecSuccess;
    @JSONField(name = "elec_theme")
    public int elecTheme;
    @Nullable
    @JSONField(name = "elec_list")
    public ArrayList<ChargeElec> list;
    @JSONField(name = "round_mode")
    public int mExpRoundMode;
    @JSONField(name = "integrity_rate")
    public int mIntegrityRate;
    @JSONField(name = "rmb_rate")
    public float mRmbRate;

    public boolean showNetworkTheme() {
        return this.elecTheme == 1;
    }

    public static ChargeTheme transform(ChargeTheme chargeTheme) {
        if (chargeTheme.list != null && chargeTheme.list.size() > 0) {
            Iterator it = chargeTheme.list.iterator();
            while (it.hasNext()) {
                ChargeElec chargeElec = (ChargeElec) it.next();
                chargeElec.mRmbRate = chargeTheme.mRmbRate;
                chargeElec.mIntegrityRate = chargeTheme.mIntegrityRate;
                chargeElec.mExpRoundMode = chargeTheme.mExpRoundMode;
            }
        }
        return chargeTheme;
    }

    public static ChargeTheme getDefaultCharge() {
        ChargeTheme chargeTheme = new ChargeTheme();
        chargeTheme.mRmbRate = 10.0f;
        chargeTheme.mIntegrityRate = 10;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            ChargeElec chargeElec = new ChargeElec();
            switch (i) {
                case 0:
                    chargeElec.mTitle = "20\u7535\u6c60";
                    chargeElec.mNums = 20;
                    break;
                case 1:
                    chargeElec.mTitle = "66\u7535\u6c60";
                    chargeElec.mNums = 66;
                    break;
                case 2:
                    chargeElec.mTitle = "450\u7535\u6c60";
                    chargeElec.mNums = 450;
                    break;
                case 3:
                    chargeElec.mTitle = "888\u7535\u6c60";
                    chargeElec.mNums = 888;
                    break;
                case 4:
                    chargeElec.mTitle = "\u81ea\u5b9a\u4e49";
                    chargeElec.mNums = 0;
                    chargeElec.mIsCustomize = true;
                    chargeElec.mMaxNums = 99999;
                    chargeElec.mMinNums = 20;
                    break;
                default:
                    break;
            }
            arrayList.add(chargeElec);
        }
        chargeTheme.list = arrayList;
        return chargeTheme;
    }
}
