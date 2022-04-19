package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据
 */
public class WeatherData implements Subject{
    /**
     * 观察者集合
     */
    private final List<Observer> observerList;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    /**
     * 注册观察者
     */
    @Override
    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    /**
     * 移除观察者
     */
    @Override
    public void removeObserver(Observer observer){
        int index = observerList.indexOf(observer);
        if(index > 0){
            observerList.remove(index);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers(){
        if(observerList.isEmpty()){
            return;
        }
        observerList.forEach(observer -> {
            observer.followSubjectData(temperature, humidity, pressure);
        });
    }

    /**
     * 设置天气测量数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    /**
     * 天气测量数据改变通知所有观察者
     */
    public void measurementChanged(){
        notifyObservers();
    }
}
