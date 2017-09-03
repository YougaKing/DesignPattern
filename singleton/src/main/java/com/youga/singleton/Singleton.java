package com.youga.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Youga on 2017/9/1.
 */

public class Singleton {


    private static Singleton mInstance;

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("do sth.");
    }

    public static Singleton getmInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }


    /**
     * 方式三 : 在第一次加载SingletonHolder时初始化一次mOnlyInstance对象, 保证唯一性, 也延迟了单例的实例化,
     * 如果该单例比较耗资源可以使用这种模式.
     */
    public static Singleton getInstanceFromHolder() {
        return SingletonHolder.mOnlyInstance;
    }

    private static class SingletonHolder {
        private static final Singleton mOnlyInstance = new Singleton();
    }

    /**
     * 方式四 : 枚举单例, 线程安全
     */
    enum SingletonEnum {
        INSTANCE;

        public void doSomething() {
            System.out.println("do sth.");
        }

    }

    /**
     * 方式五 : 注册到容器, 根据key获取对象.一般都会有多种相同属性类型的对象会注册到一个map中
     * instance容器
     */
    private static Map<String, Singleton> objMap = new HashMap<>();

    /**
     * 注册对象到map中
     */
    public static void registerService(String key, Singleton instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    /**
     * 根据key获取对象
     */
    public static Singleton getService(String key) {
        return objMap.get(key);
    }
}
