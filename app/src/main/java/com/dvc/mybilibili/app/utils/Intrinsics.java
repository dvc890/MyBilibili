package com.dvc.mybilibili.app.utils;

import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
public class Intrinsics {
    public static int compare(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public static int compare(long j, long j2) {
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    private Intrinsics() {
    }

    public static String stringPlus(String str, Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(obj);
        return stringBuilder.toString();
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwNpe();
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwNpe(str);
        }
    }

    public static void throwNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

//    public static void throwUninitializedProperty(String str) {
//        throw ((UnException) sanitizeStackTrace(new UninitializedPropertyAccessException(str)));
//    }

//    public static void throwUninitializedPropertyAccessException(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("lateinit property ");
//        stringBuilder.append(str);
//        stringBuilder.append(" has not been initialized");
////        throwUninitializedProperty(stringBuilder.toString());
//    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be null");
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(stringBuilder.toString())));
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method specified as non-null returned null: ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(str2);
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(stringBuilder.toString())));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field specified as non-null is null: ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(str2);
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(stringBuilder.toString())));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullException(str);
        }
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
        }
    }

    private static void throwParameterIsNullException(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(className);
        stringBuilder.append(".");
        stringBuilder.append(methodName);
        stringBuilder.append(", parameter ");
        stringBuilder.append(str);
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(stringBuilder.toString())));
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean areEqual(Double d, Double d2) {
        if (d == null) {
            if (d2 != null) {
                return false;
            }
        } else if (d2 == null || d.doubleValue() != d2.doubleValue()) {
            return false;
        }
        return true;
    }

    public static boolean areEqual(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean areEqual(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean areEqual(Float f, Float f2) {
        if (f == null) {
            if (f2 != null) {
                return false;
            }
        } else if (f2 == null || f.floatValue() != f2.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean areEqual(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean areEqual(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void reifiedOperationMarker(int i, String str) {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        str = str.replace('/', '.');
        try {
            Class.forName(str);
        } catch (ClassNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(str);
            stringBuilder.append(" is not found. Please update the Kotlin runtime to the latest version");
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(stringBuilder.toString(), e)));
        }
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        str = str.replace('/', '.');
        try {
            Class.forName(str);
        } catch (ClassNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(str);
            stringBuilder.append(" is not found: this code requires the Kotlin runtime of version at least ");
            stringBuilder.append(str2);
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(stringBuilder.toString(), e)));
        }
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        return sanitizeStackTrace(t, Intrinsics.class.getName());
    }

    static <T extends Throwable> T sanitizeStackTrace(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
}
