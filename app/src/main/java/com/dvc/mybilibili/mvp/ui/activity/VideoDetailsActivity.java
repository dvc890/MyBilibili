package com.dvc.mybilibili.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.app.utils.ParamValueUtils;
import com.dvc.mybilibili.mvp.model.api.entity.IMediaResource;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResourceV1;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.FtVideoUrlInfoBean;
import com.dvc.mybilibili.mvp.presenter.activity.VideoDetailsPresenter;
import com.dvc.mybilibili.mvp.ui.adapter.ViewPagerAdapter;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoCommentFragment;
import com.dvc.mybilibili.mvp.ui.fragment.videopage.VideoDetailPageFragment;
import com.dvc.mybilibili.player.BiliQualityPickVideoPlayer;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class VideoDetailsActivity extends MvpBaseActivity<VideoDetailsView, VideoDetailsPresenter> implements VideoDetailsView{

    @Inject
    VideoDetailsPresenter videoDetailsPresenter;
    private int aid = -1;
    private long cid = -1;
    private int player_width;
    private int player_height;
    private int player_rotate;
    private IMediaResource preload;

    @BindView(R.id.app_bar)
    AppBarLayout appBarLayout;
    @BindView(R.id.collapsing)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.player)
    BiliQualityPickVideoPlayer pickVideoPlayer;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_layout)
    View title_layout;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    private String cover;
    private VideoDetailPageFragment videoDetailPageFragment;
    private VideoCommentFragment videoCommentFragment;
    private ViewPagerAdapter viewPagerAdapter;

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
//        setSupportActionBar(toolbar);
        appBarLayout.addOnOffsetChangedListener((appBarLayout, verticalOffset) -> {
            if (verticalOffset == 0){
                gone(title_layout);
            }else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()){
                visible(title_layout);
            }
            if(pickVideoPlayer.isInPlayingState()) {
                View appBarChildAt = appBarLayout.getChildAt(0);
                AppBarLayout.LayoutParams appBarParams = (AppBarLayout.LayoutParams) appBarChildAt.getLayoutParams();
//                appBarParams.setScrollFlags( AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL
//                        | AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);// 重置折叠效果
                appBarParams.setScrollFlags(0);//这个加了之后不可滑动
                appBarChildAt.setLayoutParams(appBarParams);
            }
        });

        setupViewPager();
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
        String preload = getIntent().getStringExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_PRELOAD);
        if(!TextUtils.isEmpty(preload)) {
            if (preload.contains("\"url\":")) //old param
                this.preload = JSON.parseObject(preload, MediaResourceV1.class);
            else {
                this.preload = JSON.parseObject(preload, MediaResource.class);
            }
            this.cid = this.preload.cid;
        }
        presenter.loadVideoDetails(this.aid);
    }

    @OnClick(R.id.title_layout)
    public void OnTitleStartClick() {
        appBarLayout.setExpanded(true, true);
        pickVideoPlayer.startPlayLogic();
    }

    @OnClick(R.id.btn_back)
    public void OnBackBtnClick() {
        finish();
    }

    @Override
    public void onLoadDetailCompleted(BiliVideoDetail biliVideoDetail) {
        this.cover = biliVideoDetail.mCover;
        if(this.cid == -1)
            this.cid = biliVideoDetail.findPageByIndex(0).mCid;
        Bundle bundle = new Bundle();
        bundle.putParcelable(Keys.KEY_VIDEO_DETAILS_DATA, biliVideoDetail);
        bundle.putInt(Keys.KEY_AVID, this.aid);
        videoDetailPageFragment.setArguments(bundle);
        pickVideoPlayer.setVideoId(this.aid, this.cid);
        presenter.getVideoUrl(this.aid, this.cid, ParamValueUtils.getQN());
    }

    @Override
    public void onLoadVideoUrlCompleted(FtVideoUrlInfoBean ftVideoUrlInfoBean) {
        if(pickVideoPlayer.getCurrentState() < 0)
            pickVideoPlayer.setUp(ftVideoUrlInfoBean, true, "");
        pickVideoPlayer.loadCoverImage(this.cover);
    }

    @Override
    public void onLoadDetailFailed(BiliApiException apiException) {

    }

    @Override
    public void onLoadVideoUrlFailed(BiliApiException apiException) {

    }

    @Override
    public void onBackPressed() {
        if (pickVideoPlayer.backFromWindowFull(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(pickVideoPlayer.isInPlayingState())
            pickVideoPlayer.resumeVideo();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(pickVideoPlayer.isInPlayingState())
            pickVideoPlayer.pauseVideo();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(pickVideoPlayer.isInPlayingState())
            pickVideoPlayer.releaseAllVideos();
    }


    private void setupViewPager() {
        this.videoDetailPageFragment = new VideoDetailPageFragment();
        this.videoCommentFragment = new VideoCommentFragment();

        List<Fragment> views = new ArrayList<>(2);
        views.add(videoDetailPageFragment);
        views.add(videoCommentFragment);

        List<String> titles = new ArrayList<>();
        titles.add(getString(R.string.video_pages_title_desc));
        titles.add(getString(R.string.video_pages_title_hotfeedback));

        this.viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), viewpager, views, titles);
        tabLayout.setupWithViewPager(viewpager);
        viewpager.setCurrentItem(0);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if(i == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(Keys.KEY_AVID, aid);
                    videoCommentFragment.setArguments(bundle);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    public void updataCommentTab(int num) {
        this.tabLayout.getTabAt(1).setText(getString(R.string.comment_count_desc_fmt, num));
    }
}
