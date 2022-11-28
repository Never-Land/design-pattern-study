package com.design.pattern.factory;

import com.design.pattern.enums.PizzaTypeEnum;
import com.design.pattern.utils.PizzaUtils;

import java.util.Objects;

/**
 * 纽约披萨店
 */
public class NewYorkPizzaStore extends PizzaStore{
    /**
     * 创造指定风味披萨
     *
     * @param pizzaType 披萨类型
     */
    @Override
    protected Pizza createPizza(String pizzaType){
        PizzaIngredientsFactory pizzaIngredientsFactory = new NewYorkPizzaIngredientsFactory();
        Pizza pizza = PizzaUtils.makePizza(pizzaType, pizzaIngredientsFactory);
        String pizzaName = "纽约" + PizzaTypeEnum.getTypeDesc(pizzaType) + "披萨";
        if(Objects.nonNull(pizza)){
            pizza.setName(pizzaName);
        }
        return pizza;
    }
}
