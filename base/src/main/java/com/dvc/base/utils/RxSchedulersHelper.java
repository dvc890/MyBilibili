package com.dvc.base.utils;

import android.os.Looper;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RxSchedulersHelper {
    public static <T> ObservableTransformer<T, T> ioAndMainThread() {
        return upstream -> upstream.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
    public static <T> ObservableTransformer<T, T> AllioThread() {
        return upstream -> upstream.subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public static <T> ObservableTransformer<T, T> ioAndThisThread() {
        if(Looper.myLooper() != null)
            return upstream -> upstream.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.from(Looper.myLooper()));
        return AllioThread();
    }

    public static void disposable(Disposable disposable) {
        if(disposable != null && !disposable.isDisposed())
            disposable.dispose();
    }
}
