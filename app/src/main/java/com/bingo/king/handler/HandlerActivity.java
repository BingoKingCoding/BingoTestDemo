package com.bingo.king.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.bingo.king.R;

public class HandlerActivity extends AppCompatActivity
{
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handle);

        handler = new Handler();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Message msg = Message.obtain();
                handler.sendMessage(msg);
            }
        }).start();

    }
}
