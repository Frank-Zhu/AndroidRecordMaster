package com.frankzhu.androidrecordmaster.utils;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2015/9/22  16:35.
 * Description: SnackBar 帮助类
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2015/9/22        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class SnackBarHelper {
    /**
     * 显示Snack Bar
     *
     * @param view Suitable Parent View
     * @param text 文本
     */
    public static void showSnackBar(@NonNull View view, @NonNull CharSequence text) {
        showSnackBar(view, text, Snackbar.LENGTH_SHORT);
    }

    /**
     * 显示Snack Bar
     *
     * @param view  Suitable Parent View
     * @param resId 文本
     */
    public static void showSnackBar(@NonNull View view, @StringRes int resId) {
        showSnackBar(view, resId, Snackbar.LENGTH_SHORT);
    }

    /**
     * 显示Snack Bar
     *
     * @param view     Suitable Parent View
     * @param resId    文本
     * @param duration 显示时常
     */
    public static void showSnackBar(@NonNull View view, @StringRes int resId, int duration) {
        Snackbar.make(view, resId, duration).show();
    }

    /**
     * 显示Snack Bar
     *
     * @param view     Suitable Parent View
     * @param text     文本
     * @param duration 显示时常
     */
    public static void showSnackBar(@NonNull View view, @NonNull CharSequence text, int duration) {
        Snackbar.make(view, text, duration).show();
    }

    /**
     * 显示Snack Bar
     *
     * @param view       Suitable Parent View
     * @param text       文本
     * @param duration   显示时常
     * @param actionText action 文本
     * @param listener   action 点击监听
     */
    public static void showSnackBar(@NonNull View view, @NonNull CharSequence text, int duration, CharSequence actionText, View.OnClickListener listener) {
        Snackbar.make(view, text, duration).setAction(actionText, listener).show();
    }
}
