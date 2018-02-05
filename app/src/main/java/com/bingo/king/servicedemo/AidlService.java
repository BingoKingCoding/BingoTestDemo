package com.bingo.king.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * <测试用>
 */

public class AidlService extends Service
{
    private static final String TAG = "bingo";

    private AidlBinder mBinder = new AidlBinder(this);

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return mBinder;
    }

    public void serviceMethod(String str){
        Log.d(TAG, "receive msg from activity: " + str);
    }

}
