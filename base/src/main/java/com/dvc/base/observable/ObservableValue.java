package com.dvc.base.observable;

import com.dvc.base.thread.ThreadManager;

public class ObservableValue<T> {
    private T value;
    private OnPropertyChangedCallback changedCallback;
    private boolean isfrist = true;

    private boolean useUIthread = true;

    public ObservableValue(T value) {
        this.value = value;
    }

    public void set(T value) {
        if(!isfrist && get().equals(value)) return;
        if(isfrist) this.isfrist = false;
        this.value = value;
        notifyChange();
    }

    public void setOnPropertyChangedCallback(OnPropertyChangedCallback<T> changedCallback) {
        this.changedCallback = changedCallback;
    }

    public ObservableValue<T> useUIthread(boolean useUIthread) {
        this.useUIthread = useUIthread;
        return this;
    }

    private void notifyChange() {
        if(changedCallback == null) return;
        if(this.useUIthread) ThreadManager.get().getMainHandler().post(()->changedCallback.onPropertyChanged(this));
        else ThreadManager.get().getHandler(this).post(()->changedCallback.onPropertyChanged(this));
    }

    public T get() {
        return this.value;
    }

    public abstract static class OnPropertyChangedCallback<T> {
        public abstract void onPropertyChanged(ObservableValue<T> value);
    }
}
