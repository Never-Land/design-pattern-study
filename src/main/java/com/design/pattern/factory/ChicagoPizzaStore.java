package com.design.pattern.factory;

import com.design.pattern.enums.PizzaTypeEnum;
import com.design.pattern.utils.PizzaUtils;

import java.util.Objects;

/**
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore{
    /**
     * 创造指定风味披萨
     *
     * @param pizzaType 披萨类型
     */
    @Override
    protected Pizza createPizza(String pizzaType){
        PizzaIngredientsFactory pizzaIngredientsFactory = new ChicagoPizzaIngredientsFactory();
        Pizza pizza = PizzaUtils.makePizza(pizzaType, pizzaIngredientsFactory);
        String pizzaName = "芝加哥" + PizzaTypeEnum.getTypeDesc(pizzaType) + "披萨";
        if(Objects.nonNull(pizza)){
            pizza.setName(pizzaName);
        }
        return pizza;
    }
}
