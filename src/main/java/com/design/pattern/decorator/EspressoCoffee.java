package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import com.design.pattern.utils.CoffeeUtils;

import java.math.BigDecimal;

/**
 * 浓缩咖啡
 */
public class EspressoCoffee extends Coffee{
    /**
     * 描述
     */
    @Override
    public String description(){
        return "浓缩咖啡";
    }

    /**
     * 费用
     */
    @Override
    public BigDecimal cost(){
        //默认费用
        BigDecimal defaultCost = BigDecimal.valueOf(9);
        //默认容量
        CupCapacityEnum cupCapacityEnum = super.getCapacity();
        return CoffeeUtils.getPlainCoffeeCost(defaultCost, cupCapacityEnum);
    }
}
