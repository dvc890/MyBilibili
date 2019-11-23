package com.bilibili.commons.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: BL */
public class FastDateParser implements Serializable {
    private static final C12615f ABBREVIATED_YEAR_STRATEGY = new C12620d(1) {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i < 100 ? fastDateParser.adjustYear(i) : i;
        }
    };
    private static final C12615f DAY_OF_MONTH_STRATEGY = new C12620d(5);
    private static final C12615f DAY_OF_WEEK_IN_MONTH_STRATEGY = new C12620d(8);
    private static final C12615f DAY_OF_WEEK_STRATEGY = new C12620d(7) {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i != 7 ? 1 + i : 1;
        }
    };
    private static final C12615f DAY_OF_YEAR_STRATEGY = new C12620d(6);
    private static final C12615f HOUR12_STRATEGY = new C12620d(10) {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i == 12 ? 0 : i;
        }
    };
    private static final C12615f HOUR24_OF_DAY_STRATEGY = new C12620d(11) {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i == 24 ? 0 : i;
        }
    };
    private static final C12615f HOUR_OF_DAY_STRATEGY = new C12620d(11);
    private static final C12615f HOUR_STRATEGY = new C12620d(10);
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final C12615f LITERAL_YEAR_STRATEGY = new C12620d(1);
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = new C126141();
    private static final C12615f MILLISECOND_STRATEGY = new C12620d(14);
    private static final C12615f MINUTE_STRATEGY = new C12620d(12);
    private static final C12615f NUMBER_MONTH_STRATEGY = new C12620d(2) {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i - 1;
        }
    };
    private static final C12615f SECOND_STRATEGY = new C12620d(13);
    private static final C12615f WEEK_OF_MONTH_STRATEGY = new C12620d(4);
    private static final C12615f WEEK_OF_YEAR_STRATEGY = new C12620d(3);
    private static final ConcurrentMap<Locale, C12615f>[] caches = new ConcurrentMap[17];
    private static final long serialVersionUID = 3;
    private final int century;
    private final Locale locale;
    private final String pattern;
    private transient List<C12616g> patterns;
    private final int startYear;
    private final TimeZone timeZone;

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$1 */
    static class C126141 implements Comparator<String> {
        C126141() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$f */
    private static abstract class C12615f {
        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43628a() {
            return false;
        }

        /* renamed from: a */
        public abstract boolean mo43629a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i);

        private C12615f() {
        }

        /* synthetic */ C12615f(C126141 c126141) {
            this();
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$g */
    private static class C12616g {
        /* renamed from: a */
        final C12615f f34364a;
        /* renamed from: b */
        final int f34365b;

        C12616g(C12615f c12615f, int i) {
            this.f34364a = c12615f;
            this.f34365b = i;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43630a(ListIterator<C12616g> listIterator) {
            int i = 0;
            if (!this.f34364a.mo43628a() || !listIterator.hasNext()) {
                return 0;
            }
            C12615f c12615f = ((C12616g) listIterator.next()).f34364a;
            listIterator.previous();
            if (c12615f.mo43628a()) {
                i = this.f34365b;
            }
            return i;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$h */
    private class C12617h {
        /* renamed from: b */
        private final String f34367b;
        /* renamed from: c */
        private final Calendar f34368c;
        /* renamed from: d */
        private int f34369d;

        C12617h(String str, Calendar calendar) {
            this.f34367b = str;
            this.f34368c = calendar;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public C12616g mo43631a() {
            if (this.f34369d >= this.f34367b.length()) {
                return null;
            }
            char charAt = this.f34367b.charAt(this.f34369d);
            if (FastDateParser.isFormatLetter(charAt)) {
                return m46997a(charAt);
            }
            return m46998b();
        }

        /* renamed from: a */
        private C12616g m46997a(char c) {
            int i;
            int i2 = this.f34369d;
            do {
                i = this.f34369d + 1;
                this.f34369d = i;
                if (i >= this.f34367b.length()) {
                    break;
                }
            } while (this.f34367b.charAt(this.f34369d) == c);
            i = this.f34369d - i2;
            return new C12616g(FastDateParser.this.getStrategy(c, i, this.f34368c), i);
        }

        /* renamed from: b */
        private C12616g m46998b() {
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (this.f34369d < this.f34367b.length()) {
                char charAt = this.f34367b.charAt(this.f34369d);
                if (i == 0 && FastDateParser.isFormatLetter(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i2 = this.f34369d + 1;
                    this.f34369d = i2;
                    if (i2 == this.f34367b.length() || this.f34367b.charAt(this.f34369d) != '\'') {
                        i ^= 1;
                    }
                }
                this.f34369d++;
                stringBuilder.append(charAt);
            }
            if (i != 0) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String stringBuilder2 = stringBuilder.toString();
            return new C12616g(new C12619b(stringBuilder2), stringBuilder2.length());
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$b */
    private static class C12619b extends C12615f {
        /* renamed from: a */
        private final String f34372a;

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43628a() {
            return false;
        }

        C12619b(String str) {
            super();
            this.f34372a = str;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43629a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int i2 = 0;
            while (i2 < this.f34372a.length()) {
                i = parsePosition.getIndex() + i2;
                if (i == str.length()) {
                    parsePosition.setErrorIndex(i);
                    return false;
                } else if (this.f34372a.charAt(i2) != str.charAt(i)) {
                    parsePosition.setErrorIndex(i);
                    return false;
                } else {
                    i2++;
                }
            }
            parsePosition.setIndex(this.f34372a.length() + parsePosition.getIndex());
            return true;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$d */
    private static class C12620d extends C12615f {
        /* renamed from: a */
        private final int f34373a;

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public int mo43643a(FastDateParser fastDateParser, int i) {
            return i;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43628a() {
            return true;
        }

        C12620d(int i) {
            super();
            this.f34373a = i;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43629a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                i += index;
                if (length > i) {
                    length = i;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f34373a, mo43643a(fastDateParser, parseInt));
            return true;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$e */
    private static abstract class C12621e extends C12615f {
        /* renamed from: a */
        private Pattern f34374a;

        /* renamed from: a */
        public abstract void mo43644a(FastDateParser fastDateParser, Calendar calendar, String str);

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43628a() {
            return false;
        }

        private C12621e() {
            super();
        }

        /* synthetic */ C12621e(C126141 c126141) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public void mo43646a(StringBuilder stringBuilder) {
            mo43645a(stringBuilder.toString());
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public void mo43645a(String str) {
            this.f34374a = Pattern.compile(str);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public boolean mo43629a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.f34374a.matcher(str.substring(parsePosition.getIndex()));
            if (matcher.lookingAt()) {
                parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
                mo43644a(fastDateParser, calendar, matcher.group(1));
                return true;
            }
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$a */
    private static class C12627a extends C12621e {
        /* renamed from: a */
        final Locale f34375a;
        /* renamed from: b */
        private final int f34376b;
        /* renamed from: c */
        private final Map<String, Integer> f34377c;

        C12627a(int i, Calendar calendar, Locale locale) {
            super();
            this.f34376b = i;
            this.f34375a = locale;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("((?iu)");
            this.f34377c = FastDateParser.appendDisplayNames(calendar, locale, i, stringBuilder);
            stringBuilder.setLength(stringBuilder.length() - 1);
            stringBuilder.append(")");
            mo43646a(stringBuilder);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public void mo43644a(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f34376b, ((Integer) this.f34377c.get(str.toLowerCase(this.f34375a))).intValue());
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$c */
    private static class C12628c extends C12621e {
        /* renamed from: a */
        private static final C12615f f34378a = new C12628c("(Z|(?:[+-]\\d{2}))");
        /* renamed from: b */
        private static final C12615f f34379b = new C12628c("(Z|(?:[+-]\\d{2}\\d{2}))");
        /* renamed from: c */
        private static final C12615f f34380c = new C12628c("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        C12628c(String str) {
            super();
            mo43645a(str);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public void mo43644a(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.equals("Z")) {
                calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GMT");
            stringBuilder.append(str);
            calendar.setTimeZone(TimeZone.getTimeZone(stringBuilder.toString()));
        }

        /* renamed from: a */
        static C12615f m47016a(int i) {
            switch (i) {
                case 1:
                    return f34378a;
                case 2:
                    return f34379b;
                case 3:
                    return f34380c;
                default:
                    throw new IllegalArgumentException("invalid number of X");
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.commons.time.FastDateParser$i */
    static class C12629i extends C12621e {
        /* renamed from: a */
        private final Locale f34381a;
        /* renamed from: b */
        private final Map<String, C12618a> f34382b = new HashMap();

        /* compiled from: BL */
        /* renamed from: com.bilibili.commons.time.FastDateParser$i$a */
        private static class C12618a {
            /* renamed from: a */
            TimeZone f34370a;
            /* renamed from: b */
            int f34371b;

            C12618a(TimeZone timeZone, boolean z) {
                this.f34370a = timeZone;
                this.f34371b = z ? timeZone.getDSTSavings() : 0;
            }
        }

        C12629i(Calendar calendar, Locale locale) {
            super();
            this.f34381a = locale;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    C12618a c12618a = new C12618a(timeZone, false);
                    C12618a obj = c12618a;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            obj = new C12618a(timeZone, true);
                        } else if (i == 5) {
                            obj = c12618a;
                        }
                        String toLowerCase = strArr[i].toLowerCase(locale);
                        if (treeSet.add(toLowerCase)) {
                            this.f34382b.put(toLowerCase, obj);
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                stringBuilder.append('|');
                FastDateParser.simpleQuote(stringBuilder, str2);
            }
            stringBuilder.append(")");
            mo43646a(stringBuilder);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public void mo43644a(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GMT");
                stringBuilder.append(str);
                calendar.setTimeZone(TimeZone.getTimeZone(stringBuilder.toString()));
                return;
            }
            if (str.regionMatches(true, 0, "GMT", 0, 3)) {
                calendar.setTimeZone(TimeZone.getTimeZone(str.toUpperCase()));
                return;
            }
            C12618a c12618a = (C12618a) this.f34382b.get(str.toLowerCase(this.f34381a));
            calendar.set(16, c12618a.f34371b);
            calendar.set(15, c12618a.f34370a.getRawOffset());
        }
    }

    private static boolean isFormatLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    protected FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    protected FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar instance = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            instance.setTime(date);
            i = instance.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i = 0;
        } else {
            instance.setTime(new Date());
            i = instance.get(1) - 80;
        }
        this.century = (i / 100) * 100;
        this.startYear = i - this.century;
        init(instance);
    }

    private void init(Calendar calendar) {
        this.patterns = new ArrayList();
        C12617h c12617h = new C12617h(this.pattern, calendar);
        while (true) {
            C12616g a = c12617h.mo43631a();
            if (a != null) {
                this.patterns.add(a);
            } else {
                return;
            }
        }
    }

    public String getPattern() {
        return this.pattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        if (this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.timeZone.hashCode() + (this.locale.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDateParser[");
        stringBuilder.append(this.pattern);
        stringBuilder.append(",");
        stringBuilder.append(this.locale);
        stringBuilder.append(",");
        stringBuilder.append(this.timeZone.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        StringBuilder stringBuilder;
        if (this.locale.equals(JAPANESE_IMPERIAL)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("(The ");
            stringBuilder.append(this.locale);
            stringBuilder.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
            stringBuilder.append(str);
            throw new ParseException(stringBuilder.toString(), parsePosition.getErrorIndex());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unparseable date: ");
        stringBuilder.append(str);
        throw new ParseException(stringBuilder.toString(), parsePosition.getErrorIndex());
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        Calendar instance = Calendar.getInstance(this.timeZone, this.locale);
        instance.clear();
        return parse(str, parsePosition, instance) ? instance.getTime() : null;
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            C12616g c12616g = (C12616g) listIterator.next();
            if (!c12616g.f34364a.mo43629a(this, calendar, str, parsePosition, c12616g.mo43630a(listIterator))) {
                return false;
            }
        }
        return true;
    }

    private static StringBuilder simpleQuote(StringBuilder stringBuilder, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 36:
                case '(':
                case ')':
                case '*':
                case '+':
                case '.':
                case '?':
                case '[':
                case '\\':
                case '^':
                case 123:
                case 124:
                    stringBuilder.append('\\');
                    break;
                default:
                    break;
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder;
    }

    private static Map<String, Integer> appendDisplayNames(Calendar calendar, Locale locale, int i, StringBuilder stringBuilder) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, locale);
        TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        for (Entry entry : displayNames.entrySet()) {
            String toLowerCase = ((String) entry.getKey()).toLowerCase(locale);
            if (treeSet.add(toLowerCase)) {
                hashMap.put(toLowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            simpleQuote(stringBuilder, (String) it.next()).append('|');
        }
        return hashMap;
    }

    private int adjustYear(int i) {
        int i2 = this.century + i;
        return i >= this.startYear ? i2 : i2 + 100;
    }

    /* JADX WARNING: Missing block: B:36:0x0063, code skipped:
            return getLocaleSpecificStrategy(15, r4);
     */
    /* JADX WARNING: Missing block: B:37:0x0064, code skipped:
            if (r3 <= 2) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:38:0x0066, code skipped:
            r2 = LITERAL_YEAR_STRATEGY;
     */
    /* JADX WARNING: Missing block: B:39:0x0069, code skipped:
            r2 = ABBREVIATED_YEAR_STRATEGY;
     */
    /* JADX WARNING: Missing block: B:40:0x006b, code skipped:
            return r2;
     */
    private com.bilibili.commons.time.FastDateParser.C12615f getStrategy(char r2, int r3, java.util.Calendar r4) {
        /*
        r1 = this;
        switch(r2) {
            case 68: goto L_0x0086;
            case 69: goto L_0x0080;
            case 70: goto L_0x007d;
            case 71: goto L_0x0077;
            case 72: goto L_0x0074;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = 2;
        switch(r2) {
            case 87: goto L_0x0071;
            case 88: goto L_0x006c;
            case 89: goto L_0x0064;
            case 90: goto L_0x0056;
            default: goto L_0x0007;
        };
    L_0x0007:
        switch(r2) {
            case 121: goto L_0x0064;
            case 122: goto L_0x005d;
            default: goto L_0x000a;
        };
    L_0x000a:
        switch(r2) {
            case 75: goto L_0x0053;
            case 77: goto L_0x0048;
            case 83: goto L_0x0045;
            case 97: goto L_0x003e;
            case 100: goto L_0x003b;
            case 104: goto L_0x0038;
            case 107: goto L_0x0035;
            case 109: goto L_0x0032;
            case 115: goto L_0x002f;
            case 117: goto L_0x002c;
            case 119: goto L_0x0029;
            default: goto L_0x000d;
        };
    L_0x000d:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = "Format '";
        r4.append(r0);
        r4.append(r2);
        r2 = "' not supported";
        r4.append(r2);
        r2 = r4.toString();
        r3.<init>(r2);
        throw r3;
    L_0x0029:
        r2 = WEEK_OF_YEAR_STRATEGY;
        return r2;
    L_0x002c:
        r2 = DAY_OF_WEEK_STRATEGY;
        return r2;
    L_0x002f:
        r2 = SECOND_STRATEGY;
        return r2;
    L_0x0032:
        r2 = MINUTE_STRATEGY;
        return r2;
    L_0x0035:
        r2 = HOUR24_OF_DAY_STRATEGY;
        return r2;
    L_0x0038:
        r2 = HOUR12_STRATEGY;
        return r2;
    L_0x003b:
        r2 = DAY_OF_MONTH_STRATEGY;
        return r2;
    L_0x003e:
        r2 = 9;
        r2 = r1.getLocaleSpecificStrategy(r2, r4);
        return r2;
    L_0x0045:
        r2 = MILLISECOND_STRATEGY;
        return r2;
    L_0x0048:
        r2 = 3;
        if (r3 < r2) goto L_0x0050;
    L_0x004b:
        r2 = r1.getLocaleSpecificStrategy(r0, r4);
        goto L_0x0052;
    L_0x0050:
        r2 = NUMBER_MONTH_STRATEGY;
    L_0x0052:
        return r2;
    L_0x0053:
        r2 = HOUR_STRATEGY;
        return r2;
    L_0x0056:
        if (r3 != r0) goto L_0x005d;
    L_0x0058:
        r2 = com.bilibili.commons.time.FastDateParser.C12628c.f34380c;
        return r2;
    L_0x005d:
        r2 = 15;
        r2 = r1.getLocaleSpecificStrategy(r2, r4);
        return r2;
    L_0x0064:
        if (r3 <= r0) goto L_0x0069;
    L_0x0066:
        r2 = LITERAL_YEAR_STRATEGY;
        goto L_0x006b;
    L_0x0069:
        r2 = ABBREVIATED_YEAR_STRATEGY;
    L_0x006b:
        return r2;
    L_0x006c:
        r2 = com.bilibili.commons.time.FastDateParser.C12628c.m47016a(r3);
        return r2;
    L_0x0071:
        r2 = WEEK_OF_MONTH_STRATEGY;
        return r2;
    L_0x0074:
        r2 = HOUR_OF_DAY_STRATEGY;
        return r2;
    L_0x0077:
        r2 = 0;
        r2 = r1.getLocaleSpecificStrategy(r2, r4);
        return r2;
    L_0x007d:
        r2 = DAY_OF_WEEK_IN_MONTH_STRATEGY;
        return r2;
    L_0x0080:
        r2 = 7;
        r2 = r1.getLocaleSpecificStrategy(r2, r4);
        return r2;
    L_0x0086:
        r2 = DAY_OF_YEAR_STRATEGY;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.commons.time.FastDateParser.getStrategy(char, int, java.util.Calendar):com.bilibili.commons.time.FastDateParser$f");
    }

    private static ConcurrentMap<Locale, C12615f> getCache(int i) {
        ConcurrentMap<Locale, C12615f> concurrentMap;
        synchronized (caches) {
            if (caches[i] == null) {
                caches[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = caches[i];
        }
        return concurrentMap;
    }

    private C12615f getLocaleSpecificStrategy(int i, Calendar calendar) {
        ConcurrentMap cache = getCache(i);
        C12615f c12615f = (C12615f) cache.get(this.locale);
        if (c12615f == null) {
            c12615f = i == 15 ? new C12629i(calendar, this.locale) : new C12627a(i, calendar, this.locale);
            C12615f c12615f2 = (C12615f) cache.putIfAbsent(this.locale, c12615f);
            if (c12615f2 != null) {
                return c12615f2;
            }
        }
        return c12615f;
    }
}
