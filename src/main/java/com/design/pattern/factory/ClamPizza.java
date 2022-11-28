package com.design.pattern.factory;

/**
 * 蛤蜊味披萨
 */
public class ClamPizza extends Pizza{
    /**
     * 披萨工厂
     */
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public ClamPizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    /**
     * 制作披萨材料准备
     */
    @Override
    public void prepare(){
        System.out.println("准备制作： " + name);
        pizzaIngredientsFactory.createDough();
        pizzaIngredientsFactory.createSauce();
        pizzaIngredientsFactory.createClam();
    }
}
