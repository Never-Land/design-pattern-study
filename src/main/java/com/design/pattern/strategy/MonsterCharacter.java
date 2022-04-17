package com.design.pattern.strategy;

/**
 * 妖怪角色
 */
public class MonsterCharacter extends GameCharacter{
    /**
     * 设定斧头初始武器
     */
    public MonsterCharacter(){
        weaponBehavior = new AxeBehavior();
    }

    /**
     * 角色战斗
     */
    @Override
    public void fight(){
        weaponBehavior.useWeapon();
    }
}
