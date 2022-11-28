package com.design.pattern.factory;

/**
 * 干酪味披萨
 */
public class CheesePizza extends Pizza{
    /**
     * 披萨工厂
     */
    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory){
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
        pizzaIngredientsFactory.createCheese();
    }
}
