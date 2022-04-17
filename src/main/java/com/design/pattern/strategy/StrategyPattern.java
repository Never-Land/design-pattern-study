package com.design.pattern.strategy;

/**
 * 策略模式演示
 * 一个动作冒险游戏，游戏角色可以使用武器，每个角色只能使用一种武器，
 * 游戏过程中可以切换武器
 * 角色：国王、皇后、骑士、妖怪
 * 武器：挥舞宝剑、匕首刺杀、弓箭射击、斧头砍劈
 * 思考：角色可以切换武器，角色战斗使用武器行为在变化
 */
public class StrategyPattern{
    public static void main(String[] args) {
        //国王使用武器
        System.out.print("国王角色：");
        GameCharacter kingCharacter = new KingCharacter();
        kingCharacter.fight();
        //切换武器
        System.out.print("切换武器：");
        WeaponBehavior kingSet = new DaggerBehavior();
        kingCharacter.setWeapon(kingSet);
        kingCharacter.fight();

        //皇后使用武器
        System.out.print("皇后角色：");
        GameCharacter queenCharacter = new QueenCharacter();
        queenCharacter.fight();
        //切换武器
        System.out.print("切换武器：");
        WeaponBehavior queenSet = new SwordBehavior();
        queenCharacter.setWeapon(queenSet);
        queenCharacter.fight();

        //骑士使用武器
        System.out.print("骑士角色：");
        GameCharacter knightCharacter = new KnightCharacter();
        knightCharacter.fight();
        //切换武器
        System.out.print("切换武器：");
        WeaponBehavior knightSet = new AxeBehavior();
        knightCharacter.setWeapon(knightSet);
        knightCharacter.fight();

        //妖怪使用武器
        System.out.print("妖怪角色：");
        GameCharacter monsterCharacter = new MonsterCharacter();
        monsterCharacter.fight();
        //切换武器
        System.out.print("切换武器：");
        WeaponBehavior monsterSet = new DaggerBehavior();
        monsterCharacter.setWeapon(monsterSet);
        monsterCharacter.fight();
    }
}
