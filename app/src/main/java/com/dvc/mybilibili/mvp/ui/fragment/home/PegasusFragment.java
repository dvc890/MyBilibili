package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.fragment.PegasusFragPresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

public class PegasusFragment extends MvpBaseFragment<PegasusFragView, PegasusFragPresenter> implements PegasusFragView{

    @Inject
    PegasusFragPresenter pegasusFragPresenter;

    @BindView(R.id.viewpager)
    ViewPager home_viewpager;
    @BindView(R.id.iv_avatar)
    CircleImageView iv_avatar;

    @NonNull
    @Override
    public PegasusFragPresenter createPresenter() {
        return pegasusFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_main;
    }

    @Override
    protected void initViews() {
        setupViewPager();
    }

    @Override
    protected void loadDatas() {

    }private void setupViewPager() {
//        View recommend = getLayoutInflater().inflate(R.layout.view_home_recommend, null, false);
//        View category = getLayoutInflater().inflate(R.layout.view_home_clazz, null, false);
//        List<View> views = new ArrayList<>(2);
//        views.add(recommend);
//        views.add(category);
//        List<String> titles = new ArrayList<>();
//        titles.add(getResources().getText(R.string.recommend).toString());
//        titles.add(getResources().getText(R.string.game_clazz).toString());
//        new ViewPagerAdapter(home_viewpager,views,titles);
//        home_tab_layout.setupWithViewPager(home_viewpager);
//        swipeRefreshLayout = recommend.findViewById(R.id.mSwipeRefreshLayout);
//        swipeRefreshLayout.setOnRefreshListener(this);
//
//        recyclerHomeRecommend = recommend.findViewById(R.id.mRecyclerView);
//        recyclerHomeCategory = category.findViewById(R.id.mRecyclerView_category);
//        recyclerHomeTag = category.findViewById(R.id.mRecyclerView_tag);
//        category.findViewById(R.id.tv_next).setOnClickListener((view)->{
//            presenter.loadTagData();
//        });
    }
}
