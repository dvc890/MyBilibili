package com.dvc.mybilibili.app.utils;

import android.content.Context;

import com.dvc.mybilibili.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatUtils {

    public static final long MAX_INTERVAL = 86400000;
    private static long f66352a;
    private static long f66353b;
    private static ThreadLocal<SimpleDateFormat> f66354c = new ThreadLocal<SimpleDateFormat>(){
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("M-d", Locale.getDefault());
        }
    };
    private static ThreadLocal<SimpleDateFormat> f66355d = new ThreadLocal<SimpleDateFormat>(){
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-M-d", Locale.getDefault());
        }
    };
    public static String getTimeStr(Context context, long j) {
        j *= 1000;
        long j2 = System.currentTimeMillis();
        long j3 = j2 - j;
        if (j3 < 60000) {
            return context.getString(R.string.date_relative_now_fmt);
        }
        if (j3 < 3600000) {
            return context.getString(R.string.time_format_mins, new Object[]{Long.valueOf(j3 / 60000)});
        } else if (j3 < MAX_INTERVAL) {
            return context.getString(R.string.time_format_hour, new Object[]{Long.valueOf(j3 / 3600000)});
        } else {
            if (f66352a <= 0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j2);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                f66352a = instance.getTimeInMillis() - MAX_INTERVAL;
            }
            if (j >= f66352a) {
                return context.getString(R.string.yesterday);
            }
            if (f66353b <= 0) {
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(j2);
                int i = instance2.get(1);
                instance2.clear();
                instance2.set(1, i);
                f66353b = instance2.getTimeInMillis();
            }
            if (j >= f66353b) {
                return ((SimpleDateFormat) f66354c.get()).format(new Date(j));
            }
            return ((SimpleDateFormat) f66355d.get()).format(new Date(j));
        }
    }
}
