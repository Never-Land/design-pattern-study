package com.design.pattern.factory;

import lombok.Data;

/**
 * 不同口味抽象披萨
 */
@Data
public abstract class Pizza{
    /**
     * 披萨名称
     */
    String name;
    /**
     * 面团
     */
    Dough dough;
    /**
     * 调味汁
     */
    Sauce sauce;
    /**
     * 素食
     */
    Veggies[] veggies;
    /**
     * 干酪
     */
    Cheese cheese;
    /**
     * 辣香肠
     */
    Pepperoni pepperoni;
    /**
     * 蛤蜊
     */
    Clam clam;

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
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if(dough != null){
            result.append(dough);
            result.append("\n");
        }
        if(sauce != null){
            result.append(sauce);
            result.append("\n");
        }
        if(cheese != null){
            result.append(cheese);
            result.append("\n");
        }
        if(veggies != null){
            for(int i = 0; i < veggies.length; i++){
                result.append(veggies[i]);
                if(i < veggies.length - 1){
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if(clam != null){
            result.append(clam);
            result.append("\n");
        }
        if(pepperoni != null){
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
