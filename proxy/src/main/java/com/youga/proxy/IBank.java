package com.youga.proxy;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/**
 * Created by Youga on 2017/9/1.
 */

public interface IBank extends IInterface {
    String DESCRIPTOR = "com.youga.proxy.IBank";
    int TRANSACTION_queryMoney = (IBinder.FIRST_CALL_TRANSACTION);

    long queryMoney(int uid) throws RemoteException;
}
