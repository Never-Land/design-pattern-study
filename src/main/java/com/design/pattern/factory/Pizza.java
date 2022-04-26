package com.design.pattern.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * 不同口味抽象披萨
 */
@Getter
@Setter
public abstract class Pizza{
    /**
     * 披萨名称
     */
    private String name;
    /**
     * 制作披萨原料
     */
    // TODO: 2022/4/26 待实现

    /**
     * 制作披萨材料准备
     */
    abstract void prepare();
    /**
     * 烘烤
     */
    void bake(){
        System.out.println("在350℃烘烤25分钟");
    }
    /**
     * 切片
     */
    void cutSlice(){
        System.out.println("把披萨对角切片");
    }
    /**
     * 装盒
     */
    void box(){
        System.out.println("把披萨装入官方披萨店盒子里");
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- " + this.name + " ----\n");
        /*if (dough != null) {
            StringBuilder.append(dough);
            StringBuilder.append("\n");
        }
        if (sauce != null) {
            StringBuilder.append(sauce);
            StringBuilder.append("\n");
        }
        if (cheese != null) {
            StringBuilder.append(cheese);
            StringBuilder.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                StringBuilder.append(veggies[i]);
                if (i < veggies.length-1) {
                    StringBuilder.append(", ");
                }
            }
            StringBuilder.append("\n");
        }
        if (clam != null) {
            StringBuilder.append(clam);
            StringBuilder.append("\n");
        }
        if (pepperoni != null) {
            StringBuilder.append(pepperoni);
            StringBuilder.append("\n");
        }*/
        return stringBuilder.toString();
    }
}
