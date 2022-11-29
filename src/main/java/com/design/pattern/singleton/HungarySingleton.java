package com.design.pattern.singleton;

/**
 * 急切或饿汉式单例模式
 */
public class HungarySingleton{
    /**
     * 单例变量
     */
    private static HungarySingleton singleton = new HungarySingleton();

    private HungarySingleton(){

    }

    /**
     * 获取单例实例
     */
    public static HungarySingleton getInstance(){
        return singleton;
    }
}
