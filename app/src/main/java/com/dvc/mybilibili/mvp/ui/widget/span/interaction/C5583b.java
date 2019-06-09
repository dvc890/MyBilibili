package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: BL */
/* renamed from: com.bilibili.bilibililive.uibase.widget.b */
public class C5583b extends ReplacementSpan {
    /* renamed from: b */
    protected C5582a f16832b;
    /* renamed from: c */
    private Bitmap f16833c;
    /* renamed from: d */
    private int f16834d;
    /* renamed from: e */
    private int f16835e;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bilibililive.uibase.widget.b$a */
    public static class C5582a {
        /* renamed from: a */
        public int f16823a;
        /* renamed from: b */
        public int f16824b;
        /* renamed from: c */
        public int f16825c;
        /* renamed from: d */
        public float f16826d;
        /* renamed from: e */
        public int f16827e;
        /* renamed from: f */
        public int f16828f;
        /* renamed from: g */
        public int f16829g;
        /* renamed from: h */
        public int f16830h;

        public C5582a(int i, int i2) {
            this(i, i2, 6);
        }

        public C5582a(int i, int i2, int i3) {
            this.f16823a = 6;
            this.f16824b = 0;
            this.f16826d = -1.0f;
            this.f16824b = i;
            this.f16825c = i2;
            this.f16823a = i3;
        }

        /* renamed from: a */
        public void mo28026a(int i, int i2, int i3, int i4) {
            this.f16827e = i;
            this.f16828f = i2;
            this.f16829g = i3;
            this.f16830h = i4;
        }
    }

    public C5583b(C5582a c5582a) {
        this.f16832b = c5582a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        if (this.f16832b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        final Paint paint2 = paint;
        final int i6 = bottom;
        final int i7 = top;
        final Canvas canvas2 = canvas;
        final float f2 = x;
        final CharSequence charSequence2 = charSequence;
        final int i8 = start;
        final int i9 = end;
        mo28030a(paint, () -> {
            paint2.setAlpha(255);
            float max = Math.max((((float) (i6 - i7)) - (((paint2.descent() - paint2.ascent()) + ((float) C5583b.this.f16832b.f16828f)) + ((float) C5583b.this.f16832b.f16830h))) / 2.0f, 0.0f);
            float f1 = ((float) i7) + max;
            float f21 = ((float) i6) - max;
            if (C5583b.this.f16833c == null || C5583b.this.f16833c.isRecycled()) {
                float f3 = f21 - f1;
                FontMetrics fontMetrics = paint2.getFontMetrics();
                float f4 = (((f3 + 0.0f) - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
                RectF rectF = new RectF(0.0f, 0.0f, C5583b.this.mo28027a(paint2, charSequence2, i8, i9), f3);
                C5583b.this.f16833c = Bitmap.createBitmap((int) (rectF.right - rectF.left), (int) (rectF.bottom - rectF.top), Config.ARGB_8888);
                Canvas canvas1 = new Canvas(C5583b.this.f16833c);
                C5583b.this.drawRoundRect(canvas1, rectF, paint2);
                C5583b.this.drawText(canvas1, charSequence2, i8, i9, (float) C5583b.this.f16832b.f16827e, 0.0f, f4, f3, paint2);
                canvas2.drawBitmap(C5583b.this.f16833c, x, top, paint2);
                C5583b.this.f16835e = C5583b.this.f16835e + 1;
                return;
            }
            canvas2.drawBitmap(C5583b.this.f16833c, x, top, paint2);
            C5583b.this.f16834d = C5583b.this.f16834d + 1;
        });
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawRoundRect(Canvas canvas, RectF rectF, Paint paint) {
        paint.setStyle(Style.FILL);
        paint.setColor(this.f16832b.f16824b);
        canvas.drawRoundRect(rectF, (float) this.f16832b.f16823a, (float) this.f16832b.f16823a, paint);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawText(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, float f3, float f4, Paint paint) {
        Paint paint2 = paint;
        paint2.setColor(this.f16832b.f16825c);
        canvas.drawText(charSequence, i, i2, f, f3, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.f16832b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        int[] iArr = new int[1];
        final FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        final Paint paint2 = paint;
        final int[] iArr2 = iArr;
        final CharSequence charSequence2 = charSequence;
        final int i3 = i;
        final int i4 = i2;
        mo28030a(paint, () -> {
            if (fontMetricsInt2 != null) {
                FontMetricsInt fontMetricsInt1 = paint2.getFontMetricsInt();
                fontMetricsInt2.top = fontMetricsInt1.ascent - C5583b.this.f16832b.f16828f;
                fontMetricsInt2.bottom = fontMetricsInt1.descent + C5583b.this.f16832b.f16830h;
            }
            iArr2[0] = (int) C5583b.this.mo28027a(paint2, charSequence2, i3, i4);
        });
        return iArr[0];
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public float mo28027a(Paint paint, CharSequence charSequence, int i, int i2) {
        return (float) Math.round((paint.measureText(charSequence, i, i2) + ((float) this.f16832b.f16827e)) + ((float) this.f16832b.f16829g));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void mo28030a(Paint paint, Runnable runnable) {
        if (this.f16832b.f16826d <= 0.0f) {
            runnable.run();
            return;
        }
        float textSize = paint.getTextSize();
        paint.setTextSize(this.f16832b.f16826d);
        runnable.run();
        paint.setTextSize(textSize);
    }
}
