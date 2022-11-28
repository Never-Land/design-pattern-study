package com.design.pattern.factory;

/**
 * 芝加哥披萨原料制作工厂
 */
public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory{
    /**
     * 制作面团
     */
    @Override
    public Dough createDough(){
        return new ThickCrustDough();
    }

    /**
     * 制作调味汁
     */
    @Override
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    /**
     * 制作干酪
     */
    @Override
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    /**
     * 制作素食
     */
    @Override
    public Veggies[] createVeggies(){
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    /**
     * 制作辣香肠
     */
    @Override
    public Pepperoni createPepperoni(){
        return new SlicePepperoni();
    }

    /**
     * 制作蛤蜊
     */
    @Override
    public Clam createClam(){
        return new FrozenClam();
    }
}
