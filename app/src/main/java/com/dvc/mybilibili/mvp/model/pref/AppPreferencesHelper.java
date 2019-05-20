package com.dvc.mybilibili.mvp.model.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.dvc.base.di.ApplicationContext;
import com.dvc.base.di.PreferenceFileName;
import com.vondear.rxtool.RxNetTool;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper {
    private final Context context;
    private final SharedPreferences appPreferences;
    private final SharedPreferences.Editor appEditor;

    @Inject
    public AppPreferencesHelper(@ApplicationContext Context context, @PreferenceFileName String prefname) {
        this.context = context;
        this.appPreferences = context.getSharedPreferences(prefname, Context.MODE_PRIVATE);
        this.appEditor = this.appPreferences.edit();

    }

    public boolean isFristOpenApp() {
        return this.appPreferences.getInt("persist.is.first.start", 0) == 0;
    }

    public void NotFristOpenApp() {
        this.appEditor.putInt("persist.is.first.start", 1).apply();
    }
}
