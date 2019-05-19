package com.dvc.mybilibili.mvp.presenter;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.api.cache.CacheProviders;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.Splash;
import com.dvc.mybilibili.mvp.ui.activity.SplashView;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.util.Iterator;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

public class SplashPresenter extends MvpBasePresenter<SplashView> {
    private final Context context;
    private final DataManager dataManager;
    private final LifecycleProvider<Lifecycle.Event> provider;

    @Inject
    public SplashPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.provider = provider;
    }

    public void loadSplash() {
//        this.dataManager.getApiHelper().getSplashV2()
//                .compose(RxSchedulersHelper.ioAndMainThread())
//                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
//                .filter(sampleSplash -> {
//                    if(TextUtils.isEmpty(sampleSplash.getThumb())) return false;
//                    return true;
//                })
//                .subscribe(splashData -> {
//                    ifViewAttached(view -> view.onSampleSplash(splashData));
//                });
        this.dataManager.getApiHelper().getSplashListV2(false)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_DESTROY))
                .filter(splashData -> {
                    if(splashData.splashList == null || splashData.splashList.size() == 0) return false;
                    Iterator it = splashData.splashList.iterator();
                    while (it.hasNext()) {
                        Splash splash = (Splash) it.next();
                        if (!splash.isCardTypeSupport() || !splash.isSplashTypeSupport()) {
                            it.remove();
                        }
                    }
                    return true;
                })
                .subscribe(splashData -> {
                    ifViewAttached(view -> view.onSplashData(splashData.splashList));
                });
    }

    @Override
    public void countdownProgress(int progress) {
        Observable.create((ObservableOnSubscribe<Integer>) emitter -> {
            int i = progress;
            while (i != 361 && !emitter.isDisposed()) {
                emitter.onNext(i++);
                SystemClock.sleep(10);
            }
            emitter.onComplete();
        }).compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_PAUSE))
                .subscribe(integer -> {
                    ifViewAttached(view -> view.updateProgress(integer));
                });
    }
}
