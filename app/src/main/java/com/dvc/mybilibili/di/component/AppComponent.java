package com.dvc.mybilibili.di.component;

import android.app.Application;

import com.dvc.mybilibili.app.application.BiliApplication;
import com.dvc.mybilibili.di.module.ActivityBindingModule;
import com.dvc.mybilibili.di.module.ApiServiceModule;
import com.dvc.mybilibili.di.module.ApplicationModule;
import com.dvc.mybilibili.di.module.ServiceBindingModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component( modules = {ApplicationModule.class, ApiServiceModule.class,
        ActivityBindingModule.class, ServiceBindingModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<BiliApplication> {
    @Override
    void inject(BiliApplication instance);

    @Component.Builder
    interface Bulider {
        @BindsInstance
        AppComponent.Bulider application(Application application);

        AppComponent build();
    }
}
