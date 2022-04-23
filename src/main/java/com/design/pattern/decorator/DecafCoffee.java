package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import com.design.pattern.utils.CoffeeUtils;

import java.math.BigDecimal;

/**
 * 低咖啡因咖啡
 */
public class DecafCoffee extends Coffee{
    /**
     * 描述
     */
    @Override
    public String description(){
        return "低咖啡因咖啡";
    }

    /**
     * 费用
     */
    @Override
    public BigDecimal cost(){
        //默认费用
        BigDecimal defaultCost = BigDecimal.valueOf(6);
        //默认容量
        CupCapacityEnum cupCapacityEnum = super.getCapacity();
        return CoffeeUtils.getPlainCoffeeCost(defaultCost, cupCapacityEnum);
    }
}
