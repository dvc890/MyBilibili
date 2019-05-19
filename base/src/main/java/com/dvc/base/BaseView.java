package com.dvc.base;

import com.hannesdorfmann.mosby3.mvp.MvpView;


public interface BaseView extends MvpView {

    void showLoading(boolean pullToRefresh);

    void showContent();

    void showMessage(String msg, int type);

    void showError(String message);
}
