package com.youga;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;

import com.youga.proxy.ProxyInstrumentation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/11 0011-17:22
 */

public class IApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);


        try {
            Class activityThreadClass = Class.forName("android.app.ActivityThread");
            Method currentActivityThreadMethod = activityThreadClass.getDeclaredMethod("currentActivityThread");
            currentActivityThreadMethod.setAccessible(true);
            Object currentActivityThread = currentActivityThreadMethod.invoke(null);

            Field instrumentationField = activityThreadClass.getDeclaredField("mInstrumentation");
            instrumentationField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) instrumentationField.get(currentActivityThread);
            instrumentationField.set(currentActivityThread,new ProxyInstrumentation(instrumentation));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
