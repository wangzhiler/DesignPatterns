package com.design_pattern_firsthead.demo01_strategy;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new AAAQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("--display: green head duck");
    }
}
