package com.design.pattern.factory;

import com.design.pattern.enums.PizzaTypeEnum;

/**
 * 纽约风味披萨店
 */
public class NewYorkStylePizzaStore extends PizzaStore{
    /**
     * 创造指定风味披萨
     *
     * @param pizzaType 披萨类型
     */
    @Override
    public Pizza createPizza(String pizzaType){
        if(PizzaTypeEnum.CHEESE.name().equals(pizzaType)){
            return null;
        }else if(PizzaTypeEnum.VEGGIE.name().equals(pizzaType)){
            return null;
        }else if(PizzaTypeEnum.CLAM.name().equals(pizzaType)){
            return null;
        }else if(PizzaTypeEnum.PEPPERONI.name().equals(pizzaType)){
            return null;
        }else{
            return null;
        }
    }
}
