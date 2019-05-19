package com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.modelv2;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.pegasus.entity.model.BasicIndexItem;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class ChannelFeedV2 {
    @Nullable
    @JSONField(name = "feed")
    public List<BasicIndexItem> feedList;
    @Nullable
    @JSONField(name = "topic")
    public TopStickItem topStick;

    public static ChannelFeedV2 newInstance() {
        ChannelFeedV2 channelFeedV2 = new ChannelFeedV2();
        channelFeedV2.feedList = new ArrayList();
        channelFeedV2.topStick = null;
        return channelFeedV2;
    }
}
