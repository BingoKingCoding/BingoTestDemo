package com.bingo.king.servicedemo;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.bingo.king.R;

public class ServiceActivity extends AppCompatActivity
{
    private static final String TAG = "bingo";
    public MyBinder mBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Intent intent = new Intent(this,MyService.class);
        bindService(intent,mConnection,BIND_AUTO_CREATE);
    }

    private ServiceConnection mConnection = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName name, IBinder iBinder)
        {
            mBinder = (MyBinder) iBinder;
            mBinder.setCallBack(new MyBinder.MyCallBack()
            {
                @Override
                public void onCallBack(String str)
                {
                    Log.d(TAG, "receive msg from service: "+str);
                }
            });
        }

        @Override
        public void onServiceDisconnected(ComponentName name)
        {

        }
    };


    public void MyClick(View view){
        mBinder.test("hi, service.");
    }
}
