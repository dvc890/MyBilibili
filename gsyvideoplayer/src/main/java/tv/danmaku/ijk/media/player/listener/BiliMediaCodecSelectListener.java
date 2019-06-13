package tv.danmaku.ijk.media.player.listener;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import java.util.Locale;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkCodecHelper;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class BiliMediaCodecSelectListener implements IjkMediaPlayer.OnMediaCodecSelectListener {
    private Context f8267a;
    private SharedPreferences f8268b;
    private SharedPreferences f8269c;

    public BiliMediaCodecSelectListener(Context context) {
        if (context != null) {
            this.f8267a = context.getApplicationContext();
            this.f8268b = context.getSharedPreferences(context.getPackageName()+"_preferences", 0);
            context = this.f8267a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f8267a.getPackageName());
            stringBuilder.append("_hevc_preferences");
            this.f8269c = context.getSharedPreferences(context.getPackageName()+"_hevc_preferences", 0);
        }
    }

    /* renamed from: a */
    public String getBestCodecName(String str) {
        if (Build.VERSION.SDK_INT < 16 || this.f8268b == null) {
            return null;
        }
        if (TextUtils.isEmpty(str) || !str.equals("video/hevc")) {
            return this.f8268b.getString(str, "");
        }
        return this.f8269c.getString(str, "");
    }

    public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i, int i2) {
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        Log.i("IjkMediaCodecSelector", String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}));
        String b = m6324b(str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        setBestCodecName(str, b);
        return b;
    }

    public static String m6324b(String str) {
        return IjkCodecHelper.getBestCodecName(str);
    }

    public void setBestCodecName(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.equals("video/hevc")) {
            if (this.f8268b != null) {
                this.f8268b.edit().putString(str, str2).apply();
            }
        } else if (this.f8269c != null) {
            this.f8269c.edit().putString(str, str2).apply();
        }
    }
}
