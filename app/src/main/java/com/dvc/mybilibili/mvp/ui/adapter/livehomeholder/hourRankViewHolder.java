package com.dvc.mybilibili.mvp.ui.adapter.livehomeholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.constants.Keys;
import com.dvc.mybilibili.app.utils.CommandActionUtils;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;
import com.dvc.mybilibili.mvp.ui.widget.LiveHourRankView;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

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
        rankSilver.setOnClickListener(listener);
        rankGold.setOnClickListener(listener);
        rankBronze.setOnClickListener(listener);
        addOnClickListener(more.getId());
    }

    public void convert(BiliLiveHomePage.ModuleHourRank item) {
        this.title.setText(item.getModuleInfo().getTitle());
        this.time.setText(item.getDynamicInfo().getSubTitle());
        for(BiliLiveHomePage.Card card : item.getCardList()) {
            if(card.getRank() == 1) {
                rankGold.setCardData(card);
                if(rankGold.getTag() == null) {
                    rankGold.setScale(1.3f);
                    rankGold.setTag(card);
                }
            } else if(card.getRank() == 2) {
                rankSilver.setCardData(card);
                if(rankSilver.getTag() == null) {
                    rankSilver.setTag(card);
                }
            }
            else if(card.getRank() == 3) {
                rankBronze.setCardData(card);
                if(rankBronze.getTag() == null) {
                    rankBronze.setTag(card);
                }
            }
        }
        more.setTag(item);
    }

    View.OnClickListener listener = v -> {
        if(v.getTag() == null) return;
        BiliLiveHomePage.Card mCard = (BiliLiveHomePage.Card) v.getTag();
        Map<String, String> map = new HashMap<>();
        map.put(Keys.KEY_TITLE, mCard.getTitle());
        if(!TextUtils.isEmpty(mCard.getPlayUrl()))
            map.put(Keys.KEY_PLAY_URL, URLEncoder.encode(mCard.getPlayUrl()));
        if(!TextUtils.isEmpty(mCard.getPlayUrlH265()))
            map.put(Keys.KEY_PLAY_URL_H265, URLEncoder.encode(mCard.getPlayUrlH265()));
        if(!TextUtils.isEmpty(mCard.getCover()))
            map.put(Keys.KEY_LIVE_COVER, URLEncoder.encode(mCard.getCover()));
        CommandActionUtils.start(v.getContext(),
                CommandActionUtils.createBiliUrl("https://live.bilibili.com/"+mCard.getRoomId(), map).url());

    };
}
