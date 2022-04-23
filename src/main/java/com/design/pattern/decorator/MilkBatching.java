package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import com.design.pattern.utils.CoffeeUtils;

import java.math.BigDecimal;

/**
 * 牛奶配料
 */
public class MilkBatching extends Batching{
    /**
     * 装饰咖啡
     */
    private Coffee coffee;

    public MilkBatching(Coffee coffee, CupCapacityEnum cupCapacity){
        this.coffee = coffee;
        this.capacity = cupCapacity;
    }

    /**
     * 描述
     */
    @Override
    public String description(){
        return coffee.description() + ",Milk";
    }

    /**
     * 费用
     */
    @Override
    public BigDecimal cost(){
        return CoffeeUtils.getCoffeeBatchingCost(coffee);
    }
}
