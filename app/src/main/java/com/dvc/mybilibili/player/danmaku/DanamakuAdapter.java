package com.dvc.mybilibili.player.danmaku;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ImageSpan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.android.BaseCacheStuffer;

class DanamakuAdapter extends BaseCacheStuffer.Proxy{
    private final IDanmakuView mDanmakuView;
//    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
    public DanamakuAdapter(IDanmakuView mDanmakuView) {
        this.mDanmakuView = mDanmakuView;
    }

    @Override
    public void prepareDrawing(BaseDanmaku danmaku, boolean fromWorkerThread) {
        if (mDanmakuView != null) {
            if(mDanmakuView.getHeight() < mDanmakuView.getView().getContext().getResources().getDisplayMetrics().heightPixels)
                danmaku.textSize /= 2;
            mDanmakuView.invalidateDanmaku(danmaku, false);
        }
    }

    @Override
    public void releaseResource(BaseDanmaku danmaku) {
        // TODO 重要:清理含有ImageSpan的text中的一些占用内存的资源 例如drawable

    }

    private SpannableStringBuilder createSpannable(Drawable drawable) {
        String text = "bitmap";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        ImageSpan span = new ImageSpan(drawable);//ImageSpan.ALIGN_BOTTOM);
        spannableStringBuilder.setSpan(span, 0, text.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append("图文混排");
        spannableStringBuilder.setSpan(
                new BackgroundColorSpan(Color.parseColor("#8A2233B1")),
                0, spannableStringBuilder.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableStringBuilder;
    }
}
