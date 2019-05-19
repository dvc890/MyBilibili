package com.dvc.mybilibili.mvp.model.api.service.search.entity;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
/* renamed from: com.bilibili.search.api.g */
public class C3306g extends BaseSearchItem {
    @Nullable
    @JSONField(name = "badge")
    /* renamed from: a */
    public String badge;
    @JSONField(name = "play")
    /* renamed from: b */
    public int play;
    @JSONField(name = "danmaku")
    /* renamed from: c */
    public int danmaku;
    @JSONField(name = "online")
    /* renamed from: d */
    public int online;
    @JSONField(name = "price")
    /* renamed from: e */
    public int price;
    @Nullable
    @JSONField(name = "price_complete")
    /* renamed from: f */
    public String price_complete;
    @JSONField(name = "price_type")
    /* renamed from: g */
    public int price_type;
    @JSONField(name = "required_number")
    /* renamed from: h */
    public int required_number;
    @JSONField(name = "reply")
    /* renamed from: i */
    public int reply;
    @JSONField(name = "attentions")
    /* renamed from: j */
    public int attentions;

    /* JADX WARNING: Missing block: B:20:0x0060, code skipped:
            return 0;
     */
    /* renamed from: a */
    public int mo20465a() {
        /*
        r3 = this;
        r0 = com.bilibili.search.api.GOTO.ARTICLE;
        r0 = r0.getValue();
        r1 = r3.goTo;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r0 = 2131233843; // 0x7f080c33 float:1.8083835E38 double:1.052969425E-314;
        return r0;
    L_0x0012:
        r0 = com.bilibili.search.api.GOTO.LIVE;
        r0 = r0.getValue();
        r1 = r3.goTo;
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 == 0) goto L_0x0022;
    L_0x0021:
        return r1;
    L_0x0022:
        r0 = com.bilibili.search.api.GOTO.VIDEO;
        r0 = r0.getValue();
        r2 = r3.goTo;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0034;
    L_0x0030:
        r0 = 2131233840; // 0x7f080c30 float:1.8083829E38 double:1.0529694236E-314;
        return r0;
    L_0x0034:
        r0 = com.bilibili.search.api.GOTO.TICKET;
        r0 = r0.getValue();
        r2 = r3.goTo;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0060;
    L_0x0042:
        r0 = com.bilibili.search.api.GOTO.PRODUCT;
        r0 = r0.getValue();
        r2 = r3.goTo;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0060;
    L_0x0051:
        r0 = "pgc";
        r2 = r3.goTo;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005f;
    L_0x005b:
        r0 = 2131233841; // 0x7f080c31 float:1.808383E38 double:1.052969424E-314;
        return r0;
    L_0x005f:
        return r1;
    L_0x0060:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search.api.C3306g.mo20465a():int");
    }

    /* JADX WARNING: Missing block: B:19:0x0060, code skipped:
            return 0;
     */
    /* renamed from: b */
    public int mo20467b() {
        /*
        r4 = this;
        r0 = com.bilibili.search.api.GOTO.ARTICLE;
        r0 = r0.getValue();
        r1 = r4.goTo;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r0 = 2131233850; // 0x7f080c3a float:1.808385E38 double:1.0529694285E-314;
        return r0;
    L_0x0012:
        r0 = com.bilibili.search.api.GOTO.LIVE;
        r0 = r0.getValue();
        r1 = r4.goTo;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0024;
    L_0x0020:
        r0 = 2131233436; // 0x7f080a9c float:1.808301E38 double:1.052969224E-314;
        return r0;
    L_0x0024:
        r0 = com.bilibili.search.api.GOTO.VIDEO;
        r0 = r0.getValue();
        r1 = r4.goTo;
        r0 = r0.equals(r1);
        r1 = 2131233846; // 0x7f080c36 float:1.8083841E38 double:1.0529694266E-314;
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        return r1;
    L_0x0036:
        r0 = com.bilibili.search.api.GOTO.TICKET;
        r0 = r0.getValue();
        r2 = r4.goTo;
        r0 = r0.equals(r2);
        r2 = 0;
        if (r0 != 0) goto L_0x0060;
    L_0x0045:
        r0 = com.bilibili.search.api.GOTO.PRODUCT;
        r0 = r0.getValue();
        r3 = r4.goTo;
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0060;
    L_0x0054:
        r0 = "pgc";
        r3 = r4.goTo;
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x005f;
    L_0x005e:
        return r1;
    L_0x005f:
        return r2;
    L_0x0060:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search.api.C3306g.mo20467b():int");
    }

    /* renamed from: a */
//    public CharSequence mo20466a(Context context) {
//        if (GOTO.ARTICLE.getValue().equals(this.goTo)) {
//            return fdz.m124061a(m14704e());
//        }
//        if (GOTO.LIVE.getValue().equals(this.goTo)) {
//            return fdz.m124061a(m14706g());
//        }
//        if (GOTO.VIDEO.getValue().equals(this.goTo)) {
//            return fdz.m124061a(m14707h());
//        }
//        if (!GOTO.TICKET.getValue().equals(this.goTo) && !GOTO.PRODUCT.getValue().equals(this.goTo)) {
//            return HistoryItem.TYPE_PGC.equals(this.goTo) ? fdz.m124061a(m14709j()) : "";
//        } else {
//            CharSequence string = context != null ? context.getResources().getString(mo20470d() ? 2131763193 : 2131763192, new Object[]{mo20469c()}) : "";
//            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
//            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.4f), 1, r1.length() + 1, 33);
//            if (!(context == null || context.getResources() == null)) {
//                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(C3706R.color.daynight_color_theme_pink)), 0, string.length(), 33);
//            }
//            return spannableStringBuilder;
//        }
//    }

    /* renamed from: b */
//    public CharSequence mo20468b(Context context) {
//        if (GOTO.ARTICLE.getValue().equals(this.goTo)) {
//            return fdz.m124061a(m14705f());
//        }
//        if (GOTO.VIDEO.getValue().equals(this.goTo)) {
//            return fdz.m124061a(m14708i());
//        }
//        if (GOTO.TICKET.getValue().equals(this.goTo)) {
//            if (this.required_number <= 0 || context == null || context.getResources() == null) {
//                return "";
//            }
//            return context.getResources().getString(2131763191, new Object[]{fdz.m124061a(this.required_number)});
//        } else if (!GOTO.PRODUCT.getValue().equals(this.goTo)) {
//            return HistoryItem.TYPE_PGC.equals(this.goTo) ? fdz.m124061a(m14710k()) : "";
//        } else {
//            if (this.required_number <= 0 || context == null || context.getResources() == null) {
//                return "";
//            }
//            return context.getResources().getString(2131763158, new Object[]{fdz.m124061a(this.required_number)});
//        }
//    }

    /* renamed from: e */
    private int m14704e() {
        return this.play;
    }

    /* renamed from: f */
    private int m14705f() {
        return this.reply;
    }

    /* renamed from: g */
    private int m14706g() {
        return this.online;
    }

    /* renamed from: h */
    private int m14707h() {
        return this.play;
    }

    /* renamed from: i */
    private int m14708i() {
        return this.danmaku;
    }

    /* renamed from: j */
    private int m14709j() {
        return this.play;
    }

    /* renamed from: k */
    private int m14710k() {
        return this.attentions;
    }

    /* renamed from: c */
    public String mo20469c() {
        if (TextUtils.isEmpty(this.price_complete)) {
            return String.valueOf(this.price);
        }
        return this.price_complete;
    }

    /* renamed from: d */
    public boolean mo20470d() {
        return this.price_type == 1;
    }
}
