package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.style.ImageSpan;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.roomv3.interaction.span.c */
public class C6278c extends ImageSpan {
    /* renamed from: a */
    float f18351a;

    public C6278c(Drawable drawable, float f) {
        super(drawable);
        this.f18351a = f;
    }

    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            i = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i3 = (bounds.bottom - bounds.top) / 2;
            i /= 4;
            i2 = i3 - i;
            i3 = -(i3 + i);
            fontMetricsInt.ascent = i3;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = i2;
            fontMetricsInt.descent = i2;
        }
        return bounds.right;
    }

    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                return;
            }
        }
        canvas.save();
        canvas.translate(f, (float) Math.round((((float) ((i3 + i5) - drawable.getBounds().bottom)) - this.f18351a) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }
}
