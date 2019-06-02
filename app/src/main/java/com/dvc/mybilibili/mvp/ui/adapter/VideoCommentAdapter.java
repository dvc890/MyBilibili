package com.dvc.mybilibili.mvp.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.Space;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.base.utils.Reflect;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.app.utils.DateTimeFormatUtils;
import com.dvc.mybilibili.mvp.model.api.service.comment.entity.BiliComment;
import com.dvc.mybilibili.mvp.ui.widget.CommentReplyView;
import com.dvc.mybilibili.mvp.ui.widget.PendantAvatarLayout;
import com.shuyu.textutillib.RichTextView;
import com.vondear.rxtool.RxImageTool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoCommentAdapter extends BaseMultiItemQuickAdapter<BiliComment, BaseViewHolder> {

    private final int WF_TYPE = 1111;
    private final int NM_TYPE = 2222;

    public VideoCommentAdapter(List<BiliComment> data) {
        super(data);
        addItemType(WF_TYPE, R.layout.bili_app_list_item_comment2_primary_comment_with_follow);//has followbtn
        addItemType(NM_TYPE, R.layout.bili_app_list_item_comment2_primary_comment_normal);//not followbtn
    }

    @Override
    protected void convert(BaseViewHolder helper, BiliComment item) {
        switch (item.getItemType()) {
            case WF_TYPE://has followbtn
                ((hasFollowViewHolder)helper).convert(item);
                break;
            case NM_TYPE://not has followbtn
                ((notHasFollowViewHolder) helper).convert(item);
                break;
        }
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case WF_TYPE://has followbtn
                return new hasFollowViewHolder(getItemView(Reflect.on(this).call("getLayoutId", viewType).get(), parent));
            case NM_TYPE://not has followbtn
                return new notHasFollowViewHolder(getItemView(Reflect.on(this).call("getLayoutId", viewType).get(), parent));
        }
        return super.onCreateViewHolder(parent, viewType);
    }

    private View headerView = null;
    public void setUpperItem(BiliComment biliComment) {
        if(biliComment == null) return;
        if(headerView == null) headerView = mLayoutInflater.inflate(R.layout.bili_app_list_item_comment2_primary_comment_with_follow, null);
        removeHeaderView(headerView);
        new hasFollowViewHolder(headerView).convert(biliComment);
        addHeaderView(headerView);
    }

    public void setNewHotItems(List<BiliComment> hots) {
        if(hots == null || hots.size() == 0) return;
        for(BiliComment comment : hots)
            comment.ItemType = WF_TYPE;
        setNewData(hots);
    }

    public void addHotItems(List<BiliComment> hots) {
        if(hots == null || hots.size() == 0) return;
        for(BiliComment comment : hots)
            comment.ItemType = WF_TYPE;
        addData(hots);
    }

    public void setNewReplies(List<BiliComment> replies) {
        if(replies == null || replies.size() == 0) return;
        for(BiliComment comment : replies)
            comment.ItemType = NM_TYPE;
        setNewData(replies);
    }

    public void addReplies(List<BiliComment> replies) {
        if(replies == null || replies.size() == 0) return;
        for(BiliComment comment : replies)
            comment.ItemType = NM_TYPE;
        addData(replies);
    }

    class notHasFollowViewHolder extends BaseViewHolder {
        @BindView(R.id.avatar_layout)
        PendantAvatarLayout avatarLayout;
        @BindView(R.id.fans)
        TextView fans;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.level)
        ImageView level;
        @BindView(R.id.name_layout)
        LinearLayout nameLayout;
        @BindView(R.id.time)
        TextView time;
        @BindView(R.id.floor)
        TextView floor;
        @BindView(R.id.label_top)
        TextView labelTop;
        @BindView(R.id.message)
        RichTextView message;
        @BindView(R.id.vote_image)
        ImageView voteImage;
        @BindView(R.id.vote_btn)
        TextView voteBtn;
        @BindView(R.id.vote_title)
        TextView voteTitle;
        @BindView(R.id.vote_number)
        TextView voteNumber;
        @BindView(R.id.vote_card_layout)
        ConstraintLayout voteCardLayout;
        @BindView(R.id.label_bottom)
        TextView labelBottom;
        @BindView(R.id.space)
        Space space;
        @BindView(R.id.action1)
        TextView like;
        @BindView(R.id.action2)
        TextView dislike;
        @BindView(R.id.action3)
        TextView share;
        @BindView(R.id.menu)
        FrameLayout menu;
        @BindView(R.id.upper_like)
        TextView upperLike;
        @BindView(R.id.high_light)
        ViewStub highLight;
        @BindView(R.id.secondary)
        ViewStub secondary;
        CommentReplyView replyView;

        public notHasFollowViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void convert(BiliComment item) {
            avatarLayout.setAvatarUrl(item.getFace());
            avatarLayout.setPendantUrl(item.getPendant().image);
            avatarLayout.setVerify(item.getOfficialVerify().type == 1, item.getOfficialVerify().type >= 0, PendantAvatarLayout.VerifySize.SMALL);
            fans.setVisibility(View.GONE);
            if(item.isVip()) name.setTextColor(Color.parseColor("#ff4081"));
            else name.setTextColor(Color.parseColor("#999999"));
            name.setText(item.getNickName());
            setLevelImage(level, item.getCurrentLevel());
            floor.setText("#"+item.mFloor);floor.setVisibility(View.VISIBLE);
            time.setText(DateTimeFormatUtils.getTimeStr(time.getContext(), item.mPubTimeMs));
            if (item.isTop()) {
                labelTop.setText(R.string.stick);labelTop.setVisibility(View.VISIBLE);
            } else {
                labelTop.setText("");labelTop.setVisibility(View.GONE);
            }
            message.setText(item.getMsg());
            voteCardLayout.setVisibility(item.mContent.mVote == null? View.GONE: View.VISIBLE);
            like.setText(item.mRatingCount+"");
            Drawable drawable = dislike.getResources().getDrawable(R.drawable.selector_vector_dislike);
            drawable.setBounds(0, 0, RxImageTool.dip2px(16), RxImageTool.dip2px(16));
            dislike.setCompoundDrawables(drawable, null, null, null);
            upperLike.setVisibility(item.isUpperLiked()?View.VISIBLE:View.GONE);

            if(item.mReply != null && item.mReply.size() > 0) {
                if(replyView == null) {
                    replyView = (CommentReplyView) secondary.inflate();
                    replyView.setId(R.id.replies);
                    replyView.setTag(item);
                }
                replyView.setData(item.mReply, new CommentReplyView.BiliCommentReplyViewPresenter(item));
                replyView.setMoreOnClickListener(v -> {
                    if(getOnItemChildClickListener() != null) {
                        getOnItemChildClickListener().onItemChildClick(VideoCommentAdapter.this, v, getData().indexOf(item));
                    }
                });
                replyView.setVisibility(View.VISIBLE);
            }else {
                if(replyView != null)
                    replyView.setVisibility(View.GONE);
            }

        }
    }

    class hasFollowViewHolder extends BaseViewHolder{
        @BindView(R.id.avatar_layout)
        PendantAvatarLayout avatarLayout;
        @BindView(R.id.fans)
        TextView fans;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.level)
        ImageView level;
        @BindView(R.id.follow)
        TextView follow;
        @BindView(R.id.floor)
        TextView floor;
        @BindView(R.id.time)
        TextView time;
        @BindView(R.id.label_top)
        TextView labelTop;
        @BindView(R.id.message)
        RichTextView message;
        @BindView(R.id.vote_image)
        ImageView voteImage;
        @BindView(R.id.vote_btn)
        TextView voteBtn;
        @BindView(R.id.vote_title)
        TextView voteTitle;
        @BindView(R.id.vote_number)
        TextView voteNumber;
        @BindView(R.id.vote_card_layout)
        ConstraintLayout voteCardLayout;
        @BindView(R.id.label_bottom)
        TextView labelBottom;
        @BindView(R.id.space)
        Space space;
        @BindView(R.id.action1)
        TextView like;
        @BindView(R.id.action2)
        TextView dislike;
        @BindView(R.id.action3)
        TextView share;
        @BindView(R.id.menu)
        FrameLayout menu;
        @BindView(R.id.upper_like)
        TextView upperLike;
        @BindView(R.id.high_light)
        ViewStub highLight;
        @BindView(R.id.secondary)
        ViewStub secondary;
        CommentReplyView replyView;

        public hasFollowViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void convert(BiliComment item) {
            avatarLayout.setAvatarUrl(item.getFace());
            avatarLayout.setPendantUrl(item.getPendant().image);
            avatarLayout.setVerify(item.getOfficialVerify().type == 1, item.getOfficialVerify().type >= 0, PendantAvatarLayout.VerifySize.SMALL);
            fans.setVisibility(View.GONE);
            if(item.isVip()) name.setTextColor(Color.parseColor("#ff4081"));
            else name.setTextColor(Color.parseColor("#999999"));
            name.setText(item.getNickName());
            setLevelImage(level, item.getCurrentLevel());
            if(item.isFollowed()) follow.setText(R.string.followed);
            else follow.setText(R.string.to_follow_without_plus);
            floor.setText("#"+item.mFloor);floor.setVisibility(View.VISIBLE);
            time.setText(DateTimeFormatUtils.getTimeStr(time.getContext(), item.mPubTimeMs));
            if (item.isTop()) {
                labelTop.setText(R.string.stick);labelTop.setVisibility(View.VISIBLE);
            } else {
                labelTop.setText("");labelTop.setVisibility(View.GONE);
            }
            message.setText(item.getMsg());
            voteCardLayout.setVisibility(item.mContent.mVote == null? View.GONE: View.VISIBLE);
            like.setText(item.mRatingCount+"");
            Drawable drawable = dislike.getResources().getDrawable(R.drawable.selector_vector_dislike);
            drawable.setBounds(0, 0, RxImageTool.dip2px(16), RxImageTool.dip2px(16));
            dislike.setCompoundDrawables(drawable, null, null, null);
            upperLike.setVisibility(item.isUpperLiked()?View.VISIBLE:View.GONE);
            if(item.mReply != null && item.mReply.size() > 0) {
                if(replyView == null) {
                    replyView = (CommentReplyView) secondary.inflate();
                    replyView.setId(R.id.replies);
                    replyView.setTag(item);
                }
                replyView.setData(item.mReply, new CommentReplyView.BiliCommentReplyViewPresenter(item));
                replyView.setMoreOnClickListener(v -> {
                    if(getOnItemChildClickListener() != null) {
                        v.setTag(item);
                        getOnItemChildClickListener().onItemChildClick(VideoCommentAdapter.this, v, getData().indexOf(item));
                    }
                });
                replyView.setVisibility(View.VISIBLE);
            }else {
                if(replyView != null)
                    replyView.setVisibility(View.GONE);
            }
        }
    }

    private void setLevelImage(ImageView view, int lv) {
        int resid = R.drawable.ic_lv0;
        switch (lv) {
            case 1:
                resid = R.drawable.ic_lv1;
                break;
            case 2:
                resid = R.drawable.ic_lv2;
                break;
            case 3:
                resid = R.drawable.ic_lv3;
                break;
            case 4:
                resid = R.drawable.ic_lv4;
                break;
            case 5:
                resid = R.drawable.ic_lv5;
                break;
            case 6:
                resid = R.drawable.ic_lv6;
                break;
            case 7:
                resid = R.drawable.ic_lv7;
                break;
            case 8:
                resid = R.drawable.ic_lv8;
                break;
            case 9:
                resid = R.drawable.ic_lv9;
                break;
        }
        view.setImageResource(resid);
    }
}
