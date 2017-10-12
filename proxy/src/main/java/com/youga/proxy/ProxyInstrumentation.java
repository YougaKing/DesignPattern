package com.youga.proxy;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/11 0011-17:18
 */

public class ProxyInstrumentation extends Instrumentation {

    public static final String TAG = "ProxyInstrumentation";

    private Instrumentation mSuper;

    public ProxyInstrumentation(Instrumentation instrumentation) {
        mSuper = instrumentation;
    }


    public ActivityResult execStartActivity(Context who, IBinder contextThread, IBinder token, Activity target, Intent intent, int requestCode, Bundle options) {

        Log.d(TAG, "\n执行了startActivity, 参数如下: \n" + "who = [" + who + "], " + "\ncontextThread = [" + contextThread + "], \ntoken = [" + token + "], " + "\ntarget = [" + target + "], \nintent = [" + intent + "], \nrequestCode = [" + requestCode + "], \noptions = [" + options + "]");
        try {
            Method execStartActivityMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, int.class, Bundle.class);
            execStartActivityMethod.setAccessible(true);
            return (ActivityResult) execStartActivityMethod.invoke(mSuper, who, contextThread, token, target, intent, requestCode, options);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
