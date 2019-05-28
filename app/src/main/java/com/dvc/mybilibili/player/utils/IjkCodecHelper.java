package com.dvc.mybilibili.player.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;

import com.vondear.rxtool.RxLogTool;

import java.util.Locale;
import java.util.Map.Entry;
import java.util.TreeMap;

/* compiled from: BL */
/* renamed from: tv.danmaku.ijk.media.player.IjkCodecHelper */
public class IjkCodecHelper {
    private static final int IJKCODEC_UHD_HEIGHT = 2160;
    private static final int IJKCODEC_UHD_WIDTH = 3840;
    private static final String TAG = "IjkCodecHelper";

    public static String getBestCodecName(String str, String str2) {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        IjkMediaCodecInfo bestCodec = IjkCodecHelper.getBestCodec(str, str2);
        if (bestCodec == null || bestCodec.mCodecInfo == null) {
            return null;
        }
        if (bestCodec.mRank < 600) {
            Log.w(TAG, String.format(Locale.US, "unaccetable codec: %s", new Object[]{bestCodec.mCodecInfo.getName()}));
            return null;
        }
        str2 = bestCodec.mCodecInfo.getName();
        String str3 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bestCodec for ");
        stringBuilder.append(str);
        stringBuilder.append(" : ");
        stringBuilder.append(str2);
        RxLogTool.i(str3, stringBuilder.toString());
        return str2;
    }

    public static String getBestCodecName(String str) {
        try {
            return IjkCodecHelper.getBestCodecName(str, "");
        }catch (Exception e) {
            return null;
        }
    }

    @RequiresApi(api = 16)
    public static IjkMediaCodecInfo getBestCodec(String str, String str2) {
        String str3 = str;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int codecCount = MediaCodecList.getCodecCount();
        TreeMap treeMap = new TreeMap();
        int i = 0;
        int i2 = 0;
        while (i2 < codecCount) {
            String str4;
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            RxLogTool.d(TAG, String.format(Locale.US, "  found codec: %s", new Object[]{codecInfoAt.getName()}));
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                if (supportedTypes != null) {
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String charSequence = supportedTypes[i3];
                        if (!TextUtils.isEmpty(charSequence)) {
                            RxLogTool.d(TAG, String.format(Locale.US, "    mime: %s", new Object[]{charSequence}));
                            if (charSequence.equalsIgnoreCase(str3)) {
                                IjkMediaCodecInfo ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str3, str2);
                                if (ijkMediaCodecInfo != null) {
                                    treeMap.put(Integer.valueOf(ijkMediaCodecInfo.mRank), ijkMediaCodecInfo);
                                    RxLogTool.d(TAG, String.format(Locale.US, "candidate codec: %s rank=%d", new Object[]{codecInfoAt.getName(), Integer.valueOf(ijkMediaCodecInfo.mRank)}));
                                    ijkMediaCodecInfo.dumpProfileLevels(str3);
                                }
                                i3++;
                                i = 0;
                            }
                        }
                        str4 = str2;
                        i3++;
                        i = 0;
                    }
                }
            }
            str4 = str2;
            i2++;
            i = 0;
        }
        Entry lastEntry = treeMap.lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return (IjkMediaCodecInfo) lastEntry.getValue();
    }

    @RequiresApi(api = 16)
    public static IjkMediaCodecInfo getBestCodec(String str) {
        return IjkCodecHelper.getBestCodec(str, "");
    }

    public static boolean isUhdSupport(String str, String str2) {
        if (VERSION.SDK_INT < 21 || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (!codecInfoAt.isEncoder()) {
                    if (!TextUtils.isEmpty(codecInfoAt.getName())) {
                        if (codecInfoAt.getName().equals(str)) {
                            CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str2);
                            if (capabilitiesForType != null) {
                                VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    if (videoCapabilities.isSizeSupported(IJKCODEC_UHD_WIDTH, IJKCODEC_UHD_HEIGHT)) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaCodec Error: ");
            stringBuilder.append(e);
            RxLogTool.e(str2, stringBuilder.toString());
        }
        return false;
    }

    private static Boolean isUhdSupport = null;
    public static boolean isUhdSupport(String str) {
        if(isUhdSupport == null) {
            return isUhdSupport = IjkCodecHelper.isUhdSupport(str, "video/hevc");
        }
        return isUhdSupport;
    }
}
