package com.dvc.mybilibili.mvp.model.pref;

import android.content.Context;

import com.dvc.base.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper {
    private final Context context;

    @Inject
    public AppPreferencesHelper(@ApplicationContext Context context) {
        this.context = context;
    }
}
