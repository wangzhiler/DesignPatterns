package com.design_pattern_firsthead.demo01_strategy;

public class RedHeadDuck extends Duck {

    RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new BBBQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("--display: red head duck");
    }
}
