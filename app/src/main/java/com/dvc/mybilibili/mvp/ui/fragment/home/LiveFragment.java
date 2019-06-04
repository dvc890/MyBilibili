package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.LoadStateViewUtils;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.presenter.fragment.LiveFragPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import javax.inject.Inject;

import butterknife.BindView;

public class LiveFragment extends MvpBaseFragment<LiveFragView, LiveFragPresenter> implements LiveFragView, OnRefreshListener {

    @Inject
    LiveFragPresenter liveFragPresenter;

    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;

    long tmpTime;

    @NonNull
    @Override
    public LiveFragPresenter createPresenter() {
        return liveFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_layout_recycleview;
    }

    @Override
    protected void initViews() {
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    protected void loadDatas() {
        tmpTime = SystemClock.uptimeMillis();
//        LoadStateViewUtils.showLoadingLayout(liveRecommendAdapter);
        presenter.loadData();
    }

    @Override
    public void loadDataCompleted(BiliLiveHomePage biliLiveHomePage) {
        mSwipeRefreshLayout.finishRefresh();
    }

    @Override
    public void loadDataFailed(BiliApiException apiException) {

    }

    @Override
    public void onResume() {
        super.onResume();
        if(SystemClock.uptimeMillis() - tmpTime  > 60000*5) {
            mSwipeRefreshLayout.autoRefresh();
        }
        tmpTime = SystemClock.uptimeMillis();
    }

    @Override
    public void onPause() {
        super.onPause();
        tmpTime = SystemClock.uptimeMillis();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        presenter.loadData();
    }
}
