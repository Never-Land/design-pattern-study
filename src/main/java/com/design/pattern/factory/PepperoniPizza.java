package com.design.pattern.factory;

/**
 * 辣香肠味披萨
 */
public class PepperoniPizza extends Pizza{
    /**
     * 披萨工厂
     */
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory pizzaIngredientsFactory){
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
        pizzaIngredientsFactory.createPepperoni();
    }
}
