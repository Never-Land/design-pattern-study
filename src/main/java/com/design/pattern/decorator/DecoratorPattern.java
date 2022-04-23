package com.design.pattern.decorator;

import com.design.pattern.enums.CupCapacityEnum;

/**
 * 装饰者模式演示
 * 实现一个咖啡售卖服务，购买咖啡时，可以加入各种配料，例如：牛奶、摩卡、
 * 豆浆、奶泡，目前店里支持提供综合、深焙、低咖啡因、浓缩四种口味咖啡，
 * 咖啡容量支持小杯、中杯、大杯，不同容量加入配料会增加额外收费，默认小杯不额外收费，
 * 可以指定需要的咖啡容量
 * 问题：如果随着市场物价变动，咖啡不同容量收费标准也会随之变动，增加配料价格也会跟随变动，
 * 该如何做呢?
 * 思考：咖啡收费标准与配料收费标准是各自分开的，该如何划分收费标准对象属性?
 */
public class DecoratorPattern{
    public static void main(String[] args){
        //一份中杯浓缩咖啡
        Coffee espressoCoffee = new EspressoCoffee();
        //设置容量
        espressoCoffee.setCapacity(CupCapacityEnum.MEDIUM);
        System.out.println(DecoratorPattern.getPrintContent(espressoCoffee));

        //一份中杯摩卡牛奶深焙咖啡
        Coffee darkRoastCoffee = new DarkRoastCoffee();
        //设置容量
        darkRoastCoffee.setCapacity(CupCapacityEnum.MEDIUM);
        //加入摩卡
        darkRoastCoffee = new MochaBatching(darkRoastCoffee, darkRoastCoffee.getCapacity());
        //加入牛奶
        darkRoastCoffee = new MilkBatching(darkRoastCoffee, darkRoastCoffee.getCapacity());
        System.out.println(DecoratorPattern.getPrintContent(darkRoastCoffee));

        //一份大杯大豆牛奶奶泡综合咖啡
        Coffee blendCoffee = new BlendCoffee();
        //设置容量
        blendCoffee.setCapacity(CupCapacityEnum.LARGE);
        //加入大豆
        blendCoffee = new SoyBatching(blendCoffee, blendCoffee.getCapacity());
        //加入牛奶
        blendCoffee = new MilkBatching(blendCoffee, blendCoffee.getCapacity());
        //加入奶泡
        blendCoffee = new WhipBatching(blendCoffee, blendCoffee.getCapacity());
        System.out.println(DecoratorPattern.getPrintContent(blendCoffee));

        //一份小杯低咖啡因咖啡
        Coffee decafCoffee = new DecafCoffee();
        System.out.println(DecoratorPattern.getPrintContent(decafCoffee));
    }

    /**
     * 获取打印内容
     */
    private static String getPrintContent(Coffee coffee){
        //金钱符号
        String moneySymbol = " ￥";
        //容量描述
        String capacityDesc = " 容量:";
        return coffee.description() + capacityDesc + coffee.getCapacity().getCupValue() + moneySymbol + coffee.cost();
    }
}
