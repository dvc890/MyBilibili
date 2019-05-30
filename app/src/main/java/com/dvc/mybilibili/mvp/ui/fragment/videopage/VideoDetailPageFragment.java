package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dvc.base.MvpBaseFragment;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.presenter.fragment.VideoDetailPagePresenter;
import com.dvc.mybilibili.mvp.ui.adapter.VideoDetailRelatedAdapter;

import javax.inject.Inject;

public class VideoDetailPageFragment extends MvpBaseFragment<VideoDetailPageFragView, VideoDetailPagePresenter> implements VideoDetailPageFragView {

    @Inject
    VideoDetailPagePresenter videoDetailPagePresenter;

    VideoDetailPageHolder holder;
    BiliVideoDetail detail;


    @Inject
    public VideoDetailRelatedAdapter relatedAdapter;

    private int aid;

    @NonNull
    @Override
    public VideoDetailPagePresenter createPresenter() {
        return videoDetailPagePresenter;
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        this.detail = args.getParcelable(Keys.KEY_VIDEO_DETAILS_DATA);
        this.aid = args.getInt(Keys.KEY_AVID, -1);
        if(detail == null) {
            presenter.loadVideoDetails(this.aid);
        }else
            loadDatas();
        super.setArguments(args);
    }

    @Override
    public void onDestroy() {
        holder.UnBindView();
        super.onDestroy();
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_fragment_video_page_list;
    }

    @Override
    protected void initViews() {
        if(holder == null) {
            holder = new VideoDetailPageHolder(this);
            relatedAdapter.setOnItemClickListener((adapter, view, position) -> {
                BiliVideoDetail detail = (BiliVideoDetail) adapter.getItem(position);
                CommandActionUtils.start(getActivity(), detail.mUri);
            });
        }
    }

    @Override
    protected void loadDatas() {
        if(detail != null) {
            holder.init(detail);
            holder.recommendRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
            relatedAdapter.bindToRecyclerView(holder.recommendRecyclerview);
            relatedAdapter.setNewData(detail.getPlayableRelatedVideo());
        }
    }

    @Override
    public void onLoadDetailCompleted(BiliVideoDetail biliVideoDetail) {
        this.detail = biliVideoDetail;
        loadDatas();
    }

    @Override
    public void onLoadDetailFailed(BiliApiException apiException) {

    }
}
