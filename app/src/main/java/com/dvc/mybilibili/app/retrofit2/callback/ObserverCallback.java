package com.dvc.mybilibili.app.retrofit2.callback;

import com.dvc.mybilibili.mvp.model.api.exception.BiliApiException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class ObserverCallback<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {
        onBegin(d);
    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    @Override
    public void onError(Throwable e) {
        BiliApiException apiException = new BiliApiException(e);
        onError(apiException, apiException.mCode);
        e.printStackTrace();
    }

    @Override
    public void onComplete() {

    }

    public void onBegin(Disposable d) {

    }

    public abstract void onSuccess(T t);

    public abstract void onError(BiliApiException apiException, int code);
}
