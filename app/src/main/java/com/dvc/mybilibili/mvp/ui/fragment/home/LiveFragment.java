package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.LoadStateViewUtils;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.presenter.fragment.LiveFragPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.LiveHomeAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.vondear.rxtool.view.RxToast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static com.chad.library.adapter.base.BaseQuickAdapter.SLIDEIN_BOTTOM;

public class LiveFragment extends MvpBaseFragment<LiveFragView, LiveFragPresenter> implements LiveFragView, OnRefreshListener {

    @Inject
    LiveFragPresenter liveFragPresenter;

    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;

    long tmpTime;
    Unbinder unbinder;
    private int relation_page = 1;
    private int rec_page = 1;
    private LiveHomeAdapter liveHomeAdapter;

    @NonNull
    @Override
    public LiveFragPresenter createPresenter() {
        return liveFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_live;
    }

    @Override
    protected void initViews() {
        this.mSwipeRefreshLayout.setOnRefreshListener(this);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mRecyclerView.setPadding(0,0,0,0);
        this.liveHomeAdapter = new LiveHomeAdapter(null);
        this.liveHomeAdapter.bindToRecyclerView(mRecyclerView);
        this.liveHomeAdapter.openLoadAnimation(SLIDEIN_BOTTOM);
    }

    @Override
    protected void loadDatas() {
        tmpTime = SystemClock.uptimeMillis();
        LoadStateViewUtils.showLoadingLayout(liveHomeAdapter);
        mSwipeRefreshLayout.autoRefresh();
    }

    @Override
    public void loadDataCompleted(BiliLiveHomePage biliLiveHomePage) {
        liveHomeAdapter.refreshData(biliLiveHomePage);
        relation_page = 2;
        rec_page++;
        mSwipeRefreshLayout.finishRefresh();
        if(biliLiveHomePage.getRooms().size() == 0){
            LoadStateViewUtils.showEmptyLayout(liveHomeAdapter, null);
            return;
        }
    }

    @Override
    public void loadDataFailed(BiliApiException apiException) {
        if(liveHomeAdapter.getData().size() > 0) {
            LoadStateViewUtils.showLoadErrorLayout(liveHomeAdapter, v -> {
                mSwipeRefreshLayout.autoRefresh();
            });
        } else {
            LoadStateViewUtils.showNetErrorLayout(liveHomeAdapter, v -> {
                mSwipeRefreshLayout.autoRefresh();
            });
        }
        mSwipeRefreshLayout.finishRefresh();
    }

    @Override
    public void onResume() {
        super.onResume();
        rec_page = 1;
        if (SystemClock.uptimeMillis() - tmpTime > 60000 * 5) {
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
        presenter.loadData(relation_page, rec_page);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_live)
    public void onLiveClicked() {
        RxToast.normal("后续开发");
    }
}
