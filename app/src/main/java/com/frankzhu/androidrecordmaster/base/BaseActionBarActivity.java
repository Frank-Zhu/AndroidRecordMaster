package com.frankzhu.androidrecordmaster.base;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.frankzhu.androidrecordmaster.utils.SharedPreferencesHelper;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      14-11-22 13:31
 * Description: Activity 基类
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 14-11-22      ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class BaseActionBarActivity extends AppCompatActivity {
    protected final String TAG = getClass().getSimpleName();
    protected ActionBar mActionBar;
    protected SharedPreferencesHelper mSharedPreferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActionBar = getSupportActionBar();
        mSharedPreferencesHelper = SharedPreferencesHelper.getInstance();
        showActionBar(true);
    }

    protected void showActionBar(boolean isShowUp) {
        if (mActionBar != null) {
            mActionBar.setDisplayShowCustomEnabled(false);
            mActionBar.setDisplayHomeAsUpEnabled(isShowUp);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
