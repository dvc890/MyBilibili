package com.dvc.mybilibili.app.retrofit2.responseconverter;

import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: BL */
/* renamed from: com.bilibili.pegasus.card.base.i */
public final class SearchCardTypeEnum {
    /* renamed from: Z */
    private static Map<Integer, CardTypeEnum> f47822Z = new LinkedHashMap();
    /* renamed from: a */
    private static SearchCardTypeEnum instants;
    /* renamed from: A */
    private static final int f47797A = "multi_item".hashCode();
    /* renamed from: B */
    private static final int f47798B = "multi_item_h".hashCode();
    /* renamed from: C */
    private static final int f47799C = "three_item_h_v4".hashCode();
    /* renamed from: D */
    private static final int f47800D = "up_rcmd_cover".hashCode();
    /* renamed from: E */
    private static final int f47801E = "two_item_h_v1".hashCode();
    /* renamed from: F */
    private static final int f47802F = "small_cover_v5".hashCode();
    /* renamed from: G */
    private static final int f47803G = "select".hashCode();
    /* renamed from: H */
    private static final int f47804H = "footer_empty".hashCode();
    /* renamed from: I */
    private static final int f47805I = "pull_tip_v1".hashCode();
    /* renamed from: J */
    private static final int f47806J = "pull_tip_v2".hashCode();
    /* renamed from: K */
    private static final int f47807K = "three_item_v1".hashCode();
    /* renamed from: L */
    private static final int f47808L = "three_item_v2".hashCode();
    /* renamed from: M */
    private static final int f47809M = "cm_v1".hashCode();
    /* renamed from: N */
    private static final int f47810N = "cm_v2".hashCode();
    /* renamed from: O */
    private static final int f47811O = "one_pic_v1".hashCode();
    /* renamed from: P */
    private static final int f47812P = "one_pic_v3".hashCode();
    /* renamed from: Q */
    private static final int f47813Q = "three_pic_v1".hashCode();
    /* renamed from: R */
    private static final int f47814R = "three_pic_v3".hashCode();
    /* renamed from: S */
    private static final int f47815S = "options_v1".hashCode();
    /* renamed from: T */
    private static final int f47816T = "options_v2".hashCode();
    /* renamed from: U */
    private static final int f47817U = "three_item_all_v2".hashCode();
    /* renamed from: V */
    private static final int f47818V = "three_item_h_v5".hashCode();
    /* renamed from: W */
    private static final int f47819W = "vip_v1".hashCode();
    /* renamed from: X */
    private static final int f47820X = "hot_footer_empty".hashCode();
    /* renamed from: Y */
    private static final int f47821Y = "large_cover_v3".hashCode();
    /* renamed from: b */
    private static final int f47824b = "large_cover_v1".hashCode();
    /* renamed from: c */
    private static final int f47825c = "small_cover_v1".hashCode();
    /* renamed from: d */
    private static final int f47826d = "small_cover_v2".hashCode();
    /* renamed from: e */
    private static final int f47827e = "middle_cover_v1".hashCode();
    /* renamed from: f */
    private static final int f47828f = "middle_cover_v2".hashCode();
    /* renamed from: g */
    private static final int f47829g = "middle_cover_v3".hashCode();
    /* renamed from: h */
    private static final int f47830h = "small_cover_v3".hashCode();
    /* renamed from: i */
    private static final int f47831i = "large_cover_v2".hashCode();
    /* renamed from: j */
    private static final int f47832j = "cover_only_v1".hashCode();
    /* renamed from: k */
    private static final int f47833k = "cover_only_v2".hashCode();
    /* renamed from: l */
    private static final int f47834l = "cover_only_v3".hashCode();
    /* renamed from: m */
    private static final int f47835m = "banner_v1".hashCode();
    /* renamed from: n */
    private static final int f47836n = "banner_v2".hashCode();
    /* renamed from: o */
    private static final int f47837o = "title_bar".hashCode();
    /* renamed from: p */
    private static final int f47838p = "news".hashCode();
    /* renamed from: q */
    private static final int f47839q = "topstick".hashCode();
    /* renamed from: r */
    private static final int f47840r = "hot_topic".hashCode();
    /* renamed from: s */
    private static final int f47841s = "three_item_h_v1".hashCode();
    /* renamed from: t */
    private static final int f47842t = "three_item_h_v2".hashCode();
    /* renamed from: u */
    private static final int f47843u = "three_item_h_v3".hashCode();
    /* renamed from: v */
    private static final int f47844v = "small_cover_v4".hashCode();
    /* renamed from: w */
    private static final int f47845w = "dislike_v1".hashCode();
    /* renamed from: x */
    private static final int f47846x = "dislike_v2".hashCode();
    /* renamed from: y */
    private static final int f47847y = "two_item_v1".hashCode();
    /* renamed from: z */
    private static final int f47848z = "two_item_v2".hashCode();

