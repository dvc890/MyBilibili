package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.presenter.activity.VideoDetailsPresenter;
import com.dvc.mybilibili.player.BiliQualityPickVideoPlayer;

import javax.inject.Inject;

import butterknife.BindView;

public class VideoDetailsActivity extends MvpBaseActivity<VideoDetailsView, VideoDetailsPresenter> implements VideoDetailsView{

    @Inject
    VideoDetailsPresenter videoDetailsPresenter;
    private int aid;
    private int player_width;
    private int player_height;
    private int player_rotate;
    private MediaResource preload;

    @BindView(R.id.app_bar)
    AppBarLayout appBarLayout;
    @BindView(R.id.collapsing)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.player)
    BiliQualityPickVideoPlayer pickVideoPlayer;
    @BindView(R.id.title_layout)
    View title_layout;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    private String cover;

    @NonNull
    @Override
    public VideoDetailsPresenter createPresenter() {
        return videoDetailsPresenter;
    }

    @Override
    public int getContentViewResID() {
        return R.layout.bili_app_activity_videodetails;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadDatas() {
        this.aid = getIntent().getIntExtra(Keys.KEY_AVID, -1);
        if(this.aid == -1) {
            finish();
            return;
        }
        this.player_width = getIntent().getIntExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_WIDTH, -1);
        this.player_height = getIntent().getIntExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_HEIGHT, -1);
        this.player_rotate = getIntent().getIntExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_ROTATE, -1);
        this.cover = getIntent().getStringExtra(Keys.KEY_VIDEO_DETAILS_COVER);
        this.preload = JSON.parseObject(getIntent().getStringExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_PRELOAD), MediaResource.class);

        pickVideoPlayer.setUp(this.preload, true, "");

        if(TextUtils.isEmpty(this.cover))
            presenter.loadVideoDetails(this.aid);
        else
            pickVideoPlayer.loadCoverImage(this.cover);
    }

    @Override
    public void onLoadDetailCompleted(BiliVideoDetail biliVideoDetail) {
        pickVideoPlayer.loadCoverImage(biliVideoDetail.mCover);
    }

    @Override
    public void onLoadDetailFailed(BiliApiException apiException) {

    }
}
