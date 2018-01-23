package com.bingo.king.viewevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2018/1/23 15:05.
 */

public class MyViewGroup2 extends ViewGroup
{
    private static final String TAG = "bingo";

    public MyViewGroup2(Context context)
    {
        super(context);
    }

    public MyViewGroup2(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public MyViewGroup2(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            view.layout(100,100,getWidth()-100,getHeight()-100);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "MyViewGroup2-->dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "MyViewGroup2-->onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "MyViewGroup2-->onTouchEvent");
        return super.onTouchEvent(event);
    }

}
