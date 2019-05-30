package com.dvc.mybilibili.player.popup;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;

import java.util.ArrayList;
import java.util.List;

import razerdp.basepopup.BasePopupWindow;

public class QualityPickPopup extends BasePopupWindow {

    private RecyclerView recyclerView;
    private BaseQuickAdapter adapter;

    private List<Integer> support_quality;
    private int selectedPos;

    public QualityPickPopup(Context context) {
        super(context);
        this.setPopupGravity(Gravity.RIGHT);
        this.setBlurBackgroundEnable(false);
        this.setBackground(null);
        this.recyclerView = this.findViewById(R.id.list_recyclerview);
        this.adapter = new BaseQuickAdapter<String, BaseViewHolder>(R.layout.bili_item_quality) {
            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.quality_desc, item);
                if(selectedPos == adapter.getData().indexOf(item)
                    || selectedPos == -1 && item.equals(getContext().getString(R.string.player_quality_switch_mode_auto1))) {
                    helper.setTextColor(R.id.quality_desc, Color.parseColor("#d85d84"));
                }
                if(getQuality(adapter.getData().indexOf(item)) > 96) {//需要大会员
//                    helper.setText(R.id.need_tips, item);
                }else if(getQuality(adapter.getData().indexOf(item)) > 64) {//需要登录

                }
            }
        };
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        this.adapter.bindToRecyclerView(this.recyclerView);
    }

    @Override
    public View onCreateContentView() {
        return createPopupById(R.layout.bili_popup_quality_pick);
    }

    private int getQuality(int position) {
        try {
            return this.support_quality.get(position);
        }catch (Exception e) {
            return 0;
        }
    }

    public void setSelected(int selectedPos) {
        this.selectedPos = selectedPos;
    }

    public void setData(List<Integer> support_quality, List<String> support_description) {
        this.support_quality = support_quality;
        if(!support_description.contains(getContext().getString(R.string.player_quality_switch_mode_auto1)))
            support_description.add(getContext().getString(R.string.player_quality_switch_mode_auto1));
        adapter.setNewData(support_description);
    }

    public void setOnItemClickListener(BaseQuickAdapter.OnItemClickListener listener){
        adapter.setOnItemClickListener(listener);
    }
}
