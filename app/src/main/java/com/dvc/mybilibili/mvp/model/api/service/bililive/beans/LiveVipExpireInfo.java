package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.content.Context;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Calendar;

@Keep
/* compiled from: BL */
public class LiveVipExpireInfo {
    private static final int DAYS_PER_MONTH = 30;
    private static final int MONTHS_PER_YEAR = 12;
    @JSONField(name = "vip_time")
    public long monthVipExpireTime;
    @JSONField(name = "svip_time")
    public long yearVipExpireTime;

    public String getExpireTimeOfMonthVip(Context context, int i) {
        Calendar instance = Calendar.getInstance();
        if (this.monthVipExpireTime > 0) {
            instance.setTimeInMillis(this.monthVipExpireTime * 1000);
        }
        instance.add(5, i * 30);
        if (i >= 12) {
            instance.add(5, (i / 12) * 5);
        }
        return getFormatExpireTime(context, instance);
    }

    public String getExpireTimeOfYearVip(Context context, int i) {
        Calendar instance = Calendar.getInstance();
        if (this.yearVipExpireTime > 0) {
            instance.setTimeInMillis(this.yearVipExpireTime * 1000);
        }
        instance.add(1, i);
        return getFormatExpireTime(context, instance);
    }

    private String getFormatExpireTime(Context context, Calendar calendar) {
        return context.getString(2131760206, new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))});
    }
}
