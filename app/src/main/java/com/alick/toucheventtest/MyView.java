package com.alick.toucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Alick on 2017/1/7.
 */

public class MyView extends View {

    private static final String TAG = MyView.class.getSimpleName();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.v(TAG,"--->dispatchTouchEvent()");
        return super.dispatchTouchEvent(event);
    }


    private int anchorX;
    private int anchorY;


    private float startX;
    private float startY;
    private int width;
    private int height;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v(TAG,"--->onTouchEvent()");
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                anchorX=getLeft();
                anchorY=getTop();

                startX = event.getX();
                startY = event.getY();

                width = getWidth();
                height = getHeight();
                break;
            case MotionEvent.ACTION_MOVE:


                float x = event.getX();
                float y = event.getY();

                Log.i(TAG,"x="+x);

                int left = (int) (anchorX + x - startX);
                int top = (int) (anchorY + y - startY);




                setLeft(left);
                setTop(top);
                setRight(left +width);
                setBottom(top +height);


                break;
            case MotionEvent.ACTION_UP:
                T.showShort(getContext(),"width:"+getWidth()+"\n"+"heigth:"+getHeight());
                break;
        }

        return true;
    }



}
