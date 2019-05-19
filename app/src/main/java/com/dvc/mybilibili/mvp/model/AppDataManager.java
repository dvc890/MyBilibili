package com.dvc.mybilibili.mvp.model;

import android.content.Context;

import com.dvc.base.di.ApplicationContext;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.ApiHelper;
import com.dvc.mybilibili.mvp.model.pref.PreferencesHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private final Context context;
    private final ApiHelper mApiHelper;
    private final PreferencesHelper preferencesHelper;
    private final IAccountHelper iAccountHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, ApiHelper mApiHelper, PreferencesHelper preferencesHelper, IAccountHelper iAccountHelper) {
        this.context = context;
        this.mApiHelper = mApiHelper;
        this.preferencesHelper = preferencesHelper;
        this.iAccountHelper = iAccountHelper;
    }

    @Override
    public ApiHelper getApiHelper() {
        return this.mApiHelper;
    }

    @Override
    public PreferencesHelper getPrefHelper() {
        return this.preferencesHelper;
    }

    @Override
    public IAccountHelper getUser() {
        return this.iAccountHelper;
    }
}
