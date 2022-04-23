package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import com.design.pattern.utils.CoffeeUtils;

import java.math.BigDecimal;

/**
 * 奶泡配料
 */
public class WhipBatching extends Batching{
    /**
     * 装饰咖啡以及容量
     */
    private Coffee coffee;

    public WhipBatching(Coffee coffee, CupCapacityEnum cupCapacity){
        this.coffee = coffee;
        this.capacity = cupCapacity;
    }

    /**
     * 描述
     */
    @Override
    public String description(){
        return coffee.description() + ",Whip";
    }

    /**
     * 费用
     */
    @Override
    public BigDecimal cost(){
        return CoffeeUtils.getCoffeeBatchingCost(coffee);
    }
}
