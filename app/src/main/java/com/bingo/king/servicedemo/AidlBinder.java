package com.bingo.king.servicedemo;

import android.os.RemoteException;

/**
 */

public class AidlBinder extends IMyAidlInterface.Stub
{
    private AidlService mService;

    public AidlBinder(AidlService service) {
        this.mService = service;
    }

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException
    {

    }

    @Override
    public void testMethod(String str) throws RemoteException
    {
        mService.serviceMethod(str);
    }
}
