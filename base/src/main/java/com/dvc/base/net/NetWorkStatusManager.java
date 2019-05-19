package com.dvc.base.net;

public interface NetWorkStatusManager {

    void registerReceiver();

    void unregisterReceiver();

    void setOnNetworkStatusListener(AppNetWorkStatusManager.NetworkStatusListener networkStatusListener);
}
