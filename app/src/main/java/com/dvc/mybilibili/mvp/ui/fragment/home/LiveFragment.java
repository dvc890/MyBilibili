package com.dvc.mybilibili.mvp.ui.fragment.home;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
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
import butterknife.OnClick;

import static com.chad.library.adapter.base.BaseQuickAdapter.SLIDEIN_BOTTOM;

public class LiveFragment extends MvpBaseFragment<LiveFragView, LiveFragPresenter> implements LiveFragView, OnRefreshListener, BaseQuickAdapter.OnItemChildClickListener {

    @Inject
    LiveFragPresenter liveFragPresenter;

    @BindView(R.id.mSwipeRefreshLayout)
    SmartRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;

    private LiveHomeAdapter liveHomeAdapter;
    long tmpTime;
    private int relation_page = 1;
    private int rec_page = 1;
    private int recom_page = 1;

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
        this.liveHomeAdapter.setOnItemChildClickListener(this);
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
        recom_page = 1;
        if (SystemClock.uptimeMillis() - tmpTime > 60000 * 2) {
            onRefresh(mSwipeRefreshLayout);
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
        recom_page = 1;
        presenter.loadData(relation_page, rec_page);
    }

    @OnClick(R.id.btn_live)
    public void onLiveClicked() {
        RxToast.normal("后续开发");
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        BiliLiveHomePage.ModuleUnit moduleUnit;
        switch (view.getId()) {
            case R.id.more://小时榜 查看更多
                moduleUnit = (BiliLiveHomePage.ModuleUnit) view.getTag();
                CommandActionUtils.toWeb(getContext(), moduleUnit.getModuleInfo().getTitle(), moduleUnit.getModuleInfo().getLink());
                break;
            case R.id.refresh_group://推荐分类 换一换
                Animation rotate = AnimationUtils.loadAnimation(getContext(), R.anim.rotate_360);
                view.findViewById(R.id.icon_refresh).setAnimation(rotate);
                view.findViewById(R.id.icon_refresh).startAnimation(rotate);
                moduleUnit = (BiliLiveHomePage.ModuleUnit) view.getTag();
                presenter.refreshModuleData(moduleUnit.getModuleInfo().getId(), null, recom_page++, moduleRooms -> {
                    rotate.cancel();
                    if(moduleRooms == null) return;
                    for(int pos = 0; pos < liveHomeAdapter.getData().size(); pos++) {
                        if(moduleUnit.getModuleInfo().getType() == liveHomeAdapter.getData().get(pos).getModuleInfo().getType()) {
                            adapter.setData(pos, moduleRooms);
                            break;
                        }
                    }
                    if(recom_page == 5) recom_page = 1;
                });
                break;
            case R.id.text://推荐分类 查看更多推荐直播
                break;
            case R.id.text_more://分类 查看更多
                break;
        }
    }
}
