package com.bilibili.commons.time;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: BL */
/* renamed from: com.bilibili.commons.time.a */
class C12649a {
    /* renamed from: a */
    private static final Method f34412a = C12649a.m47066a("isWeekDateSupported", new Class[0]);
    /* renamed from: b */
    private static final Method f34413b = C12649a.m47066a("getWeekYear", new Class[0]);

    /* renamed from: a */
    private static Method m47066a(String str, Class<?>... clsArr) {
        try {
            return Calendar.class.getMethod(str, clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m47067a(Calendar calendar) {
        try {
            boolean z = false;
            if (f34412a != null && ((Boolean) f34412a.invoke(calendar, new Object[0])).booleanValue()) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m47068b(Calendar calendar) {
        try {
            if (C12649a.m47067a(calendar)) {
                return ((Integer) f34413b.invoke(calendar, new Object[0])).intValue();
            }
            int i = calendar.get(1);
            if (f34412a == null && (calendar instanceof GregorianCalendar)) {
                int i2 = calendar.get(2);
                if (i2 != 0) {
                    if (i2 == 11 && calendar.get(3) == 1) {
                        i++;
                    }
                } else if (calendar.get(3) >= 52) {
                    i--;
                }
            }
            return i;
        } catch (Exception e) {
            return -1;
        }
    }
}
