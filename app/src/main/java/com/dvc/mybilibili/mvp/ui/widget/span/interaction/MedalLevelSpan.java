package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;


import com.vondear.rxtool.RxImageTool;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.h */
public class MedalLevelSpan extends ReplacementSpan {
    /* renamed from: b */
    protected Data f18220b;
    /* renamed from: c */
//    private CornerPathEffect f18221c = new CornerPathEffect(this.f18220b.f18213g);
    /* renamed from: d */
    private Bitmap f18222d;
    /* renamed from: e */
    private int f18223e;
    /* renamed from: f */
    private int f18224f;

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.h$a */
    public static class Data {
        /* renamed from: a */
        public static float f18207a = 6.0f;
        /* renamed from: b */
        public static float f18208b = 2.0f;
        /* renamed from: c */
        public int f18209c;
        /* renamed from: d */
        public int f18210d;
        /* renamed from: e */
        public int f18211e;
        /* renamed from: f */
        public float f18212f;
        /* renamed from: g */
        public float f18213g;
        /* renamed from: h */
        public float textsize;
        /* renamed from: i */
        public int f18215i;
        /* renamed from: j */
        public int f18216j;
        /* renamed from: k */
        public int f18217k;
        /* renamed from: l */
        public int f18218l;

        static {
            f18207a = RxImageTool.dip2px(2.0f);
            f18208b = RxImageTool.dip2px(0.5f);
        }

        public Data(int i, int i2, int i3) {
            this(i, i2, f18207a, f18208b, i3);
        }

        public Data(int i, int i2, float f, float f2, int i3) {
            this.f18212f = f18208b;
            this.f18213g = f18207a;
            this.textsize = -1.0f;
            this.f18209c = i;
            this.f18210d = i2;
            this.f18212f = f2;
            this.f18211e = i3;
            this.f18213g = f;
        }

        /* renamed from: a */
        public void setPadding(int i, int i2, int i3, int i4) {
            this.f18215i = i;
            this.f18216j = i2;
            this.f18217k = i3;
            this.f18218l = i4;
        }
    }

