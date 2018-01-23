package com.bingo.king.viewevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2018/1/23 14:59.
 */

public class MyView extends View
{
    private static final String TAG = "bingo";

    public MyView(Context context)
    {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        Log.d(TAG, "MyView--------------->dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d(TAG, "MyView--------------->onTouchEvent");
        return super.onTouchEvent(event);
    }
}
