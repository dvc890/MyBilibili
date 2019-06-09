package com.dvc.mybilibili.app.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveUserCard;
import com.dvc.mybilibili.mvp.ui.widget.span.interaction.C5583b;
import com.dvc.mybilibili.mvp.ui.widget.span.interaction.StrokeRoundBorderSpan;
import com.dvc.mybilibili.mvp.ui.widget.span.interaction.MedalLevelSpan;
import com.dvc.mybilibili.mvp.ui.widget.span.interaction.C8546a;
import com.dvc.mybilibili.mvp.ui.widget.span.interaction.DrawableImageSpan;
import com.vondear.rxtool.RxImageTool;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static android.util.TypedValue.COMPLEX_UNIT_DIP;
import static android.util.TypedValue.COMPLEX_UNIT_SP;

public final class LiveCardSpanStringHelper {
    /* renamed from: a */
    public static LiveCardSpanStringHelper f19845a;
    public static final int NAME_DEFAULT_COLOR = 0x8E8E8E;
    private final int f68561y;
    private final int f68538b = RxImageTool.dip2px(32.0f);
    /* renamed from: c */
    private final int f68539c = (f68538b / 2);
    /* renamed from: d */
    private final int f68540d = (f68539c / 2);
    /* renamed from: e */
    private final int f68541e = (f68540d / 2);
    /* renamed from: f */
    private final int f68542f = (f68541e - (f68541e / 4));
    /* renamed from: g */
    private final int f68543g = (f68541e / 2);
    /* renamed from: h */
    private final int f68544h = (f68543g / 2);
    /* renamed from: i */
    private final int f68545i = (f68539c + f68541e);
    /* renamed from: j */
    private final int f68546j = (f68539c + f68541e);
    /* renamed from: k */
    private final int f68547k = ((f68539c + f68539c) + f68541e);
    /* renamed from: l */
    private final int f68548l = (f68539c - f68544h);
    private int textsize;

