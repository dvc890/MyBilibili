package com.dvc.mybilibili.mvp.ui.fragment.videopage;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvc.base.BaseMvpHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.video.entity.BiliVideoDetail;
import com.dvc.mybilibili.mvp.ui.widget.PendantAvatarLayout;

import butterknife.BindView;

public class VideoDetailPageHolder extends BaseMvpHolder{
    @BindView(R.id.avatar_layout)
    PendantAvatarLayout avatarLayout;
    @BindView(R.id.title)
    TextView name;
    @BindView(R.id.online_status)
    TextView onlineStatus;
    @BindView(R.id.fans)
    TextView fans;
    @BindView(R.id.follow)
    TextView follow;
    @BindView(R.id.tvWarning)
    TextView tvWarning;
    @BindView(R.id.warning)
    LinearLayout warning;
    @BindView(R.id.desc)
    TextView desc;
    @BindView(R.id.vtitle)
    TextView title;
    @BindView(R.id.views)
    TextView views;
    @BindView(R.id.danmakus)
    TextView danmakus;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.history_rank)
    TextView historyRank;
    @BindView(R.id.avid_title)
    TextView avidTitle;
    @BindView(R.id.forbidden)
    TextView forbidden;
    @BindView(R.id.recommend_icon)
    ImageView recommendIcon;
    @BindView(R.id.recommend_num)
    TextView recommendNum;
    @BindView(R.id.frame1)
    LinearLayout frame1;
    @BindView(R.id.dislike_icon)
    ImageView dislikeIcon;
    @BindView(R.id.dislike_num)
    TextView dislikeNum;
    @BindView(R.id.frame6)
    LinearLayout frame6;
    @BindView(R.id.coin_icon)
    ImageView coinIcon;
    @BindView(R.id.coin_num)
    TextView coinNum;
    @BindView(R.id.frame2)
    LinearLayout frame2;
    @BindView(R.id.favorite_icon)
    ImageView favoriteIcon;
    @BindView(R.id.favorite_num)
    TextView favoriteNum;
    @BindView(R.id.frame3)
    LinearLayout frame3;
    @BindView(R.id.share_icon)
    ImageView shareIcon;
    @BindView(R.id.share_num)
    TextView shareNum;
    @BindView(R.id.frame5)
    LinearLayout frame5;
    @BindView(R.id.tag_recyclerview)
    RecyclerView tagRecyclerview;
    @BindView(R.id.recommend_recyclerview)
    RecyclerView recommendRecyclerview;

    public VideoDetailPageHolder(Fragment fragment) {
        super(fragment);
    }

    public void init(BiliVideoDetail detail) {
        avatarLayout.setAvatarUrl(detail.getAvatar());
        avatarLayout.setVerify(detail.ownerExt.officialVerify.type == 1, detail.ownerExt.officialVerify.type >= 0, PendantAvatarLayout.VerifySize.SMALL);

        name.setText(detail.getAuthor());

        fans.setText(getContext().getString(R.string.bangumi_detail_upper_fan, detail.ownerExt.fans+""));
        title.setText(detail.mTitle);
        views.setText(detail.mStat.mPlays);
        danmakus.setText(detail.mStat.mDanmakus);
//        time.setText();
        avidTitle.setText("AV"+detail.mAvid);
        desc.setText(detail.mDescription);
        forbidden.setVisibility(View.VISIBLE);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.ugcvideo_ic_info_forbidden);
        drawable.setBounds(0, 0, (int) forbidden.getTextSize(), (int) forbidden.getTextSize());
        forbidden.setCompoundDrawables(drawable, null, null, null);

        if(detail.mStat.mLikes > 0) recommendNum.setText(detail.mStat.mLikes+"");
        if(detail.mStat.mDislikes > 0) dislikeNum.setText(detail.mStat.mDislikes+"");
        if(detail.mStat.mCoins > 0) coinNum.setText(detail.mStat.mCoins+"");
        if(detail.mStat.mFavorites > 0) favoriteNum.setText(detail.mStat.mFavorites+"");
        if(detail.mStat.mShares > 0) shareNum.setText(detail.mStat.mShares+"");
    }
}
