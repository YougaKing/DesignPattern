package com.youga.serviceapplication;

import android.os.IInterface;
import android.os.RemoteException;

/**
 * Created by Youga on 2017/9/2.
 */

public interface IBank extends IInterface {

    long queryMoney(int uid) throws RemoteException;
}
