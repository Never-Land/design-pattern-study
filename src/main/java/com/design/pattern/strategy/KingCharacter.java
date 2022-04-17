package com.design.pattern.strategy;

/**
 * 国王角色
 */
public class KingCharacter extends GameCharacter{
    /**
     * 设定宝剑初始武器
     */
    public KingCharacter(){
        weaponBehavior = new SwordBehavior();
    }
    /**
     * 角色战斗
     */
    @Override
    public void fight(){
        weaponBehavior.useWeapon();
    }
}
