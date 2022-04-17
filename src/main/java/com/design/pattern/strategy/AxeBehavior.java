package com.design.pattern.strategy;

import lombok.NoArgsConstructor;

/**
 * 斧头砍劈
 */
@NoArgsConstructor
public class AxeBehavior implements WeaponBehavior{
    /**
     * 使用武器
     */
    @Override
    public void useWeapon(){
        System.out.println("用斧头砍劈");
    }
}
