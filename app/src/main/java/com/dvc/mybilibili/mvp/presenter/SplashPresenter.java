package com.dvc.mybilibili.mvp.presenter;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.SystemClock;

import com.dvc.base.MvpBasePresenter;
import com.dvc.base.di.ApplicationContext;
import com.dvc.base.utils.RxSchedulersHelper;
import com.dvc.mybilibili.app.utils.RandomUtils;
import com.dvc.mybilibili.mvp.model.DataManager;
import com.dvc.mybilibili.mvp.model.account.IAccountHelper;
import com.dvc.mybilibili.mvp.model.api.service.splash.entity.Splash;
import com.dvc.mybilibili.mvp.ui.activity.SplashView;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.vondear.rxtool.RxLogTool;

import java.util.Iterator;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

public class SplashPresenter extends MvpBasePresenter<SplashView> implements ISplash{
    private final Context context;
    private final DataManager dataManager;
    private final LifecycleProvider<Lifecycle.Event> provider;
    private final IAccountHelper accountHelper;


    @Inject
    public SplashPresenter(@ApplicationContext Context context, DataManager dataManager, LifecycleProvider<Lifecycle.Event> provider) {
        this.context = context;
        this.dataManager = dataManager;
        this.accountHelper = dataManager.getUser();
        this.provider = provider;
    }

    @Override
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
        String access_key = this.accountHelper.isLogin()?this.accountHelper.getToken().access_token:"";
        String birth = this.accountHelper.getBrithday();
        this.dataManager.getApiHelper().getSplashListV2(false, access_key, birth)
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
                    ifViewAttached(view -> {
                        int pos = RandomUtils.randomCommon(0, splashData.splashList.size()-1, 1)[0];
                        view.onSplashData(splashData.splashList.get(pos));
                    });
                });
        this.dataManager.getApiHelper().getIndexList(access_key,0,true, 1, "", 0, 0,"",0)
                .compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_PAUSE))
                .subscribe(pegasusFeedResponse -> {
                    RxLogTool.e(pegasusFeedResponse.feedVer);
                });
    }

    @Override
    public void countdownProgress(int progress, int maxProgress) {
        Observable.create((ObservableOnSubscribe<Integer>) emitter -> {
            int i = progress;
            while (i <= maxProgress && !emitter.isDisposed()) {
                emitter.onNext(i++);
                SystemClock.sleep(1000);
            }
            emitter.onComplete();
        }).compose(RxSchedulersHelper.ioAndMainThread())
                .compose(provider.bindUntilEvent(Lifecycle.Event.ON_PAUSE))
                .subscribe(integer -> {
                    ifViewAttached(view -> view.updateProgress(integer));
                });
    }
}
