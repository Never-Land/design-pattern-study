package com.design.pattern.factory;

/**
 * 披萨原料制作工厂
 */
public interface PizzaIngredientsFactory{
    /**
     * 制作面团
     */
    Dough createDough();
    /**
     * 制作调味汁
     */
    Sauce createSauce();
    /**
     * 制作干酪
     */
    Cheese createCheese();
    /**
     * 制作素食
     */
    Veggies[] createVeggies();
    /**
     * 制作辣香肠
     */
    Pepperoni createPepperoni();
    /**
     * 制作蛤蜊
     */
    Clam createClam();
}
