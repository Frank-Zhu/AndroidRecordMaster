package com.frankzhu.androidrecordmaster.fragment;

import com.frankzhu.androidrecordmaster.R;
import com.frankzhu.androidrecordmaster.base.BaseFragment;

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
public class AddRecordFragment extends BaseFragment{

    public AddRecordFragment(){

    }
    public static AddRecordFragment newInstance(){
        return new AddRecordFragment();
    }
    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_add_record;
    }

    @Override
    protected void setUpViewComponent() {

    }
}
