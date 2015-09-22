package com.frankzhu.androidrecordmaster.app;

import android.app.Application;
import android.content.Context;

import com.frankzhu.androidrecordmaster.utils.SharedPreferencesHelper;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2015/9/22  16:24.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2015/9/22        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class AppApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        sContext = getApplicationContext();

        setUpSharedPreferencesHelper(getApplicationContext());//初始化SharedPreferences
    }

    /**
     * 初始化SharedPreferences
     *
     * @param context 上下文
     */
    private void setUpSharedPreferencesHelper(Context context) {
        SharedPreferencesHelper.getInstance().Builder(context);
    }

    public static Context getContext() {
        return sContext;
    }

    public static AppApplication getInstance() {
        return (AppApplication) sContext;
    }
}
