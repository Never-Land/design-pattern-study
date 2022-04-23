package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import com.design.pattern.utils.CoffeeUtils;

import java.math.BigDecimal;

/**
 * 大豆配料
 */
public class SoyBatching extends Batching{
    /**
     * 装饰咖啡
     */
    private Coffee coffee;

    public SoyBatching(Coffee coffee, CupCapacityEnum cupCapacity){
        this.coffee = coffee;
        this.capacity = cupCapacity;
    }

    /**
     * 描述
     */
    @Override
    public String description(){
        return coffee.description() + ",Soy";
    }

    /**
     * 费用
     */
    @Override
    public BigDecimal cost(){
        return CoffeeUtils.getCoffeeBatchingCost(coffee);
    }
}
