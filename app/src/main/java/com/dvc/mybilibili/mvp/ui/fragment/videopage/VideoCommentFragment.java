package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.app.utils.LoadStateViewUtils;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliComment;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentCursorList;
import com.dvc.mybilibili.mvp.presenter.fragment.VideoCommentFragPresenter;
import com.dvc.mybilibili.mvp.ui.activity.VideoDetailsActivity;
import com.dvc.mybilibili.mvp.ui.adapter.VideoCommentAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class VideoCommentFragment extends MvpBaseFragment<VideoCommentFragView, VideoCommentFragPresenter> implements VideoCommentFragView<BiliCommentCursorList>, OnRefreshListener {

    @Inject
    VideoCommentFragPresenter videoCommentFragPresenter;

    VideoCommentAdapter commentAdapter;

    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;

    public final int MODE_DEFAULT = 1;
    public final int MODE_NEWEST = 2;
    public final int MODE_HOT = 3;

    private int pagesize = 20;
    private int aid = -1;
    private int next = 1;
    private int mode = MODE_HOT;

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
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if(this.aid == -1) {
            this.aid = args.getInt(Keys.KEY_AVID, -1);
            loadDatas();
        }
    }

    @Override
    protected void initViews() {
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        commentAdapter = new VideoCommentAdapter(new ArrayList<>());
        commentAdapter.setOnLoadMoreListener(() -> {
            loadData(false,false);
        });
        commentAdapter.bindToRecyclerView(mRecyclerView);
    }

    @Override
    protected void loadDatas() {
        LoadStateViewUtils.showLoadingLayout(commentAdapter);
        if(this.aid != -1)
            loadData(true, false);
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        this.next = 1;
        loadData(true, false);
    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {
        if(pullToRefresh) {

        } else {

        }
        presenter.getCommentListByCursorV2(this.aid, this.pagesize, this.mode, this.next);
    }

    @Override
    public void loadDataCompleted(BiliCommentCursorList biliCommentCursorList) {
        updateTabData(biliCommentCursorList.cursor.allCount);
        //顶置
        BiliComment topBiliComment = biliCommentCursorList.top.upper;
        //热门
        List<BiliComment> hotsBiliCommentlist = biliCommentCursorList.hots;
        //普通评论列表
        List<BiliComment> repliesBiliCommentlist = biliCommentCursorList.replies;
        commentAdapter.setUpperItem(topBiliComment);
        switch (mode) {
            case MODE_NEWEST:
                commentAdapter.setNewReplies(repliesBiliCommentlist);
                break;
            default:
                commentAdapter.setNewHotItems(hotsBiliCommentlist);
                if(mode == MODE_HOT)
                    commentAdapter.setNewHotItems(repliesBiliCommentlist);
                break;
        }
        mSwipeRefreshLayout.finishRefresh();
        this.next++;
    }

    @Override
    public void loadMoreDataComplete(BiliCommentCursorList moreData) {
        if(mode == MODE_NEWEST)
            commentAdapter.addReplies(moreData.replies);
        else
            commentAdapter.addHotItems(moreData.replies);
        commentAdapter.loadMoreComplete();
    }

    @Override
    public void loadFailed(int code, String msg) {
        if(commentAdapter.getData().size() > 0) {
            LoadStateViewUtils.showLoadErrorLayout(commentAdapter, v -> {
                loadData(false, false);
            });
        } else {
            LoadStateViewUtils.showNetErrorLayout(commentAdapter, v -> {
                loadDatas();
            });
        }
    }

    @Override
    public void loadMoreFailed(int code, String msg) {
        commentAdapter.loadMoreFail();
    }

    @Override
    public void noMoreData() {
        commentAdapter.loadMoreEnd();
        commentAdapter.setEnableLoadMore(false);
    }

    private void updateTabData(int num) {
        if(getActivity() instanceof VideoDetailsActivity) {
            ((VideoDetailsActivity)getActivity()).updataCommentTab(num);
        }
    }
}
