package com.design.pattern.observer;

/**
 * 观察者模式演示
 * 实现一个气象观测站，追踪目前的天气状况（温度、湿度 、气压），有一个
 * 应用，有三种布告板，分别显示目前的状况、气象统计以及简单的预报。当天气
 * 状况发生变化时，布告板必须实时更新。气象站可扩展，可以添加或移除
 * 布告板
 */
public class ObserverPattern{
    public static void main(String[] args){
        //天气数据
        WeatherData weatherData = new WeatherData();

        //当前布告板
        new CurrentConditionsDisplay(weatherData);
        //统计布告板
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //简单预报布告板
        new ForecastDisplay(weatherData);

        //移除统计布告板
        //weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurements(80F, 65F, 30.4F);
        weatherData.setMeasurements(82F, 70F, 29.2F);
        weatherData.setMeasurements(78F, 90F, 29.2F);
    }
}
