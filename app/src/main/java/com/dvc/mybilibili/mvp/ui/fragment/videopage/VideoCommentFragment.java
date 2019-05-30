package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.LoadStateViewUtils;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliComment;
import com.dvc.mybilibili.mvp.presenter.fragment.VideoCommentFragPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class VideoCommentFragment extends MvpBaseFragment<VideoCommentFragView, VideoCommentFragPresenter> implements VideoCommentFragView<BiliComment>, OnRefreshListener {

    @Inject
    VideoCommentFragPresenter videoCommentFragPresenter;

    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;

    @NonNull
    @Override
    public VideoCommentFragPresenter createPresenter() {
        return videoCommentFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_layout_recycleview;
    }

    @Override
    protected void initViews() {
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        recommentAdapter.setOnLoadMoreListener(() -> {
//            loadData(false,false);
//        });
    }

    @Override
    protected void loadDatas() {
//        LoadStateViewUtils.showLoadingLayout(recommentAdapter);
        loadData(true, false);
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        loadData(true, false);
    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {
        if(pullToRefresh) {

        } else {

        }
    }

    @Override
    public void loadDataCompleted(List<BiliComment> data) {
        if(data.size() == 0){
//            LoadStateViewUtils.showEmptyLayout(recommentAdapter, null);
            return;
        }
//        recommentAdapter.setNewData(data);
//        recommentAdapter.setEnableLoadMore(true);
//        recommentAdapter.disableLoadMoreIfNotFullPage();
        mSwipeRefreshLayout.finishRefresh();
    }

    @Override
    public void loadMoreDataComplete(List<BiliComment> moreData) {
//        recommentAdapter.addData(moreData);
//        recommentAdapter.loadMoreComplete();
    }

    @Override
    public void loadFailed(int code, String msg) {
//        if(recommentAdapter.getData().size() > 0) {
//            LoadStateViewUtils.showLoadErrorLayout(recommentAdapter, v -> {
//                loadData(false, false);
//            });
//        } else {
//            LoadStateViewUtils.showNetErrorLayout(recommentAdapter, v -> {
//                loadDatas();
//            });
//        }
    }

    @Override
    public void loadMoreFailed(int code, String msg) {
//        recommentAdapter.loadMoreFail();
    }

    @Override
    public void noMoreData() {
//        recommentAdapter.loadMoreEnd();
//        recommentAdapter.setEnableLoadMore(false);
    }
}
