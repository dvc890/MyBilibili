package com.dvc.mybilibili.player.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;

public class PlayerSeekBar extends AppCompatSeekBar {

    private BiliPlayerLottieDrawable pauseThumb;
    private BiliPlayerLottieDrawable slideThumb;
    private OnSeekBarChangeListener onSeekBarChangeListener;
    private int oldProgress = 0;

    public PlayerSeekBar(Context context) {
        super(context);
        initThumb();
        initListener();
    }

    public PlayerSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initThumb();
        initListener();
    }

    public PlayerSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initThumb();
        initListener();
    }

    private void initThumb() {
        LottieComposition.Factory.fromAssetFileName(getContext(), "anim/player_seek_bar_tv_2.json", composition -> {
            pauseThumb = new BiliPlayerLottieDrawable(composition);
            pauseThumb.setRepeatCount(-1);
            pauseThumb.playAnimation();
            setThumb(pauseThumb);
        });
        LottieComposition.Factory.fromAssetFileName(getContext(), "anim/player_seek_bar_tv_1.json", composition -> {
            slideThumb = new BiliPlayerLottieDrawable(composition);
        });
    }

    private void initListener() {
        super.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(slideThumb != null) {
                    float sp = slideThumb.getProgress();
                    if(progress > oldProgress) { //slide right
                        if(sp < slideThumb.getMaxFrame()) {
                            slideThumb.setProgress(sp+0.1f>slideThumb.getMaxFrame()?slideThumb.getMaxFrame():sp+0.1f);
                        }
                    } else {
                        if(sp > slideThumb.getMinFrame()) {
                            slideThumb.setProgress(sp-0.1f<slideThumb.getMinFrame()?slideThumb.getMinFrame():sp-0.1f);
                        }
                    }
                }
                oldProgress = progress;
                if(onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar, progress, fromUser);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                if(slideThumb != null) {
                    setThumb(slideThumb);
                    slideThumb.buildCompositionLayer();
                    updateThumbBounds();
                }
                if(onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(pauseThumb != null) {
                    setThumb(pauseThumb);
                    updateThumbBounds();
                }
                if(onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStopTrackingTouch(seekBar);
                }
            }
        });
    }

    private void updateThumbBounds() {
        int progress;
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progress = (int) ((((float) getProgress()) / ((float) getMax())) * ((float) progressDrawable.getBounds().right));
        } else {
            progress = -1;
        }
        if (getThumb() instanceof LottieDrawable) {
//            Log.e("PlayerBar:"+progress, getThumb().getBounds().toString());
            getThumb().setBounds(progress,0, 0, 0);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.pauseThumb != null && this.pauseThumb.isAnimating()) {
            this.pauseThumb.playAnimation();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        if (this.pauseThumb != null && this.pauseThumb.isAnimating()) {
            this.pauseThumb.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setOnSeekBarChangeListener(OnSeekBarChangeListener l) {
        this.onSeekBarChangeListener = l;
    }
}
