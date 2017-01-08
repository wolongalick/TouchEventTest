package com.alick.toucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Alick on 2017/1/7.
 */

public class MyLinearLiayout extends LinearLayout {
    private static final String TAG=MyLinearLiayout.class.getSimpleName();


    public MyLinearLiayout(Context context) {
        super(context);
    }

    public MyLinearLiayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLiayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG,"--->dispatchTouchEvent()");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG,"--->onInterceptTouchEvent()");
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,"--->onTouchEvent()");
        return super.onTouchEvent(event);
    }


}
