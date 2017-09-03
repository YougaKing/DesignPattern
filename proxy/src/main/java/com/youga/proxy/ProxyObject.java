package com.youga.proxy;

/**
 * Created by Youga on 2017/9/1.
 */

public class ProxyObject extends AbstractObject {

    private RealObject mObject = new RealObject();

    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        mObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
