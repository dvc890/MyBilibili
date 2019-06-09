package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.roomv3.interaction.span.a */
public class C8546a extends C5583b {
    /* renamed from: c */
    private float f22990c = 2.0f;

    public C8546a(C5582a c5582a) {
        super(c5582a);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawRoundRect(Canvas canvas, RectF rectF, Paint paint) {
        int color = paint.getColor();
        Style style = paint.getStyle();
        float strokeWidth = paint.getStrokeWidth();
        float f = (this.f22990c / 2.0f) + 0.5f;
        paint.setColor(this.f16832b.f16824b);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(this.f22990c);
        canvas.drawRoundRect(new RectF(rectF.left + f, rectF.top + f, rectF.right - f, rectF.bottom - f), (float) this.f16832b.f16823a, (float) this.f16832b.f16823a, paint);
        paint.setColor(color);
        paint.setStyle(style);
        paint.setStrokeWidth(strokeWidth);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void drawText(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, float f3, float f4, Paint paint) {
        Paint paint2 = paint;
        int color = paint.getColor();
        paint2.setColor(this.f16832b.f16824b);
        canvas.drawText(charSequence, i, i2, f, f3, paint2);
        paint2.setColor(color);
    }
}
