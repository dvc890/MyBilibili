package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dvc.mybilibili.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.util.DensityUtil;

public class CustomRefreshHeader extends LinearLayout implements RefreshHeader {

    private final ImageView mProgressView;
    private AnimationDrawable mProgressDrawable;
    private boolean hasSetPullDownAnim = false;

    public CustomRefreshHeader(Context context) {
        super(context);
        setGravity(Gravity.CENTER);
        mProgressView = new ImageView(context);
        addView(mProgressView, DensityUtil.dp2px(50), DensityUtil.dp2px(50));
        setMinimumHeight(DensityUtil.dp2px(60));
    }

    @NonNull
    @Override
    public View getView() {
        return this;
    }

    @NonNull
    @Override
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override
    public void setPrimaryColors(int... colors) {

    }

    @Override
    public void onInitialized(@NonNull RefreshKernel kernel, int height, int maxDragHeight) {

    }

    @Override
    public void onReleased(@NonNull RefreshLayout refreshLayout, int height, int maxDragHeight) {

    }

    @Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {

    }

    @Override
    public boolean isSupportHorizontalDrag() {
        return false;
    }
    /**
     * 下拉过程中不断调用此方法。第一阶段从小变大的动画，和第二阶段动画都在这里设置
     */
    @Override
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
        if(isDragging) {
            if (percent < 1f) {
                mProgressView.setScaleX(percent);
                mProgressView.setScaleY(percent);

                //是否执行过第二阶段动画的标记
                if (hasSetPullDownAnim) {
                    hasSetPullDownAnim = false;
                }
            }

            //当下拉的高度达到Header高度100%时，开始加载正在下拉的初始动画
            if (percent >= 1.0) {
                //因为这个方法是不停调用的，防止重复
                if (!hasSetPullDownAnim) {
                    mProgressView.setImageResource(R.drawable.mall_asyn_loading_anim_img02);
                    hasSetPullDownAnim = true;
                }
            }
        }
    }

    @Override
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
        switch (newState) {
            case PullDownToRefresh: //下拉刷新开始。正在下拉还没松手时调用
                //每次重新下拉时，将图片资源重置
                mProgressView.setImageResource(R.drawable.mall_asyn_loading_anim_img02);
                break;
            case Refreshing: //正在刷新。只调用一次
                //状态切换为正在刷新状态时，设置图片资源并开始执行
                mProgressView.setImageResource(R.drawable.refreshing_anim);
                mProgressDrawable = (AnimationDrawable) mProgressView.getDrawable();
                break;
            case ReleaseToRefresh://释放立即刷新

                break;
        }
    }
    /**
     * 开始动画（开始刷新或者开始加载动画）
     */
    @Override
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int height, int maxDragHeight) {
        mProgressDrawable.start();
    }

    /**
     * 动画结束后调用
     */
    @Override
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean success) {
        // 结束动画
        if (mProgressDrawable != null && mProgressDrawable.isRunning()) {
            mProgressDrawable.stop();
        }
        //重置状态
        hasSetPullDownAnim = false;
        return 100;//延迟100毫秒之后再弹回
    }
}