    public MedalLevelSpan(Data c6208a) {
        this.f18220b = c6208a;
    }
//    text,
//    @IntRange(from = 0) int start, @IntRange(from = 0) int end, float x,
//    int top, int y, int bottom, @NonNull Paint paint);
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        if (this.f18220b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        final Paint paint2 = paint;
        final int i6 = bottom;
        final int i7 = top;
        final Canvas canvas2 = canvas;
        final float f2 = x;
        final int i8 = start;
        final CharSequence charSequence2 = text;
        final int i9 = end;
        mo30142a(paint, new Runnable() {
            public void run() {
                float max = Math.max((((float) (i6 - i7)) - (((paint2.descent() - paint2.ascent()) + ((float) MedalLevelSpan.this.f18220b.f18216j)) + ((float) MedalLevelSpan.this.f18220b.f18218l))) / 2.0f, 0.0f);
                float f = ((float) i7) + max;
                float f2 = ((float) i6) - max;
                if (MedalLevelSpan.this.f18222d == null || MedalLevelSpan.this.f18222d.isRecycled()) {
                    f2 -= f;
                    int i = i8 + MedalLevelSpan.this.f18220b.f18211e;
                    CharSequence str = "";
                    CharSequence charSequence = "";
                    if (i >= i8) {
                        str = charSequence2.subSequence(i8, i);
                    }
                    CharSequence str2 = str;
                    if (i <= i9) {
                        charSequence = charSequence2.subSequence(i, i9);
                    }
                    FontMetricsInt fontMetricsInt = paint2.getFontMetricsInt();
                    float f3 = (((f2 + 0.0f) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f;
                    RectF rectF = new RectF(0.0f, 0.0f, ((float) MedalLevelSpan.this.f18220b.f18215i) + paint2.measureText(str2, 0, str2.length()), f2);
                    if (i <= i9) {
                        charSequence = charSequence2.subSequence(i, i9);
                    }
                    RectF rectF2 = new RectF(rectF.right, (Data.f18208b / 2.0f) + 0.0f, ((rectF.right + ((float) MedalLevelSpan.this.f18220b.f18217k)) + paint2.measureText(charSequence, 0, charSequence.length())) - Data.f18208b, f2 - Data.f18208b);
                    MedalLevelSpan.this.f18222d = Bitmap.createBitmap((int) ((rectF2.right - rectF.left) + Data.f18208b), (int) f2, Config.ARGB_8888);
                    Canvas canvas = new Canvas(MedalLevelSpan.this.f18222d);
                    MedalLevelSpan.this.m24164a(canvas, paint2, rectF, str2, (float) MedalLevelSpan.this.f18220b.f18215i, f3);
                    MedalLevelSpan.this.m24167b(canvas, paint2, rectF2, charSequence, rectF.right, f3);
                    canvas2.drawBitmap(MedalLevelSpan.this.f18222d, x, top, paint2);
                    MedalLevelSpan.this.f18224f = MedalLevelSpan.this.f18224f + 1;
//                    RxLogTool.d(MedalLevelSpan.f18219a, String.format(Locale.US, "draw complete (%d, %d)", new Object[]{Integer.valueOf(hashCode()), Integer.valueOf(MedalLevelSpan.this.f18224f)}));
                    return;
                }
                canvas2.drawBitmap(MedalLevelSpan.this.f18222d, x, top, paint2);
                MedalLevelSpan.this.f18223e = MedalLevelSpan.this.f18223e + 1;
//                RxLogTool.d(MedalLevelSpan.f18219a, String.format(Locale.US, "draw use cache (%d, %d)", new Object[]{Integer.valueOf(hashCode()), Integer.valueOf(MedalLevelSpan.this.f18223e)}));

            }
        });
    }

    /* renamed from: a */
    private void m24164a(Canvas canvas, Paint paint, RectF rectF, CharSequence charSequence, float f, float f2) {
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{this.f18220b.f18213g, this.f18220b.f18213g, 0.0f, 0.0f, 0.0f, 0.0f, this.f18220b.f18213g, this.f18220b.f18213g}, Direction.CW);
        paint.setStyle(Style.FILL);
        paint.setColor(this.f18220b.f18209c);
        canvas.drawPath(path, paint);
        paint.setColor(this.f18220b.f18210d);
        canvas.drawText(charSequence, 0, charSequence.length(), f, f2, paint);
    }

    /* renamed from: b */
    private void m24167b(Canvas canvas, Paint paint, RectF rectF, CharSequence charSequence, float f, float f2) {
        Path path = new Path();
        float[] fArr = new float[]{0.0f, 0.0f, this.f18220b.f18213g, this.f18220b.f18213g, this.f18220b.f18213g, this.f18220b.f18213g, 0.0f, 0.0f};
        path.addRoundRect(rectF, fArr, Direction.CW);
        paint.setPathEffect(null);
        paint.setColor(this.f18220b.f18210d);
        paint.setStyle(Style.FILL);
        paint.setStrokeWidth(Data.f18208b);
        canvas.drawPath(path, paint);
        paint.setPathEffect(null);
        paint.setColor(this.f18220b.f18209c);
        canvas.drawText(charSequence, 0, charSequence.length(), f, f2, paint);
        Path path2 = new Path();
        path2.addRoundRect(rectF, fArr, Direction.CCW);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(Data.f18208b);
        canvas.drawPath(path2, paint);
        paint.reset();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.f18220b == null) {
            throw new IllegalStateException("You must set LayoutParams in the constructor");
        }
        int[] iArr = new int[1];
        final FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        final Paint paint2 = paint;
        final int[] iArr2 = iArr;
        final CharSequence charSequence2 = charSequence;
        final int i3 = i;
        final int i4 = i2;
        mo30142a(paint, new Runnable() {
            public void run() {
                if (fontMetricsInt2 != null) {
                    FontMetricsInt fontMetricsInt = paint2.getFontMetricsInt();
                    fontMetricsInt2.top = fontMetricsInt.ascent - MedalLevelSpan.this.f18220b.f18216j;
                    fontMetricsInt2.bottom = fontMetricsInt.descent + MedalLevelSpan.this.f18220b.f18218l;
                }
                iArr2[0] = (int) MedalLevelSpan.this.mo30141a(paint2, charSequence2, i3, i4);
            }
        });
        return iArr[0];
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public float mo30141a(Paint paint, CharSequence charSequence, int i, int i2) {
        return (float) Math.round((paint.measureText(charSequence, i, i2) + ((float) this.f18220b.f18215i)) + ((float) this.f18220b.f18217k));
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void mo30142a(Paint paint, Runnable runnable) {
        if (this.f18220b.textsize <= 0.0f) {
            runnable.run();
            return;
        }
        float textSize = paint.getTextSize();
        paint.setTextSize(this.f18220b.textsize);
        runnable.run();
        paint.setTextSize(textSize);
    }
}
