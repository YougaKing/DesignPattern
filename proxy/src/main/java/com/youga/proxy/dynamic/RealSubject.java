package com.youga.proxy.dynamic;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/11 0011-17:06
 */

public class RealSubject implements Subject {

    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println("RealSubject.request()");
    }
}
