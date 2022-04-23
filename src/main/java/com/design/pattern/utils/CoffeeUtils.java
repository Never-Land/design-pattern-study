package com.design.pattern.utils;

import com.design.pattern.decorator.Coffee;
import com.design.pattern.enums.CupCapacityEnum;

import java.math.BigDecimal;

/**
 * 咖啡工具类
 */
public class CoffeeUtils{
    /**
     * 获取不同容量原味咖啡费用
     */
    public static BigDecimal getPlainCoffeeCost(BigDecimal defaultCost, CupCapacityEnum cupCapacityEnum){
        if(CupCapacityEnum.MEDIUM.name().equals(cupCapacityEnum.name())){
            defaultCost = defaultCost.add(BigDecimal.valueOf(1));
        }else if(CupCapacityEnum.LARGE.name().equals(cupCapacityEnum.name())){
            defaultCost = defaultCost.add(BigDecimal.valueOf(2));
        }
        return defaultCost;
    }

    /**
     * 获取不同容量咖啡配料费用
     */
    public static BigDecimal getCoffeeBatchingCost(Coffee coffee){
        //杯子容量
        CupCapacityEnum cupCapacityEnum = coffee.getCapacity();
        //咖啡配料默认容量费用
        BigDecimal cost = coffee.cost().add(BigDecimal.valueOf(1));
        if(CupCapacityEnum.MEDIUM.name().equals(cupCapacityEnum.name())){
            cost = cost.add(BigDecimal.valueOf(1));
        }else if(CupCapacityEnum.LARGE.name().equals(cupCapacityEnum.name())){
            cost = cost.add(BigDecimal.valueOf(2));
        }
        return cost;
    }
}
