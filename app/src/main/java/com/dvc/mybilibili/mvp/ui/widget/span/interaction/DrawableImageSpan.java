package com.dvc.mybilibili.mvp.ui.widget.span.interaction;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;


/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.ui.live.roomv3.interaction.span.b */
public class DrawableImageSpan extends C6278c {
    /* renamed from: b */
    private int f22991b;
    private int f68558v;

    public DrawableImageSpan(Drawable drawable, float f, int i) {
        super(drawable, f);
        this.f22991b = i;
    }

    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        Rect bounds = drawable.getBounds();
        float f = (float) (bounds.right - bounds.left);
        float f2 = (float) (bounds.bottom - bounds.top);
        float textSize = paint.getTextSize();
        paint.setTextSize((float) mo78268p());
        float descent = ((paint.descent() - paint.ascent()) + ((float) this.f22991b)) - 2.0f;
        f = (f * descent) / f2;
        paint.setTextSize(textSize);
        drawable.setBounds(0, 0, (int) f, (int) descent);
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final int mo78268p() {
        if (f68558v == 0) {
            int dimensionPixelSize;
            Resources resources = BiliApplication.getContext().getResources();
            if (resources != null) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.text_size_small);
                f68558v = dimensionPixelSize;
            }
            dimensionPixelSize = 0;
            f68558v = dimensionPixelSize;
        }
        return f68558v;
    }
}
