package com.dvc.base.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentUtils {
    private static final String TAG = FragmentUtils.class.getSimpleName();

    public static Fragment switchContent(FragmentManager fragmentManager, Fragment currentFragment, Fragment toShowFragment, int viewId, int positionId, boolean isInnerReplace) {
        if(fragmentManager == null) return null;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

        String tagName = makeFragmentName(viewId, positionId);

        if (currentFragment == null) {
            fragmentTransaction.add(viewId, toShowFragment, tagName).commit();
            return toShowFragment;
        }

        if(currentFragment == toShowFragment) return toShowFragment;

        Fragment fragment = fragmentManager.findFragmentByTag(tagName);
        if(fragment == null) {
            fragmentTransaction.hide(currentFragment);
            fragmentTransaction.add(viewId, toShowFragment, tagName).commit();
            return toShowFragment;
        } else {
            if(isInnerReplace) {
                //同一位置切换，则先移除旧，替换新的（例如：从A页面切换到B页面，是同一位置）
                fragmentTransaction.remove(fragment);
                fragmentTransaction.add(viewId, toShowFragment, tagName).commit();
            } else {
                fragmentTransaction.hide(currentFragment);
                fragmentTransaction.show(toShowFragment).commit();
            }
            return toShowFragment;
        }


    }

    private static String makeFragmentName(int viewId, long id) {
        return "android:switcher:" + viewId + ":" + id;
    }
}
