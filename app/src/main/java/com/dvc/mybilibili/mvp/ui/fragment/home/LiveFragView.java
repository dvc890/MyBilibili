package com.dvc.mybilibili.mvp.ui.fragment.home;

import com.dvc.base.BaseView;
import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;
import com.dvc.mybilibili.mvp.model.api.service.bililive.beans.BiliLiveHomePage;

public interface LiveFragView extends BaseView{
    void loadDataCompleted(BiliLiveHomePage biliLiveHomePage);

    void loadDataFailed(BiliApiException apiException);
}
