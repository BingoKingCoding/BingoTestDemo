package com.bingo.king.viewevent;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.bingo.king.BaseActivity;
import com.bingo.king.R;

public class ViewEventActivity extends BaseActivity
{
    private static final String  TAG = "bingo";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        Log.d(TAG, "Activity->dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d(TAG, "Activity->onTouchEvent");
        return super.onTouchEvent(event);
    }


}
