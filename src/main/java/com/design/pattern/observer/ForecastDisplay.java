package com.design.pattern.observer;

/**
 * 简单的预报布告板
 */
public class ForecastDisplay implements Observer, DisplayElement{
    /**
     * 当前气压
     */
    private float currentPressure = 29.92F;
    /**
     * 最大气压
     */
    private float lastPressure;

    public ForecastDisplay(Subject subject){
        /**
         * 主题:被观察者
         */
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
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    /**
     * 显示
     */
    @Override
    public void display(){
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure){
            System.out.println("Improving weather on the way");
        }else if(currentPressure == lastPressure){
            System.out.println("More of the same");
        }else if(currentPressure < lastPressure){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
