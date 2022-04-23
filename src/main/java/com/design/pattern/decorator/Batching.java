package com.design.pattern.decorator;

import java.math.BigDecimal;

/**
 * 配料
 */
public abstract class Batching extends Coffee{
    /**
     * 描述
     */
    @Override
    public abstract String description();

    /**
     * 费用
     */
    @Override
    public abstract BigDecimal cost();
}
