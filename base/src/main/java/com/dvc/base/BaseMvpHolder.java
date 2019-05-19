package com.dvc.base;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;
import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import java.lang.ref.WeakReference;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BaseMvpHolder<V extends MvpView> extends BaseViewHolder {

    private final Unbinder unbinder;
    private Context context;
    public WeakReference<V> viewRef = null;

    public BaseMvpHolder(Activity activity) {
        this(activity.getWindow().getDecorView());
        if(activity instanceof MvpView)
            viewRef = new WeakReference<>((V) activity);
    }

    public BaseMvpHolder(Fragment fragment) {
        this(fragment.getView());
        if(fragment instanceof MvpView)
            viewRef = new WeakReference<>((V) fragment);
    }

    public BaseMvpHolder(View view) {
        super(view);
        unbinder = ButterKnife.bind(this, view);
        this.context = view.getContext();
    }

    public Context getContext() {
        return context;
    }

    public void UnBindView() {
        if(unbinder != null) unbinder.unbind();
    }

    @Deprecated
    @UiThread
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }

    protected final void ifViewAttached(boolean exceptionIfViewNotAttached, ViewAction<V> action) {
        final V view = viewRef == null ? null : viewRef.get();
        if (view != null) {
            action.run(view);
        } else if (exceptionIfViewNotAttached) {
            throw new IllegalStateException(
                    "No View attached to Holder.");
        }
    }

    protected final void ifViewAttached(ViewAction<V> action) {
        ifViewAttached(false, action);
    }

    public interface ViewAction<V> {

        /**
         * This method will be invoked to run the action. Implement this method to interact with the view.
         *
         * @param view The reference to the view. Not null.
         */
        void run(@NonNull V view);
    }
}
