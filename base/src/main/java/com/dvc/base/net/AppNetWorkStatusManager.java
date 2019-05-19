package com.dvc.base.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.dvc.base.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppNetWorkStatusManager implements NetWorkStatusManager {
    public static final int NETWORK_STATUS_DEFAULT = 0;    //网络正常
    public static final int NETWORK_STATUS_OFF = 1;
    public static final int NETWORK_STATUS_MOBILE = 2;
    public static final int NETWORK_STATUS_WIFI = 3;

    private Context context;
    private AppNetWorkStatusManager.NetworkStatusListener networkStatusListener;

    @Inject
    public AppNetWorkStatusManager(@ApplicationContext Context context) {
        super();
        this.context = context;
    }


    public interface NetworkStatusListener {
        void networkStatus(int networkStatus);
    }

    /**
     * 注册广播监听
     */
    @Override
    public void registerReceiver() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        context.registerReceiver(networkStatusReceiver, filter);
    }

    /**
     * 解绑广播监听
     */
    @Override
    public void unregisterReceiver() {
        context.unregisterReceiver(networkStatusReceiver);
    }

    /**
     * 网络监听器
     *
     * @param networkStatusListener
     */
    @Override
    public void setOnNetworkStatusListener(AppNetWorkStatusManager.NetworkStatusListener networkStatusListener) {
        this.networkStatusListener = networkStatusListener;
    }

    private BroadcastReceiver networkStatusReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo mobNetInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                NetworkInfo wifiNetInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                int networkStatus = NETWORK_STATUS_DEFAULT;

                if (!mobNetInfo.isConnected() && !wifiNetInfo.isConnected()) {
                    networkStatus = NETWORK_STATUS_OFF;
//                    DownloadManager.getInstance().pauseAll();           //无网络暂停
                } else if (mobNetInfo.isConnected()) {
                    networkStatus = NETWORK_STATUS_MOBILE;
//                    DownloadManager.getInstance().pauseAll();           //网络切换到3G 暂停
                } else if (wifiNetInfo.isConnected()) {
                    networkStatus = NETWORK_STATUS_WIFI;
                }

                if ((networkStatusListener != null) && (networkStatus != NETWORK_STATUS_DEFAULT)) {
                    networkStatusListener.networkStatus(networkStatus);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    };
}