    private LiveCardSpanStringHelper() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(BiliApplication.getContext().getResources().getDimension(R.dimen.text_size_medium));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        f68561y = (int) (fontMetrics.descent - fontMetrics.ascent);

    }

    public static LiveCardSpanStringHelper get() {
        synchronized (LiveCardSpanStringHelper.class) {
            if(f19845a == null) f19845a = new LiveCardSpanStringHelper();
        }
        return f19845a;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder builderGuard(int privilegeType) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable c = null;
        switch (privilegeType) {
            case 1:
                c = BiliApplication.getContext().getResources().getDrawable(R.drawable.live_icon_guard_governor);
                break;
            case 2:
                c = BiliApplication.getContext().getResources().getDrawable(R.drawable.live_icon_guard_commander);
                break;
            case 3:
                c = BiliApplication.getContext().getResources().getDrawable(R.drawable.live_icon_guard_captain);
                break;
        }
        if (c != null) {
            int l;
            if (f68561y > 0) {
                l = f68561y;
            } else {
                l = f68539c;
            }
            spannableStringBuilder.append("/img");
            c.setBounds(0, 0, l, l);
            spannableStringBuilder.setSpan(new DrawableImageSpan(c, 0.0f, f68541e), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ");
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder builderAdmin(@Nullable Boolean isAuthor, @Nullable Context context) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(context == null || isAuthor == null)) {
            String string;
            if (isAuthor) {
                string = context.getString(R.string.anchor);
            } else {
                string = context.getString(R.string.live_room_manager);
            }
            spannableStringBuilder.append(string);
            C5583b.C5582a c5582a = new C5583b.C5582a(-23744, -1);
            c5582a.mo28026a(f68542f, f68543g, f68542f, f68543g);
            c5582a.f16826d = (float) mo78268p();
            spannableStringBuilder.setSpan(new C8546a(c5582a), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ");
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder buildName(@Nullable String name, int nameColor) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(m25225a(name, 12, "..."));
        if (nameColor >= 0) {
            Object foregroundColorSpan;
            if (nameColor == 0) {
                foregroundColorSpan = new ForegroundColorSpan(ColorUtils.formatColor(NAME_DEFAULT_COLOR));
            } else {
                foregroundColorSpan = new ForegroundColorSpan(ColorUtils.formatColor(nameColor));
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append(" ");
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder builderMedal(@Nullable BiliLiveUserCard.FansMedal fansMedal) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(fansMedal == null || TextUtils.isEmpty(fansMedal.mMedalName))) {
            int a = ColorUtils.formatColor(fansMedal.mMedalColor);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m24178a(fansMedal.mMedalName, 7));
            stringBuilder.append(" ");
            String stringBuilder2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder(" "+fansMedal.mLevel);
            String stringBuilder4 = stringBuilder3.toString();
            spannableStringBuilder.append(stringBuilder2).append(stringBuilder4);
            MedalLevelSpan.Data c6208a = new MedalLevelSpan.Data(a, -1, stringBuilder2.length());
            c6208a.textsize = (float) mo78268p();
            c6208a.setPadding(f68541e, f68543g, f68541e, f68543g);
            MedalLevelSpan c6209h = new MedalLevelSpan(c6208a);
            int length = spannableStringBuilder.length();
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(stringBuilder2);
            stringBuilder5.append(stringBuilder4);
            spannableStringBuilder.setSpan(c6209h, length - stringBuilder5.toString().length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ");
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder builderUserLevel(int levelColor, int levelNum) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("UL"+levelNum);
        if (levelNum >= 0) {
            levelColor = ColorUtils.formatColor(levelColor);
            StrokeRoundBorderSpan.Data c6126a = new StrokeRoundBorderSpan.Data(levelColor, levelColor);
            c6126a.setPadding(f68542f, f68543g, f68542f, f68543g);
            c6126a.textsize = (float) mo78268p();
            spannableStringBuilder.setSpan(new StrokeRoundBorderSpan(c6126a), 0, spannableStringBuilder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringBuilder.append(" ");
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public final SpannableStringBuilder builderUpLevel(int levelColor, int levelNum, @Nullable Context context) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("UP"+levelNum);
        if (context != null && levelNum >= 0) {
            levelColor = ColorUtils.formatColor(levelColor);
            int b = C7201k.getdip(context, 1.5f);
            int d = f68542f;
            StrokeRoundBorderSpan.Data c6126a = new StrokeRoundBorderSpan.Data(levelColor, levelColor);
            c6126a.strokeWidth = C7201k.getdip(context, 0.5f);
            c6126a.setPadding(d, b, d, b);
            spannableStringBuilder.setSpan(new StrokeRoundBorderSpan(c6126a), 0, spannableStringBuilder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
            spannableStringBuilder.setSpan(new StyleSpan(0), 0, spannableStringBuilder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return spannableStringBuilder;
    }

    @NotNull
    /* renamed from: b */
    public final SpannableStringBuilder builderVip(int yearVip, int monthVip) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable drawable = null;
        if (yearVip == 1) {
            drawable = BiliApplication.getContext().getResources().getDrawable(R.drawable.ic_live_vip_year_rect);
        } else if (monthVip == 1) {
            drawable = BiliApplication.getContext().getResources().getDrawable(R.drawable.ic_live_vip_month_rect);
        }
        if(drawable != null)
            f19845a.addDrawable2Span(spannableStringBuilder, drawable, spannableStringBuilder.length());
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final void addDrawable2Span(SpannableStringBuilder spannableStringBuilder, Drawable drawable, int start) {
        if (drawable != null) {
            int l;
            if (f68561y > 0) {
                l = f68561y;
            } else {
                l = f68539c;
            }
            spannableStringBuilder.append("/img");
            drawable.setBounds(0, 0, l, l);
            spannableStringBuilder.setSpan(new DrawableImageSpan(drawable, 0.0f, f68541e), start, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ");
        }
    }

    private final int mo78268p() {
        if (textsize == 0) {
            int dimensionPixelSize;
            Resources resources = BiliApplication.getContext().getResources();
            if (resources != null) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.text_size_small);
                textsize = dimensionPixelSize;
            }
            dimensionPixelSize = 0;
            textsize = dimensionPixelSize;
        }
        return textsize;
    }

    public static String m25225a(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= i) {
                return str;
            }
            if (i > 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, i - 1));
                stringBuilder.append(str2);
                return stringBuilder.toString();
            }
        }
        return str2;
    }
    public static String m24178a(String str, int i) {
        if (str == null) {
            return "";
        }
        char[] toCharArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        for (char c : toCharArray) {
            i2 = m24180a(c) ? i2 + 2 : i2 + 1;
            if (i2 > i) {
                return stringBuilder.toString();
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static boolean m24180a(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
    }

    public static class ColorUtils {
        @ColorInt
        /* renamed from: a */
        public static int formatColor(int i) {
            return (int) (((long) i) | 0xFF000000);
        }

        @Deprecated
        /* renamed from: a */
        public static int m25653a(int i, int i2) {
            return i == 0 ? i2 : ColorUtils.formatColor(i);
        }
    }
    public static class C7201k {
        /* renamed from: a */
        public static int getsp(Context context, float f) {
            return (int) TypedValue.applyDimension(COMPLEX_UNIT_SP, f, context.getResources().getDisplayMetrics());
        }

        /* renamed from: b */
        public static int getdip(Context context, float f) {
            return (int) TypedValue.applyDimension(COMPLEX_UNIT_DIP, f, context.getResources().getDisplayMetrics());
        }
    }
}
