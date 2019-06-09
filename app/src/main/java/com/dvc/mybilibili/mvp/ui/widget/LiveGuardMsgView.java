package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.vondear.rxtool.RxImageTool;

public class LiveGuardMsgView extends LinearLayout {
    /* renamed from: a */
    Drawable f18391a;
    /* renamed from: b */
    Path f18392b;
    /* renamed from: c */
    int f18393c;
    /* renamed from: d */
    int f18394d;
    /* renamed from: e */
    int f18395e;
    /* renamed from: f */
    int f18396f;
    /* renamed from: g */
    int f18397g;
    /* renamed from: h */
    private Paint f18398h;

    public LiveGuardMsgView(Context context) {
        this(context, null);
    }

    public LiveGuardMsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGuardMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18393c = 0;
        this.f18394d = 0;
        this.f18398h = new Paint();
        this.f18392b = new Path();
        setWillNotDraw(false);
        this.f18395e = RxImageTool.dip2px(10.0f);
        this.f18396f = RxImageTool.dip2px(2.0f);
        this.f18397g = 2;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        this.f18398h.setStyle(Style.FILL);
        this.f18398h.setColor(this.f18393c);
        this.f18392b.reset();
        int measuredWidth = (getMeasuredWidth() + 0) - this.f18396f;
        int measuredHeight = (getMeasuredHeight() + 0) - this.f18396f;
        float f = 0f;
        this.f18392b.moveTo(f, f);
        this.f18392b.lineTo((float) (measuredWidth - this.f18395e), f);
        float f2 = (float) measuredWidth;
        this.f18392b.lineTo(f2, (float) (this.f18395e + 0));
        float f3 = (float) measuredHeight;
        this.f18392b.lineTo(f2, f3);
        this.f18392b.lineTo((float) (this.f18395e + 0), f3);
        this.f18392b.lineTo(f, (float) (measuredHeight - this.f18395e));
        this.f18392b.lineTo(f, f);
        canvas.drawPath(this.f18392b, this.f18398h);
        canvas.restore();
        super.onDraw(canvas);
        canvas.save();
        this.f18398h.setStyle(Style.STROKE);
        this.f18398h.setStrokeWidth((float) this.f18397g);
        this.f18398h.setColor(this.f18394d);
        this.f18392b.reset();
        measuredWidth = (int) (((float) this.f18397g) / 2.0f);
        int i = (int) (((float) this.f18397g) / 2.0f);
        measuredHeight = ((getMeasuredWidth() + measuredWidth) - this.f18396f) - this.f18397g;
        int measuredHeight2 = ((getMeasuredHeight() + i) - this.f18396f) - this.f18397g;
        f3 = (float) measuredWidth;
        float f4 = (float) i;
        this.f18392b.moveTo(f3, f4);
        this.f18392b.lineTo((float) (measuredHeight - this.f18395e), f4);
        float f5 = (float) measuredHeight;
        this.f18392b.lineTo(f5, (float) (i + this.f18395e));
        f = (float) measuredHeight2;
        this.f18392b.lineTo(f5, f - ((((float) this.f18395e) / 10.0f) * 9.0f));
        canvas.drawPath(this.f18392b, this.f18398h);
        this.f18392b.reset();
        this.f18392b.moveTo(f5 - ((((float) this.f18395e) / 10.0f) * 8.0f), f);
        this.f18392b.lineTo((float) (measuredWidth + this.f18395e), f);
        this.f18392b.lineTo(f3, (float) (measuredHeight2 - this.f18395e));
        this.f18392b.lineTo(f3, f4);
        canvas.drawPath(this.f18392b, this.f18398h);
        canvas.restore();
        if (this.f18391a != null) {
            canvas.save();
            measuredWidth = getMeasuredWidth();
            i = getMeasuredHeight();
            measuredHeight2 = measuredWidth - this.f18391a.getIntrinsicWidth();
            this.f18391a.setBounds(measuredHeight2, i - this.f18391a.getIntrinsicHeight(), measuredWidth, i);
            this.f18391a.draw(canvas);
            canvas.restore();
        }
    }

    public void setAnchorDrawable(Drawable drawable) {
        this.f18391a = drawable;
        requestLayout();
    }

    public void setBackgroundColor(int i) {
        this.f18393c = i;
    }

    public void setBackgroundStrokeColor(int i) {
        this.f18394d = i;
    }
}
