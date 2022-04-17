package com.design.pattern.strategy;

import lombok.NoArgsConstructor;

/**
 * 挥舞宝剑
 */
@NoArgsConstructor
public class SwordBehavior implements WeaponBehavior{
    /**
     * 使用武器
     */
    @Override
    public void useWeapon(){
        System.out.println("用宝剑挥舞");
    }
}
