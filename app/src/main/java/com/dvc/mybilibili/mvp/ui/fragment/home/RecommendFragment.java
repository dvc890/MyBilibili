package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.responseconverter.CardTypeEnum;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.dvc.mybilibili.mvp.presenter.fragment.RecommendFragPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.PegasusRecommendAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

import static com.chad.library.adapter.base.BaseQuickAdapter.SLIDEIN_BOTTOM;

public class RecommendFragment extends MvpBaseFragment<RecommendFragView, RecommendFragPresenter> implements RecommendFragView<BasicIndexItem>, OnRefreshListener {

    @Inject
    RecommendFragPresenter recommendFragPresenter;

    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;

    PegasusRecommendAdapter pegasusRecommendAdapter;

    @NonNull
    @Override
    public RecommendFragPresenter createPresenter() {
        return recommendFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_layout_recycleview;
    }

    @Override
    protected void initViews() {
        pegasusRecommendAdapter = new PegasusRecommendAdapter(new ArrayList<>());
        mSwipeRefreshLayout.setOnRefreshListener(this);
        GridLayoutManager layoutManager = new GridLayoutManager(context,2);
        mRecyclerView.setLayoutManager(layoutManager);
        pegasusRecommendAdapter.setPreLoadNumber(4);
        pegasusRecommendAdapter.openLoadAnimation(SLIDEIN_BOTTOM);
        pegasusRecommendAdapter.bindToRecyclerView(mRecyclerView);
        pegasusRecommendAdapter.setOnLoadMoreListener(() -> {
            loadData(false,false);
        });
    }

    @Override
    protected void loadDatas() {
        loadData(true, false);
    }


    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        loadData(true, false);
    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {
        if(pullToRefresh)
            presenter.loadData(0, pullToRefresh, "");
        else {
            BasicIndexItem lastItem = pegasusRecommendAdapter.getItem(pegasusRecommendAdapter.getData().size()-1);
            String banner_hash = "";
            for(BasicIndexItem indexItem : pegasusRecommendAdapter.getData()){
                if(indexItem instanceof BannerListItem) {
                    banner_hash = ((BannerListItem)indexItem).hash;
                    break;
                }
            }
            presenter.loadData(lastItem.idx, false, banner_hash);
        }
    }

    @Override
    public void loadDataCompleted(List<BasicIndexItem> data) {
        pegasusRecommendAdapter.setNewData(data);
        pegasusRecommendAdapter.setEnableLoadMore(true);
        pegasusRecommendAdapter.disableLoadMoreIfNotFullPage();
        mSwipeRefreshLayout.finishRefresh();
    }

    @Override
    public void loadMoreDataComplete(List<BasicIndexItem> moreData) {
        pegasusRecommendAdapter.addData(moreData);
        pegasusRecommendAdapter.loadMoreComplete();
    }

    @Override
    public void loadMoreFailed() {
        pegasusRecommendAdapter.loadMoreFail();
    }

    @Override
    public void noMoreData() {
        pegasusRecommendAdapter.loadMoreEnd();
        pegasusRecommendAdapter.setEnableLoadMore(false);
    }

    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showMessage(String msg, int type) {

    }

    @Override
    public void showError(String message) {

    }
}
