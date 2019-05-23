package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;
import com.dvc.mybilibili.mvp.presenter.fragment.RecommendFragPresenter;
import com.vondear.rxtool.view.RxToast;

import java.util.List;

import javax.inject.Inject;

public class RecommendFragment extends MvpBaseFragment<RecommendFragView, RecommendFragPresenter> implements RecommendFragView<BasicIndexItem>{

    @Inject
    RecommendFragPresenter recommendFragPresenter;

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

    }

    @Override
    protected void loadDatas() {
        loadData(true, false);
    }
    @Override
    public void loadMoreFailed() {

    }

    @Override
    public void noMoreData() {

    }

    @Override
    public void setMoreData(List<BasicIndexItem> moreData) {

    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {
        if(pullToRefresh)
            presenter.loadData(0, pullToRefresh);
        else {

        }
    }

    @Override
    public void setData(List<BasicIndexItem> data) {
        RxToast.normal(data.toString());
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
