package com.bilibili.commons.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: BL */
public class FastDatePrinter implements Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    private static final int MAX_DIGITS = 10;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final ConcurrentMap<C12631i, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient C12630f[] mRules;
    private final TimeZone mTimeZone;

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$f */
    private interface C12630f {
        /* renamed from: a */
        int mo43647a();

        /* renamed from: a */
        void mo43648a(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$i */
    private static class C12631i {
        /* renamed from: a */
        private final TimeZone f34383a;
        /* renamed from: b */
        private final int f34384b;
        /* renamed from: c */
        private final Locale f34385c;

        C12631i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f34383a = timeZone;
            if (z) {
                this.f34384b = Integer.MIN_VALUE | i;
            } else {
                this.f34384b = i;
            }
            this.f34385c = locale;
        }

        public int hashCode() {
            return (((this.f34384b * 31) + this.f34385c.hashCode()) * 31) + this.f34383a.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12631i)) {
                return false;
            }
            C12631i c12631i = (C12631i) obj;
            if (!(this.f34383a.equals(c12631i.f34383a) && this.f34384b == c12631i.f34384b && this.f34385c.equals(c12631i.f34385c))) {
                z = false;
            }
            return z;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$a */
    private static class C12632a implements C12630f {
        /* renamed from: a */
        private final char f34386a;

        /* renamed from: a */
        public int mo43647a() {
            return 1;
        }

        C12632a(char c) {
            this.f34386a = c;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f34386a);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$c */
    private static class C12633c implements C12630f {
        /* renamed from: a */
        static final C12633c f34387a = new C12633c(3);
        /* renamed from: b */
        static final C12633c f34388b = new C12633c(5);
        /* renamed from: c */
        static final C12633c f34389c = new C12633c(6);
        /* renamed from: d */
        final int f34390d;

        /* renamed from: a */
        static C12633c m47024a(int i) {
            switch (i) {
                case 1:
                    return f34387a;
                case 2:
                    return f34388b;
                case 3:
                    return f34389c;
                default:
                    throw new IllegalArgumentException("invalid number of X");
            }
        }

        C12633c(int i) {
            this.f34390d = i;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34390d;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append("Z");
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            if (this.f34390d >= 5) {
                if (this.f34390d == 6) {
                    appendable.append(':');
                }
                FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$d */
    private interface C12634d extends C12630f {
        /* renamed from: a */
        void mo43668a(Appendable appendable, int i) throws IOException;
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$g */
    private static class C12635g implements C12630f {
        /* renamed from: a */
        private final String f34391a;

        C12635g(String str) {
            this.f34391a = str;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34391a.length();
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f34391a);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$h */
    private static class C12636h implements C12630f {
        /* renamed from: a */
        private final int f34392a;
        /* renamed from: b */
        private final String[] f34393b;

        C12636h(int i, String[] strArr) {
            this.f34392a = i;
            this.f34393b = strArr;
        }

        /* renamed from: a */
        public int mo43647a() {
            int length = this.f34393b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f34393b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f34393b[calendar.get(this.f34392a)]);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$j */
    private static class C12637j implements C12630f {
        /* renamed from: a */
        private final Locale f34394a;
        /* renamed from: b */
        private final int f34395b;
        /* renamed from: c */
        private final String f34396c;
        /* renamed from: d */
        private final String f34397d;

        C12637j(TimeZone timeZone, Locale locale, int i) {
            this.f34394a = locale;
            this.f34395b = i;
            this.f34396c = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.f34397d = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }

        /* renamed from: a */
        public int mo43647a() {
            return Math.max(this.f34396c.length(), this.f34397d.length());
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.f34395b, this.f34394a));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.f34395b, this.f34394a));
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$k */
    private static class C12638k implements C12630f {
        /* renamed from: a */
        static final C12638k f34398a = new C12638k(true);
        /* renamed from: b */
        static final C12638k f34399b = new C12638k(false);
        /* renamed from: c */
        final boolean f34400c;

        /* renamed from: a */
        public int mo43647a() {
            return 5;
        }

        C12638k(boolean z) {
            this.f34400c = z;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            if (this.f34400c) {
                appendable.append(':');
            }
            FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$b */
    private static class C12639b implements C12634d {
        /* renamed from: a */
        private final C12634d f34401a;

        C12639b(C12634d c12634d) {
            this.f34401a = c12634d;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34401a.mo43647a();
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            int i2 = calendar.get(7);
            C12634d c12634d = this.f34401a;
            if (i2 != 1) {
                i = i2 - 1;
            }
            c12634d.mo43668a(appendable, i);
        }

        /* renamed from: a */
        public void mo43668a(Appendable appendable, int i) throws IOException {
            this.f34401a.mo43668a(appendable, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$e */
    private static class C12640e implements C12634d {
        /* renamed from: a */
        private final int f34402a;
        /* renamed from: b */
        private final int f34403b;

        C12640e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f34402a = i;
            this.f34403b = i2;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34403b;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(this.f34402a));
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendFullDigits(appendable, i, this.f34403b);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$l */
    private static class C12641l implements C12634d {
        /* renamed from: a */
        private final C12634d f34404a;

        C12641l(C12634d c12634d) {
            this.f34404a = c12634d;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34404a.mo43647a();
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.f34404a.mo43668a(appendable, i);
        }

        /* renamed from: a */
        public void mo43668a(Appendable appendable, int i) throws IOException {
            this.f34404a.mo43668a(appendable, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$m */
    private static class C12642m implements C12634d {
        /* renamed from: a */
        private final C12634d f34405a;

        C12642m(C12634d c12634d) {
            this.f34405a = c12634d;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34405a.mo43647a();
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.f34405a.mo43668a(appendable, i);
        }

        /* renamed from: a */
        public void mo43668a(Appendable appendable, int i) throws IOException {
            this.f34405a.mo43668a(appendable, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$n */
    private static class C12643n implements C12634d {
        /* renamed from: a */
        static final C12643n f34406a = new C12643n();

        /* renamed from: a */
        public int mo43647a() {
            return 2;
        }

        C12643n() {
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(2) + 1);
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$o */
    private static class C12644o implements C12634d {
        /* renamed from: a */
        private final int f34407a;

        /* renamed from: a */
        public int mo43647a() {
            return 2;
        }

        C12644o(int i) {
            this.f34407a = i;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(this.f34407a));
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 2);
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$p */
    private static class C12645p implements C12634d {
        /* renamed from: a */
        static final C12645p f34408a = new C12645p();

        /* renamed from: a */
        public int mo43647a() {
            return 2;
        }

        C12645p() {
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(1) % 100);
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$q */
    private static class C12646q implements C12634d {
        /* renamed from: a */
        static final C12646q f34409a = new C12646q();

        /* renamed from: a */
        public int mo43647a() {
            return 2;
        }

        C12646q() {
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(2) + 1);
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                FastDatePrinter.appendDigits(appendable, i);
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$r */
    private static class C12647r implements C12634d {
        /* renamed from: a */
        private final int f34410a;

        /* renamed from: a */
        public int mo43647a() {
            return 4;
        }

        C12647r(int i) {
            this.f34410a = i;
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            mo43668a(appendable, calendar.get(this.f34410a));
        }

        /* renamed from: a */
        public final void mo43668a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 1);
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDatePrinter$s */
    private static class C12648s implements C12634d {
        /* renamed from: a */
        private final C12634d f34411a;

        C12648s(C12634d c12634d) {
            this.f34411a = c12634d;
        }

        /* renamed from: a */
        public int mo43647a() {
            return this.f34411a.mo43647a();
        }

        /* renamed from: a */
        public void mo43648a(Appendable appendable, Calendar calendar) throws IOException {
            this.f34411a.mo43668a(appendable, C12649a.m47068b(calendar));
        }

        /* renamed from: a */
        public void mo43668a(Appendable appendable, int i) throws IOException {
            this.f34411a.mo43668a(appendable, i);
        }
    }

    protected FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    private void init() {
        List parsePattern = parsePattern();
        this.mRules = (C12630f[]) parsePattern.toArray(new C12630f[parsePattern.size()]);
        int length = this.mRules.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.mRules[length].mo43647a();
            } else {
                this.mMaxLengthEstimate = i;
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public java.util.List<FastDatePrinter.C12630f> parsePattern() {
        /*
        r17 = this;
        r0 = r17;
        r1 = new java.text.DateFormatSymbols;
        r2 = r0.mLocale;
        r1.<init>(r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r1.getEras();
        r4 = r1.getMonths();
        r5 = r1.getShortMonths();
        r6 = r1.getWeekdays();
        r7 = r1.getShortWeekdays();
        r1 = r1.getAmPmStrings();
        r8 = r0.mPattern;
        r8 = r8.length();
        r9 = 1;
        r10 = new int[r9];
        r11 = 0;
        r12 = 0;
    L_0x0031:
        if (r12 >= r8) goto L_0x018f;
    L_0x0033:
        r10[r11] = r12;
        r12 = r0.mPattern;
        r12 = r0.parseToken(r12, r10);
        r13 = r10[r11];
        r14 = r12.length();
        if (r14 != 0) goto L_0x0045;
    L_0x0043:
        goto L_0x018f;
    L_0x0045:
        r15 = r12.charAt(r11);
        r9 = 7;
        switch(r15) {
            case 68: goto L_0x017f;
            case 69: goto L_0x0171;
            case 70: goto L_0x0169;
            case 71: goto L_0x0162;
            case 72: goto L_0x015a;
            default: goto L_0x004d;
        };
    L_0x004d:
        switch(r15) {
            case 87: goto L_0x0154;
            case 88: goto L_0x014f;
            case 89: goto L_0x0120;
            case 90: goto L_0x0122;
            default: goto L_0x0050;
        };
    L_0x0050:
        switch(r15) {
            case 121: goto L_0x0120;
            case 122: goto L_0x0106;
            default: goto L_0x0053;
        };
    L_0x0053:
        r11 = 3;
        switch(r15) {
            case 39: goto L_0x00e9;
            case 75: goto L_0x00e1;
            case 77: goto L_0x00c2;
            case 83: goto L_0x00ba;
            case 97: goto L_0x00b1;
            case 100: goto L_0x00aa;
            case 104: goto L_0x009d;
            case 107: goto L_0x0090;
            case 109: goto L_0x0088;
            case 115: goto L_0x0080;
            case 117: goto L_0x0074;
            case 119: goto L_0x006e;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Illegal pattern component: ";
        r2.append(r3);
        r2.append(r12);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x006e:
        r9 = r0.selectNumberRule(r11, r14);
        goto L_0x0160;
    L_0x0074:
        r11 = new com.bilibili.commons.time.FastDatePrinter$b;
        r9 = r0.selectNumberRule(r9, r14);
        r11.<init>(r9);
    L_0x007d:
        r9 = r11;
        goto L_0x0160;
    L_0x0080:
        r9 = 13;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0160;
    L_0x0088:
        r9 = 12;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0160;
    L_0x0090:
        r9 = new com.bilibili.commons.time.FastDatePrinter$m;
        r11 = 11;
        r11 = r0.selectNumberRule(r11, r14);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x009d:
        r9 = new com.bilibili.commons.time.FastDatePrinter$l;
        r11 = 10;
        r11 = r0.selectNumberRule(r11, r14);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x00aa:
        r9 = 5;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0160;
    L_0x00b1:
        r9 = new com.bilibili.commons.time.FastDatePrinter$h;
        r11 = 9;
        r9.<init>(r11, r1);
        goto L_0x0160;
    L_0x00ba:
        r9 = 14;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0160;
    L_0x00c2:
        r9 = 4;
        if (r14 < r9) goto L_0x00cd;
    L_0x00c5:
        r9 = new com.bilibili.commons.time.FastDatePrinter$h;
        r12 = 2;
        r9.<init>(r12, r4);
        goto L_0x0160;
    L_0x00cd:
        r12 = 2;
        if (r14 != r11) goto L_0x00d7;
    L_0x00d0:
        r9 = new com.bilibili.commons.time.FastDatePrinter$h;
        r9.<init>(r12, r5);
        goto L_0x0160;
    L_0x00d7:
        if (r14 != r12) goto L_0x00dd;
    L_0x00d9:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12643n.f34406a;
        goto L_0x0160;
    L_0x00dd:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12646q.f34409a;
        goto L_0x0160;
    L_0x00e1:
        r9 = 10;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0160;
    L_0x00e9:
        r9 = 1;
        r11 = r12.substring(r9);
        r12 = r11.length();
        if (r12 != r9) goto L_0x0100;
    L_0x00f4:
        r9 = new com.bilibili.commons.time.FastDatePrinter$a;
        r12 = 0;
        r11 = r11.charAt(r12);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x0100:
        r9 = new com.bilibili.commons.time.FastDatePrinter$g;
        r9.<init>(r11);
        goto L_0x0160;
    L_0x0106:
        r9 = 4;
        if (r14 < r9) goto L_0x0114;
    L_0x0109:
        r9 = new com.bilibili.commons.time.FastDatePrinter$j;
        r11 = r0.mTimeZone;
        r12 = r0.mLocale;
        r14 = 1;
        r9.<init>(r11, r12, r14);
        goto L_0x0160;
    L_0x0114:
        r14 = 1;
        r9 = new com.bilibili.commons.time.FastDatePrinter$j;
        r11 = r0.mTimeZone;
        r12 = r0.mLocale;
        r15 = 0;
        r9.<init>(r11, r12, r15);
        goto L_0x0160;
    L_0x0120:
        r9 = 2;
        goto L_0x0131;
    L_0x0122:
        r9 = 1;
        if (r14 != r9) goto L_0x0128;
    L_0x0125:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12638k.f34399b;
        goto L_0x0160;
    L_0x0128:
        r9 = 2;
        if (r14 != r9) goto L_0x012e;
    L_0x012b:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12633c.f34389c;
        goto L_0x0160;
    L_0x012e:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12638k.f34398a;
        goto L_0x0160;
    L_0x0131:
        if (r14 != r9) goto L_0x0136;
    L_0x0133:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12645p.f34408a;
        goto L_0x0142;
    L_0x0136:
        r9 = 4;
        if (r14 >= r9) goto L_0x013c;
    L_0x0139:
        r9 = 1;
        r14 = 4;
        goto L_0x013d;
    L_0x013c:
        r9 = 1;
    L_0x013d:
        r11 = r0.selectNumberRule(r9, r14);
        r9 = r11;
    L_0x0142:
        r11 = 89;
        if (r15 != r11) goto L_0x0160;
    L_0x0146:
        r11 = new com.bilibili.commons.time.FastDatePrinter$s;
        r9 = (com.bilibili.commons.time.FastDatePrinter.C12634d) r9;
        r11.<init>(r9);
        goto L_0x007d;
    L_0x014f:
        r9 = com.bilibili.commons.time.FastDatePrinter.C12633c.m47024a(r14);
        goto L_0x0160;
    L_0x0154:
        r11 = 4;
        r9 = r0.selectNumberRule(r11, r14);
        goto L_0x0160;
    L_0x015a:
        r9 = 11;
        r9 = r0.selectNumberRule(r9, r14);
    L_0x0160:
        r12 = 0;
        goto L_0x0185;
    L_0x0162:
        r9 = new com.bilibili.commons.time.FastDatePrinter$h;
        r12 = 0;
        r9.<init>(r12, r3);
        goto L_0x0185;
    L_0x0169:
        r12 = 0;
        r9 = 8;
        r9 = r0.selectNumberRule(r9, r14);
        goto L_0x0185;
    L_0x0171:
        r11 = 4;
        r12 = 0;
        r15 = new com.bilibili.commons.time.FastDatePrinter$h;
        if (r14 >= r11) goto L_0x0179;
    L_0x0177:
        r11 = r7;
        goto L_0x017a;
    L_0x0179:
        r11 = r6;
    L_0x017a:
        r15.<init>(r9, r11);
        r9 = r15;
        goto L_0x0185;
    L_0x017f:
        r12 = 0;
        r9 = 6;
        r9 = r0.selectNumberRule(r9, r14);
    L_0x0185:
        r2.add(r9);
        r9 = 1;
        r11 = r13 + 1;
        r12 = r11;
        r11 = 0;
        goto L_0x0031;
    L_0x018f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.commons.time.FastDatePrinter.parsePattern():java.util.List");
    }

    /* Access modifiers changed, original: protected */
    public String parseToken(String str, int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuilder.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                stringBuilder.append(charAt);
                i = i2;
            }
        } else {
            stringBuilder.append('\'');
            int i3 = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (i3 == 0 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    stringBuilder.append(charAt2);
                } else {
                    int i4 = i + 1;
                    if (i4 >= length || str.charAt(i4) != '\'') {
                        i3 ^= 1;
                    } else {
                        stringBuilder.append(charAt2);
                        i = i4;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public C12634d selectNumberRule(int i, int i2) {
        switch (i2) {
            case 1:
                return new C12647r(i);
            case 2:
                return new C12644o(i);
            default:
                return new C12640e(i, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String format(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown class: ");
        if (obj == null) {
            str = "<null>";
        } else {
            str = obj.getClass().getName();
        }
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String format(long j) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return applyRulesToString(newCalendar);
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    private Calendar newCalendar() {
        return Calendar.getInstance(this.mTimeZone, this.mLocale);
    }

    public String format(Date date) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRulesToString(newCalendar);
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public <B extends Appendable> B format(long j, B b) {
        return (B) format(new Date(j), (Appendable) b);
    }

    public <B extends Appendable> B format(Date date, B b) {
        Calendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRules(newCalendar, b);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        if (!calendar.getTimeZone().equals(this.mTimeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.mTimeZone);
        }
        return applyRules(calendar, b);
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b) {
        try {
            for (C12630f a : this.mRules) {
                a.mo43648a(b, calendar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }

    public String getPattern() {
        return this.mPattern;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        if (this.mPattern.equals(fastDatePrinter.mPattern) && this.mTimeZone.equals(fastDatePrinter.mTimeZone) && this.mLocale.equals(fastDatePrinter.mLocale)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.mPattern.hashCode() + ((this.mTimeZone.hashCode() + (this.mLocale.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDatePrinter[");
        stringBuilder.append(this.mPattern);
        stringBuilder.append(",");
        stringBuilder.append(this.mLocale);
        stringBuilder.append(",");
        stringBuilder.append(this.mTimeZone.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init();
    }

    private static void appendDigits(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    private static void appendFullDigits(Appendable appendable, int i, int i2) throws IOException {
        char[] cArr = new char[10];
        int i3 = 0;
        while (i != 0) {
            int i4 = i3 + 1;
            cArr[i3] = (char) ((i % 10) + 48);
            i /= 10;
            i3 = i4;
        }
        while (i3 < i2) {
            appendable.append('0');
            i2--;
        }
        while (true) {
            i3--;
            if (i3 >= 0) {
                appendable.append(cArr[i3]);
            } else {
                return;
            }
        }
    }

    static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i, Locale locale) {
        C12631i c12631i = new C12631i(timeZone, z, i, locale);
        String str = (String) cTimeZoneDisplayCache.get(c12631i);
        if (str != null) {
            return str;
        }
        str = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) cTimeZoneDisplayCache.putIfAbsent(c12631i, str);
        return str2 != null ? str2 : str;
    }
}
