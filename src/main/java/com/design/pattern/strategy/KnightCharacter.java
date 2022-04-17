package com.design.pattern.strategy;

/**
 * 骑士角色
 */
public class KnightCharacter extends GameCharacter{
    /**
     * 设定匕首初始武器
     */
    public KnightCharacter(){
        weaponBehavior = new BowAndArrowBehavior();
    }
    /**
     * 角色战斗
     */
    @Override
    public void fight(){
        weaponBehavior.useWeapon();
    }
}
