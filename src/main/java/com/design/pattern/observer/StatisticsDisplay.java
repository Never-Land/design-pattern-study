package com.design.pattern.observer;

/**
 * 气象统计布告板
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    /**
     * 最高温度
     */
    private float maxTemperature = 0.0F;
    /**
     * 最低温度
     */
    private float minTemperature = 200F;
    /**
     * 温度和
     */
    private float temperatureSum = 0.0F;
    /**
     * 读取温度次数
     */
    private int numReadings;

    public StatisticsDisplay(Subject subject){
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
    public void followSubjectData(float temperature, float humidity, float pressure){
        temperatureSum += temperature;
        numReadings++;
        if(temperature > maxTemperature){
            maxTemperature = temperature;
        }
        if(temperature < minTemperature){
            minTemperature = temperature;
        }
        display();
    }

    /**
     * 显示
     */
    @Override
    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
