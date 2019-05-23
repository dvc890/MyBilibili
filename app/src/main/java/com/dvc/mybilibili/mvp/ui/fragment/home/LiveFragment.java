package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.support.annotation.NonNull;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.presenter.fragment.LiveFragPresenter;

import javax.inject.Inject;

public class LiveFragment extends MvpBaseFragment<LiveFragView, LiveFragPresenter> implements LiveFragView{

    @Inject
    LiveFragPresenter liveFragPresenter;

    @NonNull
    @Override
    public LiveFragPresenter createPresenter() {
        return liveFragPresenter;
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
