package com.dvc.mybilibili.mvp.ui.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.retrofit2.callback.ObserverCallback;
import com.dvc.mybilibili.app.utils.LoadStateViewUtils;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliComment;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliCommentDetail;
import com.dvc.mybilibili.mvp.ui.adapter.VideoCommentAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BiliCommentDetailView extends ConstraintLayout implements OnRefreshListener {

    private final DataManager dataManager;
    private final ApiHelper apiHelper;

    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;

    private CommentDetailAdapter adapter;
    private BiliComment commentRoot;

    private int pagesize = 20;
    private long minid = 0;
    private boolean isShowing = false;
    private long oid = 0;

    public BiliCommentDetailView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.bili_app_view_comment2_detail, this, true);
        FrameLayout contentFrame = findViewById(R.id.content_frame);
        LayoutInflater.from(context).inflate(R.layout.bili_layout_recycleview, contentFrame, true);
        this.dataManager = BiliApplication.getDataManager();
        this.apiHelper = this.dataManager.getApiHelper();
        ButterKnife.bind(this, contentFrame);
        initView();
    }

    private void initView() {
        findViewById(R.id.close).setOnClickListener((v) -> close());
        this.mSwipeRefreshLayout.setOnRefreshListener(this);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        this.mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        this.adapter = new CommentDetailAdapter();
        this.adapter.bindToRecyclerView(mRecyclerView);
        this.adapter.setOnLoadMoreListener(() -> loadData(false), this.mRecyclerView);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(isShowing && keyCode == KeyEvent.KEYCODE_BACK) {
            close();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setNewData(BiliCommentDetail detail) {
        List reply = detail.root.mReply;
        BiliComment comment = detail.root;
        comment.mReply = null;
        adapter.setUpperItem(comment);
        adapter.setNewReplies(reply);
    }

    public void addData(BiliCommentDetail detail) {
        adapter.addReplies(detail.root.mReply);
    }

    public void show(ViewGroup parent, long aid, BiliComment item) {
        parent.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.oid = aid;
        this.commentRoot = item;
        this.isShowing = true;
        loadData(true);
        this.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.upper_bottom_in));
        requestFocus();
    }

    public void close() {
        this.isShowing = false;
        this.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.upper_bottom_out));
        ((ViewGroup) getParent()).removeView(this);
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        loadData(true);
        adapter.setEnableLoadMore(false);
    }

    private void loadCommentDetailCompleted(BiliCommentDetail detail) {
        setNewData(detail);
        this.minid = detail.cursor.maxId+1;
        mSwipeRefreshLayout.finishRefresh();
        adapter.setEnableLoadMore(true);
    }

    private void loadMoreCommentDetailCompleted(BiliCommentDetail detail) {
        addData(detail);
        this.minid = detail.cursor.maxId+1;
        if(detail.root.mReply.size() < pagesize) {
            noMoreData();
        }else
            adapter.loadMoreComplete();
    }

    private void loadCommentDetailFailed(int code, String message) {
        if(adapter.getData().size() > 0) {
            LoadStateViewUtils.showLoadErrorLayout(adapter, v -> loadData(false));
        } else {
            LoadStateViewUtils.showNetErrorLayout(adapter, v -> loadData(true));
        }
    }

    private void loadMoreCommentDetailFailed(int code, String message) {
        adapter.loadMoreFail();
    }

    private void noMoreData() {
        adapter.loadMoreEnd();
        adapter.setEnableLoadMore(false);
        adapter.addFooterView(LayoutInflater.from(getContext()).inflate(R.layout.bili_app_layout_comment2_vertical_image_text_holder, null));
    }

    private void loadData(boolean pull) {
        if(pull) {
            this.minid = 0;
        }
        getCommentDetail(this.oid, this.commentRoot.mRpId, pagesize, minid);
    }

    public void getCommentDetail(long aid, long root, int size, long min_id) {
        apiHelper.getCommentDetail(aid, root, size, min_id)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .subscribe(new ObserverCallback<BiliCommentDetail>() {
                    @Override
                    public void onSuccess(BiliCommentDetail detail) {
                        if(min_id<1){
                            loadCommentDetailCompleted(detail);
                        }else {
                            loadMoreCommentDetailCompleted(detail);
                        }
                    }

                    @Override
                    public void onError(BiliApiException apiException, int code) {
                        if (min_id < 1) {
                            loadCommentDetailFailed(code, apiException.getMessage());
                        } else {
                            loadMoreCommentDetailFailed(code, apiException.getMessage());
                        }
                    }
                });
    }

    class CommentDetailAdapter extends VideoCommentAdapter {

        private TextView tipsview;

        public CommentDetailAdapter() {
            super(new ArrayList<>());
        }

        @Override
        public void setUpperItem(BiliComment biliComment) {
            if(this.mLayoutInflater == null) this.mLayoutInflater = LayoutInflater.from(getContext());
            super.setUpperItem(biliComment);
            if(this.tipsview == null) {
                this.tipsview = new TextView(getContext());
                tipsview.setTextColor(getResources().getColor(R.color.daynight_color_text_body_secondary_light));
                tipsview.setTextSize(13);
                tipsview.setGravity(Gravity.CENTER_VERTICAL);
            } else {
                removeHeaderView(tipsview);
            }
            tipsview.setText(getResources().getString(R.string.comment2_reply_count_fmt, biliComment.mReplyCount));
            addHeaderView(tipsview);
        }

        @Override
        public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if(this.mContext == null) this.mContext = parent.getContext();
            if(this.mLayoutInflater == null) this.mLayoutInflater = LayoutInflater.from(mContext);
            return super.onCreateViewHolder(parent, viewType);
        }
    }
}
