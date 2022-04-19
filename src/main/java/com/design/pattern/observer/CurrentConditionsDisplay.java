package com.design.pattern.observer;

import lombok.NoArgsConstructor;

/**
 * 目前状况布告板
 */
@NoArgsConstructor
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    public CurrentConditionsDisplay(Subject subject){
        subject.registerObserver(this);
    }

    /**
     * 观察关注的主题数据
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    @Override
    public void followSubjectData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                +  humidity + "% humidity");
    }
}
