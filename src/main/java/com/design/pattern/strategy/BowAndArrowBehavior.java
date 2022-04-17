package com.design.pattern.strategy;

import lombok.NoArgsConstructor;

/**
 * 弓箭射击
 */
@NoArgsConstructor
public class BowAndArrowBehavior implements WeaponBehavior{
    /**
     * 使用武器
     */
    @Override
    public void useWeapon(){
        System.out.println("用弓箭射击");
    }
}
