package com.design.pattern.utils;

import com.design.pattern.enums.PizzaTypeEnum;
import com.design.pattern.factory.CheesePizza;
import com.design.pattern.factory.ClamPizza;
import com.design.pattern.factory.PepperoniPizza;
import com.design.pattern.factory.Pizza;
import com.design.pattern.factory.PizzaIngredientsFactory;
import com.design.pattern.factory.VeggiePizza;

/**
 * 披萨工具类
 */
public class PizzaUtils{
    /**
     * 制作披萨
     */
    public static Pizza makePizza(String pizzaType, PizzaIngredientsFactory pizzaIngredientsFactory){
        if(PizzaTypeEnum.CHEESE.getTypeCode().equals(pizzaType)){
            return new CheesePizza(pizzaIngredientsFactory);
        }else if(PizzaTypeEnum.VEGGIE.getTypeCode().equals(pizzaType)){
            return new VeggiePizza(pizzaIngredientsFactory);
        }else if(PizzaTypeEnum.CLAM.getTypeCode().equals(pizzaType)){
            return new ClamPizza(pizzaIngredientsFactory);
        }else if(PizzaTypeEnum.PEPPERONI.getTypeCode().equals(pizzaType)){
            return new PepperoniPizza(pizzaIngredientsFactory);
        }
        return null;
    }
}
