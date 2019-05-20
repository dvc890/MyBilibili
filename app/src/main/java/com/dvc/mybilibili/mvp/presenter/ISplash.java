package com.dvc.mybilibili.mvp.presenter;

public interface ISplash {
    void loadSplash();

    void countdownProgress(int progress, int maxProgress);
}
