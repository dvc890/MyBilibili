package com.dvc.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;
import dagger.android.support.DaggerAppCompatActivity;


public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity implements BGASwipeBackHelper.Delegate {
    private final String TAG = this.getClass().getSimpleName();

    protected BGASwipeBackHelper mSwipeBackHelper;
    protected boolean existActivityWithAnimation = true;
    protected Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initSwipeBackFinish();
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(getContentViewResID());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        if(layoutResID != 0) {
            super.setContentView(layoutResID);
            ButterKnife.bind(this);
        }
    }

    /**
     * 初始化滑动返回。在 super.onCreate(savedInstanceState) 之前调用该方法
     */
    private void initSwipeBackFinish() {
        mSwipeBackHelper = new BGASwipeBackHelper(this, this);

        // 「必须在 Application 的 onCreate 方法中执行 BGASwipeBackHelper.init 来初始化滑动返回」
        // 下面几项可以不配置，这里只是为了讲述接口用法。

        // 设置滑动返回是否可用。默认值为 true
        mSwipeBackHelper.setSwipeBackEnable(true);
        // 设置是否仅仅跟踪左侧边缘的滑动返回。默认值为 true
        mSwipeBackHelper.setIsOnlyTrackingLeftEdge(true);
        // 设置是否是微信滑动返回样式。默认值为 true
        mSwipeBackHelper.setIsWeChatStyle(true);
        // 设置阴影资源 id。默认值为 R.drawable.bga_sbl_shadow
        mSwipeBackHelper.setShadowResId(com.dvc.base.R.drawable.bga_sbl_shadow);
        // 设置是否显示滑动返回的阴影效果。默认值为 true
        mSwipeBackHelper.setIsNeedShowShadow(true);
        // 设置阴影区域的透明度是否根据滑动的距离渐变。默认值为 true
        mSwipeBackHelper.setIsShadowAlphaGradient(true);
        // 设置触发释放后自动滑动返回的阈值，默认值为 0.3f
        mSwipeBackHelper.setSwipeBackThreshold(0.3f);
        // 设置底部导航条是否悬浮在内容上，默认值为 false
        mSwipeBackHelper.setIsNavigationBarOverlap(false);
    }

    /**
     * 是否支持滑动返回。这里在父类中默认返回 true 来支持滑动返回，如果某个界面不想支持滑动返回则重写该方法返回 false 即可
     *
     * @return zhichi
     */
    @Override
    public boolean isSupportSwipeBack() {
        return true;
    }

    /**
     * 正在滑动返回
     *
     * @param slideOffset 从 0 到 1
     */
    @Override
    public void onSwipeBackLayoutSlide(float slideOffset) {
    }

    /**
     * 没达到滑动返回的阈值，取消滑动返回动作，回到默认状态
     */
    @Override
    public void onSwipeBackLayoutCancel() {
    }

    /**
     * 滑动返回执行完毕，销毁当前 Activity
     */
    @Override
    public void onSwipeBackLayoutExecuted() {
        mSwipeBackHelper.swipeBackward();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 带动画的启动activity
     */
    public void startActivityWithAnimation(Intent intent) {
        startActivity(intent);
        overridePendingTransition(com.dvc.base.R.anim.slide_in_right, com.dvc.base.R.anim.slide_out_left);
    }

    /**
     * 带动画的启动activity
     */
    public void startActivityForResultWithAnimation(Intent intent, int requestCode) {
        startActivityForResult(intent, requestCode);
        overridePendingTransition(com.dvc.base.R.anim.slide_in_right, com.dvc.base.R.anim.slide_out_left);
    }

    @Override
    public void onBackPressed() {
        // 正在滑动返回的时候取消返回按钮事件
        if (mSwipeBackHelper.isSliding()) {
            return;
        }
        mSwipeBackHelper.backward();
        super.onBackPressed();
        if (existActivityWithAnimation) {
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }

    public abstract int getContentViewResID();

    /**
     * 初始化组件
     */
    protected abstract void initViews();

    /**
     * 数据处理
     */
    protected abstract void loadDatas();
}
