package com.design.pattern.strategy;

import lombok.NoArgsConstructor;

/**
 * 匕首刺杀
 */
@NoArgsConstructor
public class DaggerBehavior implements WeaponBehavior{
    /**
     * 使用武器
     */
    @Override
    public void useWeapon(){
        System.out.println("用匕首刺杀");
    }
}
