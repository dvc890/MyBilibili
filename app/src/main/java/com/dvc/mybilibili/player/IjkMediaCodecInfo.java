package com.dvc.mybilibili.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: BL */
/* renamed from: tv.danmaku.ijk.media.player.IjkMediaCodecInfo */
public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    public static String getLevelName(int i) {
        switch (i) {
            case 1:
                return "1";
            case 2:
                return "1b";
            case 4:
                return "11";
            case 8:
                return "12";
            case 16:
                return "13";
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return "22";
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileName(int i) {
        if (i == 4) {
            return "Extends";
        }
        if (i == 8) {
            return "High";
        }
        if (i == 16) {
            return "High10";
        }
        if (i == 32) {
            return "High422";
        }
        if (i == 64) {
            return "High444";
        }
        switch (i) {
            case 1:
                return "Baseline";
            case 2:
                return "Main";
            default:
                return "Unknown";
        }
    }

    private static synchronized Map<String, Integer> getKnownCodecList() {
        synchronized (IjkMediaCodecInfo.class) {
            Map map;
            if (sKnownCodecList != null) {
                map = sKnownCodecList;
                return map;
            }
            sKnownCodecList = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            sKnownCodecList.put("OMX.Nvidia.h264.decode", Integer.valueOf(800));
            sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", Integer.valueOf(300));
            sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(801));
            sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(800));
            sKnownCodecList.put("OMX.qcom.video.decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.ittiam.video.decoder.avc", Integer.valueOf(0));
            sKnownCodecList.put("OMX.SEC.avc.dec", Integer.valueOf(800));
            sKnownCodecList.put("OMX.SEC.AVC.Decoder", Integer.valueOf(799));
            sKnownCodecList.put("OMX.SEC.avcdec", Integer.valueOf(798));
            sKnownCodecList.put("OMX.SEC.avc.sw.dec", Integer.valueOf(200));
            sKnownCodecList.put("OMX.SEC.hevc.sw.dec", Integer.valueOf(200));
            sKnownCodecList.put("OMX.Exynos.avc.dec", Integer.valueOf(800));
            sKnownCodecList.put("OMX.Exynos.AVC.Decoder", Integer.valueOf(799));
            sKnownCodecList.put("OMX.k3.video.decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(800));
            sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(800));
            sKnownCodecList.put("OMX.rk.video_decoder.avc", Integer.valueOf(800));
            sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(800));
            sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(800));
            sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", Integer.valueOf(200));
            sKnownCodecList.remove("OMX.Action.Video.Decoder");
            sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
            sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
            sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
            sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
            sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
            sKnownCodecList.remove("OMX.duos.h264.decoder");
            sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
            sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
            sKnownCodecList.remove("OMX.hisi.video.decoder");
            sKnownCodecList.remove("OMX.LG.decoder.video.avc");
            sKnownCodecList.remove("OMX.MS.AVC.Decoder");
            sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
            sKnownCodecList.remove("OMX.RTK.video.decoder");
            sKnownCodecList.remove("OMX.sprd.h264.decoder");
            sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
            sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
            sKnownCodecList.remove("OMX.WMT.decoder.avc");
            sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
            sKnownCodecList.put("OMX.google.h264.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.google.h264.lc.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.k3.ffmpeg.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.ffmpeg.video.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.sprd.soft.h264.decoder", Integer.valueOf(200));
            sKnownCodecList.put("OMX.qcom.video.decoder.hevcswvdec", Integer.valueOf(200));
            sKnownCodecList.put("OMX.qcom.video.decoder.hevchybrid", Integer.valueOf(200));
            map = sKnownCodecList;
            return map;
        }
    }

    private static boolean isCodecNameBlock(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @TargetApi(16)
    public static IjkMediaCodecInfo setupCandidate(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        if (mediaCodecInfo == null || VERSION.SDK_INT < 16) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        String toLowerCase = name.toLowerCase(Locale.US);
        int i = 600;
        int i2 = 200;
        if (!toLowerCase.startsWith("omx.")) {
            i2 = 100;
        } else if (!(toLowerCase.startsWith("omx.pv") || toLowerCase.startsWith("omx.google.") || toLowerCase.startsWith("omx.ffmpeg.") || toLowerCase.startsWith("omx.k3.ffmpeg.") || toLowerCase.startsWith("omx.avcodec.") || (toLowerCase.contains("omx.sec") && toLowerCase.contains(".sw.")))) {
            if (!toLowerCase.startsWith("omx.ittiam.")) {
                if (toLowerCase.endsWith(".secure")) {
                    i2 = 300;
                } else if (!toLowerCase.contains(".intel.sw_vd.")) {
                    if (toLowerCase.startsWith("omx.mtk.")) {
                        if (VERSION.SDK_INT >= 18) {
                            i2 = 800;
                        }
                    } else if (!IjkMediaCodecInfo.isCodecNameBlock(toLowerCase, str2)) {
                        Integer num = (Integer) IjkMediaCodecInfo.getKnownCodecList().get(toLowerCase);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            try {
                                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                                    i = 700;
                                }
                            } catch (Throwable unused) {
                                i2 = 600;
                            }
                        }
                        i2 = i;
                    }
                }
            }
            i2 = 0;
        }
        IjkMediaCodecInfo ijkMediaCodecInfo = new IjkMediaCodecInfo();
        ijkMediaCodecInfo.mCodecInfo = mediaCodecInfo;
        ijkMediaCodecInfo.mRank = i2;
        ijkMediaCodecInfo.mMimeType = str;
        return ijkMediaCodecInfo;
    }

    @TargetApi(16)
    public static IjkMediaCodecInfo setupCandidate(MediaCodecInfo mediaCodecInfo, String str) {
        return IjkMediaCodecInfo.setupCandidate(mediaCodecInfo, str, "");
    }

    @TargetApi(16)
    public void dumpProfileLevels(String str) {
        if (VERSION.SDK_INT >= 16) {
            try {
                int i;
                int i2;
                CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
                if (capabilitiesForType == null || capabilitiesForType.profileLevels == null) {
                    i = 0;
                    i2 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                    for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                        if (codecProfileLevel != null) {
                            i = Math.max(i, codecProfileLevel.profile);
                            i2 = Math.max(i2, codecProfileLevel.level);
                        }
                    }
                }
                Log.i(TAG, String.format(Locale.US, "%s", new Object[]{IjkMediaCodecInfo.getProfileLevelName(i, i2)}));
            } catch (Throwable unused) {
                Log.i(TAG, "profile-level: exception");
            }
        }
    }

    public static String getProfileLevelName(int i, int i2) {
        return String.format(Locale.US, " %s Profile Level %s (%d,%d)", new Object[]{IjkMediaCodecInfo.getProfileName(i), IjkMediaCodecInfo.getLevelName(i2), Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
