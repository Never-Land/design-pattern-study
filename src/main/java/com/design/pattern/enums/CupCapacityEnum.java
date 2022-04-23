package com.design.pattern.enums;

/**
 * 杯子容量枚举
 */
public enum CupCapacityEnum{
    /**
     * 小杯
     */
    SMALL("小杯"),
    /**
     * 中杯
     */
    MEDIUM( "中杯"),
    /**
     * 大杯
     */
    LARGE( "大杯");

    /**
     * 杯子容量描述
     */
    private final String cupValue;

    CupCapacityEnum(String cupValue){
        this.cupValue = cupValue;
    }

    /**
     * 获取杯子容量描述
     */
    public String getCupValue(){
        return cupValue;
    }
}
