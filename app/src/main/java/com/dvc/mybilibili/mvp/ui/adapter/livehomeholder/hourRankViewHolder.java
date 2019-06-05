package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.ui.widget.LiveHourRankView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class hourRankViewHolder extends BaseViewHolder {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.more)
    TextView more;
    @BindView(R.id.rank_silver)
    LiveHourRankView rankSilver;
    @BindView(R.id.rank_gold)
    LiveHourRankView rankGold;
    @BindView(R.id.rank_bronze)
    LiveHourRankView rankBronze;

    public hourRankViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void convert(BiliLiveHomePage.ModuleHourRank item) {
        this.title.setText(item.getModuleInfo().getTitle());
        this.time.setText(item.getDynamicInfo().getSubTitle());
        for(BiliLiveHomePage.Card card : item.getCardList()) {
            if(card.getRank() == 1) {
                rankGold.setCardData(card);
                rankGold.setScale(1.3f);
            } else if(card.getRank() == 2)
                rankSilver.setCardData(card);
            else if(card.getRank() == 3)
                rankBronze.setCardData(card);
        }
        if(more.getTag() == null) {
            more.setTag(item);
            addOnClickListener(more.getId());
        }
    }
}
