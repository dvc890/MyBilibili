package com.dvc.mybilibili.mvp.ui.activity;

import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.dvc.base.MvpBaseActivity;
import com.dvc.base.utils.FragmentUtils;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.app.utils.BottomNavigationBarUtils;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.mvp.presenter.activity.HomePresenter;
import com.dvc.mybilibili.mvp.ui.activity.viewholder.HomeNavigationHolder;
import com.dvc.mybilibili.mvp.ui.fragment.home.HomeFragment;
import com.vondear.rxtool.view.RxToast;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeActivity extends MvpBaseActivity<HomeView, HomePresenter> implements HomeView {

    @Inject
    HomePresenter homePresenter;

    @BindView(R.id.content_layout)
    FrameLayout contentFrameLayout;
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    @BindView(R.id.drawer)
    DrawerLayout drawer;

    private int selectIndex;
    private Fragment mCurrentFragment;
    private FragmentManager fragmentManager;
    private Map<String, Fragment> fragmentMap;
    private HomeNavigationHolder homeNavigationHolder;

    @NonNull
    @Override
    public HomePresenter createPresenter() {
        return homePresenter;
    }

    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_activity_main_v2;
    }

    @Override
    protected void initViews() {
        selectIndex = getIntent().getIntExtra(Keys.KEY_SELECT_INDEX, 0);
        fragmentManager = getSupportFragmentManager();
        fragmentMap = new HashMap<>();
        initBottomNavigationBar(selectIndex);
        navigationView.addView(
                LayoutInflater.from(this).inflate(R.layout.bili_view_navigation_footer, null, true),
                new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM));
        homeNavigationHolder = new HomeNavigationHolder(navigationView, presenter);
        navigationView.getHeaderView(0).findViewById(R.id.avatar_layout).setOnClickListener(v -> onAvatarClick(v));
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra(Keys.KEY_SELECT_INDEX)) {
            int type = intent.getIntExtra(Keys.KEY_SELECT_INDEX, 0);
            if (type > -1 && type < 4) {
                bottomNavigationBar.selectTab(type);
            }
        }
        if (intent.hasExtra(Keys.KEY_MAIN_SHOW_NAVI)) {
            drawer.openDrawer(navigationView, true);
        }
        if(intent.hasExtra(Keys.KEY_MAIN_REFRESH_NAVI)) {
            homeNavigationHolder.refrashAvatar(null);
        }
    }

    @Override
    protected void loadDatas() {
    }

    public void onAvatarClick(View view) {
        if (presenter.isLogin()) {
            new AlertDialog.Builder(getBaseContext())
                    .setTitle(R.string.dialog_logout_title)
                    .setMessage(R.string.dialog_logout_message)
                    .setNegativeButton(R.string.dialog_logout_cancel, (dialog, which) -> {
                        dialog.cancel();
                    })
                    .setNeutralButton(R.string.dialog_logout_confirm, ((dialog, which) -> {
                        presenter.loginOut();
                        dialog.dismiss();
                    })).create().show();
        } else {
            CommandActionUtils.toMainLogin(getBaseContext());
        }
    }

    @Override
    public void onLoginOut() {
        homeNavigationHolder.refrashAvatar(null);
        RxToast.info(getString(R.string.pref_title_logout_category));
    }

    private void initBottomNavigationBar(int selectIndex) {
        bottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.ic_vector_tab_bar_home, R.string.main_page_homepage)
        );
        bottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.ic_vector_tab_bar_partition, R.string.main_page_channel)
        );
        bottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.ic_vector_tab_bar_moments, R.string.main_page_attentions)
        );
        bottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.ic_vector_tab_bar_me, R.string.main_page_my_center)
        );
        //mode_fixed:每个item对应名称，不选中也会显示
        // mode_shifting:每个item对应名称，只有选中才会显示，不选中隐藏
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar
                .setBarBackgroundColor(R.color.colorAccent) // 背景颜色
                .setActiveColor(R.color.white)
                .setInActiveColor(R.color.black);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        bottomNavigationBar.setAutoHideEnabled(false);//关闭自动隐藏
        bottomNavigationBar.setFirstSelectedPosition(selectIndex);
        bottomNavigationBar.initialise();
        BottomNavigationBarUtils.setBottomNavigationItemSize(bottomNavigationBar, 6, 22, 10);
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.SimpleOnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                doOnTabSelected(position);
            }
        });
        bottomNavigationBar.selectTab(selectIndex);
    }

    private void doOnTabSelected(@IntRange(from = 0, to = 3) int positionId) {
        Fragment fragment;
        String tag;
        switch (positionId) {
            case 0:
                tag = Tags.TAG_HOME_FRAGMENT;
                if (!fragmentMap.containsKey(tag)) {
                    fragment = new HomeFragment();
                } else
                    fragment = fragmentMap.get(tag);
                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
                fragmentMap.put(tag, mCurrentFragment);
                break;
            case 1:
//                tag = Tags.TAG_CHANNEL_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)) {
//                    fragment = new ChannelFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
                break;
            case 2:
//                tag = Tags.TAG_ATTENTION_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)){
//                    fragment = new AttentionFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
                break;
            case 3:
//                tag = Tags.TAG_USER_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)){
//                    fragment = new MineFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
//                break;
        }
    }

    public static class Tags {
        public static final String TAG_HOME_FRAGMENT = BiliApplication.getContext().getString(R.string.main_page_homepage);
        public static final String TAG_CHANNEL_FRAGMENT = BiliApplication.getContext().getString(R.string.main_page_channel);
        public static final String TAG_ATTENTION_FRAGMENT = BiliApplication.getContext().getString(R.string.main_page_attentions);
        public static final String TAG_USER_FRAGMENT = BiliApplication.getContext().getString(R.string.main_page_my_center);
    }
}
