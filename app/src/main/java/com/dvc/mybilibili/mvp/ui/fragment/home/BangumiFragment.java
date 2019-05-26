package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.presenter.fragment.BangumiFragPresenter;

import javax.inject.Inject;

public class BangumiFragment extends MvpBaseFragment<BangumiFragView, BangumiFragPresenter> implements BangumiFragView{
    public class BangumiType {
        public static final int ANIME = 1;
        public static final int MOVIE = 2;
    }

    @Inject
    public BangumiFragPresenter bangumiFragPresenter;

    private int mType = 1;

    public void setType(int type) {
        Bundle bundle = new Bundle();
        bundle.putInt(Keys.KEY_TAG_NAME, type);
        setArguments(bundle);
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        this.mType = args.getInt(Keys.KEY_TAG_NAME, 1);
        super.setArguments(args);
    }

    @NonNull
    @Override
    public BangumiFragPresenter createPresenter() {
        return bangumiFragPresenter;
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
}
