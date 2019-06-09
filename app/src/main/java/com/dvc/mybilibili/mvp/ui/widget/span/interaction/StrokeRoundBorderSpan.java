package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

import com.vondear.rxtool.RxLogTool;

import java.util.Locale;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.b */
public class StrokeRoundBorderSpan extends ReplacementSpan {
    /* renamed from: a */
    public static final String f18078a = "com.bilibili.bililive.videoliveplayer.ui.live.b";
    /* renamed from: b */
    protected Data f18079b;
    /* renamed from: c */
    private Bitmap drawBitmap;
    /* renamed from: d */
    private int f18081d;
    /* renamed from: e */
    private int f18082e;
    /* renamed from: f */
    private CornerPathEffect f18083f;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.b$a */
    public static class Data {
        /* renamed from: a */
        public int strokeWidth;
        /* renamed from: b */
        public int radius;
        /* renamed from: c */
        public int bordercolor;
        /* renamed from: d */
        public int textcolor;
        /* renamed from: e */
        public float textsize;
        /* renamed from: f */
        public int left;
        /* renamed from: g */
        public int f18075g;
        /* renamed from: h */
        public int f18076h;
        /* renamed from: i */
        public int f18077i;

        public Data(int bordercolor, int textcolor) {
            this(bordercolor, textcolor, 8);
        }

        public Data(int bordercolor, int textcolor, int radius) {
            this.strokeWidth = 2;
            this.radius = 8;
            this.bordercolor = 0;
            this.textsize = -1.0f;
            this.bordercolor = bordercolor;
            this.textcolor = textcolor;
            this.radius = radius;
        }

        /* renamed from: a */
        public void setPadding(int left, int i2, int i3, int i4) {
            this.left = left;
            this.f18075g = i2;
            this.f18076h = i3;
            this.f18077i = i4;
        }
    }

    public StrokeRoundBorderSpan(Data c6126a) {
        this.f18079b = c6126a;
        f18083f = new CornerPathEffect((float) this.f18079b.radius);
    }

    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        if (this.f18079b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        mo30019a(paint, () -> {
            float max = Math.max((((float) (bottom - top)) - (((paint.descent() - paint.ascent()) + ((float) f18079b.f18075g)) + ((float) f18079b.f18077i))) / 2.0f, 0.0f);
            float f1 = ((float) top) + max;
            float f21 = ((float) bottom) - max;
            if (drawBitmap == null || drawBitmap.isRecycled()) {
                float f3 = f21 - f1;
                FontMetrics fontMetrics = paint.getFontMetrics();
                float my = (((f3 + 0.0f) - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
                RectF rectF = new RectF(2.0f, 2.0f, mo30016a(paint, text, start, end) - 2.0f, f3 - 2.0f);
                drawBitmap = Bitmap.createBitmap((int) ((rectF.right - rectF.left) + 4.0f), (int) ((rectF.bottom - rectF.top) + 4.0f), Config.ARGB_8888);
                Canvas canvas1 = new Canvas(drawBitmap);
                drawRoundRect(canvas1, rectF, paint);
                drawText(canvas1, text, start, end, (float) f18079b.left, 0.0f, my, f3, paint);
                canvas.drawBitmap(drawBitmap, x, top, paint);
                f18082e = f18082e + 1;
                RxLogTool.d(StrokeRoundBorderSpan.f18078a, String.format(Locale.US, "draw complete (%d, %d)", hashCode(), f18082e));
                return;
            }
            canvas.drawBitmap(drawBitmap, x, top, paint);
            f18081d = f18081d + 1;
            RxLogTool.d(StrokeRoundBorderSpan.f18078a, String.format(Locale.US, "draw use cache (%d, %d)", hashCode(), f18081d));

        });
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawRoundRect(Canvas canvas, RectF rectF, Paint paint) {
        paint.setColor(this.f18079b.bordercolor);
        paint.setStyle(Style.STROKE);
        paint.setStrokeJoin(Join.ROUND);
        paint.setStrokeCap(Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) this.f18079b.strokeWidth);
        canvas.drawRoundRect(rectF, (float) this.f18079b.radius, (float) this.f18079b.radius, paint);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawText(Canvas canvas, CharSequence charSequence, int start, int end, float x, float f2, float y, float f4, Paint paint) {
        Paint paint2 = paint;
        paint2.setPathEffect(null);
        paint2.setStrokeWidth(1.0f);
        paint2.setStyle(Style.FILL);
        paint2.setColor(this.f18079b.textcolor);
        canvas.drawText(charSequence, start, end, x, y, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.f18079b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        int[] iArr = new int[1];
        final FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        final Paint paint2 = paint;
        final int[] iArr2 = iArr;
        final CharSequence charSequence2 = charSequence;
        final int i3 = i;
        final int i4 = i2;
        mo30019a(paint, () -> {
            if (fontMetricsInt2 != null) {
                FontMetricsInt fontMetricsInt1 = paint2.getFontMetricsInt();
                fontMetricsInt2.top = fontMetricsInt1.ascent - f18079b.f18075g;
                fontMetricsInt2.bottom = fontMetricsInt1.descent + f18079b.f18077i;
            }
            iArr2[0] = (int) mo30016a(paint2, charSequence2, i3, i4);
        });
        return iArr[0];
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public float mo30016a(Paint paint, CharSequence charSequence, int start, int end) {
        return (float) Math.round((paint.measureText(charSequence, start, end) + ((float) this.f18079b.left)) + ((float) this.f18079b.f18076h));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void mo30019a(Paint paint, Runnable runnable) {
        if (this.f18079b.textsize <= 0.0f) {
            runnable.run();
            return;
        }
        float textSize = paint.getTextSize();
        paint.setTextSize(this.f18079b.textsize);
        runnable.run();
        paint.setTextSize(textSize);
    }
}
