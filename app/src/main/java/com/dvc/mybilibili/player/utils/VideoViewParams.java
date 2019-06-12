package com.dvc.mybilibili.player.utils;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.dvc.mybilibili.mvp.model.api.entity.DashMediaIndex;
import com.dvc.mybilibili.mvp.model.api.entity.MediaResource;

import java.util.Arrays;
import java.util.List;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class VideoViewParams {

    public static Bundle toBundleData(MediaResource.DashResource dashResource) {
        if (dashResource == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_AUDIO, m107010a(null, dashResource.getAudioList()));
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_VIDEO_264, m107011a(Integer.valueOf(7), true, dashResource.getVideoList()));
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_VIDEO_265, m107010a(Integer.valueOf(12), dashResource.getVideoList()));
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m107011a(Integer num, boolean z, List<DashMediaIndex> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        Bundle bundle4 = new Bundle();
        Bundle bundle5 = new Bundle();
        int[] iArr = new int[20];
        int i = 0;
        for (DashMediaIndex dashMediaIndex : list) {
            if (dashMediaIndex != null && (num == null || num.intValue() == dashMediaIndex.codecid || (z && dashMediaIndex.codecid == 0))) {
                int id = dashMediaIndex.id;
                String idstr = String.valueOf(id);
                int i2 = i + 1;
                iArr[i] = id;
                bundle2.putString(idstr, dashMediaIndex.base_url);
                List c = dashMediaIndex.getBackupUrl();
                if (c != null) {
                    try {
                        bundle3.putString(idstr, (String) c.get(0));
                        bundle4.putString(idstr, (String) c.get(1));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                bundle5.putInt(idstr, (int) dashMediaIndex.bandwidth);
                i = i2;
            }
        }
        bundle.putIntArray(IjkMediaMeta.IJKM_DASH_KEY_ID, Arrays.copyOf(iArr, i));
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_BASE_URL, bundle2);
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_BACKUP_URL0, bundle3);
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_BACKUP_URL1, bundle4);
        bundle.putBundle(IjkMediaMeta.IJKM_DASH_KEY_BANDWIDTH, bundle5);
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m107010a(Integer num, List<DashMediaIndex> list) {
        return m107011a(num, false, list);
    }
}
