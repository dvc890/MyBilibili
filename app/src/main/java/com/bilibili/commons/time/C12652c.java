package com.bilibili.commons.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: BL */
/* renamed from: com.bilibili.commons.time.c */
abstract class C12652c<F extends Format> {
    /* renamed from: b */
    private static final ConcurrentMap<C12651a, String> f34416b = new ConcurrentHashMap(7);
    /* renamed from: a */
    private final ConcurrentMap<C12651a, F> f34417a = new ConcurrentHashMap(7);

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.c$a */
    private static class C12651a {
        /* renamed from: a */
        private final Object[] f34414a;
        /* renamed from: b */
        private int f34415b;

        public C12651a(Object... objArr) {
            this.f34414a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f34414a, ((C12651a) obj).f34414a);
        }

        public int hashCode() {
            if (this.f34415b == 0) {
                int i = 0;
                for (Object obj : this.f34414a) {
                    if (obj != null) {
                        i = (i * 7) + obj.hashCode();
                    }
                }
                this.f34415b = i;
            }
            return this.f34415b;
        }
    }

    /* renamed from: b */
    public abstract F mo43625b(String str, TimeZone timeZone, Locale locale);

    C12652c() {
    }

    /* renamed from: a */
    public F mo43671a() {
        return mo43672a(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    /* renamed from: c */
    public F mo43675c(String str, TimeZone timeZone, Locale locale) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C12651a c12651a = new C12651a(str, timeZone, locale);
        Format format = (Format) this.f34417a.get(c12651a);
        if (format != null) {
            return (F) format;
        }
        F b = mo43625b(str, timeZone, locale);
        F f = (F) this.f34417a.putIfAbsent(c12651a, b);
        return f != null ? f : b;
    }

    /* renamed from: a */
    private F m47072a(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return mo43675c(C12652c.m47071a(num, num2, locale), timeZone, locale);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: a */
    public F mo43672a(int i, int i2, TimeZone timeZone, Locale locale) {
        return m47072a(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: a */
    public F mo43673a(int i, TimeZone timeZone, Locale locale) {
        return m47072a(Integer.valueOf(i), null, timeZone, locale);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: b */
    public F mo43674b(int i, TimeZone timeZone, Locale locale) {
        return m47072a(null, Integer.valueOf(i), timeZone, locale);
    }

    /* renamed from: a */
    static String m47071a(Integer num, Integer num2, Locale locale) {
        C12651a c12651a = new C12651a(num, num2, locale);
        String str = (String) f34416b.get(c12651a);
        if (str != null) {
            return str;
        }
        DateFormat timeInstance;
        if (num == null) {
            try {
                timeInstance = DateFormat.getTimeInstance(num2.intValue(), locale);
            } catch (ClassCastException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No date time pattern for locale: ");
                stringBuilder.append(locale);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else if (num2 == null) {
            timeInstance = DateFormat.getDateInstance(num.intValue(), locale);
        } else {
            timeInstance = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
        }
        String toPattern = ((SimpleDateFormat) timeInstance).toPattern();
        String str2 = (String) f34416b.putIfAbsent(c12651a, toPattern);
        return str2 != null ? str2 : toPattern;
    }
}
