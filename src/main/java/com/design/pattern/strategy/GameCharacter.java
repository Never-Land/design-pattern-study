package com.design.pattern.strategy;

/**
 * 游戏角色抽象类
 */
public abstract class GameCharacter{
    /**
     * 武器行为
     */
    WeaponBehavior weaponBehavior;

    /**
     * 角色战斗，具体角色必须给定默认战斗武器
     */
    abstract void fight();
    /**
     * 切换武器
     */
    void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
