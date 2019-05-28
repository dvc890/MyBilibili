package com.dvc.mybilibili.mvp.ui.activity;

import android.support.annotation.NonNull;

import com.alibaba.fastjson.JSON;
import com.dvc.base.MvpBaseActivity;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;
import com.dvc.mybilibili.mvp.presenter.activity.VideoDetailsPresenter;

import javax.inject.Inject;

public class VideoDetailsActivity extends MvpBaseActivity<VideoDetailsView, VideoDetailsPresenter> implements VideoDetailsView{

    @Inject
    VideoDetailsPresenter videoDetailsPresenter;
    private int aid;
    private int player_width;
    private int player_height;
    private int player_rotate;
    private MediaResource preload;

    @NonNull
    @Override
    public VideoDetailsPresenter createPresenter() {
        return videoDetailsPresenter;
    }

    @Override
    public int getContentViewResID() {
        return 0;
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
        this.preload = JSON.parseObject(getIntent().getStringExtra(Keys.KEY_VIDEO_DETAILS_PLAYER_PRELOAD), MediaResource.class);

        presenter.loadVideoDetails(this.aid);
    }
}
