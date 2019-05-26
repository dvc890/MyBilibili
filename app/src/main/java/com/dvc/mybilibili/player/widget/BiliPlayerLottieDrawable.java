package com.dvc.mybilibili.player.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.annotation.NonNull;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;

class BiliPlayerLottieDrawable extends LottieDrawable {

    private final LottieComposition composition;
    private int left;

    public BiliPlayerLottieDrawable(LottieComposition composition) {
        this.composition = composition;
        setComposition(this.composition);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        Rect rect = getBounds();
        this.left = rect.left;
        setBounds(left, 0, rect.right, 0);
        canvas.translate(left, 0);
        super.draw(canvas);
    }

    public void buildCompositionLayer() {
        updateBounds();
    }

    public void updateBounds() {
        if (this.composition != null) {
            setComposition(this.composition);
            setProgress(getMaxFrame()/2f);
            setBounds(this.left, 0, 0, 0);
        }
    }
}
