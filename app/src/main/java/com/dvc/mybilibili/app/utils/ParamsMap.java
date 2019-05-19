package com.dvc.mybilibili.app.utils;

import java.util.HashMap;

/* compiled from: BL */
public abstract class ParamsMap extends HashMap<String, String> {
    public ParamsMap(int i) {
        super(i);
    }

    public ParamsMap() {
        this(5);
    }

    /* Access modifiers changed, original: protected|final|varargs */
    public final void putParams(String... strArr) {
        if (strArr.length == 0 || strArr.length % 2 != 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < strArr.length; i += 2) {
            String obj = strArr[i];
            String obj2 = strArr[i + 1];
            if (!(obj == null || obj2 == null)) {
                super.put(obj, obj2);
            }
        }
    }
}
