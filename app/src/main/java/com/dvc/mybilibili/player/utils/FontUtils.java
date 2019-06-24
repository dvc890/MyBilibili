package com.dvc.mybilibili.player.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

import java.util.HashMap;

public class FontUtils {
    private static final HashMap<String, Typeface> fonttmp = new HashMap();

    public static Typeface loadFont2Assets(Context context, String path) {
        Typeface typeface = fonttmp.get(path);
        if (typeface != null) {
            return typeface;
        }
        AssetManager assets = context.getAssets();
        if (assets == null) {
            return null;
        }
        Typeface createFromAsset;
        try {
            createFromAsset = Typeface.createFromAsset(assets, path);
            try {
                fonttmp.put(path, createFromAsset);
            } catch (RuntimeException unused) {
            }
        } catch (RuntimeException unused2) {
            createFromAsset = typeface;
            fonttmp.put(path, null);
            return createFromAsset;
        }
        return createFromAsset;
    }
}
