package com.youga.serviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class RemoteService extends Service {
    public RemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new AccountQueryBinder();
    }

    private class AccountQueryBinder extends AccountQuery.Stub {

        private static final String TAG = "AccountQueryBinder";


        @Override
        public BankAccount query(String name) throws RemoteException {
            Log.d(TAG, "name:" + name);
            return null;
        }
    }
}
