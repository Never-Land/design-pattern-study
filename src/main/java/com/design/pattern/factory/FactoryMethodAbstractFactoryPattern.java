package com.design.pattern.factory;

import com.design.pattern.enums.PizzaTypeEnum;

/**
 * 工厂方法、抽象工厂模式演示
 * 制作不同地区口味的披萨，为了防止制作的披萨偷工减料，店铺制作披萨
 * 必须从区域工厂取得原料制作，目前有2个地区口味比萨(纽约【New York】
 * 和芝加哥【Chicago】)
 */
public class FactoryMethodAbstractFactoryPattern{
    public static void main(String[] args){
        //纽约披萨商店
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        System.out.println(newYorkPizzaStore.orderPizza(PizzaTypeEnum.CHEESE.getTypeCode()));
        System.out.println(newYorkPizzaStore.orderPizza(PizzaTypeEnum.CLAM.getTypeCode()));

        //芝加哥商店
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        System.out.println(chicagoPizzaStore.orderPizza(PizzaTypeEnum.PEPPERONI.getTypeCode()));
        System.out.println(chicagoPizzaStore.orderPizza(PizzaTypeEnum.VEGGIE.getTypeCode()));
    }
}
