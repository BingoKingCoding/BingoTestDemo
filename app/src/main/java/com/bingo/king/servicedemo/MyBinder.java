package com.bingo.king.servicedemo;


import android.os.Binder;

public class MyBinder extends Binder
{
    private static final String TAG = "bingo";
    private MyCallBack mCallBack;
    private MyService mService;

    public MyBinder(MyService service){
        this.mService = service;
    }

    public void test(String str){
        mService.serviceMethod(str);
        mCallBack.onCallBack(str);
    }

    public void setCallBack(MyCallBack callBack)
    {
        mCallBack = callBack;
    }

    public interface MyCallBack{
        void onCallBack(String str);
    }

}
