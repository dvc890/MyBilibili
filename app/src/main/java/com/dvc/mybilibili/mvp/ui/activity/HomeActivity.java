package com.dvc.mybilibili.mvp.ui.activity;

import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.dvc.base.MvpBaseActivity;
import com.dvc.base.utils.FragmentUtils;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.presenter.activity.HomePresenter;
import com.dvc.mybilibili.mvp.ui.fragment.home.PegasusFragment;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeActivity extends MvpBaseActivity<HomeView, HomePresenter> implements HomeView{

    @Inject
    HomePresenter homePresenter;

    @BindView(R.id.content_layout)
    FrameLayout contentFrameLayout;
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;

    private int selectIndex;
    private Fragment mCurrentFragment;
    private FragmentManager fragmentManager;
    private Map<String, Fragment> fragmentMap;

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
        selectIndex = getIntent().getIntExtra(Keys.KEY_SELECT_INDEX, 1);
        fragmentManager = getSupportFragmentManager();
        fragmentMap = new HashMap<>();

        mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, new PegasusFragment(), contentFrameLayout.getId(), 0, false);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if(!intent.hasExtra(Keys.KEY_SELECT_INDEX)) return;
        int type =intent.getIntExtra(Keys.KEY_SELECT_INDEX,0);
        if (type > -1 && type < 4){
//            bottomNavigationBar.selectTab(type);
        }
    }

    @Override
    protected void loadDatas() {
        presenter.test();
    }

//    private void initBottomNavigationBar(int selectIndex) {
//        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.tabbar_icon_search_pressed, R.string.search_game).setInactiveIcon(ContextCompat.getDrawable(this,R.mipmap.tabbar_icon_search_nomal)));
//        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.tabbar_icon_game_pressed, R.string.play_game).setInactiveIcon(ContextCompat.getDrawable(this,R.mipmap.tabbar_icon_game_nomal)));
//        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.tabbar_icon_teach_pressed, R.string.guide).setInactiveIcon(ContextCompat.getDrawable(this,R.mipmap.tabbar_icon_teach_nomal)));
//        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.tabbar_icon_user_pressed, R.string.mine).setInactiveIcon(ContextCompat.getDrawable(this,R.mipmap.tabbar_icon_user_nomal)));
//        //mode_fixed:每个item对应名称，不选中也会显示
//        // mode_shifting:每个item对应名称，只有选中才会显示，不选中隐藏
//        bottomNavigationBar.setMode(BottomNavigationBar.MODE_SHIFTING_NO_TITLE);
//        bottomNavigationBar
//                .setActiveColor(R.color.color_ui35_white);
////                .setInActiveColor(R.color.color_ui35_title);
//        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
//        bottomNavigationBar.setAutoHideEnabled(false);//关闭自动隐藏
//        bottomNavigationBar.setFirstSelectedPosition(selectIndex);
//        bottomNavigationBar.initialise();
//        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.SimpleOnTabSelectedListener(){
//            @Override
//            public void onTabSelected(int position) {
//                doOnTabSelected(position);
//            }
//        });
//        bottomNavigationBar.selectTab(selectIndex);
//    }

//    private void doOnTabSelected(@IntRange(from = 0, to = 3) int positionId) {
//        Fragment fragment;
//        String tag;
//        switch (positionId) {
//            case 0:
//                tag = Tags.TAG_SEARCH_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)){
//                    fragment = new SearchFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
//                break;
//            case 1:
//                tag = Tags.TAG_GAME_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)) {
//                    fragment = new PlayFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
//                break;
//            case 2:
//                tag = Tags.TAG_TEACH_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)){
//                    fragment = new GuideFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
//                break;
//            case 3:
//                tag = Tags.TAG_USER_FRAGMENT;
//                if(!fragmentMap.containsKey(tag)){
//                    fragment = new MineFragment();
//                }else
//                    fragment = fragmentMap.get(tag);
//                mCurrentFragment = FragmentUtils.switchContent(fragmentManager, mCurrentFragment, fragment, contentFrameLayout.getId(), positionId, false);
//                fragmentMap.put(tag, mCurrentFragment);
//                break;
//        }
//    }

//    public static class Tags {
//        public static final String TAG_LIVE_FRAGMENT = getString(R.string.search_game);
//        public static final String TAG_MAIN_FRAGMENT = getString(R.string.play_game);
//        public static final String TAG_COMMUNITY_FRAGMENT = getString(R.string.guide);
//        public static final String TAG_USER_FRAGMENT = getString(R.string.mine);
//    }
}
