package com.youga.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/11 0011-17:08
 */

public class DynamicSubject implements InvocationHandler {

    private Object mObject;

    public DynamicSubject() {
    }

    public DynamicSubject(Object obj) {
        mObject = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("DynamicSubject before calling " + method);
        method.invoke(mObject, args);

        System.out.println("DynamicSubject after calling " + method);

        return null;
    }
}
