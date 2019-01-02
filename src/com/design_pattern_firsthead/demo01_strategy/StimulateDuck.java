package com.design_pattern_firsthead.demo01_strategy;

public class StimulateDuck {
    public static void main(String[] args) {
        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.performFly();
        mGreenHeadDuck.performQuack();
        mGreenHeadDuck.swim();


        mRedHeadDuck.display();
//        mRedHeadDuck.setFlyBehavior(new GoodFlyBehavior());
        mRedHeadDuck.performFly();
        mRedHeadDuck.performQuack();
        mRedHeadDuck.swim();
    }
}
