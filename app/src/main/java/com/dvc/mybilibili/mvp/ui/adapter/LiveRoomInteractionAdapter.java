package com.dvc.mybilibili.mvp.ui.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.dvc.mybilibili.R;
import com.dvc.mybilibili.app.utils.LiveCardSpanStringHelper;
import com.dvc.mybilibili.danmaku.live.entity.BaseMsgEntity;
import com.dvc.mybilibili.danmaku.live.entity.DanMuMSGEntity;

public class LiveRoomInteractionAdapter extends BaseQuickAdapter<BaseMsgEntity, BaseViewHolder> {

    private final int MAX_MSGLOG_NUM = 100;

    public LiveRoomInteractionAdapter() {
        super(R.layout.bili_app_list_item_live_interaction_msg);
    }

    @Override
    public void addData(@NonNull BaseMsgEntity data) {
        if(getData().size() == MAX_MSGLOG_NUM)
            getData().remove(0);
        super.addData(data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BaseMsgEntity Item) {
        if(Item instanceof DanMuMSGEntity) {
            DanMuMSGEntity item = (DanMuMSGEntity) Item;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if(item.userisadmin) spannableStringBuilder.append(LiveCardSpanStringHelper.get().builderAdmin(false, helper.itemView.getContext()));
            spannableStringBuilder.append(LiveCardSpanStringHelper.get().builderVip(item.userismvip, item.userisyvip));
            spannableStringBuilder.append(LiveCardSpanStringHelper.get().builderGuard(item.userguardlevel));
            if (item.fansMedal != null)
                spannableStringBuilder.append(LiveCardSpanStringHelper.get().builderMedal(item.fansMedal));
            spannableStringBuilder.append(LiveCardSpanStringHelper.get().builderUserLevel(item.userlevelcolor, item.userlevel));
            spannableStringBuilder.append(item.username + ": ");
            SpannableStringBuilder stringBuilder=new SpannableStringBuilder(item.text);
            stringBuilder.setSpan(new ForegroundColorSpan(Color.BLACK),0,stringBuilder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringBuilder.append(stringBuilder);
            ((TextView)helper.getView(R.id.text)).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
    }
}
