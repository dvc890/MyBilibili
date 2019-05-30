package com.dvc.mybilibili.mvp.ui.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.vondear.rxtool.RxImageTool;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoDetailRelatedAdapter extends BaseQuickAdapter<BiliVideoDetail, VideoDetailRelatedAdapter.VideoDetailRelatedViewHolder> {

    @Inject
    public VideoDetailRelatedAdapter() {
        super(R.layout.bili_app_list_item_video_detail_related);
    }

    @Override
    protected void convert(VideoDetailRelatedViewHolder helper, BiliVideoDetail item) {
        GlideUtils.RoundedCorners2ImageView(helper.cover, item.mCover, RxImageTool.dip2px(2f));
        helper.title.setText(item.mTitle);
        helper.infoViews.setText(item.mStat.mPlays);
        helper.infoDanmakus.setText(item.mStat.mDanmakus);
        helper.author.setText(item.getAuthor());
    }

    public class VideoDetailRelatedViewHolder extends BaseViewHolder{
        @BindView(R.id.cover)
        ImageView cover;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.info_views)
        TextView infoViews;
        @BindView(R.id.info_danmakus)
        TextView infoDanmakus;
        @BindView(R.id.author)
        TextView author;
        @BindView(R.id.more)
        FrameLayout more;

        public VideoDetailRelatedViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
