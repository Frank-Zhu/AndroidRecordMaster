package com.frankzhu.androidrecordmaster.ui;

import android.support.v4.app.Fragment;

import com.frankzhu.androidrecordmaster.base.BaseAbstractActionBarActivity;
import com.frankzhu.androidrecordmaster.fragment.AddRecordFragment;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      15/9/23 下午9:57
 * Description: 添加录音页面
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 15/9/23      ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class AddRecordActivity extends BaseAbstractActionBarActivity {
    @Override
    public Fragment getFragment() {
        return AddRecordFragment.newInstance();
    }
}
