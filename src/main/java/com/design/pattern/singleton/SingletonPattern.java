package com.design.pattern.singleton;

/**
 * 单例模式演示
 */
public class SingletonPattern{
    public static void main(String[] args){
        //饿汉式获取实例
        HungarySingleton hungarySingleton = HungarySingleton.getInstance();
        System.out.println("饿汉式单例：" + hungarySingleton);
        //双重校验加锁获取实例
        DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
        System.out.println("懒汉式单例：" + doubleCheckLockSingleton);
    }
}
