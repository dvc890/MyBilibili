package com.dvc.mybilibili.mvp.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Keep;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;

import com.dvc.mybilibili.app.utils.Intrinsics;
import com.vondear.rxtool.RxImageTool;
import com.vondear.rxtool.RxLogTool;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AutoScrollTextView extends AppCompatTextView {
    /* renamed from: c */
    private int f26591c;
    /* renamed from: d */
    private int f26592d;
    /* renamed from: e */
    private int f26593e;
    /* renamed from: f */
    private long scrolltime;
    /* renamed from: g */
    private boolean f26595g;
    /* renamed from: h */
    private ObjectAnimator objectAnimator;
    /* renamed from: i */
    private OnCompletion f26597i;

    public interface OnCompletion {
        void onAnimCancel();

        void onAnimEnd();
    }

    static final class SetTextRunnable implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AutoScrollTextView f19096a;
        /* renamed from: b */
        final /* synthetic */ CharSequence f19097b;

        SetTextRunnable(AutoScrollTextView autoScrollTextView, CharSequence charSequence) {
            this.f19096a = autoScrollTextView;
            this.f19097b = charSequence;
        }

        public final void run() {
            this.f19096a.setText(this.f19097b);
        }
    }

    public static final class AutoScrollAnimListenerAdapter extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ AutoScrollTextView f19098a;

        AutoScrollAnimListenerAdapter(AutoScrollTextView autoScrollTextView) {
            this.f19098a = autoScrollTextView;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            this.f19098a.f26595g = false;
            OnCompletion a = this.f19098a.f26597i;
            if (a != null) {
                a.onAnimEnd();
            }
        }

        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationCancel(animator);
            OnCompletion a = this.f19098a.f26597i;
            if (a != null) {
                a.onAnimCancel();
            }
            this.f19098a.f26595g = false;
        }
    }

    public AutoScrollTextView(@NotNull Context context) {
        this(context, null);
    }

    public AutoScrollTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public AutoScrollTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* renamed from: a */
    public final void init() {
        this.f26593e = RxImageTool.dip2px(10.0f);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(@NotNull Canvas canvas) {
        if (this.f26595g) {
            super.onDraw(canvas);
        }
    }

    @Keep
    public final void setProgress(float f) {
        this.f26595g = true;
        setX(((float) this.f26591c) - (((float) (this.f26591c + this.f26592d)) * f));
    }

    public final void setAnimDuration(long j) {
        this.scrolltime = j;
    }

    /* renamed from: a */
    public final void setScrollText(@NotNull CharSequence charSequence) {
        this.f26591c = getParentWidth();
        this.f26592d = getTextWidth(charSequence);
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f26592d;
        setLayoutParams(layoutParams);
        setX((float) this.f26591c);
        postDelayed(new SetTextRunnable(this, charSequence), 100);
        this.scrolltime = this.scrolltime == 0 ? 8000 : this.scrolltime;
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.objectAnimator = ObjectAnimator.ofFloat(this, "progress", new float[]{0.0f, 1.0f});
        objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.setDuration(this.scrolltime);
        }
        objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.addListener(new AutoScrollAnimListenerAdapter(this));
        }
        objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    /* renamed from: b */
    public final void cancelAnim() {
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    private final int getParentWidth() {
        ViewParent parent = getParent();
        if (parent != null) {
            return ((ViewGroup) parent).getWidth();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final int getTextWidth(CharSequence charSequence) {
        int desiredWidth;
        try {
            desiredWidth = ((int) Layout.getDesiredWidth(charSequence, getPaint())) + this.f26593e;
        } catch (Exception e) {
            RxLogTool.d(e.getMessage());
            desiredWidth = 0;
        }
        return Math.max(desiredWidth, 0);
    }

    public final void setOnComplete(@NotNull OnCompletion c6774b) {
        Intrinsics.checkParameterIsNotNull(c6774b, "complete");
        this.f26597i = c6774b;
    }
}
