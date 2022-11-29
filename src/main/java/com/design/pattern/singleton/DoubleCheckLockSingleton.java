package com.design.pattern.singleton;

/**
 * 懒汉式或双重检验加锁单例模式
 */
public class DoubleCheckLockSingleton{
    /**
     * 单例变量
     */
    private volatile static DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton(){

    }

    /**
     * 获取单例实例
     */
    public static DoubleCheckLockSingleton getInstance(){
        if(singleton == null){
            synchronized(DoubleCheckLockSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
