package com.dvc.mybilibili.mvp.ui.fragment.live.holder;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;

import com.dvc.base.BaseMvpHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.app.utils.LiveCardSpanStringHelper;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.dvc.mybilibili.mvp.ui.fragment.live.LiveRoomInteractionView;
import com.dvc.mybilibili.mvp.ui.widget.LiveMyUserCardEntrance;
import com.dvc.mybilibili.mvp.ui.widget.PendantAvatarLayout;

import butterknife.BindView;

public class LiveRoomInteractionHolder extends BaseMvpHolder<LiveRoomInteractionView> {

    @BindView(R.id.ll_new_msg)
    public LinearLayout llNewMsg;

    @BindView(R.id.avatar_layout)
    PendantAvatarLayout avatar;
    @BindView(R.id.author)
    TextView author;
    @BindView(R.id.level)
    TextView level;
    @BindView(R.id.live_operation_rank)
    TextView liveOperationRank;
    @BindView(R.id.round_play)
    TextView roundPlay;
    @BindView(R.id.info_online)
    public
    TextView infoOnline;
    @BindView(R.id.attentions)
    TextView attentions;
    @BindView(R.id.area_name)
    TextView areaName;
    @BindView(R.id.add_to_attention)
    TextView addToAttention;

    @BindView(R.id.layout_interaction)
    RelativeLayout layoutInteraction;
    @BindView(R.id.myUserCardEntrance)
    LiveMyUserCardEntrance myUserCardEntrance;
    @BindView(R.id.medal_action)
    TextView medalAction;
    @BindView(R.id.input)
    TextView input;
    @BindView(R.id.live_input_banner_layout)
    LinearLayout liveInputBannerLayout;
    @BindView(R.id.action_button)
    ImageView actionButton;

    public LiveRoomInteractionHolder(Fragment fragment) {
        super(fragment);
    }

    public void convertData(BiliLiveRoomInfo biliLiveRoomInfo) {
        avatar.setAvatarUrl(biliLiveRoomInfo.anchorInfo.baseInfo.face);
        avatar.setVerify(true, true, PendantAvatarLayout.VerifySize.SMALL);
        author.setText(LiveCardSpanStringHelper.get().buildName(biliLiveRoomInfo.anchorInfo.baseInfo.uName, 0));
        level.setText(LiveCardSpanStringHelper.get().builderUpLevel(biliLiveRoomInfo.anchorInfo.liveInfo.levelColor, biliLiveRoomInfo.anchorInfo.liveInfo.level, getContext()));
        if(!TextUtils.isEmpty(biliLiveRoomInfo.rankInfo.rankDesc)) {
            liveOperationRank.setText(biliLiveRoomInfo.rankInfo.rankDesc);
            liveOperationRank.setTextColor(Color.parseColor(biliLiveRoomInfo.rankInfo.color));
            liveOperationRank.setVisibility(View.VISIBLE);
        } else liveOperationRank.setVisibility(View.GONE);
//        roundPlay 直播就隐藏
        if(biliLiveRoomInfo.essentialInfo != null && biliLiveRoomInfo.essentialInfo.online > 0) {
            infoOnline.setText(getContext().getString(R.string.live_info_online, biliLiveRoomInfo.essentialInfo.online + ""));
            infoOnline.setVisibility(View.VISIBLE);
        }
        attentions.setText(getContext().getString(R.string.live_fans_num, biliLiveRoomInfo.anchorInfo.relationInfo.attention+""));
        attentions.setVisibility(View.VISIBLE);
        areaName.setText(biliLiveRoomInfo.essentialInfo.areaName);
        areaName.setVisibility(View.VISIBLE);
//        addToAttention 是否有关注
        if(BiliApplication.getUser().isLogin())
            myUserCardEntrance.avatarUrl(BiliApplication.getUser().getAccountInfo().getAvatar(), true);
    }

    public void showNewMsgTips() {
        llNewMsg.setVisibility(View.VISIBLE);
    }

    public void hideNewMsgTips() {
        llNewMsg.setVisibility(View.GONE);
    }
}
