package com.bingo.king.servicedemo;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;

import com.bingo.king.R;

public class AidlActivity extends AppCompatActivity
{
    private static final String TAG = "bingo";
    public IMyAidlInterface mService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidl);
    }

    private ServiceConnection mConnection = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName name, IBinder iBinder)
        {
            mService = IMyAidlInterface.Stub.asInterface(iBinder);;
        }

        @Override
        public void onServiceDisconnected(ComponentName name)
        {

        }
    };

}
