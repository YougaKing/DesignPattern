package com.youga.proxy;

import android.os.Binder;

/**
 * Created by Youga on 2017/9/1.
 */

public abstract class AbstractObject {
    Binder mBinder;
    public abstract void operation();
}
