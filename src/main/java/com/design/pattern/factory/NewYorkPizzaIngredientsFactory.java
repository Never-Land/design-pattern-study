package com.design.pattern.factory;

/**
 * 纽约披萨原料制作工厂
 */
public class NewYorkPizzaIngredientsFactory implements PizzaIngredientsFactory{
    /**
     * 制作面团
     */
    @Override
    public Dough createDough(){
        return new ThinCrustDough();
    }

    /**
     * 制作调味汁
     */
    @Override
    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    /**
     * 制作干酪
     */
    @Override
    public Cheese createCheese(){
        return new ParmesanCheese();
    }

    /**
     * 制作素食
     */
    @Override
    public Veggies[] createVeggies(){
        return new Veggies[]{new Garlic(), new Onion(), new RedPepper()};
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
        return new FreshClam();
    }
}
