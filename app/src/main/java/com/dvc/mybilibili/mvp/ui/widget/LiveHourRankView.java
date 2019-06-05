package com.dvc.mybilibili.mvp.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.glide.GlideUtils;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.vondear.rxtool.RxImageTool;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

public class LiveHourRankView extends FrameLayout {
    @BindView(R.id.avatar_crown)
    public ImageView avatarCrown;
    @BindView(R.id.avatar_face)
    public CircleImageView avatarFace;
    @BindView(R.id.avatar_empty)
    public TextView avatarEmpty;
    @BindView(R.id.live_status)
    public TextView liveStatus;
    @BindView(R.id.avatar_nickname)
    public TextView avatarNickname;
    @BindView(R.id.live_area)
    public TextView liveArea;
    @BindView(R.id.avatar_frame)
    public RelativeLayout avatarFrame;

    public LiveHourRankView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public LiveHourRankView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LiveHourRankView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    /* renamed from: a */
    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.bili_live_hour_rank_item, this);
        this.avatarNickname.setText("- -");
        this.liveArea.setText("- -");
    }

    /* renamed from: a */
    public void setCardData(BiliLiveHomePage.Card card) {
        if(card != null) GlideUtils.Circle2ImageView(this.avatarFace, card.getAnchorFace());
        this.avatarEmpty.setVisibility(card == null ? VISIBLE : GONE);
        this.liveStatus.setVisibility((card != null && card.getLiveStatus() == 1)? VISIBLE : GONE);
        this.avatarNickname.setText(card != null ? card.getAnchorName() : "- -");
        this.liveArea.setText(card != null ? card.getAreaName() : "- -");
        this.setBorderColor(card.getRank());
        this.setImage(card.getRank());
    }

    /* renamed from: a mo29950a*/
    public void setScale(float f) {
        MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.avatarFace.getLayoutParams();
        layoutParams.height = (int) (((float) layoutParams.height) * f);
        layoutParams.width = (int) (((float) layoutParams.width) * f);
        this.avatarFace.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.avatarFrame.getLayoutParams();
        if (layoutParams2 instanceof MarginLayoutParams) {
            marginLayoutParams = (MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams = new MarginLayoutParams(layoutParams2);
        }
        marginLayoutParams.setMargins(RxImageTool.dip2px(4.0f), RxImageTool.dip2px(18.0f), RxImageTool.dip2px(4.0f), 0);
        this.avatarFrame.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a mo29949a*/
    public LiveHourRankView setBorderColor(int rank) {
        int resid = R.color.live_hour_rank_bronze;
        if(rank == 1) resid = R.color.live_hour_rank_gold;
        if(rank == 2) resid = R.color.live_hour_rank_silver;
        this.avatarFace.setBorderColor(getContext().getResources().getColor(resid));
        this.avatarFace.setBorderWidth(RxImageTool.dip2px(2f));
        return this;
    }

    /* renamed from: b mo29952b*/
    public LiveHourRankView setImage(int rank) {
        int resid = R.drawable.ic_live_crown_bronze;
        if(rank == 1) resid = R.drawable.ic_live_crown_gold;
        if(rank == 2) resid = R.drawable.ic_live_crown_silver;
        this.avatarCrown.setImageResource(resid);
        return this;
    }
}
