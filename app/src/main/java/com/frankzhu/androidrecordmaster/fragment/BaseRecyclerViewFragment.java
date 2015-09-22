package com.frankzhu.androidrecordmaster.fragment;

import android.support.v7.widget.RecyclerView;

import com.frankzhu.androidrecordmaster.R;

import butterknife.Bind;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2015/9/22  17:16.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2015/9/22        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public abstract class BaseRecyclerViewFragment extends BaseFragment {
    @Bind(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_base_recycler_view;
    }
}
