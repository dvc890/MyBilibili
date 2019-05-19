package com.dvc.mybilibili.mvp.model;

import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.pref.PreferencesHelper;

public interface DataManager {
    ApiHelper getApiHelper();

//    DbHelper getDbHelper();

    PreferencesHelper getPrefHelper();

    IAccountHelper getUser();
}
