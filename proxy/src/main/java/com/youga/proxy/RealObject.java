package com.youga.proxy;

/**
 * Created by Youga on 2017/9/1.
 */

public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        System.out.println("一些操作");
    }
}
