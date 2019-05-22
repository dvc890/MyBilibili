package com.dvc.mybilibili.mvp.presenter.jsinterfaces;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

import com.dvc.base.BaseMvpHolder;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.just.agentweb.AgentWeb;

import java.lang.ref.WeakReference;

public class AndroidInterfaceWeb<V extends MvpView> {
    private AgentWeb agent;
    public WeakReference<V> viewRef = null;

    public AndroidInterfaceWeb(AgentWeb agent, V mvpView) {
        this.agent = agent;
        viewRef = new WeakReference<>(mvpView);
    }

    @Deprecated
    @UiThread
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }

    protected final void ifViewAttached(boolean exceptionIfViewNotAttached, BaseMvpHolder.ViewAction<V> action) {
        final V view = viewRef == null ? null : viewRef.get();
        if (view != null) {
            action.run(view);
        } else if (exceptionIfViewNotAttached) {
            throw new IllegalStateException(
                    "No View attached to Holder.");
        }
    }

    protected final void ifViewAttached(BaseMvpHolder.ViewAction<V> action) {
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
