package com.design.pattern.enums;

/**
 * 披萨类型枚举
 */
public enum PizzaTypeEnum{
    /**
     * 干酪
     */
    CHEESE("cheese", "干酪"),
    /**
     * 辣香肠
     */
    PEPPERONI("pepperoni", "辣香肠"),
    /**
     * 蛤蜊
     */
    CLAM("clam",  "蛤蜊"),
    /**
     * 素食
     */
    VEGGIE("veggie", "素食");

    /**
     * 类型编码
     */
    private final String typeCode;
    /**
     * 类型描述
     */
    private final String typeDesc;

    PizzaTypeEnum(String typeCode, String typeDesc){
        this.typeCode = typeCode;
        this.typeDesc = typeDesc;
    }

    public String getTypeCode(){
        return typeCode;
    }

    public String getTypeDesc(){
        return typeDesc;
    }

    /**
     * 根据类型编码获取类型描述
     */
    public static String getTypeDesc(String typeCode){
        PizzaTypeEnum[] pizzaTypeEnums = PizzaTypeEnum.values();
        for(PizzaTypeEnum pizzaTypeEnum : pizzaTypeEnums){
            if(pizzaTypeEnum.getTypeCode().equals(typeCode)){
                return pizzaTypeEnum.getTypeDesc();
            }
        }
        return null;
    }
}
