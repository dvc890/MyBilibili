package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.content.Context;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.R;

@Keep
/* compiled from: BL */
public class BiliLiveActivityGift extends BiliLiveBaseGift {
    @JSONField(name = "bag_id")
    public int mBagId;
    @JSONField(name = "combo_num")
    public int mComboNum;
    @JSONField(name = "count_set")
    public String mCountSet;
    @JSONField(name = "num")
    public int mNum;
    @JSONField(name = "super_num")
    public int mSuperNum;

    public String getDisplayNumber(Context context) {
        if (this.mNum <= 0) {
            return context.getString(R.string.live_zero_gift);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("x");
        stringBuilder.append(this.mNum);
        return stringBuilder.toString();
    }
}
