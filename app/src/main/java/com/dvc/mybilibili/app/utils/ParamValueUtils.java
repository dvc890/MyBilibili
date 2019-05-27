package com.dvc.mybilibili.app.utils;

import android.os.Build;

import com.dvc.base.net.AppNetWorkStatusManager;
import com.dvc.mybilibili.app.application.BiliApplication;

public class ParamValueUtils {

    public static int getFourk() {
        int fourk = 0;//IjkCodecHelper.isUhdSupport(IjkCodecHelper.getBestCodecName("video/hevc"))?1:0;
        return fourk;
    }

    public static int getForceHost() {
        int force_host = 1;//1:2:0
        return force_host;
    }

    public static int getRecsysMode() {
        int recsys_mode = 1;//1:0
        return recsys_mode;
    }

    public static int getFnval() {
        int fnval = Build.VERSION.SDK_INT < 19?16:32;
        return fnval;
    }

    public static int getFnver() {
        int fnver = 0;
        return fnver;
    }

    public static int getQN() {
        int qn = 32;//16:32即可
        return qn;
    }

    public static String getNetwork() {
        String network = BiliApplication.getNetWorkStatusManager().getNetworkStatus()== AppNetWorkStatusManager.NETWORK_STATUS_WIFI?"wifi":"mobile";
        return network;
    }
}