    static {
        for (CardTypeEnum cardTypeEnum : CardTypeEnum.values()) {
            if (f47822Z == null) f47822Z = new LinkedHashMap();
            f47822Z.put(cardTypeEnum.getValue(), cardTypeEnum);
        }
    }

    public static SearchCardTypeEnum get() {
        synchronized (SearchCardTypeEnum.class) {
            if(instants == null) instants = new SearchCardTypeEnum();
            return instants;
        }
    }

    private SearchCardTypeEnum() {
    }

    /* renamed from: a */
    public final int mo56915a() {
        return f47824b;
    }

    /* renamed from: b */
    public final int mo56916b() {
        return f47825c;
    }

    /* renamed from: c */
    public final int smallCoverV2type() {
        return f47826d;
    }

    /* renamed from: d */
    public final int mo56918d() {
        return f47827e;
    }

    /* renamed from: e */
    public final int mo56919e() {
        return f47828f;
    }

    /* renamed from: f */
    public final int mo56920f() {
        return f47829g;
    }

    /* renamed from: g */
    public final int mo56921g() {
        return f47830h;
    }

    /* renamed from: h */
    public final int mo56922h() {
        return f47831i;
    }

    /* renamed from: i */
    public final int mo56923i() {
        return f47832j;
    }

    /* renamed from: j */
    public final int mo56924j() {
        return f47833k;
    }

    /* renamed from: k */
    public final int mo56925k() {
        return f47834l;
    }

    /* renamed from: l */
    public final int mo56926l() {
        return f47835m;
    }

    /* renamed from: m */
    public final int bannerV2type() {
        return f47836n;
    }

    /* renamed from: n */
    public final int mo56928n() {
        return f47837o;
    }

    /* renamed from: o */
    public final int mo56929o() {
        return f47838p;
    }

    /* renamed from: p */
    public final int mo56930p() {
        return f47839q;
    }

    /* renamed from: q */
    public final int mo56931q() {
        return f47840r;
    }

    /* renamed from: r */
    public final int mo56932r() {
        return f47841s;
    }

    /* renamed from: s */
    public final int mo56933s() {
        return f47842t;
    }

    /* renamed from: t */
    public final int mo56934t() {
        return f47843u;
    }

    /* renamed from: u */
    public final int mo56935u() {
        return f47844v;
    }

    /* renamed from: v */
    public final int mo56936v() {
        return f47845w;
    }

    /* renamed from: w */
    public final int mo56937w() {
        return f47846x;
    }

    /* renamed from: x */
    public final int mo56938x() {
        return f47847y;
    }

    /* renamed from: y */
    public final int mo56939y() {
        return f47848z;
    }

    /* renamed from: z */
    public final int mo56940z() {
        return f47797A;
    }

    /* renamed from: A */
    public final int mo56891A() {
        return f47798B;
    }

    /* renamed from: B */
    public final int mo56892B() {
        return f47799C;
    }

    /* renamed from: C */
    public final int mo56893C() {
        return f47800D;
    }

    /* renamed from: D */
    public final int mo56894D() {
        return f47801E;
    }

    /* renamed from: E */
    public final int mo56895E() {
        return f47802F;
    }

    /* renamed from: F */
    public final int mo56896F() {
        return f47803G;
    }

    /* renamed from: G */
    public final int mo56897G() {
        return f47804H;
    }

    /* renamed from: H */
    public final int mo56898H() {
        return f47805I;
    }

    /* renamed from: I */
    public final int mo56899I() {
        return f47806J;
    }

    /* renamed from: J */
    public final int mo56900J() {
        return f47807K;
    }

    /* renamed from: K */
    public final int mo56901K() {
        return f47808L;
    }

    /* renamed from: L */
    public final int mo56902L() {
        return f47809M;
    }

    /* renamed from: M */
    public final int adV2type() {
        return f47810N;
    }

    /* renamed from: N */
    public final int mo56904N() {
        return f47811O;
    }

    /* renamed from: O */
    public final int mo56905O() {
        return f47812P;
    }

    /* renamed from: P */
    public final int mo56906P() {
        return f47813Q;
    }

    /* renamed from: Q */
    public final int mo56907Q() {
        return f47814R;
    }

    /* renamed from: R */
    public final int mo56908R() {
        return f47815S;
    }

    /* renamed from: S */
    public final int mo56909S() {
        return f47816T;
    }

    /* renamed from: T */
    public final int mo56910T() {
        return f47817U;
    }

    /* renamed from: U */
    public final int mo56911U() {
        return f47818V;
    }

    /* renamed from: V */
    public final int mo56912V() {
        return f47819W;
    }

    /* renamed from: W */
    public final int mo56913W() {
        return f47820X;
    }

    /* renamed from: X */
    public final int mo56914X() {
        return f47821Y;
    }

    @Nullable
    /* renamed from: a */
    public static final CardTypeEnum search(@Nullable Integer num) {
        return f47822Z != null ? f47822Z.get(num) : null;
    }
}
