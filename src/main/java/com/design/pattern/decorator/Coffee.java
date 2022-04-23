package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 咖啡抽象类
 */
@Getter
@Setter
public abstract class Coffee{
    /**
     * 咖啡容量，默认小杯
     */
    CupCapacityEnum capacity = CupCapacityEnum.SMALL;
    /**
     * 描述
     */
    protected abstract String description();
    /**
     * 费用
     */
    public abstract BigDecimal cost();
}
