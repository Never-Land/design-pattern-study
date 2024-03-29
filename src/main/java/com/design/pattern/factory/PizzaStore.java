package com.design.pattern.factory;

/**
 * 抽象披萨店
 */
public abstract class PizzaStore{
    /**
     * 创造指定风味披萨
     * @param pizzaType 披萨类型
     */
    abstract Pizza createPizza(String pizzaType);

    /**
     * 下单指定口味披萨
     * @param pizzaType 披萨类型
     */
    public Pizza orderPizza(String pizzaType){
        //创造指定风味披萨
        Pizza pizza = createPizza(pizzaType);
        System.out.println("制作的披萨是：" + pizza.getName());
        //原料准备
        pizza.prepare();
        //烘烤
        pizza.bake();
        //切片
        pizza.cutSlice();
        //装盒
        pizza.box();
        return pizza;
    }
}
