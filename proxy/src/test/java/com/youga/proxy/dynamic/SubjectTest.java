package com.youga.proxy.dynamic;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/11 0011-17:10
 */

public class SubjectTest {

    @Test
    public void dynamicTest() {

        RealSubject real = new RealSubject();
        InvocationHandler handler = new DynamicSubject(real);
        Class clazz = real.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);
        subject.request();

    }
}
