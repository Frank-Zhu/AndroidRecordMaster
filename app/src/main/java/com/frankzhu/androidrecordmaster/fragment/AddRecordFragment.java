package com.frankzhu.androidrecordmaster.fragment;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.frankzhu.androidrecordmaster.R;
import com.frankzhu.androidrecordmaster.base.BaseFragment;
import com.frankzhu.androidrecordmaster.utils.ViewHelper;

import butterknife.Bind;
import butterknife.OnClick;
import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;
import io.codetail.widget.RevealFrameLayout;

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
public class AddRecordFragment extends BaseFragment {
    @Bind(R.id.tv_time)
    TextView mTvTime;
    @Bind(R.id.tv_start_record_bg)
    TextView mTvStartRecordBg;
    @Bind(R.id.btn_pause)
    Button mBtnPause;
    @Bind(R.id.btn_play)
    Button mBtnPlay;
    @Bind(R.id.btn_stop)
    Button mBtnStop;
    @Bind(R.id.rfl_record)
    RevealFrameLayout mRllRecord;
    @Bind(R.id.ll_record)
    LinearLayout mLlRecord;
    @Bind(R.id.btn_start_record)
    Button mBtnStartRecord;
    @Bind(R.id.ll_btn_action)
    LinearLayout mLlBtnAction;

    public AddRecordFragment() {

    }

    public static AddRecordFragment newInstance() {
        return new AddRecordFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_add_record;
    }

    @Override
    protected void setUpViewComponent() {
    }

    @OnClick(R.id.btn_start_record)
    void onStartRecord() {
        showRecordAction();
    }

    /**
     * 显示录音控制按钮
     */
    private void showRecordAction() {
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(500);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // get the center for the clipping circle
                int cx = (mLlRecord.getLeft() + mLlRecord.getRight()) / 2;
                int cy = (mLlRecord.getTop() + mLlRecord.getBottom()) / 2;
                // get the final radius for the clipping circle
                int finalRadius = Math.max(mLlRecord.getWidth(), mLlRecord.getHeight());
                SupportAnimator animator = ViewAnimationUtils.createCircularReveal(mLlRecord, cx, cy, 0, finalRadius);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(1000);
                animator.start();
                ViewHelper.setGone(mLlRecord, false);
                ViewHelper.setGone(mRllRecord, false);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        animationSet.addAnimation(alphaAnimation);
        mTvStartRecordBg.startAnimation(animationSet);
        mBtnStartRecord.startAnimation(animationSet);
        ViewHelper.setGone(mTvStartRecordBg, true);
        ViewHelper.setGone(mBtnStartRecord, true);
    }

    @OnClick(R.id.btn_stop)
    void onStopRecord() {//停止录音
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(500);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        animationSet.addAnimation(alphaAnimation);
        mLlBtnAction.startAnimation(animationSet);
        ViewHelper.setGone(mLlBtnAction, false);
    }

    @OnClick(R.id.btn_save)
    void onSaveRecord() {//保存录音

    }

    @OnClick(R.id.btn_cancel)
    void onCancelRecord() {//取消保存录音
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(500);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
                alphaAnimation.setDuration(500);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                animationSet.addAnimation(alphaAnimation);
                mTvStartRecordBg.startAnimation(animationSet);
                mBtnStartRecord.startAnimation(animationSet);
                ViewHelper.setGone(mTvStartRecordBg, false);
                ViewHelper.setGone(mBtnStartRecord, false);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        animationSet.addAnimation(alphaAnimation);
        mLlBtnAction.startAnimation(animationSet);
        mRllRecord.startAnimation(animationSet);
        ViewHelper.setGone(mLlBtnAction, true);
        ViewHelper.setGone(mRllRecord, true);
    }
}
