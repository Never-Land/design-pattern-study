package com.design.pattern.strategy;

/**
 * 皇后角色
 */
public class QueenCharacter extends GameCharacter{
    /**
     * 设定弓箭初始武器
     */
    public QueenCharacter(){
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
