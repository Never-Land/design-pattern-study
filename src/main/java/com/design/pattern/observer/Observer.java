package com.design.pattern.observer;

/**
 * 观察者接口
 */
public interface Observer{
    /**
     * 观察关注的主题数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void followSubjectData(float temperature, float humidity, float pressure);
}
