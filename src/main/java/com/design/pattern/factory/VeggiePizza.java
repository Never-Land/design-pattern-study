package com.design.pattern.factory;

/**
 * 素食味披萨
 */
public class VeggiePizza extends Pizza{
    /**
     * 披萨工厂
     */
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public VeggiePizza(PizzaIngredientsFactory pizzaIngredientsFactory){
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
        pizzaIngredientsFactory.createVeggies();
    }
}
