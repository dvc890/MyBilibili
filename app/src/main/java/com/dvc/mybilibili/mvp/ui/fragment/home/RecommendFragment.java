package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.retrofit2.responseconverter.CardTypeEnum;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2.BannerListItem;
import com.dvc.mybilibili.mvp.presenter.fragment.RecommendFragPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.PegasusRecommendAdapter;
import com.vondear.rxtool.view.RxToast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

import static com.chad.library.adapter.base.BaseQuickAdapter.SLIDEIN_BOTTOM;

public class RecommendFragment extends MvpBaseFragment<RecommendFragView, RecommendFragPresenter> implements RecommendFragView<BasicIndexItem>, SwipeRefreshLayout.OnRefreshListener {

    @Inject
    RecommendFragPresenter recommendFragPresenter;

    @BindView(R.id.mSwipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;
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
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {//表示需要占据几个位置的span
                //因为在声明gridlayoutManager的时候进行了设置，so每一行2个span
                int viewType = pegasusRecommendAdapter.getItemViewType(position);
                if(viewType == CardTypeEnum.BANNER_V2.getValue())
                    return 2;//占据两个位置的span
//                if(viewType == CardTypeEnum.ADV2.getValue())
//                    return 0;//不占据位置的span
                return 1;//占据一个位置
            }
        });
        mRecyclerView.setLayoutManager(layoutManager);
        pegasusRecommendAdapter.openLoadAnimation(SLIDEIN_BOTTOM);
        pegasusRecommendAdapter.bindToRecyclerView(mRecyclerView);
    }

    @Override
    protected void loadDatas() {
        loadData(true, false);
    }

    @Override
    public void onRefresh() {
        loadData(true, false);
    }

    @Override
    public void loadMoreFailed() {

    }

    @Override
    public void noMoreData() {

    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {
        if(pullToRefresh)
            presenter.loadData(0, pullToRefresh, "");
        else {
            BasicIndexItem lastItem = pegasusRecommendAdapter.getItem(pegasusRecommendAdapter.getItemCount()-1);
            String banner_hash = "";
            for(BasicIndexItem indexItem : pegasusRecommendAdapter.getData()){
                if(indexItem instanceof BannerListItem) {
                    banner_hash = ((BannerListItem)indexItem).hash;
                    break;
                }
            }
            presenter.loadData(lastItem.idx, pullToRefresh, banner_hash);
        }
    }

    @Override
    public void setData(List<BasicIndexItem> data) {
        pegasusRecommendAdapter.setNewData(data);
    }

    @Override
    public void setMoreData(List<BasicIndexItem> moreData) {
        pegasusRecommendAdapter.addData(moreData);
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
