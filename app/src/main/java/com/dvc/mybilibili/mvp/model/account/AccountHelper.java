package com.dvc.mybilibili.mvp.model.account;

import android.content.Context;

import com.dvc.base.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AccountHelper implements IAccountHelper {

    private final Context context;

    @Inject
    public AccountHelper(@ApplicationContext Context context) {
        this.context = context;
    }
}
