package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.fragment.HomeFragPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends MvpBaseFragment<HomeFragView, HomeFragPresenter> implements HomeFragView {

    @Inject
    HomeFragPresenter homeFragPresenter;

    @BindView(R.id.main_toolbar)
    Toolbar toolbar;
    @BindView(R.id.viewpager)
    ViewPager home_viewpager;
    @BindView(R.id.iv_avatar)
    CircleImageView iv_avatar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @NonNull
    @Override
    public HomeFragPresenter createPresenter() {
        return homeFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_main;
    }

    @Override
    protected void initViews() {
        setUpToolBar(toolbar);
        setupViewPager();
    }

    @Override
    protected void loadDatas() {

    }

    private void setupViewPager() {
        BangumiFragment anime = new BangumiFragment();
        BangumiFragment movie = new BangumiFragment();
        anime.setType(BangumiFragment.BangumiType.ANIME);
        movie.setType(BangumiFragment.BangumiType.MOVIE);

        List<Fragment> views = new ArrayList<>(5);
        views.add(new LiveFragment());
        views.add(new RecommendFragment());
        views.add(new HotFragment());
        views.add(anime);
        views.add(movie);

        List<String> titles = new ArrayList<>();
        titles.add(getResources().getText(R.string.main_page_live).toString());
        titles.add(getResources().getText(R.string.main_page_home).toString());
        titles.add(getResources().getText(R.string.main_page_hot).toString());
        titles.add(getResources().getText(R.string.main_page_bangumi).toString());
        titles.add(getResources().getText(R.string.main_page_bangumi_hall).toString());

        new ViewPagerAdapter(getChildFragmentManager(),home_viewpager,views,titles);
        tabLayout.setupWithViewPager(home_viewpager);
        home_viewpager.setCurrentItem(1);
    }
}
