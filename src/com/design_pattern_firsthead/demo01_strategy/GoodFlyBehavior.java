package com.design_pattern_firsthead.demo01_strategy;


//行为族的具体实现
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("GoodFlyBehavior");

    }
}
