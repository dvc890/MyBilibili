package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.fragment.HotFragPresenter;

import java.util.List;

import javax.inject.Inject;

public class HotFragment extends MvpBaseFragment<HotFragView, HotFragPresenter> implements HotFragView<List> {

    @Inject
    HotFragPresenter hotFragPresenter;

    @NonNull
    @Override
    public HotFragPresenter createPresenter() {
        return hotFragPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.content_main;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {

    }

    @Override
    public void loadMoreFailed(int code, String msg) {

    }

    @Override
    public void noMoreData() {

    }

    @Override
    public void loadMoreDataComplete(List moreData) {

    }

    @Override
    public void loadData(boolean pullToRefresh, boolean cleanCache) {

    }

    @Override
    public void loadDataCompleted(List data) {

    }

    @Override
    public void loadFailed(int code, String msg) {

    }
}
